package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

public class GoldenWinner {

    String gameFolderName = getClass().getSimpleName();
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = KeywordUtil.updateGameObjectsScreenshotsPath(gameFolderName);
    }

    @Then("Validate if Golden Winner game launched in new window")
    public void validateIfGoldenWinnerGameLaunchedInNewWindow() {
        try {
            modules.LegacyOfDead.validateIfGameLaunchedInNewWindow(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail();
        }
    }

    @When("User clicks on Touch to continue button in Golden Winner game")
    public void userClicksOnTouchToContinueButtonInGoldenWinnerGame() {
        try {
            modules.GoldenWinner.clickOnTouchToContinueBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User selects minimum bet for Golden Winner with Bet button")
    public void userSelectsMinimumBetForGoldenWinnerWithBetButton() {
        try {
            modules.LuckOTheIrishGoldSFPJKing.selectsTheMinBet(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("Validate if minimum bet is selected for Golden Winner game")
    public void validateIfMinimumBetIsSelectedForGoldenWinnerGame() {
        try {
            modules.LuckOTheIrishGoldSFPJKing.validateIfLowestBetIsSelected(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }


    @When("User clicks on spin button for Golden Winner game")
    public void userClicksOnSpinButtonForGoldenWinnerGame() {
        try {
            modules.LuckOTheIrishGoldSFPJKing.clickOnSpinBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

}
