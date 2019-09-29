package utils;

import lombok.extern.java.Log;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
@Log
public class LoadProperties {
    public Map<String, String> loadPropertiesFile(String filePath) {
        Map<String, String> propertiesMap = new HashMap<>();
        Properties properties = new Properties();
        try {
            InputStream resourceAsStream = getClass().getClassLoader()
                    .getResourceAsStream(filePath);
            properties.load(resourceAsStream);
        } catch (IOException e) {
            log.info("Unable to load properties file : " + filePath);
            e.printStackTrace();
        }
        properties.forEach((k, v) -> propertiesMap.put(k.toString(), v.toString()));
        return propertiesMap;
    }
}
