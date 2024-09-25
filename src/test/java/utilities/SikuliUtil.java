package utilities;

import com.google.common.collect.Iterators;
import com.relevantcodes.extentreports.LogStatus;
import org.sikuli.script.*;
import org.testng.Assert;
import step_definitions.MyTestRunner;
import step_definitions.MyTestRunner;

import java.io.File;
import java.util.Iterator;

public class SikuliUtil {

    private static final Screen screen = new Screen();

    /***
     * Used to click on the img object
     *
     * @param folderPath image folder path in string
     * @param imageObjectName image name in the folder
     * @param timeout wait in sec
     * @param logStep used to record step inside the report
     */
    public static void clickOnElement(String folderPath, String imageObjectName, int timeout, String logStep) {
        try {
            Pattern elementPattern = new Pattern(folderPath + File.separator + imageObjectName);
            screen.wait(elementPattern, timeout);
            screen.find(elementPattern);
            screen.click(elementPattern);
            if (!logStep.isEmpty()) {
                MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
                LogUtil.infoLog(SikuliUtil.class, logStep);
            }
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail();
            throw new RuntimeException(e);
        }
    }

    /***
     * Used to wait for image object till visible
     *
     * @param folderPath image folder path in string
     * @param imagePath image name in the folder
     * @param timeout wait in sec
     */
    public static void waitUntilImgElementIsVisible(String folderPath, String imagePath, int timeout) {
        try {
            System.out.println(folderPath+imagePath);
            screen.wait(new Pattern(folderPath + File.separator + imagePath), timeout);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(GlobalUtil.errorMsg);
        }
    }

    /***
     * Used to hover over the image object
     *
     * @param folderPath image folder path in string
     * @param imgObjName image name in the folder
     * @param timeout wait in sec
     */
    public static void hoverOverElement(String folderPath, String imgObjName, int timeout) {
        try {
            screen.wait(new Pattern(folderPath + File.separator + imgObjName), timeout);
            screen.hover(new Pattern(folderPath + File.separator + imgObjName));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(GlobalUtil.errorMsg);
        }
    }

    /***
     * It will be used to click on the image path using points on the screen.
     *
     * @param imagePath image folder path
     * @param logStep used to print the operation
     * @param waitTimeout wait in seconds
     */
    public static void clickOnImgElementLocation(String folderPath, String imagePath, int waitTimeout, String logStep) {
        try {
            Pattern elementPattern = new Pattern(folderPath + File.separator + imagePath);
            screen.wait(elementPattern, waitTimeout);
            screen.find(elementPattern);
            Region reg = new Screen();
            Match m = reg.find(elementPattern);
            Location loc = new Location(m.getX(), m.getY());
            loc.click();
            if (!logStep.isEmpty())
                MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    /***
     * Used to multi click on the location of image object
     *
     * @param folderPath image object folder path as String
     * @param imageObjectName image object as String
     * @param logStep record step
     */
    public static void multiClickOnLocationOfImgObj(String folderPath, String imageObjectName, String logStep, int loop) {
        try {
            String imagePath = folderPath + File.separator + imageObjectName;
            Pattern elementPattern = new Pattern(imagePath);
            Region reg = new Screen();
            Match m = reg.find(elementPattern);
            Location loc = new Location(m.getX(), m.getY());
            for (int i = 0; i < loop; i++)
                loc.click();
            if (!logStep.isEmpty())
                MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail("Error occurred :"+e.toString());
        }
    }

    public static void multiClickOnNthImageElement(String folderPath, String imageObjectName, int clickCount, int indexOfElement) {
        try {
            String imagePath = folderPath + File.separator + imageObjectName;
            Pattern elementPattern = new Pattern(imagePath);
            screen.wait(elementPattern, 60);
            Match minusSign = null;

            int count = 1;
            Iterator<Match> it = screen.findAll(elementPattern);
            System.out.println(Iterators.size(it));
            while (it.hasNext()) {
                Match currentElement = it.next();
                if (count == indexOfElement)
                    break;
                minusSign = currentElement;
                count++;
            }

            if (minusSign != null)
                for (int i = 1; i <= clickCount; i++)
                    minusSign.click();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(GlobalUtil.errorMsg);
        }
    }

    /***
     * Used for validating image object visibility
     *
     * @param folderPath image object folder path as String
     * @param imageObjectName image object name as String
     * @param waitTimeout wait in seconds
     */
    public static boolean doElementExist(String folderPath, String imageObjectName, int waitTimeout) {
        boolean flag = false;
        try {
            Pattern elementPattern = new Pattern(folderPath + File.separator + imageObjectName);
            flag = screen.exists(elementPattern, waitTimeout) != null;
        } catch (Throwable e) {
            GlobalUtil.e = e;
            System.out.println(GlobalUtil.e + " in " + SikuliUtil.class);
        }
        return flag;
    }

    /***
     * Used to scroll inside image object
     *
     * @param direction direction of scroll as String
     * @param scrolls number of scroll in integer
     */
    public static void multiScroll(String direction, int scrolls) {
        try {
            int temp;
            if (direction.equalsIgnoreCase("up"))
                temp = 1;
            else
                temp = -1;
            screen.wheel(temp, scrolls);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail();
        }
    }

}
