package modules;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.testng.Assert;
import step_definitions.MyTestRunner;
import utilities.KeywordUtil;
import utilities.LogUtil;

public class HeaderPage {

//------------------------------------ Games Header Locators ------------------------------------------------>

    private static final By acceptCookies = By.cssSelector("#onetrust-accept-btn-handler");
    private static final By headerLoginButton = By.xpath("(//a[normalize-space()='LOGIN'])[1]");
    private static final By headerSBGamesLink = By.xpath("(//li)[77]");
    private static final By headerGamesLogo = By.xpath("(//a[@id='header-logo'])[1]");
    private static final By headerSportsLink = By.xpath("(//li)[1]");
    private static final By headerGamesLink = By.xpath("(//li)[2]");
    private static final By headerCasinoLink = By.xpath("(//li)[3]");
    private static final By headerLiveCasinoLink = By.xpath("(//li)[4]");
    private static final By headerBingoLink = By.xpath("(//li)[5]");
    private static final By headerPokerLink = By.xpath("(//li)[6]");
    private static final By headerLottoLink = By.xpath("(//li)[7]");
    private static final By headerDateTime = By.xpath("(//li)[8]");
    private static final By headerFacebookIcon = By.xpath("(//a[@class='fbicon'])[1]");
    private static final By headerTwitterIcon = By.xpath("(//a[@class='twittericon'])[1]");
    private static final By headerYoutubeIcon = By.xpath("(//a[@class='youtubeicon'])[1]");
    private static final By headerMobileLink = By.xpath("(//li[@class='border-r-blue txt-white relative'])[1]");
    private static final By headerHelpLink = By.xpath("(//li)[11]");
    private static final By headerMyAccountLink = By.xpath("(//span[normalize-space()='My Account'])[1]");
    private static final By headerInboxLink = By.xpath("(//a[@class='pr15 pl15'])[2]");
    private static final By headerLogoutLink = By.xpath("(//span[normalize-space()='Logout'])[1]");
    private static final By headerMyAccountIcon = By.xpath("(//a[@aria-label='Go to summary account page'])[1]");
    private static final By headerCarousel = By.id("main-carousel");
    private static final By headerNavNextBtn = By.xpath("(//span[@class='nav-arrow nav-arrow-right'])[1]");
    private static final By headerFeaturedByDefault = By.xpath("(//a[@class='featured active'])[1]");
    private static final By headerSearchInput = By.xpath("(//input[@id='GamesSearch'])[2]");
    private static final By headerPageTitle = By.xpath("//h1[@class='poppins bold upper mb20']");

//------------------------------------ Games Header Locators for PROD Environment ---------------------------------------->

    private static final By headerRecentTab = By.xpath("(//a[@href='/Recent'])[1]");
    private static final By headerNewGamesTab = By.xpath("(//a[@href='/new-slots'])[1]");
    private static final By headerExclusiveTab = By.xpath("(//a[@href='/exclusive-slots'])[1]");
    private static final By headerPromotionTab = By.xpath("(//a[@href='/promotions-and-offers'])[1]");
    private static final By headerLiveCasinoTab = By.xpath("(//a[@href='/live-casino'])[1]");
    private static final By headerOurPicksTab = By.xpath("(//a[@href='/our-picks'])[1]");
    private static final By headerPremiereTab = By.xpath("(//a[@href='/Premiere'])[1]");
    private static final By headerClassicSlotsTab = By.xpath("(//a[@href='/classic-slot-games'])[1]");
    private static final By headerBlackJackTab = By.xpath("(//a[@href='/blackjack'])[1]");
    private static final By headerRouletteTab = By.xpath("(//a[@href='/roulette'])[1]");
    private static final By headerInShopTab = By.xpath("(//a[@href='/betting-shops-casino'])[1]");
    private static final By headerJackPotsTab = By.xpath("(//a[@href='/jackpots'])[1]");
    private static final By headerSlingoTab = By.xpath("(//a[@href='/slingo'])[1]");
    private static final By headerMegawaysTab = By.xpath("(//a[@href='/megaways'])[1]");
    private static final By headerInstantWinTab = By.xpath("(//a[@href='/instant-win-games'])[1]");
    private static final By headerAllTab = By.xpath("(//a[@href='/all'])[1]");
    private static final By headerSlotsTab = By.xpath("(//a[@href='/Slots'])[1]");

//------------------------------------ Games Header Locators for M1 Environment --------------------------------------->
//
//    private static final By headerRecentTab = By.xpath("(//a[@href='/Recent'])[1]");
//    private static final By headerNewGamesTab = By.xpath("(//a[@href='/new-games'])[1]");
//    private static final By headerExclusiveTab = By.xpath("(//a[@href='/Exclusive'])[1]");
//    private static final By headerPromotionTab = By.xpath("(//a[@href='/promotions-and-offers'])[1]");
//    private static final By headerLiveCasinoTab = By.xpath("(//a[@href='/Live-Casino'])[1]");
//    private static final By headerOurPicksTab = By.xpath("(//a[@href='/Our-Picks'])[1]");
//    private static final By headerPremiereTab = By.xpath("(//a[@href='/Premiere'])[1]");
//    private static final By headerClassicSlotsTab = By.xpath("(//a[@href='/Classic-Slot'])[1]");
//    private static final By headerBlackJackTab = By.xpath("(//a[@href='/Blackjack'])[1]");
//    private static final By headerRouletteTab = By.xpath("(//a[@href='/Roulette'])[1]");
//    private static final By headerInShopTab = By.xpath("(//a[@href='/In-Shop'])[1]");
//    private static final By headerJackPotsTab = By.xpath("(//a[@href='/Jackpots'])[1]");
//    private static final By headerSlingoTab = By.xpath("(//a[@href='/Slingo'])[1]");
//    private static final By headerMegawaysTab = By.xpath("(//a[@href='/Megaways'])[1]");
//    private static final By headerInstantWinTab = By.xpath("(//a[@href='/instant-win'])[1]");
//    private static final By headerAllTab = By.xpath("(//a[@href='/all-games'])[1]");
//    private static final By headerSlotsTab = By.xpath("(//a[@href='/slots'])[1]");
//
//------------------------------------------ Games Header Methods and Actions ----------------------------------------->

    public static void clickAcceptCookies() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerSBGamesLink);
            MyTestRunner.logger.log(LogStatus.INFO, "Accepting All Cookies");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Accepting All Cookies");
            KeywordUtil.click(acceptCookies, "Clicking Accepting All Cookies button");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickHeaderLoginButton() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerLoginButton);
            KeywordUtil.click(headerLoginButton, "Clicked on LOGIN button from header");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickGamesLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerSBGamesLink);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking Sportsbook Games link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking Games link from Sportsbook header.");
            KeywordUtil.click(headerSBGamesLink, "Clicking Sportsbook Games link");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static boolean headerGamesLogoIsPresent() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerGamesLogo);
            MyTestRunner.logger.log(LogStatus.INFO, "Validating Games logo");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Validating Games logo");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }

        return KeywordUtil.isWebElementVisible(headerGamesLogo, "Validating Games logo");
    }

    public static void clickHeaderSportsLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerSportsLink);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking Sports link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking Sports link from Games header.");
            KeywordUtil.click(headerSportsLink, "Clicking Sports link");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickHeaderGamesLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerGamesLink);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking Games link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking Games link from Games header.");
            KeywordUtil.click(headerGamesLink, "Clicking Games link");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickHeaderCasinoLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerCasinoLink);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking Casino link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking Casino link from Games header.");
            KeywordUtil.click(headerCasinoLink, "Clicking Casino link");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickHeaderLiveCasinoLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerLiveCasinoLink);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking LiveCasino link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking LiveCasino link from Games header.");
            KeywordUtil.click(headerLiveCasinoLink, "Clicking LiveCasino link");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickHeaderBingoLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerBingoLink);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking Bingo link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking Bingo link from Games header.");
            KeywordUtil.click(headerBingoLink, "Clicking Bingo link");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickHeaderPokerLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerPokerLink);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking Poker link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking Poker link from Games header.");
            KeywordUtil.click(headerPokerLink, "Clicking Poker link");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickHeaderLottoLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerLottoLink);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking Lotto link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking Lotto link from Games header.");
            KeywordUtil.click(headerLottoLink, "Clicking Lotto link");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static boolean headerDateTimeIsPresent() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerDateTime);
            MyTestRunner.logger.log(LogStatus.INFO, "Validating Header Date and Time");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Validating Header Date and Time");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }

        return KeywordUtil.isWebElementVisible(headerDateTime, "Validating Header Date and Time");
    }

    public static void clickHeaderFacebookIcon() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerFacebookIcon);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking Facebook Icon");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking Facebook Icon from Games header.");
            KeywordUtil.click(headerFacebookIcon, "Clicking Facebook Icon");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickHeaderTwitterIcon() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerTwitterIcon);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking Twitter Icon");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking Twitter Icon from Games header.");
            KeywordUtil.click(headerTwitterIcon, "Clicking Twitter Icon");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickHeaderYoutubeIcon() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerYoutubeIcon);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking Youtube Icon");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking Youtube Icon from Games header.");
            KeywordUtil.click(headerYoutubeIcon, "Clicking Youtube Icon");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickHeaderMobileLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerMobileLink);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking Mobile link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking Mobile link from Games header.");
            KeywordUtil.click(headerMobileLink, "Clicking Mobile link");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickHeaderHelpLink() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerHelpLink);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking Help link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking Help link from Games header.");
            KeywordUtil.click(headerHelpLink, "Clicking Help link");
            KeywordUtil.switchToWindow();
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static String getPageUrl() {
        try {
            KeywordUtil.delay(3000);
            MyTestRunner.logger.log(LogStatus.INFO, "Getting the URL of the page.");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Getting the URL of the page.");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }

        return KeywordUtil.getCurrentUrl();
    }

    public static boolean headerMyAccountLinkIsPresent() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerMyAccountLink);
            MyTestRunner.logger.log(LogStatus.INFO, "Validating My Account link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Validating Header My Account link");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }

        return KeywordUtil.isWebElementVisible(headerMyAccountLink, "Validating Header My Account link");
    }

    public static boolean headerInboxLinkIsPresent() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerInboxLink);
            MyTestRunner.logger.log(LogStatus.INFO, "Validating Inbox link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Validating Header Inbox link");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }

        return KeywordUtil.isWebElementVisible(headerInboxLink, "Validating Header Inbox link");
    }

    public static boolean headerLogoutLinkIsPresent() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerLogoutLink);
            MyTestRunner.logger.log(LogStatus.INFO, "Validating Logout link");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Validating Header Logout link");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }

        return KeywordUtil.isWebElementVisible(headerLogoutLink, "Validating Header Logout link");
    }

    public static boolean headerMyAccountIconIsPresent() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerMyAccountIcon);
            MyTestRunner.logger.log(LogStatus.INFO, "Validating My Account icon");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Validating Header My Account icon");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }

        return KeywordUtil.isWebElementVisible(headerMyAccountIcon, "Validating Header My Account icon");
    }

    public static boolean headerCarouselIsPresent() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerCarousel);
            MyTestRunner.logger.log(LogStatus.INFO, "Validating Carousel");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Validating Header Carousel");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }

        return KeywordUtil.isWebElementVisible(headerCarousel, "Validating Header Carousel");
    }

    public static boolean featuredSelectedByDefault() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerFeaturedByDefault);
            MyTestRunner.logger.log(LogStatus.INFO, "Validating Featured tab");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Validating Header Featured tab");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }

        return KeywordUtil.isWebElementVisible(headerFeaturedByDefault, "Validating Featured tab is selected");
    }

    public static void clickRecentTab() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerRecentTab);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking Recent tab");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking Recent tab in main menu");
            KeywordUtil.click(headerRecentTab, "Clicking Recent tab");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickNewGamesTab() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerNewGamesTab);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking New Games tab");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking New Games tab in main menu");
            KeywordUtil.click(headerNewGamesTab, "Clicking New Games tab");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickExclusiveTab() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerExclusiveTab);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking Exclusive tab");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking Exclusive tab in main menu");
            KeywordUtil.click(headerExclusiveTab, "Clicking Exclusive tab");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickPromotionTab() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerPromotionTab);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking Promotion tab");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking Promotion tab in main menu");
            KeywordUtil.click(headerPromotionTab, "Clicking Promotion tab");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickLiveCasinoTab() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerLiveCasinoTab);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking Live Casino tab");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking Live Casino tab in main menu");
            KeywordUtil.click(headerLiveCasinoTab, "Clicking Live Casino tab");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickOurPicksTab() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerOurPicksTab);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking Our Picks tab");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking Our Picks tab in main menu");
            KeywordUtil.click(headerOurPicksTab, "Clicking Our Picks tab");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickPremiereTab() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerPremiereTab);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking Premiere tab");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking Premiere tab in main menu");
            KeywordUtil.click(headerPremiereTab, "Clicking Premiere tab");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickClassicSlotsTab() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerClassicSlotsTab);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking Classic Slots tab");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking Classic Slots tab in main menu");
            KeywordUtil.click(headerClassicSlotsTab, "Clicking Classic Slots tab");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickBlackjackTab() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerBlackJackTab);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking Blackjack tab");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking Blackjack tab in main menu");
            KeywordUtil.click(headerBlackJackTab, "Clicking Blackjack tab");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickRouletteTab() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerRouletteTab);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking Roulette tab");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking Roulette tab in main menu");
            KeywordUtil.click(headerRouletteTab, "Clicking Roulette tab");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickInShopTab() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerInShopTab);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking In Shop tab");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking In Shop tab in main menu");
            KeywordUtil.click(headerInShopTab, "Clicking In Shop tab");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickJackpotsTab() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerJackPotsTab);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking Jackpots tab");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking Jackpots tab in main menu");
            KeywordUtil.click(headerJackPotsTab, "Clicking Jackpots tab");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickSlingoTab() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerSlingoTab);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking Slingo tab");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking Slingo tab in main menu");
            KeywordUtil.click(headerSlingoTab, "Clicking Slingo tab");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickMegawaysTab() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerMegawaysTab);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking Megaways tab");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking Megaways tab in main menu");
            KeywordUtil.click(headerMegawaysTab, "Clicking Megaways tab");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickInstantWinTab() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerInstantWinTab);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking Instant Win tab");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking Instant Win tab in main menu");
            KeywordUtil.click(headerInstantWinTab, "Clicking Instant Win tab");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickAllGamesTab() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerAllTab);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking All Games tab");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking All Games tab in main menu");
            KeywordUtil.click(headerAllTab, "Clicking All Games tab");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static void clickSlotsTab() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerSlotsTab);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking Slots tab");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Clicking Slots tab in main menu");
            KeywordUtil.click(headerSlotsTab, "Clicking Slots tab");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

    public static String getHeaderPageTitle() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerPageTitle);
            MyTestRunner.logger.log(LogStatus.INFO, "Getting the Page Title");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Getting the Page Title");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
        return KeywordUtil.getElementText(headerPageTitle);
    }

    public static boolean headerSearchInputIsPresent() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerSearchInput);
            MyTestRunner.logger.log(LogStatus.INFO, "Validating Search input");
            LogUtil.infoLog(ImmortalWaysCharms.class, "Validating Header Search input");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
        return KeywordUtil.isWebElementVisible(headerSearchInput, "Validating Header Search input");
    }

    public static void clickNavNextButton() {
        try {
            KeywordUtil.delay(3000);
            KeywordUtil.waitForVisible(headerNavNextBtn);
            MyTestRunner.logger.log(LogStatus.INFO, "Clicking Next button in main menu");
            KeywordUtil.click(headerNavNextBtn, "Clicking Next button in main menu");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }
}
