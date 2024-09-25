package modules;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.testng.Assert;
import step_definitions.MyTestRunner;
import utilities.KeywordUtil;
import utilities.LogUtil;

public class FooterPage {

    //------------------------- Footer Page M1 Locators ------------------------------------------------------------
    private static final By quickAboutUs = By.xpath("(//a[contains(text(),'About Us')])[2]");
    private static final By quickShopLocator = By.xpath("(//a[contains(text(),'Shop Locator')])[2]");
    private static final By quickJobs = By.xpath("(//a[normalize-space()='Jobs'])[1]");
    private static final By quickRuleBook = By.xpath("(//a[normalize-space()='Rule Book'])[1]");
    private static final By quickAffiliates = By.xpath("(//a[normalize-space()='Affiliates'])[1]");
    private static final By quickBeResponsible = By.xpath("(//a[normalize-space()='Be Responsible'])[1]");
    private static final By quickPrivacyPolicy = By.xpath("(//a[contains(text(),'Privacy & Cookie Policy')])[1]");
    private static final By quickFonABet = By.xpath("(//a[contains(text(),'Fon-A-Bet')])[2]");
    private static final By quickTermsConditions = By.xpath("(//a[normalize-space()='Terms & Conditions'])[1]");
    private static final By quickManageCookies = By.xpath("(//a[contains(text(),'Manage Cookies')])[2]");
    private static final By customerServiceHelp = By.xpath("(//a[normalize-space()='Help'])[3]");
    private static final By manageCookiesLogo = By.xpath("(//img[@alt='Company Logo'])[1]");
    private static final By manageTitle = By.id("ot-pc-title");
    private static final By manageDescription = By.id("ot-pc-desc");
    private static final By managePrivacyPolicy = By.xpath("(//a[@aria-label='Privacy & Cookie Policy, opens in a new tab'])[1]");
    private static final By manageButtonContainer = By.xpath("(//div[@class='ot-btn-container'])[1]");
    private static final By footerFacebookIcon = By.xpath("(//a[@aria-label='facebook'])[1]");
    private static final By footerTwitterIcon = By.xpath("(//a[@aria-label='twitter'])[1]");
    private static final By footerYoutubeIcon = By.xpath("(//a[@aria-label='youtube'])[1]");
    private static final By footerLicenseNumber = By.xpath("(//a[normalize-space()='39469'])[1]");
    private static final By footerGibGamCommLink = By.xpath("(//a[normalize-space()='Gibraltar Gambling Commissioner'])[1]");
    private static final By footerOnlineDisputeLink = By.xpath("(//a[normalize-space()='Online Dispute Resolution Platform'])[1]");
    private static final By footerGameFairnessLink = By.xpath("(//a[normalize-space()='Game Fairness'])[1]");
    private static final By footerGibraltarIcon = By.xpath("(//img[@aria-label='Gibraltar'])[1]");
    private static final By footerUnderageIcon = By.xpath("(//img[@aria-label='18+'])[1]");
    private static final By footerIBASIcon = By.xpath("(//img[@aria-label='IBAS UK'])[1]");
    private static final By footerGamCareIcon = By.xpath("(//img[@aria-label='GamCare'])[1]");
    private static final By footerGamblingCareIcon = By.xpath("(//img[@aria-label='Gambling Care'])[1]");
    private static final By footerBeGambleAwareIcon = By.xpath("(//img[@aria-label='Be Gamble Aware'])[1]");
    private static final By footerGamCommissionIcon = By.xpath("(//img[@aria-label='Gambling Commission'])[1]");
    private static final By footerGamStopIcon = By.xpath("(//img[@aria-label='Gamstop'])[1]");
    private static final By footerSportsLink = By.xpath("(//a[normalize-space()='Sports'])[1]");
    private static final By footerCasinoLink = By.xpath("(//a[normalize-space()='Casino'])[1]");
    private static final By footerLiveCasinoLink = By.xpath("(//a[normalize-space()='Live Casino'])[1]");
    private static final By footerGamesLink = By.xpath("(//a[normalize-space()='Games'])[1]");
    private static final By footerBingoLink = By.xpath("(//a[normalize-space()='Bingo'])[1]");
    private static final By footerLottoLink = By.xpath("(//a[normalize-space()='Lotto'])[1]");
    private static final By footerPokerLink = By.xpath("(//a[normalize-space()='Poker'])[1]");


    //------------------------- Footer Page Methods and Actions ----------------------------------------------------
    public static void clickAboutUsLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(quickAboutUs);
            MyTestRunner.logger.log(LogStatus.INFO, "Click About Us link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click About Us link");
            KeywordUtil.click(quickAboutUs, "Clicking About Us link in Quick Links");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickShopLocatorLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(quickShopLocator);
            MyTestRunner.logger.log(LogStatus.INFO, "Click Shop Locator link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click Shop Locator link");
            KeywordUtil.click(quickShopLocator, "Clicking Shop Locator link in Quick Links");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickJobsLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(quickJobs);
            MyTestRunner.logger.log(LogStatus.INFO, "Click Jobs link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click Jobs link");
            KeywordUtil.click(quickJobs, "Clicking Jobs link in Quick Links");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickRuleBookLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(quickRuleBook);
            MyTestRunner.logger.log(LogStatus.INFO, "Click Rule Book link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click Rule Book link");
            KeywordUtil.click(quickRuleBook, "Clicking Rule Book link in Quick Links");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickAffiliatesLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(quickAffiliates);
            MyTestRunner.logger.log(LogStatus.INFO, "Click Affiliates link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click Affiliates link");
            KeywordUtil.click(quickAffiliates, "Clicking Affiliates link in Quick Links");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickBeResponsibleLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(quickBeResponsible);
            MyTestRunner.logger.log(LogStatus.INFO, "Click Be Responsible link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click Be Responsible link");
            KeywordUtil.click(quickBeResponsible, "Clicking Be Responsible link in Quick Links");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickPrivacyPolicyLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(quickPrivacyPolicy);
            MyTestRunner.logger.log(LogStatus.INFO, "Click Privacy & Cookie Policy link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click Privacy & Cookie Policy link");
            KeywordUtil.click(quickPrivacyPolicy, "Clicking Privacy & Cookie Policy in Quick Links");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickFonABetLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(quickFonABet);
            MyTestRunner.logger.log(LogStatus.INFO, "Click Fon A Bet link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click Fon A Bet link");
            KeywordUtil.click(quickFonABet, "Clicking Fon A Bet link in Quick Links");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }
    public static void clickTermsConditionLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(quickTermsConditions);
            MyTestRunner.logger.log(LogStatus.INFO, "Click Terms and Conditions link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click Terms and Conditions link");
            KeywordUtil.click(quickTermsConditions, "Clicking Terms and Conditions link in Quick Links");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }
    public static void clickManageCookiesLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(quickManageCookies);
            MyTestRunner.logger.log(LogStatus.INFO, "Click Manage Cookies link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click Manage Cookies link");
            KeywordUtil.click(quickManageCookies, "Clicking Manage Cookies link in Quick Links");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static boolean manageCookiesLogoIsPresent() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(manageCookiesLogo);
            MyTestRunner.logger.log(LogStatus.INFO, "Validating Manage Cookies logo");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Validating Manage Cookies logo");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }

        return KeywordUtil.isWebElementVisible(manageCookiesLogo, "Validating Manage Cookies logo");
    }

    public static boolean manageTitleIsPresent() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(manageTitle);
            MyTestRunner.logger.log(LogStatus.INFO, "Validating Manage Cookies Title");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Validating Manage Cookies Title");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }

        return KeywordUtil.isWebElementVisible(manageTitle, "Validating Manage Cookies Title");
    }

    public static boolean manageDescriptionIsPresent() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(manageDescription);
            MyTestRunner.logger.log(LogStatus.INFO, "Validating Manage Cookies Description");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Validating Manage Cookies Description");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }

        return KeywordUtil.isWebElementVisible(manageDescription, "Validating Manage Cookies Description");
    }

    public static boolean managePrivacyPolicyIsPresent() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(managePrivacyPolicy);
            MyTestRunner.logger.log(LogStatus.INFO, "Validating Privacy & Cookie Policy Link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Validating Privacy & Cookie Policy Link");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }

        return KeywordUtil.isWebElementVisible(managePrivacyPolicy, "Validating Privacy & Cookie Policy Link");
    }

    public static boolean manageButtonContainerIsPresent() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(manageButtonContainer);
            MyTestRunner.logger.log(LogStatus.INFO, "Validating Manage Cookies Button Container");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Validating Manage Cookies Button Container");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }

        return KeywordUtil.isWebElementVisible(manageButtonContainer, "Validating Manage Cookies Button Container");
    }

    public static void clickCustomerServiceHelpLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(customerServiceHelp);
            MyTestRunner.logger.log(LogStatus.INFO, "Click Customer Service Help link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click Customer Service Help link");
            KeywordUtil.click(customerServiceHelp, "Clicking Customer Service Help Link");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickFacebookIcon() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(footerFacebookIcon);
            MyTestRunner.logger.log(LogStatus.INFO, "Click Facebook icon");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click Facebook icon");
            KeywordUtil.scrollingToElementOfAWebPage(footerSportsLink, "Navigate to footer section");
            KeywordUtil.click(footerFacebookIcon, "Clicking Facebook icon in footer");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickTwitterIcon() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(footerTwitterIcon);
            MyTestRunner.logger.log(LogStatus.INFO, "Click Twitter icon");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click Twitter icon");
            KeywordUtil.scrollingToElementOfAWebPage(footerSportsLink, "Navigate to footer section");
            KeywordUtil.click(footerTwitterIcon, "Clicking Twitter icon in footer");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickYoutubeIcon() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(footerYoutubeIcon);
            MyTestRunner.logger.log(LogStatus.INFO, "Click Youtube icon");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click Youtube icon");
            KeywordUtil.scrollingToElementOfAWebPage(footerSportsLink, "Navigate to footer section");
            KeywordUtil.click(footerYoutubeIcon, "Clicking Youtube icon in footer");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickLicenseLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(footerLicenseNumber);
            MyTestRunner.logger.log(LogStatus.INFO, "Click License Number link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click License Number link");
            KeywordUtil.scrollingToElementOfAWebPage(footerSportsLink, "Navigate to footer section");
            KeywordUtil.click(footerLicenseNumber, "Clicking License Number link in footer");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickGibGamCommLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(footerGibGamCommLink);
            MyTestRunner.logger.log(LogStatus.INFO, "Click Gibraltar Gambling Commission link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click Gibraltar Gambling Commission link");
            KeywordUtil.scrollingToElementOfAWebPage(footerSportsLink, "Navigate to footer section");
            KeywordUtil.click(footerGibGamCommLink, "Clicking Gibraltar Gambling Commission link in footer");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickOnlineDisputeLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(footerOnlineDisputeLink);
            MyTestRunner.logger.log(LogStatus.INFO, "Click Online Dispute Resolution Platform link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click Online Dispute Resolution Platform link");
            KeywordUtil.scrollingToElementOfAWebPage(footerSportsLink, "Navigate to footer section");
            KeywordUtil.click(footerOnlineDisputeLink, "Clicking Online Dispute Resolution Platform link in footer");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickGameFairnessLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(footerGameFairnessLink);
            MyTestRunner.logger.log(LogStatus.INFO, "Click Game Fairness link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click Game Fairness link");
            KeywordUtil.scrollingToElementOfAWebPage(footerSportsLink, "Navigate to footer section");
            KeywordUtil.click(footerGameFairnessLink, "Clicking Game Fairness link in footer");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickGibraltarIcon() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(footerGibraltarIcon);
            MyTestRunner.logger.log(LogStatus.INFO, "Click Gibraltar icon");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click Gibraltar icon");
            KeywordUtil.scrollingToElementOfAWebPage(footerSportsLink, "Navigate to footer section");
            KeywordUtil.click(footerGibraltarIcon, "Clicking Gibraltar icon in footer");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickUnderageIcon() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(footerUnderageIcon);
            MyTestRunner.logger.log(LogStatus.INFO, "Click Underage icon");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click Underage icon");
            KeywordUtil.scrollingToElementOfAWebPage(footerSportsLink, "Navigate to footer section");
            KeywordUtil.click(footerUnderageIcon, "Clicking Underage icon in footer");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickIBASIcon() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(footerIBASIcon);
            MyTestRunner.logger.log(LogStatus.INFO, "Click IBAS icon");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click IBAS icon");
            KeywordUtil.scrollingToElementOfAWebPage(footerSportsLink, "Navigate to footer section");
            KeywordUtil.click(footerIBASIcon, "Clicking IBAS icon in footer");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickGamCareIcon() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(footerGamCareIcon);
            MyTestRunner.logger.log(LogStatus.INFO, "Click GamCare icon");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click GamCare icon");
            KeywordUtil.scrollingToElementOfAWebPage(footerSportsLink, "Navigate to footer section");
            KeywordUtil.click(footerGamCareIcon, "Clicking GamCare icon in footer");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickGamblingCareIcon() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(footerGamblingCareIcon);
            MyTestRunner.logger.log(LogStatus.INFO, "Click GamblingCare icon");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click GamblingCare icon");
            KeywordUtil.scrollingToElementOfAWebPage(footerSportsLink, "Navigate to footer section");
            KeywordUtil.click(footerGamblingCareIcon, "Clicking GamblingCare icon in footer");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickBeGambleAwareIcon() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(footerBeGambleAwareIcon);
            MyTestRunner.logger.log(LogStatus.INFO, "Click BeGambleAware icon");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click BeGambleAware icon");
            KeywordUtil.scrollingToElementOfAWebPage(footerSportsLink, "Navigate to footer section");
            KeywordUtil.click(footerBeGambleAwareIcon, "Clicking BeGambleAware icon in footer");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickGamblingCommissionIcon() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(footerGamCommissionIcon);
            MyTestRunner.logger.log(LogStatus.INFO, "Click Gambling Commission icon");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click Gambling Commission icon");
            KeywordUtil.scrollingToElementOfAWebPage(footerSportsLink, "Navigate to footer section");
            KeywordUtil.click(footerGamCommissionIcon, "Clicking Gambling Commission icon in footer");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickGamStopIcon() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(footerGamStopIcon);
            MyTestRunner.logger.log(LogStatus.INFO, "Click GamStop icon");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click GamStop icon");
            KeywordUtil.scrollingToElementOfAWebPage(footerSportsLink, "Navigate to footer section");
            KeywordUtil.click(footerGamStopIcon, "Clicking GamStop icon in footer");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickSportsLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(footerSportsLink);
            MyTestRunner.logger.log(LogStatus.INFO, "Click Sports Link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click Sports Link");
            KeywordUtil.scrollingToElementOfAWebPage(footerSportsLink, "Navigate to footer section");
            KeywordUtil.click(footerSportsLink, "Clicking Sports Link in footer");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickCasinoLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(footerCasinoLink);
            MyTestRunner.logger.log(LogStatus.INFO, "Click Casino Link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click CasinoLink");
            KeywordUtil.scrollingToElementOfAWebPage(footerSportsLink, "Navigate to footer section");
            KeywordUtil.click(footerCasinoLink, "Clicking Casino Link in footer");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickLiveCasinoLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(footerLiveCasinoLink);
            MyTestRunner.logger.log(LogStatus.INFO, "Click Live Casino Link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click Live Casino Link");
            KeywordUtil.scrollingToElementOfAWebPage(footerSportsLink, "Navigate to footer section");
            KeywordUtil.click(footerLiveCasinoLink, "Clicking Live Casino Link in footer");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickGamesLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(footerGamesLink);
            MyTestRunner.logger.log(LogStatus.INFO, "Click Games Link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click Games Link");
            KeywordUtil.scrollingToElementOfAWebPage(footerSportsLink, "Navigate to footer section");
            KeywordUtil.click(footerGamesLink, "Clicking Games Link in footer");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickBingoLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(footerBingoLink);
            MyTestRunner.logger.log(LogStatus.INFO, "Click Bingo Link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click Bingo Link");
            KeywordUtil.scrollingToElementOfAWebPage(footerSportsLink, "Navigate to footer section");
            KeywordUtil.click(footerBingoLink, "Clicking Bingo Link in footer");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickLottoLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(footerLottoLink);
            MyTestRunner.logger.log(LogStatus.INFO, "Click Lotto Link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click Lotto Link");
            KeywordUtil.scrollingToElementOfAWebPage(footerSportsLink, "Navigate to footer section");
            KeywordUtil.click(footerLottoLink, "Clicking Lotto Link in footer");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickPokerLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(footerPokerLink);
            MyTestRunner.logger.log(LogStatus.INFO, "Click Poker Link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Click Poker Link");
            KeywordUtil.scrollingToElementOfAWebPage(footerSportsLink, "Navigate to footer section");
            KeywordUtil.click(footerPokerLink, "Clicking Poker Link in footer");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

}
