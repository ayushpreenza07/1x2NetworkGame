package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

public class AOTGKingOfOlympusMegaways {

    String gameFolderName = getClass().getSimpleName();
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = KeywordUtil.updateGameObjectsScreenshotsPath(gameFolderName);
    }

    @Then("Validate if AOTG King of Olympus Megaways game launched in new window")
    public void validateIfAOTGKingOfOlympusMegawaysGameLaunchedInNewWindow() {
        try {
            modules.QOTPMegaCash.validateIfGameLaunchedInNewWindow(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User clicks on play button inside AOTG King of Olympus Megaways game")
    public void userClicksOnPlayButtonInsideAOTGKingOfOlympusMegawaysGame() {
        try {
            modules.QOTPMegaCash.clickOnPlayBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User selects the minimum bet for AOTG King of Olympus Megaways game")
    public void userSelectsTheMinimumBetForAOTGKingOfOlympusMegawaysGame() {
        try {
            modules.QOTPMegaCash.selectsMinBet(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("Validate if minimum bet is selected for AOTG King of Olympus Megaways game")
    public void validateIfMinimumBetIsSelectedForAOTGKingOfOlympusMegawaysGame() {
        try {
            modules.QOTPMegaCash.validateIfLowestBetIsSelected(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User clicks on spin button inside AOTG King of Olympus Megaways game")
    public void userClicksOnSpinButtonInsideAOTGKingOfOlympusMegawaysGame() {
        try {
            modules.QOTPMegaCash.clickOnSpinBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

}
