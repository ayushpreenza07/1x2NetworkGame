package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

public class MoneyCartII {

    static Class<MoneyCartII> thisClass = MoneyCartII.class;
    String gameFolderName = thisClass.getSimpleName();
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = KeywordUtil.updateGameObjectsScreenshotsPath(gameFolderName);
    }

    @Then("Validate if Money Cart II game launched in new window")
    public void validateIfMoneyCartIIGameLaunchedInNewWindow() {
        try {
            modules.SantasStack.validateIfGameIsLaunchedInNewWindow(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User clicks on Click to continue button inside Money Cart II game")
    public void userClicksOnClickToContinueButtonInsideMoneyCartIIGame() {
        try {
            modules.SantasStack.clickOnClickToContinueBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail(e.getMessage());
        }
    }

    @And("User turn off the audio for Money Cart II game")
    public void userTurnOffTheAudioForMoneyCartIIGame() {
        try {
            modules.LuckOTheIrishGoldSFPJKing.turnOffTheAudio(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail(e.getMessage());
        }
    }

    @Then("Validate if minimum bet is pre-selected for Money Cart II game")
    public void validateIfMinimumBetIsPreSelectedForMoneyCartIIGame() {
        try {
            modules.SantasStack.validateIfLowestBetIsSelected(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User clicks on spin button for Money Cart II game")
    public void userClicksOnSpinButtonForMoneyCartIIGame() {
        try {
            modules.FishinFrenzyTheBigCatch.clickOnSpinBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

}
