package org.example.c03_singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

// 在一个金融系统中，配置管理器需要统一管理系统的各种配置参数，如数据库连接配置、API密钥等。
public class ConfigManager {
    private static volatile ConfigManager instance;
    private Properties properties;

    private ConfigManager() {
        properties = new Properties();

        try(InputStream input = getClass().getClassLoader().getResourceAsStream("c03_singleton/config.properties")){
            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }
            properties.load(input);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static ConfigManager getInstance() {
        if (instance == null) {
            synchronized (ConfigManager.class) {
                if (instance == null) {
                    instance = new ConfigManager();
                }
            }
        }
        return instance;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
