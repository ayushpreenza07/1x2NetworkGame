package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

public class FishinFrenzyChristmas {

    String gameFolderName = getClass().getSimpleName();
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = KeywordUtil.updateGameObjectsScreenshotsPath(gameFolderName);
    }

    @Then("Validate if Fishin Frenzy Christmas game is launched in new window")
    public void validateIfFishinFrenzyChristmasGameIsLaunchedInNewWindow() {
        try {
            modules.FishinFrenzyTheBigCatch.validateIfGameLaunchedInNewWindow(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User click on play button in Fishin Frenzy Christmas game")
    public void userClickOnPlayButtonInFishinFrenzyChristmasGame() {
        try {
            modules.FishinFrenzyChristmas.clickOnPlayBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User selects the minimum bet in Fishin Frenzy Christmas game")
    public void userSelectsTheMinimumBetInFishinFrenzyChristmasGame() {
        try {
            modules.FishinFrenzyChristmas.selectingLowestBet(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User turn off the audio for Fishin Frenzy Christmas game")
    public void userTurnOffTheAudioForFishinFrenzyChristmasGame() {
        try {
            modules.FishinFrenzyChristmas.turnOffAudio(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("Validate if minimum bet is selected for Fishin Frenzy Christmas game")
    public void validateIfMinimumBetIsSelectedForFishinFrenzyChristmasGame() {
        try {
            modules.FishinFrenzyTheBigCatch.validateIfLowestBetIsSelected(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User click on Spin button in Fishin Frenzy Christmas game")
    public void userClickOnSpinButtonInFishinFrenzyChristmasGame() {
        try {
            modules.FishinFrenzyTheBigCatch.clickOnSpinBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

}
