package com.syntax.class32.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteReadDemo2 {
    public static void main(String[] args) throws IOException {
        String path1 = "C:\\Users\\Jama\\Desktop\\Coding\\Java\\SyntaxJava\\Files\\Config.properties";
        String path2 = "C:\\Users\\Jama\\Desktop\\Coding\\Java\\SyntaxJava\\Files\\Config1.properties";

        /*String[] arr = {"hi"};
        main(arr);*/
        FileInputStream fileInputStream = new FileInputStream(path2);
        FileInputStream fileInputStream1 = new FileInputStream(path1);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        String URL = properties.get("URL").toString();

        Properties properties1 = new Properties();
        properties1.load(fileInputStream1);
        properties1.put("URL", URL);
        FileOutputStream fileOutputStream = new FileOutputStream(path1);
        properties1.store(fileOutputStream, "Some Comments");
    }
}
