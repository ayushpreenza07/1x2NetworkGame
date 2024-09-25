package modules.Network1x2;

import com.relevantcodes.extentreports.LogStatus;
import commons.CommonLocators;
import commons.Constants;
import modules.CrabbinCash;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import step_definitions.MyTestRunner;
import utilities.*;

public class GodOfOlympus {

    public static By searchIcon = By.xpath("//span[@class='icon-salient-search']");
    public static By searchBar = By.xpath("//input[@placeholder='Search all games']");
    public static By closeBtnPopup = By.xpath("//div[@class='eGamingBasic_loginPopup_closeBtn']");
    public static By gamePageLogo = By.id("header-logo");

    public static void enterGameSearch(String gameName) {
        clickSearch();
        try {
            KeywordUtil.waitForVisible(searchBar, 80);
            KeywordUtil.click(searchBar, "");
            KeywordUtil.inputText(searchBar, gameName, "Searched for " + gameName + " game in search bar");
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail(e.getMessage());
        }
    }

    public static void clickSearch(){
        KeywordUtil.click(searchIcon,"Search icon clicked");
    }

    public static void selectGame(String gameName) {
        try {
            By gameImg = By.xpath("(//a[@aria-label='"+gameName+"'])[1]");
            KeywordUtil.waitForVisible(gameImg, 20);
            KeywordUtil.delay(2000);
            KeywordUtil.waitForVisible(gameImg);
            KeywordUtil.hoverOnElement(gameImg);

            //Following modification is performed if play icon is not clicked once...
            KeywordUtil.click(gameImg,"");

            MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Clicked on game"));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail(e.getMessage());
        }
    }

    public static void fitToScreen() throws InterruptedException {
        // Zoom out to 80%
        JavascriptExecutor js = (JavascriptExecutor) KeywordUtil.getDriver();
        js.executeScript("document.body.style.zoom='80%'");

        for (int i = 0; i <= 4; i++) {
            KeywordUtil.scrollDown();
        }
    }
        public static void playGodOfOlympusGame(String folderPath) {
            System.out.println(folderPath+"ActivateSoundNo.png");
            SikuliUtil.clickOnElement(folderPath, "ActivateSoundNo.png", 45,"");

//            SikuliUtil.clickOnElement(folderPath, "playBtn.png", 10, "Clicked on play button");
//            SikuliUtil.clickOnElement(folderPath, "soundIcon.png", 10, "Clicked on sound icon");
        }


}
