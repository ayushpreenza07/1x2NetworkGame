package step_definitions;

import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.testng.CucumberOptions;
import org.apache.commons.io.IOUtils;
import org.testng.Assert;
import utilities.*;

import java.awt.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Base64;
import java.util.Collection;

import static utilities.GlobalUtil.getDriver;

public class Hooks {

    static String testCaseDescription;
    String imagePath;
    String pathForLogger;

    @Before("@Web")
    public void beforeScenario(Scenario scenario) {
        if (scenario.getName().contains("_"))
            testCaseDescription = scenario.getName().split("_")[1];
        else
            testCaseDescription = scenario.getName();
        MyTestRunner.logger = MyTestRunner.extent.startTest(testCaseDescription);

        //Add assigned tags to the scenario and report
        Collection<String> tags = scenario.getSourceTagNames();
        for (String tmp : tags)
            MyTestRunner.logger.assignCategory(tmp);

        //Tags name text for report name
        if (MyTestRunner.class.getAnnotation(CucumberOptions.class).tags().replace("@", "").equals(ConfigReader.getValue("boyleSportTxt")))
            MyTestRunner.tagName = "RegressionBatch";
        else
            MyTestRunner.tagName = tags.toString().replaceAll("[\\[\\]]", "").replace("@", "").split(",")[2].trim();

        //Screen resolution validation
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double scalePercentage = ((double) Toolkit.getDefaultToolkit().getScreenResolution() / 96) * 100;
        boolean width = screenSize.width != Integer.parseInt(ConfigReader.getValue("DefaultScreenWidth"));
        boolean height = screenSize.height != Integer.parseInt(ConfigReader.getValue("DefaultScreenHeight"));
        boolean scale = !String.valueOf(scalePercentage).equals("100.0%");
        if (!width && !height && !scale) {
            String tmp = "Please change the screen resolution to 1920x1080 with scale 100% to proceed with execution";
            MyTestRunner.logger.log(LogStatus.FAIL, HTMLReportUtil.failStringRedColor(tmp));
            Assert.fail(tmp);
        } else
            MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor("Execution proceeded on screen with resolution <b>" + screenSize.width + "x" + screenSize.height) + "</b>");

        System.out.println("--------------------------------------------------------------------------------------------------------------");
        LogUtil.infoLog(getClass(), "Test Started: " + scenario.getName());
        LogUtil.infoLog(Hooks.class, "Test is started with " + ConfigReader.getValue("PROD_URL") + " URL");
        GlobalUtil.setDriver(DriverUtil.getBrowser(ConfigReader.getValue("testOS"), ConfigReader.getValue("browserName")));
    }

    @After("@Web")
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                String scFileName = "ScreenShot_" + System.currentTimeMillis();
                String screenshotFilePath = ConfigReader.getValue("screenshotPath") + "\\" + scFileName + ".png";
                imagePath = HTMLReportUtil.testFailTakeScreenshot(screenshotFilePath);
                InputStream is = new FileInputStream(imagePath);
                byte[] imageBytes = IOUtils.toByteArray(is);
                Thread.sleep(2000);
                String base64 = Base64.getEncoder().encodeToString(imageBytes);
                pathForLogger = MyTestRunner.logger.addBase64ScreenShot("data:image/png;base64," + base64);
                MyTestRunner.logger.log(LogStatus.FAIL, HTMLReportUtil.failStringRedColor("Failed at point: " + pathForLogger) + GlobalUtil.e);
                byte[] screenshot = KeywordUtil.takeScreenshot(imagePath);
                scenario.attach(screenshot, "image/png", "Failed Screenshot");
            } catch (Exception e) {
                LogUtil.infoLog(MyTestRunner.class, "Error occurred due to " + e.getMessage());
            }
        } else
            LogUtil.infoLog(Hooks.class, "Test has ended closing browser: " + ConfigReader.getValue("browserName"));

//        getDriver().quit();
        MyTestRunner.extent.endTest(MyTestRunner.logger);
    }

}