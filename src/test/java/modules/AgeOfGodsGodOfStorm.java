package modules;

import com.relevantcodes.extentreports.LogStatus;
import commons.CommonLocators;
import commons.Constants;
import org.openqa.selenium.By;
import org.testng.Assert;
import step_definitions.MyTestRunner;
import utilities.*;

public class AgeOfGodsGodOfStorm {

    static String gameTitle = "";
    static By searchBar = By.id("searchinput");
    static String nameOfGame = "//li[contains(@ng-repeat,'searchItems')]//*[text()='gameName']";
    static String infoIcon = "//li[contains(@ng-repeat,'searchItems')]//*[text()='gameName']/following-sibling::a[contains(@class,'circle')]";
    static String playIconOnGame = "//li[contains(@ng-repeat,'searchItems')]//*[text()='gameName']/parent::div/preceding-sibling::div//span";
    static By gameBalance = By.cssSelector("div[class*='gdkBalance']");
    static By casinoLogo = By.cssSelector("img[alt='BoyleCasino']");

    public static void searchForGameInCasino(String gameName) {
        try {
            gameTitle = gameName;
            KeywordUtil.waitForVisible(casinoLogo, 120);
            KeywordUtil.waitForVisible(CommonLocators.recentCloseIcon, 10);
            KeywordUtil.clickJSWithoutWait(CommonLocators.recentCloseIcon, "");
            MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Clicked on Cross icon in Recently played banner"));
            KeywordUtil.waitForVisible(searchBar, 60);
            KeywordUtil.inputText(searchBar, gameName, "Searched for " + gameName + " game in Casino search bar");
            //new Actions(KeywordUtil.getDriver()).sendKeys(Keys.ENTER).build().perform();

            //TODO - Retrying search for 5 time...
            int count = 0;
            while (!KeywordUtil.waitForVisible(By.xpath(infoIcon.replace("gameName", gameTitle)), 5)) {
                if (count == 5)
                    break;
                KeywordUtil.writeInInputCharByChar(searchBar, gameTitle, "");
                if (KeywordUtil.waitForVisible(By.xpath(infoIcon.replace("gameName", gameTitle)), 5))
                    break;
                count++;
            }
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail(e.getMessage());
        }
    }

    public static void clickOnAGameInsideCasinoSearchResult() {
        try {
            KeywordUtil.delay(2000);
            try {
                KeywordUtil.hoverOnElement(By.xpath(nameOfGame.replace("gameName", gameTitle)));
            } catch (Throwable e) {
                Assert.fail("Game not found :(");
            }
            KeywordUtil.click(By.xpath(playIconOnGame.replace("gameName", gameTitle)), "");
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail(e.getMessage());
        }
    }

    public static void validateIfGameLaunched(String folderName) {
        try {
            Assert.assertTrue(SikuliUtil.doElementExist(folderName, "gameLogo.png", 60), "Game logo should be visible");
        } catch (Throwable e) {
            Assert.assertTrue(SikuliUtil.doElementExist(folderName, "continueBtn.png", 60), "Continue button should be visible");
        }
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Validated that game is launched in new window"));
    }

    public static void clickOnContinueBtn(String folderPath) {
        KeywordUtil.waitForVisible(gameBalance, 90);
        Constants.constants.setBalanceBeforeBetStr(KeywordUtil.getElementText(CommonLocators.gameBalanceWithSymbol).replace("€", ""));
        String tmp = "Balance before bet: " + Constants.constants.getBalanceBeforeBetStr();
        LogUtil.infoLog(AOTGGodOfStorms.class, tmp);
        MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor(tmp));

        SikuliUtil.clickOnElement(folderPath, "continueBtn.png", 120, "Clicked on continue button");
        SikuliUtil.clickOnElement(folderPath, "soundIcon.png", 10, "");
        if (!SikuliUtil.doElementExist(folderPath, "spinBtn.png", 5))
            SikuliUtil.clickOnImgElementLocation(folderPath, "continueBtn.png", 10, "");
    }

    public static void validateIfLowestBetIsSelected(String folderPath) {
        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "validateLowestBet.png", 60), "Lowest bet should be pre-selected");
        try {
            Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "disabledMinusBtn.png", 5), "Minus button should be disabled");
        } catch (Throwable e) {
            Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "lineBet.png", 1), "Minimum line bet (0.01) should be pre-selected");
        }
        Constants.constants.setNetPositionText("0.25");
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Validated that Lowest bet <b>(" + Constants.constants.getNetPositionText() + ")</b> is pre-selected in AOTG God of Storms game"));
    }

    public static void clickOnSpinBtn(String folderPath) {
        try {
            SikuliUtil.clickOnElement(folderPath, "spinBtn.png", 60, "Clicked on Spin button");
            KeywordUtil.delay(10000);
            KeywordUtil.waitForVisible(gameBalance);
            if (SikuliUtil.doElementExist(folderPath, "betNotPlacedError.png", 10))
                Assert.fail("Error popup with text 'Bet is not placed' occurred");
            Constants.constants.setBalanceAfterBetStr(KeywordUtil.getElementText(gameBalance).replace("€", ""));
            String tmp = "Balance after bet is " + Constants.constants.getBalanceAfterBetStr() + " and bet is placed for " + Constants.constants.getNetPositionText();
            MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor(tmp));
            LogUtil.infoLog(ImmortalWaysCharms.class, tmp);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail(e.getMessage());
        }
    }

}
