package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.TestSetupUtil;

import java.util.HashMap;

public class FootballCashCollect {

    public static HashMap<String, String> dataMap = new HashMap<>();
    String gameFolderName = getClass().getSimpleName();
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = TestSetupUtil.determineFolderPathForResolution(gameFolderName);
    }

    @Then("Validate if Football Cash Collect game launched in new window")
    public void validateIfFootballCashCollectGameLaunchedInNewWindow() {
        try {
            setUp();
            modules.FootballCashCollect.validateIfGameLaunchedInNewWindow(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User clicks on play button on Football Cash Collect game")
    public void userClicksOnPlayButtonOnFootballCashCollectGame() {
        try {
            modules.FootballCashCollect.clickOnPlayBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User selects minimum bet for Football Cash Collect game")
    public void userSelectsMinimumBetForFootballCashCollectGame() {
        try {
            modules.FootballCashCollect.selectsMinBet(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("Validate if minimum bet is selected for Football Cash Collect game")
    public void validateIfMinimumBetIsSelectedForFootballCashCollectGame() {
        try {
            modules.FootballCashCollect.validateIfLowestBetIsSelected(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User clicks on spin button in Football Cash Collect game")
    public void userClicksOnSpinButtonInFootballCashCollectGame() {
        try {
            modules.FootballCashCollect.clickOnSpinBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

}
