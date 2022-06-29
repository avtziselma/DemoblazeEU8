package com.demoblaze.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    //1- Create the object of Properties
    private static Properties properties = new Properties();

    static{

        try {

            //2- We need to open the file in java memory: FileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");

            //3- Load the properties object using FileInputStream object
            properties.load(file);

            //close the file
            file.close();


        } catch (IOException e) {
            System.out.println("File not found in the ConfigurationReader class.");
            e.printStackTrace();
        }

    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }

}
/*
What are we trying to achieve?
• The data we will be storing in our configuration.properties is going to
be the kind of data that will be able to change the flow of the
execution of our test suites.
• Examples:
• Be able to login with different usernames
• Be able to enter different password
• Be able to change the browser type we are running our test suite
• Be able to change the environment we are running our test suite on
 */

/*
How to read from a properties file?
1. We need to use Properties class. The object of this class can read .properties
files.

Properties properties=new Properties();

2. We need to use FileInputStream class. This class allows us read data from a file.

FileInputStream file=new FileInputStream(name:"file.path");

3. After opening file stream using its path, we load the file to properties object.

properties.load(file);

4. Once object is loaded with the file, we can get any “value” by passing “key"

properties.getProperty("browser");

 */



