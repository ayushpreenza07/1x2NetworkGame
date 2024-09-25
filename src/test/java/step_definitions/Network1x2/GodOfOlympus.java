package step_definitions.Network1x2;

import commons.CommonMethods;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.ConfigReader;
import utilities.GlobalUtil;
import utilities.KeywordUtil;
import utilities.TestSetupUtil;

import java.io.File;

public class GodOfOlympus extends KeywordUtil {

    String NameOfGame;
    String gameFolderName = "God_Of_Olympus";
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = TestSetupUtil.determineFolderPathForResolution(gameFolderName);
    }

    @Given("^Navigate to the 1x2 network url$")
    public void navigate_to_the_1x2_url() {
        try {
            navigateToUrl(ConfigReader.getValue("PROD_URL"));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("Enter game name {string}")
    public void Enter_game_name_in_search_bar(String gameName) {
        try {
            modules.Network1x2.GodOfOlympus.enterGameSearch(gameName);
            NameOfGame = gameName;
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("^open game$")
    public void open_game() {
        try {
            modules.Network1x2.GodOfOlympus.selectGame(NameOfGame);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("^scroll down and fit to screen$")
    public void fit_to_screen() {
        try {
            modules.Network1x2.GodOfOlympus.fitToScreen();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("^play game$")
    public void play_game() {
        try {
            modules.Network1x2.GodOfOlympus.playGodOfOlympusGame(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
}
