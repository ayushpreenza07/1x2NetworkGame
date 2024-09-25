package commons;

import org.openqa.selenium.By;

public class CommonLocators {

    public static final By gameBalance = By.cssSelector(".balance h2");
    public static final By gameBalanceWithSymbol = By.cssSelector("[class*='gdkBalance']");
    public static By netPositionDiv = By.xpath("//div[@class='ukNetPositionIcon uiControlIcon uiControlIconOnTopBar']/following-sibling::div");
    public static By recentCloseIcon = By.xpath("//a/span[@class='recent-close txt-white float-right']");
    public static String playIconOnGame = "//*[@id='GamesSearchResult']//*[@alt='gameName']/parent::*//button[@aria-label='Launch Game']";
    public static By gamesTabXpath = By.xpath("//a[text()='Games']");

}
