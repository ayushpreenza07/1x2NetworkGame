package step_definitions;

import commons.CommonMethods;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.KeywordUtil;
import utilities.TestSetupUtil;

import java.util.HashMap;

public class CrabbinCashJackpot extends KeywordUtil {

    public static HashMap<String, String> dataMap = new HashMap<String, String>();
    String NameOfGame;
    String gameFolderName = "Crabbin_Cash_jackpot_king";
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = TestSetupUtil.determineFolderPathForResolution(gameFolderName);
    }

    @When("Enter game name {string} in search bar")
    public void Enter_game_name_in_search_bar(String gameName) {
        try {
            modules.CrabbinCash.enterGameSearch(gameName);
            NameOfGame = gameName;
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("^select game$")
    public void select_game() {
        try {
            CommonMethods.selectGame(NameOfGame);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("Validate if Crabbin For Cash Extra Big Catch Jackpot King Cash Collect game launched in new window")
    public void validateIfCrabbinForCashExtraBigCatchJackpotKingCashCollectGameLaunchedInNewWindow() {
        try {
            modules.CrabbinCash.validateIfGameLaunchedInNewWindow(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("^User click on play icon for Crabbin cash$")
    public void user_click_on_play_icon_for_crabbin() {
        try {
            modules.CrabbinCash.playCrabbinLuckGame(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("^User place the minimum bet for Crabbin cash$")
    public void User_place_the_minimum_bet_for_Crabbin() {
        try {
            modules.CrabbinCash.placeBetForCrabbinGame(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User click on spin button in Crabbin For Cash Extra Big Catch JK game")
    public void userClickOnSpinButtonInCrabbinForCashExtraBigCatchJKGame() {
        try {
            modules.CrabbinCash.spinCrabbinGame(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

}
