package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class DriverUtil {

    public static WebDriver getBrowser(String exeEnv, String browserName) {
        switch (browserName) {
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                if (exeEnv.equalsIgnoreCase("Window")) {
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("clear-cache");
                    options.addArguments("clear-ssl-state");
                    options.addArguments("disable-application-cache");
                    GlobalUtil.setDriver(new ChromeDriver(options));
                } else if (exeEnv.equalsIgnoreCase("MAC"))
                    GlobalUtil.setDriver(new ChromeDriver());
                break;
            case "IE":
                WebDriverManager.iedriver().setup();
                GlobalUtil.setDriver(new InternetExplorerDriver());
                break;
            case "Firefox":
                WebDriverManager.firefoxdriver().setup();
                GlobalUtil.setDriver(new FirefoxDriver());
                break;
            case "Safari":
                GlobalUtil.setDriver(new SafariDriver());
                break;
            default:
                Assert.fail("Please check browser name :(");
        }
        GlobalUtil.getDriver().manage().window().maximize();
        LogUtil.infoLog(DriverUtil.class, ConfigReader.getValue("browserName") + " browser Launched and Maximized.");
        return GlobalUtil.getDriver();
    }

}