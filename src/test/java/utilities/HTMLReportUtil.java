package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

/**
 * The type Html report util.
 */
public class HTMLReportUtil {

    /**
     * The constant DummyString.
     */
    public static String DummyString;

    /**
     * Test fail take screenshot string.
     *
     * @param imagePath the image path
     * @return the string
     * @throws IOException the io exception
     */
    public static String testFailTakeScreenshot(String imagePath) throws IOException {
        File src = ((TakesScreenshot) GlobalUtil.getDriver()).getScreenshotAs(OutputType.FILE);
        File des = new File(imagePath);
        FileUtils.copyFile(src, des);
        LogUtil.infoLog(HTMLReportUtil.class, des.toString());
        DummyString = des.getAbsolutePath();
        String path = DummyString;
        String base = "TXAutomate/ExecutionReports/FailedScreenshots/";
        return new File(base).toURI().relativize(new File(path).toURI()).getPath();
    }

    /**
     * Fail string red color string.
     *
     * @param stepName the step name
     * @return the string
     */
    public static String failStringRedColor(String stepName) {
        return "<span style='color:red'><b>" + stepName + "</b></span>";
    }

    /**
     * Pass string green color string.
     *
     * @param stepName the step name
     * @return the string
     */
    public static String passStringGreenColor(String stepName) {
        return "<span style='color:#008000'><b>" + stepName + " - PASSED" + "</b></span>";
    }

    /**
     * Pass string green color string.
     *
     * @param stepName the step name
     * @return the string
     */
    public static String warningStringOrangeColor(String stepName) {
        return "<span style='color:#FFAA33'><b>" + stepName + " - WARNING" + "</b></span>";
    }

    /**
     * Info string blue color string.
     *
     * @param stepName the step name
     * @return the string
     */
    public static String infoStringBlueColor(String stepName) {
        return "<span style='color:#87CEEB'><b>" + stepName + " - INFO" + "</b></span>";
    }

}
