package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * This ConfigReader file will read the config file
 */

public class ConfigReader {

    private ConfigReader() {
    }

    /**
     * Load property file properties.
     *
     * @param filePath the file path
     * @return the properties
     */
    public static Properties loadPropertyFile(String filePath) {
        File file = new File(filePath);
        Properties prop = new Properties();
        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(file);
            prop.load(fileInput);
        } catch (Exception e) {
            LogUtil.errorLog(ConfigReader.class, "Caught the exception", e);
        }
        return prop;
    }

    /**
     * will get sting value from properties file
     *
     * @param key the key
     * @return value
     */
    public static String getValue(String key) {
        Properties prop = loadPropertyFile("src/main/resources/Config/config.properties");
        return prop.getProperty(key);
    }

    /**
     * will get int value from properties file
     *
     * @param key the key
     * @return int value
     */
    public static int getIntValue(String key) {
        Properties prop = loadPropertyFile("src/main/resources/Config/config.properties");
        return Integer.parseInt(prop.getProperty(key));
    }

}
