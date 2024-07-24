package com.coba.bastian.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Data
@Component
@ConfigurationProperties(prefix = "spring.jpa")
public class HibernateConfig {

    private Map<String,String> properties = new HashMap<>();
    public Properties toProperties(){
        Properties prop = new Properties();

        prop.putAll(properties);

        return prop;
    }
}
