package main.java;

public class Main
{
    static final String str ="main/resources/logins.properties";
    public static void main(String[] args)
    {
        PropertiesGetter propertiesFileGetter = new PropertiesGetter();

        System.out.println(propertiesFileGetter.getProperties(str, "login1"));
        System.out.println(propertiesFileGetter.getProperties(str, "login2"));
        System.out.println(propertiesFileGetter.getProperties(str, "login3"));
    }
}

