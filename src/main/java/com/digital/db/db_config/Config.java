package com.digital.db.db_config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class Config {
    private static final String FILE_PATH = "src/main/resources/config.properties";
    private static Properties properties;

    public static String getProperty(String key) {
        if (properties == null) {
            properties = new Properties();
            try (FileInputStream stream = new FileInputStream(FILE_PATH)) {
                properties.load(stream);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return properties.getProperty(key);
    }
}