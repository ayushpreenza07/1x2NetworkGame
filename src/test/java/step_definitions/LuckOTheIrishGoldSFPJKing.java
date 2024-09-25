package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

public class LuckOTheIrishGoldSFPJKing {

    static Class<LuckOTheIrishGoldSFPJKing> thisClass = LuckOTheIrishGoldSFPJKing.class;
    String gameFolderName = thisClass.getSimpleName();
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = KeywordUtil.updateGameObjectsScreenshotsPath(gameFolderName);
    }

    @Then("Validate if Luck O the Irish Gold Spins Fortune Play Jackpot King game launched in new window")
    public void validateIfLuckOTheIrishGoldSpinsFortunePlayJackpotKingGameLaunchedInNewWindow() {
        try {
            modules.LuckOTheIrishGoldSFPJKing.validateIfGameLaunchedInNewWindow(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User clicks on play button for Luck O the Irish Gold Spins Fortune Play Jackpot King game")
    public void userClicksOnPlayButtonForLuckOTheIrishGoldSpinsFortunePlayJackpotKingGame() {
        try {
            modules.LuckOTheIrishGoldSFPJKing.clickOnFirstPlayBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User clicks on play button inside tutorial screen for Luck O the Irish Gold Spins Fortune Play Jackpot King game")
    public void userClicksOnPlayButtonInsideTutorialScreenForLuckOTheIrishGoldSpinsFortunePlayJackpotKingGame() {
        try {
            modules.LuckOTheIrishGoldSFPJKing.clickOnPlayBtnOnTutorialScr(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User turn off the audio for Luck O the Irish Gold Spins Fortune Play Jackpot King game")
    public void userTurnOffTheAudioForLuckOTheIrishGoldSpinsFortunePlayJackpotKingGame() {
        try {
            modules.LuckOTheIrishGoldSFPJKing.turnOffTheAudio(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User selects minimum bet for Luck O the Irish Gold Spins Fortune Play Jackpot King game")
    public void userSelectsMinimumBetForLuckOTheIrishGoldSpinsFortunePlayJackpotKingGame() {
        try {
            modules.LuckOTheIrishGoldSFPJKing.selectsTheMinBet(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("Validate if minimum bet is selected for Luck O the Irish Gold Spins Fortune Play Jackpot King game")
    public void validateIfMinimumBetIsSelectedForLuckOTheIrishGoldSpinsFortunePlayJackpotKingGame() {
        try {
            modules.LuckOTheIrishGoldSFPJKing.validateIfLowestBetIsSelected(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User clicks on spin button for Luck O the Irish Gold Spins Fortune Play Jackpot King game")
    public void userClicksOnSpinButtonForLuckOTheIrishGoldSpinsFortunePlayJackpotKingGame() {
        try {
            modules.LuckOTheIrishGoldSFPJKing.clickOnSpinBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

}
