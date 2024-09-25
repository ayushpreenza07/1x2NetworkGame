package modules;

import commons.CommonLocators;
import org.openqa.selenium.By;
import utilities.ConfigReader;
import utilities.KeywordUtil;

import java.util.HashMap;

public class BoyleLogin {

    static By userNameInput = By.xpath("//input[@name='Username']");
    static By passwordInput = By.xpath("//input[@name='Password']");
    static By submitBtn = By.xpath("//input[@type='submit']");
    static By gamesLoginNameInput = By.id("name");
    static By gamesLoginPasswordInput = By.id("password");
    static By gamesLoginSubmitBtn = By.id("mobileLogin");
    static By acceptAllCookiesBtn = By.xpath("//div[@aria-label='We value your privacy']//button[text()='Accept All Cookies']");
    static By gamingOptionLnk = By.xpath("//a[contains(text(),'Gaming')]");
    static By iframeMyAccount = By.id("myAccount");
    static By casinoOptionLink = By.xpath("//a[@class='boyle-icons boyle-icons-casino']");

    public static void acceptAllCookies() {
        try {
            KeywordUtil.waitForVisible(acceptAllCookiesBtn, 60);
            KeywordUtil.click(acceptAllCookiesBtn, "Clicked on Accept All Cookies button");
        } catch (Throwable ignore) {
        }
    }

    public static void clickOnGamesTabHeader() {
        KeywordUtil.click(CommonLocators.gamesTabXpath,"Clicked on Games tab from header");
    }

    public static void login() {
        KeywordUtil.waitForVisible(acceptAllCookiesBtn, 120);
        KeywordUtil.click(acceptAllCookiesBtn, "Clicked on Accept All Cookies button");

        KeywordUtil.waitForVisible(iframeMyAccount);
        KeywordUtil.switchToFrame(iframeMyAccount, "");

        KeywordUtil.inputText(userNameInput, ConfigReader.getValue("sowmya_username"), "Entered " + ConfigReader.getValue("sowmya_username") + " into username text box");
        KeywordUtil.inputText(passwordInput, ConfigReader.getValue("password"), "Entered " + ConfigReader.getValue("password") + " into password text box");
        KeywordUtil.click(submitBtn, "Clicked on submit Button");
        KeywordUtil.switchToDefaultContent("");
    }

    public static void gamesLogin() throws InterruptedException {
        KeywordUtil.delay(3000);
        KeywordUtil.inputText(gamesLoginNameInput, ConfigReader.getValue("danilo_username"), "Entered " + ConfigReader.getValue("danilo_username") + " into username text box");
        KeywordUtil.inputText(gamesLoginPasswordInput, ConfigReader.getValue("password"), "Entered " + ConfigReader.getValue("password") + " into password text box");
        KeywordUtil.click(gamesLoginSubmitBtn, "Clicked on submit Button");
    }

    public static void chooseCasinoOption() {
        KeywordUtil.click(gamingOptionLnk, "Click on gaming menu");
        KeywordUtil.click(casinoOptionLink, "Click on casino option");
    }

}
