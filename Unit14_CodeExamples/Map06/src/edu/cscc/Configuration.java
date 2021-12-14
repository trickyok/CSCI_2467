package edu.cscc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {
    private static Properties props;
    private static Properties defaults;
    private static final String PROPFILE = "config.properties";

    static {
        defaults = new Properties();
        defaults.setProperty("idname", "Student ID");
        defaults.setProperty("college", "Our College");
        props = new Properties(defaults);
        InputStream input = null;

        try {
            input = new FileInputStream(PROPFILE);
            {
                props.load(input);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Cannot find file " + PROPFILE);
        } catch (IOException e) {
            System.err.println("Cannot read file " + PROPFILE);
        }
    }

    public static Properties getProps() {
        return props;
    }
}
