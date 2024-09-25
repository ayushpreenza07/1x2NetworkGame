package step_definitions;

import com.google.common.io.Files;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.apache.commons.io.FileUtils;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import utilities.ConfigReader;
import utilities.KeywordUtil;
import utilities.LogUtil;

import java.io.File;
import java.io.IOException;
import java.util.Date;

@CucumberOptions(features = "classpath:features",
        plugin = {"pretty", "html:target/cucumber-html-report.html", "json:target/cucumber.json"},
        //plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "timeline:test-output-thread/", "rerun:target/failedrerun.txt"},
        tags = "@GodOfOlympus",
        //TODO -> tags = "@GodOfStorms or @MegaFire" --- For executing multiple scenarios
        monochrome = true
)
public class MyTestRunner extends AbstractTestNGCucumberTests {

    public static ExtentTest logger;
    public static String tagName = null;
    static ExtentReports extent;

    @BeforeSuite
    public void directoryCleanUp() {
        try {
            KeywordUtil.directoryCreator(System.getProperty("user.dir") + File.separator + ConfigReader.getValue("screenshotPath"));
            KeywordUtil.directoryCreator(System.getProperty("user.dir") + File.separator + ConfigReader.getValue("infoScreenShotPath"));
            KeywordUtil.directoryCreator(System.getProperty("user.dir") + File.separator + "ExecutionReports" + File.separator + "HTMLReports");
        } catch (Throwable e) {
            LogUtil.infoLog(MyTestRunner.class, "Error occurred due to " + e.getMessage());
        }
    }

    @BeforeTest
    public void onStart(ITestContext context) {
        try {
            extent = new ExtentReports(System.getProperty("user.dir") + ConfigReader.getValue("extentReportPath"));
            extent.loadConfig(new File(System.getProperty("user.dir") + ConfigReader.getValue("extentConfigPath")));
            System.out.println("+===========================================================================================================+");
            LogUtil.infoLog(getClass(), "Suite started at " + new Date());
            LogUtil.infoLog(getClass(), "Suite Execution For Web application on environment: " + ConfigReader.getValue("defaultExecutionEnvironment"));
            System.out.println("+===========================================================================================================+\n");
        } catch (Exception e) {
            LogUtil.errorLog(getClass(), "Settings not properly set may not run the scripts properly\n" + e.getMessage());
        }
    }

    @AfterTest
    public void onFinish() {
        LogUtil.infoLog(getClass(), " suite finished at " + new Date());
        System.out.println("+===========================================================================================================+");
        extent.flush();
        extent.close();
        try {
            String filePathBackup = System.getProperty("user.dir") + File.separator + "ExecutionReports" + File.separator + "HTMLReportsBackup";
            if (!new File(filePathBackup).exists())
                FileUtils.forceMkdir(new File(filePathBackup));
            String filePath = System.getProperty("user.dir") + File.separator + "ExecutionReports" + File.separator + "HTMLReports";
            if (new File(filePath).exists()) {
                File[] listOfFiles = new File(filePath).listFiles();
                assert listOfFiles != null;
                if (listOfFiles.length > 0) {
                    for (File listOfFile : listOfFiles) {
                        if (listOfFile.isFile()) {
                            Files.copy(listOfFile, new File(filePathBackup + File.separator + tagName + ".html"));
                        } else
                            listOfFile.isDirectory();
                    }
                } else {
                    LogUtil.infoLog(MyTestRunner.class, "Folder present but files will be backed up after 2nd execution.");
                }
            }
        } catch (IOException e) {
            LogUtil.infoLog(MyTestRunner.class, "Error occurred due to " + e.getMessage());
        }
        KeywordUtil.onExecutionFinish();
    }

}