package com.syntax.class33.tasks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Task1 {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir") + "\\Files\\Config.properties";
        System.out.println(path);
        FileInputStream fileInputStream = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.get("Username"));
        System.out.println(properties.get("Password"));
        System.out.println(properties.get("URL"));
        fileInputStream.close();
    }
}
