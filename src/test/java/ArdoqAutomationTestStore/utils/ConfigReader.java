package ArdoqAutomationTestStore.utils;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static String readFromConfig(String key){
        Properties properties= new Properties();
        FileInputStream inputStream= null;
        try {
            inputStream= new FileInputStream("config.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String value= properties.getProperty(key);
        return value;
    }
}
