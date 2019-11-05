import classes.OAuthClient;
import util.oauth.OAuthManager;

import java.io.*;
import java.net.URL;
import java.util.Arrays;
import java.util.Properties;

public class AutoHost3 {
    public static void main(String[] argv) throws IOException, InterruptedException {

        AutoHost3 main = new AutoHost3();
        Properties properties = new Properties();
        properties.load(new FileInputStream(main.getFileFromResources("settings.properties")));
        String token = (String) properties.get("XSRF-TOKEN");
        String osu_Session = (String) properties.get("osu_session");
        System.out.println("Your token: "+token);
        System.out.println("Your osu_session: "+osu_Session);

        OAuthClient client = OAuthManager.generateNewclient(token, osu_Session);

    }


    private File getFileFromResources(String fileName) {

        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return new File(resource.getFile());
        }

    }

}
