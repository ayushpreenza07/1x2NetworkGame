package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

public class KingKongCashEBBJKing extends KeywordUtil {

    static Class<KingKongCashEBBJKing> thisClass = KingKongCashEBBJKing.class;
    String gameFolderName = thisClass.getSimpleName();
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = KeywordUtil.updateGameObjectsScreenshotsPath(gameFolderName);
    }

    @And("User clicks on the screen for King Kong CEBB Jackpot King")
    public void userClicksOnTheScreenForKingKongCEBBJackpotKing() {
        try {
            modules.KingKongCashEBBJKing.clickOnPlayBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("User selects the minimum bet for King Kong CEBB Jackpot King")
    public void userSelectsTheMinimumBetForKingKongCEBBJackpotKing() {
        try {
            modules.KingKongCashEBBJKing.selectLowestBet(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("User clicks on spin button for King Kong CEBB Jackpot King")
    public void userClicksOnSpinButtonForKingKongCEBBJackpotKing() {
        try {
            modules.KingKongCashEBBJKing.clickOnSpinBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

}

