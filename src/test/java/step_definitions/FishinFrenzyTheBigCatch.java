package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.TestSetupUtil;

import java.util.HashMap;

public class FishinFrenzyTheBigCatch {

    public static HashMap<String, String> dataMap = new HashMap<String, String>();
    String gameFolderName = "FishinFrenzyTheBigCatch";
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = TestSetupUtil.determineFolderPathForResolution(gameFolderName);
    }

    @And("User click on Play button inside Fishin Frenzy The Big Catch game")
    public void userClickOnPlayButtonInsideFishinFrenzyTheBigCatchGame() {
        try {
            modules.FishinFrenzyTheBigCatch.clickOnPlayBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User selects the minimum bet for Fishin Frenzy The Big Catch game")
    public void userSelectsTheMinimumBetForFishinFrenzyTheBigCatchGame() {
        try {
            modules.FishinFrenzyTheBigCatch.selectingLowestBet(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User turn off the audio for Fishin Frenzy The Big Catch game")
    public void userTurnOffTheAudioForFishinFrenzyTheBigCatchGame() {
        try {
            modules.FishinFrenzyTheBigCatch.turnOffAudio(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("Validate if minimum bet is selected for Fishin Frenzy The Big Catch game")
    public void validateIfMinimumBetIsSelectedForFishinFrenzyTheBigCatchGame() {
        try {
            modules.FishinFrenzyTheBigCatch.validateIfLowestBetIsSelected(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User click on Spin button inside Fishin Frenzy The Big Catch game game")
    public void userClickOnSpinButtonInsideFishinFrenzyTheBigCatchGameGame() {
        try {
            modules.FishinFrenzyTheBigCatch.clickOnSpinBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

}
