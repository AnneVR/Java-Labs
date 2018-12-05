package main.java;

import java.io.IOException;
import java.util.Properties;

public class PropertiesGetter
{
    public String getProperties(String fileName, String key)
    {
        Properties properties = new Properties();
        try
        {
            properties.load(getClass().getClassLoader().getResourceAsStream(fileName));
            return properties.getProperty(key);

        } catch (IOException e)
        {
            System.out.println("Error: can't load properties file");
            return null;
        }
    }
}