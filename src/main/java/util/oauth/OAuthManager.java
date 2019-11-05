package util.oauth;

import classes.OAuthClient;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OAuthManager {

    public static OAuthClient generateNewclient(String token, String osu_session) throws IOException, InterruptedException {

        String body = "{"+
                "\"name\": \"AutoHost 3\"," +
                "\"redirect\": \"https://hypex.xyz\"" +
                "}";

        HttpClient client = HttpClient.newBuilder()
                .build();
        
        
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://osu.ppy.sh/oauth/clients"))
                .setHeader("Content-Type", "application/json")
                .setHeader("X-CSRF-TOKEN",token)
                .setHeader("Set-Cookie", "osu_session="+osu_session+";")
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        ObjectMapper mapper = new ObjectMapper();
        OAuthClient oAuthClient = mapper.readValue(response.body(), OAuthClient.class);

        return oAuthClient;
    }

    //public OAuthClient getOAuthClient(String token, String osu_session) {
    //}

}
