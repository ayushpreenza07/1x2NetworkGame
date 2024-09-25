package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

public class EyeOfHorusMegaways {

    String gameFolderName = getClass().getSimpleName();
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = KeywordUtil.updateGameObjectsScreenshotsPath(gameFolderName);
    }

    @Then("Validate if Eye Of Horus Megaways game launched in new window")
    public void validateIfEyeOfHorusMegawaysGameLaunchedInNewWindow() {
        try {
            modules.LuckOTheIrishGoldSFPJKing.validateIfGameLaunchedInNewWindow(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail();
        }
    }

    @When("User clicks on play button for Eye Of Horus Megaways game")
    public void userClicksOnPlayButtonForEyeOfHorusMegawaysGame() {
        try {
            modules.LuckOTheIrishGoldSFPJKing.clickOnFirstPlayBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail();
        }
    }


    @And("User selects minimum bet for Eye Of Horus Megaways game using down button")
    public void userSelectsMinimumBetForEyeOfHorusMegawaysGameUsingDownButton() {
        try {
            modules.RickAndMortyWubbaLubbaDDJKing.selectsMinBetWithDownBtn(folderPath, 5);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail();
        }
    }

    @Then("Validate if minimum bet is selected for Eye Of Horus Megaways game")
    public void validateIfMinimumBetIsSelectedForEyeOfHorusMegawaysGame() {
        try {
            modules.LuckOTheIrishGoldSFPJKing.validateIfLowestBetIsSelected(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User clicks on spin button for Eye Of Horus Megaways game")
    public void userClicksOnSpinButtonForEyeOfHorusMegawaysGame() {
        try {
            modules.LuckOTheIrishGoldSFPJKing.clickOnSpinBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

}
