package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

public class RickAndMortyWubbaLubbaDDJKing {

    String gameFolderName = getClass().getSimpleName();
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = KeywordUtil.updateGameObjectsScreenshotsPath(gameFolderName);
    }

    @Then("Validate if Rick and Morty Wubba Lubba Dub Dub Jackpot King game launched in new window")
    public void validateIfRickAndMortyWubbaLubbaDubDubJackpotKingGameLaunchedInNewWindow() {
        try {
            modules.LuckOTheIrishGoldSFPJKing.validateIfGameLaunchedInNewWindow(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail();
        }
    }

    @When("User clicks on play button for Rick and Morty Wubba Lubba Dub Dub Jackpot King")
    public void userClicksOnPlayButtonForRickAndMortyWubbaLubbaDubDubJackpotKing() {
        try {
            modules.LuckOTheIrishGoldSFPJKing.clickOnFirstPlayBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail();
        }
    }

    @And("User clicks on play button inside Rick and Morty Wubba Lubba Dub Dub Jackpot King game introduction")
    public void userClicksOnPlayButtonInsideRickAndMortyWubbaLubbaDubDubJackpotKingGameIntroduction() {
        try {
            modules.TheGooniesReturnJKing.clickOnArrowBtnInsideIntroductionScreen(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail();
        }
    }

    @And("User selects minimum bet for Rick and Morty Wubba Lubba Dub Dub Jackpot King game using down button")
    public void userSelectsMinimumBetForRickAndMortyWubbaLubbaDubDubJackpotKingGameUsingDownButton() {
        try {
            modules.RickAndMortyWubbaLubbaDDJKing.selectsMinBetWithDownBtn(folderPath, 10);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail();
        }
    }

    @Then("Validate if minimum bet is selected for Rick and Morty Wubba Lubba Dub Dub Jackpot King game")
    public void validateIfMinimumBetIsSelectedForRickAndMortyWubbaLubbaDubDubJackpotKingGame() {
        try {
            modules.LuckOTheIrishGoldSFPJKing.validateIfLowestBetIsSelected(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User clicks on spin button for Rick and Morty Wubba Lubba Dub Dub Jackpot King game")
    public void userClicksOnSpinButtonForRickAndMortyWubbaLubbaDubDubJackpotKingGame() {
        try {
            modules.LuckOTheIrishGoldSFPJKing.clickOnSpinBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
}
