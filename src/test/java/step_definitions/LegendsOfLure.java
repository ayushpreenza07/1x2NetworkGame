package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.KeywordUtil;
import utilities.TestSetupUtil;

import java.util.HashMap;

public class LegendsOfLure extends KeywordUtil {

    String gameFolderName = getClass().getSimpleName();
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = KeywordUtil.updateGameObjectsScreenshotsPath(gameFolderName);
    }

    @Then("^User click on play icon for legends lure$")
    public void user_click_on_play_icon_for_legends() {
        try {
            modules.LegendsLure.playLegendsLureGame(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("^User place the minimum bet for legends$")
    public void User_place_the_minimum_bet_for_Crabbin() {
        try {
            modules.LegendsLure.placeBetForLegendsLureGame(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User click on spin button in Legend of Lure game")
    public void userClickOnSpinButtonInLegendOfLureGame() {
        try {
            modules.LegendsLure.spinLegensdLureGame(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
}
