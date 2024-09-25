package utilities;

import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import step_definitions.MyTestRunner;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.NoSuchElementException;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class KeywordUtil extends GlobalUtil {

    public static final String VALUE = "value";
    private static final int DEFAULT_WAIT_SECONDS = 30;
    private static final String userDir = "user.dir";
    public static String cucumberTagName;
    public static String lastAction = "";
    static Runtime rt = Runtime.getRuntime();

    /**
     * Used to create a folder path for screenshots
     *
     * @param GameFolderName - is the name of folder for specific game
     * @return path to the folder as String
     */
    public static String updateGameObjectsScreenshotsPath(String GameFolderName) {
        return System.getProperty("user.dir") + File.separator + ConfigReader.getValue("GameScreenshotPath") + File.separator + GameFolderName;
    }

    /**
     * On execution finish.
     */
    public static void onExecutionFinish() {
        String htmlReportFile = System.getProperty("user.dir") + "\\" + ConfigReader.getValue("HtmlReportFullPath");
        LogUtil.infoLog(KeywordUtil.class, "cucumber path is " + htmlReportFile);
        File f = new File(htmlReportFile);
        if (f.exists()) {
            try {
                rt.exec("rundll32 url.dll,FileProtocolHandler " + htmlReportFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String htmlExtentReportFile = System.getProperty("user.dir") + File.separator + "ExecutionReports" + File.separator + "HTMLReportsBackup" + File.separator + MyTestRunner.tagName + ".html";
        LogUtil.infoLog(KeywordUtil.class, "Extent Report File path is  " + htmlExtentReportFile);
        File extentReport = new File(htmlExtentReportFile);
        if (extentReport.exists()) {
            try {
                rt.exec("rundll32 url.dll,FileProtocolHandler " + htmlExtentReportFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Take screenshot byte [ ].
     *
     * @param screenshotFilePath the screenshot file path
     * @return the byte [ ]
     */
    public static byte[] takeScreenshot(String screenshotFilePath) {
        try {
            byte[] screenshot = ((TakesScreenshot) GlobalUtil.getDriver()).getScreenshotAs(OutputType.BYTES);
            FileOutputStream fileOutputStream = new FileOutputStream(screenshotFilePath);
            fileOutputStream.write(screenshot);
            fileOutputStream.close();
            return screenshot;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Scrolling to element of a page boolean.
     *
     * @param locator the locator
     * @param logStep the log step
     * @return the boolean
     * @throws InterruptedException the interrupted exception
     */
    public static boolean scrollingToElementOfAWebPage(By locator, String logStep) throws InterruptedException {
        Thread.sleep(5000);
        WebElement element = GlobalUtil.getDriver().findElement(locator);
        ((JavascriptExecutor) GlobalUtil.getDriver()).executeScript("arguments[0].scrollIntoView();", element);
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
        return true;
    }

    public static void scrollDown() throws InterruptedException {
        Thread.sleep(5000);
        ((JavascriptExecutor) GlobalUtil.getDriver()).executeScript("window.scrollBy(0, arguments[0]);", "200");
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Scrolling down"));
    }

    /**
     * Click js boolean.
     *
     * @param locator the locator
     * @param logStep the log step
     */
    public static void clickJSWithoutWait(By locator, String logStep) {
        KeywordUtil.lastAction = "Click : " + locator.toString();
        LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", getDriver().findElement(locator));
        if (!logStep.isEmpty())
            MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
    }

    /**
     * Gets current date time.
     *
     * @return the current date time
     */
    public static String getCurrentDateTime() {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMddHHmmss");
        Date now = new Date();
        String strDate = sdfDate.format(now);
        LogUtil.infoLog(KeywordUtil.class, strDate);
        return strDate;
    }

    /**
     * Navigate to url.
     *
     * @param url the url
     */
    public static void navigateToUrl(String url) {
        try {
            KeywordUtil.lastAction = "Navigate to: " + url;
            LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
            getDriver().get(url);
            getDriver().manage().window().maximize();

            String pageTitle = getDriver().getTitle();
            LogUtil.infoLog(KeywordUtil.class, pageTitle);
            if (pageTitle.contains("Robot Check"))
                getDriver().get(url);
        } catch (Exception e) {
            GlobalUtil.e = e;
            Assert.fail(e.getMessage());
        }
    }

    /**
     * Gets current url.
     *
     * @return the current url
     */
    public static String getCurrentUrl() {
        return getDriver().getCurrentUrl();
    }

    /**
     * Wait for clickable web element.
     *
     * @param locator the locator
     * @return the web element
     */
    public static WebElement waitForClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), DEFAULT_WAIT_SECONDS);
        //wait.ignoring(ElementNotVisibleException.class);
        wait.ignoring(WebDriverException.class);
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    /**
     * Wait for present web element.
     *
     * @param locator the locator
     * @return web element
     */
    public static WebElement waitForPresent(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), DEFAULT_WAIT_SECONDS);
        //wait.ignoring(ElementNotVisibleException.class);
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    /**
     * Wait for visible web element.
     *
     * @param locator the locator
     * @return web element
     */
    public static WebElement waitForVisible(By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), DEFAULT_WAIT_SECONDS);
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Wait for visible web element.
     *
     * @param locator the locator
     * @param timeout in seconds
     * @return web element
     */
    public static boolean waitForVisible(By locator, int timeout) {
        boolean flag = false;
        try {
            WebElement element = new WebDriverWait(getDriver(), timeout).until(ExpectedConditions.visibilityOfElementLocated(locator));
            if (element != null)
                flag = true;
        } catch (Exception ignore) {
        }
        return flag;
    }

    public static WebElement waitForVisible(WebElement ele) {
        try {
            return new WebDriverWait(getDriver(), DEFAULT_WAIT_SECONDS).until(ExpectedConditions.visibilityOf(ele));
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Wait for in visible boolean.
     *
     * @param locator the locator
     * @return the boolean
     */
    public static boolean waitForInVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    /**
     * Wait for visible ignore stale element web element.
     *
     * @param locator the locator
     * @return the web element
     */
    public static WebElement waitForVisibleIgnoreStaleElement(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), DEFAULT_WAIT_SECONDS);
        wait.ignoring(StaleElementReferenceException.class);
        //wait.ignoring(ElementNotVisibleException.class);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    /**
     * Click boolean.
     *
     * @param locator the locator
     * @param logStep the log step
     * @return boolean
     */
    public static boolean click(By locator, String logStep) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(locator)).isDisplayed();
        KeywordUtil.lastAction = "Click: " + locator.toString();
        LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
        WebElement elm = waitForClickable(locator);
        if (elm == null)
            return false;
        else {
            elm.click();
            if (!logStep.isEmpty())
                MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
            return true;
        }
    }

    /**
     * Accept alert boolean.
     *
     * @return the boolean
     */
    public static boolean acceptAlert() {
        Alert alert = GlobalUtil.getDriver().switchTo().alert();
        alert.accept();
        return true;
    }

    /**
     * Accept alert boolean.
     *
     * @return the boolean
     */
    public static WebElement executeJavaScriptExecutorScripts(String script) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) GlobalUtil.getDriver();
            Object result = js.executeScript(script);
            if (result instanceof WebElement) {
                return (WebElement) result;
            } else {
                System.out.println("Script did not return a WebElement: " + result);
                return null;
            }
        } catch (Exception e) {
            System.out.println("Exception occurred while executing JavaScript script: " + e.getMessage());
            return null;
        }
    }

    /**
     * Switch to window boolean.
     *
     * @return the boolean
     */
    public static boolean switchToWindow() {
        boolean flag = false;
        try {
            new WebDriverWait(GlobalUtil.getDriver(), 120).until(ExpectedConditions.numberOfWindowsToBe(2));
            GlobalUtil.getDriver().switchTo().window(new ArrayList<>(GlobalUtil.getDriver().getWindowHandles()).get(1));
            return true;
        } catch (Throwable e) {
            GlobalUtil.e = e;
            LogUtil.infoLog(KeywordUtil.class, e.getMessage());
            Assert.fail();
        }
        return flag;
    }

    public static void waitForNewWindow() {
        WebDriverWait wait = new WebDriverWait(GlobalUtil.getDriver(), DEFAULT_WAIT_SECONDS);
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    }

    public static void maximizeWindow() {
        GlobalUtil.getDriver().manage().window().maximize();
    }

    /**
     * Click link boolean.
     *
     * @param linkText the link text
     * @param logStep  the log step
     * @return boolean
     */
    public static boolean clickLink(String linkText, String logStep) {
        KeywordUtil.lastAction = "Click Link: " + linkText;
        LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
        WebElement elm = waitForClickable(By.linkText(linkText));
        if (elm == null) {
            return false;
        } else {
            elm.click();
            MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
            return true;
        }
    }

    /**
     * Gets element text.
     *
     * @param locator the locator
     * @return element text
     */
    public static String getElementText(By locator) {
        KeywordUtil.lastAction = "Get Element text: " + locator.toString();
        LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
        WebElement elm = waitForClickable(locator);
        return elm.getText().trim();
    }

    /**
     * Gets image title.
     *
     * @param locator the locator
     * @return the image title
     */
    public static String getImageTitle(By locator) {
        String tmp = "";
        try {
            tmp = Objects.requireNonNull(waitForVisible(locator)).getAttribute("title");
        } catch (Throwable e) {
            tmp = null;
            GlobalUtil.e = e;
            Assert.fail();
        }
        return tmp;
    }

    /**
     * Is web element visible boolean.
     *
     * @param locator the locator
     * @param logStep the log step
     * @return boolean
     */
    public static boolean isWebElementVisible(By locator, String logStep) {
        try {
            KeywordUtil.lastAction = "Check Element visible: " + locator.toString();
            LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
            WebElement elm = waitForVisible(locator);
            if (!logStep.isEmpty())
                MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
            return Objects.requireNonNull(elm).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Is web element enable boolean.
     *
     * @param locator the locator
     * @param logStep the log step
     * @return the boolean
     */
    public static boolean isWebElementEnable(By locator, String logStep) {
        boolean flag;
        try {
            KeywordUtil.lastAction = "Check Element visible: " + locator.toString();
            LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
            WebElement elm = waitForVisible(locator);
            MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
            assert elm != null;
            flag = elm.isEnabled();
        } catch (Throwable e) {
            LogUtil.infoLog(KeywordUtil.class, e.toString());
            flag = false;
        }
        return flag;
    }

    /**
     * Is web element present boolean.
     *
     * @param locator the locator
     * @param logStep the log step
     * @return the boolean
     */
    public static boolean isWebElementPresent(By locator, String logStep) {
        KeywordUtil.lastAction = "Check Element present: " + locator.toString();
        LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
        List<WebElement> elements = getDriver().findElements(locator);
        if (elements.isEmpty()) {
            MyTestRunner.logger.log(LogStatus.FAIL, HTMLReportUtil.failStringRedColor(logStep));
            return false;
        }
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
        return true;
    }

    /**
     * Hover on element boolean.
     *
     * @param by the by
     * @throws InterruptedException the interrupted exception
     */
    public static void hoverOnElement(By by) throws InterruptedException {
        WebElement element = getDriver().findElement(by);
        new Actions(getDriver()).moveToElement(element).build().perform();
        Thread.sleep(3000);
    }

    /**
     * Click using Actions class.
     *
     * @param locator the locator
     * @param logStep the log step
     */
    public static void clickWithActions(By locator, String logStep) {
        boolean result = false;
        try {
            KeywordUtil.lastAction = "Click using Actions class: " + locator.toString();
            LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
            WebElement element = getDriver().findElement(locator);
            Actions action = new Actions(getDriver()).click(element);
            action.build().perform();
            MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
            result = true;
        } catch (StaleElementReferenceException | NoSuchElementException e) {
            LogUtil.infoLog(KeywordUtil.class, locator + " - Element is not attached to the page document " + e.getStackTrace());
        } catch (Exception e) {
            LogUtil.infoLog(KeywordUtil.class, locator.toString() + " - Element is not attached to the page document " + e.getStackTrace());
        }
    }

    /**
     * Is web element not present boolean.
     *
     * @param locator the locator
     * @return boolean
     */
    public static boolean isWebElementNotPresent(By locator) {
        KeywordUtil.lastAction = "Check Element not present: " + locator.toString();
        LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
        List<WebElement> elements = (new WebDriverWait(getDriver(), DEFAULT_WAIT_SECONDS)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
        return elements.isEmpty();
    }

    /**
     * Input text boolean.
     *
     * @param locator the locator
     * @param data    the data
     * @param logStep the log step
     */
    public static void inputText(By locator, String data, String logStep) {
        KeywordUtil.lastAction = "Input Text: " + data + " - " + locator.toString();
        LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
        WebElement elm = waitForVisible(locator);
        if (elm != null) {
            elm.clear();
            elm.sendKeys(data);
            if (!logStep.isEmpty())
                MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
        }
    }

    public static void directoryCreator(String filePath) {
        try {
            if (new File(filePath).exists())
                FileUtils.cleanDirectory(new File(filePath));
            else
                FileUtils.forceMkdir(new File(filePath));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail(e.toString());
        }
    }

    public static String getScreenShotPathAsBase64() {
        String tmp = "";
        try {
            String scFileName = "ScreenShot_" + System.currentTimeMillis();
            File src = ((TakesScreenshot) GlobalUtil.getDriver()).getScreenshotAs(OutputType.FILE);

            File des = new File(ConfigReader.getValue("infoScreenShotPath") + "\\" + scFileName + ".png");
            FileUtils.copyFile(src, des);
            LogUtil.infoLog(HTMLReportUtil.class, des.toString());
            String path = des.getAbsolutePath();
            String base = "TXAutomate/ExecutionReports/ScreenShots/";
            String fileNamePath = new File(base).toURI().relativize(new File(path).toURI()).getPath();

            InputStream is = new FileInputStream(fileNamePath);
            byte[] imageBytes = IOUtils.toByteArray(is);
            String base64 = Base64.getEncoder().encodeToString(imageBytes);
            tmp = MyTestRunner.logger.addBase64ScreenShot("data:image/png;base64," + base64);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            tmp = null;
            Assert.fail(e.toString());
        }
        return tmp;
    }

    /**
     * Input text js boolean.
     *
     * @param locator the locator
     * @param data    the data
     * @param logStep the log step
     * @return boolean
     */
    public static boolean inputTextJS(By locator, String data, String logStep) {
        KeywordUtil.lastAction = "Input Text: " + data + " - " + locator.toString();
        LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
        WebElement element = waitForVisible(locator);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].value = arguments[1]", element, data);
        if (element.getText().equalsIgnoreCase(data)) {
            MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
            return true;
        } else
            return false;
    }

    /**
     * Is radio selected boolean.
     *
     * @param locator the locator
     * @param logStep the log step
     * @return boolean
     */
    public static boolean isRadioSelected(By locator, String logStep) {
        KeywordUtil.lastAction = "Is Radio Selected: " + locator.toString();
        LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
        WebElement element = waitForVisible(locator);
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
        assert element != null;
        return element.isSelected();
    }

    /**
     * Is radio not selected boolean.
     *
     * @param locator the locator
     * @param logStep the log step
     * @return boolean
     */
    public static boolean isRadioNotSelected(By locator, String logStep) {
        KeywordUtil.lastAction = "Is Radio Not Selected: " + locator.toString();
        LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
        boolean check = isRadioSelected(locator, logStep);
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
        return (!check);
    }

    /**
     * Clear input boolean.
     *
     * @param locator the locator
     * @return boolean
     */
    public static boolean clearInput(By locator) {
        WebElement element = waitForVisible(locator);
        assert element != null;
        element.clear();
        element = waitForVisible(locator);
        assert element != null;
        return element.getAttribute(VALUE).isEmpty();
    }

    /**
     * Verify css property boolean.
     *
     * @param locator the locator
     * @param data    the data
     * @param logStep the log step
     * @return boolean
     */
    public static boolean verifyCssProperty(By locator, String data, String logStep) {
        KeywordUtil.lastAction = "Verify CSS : " + data + " - " + locator.toString();
        LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
        String[] property = data.split(":", 2);
        String expProp = property[0];
        String expValue = property[1];
        boolean flag = false;
        String prop = (waitForPresent(locator)).getCssValue(expProp);
        if (prop.trim().equals(expValue.trim())) {
            flag = true;
            MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
        }
        return flag;
    }

    /**
     * Verify input text boolean.
     *
     * @param locator the locator
     * @param data    the data
     * @param logStep the log step
     * @return boolean
     */
    public static boolean verifyInputText(By locator, String data, String logStep) {
        String actual = "";
        try {
            KeywordUtil.lastAction = "Verify Input Expected Text: " + data + " - " + locator.toString();
            LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
            WebElement element = waitForVisible(locator);
            assert element != null;
            actual = element.getAttribute(VALUE);
            LogUtil.infoLog(KeywordUtil.class, "Actual:" + actual);
            MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
        } catch (Throwable e) {
            GlobalUtil.e = e;
        }
        return actual.equalsIgnoreCase(data);
    }

    /**
     * Verify input text js boolean.
     *
     * @param locator the locator
     * @param data    the data
     * @param logStep the log step
     * @return boolean
     */
    public static boolean verifyInputTextJS(By locator, String data, String logStep) {
        KeywordUtil.lastAction = "Verify Input Expected Text: " + data + " - " + locator.toString();
        LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
        WebElement element = waitForVisible(locator);
        assert element != null;
        String message = String.format("Verified text expected \"%s\" actual \"%s\" ", data, element.getText());
        LogUtil.infoLog(KeywordUtil.class, message);
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
        return data.equalsIgnoreCase(element.getText());
    }

    /**
     * Verify text boolean.
     *
     * @param locator the locator
     * @param data    the data
     * @param logStep the log step
     * @return boolean
     */
    public static boolean verifyText(By locator, String data, String logStep) {
        KeywordUtil.lastAction = "Verify Expected Text: " + data + " - " + locator.toString();
        LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
        WebElement element = waitForVisible(locator);
        String message = String.format("Verified text expected \"%s\" actual \"%s\" ", data, element.getText());
        LogUtil.infoLog(KeywordUtil.class, message);
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
        return element.getText().equalsIgnoreCase(data);
    }

    /**
     * Verify text contains boolean.
     *
     * @param locator the locator
     * @param data    the data
     * @param logStep the log step
     * @return the boolean
     */
    public static boolean verifyTextContains(By locator, String data, String logStep) {
        KeywordUtil.lastAction = "Verify Text Contains: " + data + " - " + locator.toString();
        LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
        WebElement element = waitForVisible(locator);
        assert element != null;
        String message = String.format("Verified text expected \"%s\" actual \"%s\" ", data, element.getText());
        LogUtil.infoLog(KeywordUtil.class, message);
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
        return element.getText().toUpperCase().contains(data.toUpperCase());
    }

    /**
     * Click js boolean.
     *
     * @param locator the locator
     * @param logStep the log step
     */
    public static void clickJS(By locator, String logStep) {
        KeywordUtil.lastAction = "Click : " + locator.toString();
        LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
        WebElement element = waitForVisible(locator);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", element);
        if (!logStep.isEmpty())
            MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
    }

    public static void switchToFrame(By frameLocator, String logStep) {
        new WebDriverWait(getDriver(), 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
        lastAction = "Switched to frame: " + frameLocator.toString();
        LogUtil.infoLog(KeywordUtil.class, lastAction);
        if (!logStep.isEmpty())
            MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
    }

    public static void switchToDefaultContent(String logStep) {
        getDriver().switchTo().defaultContent();
        lastAction = "Switched to default content";
        LogUtil.infoLog(KeywordUtil.class, lastAction);
        if (!logStep.isEmpty())
            MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
    }

    /**
     * Select by index boolean.
     *
     * @param locator the locator
     * @param index   the index
     * @param logStep the log step
     * @return boolean
     */
    public static boolean selectByIndex(By locator, int index, String logStep) {
        KeywordUtil.lastAction = "Select dropdown by index : " + index + " - " + locator.toString();
        LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
        Select sel = new Select(getDriver().findElement(locator));
        sel.selectByIndex(index);

        // Check whether element is selected or not
        sel = new Select(getDriver().findElement(locator));
        if (sel.getFirstSelectedOption().isDisplayed()) {
            MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
            return true;
        } else
            return false;
    }

    /**
     * Select by value boolean.
     *
     * @param locator the locator
     * @param value   the value
     * @param logStep the log step
     * @return boolean
     */
    public static boolean selectByValue(By locator, String value, String logStep) {
        KeywordUtil.lastAction = "Select dropdown by value : " + value + " - " + locator.toString();
        LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
        Select sel = new Select(getDriver().findElement(locator));
        sel.selectByValue(value);

        // Check whether element is selected or not
        sel = new Select(getDriver().findElement(locator));
        if (sel.getFirstSelectedOption().isDisplayed()) {
            MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
            return true;
        } else {
            return false;
        }
    }

    /**
     * Select by visible text boolean.
     *
     * @param locator the locator
     * @param value   the value
     * @param logStep the log step
     * @return boolean
     */
    public static boolean selectByVisibleText(By locator, String value, String logStep) {
        try {
            KeywordUtil.lastAction = "Select dropdown by text : " + value + " - " + locator.toString();
            LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
            new Select(getDriver().findElement(locator)).selectByVisibleText(value);
            MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Verify dropdown selected value boolean.
     *
     * @param locator the locator
     * @param data    the data
     * @param logStep the log step
     * @return boolean
     */
    public static boolean verifyDropdownSelectedValue(By locator, String data, String logStep) {
        KeywordUtil.lastAction = "Verify Dropdown selected option: " + data + " - " + locator.toString();
        LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
        Select sel = new Select(Objects.requireNonNull(waitForVisible(locator)));
        String defSelectedVal = sel.getFirstSelectedOption().getText();
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
        return defSelectedVal.trim().equals(data.trim());
    }

    /**
     * Verify element size boolean.
     *
     * @param locator the locator
     * @param size    the size
     * @param logStep the log step
     * @return boolean
     */
    public static boolean verifyElementSize(By locator, int size, String logStep) {
        KeywordUtil.lastAction = "Verify Element size: " + size + " - " + locator.toString();
        LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
        List<WebElement> elements = getDriver().findElements(locator);
        if (elements.size() == size) {
            LogUtil.infoLog(KeywordUtil.class, "Element is Present " + size + "times");
            MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
            return true;
        } else {
            LogUtil.infoLog(KeywordUtil.class, "Element is not Present with required size");
            LogUtil.infoLog(KeywordUtil.class, "Expected size:" + size + " but actual size: " + elements.size());
            return false;
        }
    }

    /**
     * Write in input char by char boolean.
     *
     * @param locator the locator
     * @param data    the data
     * @param logStep the log step
     * @throws InterruptedException the interrupted exception
     */
    public static void writeInInputCharByChar(By locator, String data, String logStep) throws InterruptedException {
        WebElement element = waitForVisible(locator);
        assert element != null;
        element.clear();
        String[] b = data.split("");
        for (String s : b) {
            element.sendKeys(s);
            Thread.sleep(100);
        }
        if (!logStep.isEmpty())
            MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
    }

    /**
     * Delay.
     *
     * @param time the time
     * @throws InterruptedException the interrupted exception
     */
    public static void delay(long time) throws InterruptedException {
        Thread.sleep(time);
    }

    /**
     * Upload files using send keys boolean.
     *
     * @param locator the locator
     * @param data    the data
     * @param logStep the log step
     * @return boolean
     */
    public static boolean uploadFilesUsingSendKeys(By locator, String data, String logStep) {
        WebElement element = waitForVisible(locator);
        assert element != null;
        element.clear();
        element.sendKeys(System.getProperty(userDir) + "\\src\\test\\resources\\uploadFiles\\" + data);
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
        return true;
    }

    @SuppressWarnings("deprecation")
    public static void waitForPageToLoad() {
        GlobalUtil.getDriver().manage().timeouts().pageLoadTimeout(DEFAULT_WAIT_SECONDS, TimeUnit.SECONDS);
    }

    /**
     * Double click boolean.
     *
     * @param locator the locator
     * @param logStep the log step
     * @return the boolean
     */
    public static boolean doubleClick(By locator, String logStep) {
        boolean result = false;
        try {
            KeywordUtil.lastAction = "Double click: " + locator.toString();
            LogUtil.infoLog(KeywordUtil.class, KeywordUtil.lastAction);
            Actions action = new Actions(getDriver()).doubleClick(getDriver().findElement(locator));
            action.build().perform();
            MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(logStep));
            result = true;
        } catch (StaleElementReferenceException | NoSuchElementException e) {
            LogUtil.infoLog(KeywordUtil.class, locator + " - Element is not attached to the page document " + Arrays.toString(e.getStackTrace()));
        } catch (Exception e) {
            LogUtil.infoLog(KeywordUtil.class, locator.toString() + " - Element is not attached to the page document " + Arrays.toString(e.getStackTrace()));
        }
        return result;
    }

    /**
     * Switch to frame boolean.
     *
     * @param frameName the frame name
     * @return the boolean
     */
    public static boolean switchToFrame(String frameName) {
        try {
            getDriver().switchTo().frame(frameName);
            return true;
        } catch (Exception e) {
            LogUtil.infoLog(KeywordUtil.class, frameName + " TO FRAME FAILED" + Arrays.toString(e.getStackTrace()));
            return false;
        }
    }

    /**
     * ScrollDown.
     *
     * @param Element the element
     */
    public static void scrollDown(WebElement Element, int scrollByPixel) {
        JavascriptExecutor js = (JavascriptExecutor) GlobalUtil.getDriver();
        js.executeScript("window.scrollBy(0," + scrollByPixel + ");", Element);
    }

    /**
     * Del directory boolean.
     */
    public void delDirectory() {
        try {
            File delDestination = new File(System.getProperty(userDir) + "\\src\\test\\resources\\downloadFile");
            if (delDestination.exists()) {
                File[] files = delDestination.listFiles();
                assert files != null;
                for (File file : files)
                    if (file.isDirectory())
                        delDirectory();
            }
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail();
        }
    }

}


