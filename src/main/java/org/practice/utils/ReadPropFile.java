package org.practice.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFile {

    public void readPropFile() throws IOException {
        String path = System.getProperty("user.dir") + "/resources/config.properties";

        FileInputStream fileInputStream = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fileInputStream);

        //Get the data from properties file and print
        String name = properties.getProperty("Name");
        String company = properties.getProperty("Company");
        String address = properties.getProperty("Address");
        String college = properties.getProperty("College");
        System.out.println("Data from file is:\n" + "Name:" + name + " \nCompany:" + company + " \nAddress:" + address + " \nCollege:" + college);
    }

    public static void main(String[] args) throws IOException {
        ReadPropFile readPropFile = new ReadPropFile();
        readPropFile.readPropFile();
    }
}
