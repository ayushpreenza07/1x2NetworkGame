package commons;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class Constants {

    public static Constants constants = new Constants();
    private String balanceBeforeBetStr;
    private String balanceAfterBetStr;
    private String netPositionText;

    public String getBalanceBeforeBetStr() {
        return balanceBeforeBetStr;
    }

    public void setBalanceBeforeBetStr(String balanceBeforeBetStr) {
        this.balanceBeforeBetStr = balanceBeforeBetStr;
    }

    public String getBalanceAfterBetStr() {
        return balanceAfterBetStr;
    }

    public void setBalanceAfterBetStr(String balanceAfterBetStr) {
        this.balanceAfterBetStr = balanceAfterBetStr;
    }

    public String getNetPositionText() {
        return netPositionText;
    }

    public void setNetPositionText(String netPositionText) {
        this.netPositionText = netPositionText;
    }

    //--------------------------------------- M1 Constants Variables ------------------------------------------------
    public static final String HEADER_SPORTS_URL = "https://m1.boylesports.com/";
    public static final String HEADER_CASINO_URL = "https://games1.boylesports.com/Casino";
    public static final String HEADER_LIVE_CASINO_URL = "https://games1.boylesports.com/Live-Casino";
    public static final String HEADER_GAMES_URL = "https://games1.boylesports.com/";
    public static final String HEADER_BINGO_URL = "https://bingo1.boylesports.com/";
    public static final String HEADER_POKER_URL = "https://poker1.boylesports.com/";
    public static final String HEADER_LOTTO_URL = "https://lotto1.boylesports.com/";
    public static final String GAMES_PROMOTION_URL = "https://games1.boylesports.com/promotions-and-offers";

    //--------------------------------------- PROD Constants Variables ------------------------------------------------
//    public static final String HEADER_SPORTS_URL = "https://boylesports.com/";
//    public static final String HEADER_CASINO_URL = "https://casino.boylesports.com/";
//    public static final String HEADER_LIVE_CASINO_URL = "https://livecasino.boylesports.com/";
//    public static final String HEADER_BINGO_URL = "https://bingo.boylesports.com/";
//    public static final String HEADER_POKER_URL = "https://poker.boylesports.com/";
//    public static final String HEADER_LOTTO_URL = "https://lotto.boylesports.com/";
//    public static final String GAMES_PROMOTION_URL = "https://games.boylesports.com/promotions-and-offers";

    //-------------------------------------- FOR BOTH M1 AND PROD -----------------------------------------------------
    public static final String FACEBOOK_PAGE_URL = "https://www.facebook.com/boylesports";
    public static final String TWITTER_PAGE_URL = "https://x.com/boylesports";
    public static final String YOUTUBE_PAGE_URL = "https://www.youtube.com/user/betBoylesports";
    public static final String GOOGLE_PLAY_STORE_PAGE_URL = "https://play.google.com/store/apps/details?id=com.cgsi.boylesportsnew";
    public static final String BOYLE_HELP_PAGE_HEADER = "https://support.boylesports.com/";
    public static final String FOOTER_ABOUT_US_PAGE_URL = "https://m1.boylesports.com/about-us";
    public static final String FOOTER_SHOP_LOCATOR_PAGE_URL = "https://m1.boylesports.com/ShopLocator/Index";
    public static final String FOOTER_JOBS_PAGE_URL = "https://jobs.boylesports.com/";
    public static final String FOOTER_RULE_BOOK_PAGE_URL = "https://m1.boylesports.com/Home/RuleBook";
    public static final String FOOTER_AFFILIATES_PAGE_URL = "https://affiliates.boylesports.com";
    public static final String FOOTER_BE_RESPONSIBLE_PAGE_URL = "https://m1.boylesports.com/Home/ResponsibleGambling";
    public static final String FOOTER_PRIVACY_POLICY_PAGE_URL = "https://m1.boylesports.com/Home/PrivacyAndTerms";
    public static final String FOOTER_FON_A_BET_PAGE_URL = "https://m1.boylesports.com/Home/FonABet";
    public static final String FOOTER_TERMS_CONDITION_PAGE_URL = "https://m1.boylesports.com/Home/TermsandConditions";
    public static final String FOOTER_HELP_PAGE_URL = "https://support.boylesports.com/hc/en-us";
    public static final String FOOTER_GAMBLING_COMMISSION_PAGE_URL = "https://www.gamblingcommission.gov.uk/public-register/business/detail/39469";
    public static final String FOOTER_GIBRALTAR_GAMBLING_COMMISSIONER_URL = "https://www.gibraltar.gov.gi/finance-gaming-and-regulations/remote-gambling";
    public static final String FOOTER_ONLINE_DISPUTE_RESOLUTION_URL = "https://ec.europa.eu/consumers/odr/main/index.cfm?event=main.home.chooseLanguage";
    public static final String FOOTER_GAME_FAIRNESS_PAGE_URL = "https://m1.boylesports.com/home/gamefairness?source=games";
    public static final String FOOTER_UNDERAGE_PAGE_URL = "https://m1.boylesports.com/home/responsiblegambling";
    public static final String FOOTER_IBAS_PAGE_URL = "https://ibas-uk.com";
    public static final String FOOTER_GAMCARE_PAGE_URL = "https://www.gamcare.org.uk";
    public static final String FOOTER_GAMBLING_CARE_PAGE_URL = "https://gamblingcare.ie";
    public static final String FOOTER_BE_GAMBLE_AWARE_URL = "https://www.gambleaware.org";
    public static final String FOOTER_GAMSTOP_PAGE_URL = "https://www.gamstop.co.uk";

}
