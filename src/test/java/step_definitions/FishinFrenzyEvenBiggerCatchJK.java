package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

public class FishinFrenzyEvenBiggerCatchJK {

    String gameFolderName = getClass().getSimpleName();
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = KeywordUtil.updateGameObjectsScreenshotsPath(gameFolderName);
    }

    @Then("Validate if Fishin Frenzy Even Bigger Catch Jackpot King game is launched in new window")
    public void validateIfFishinFrenzyEvenBiggerCatchJackpotKingGameIsLaunchedInNewWindow() {
        try {
            modules.CrabbinCash.validateIfGameLaunchedInNewWindow(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User click on Play button inside Fishin Frenzy Even Bigger Catch Jackpot King game")
    public void userClickOnPlayButtonInsideFishinFrenzyEvenBiggerCatchJackpotKingGame() {
        try {
            modules.CrabbinCash.playCrabbinLuckGame(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User selects the minimum bet for Fishin Frenzy Even Bigger Catch Jackpot King game")
    public void userSelectsTheMinimumBetForFishinFrenzyEvenBiggerCatchJackpotKingGame() {
        try {
            modules.CrabbinCash.placeBetForCrabbinGame(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("Validate if minimum bet is selected for Fishin Frenzy Even Bigger Catch Jackpot King game")
    public void validateIfMinimumBetIsSelectedForFishinFrenzyEvenBiggerCatchJackpotKingGame() {
        try {
            modules.FishinFrenzyTheBigCatch.validateIfLowestBetIsSelected(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User click on Spin button inside Fishin Fishin Frenzy Even Bigger Catch Jackpot King game")
    public void userClickOnSpinButtonInsideFishinFishinFrenzyEvenBiggerCatchJackpotKingGame() {
        try {
            modules.FishinFrenzyTheBigCatch.clickOnSpinBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

}
