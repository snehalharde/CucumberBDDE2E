package Utitlity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public final class ConfigPropertyUtils {
    private ConfigPropertyUtils(){

    }
    private static Properties properties;
    public static String readProperty(String key){
        File configFile = new File(System.getProperty("user.dir") + "/src/test/resources/constants/config.properties");
        try(FileInputStream fis = new FileInputStream(configFile)){

            properties = new Properties();
            properties.load(fis);

        } catch (FileNotFoundException e) {
            Logger.getLogger("File not found --" + e.getMessage());
        } catch (IOException e) {
            Logger.getLogger("Runtime exception --" + e.getMessage());
        }

        return properties.getProperty(key) ;
    }
}
