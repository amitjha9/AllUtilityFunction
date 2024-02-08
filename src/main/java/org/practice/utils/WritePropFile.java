package org.practice.utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropFile {


    public void writeToPropFile() throws IOException {
        Properties properties = new Properties();
        properties.put("Name","Amit");
        properties.put("Village","Prasad");
        properties.put("Dist","Madhubani");
        properties.put("State","Bihar");
        properties.put("City","Darbhanga");

        String path = System.getProperty("user.dir")+"/resources/data.properties";
        FileOutputStream fos = new FileOutputStream(path);
        properties.store(fos,"This is use to write the data into file");
        System.out.println("Properties file created successfully");
    }

    public static void main(String[] args) throws IOException {
        WritePropFile writePropFile = new WritePropFile();
        writePropFile.writeToPropFile();
    }
}
