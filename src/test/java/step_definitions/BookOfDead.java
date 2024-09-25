package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.KeywordUtil;
import utilities.TestSetupUtil;

import java.util.HashMap;

public class BookOfDead extends KeywordUtil {

    String gameFolderName = getClass().getSimpleName();
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = KeywordUtil.updateGameObjectsScreenshotsPath(gameFolderName);
    }

    @Then("^User click on play icon for book of dead$")
    public void user_click_on_play_icon_for_bookDead() {
        try {
            modules.BookOfDead.playBookDeadGame(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("^User place the minimum bet for book of dead$")
    public void User_place_the_minimum_bet_for_bookDead() {
        try {
            modules.BookOfDead.placeBetForBookOfDeadGame(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User click on spin button in Book of Dead game")
    public void userClickOnSpinButtonInBookOfDeadGame() {
        try {
            modules.BookOfDead.spinBookOfDeadGame(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
}
