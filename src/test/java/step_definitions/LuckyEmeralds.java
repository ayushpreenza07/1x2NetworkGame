package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

public class LuckyEmeralds {

    static Class<LuckyEmeralds> thisClass = LuckyEmeralds.class;
    String gameFolderName = thisClass.getSimpleName();
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = KeywordUtil.updateGameObjectsScreenshotsPath(gameFolderName);
    }

    @Then("Validate if Lucky Emeralds game launched in new window")
    public void validateIfLuckyEmeraldsGameLaunchedInNewWindow() {
        try {
            modules.LegacyOfDead.validateIfGameLaunchedInNewWindow(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User turn off the audio for Lucky Emeralds game")
    public void userTurnOffTheAudioForLuckyEmeraldsGame() {
        try {
            modules.LegacyOfDead.turnOffTheAudio(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User clicks on continue button in Lucky Emeralds game")
    public void userClicksOnContinueButtonInLuckyEmeraldsGame() {
        try {
            modules.LegacyOfDead.clickOnContinueBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User selects minimum bet for Lucky Emeralds game")
    public void userSelectsMinimumBetForLuckyEmeraldsGame() {
        try {
            modules.LuckyEmeralds.selectsMinBet(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("Validate if minimum bet is selected for Lucky Emeralds game")
    public void validateIfMinimumBetIsSelectedForLuckyEmeraldsGame() {
        try {
            modules.QOTPMegaCash.validateIfLowestBetIsSelected(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User clicks on spin button for Lucky Emeralds game")
    public void userClicksOnSpinButtonForLuckyEmeraldsGame() {
        try {
            modules.LeprechaunsLuckCC.clickOnSpinBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

}

