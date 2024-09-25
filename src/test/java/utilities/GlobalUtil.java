package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GlobalUtil {

    public static String errorMsg;
    public static Throwable e;
    private static WebDriver driver = null;

    @SuppressWarnings("Warning")
    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        GlobalUtil.driver = driver;
    }

}
