package com.syntax.class32.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReadWriteDemo {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Jama\\Desktop\\Coding\\Java\\SyntaxJava\\Files\\Config.properties";
        FileInputStream fileInputStream = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.get("Username"));
        System.out.println(properties.get("Password"));
        properties.put("Name", "Jamol");
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        properties.store(fileOutputStream, "Name added to this file");
    }
}
