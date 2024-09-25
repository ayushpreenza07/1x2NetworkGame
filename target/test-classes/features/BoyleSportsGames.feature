@BoyleSport @GamesPage
Feature: Games page

  Background:
    Given Navigate to the "prod" boylesports url
    When User accepts the cookies
    And User clicks on Games tab from header
    And user clicks the Login button
    And Enter the Boyle Games login credentials

  @Web @CrabbingForCash
  Scenario Outline: Validate if user is able to place bet in Crabbin For Cash Extra Big Catch Jackpot King cash collect game
    And Enter game name "<GameName>" in search bar
    And select game
    And User navigates to game window
    Then Validate if Crabbin For Cash Extra Big Catch Jackpot King Cash Collect game launched in new window
    When User click on play icon for Crabbin cash
    And User place the minimum bet for Crabbin cash
    And User click on spin button in Crabbin For Cash Extra Big Catch JK game
    Then Validate if the balance is updated
    Examples:
      | GameName                                      |
      | Crabbin For Cash Extra Big Catch Jackpot King |

  @Web @BookOfDead
  Scenario Outline: Validate if user is able to place bet in Book of Dead game
    And Enter game name "<GameName>" in search bar
    And select game
    And User navigates to game window
    And User click on play icon for book of dead
    And  User place the minimum bet for book of dead
    And User click on spin button in Book of Dead game
    Then Validate if the balance is updated
    Examples:
      | GameName     |
      | Book of Dead |

  @Web @LegendOfLure @ProneToFail
  Scenario Outline: Playing the Legend of the Lure cash collect game and place a bet for Valid Login Credentials
    And Enter game name "<GameName>" in search bar
    And select game
    And User navigates to game window
    And User click on play icon for legends lure
    And User place the minimum bet for legends
    And User click on spin button in Legend of Lure game
    Then Validate if the balance is updated
    Examples:
      | GameName            |
      | Legends of the Lure |

  @Web @ImmortalWays88Charms
  Scenario Outline: Validate if user is able to place bet in Immortal Ways 88 Charms game
    And Enter game name "<GameName>" in search bar
    And select game
    And User navigates to game window
    Then Validate if Immortal Ways Charms game is launched in new window
    And User click on Start button inside Immortal Ways Charms game
    And User place the minimum bet for Immortal Ways Charms game
    Then User clicks on Spin button in Immortal Ways Charms game
    Then Validate if the balance is updated
    Examples:
      | GameName                |
      | immortal ways 88 charms |

  @Web @SaintNicked
  Scenario Outline: Validate if user is able to place bet in Saint Nicked game
    And Enter game name "<GameName>" in search bar
    And select game
    And User navigates to game window
    And User click on Start button inside Saint Nicked game
    And User click on skip button inside Saint Nicked game
    And User selects the minimum bet for Saint Nicked game
    Then Validate if minimum bet is selected
    When User click on Spin button inside Saint Nicked game
    Then Validate if the balance is updated
    Examples:
      | GameName     |
      | Saint Nicked |

  @Web @FishinFrenzyTheBigCatch
  Scenario Outline: Validate if user is able to place bet in Fishin Frenzy The Big Catch game
    And Enter game name "<GameName>" in search bar
    And select game
    And User navigates to game window
    And User click on Play button inside Fishin Frenzy The Big Catch game
    And User selects the minimum bet for Fishin Frenzy The Big Catch game
    And User turn off the audio for Fishin Frenzy The Big Catch game
    Then Validate if minimum bet is selected for Fishin Frenzy The Big Catch game
    When User click on Spin button inside Fishin Frenzy The Big Catch game game
    Then Validate if the balance is updated
    Examples:
      | GameName                    |
      | Fishin Frenzy The Big Catch |

  @Web @FishinFrenzyEvenBiggerCatchJK
  Scenario Outline: Validate if user is able to place bet in Fishin Frenzy Even Bigger Catch Jackpot King game
    And Enter game name "<GameName>" in search bar
    And select game
    And User navigates to game window
    Then Validate if Fishin Frenzy Even Bigger Catch Jackpot King game is launched in new window
    And User click on Play button inside Fishin Frenzy Even Bigger Catch Jackpot King game
    And User selects the minimum bet for Fishin Frenzy Even Bigger Catch Jackpot King game
    Then Validate if minimum bet is selected for Fishin Frenzy Even Bigger Catch Jackpot King game
    When User click on Spin button inside Fishin Fishin Frenzy Even Bigger Catch Jackpot King game
    Then Validate if the balance is updated
    Examples:
      | GameName                                     |
      | Fishin Frenzy Even Bigger Catch Jackpot King |

  @Web @FishinFrenzyChristmas
  Scenario Outline: Validate if user is able to place bet in Fishin Frenzy Christmas game
    And Enter game name "<GameName>" in search bar
    And select game
    And User navigates to game window
    Then Validate if Fishin Frenzy Christmas game is launched in new window
    And User click on play button in Fishin Frenzy Christmas game
    And User turn off the audio for Fishin Frenzy Christmas game
    And User selects the minimum bet in Fishin Frenzy Christmas game
    Then Validate if minimum bet is selected for Fishin Frenzy Christmas game
    When User click on Spin button in Fishin Frenzy Christmas game
    Then Validate if the balance is updated
    Examples:
      | GameName                |
      | Fishin Frenzy Christmas |

  @Web @StarBurst
  Scenario Outline: Validate if user is able to place bets in Star Burst
    And Enter game name "<GameName>" in search bar
    And select game
    And User navigates to game window
    And User clicks on continue button inside Star burst game
    And User selects the minimum bet inside Star burst game
    Then Validate if minimum bet is selected inside Star burst game
    When User clicks on spin button inside Star burst game
    Then Validate if the balance is updated
    Examples:
      | GameName  |
      | starburst |

  @Web @SantasStack @ProneToFail
  Scenario Outline: Validate if user is able to place bets in Santas Stack game
    And Enter game name "<GameName>" in search bar
    And select game
    And User navigates to game window
    Then Validate if Santas Stack game launched in new window
    When User clicks on Click to continue button inside Santas Stack game
    Then Validate if minimum bet is pre-selected for Santas Stack game
    When User click on Spin button inside Santas Stack game
    Then Validate if the balance is updated
    Examples:
      | GameName     |
      | Santas Stack |

  @Web @LegacyOfDead
  Scenario Outline: Validate if user is able to place bets in Legacy of Dead game
    And Enter game name "<GameName>" in search bar
    And select game
    And User navigates to game window
    Then Validate if Legacy of Dead game is launched in new window
    When User clicks on continue button inside Legacy of Dead game
    And User turn off the audio for Legacy of Dead game
    And User selects minimum bet for Legacy of Dead game
    And User clicks on spin button inside Legacy of Dead game
    Then Validate if the balance is updated
    Examples:
      | GameName       |
      | Legacy of Dead |

  @Web @KKCEBiggerBananasJK
  Scenario Outline: Validate if user is able to place bet in King Kong Cash Even Bigger Bananas Jackpot King game
    And Enter game name "<GameName>" in search bar
    And select game
    And User navigates to game window
    And User clicks on the screen for King Kong CEBB Jackpot King
    And User selects the minimum bet for King Kong CEBB Jackpot King
    And User clicks on spin button for King Kong CEBB Jackpot King
    Then Validate if the balance is updated
    Examples:
      | GameName                                        |
      | King Kong Cash Even Bigger Bananas Jackpot King |

  @Web @KingKongCGBJackpotKing
  Scenario Outline: Validate if user is able to place bets in King Kong Cash Go Bananas Jackpot King game
    And Enter game name "<GameName>" in search bar
    And select game
    And User navigates to game window
    Then Validate if King Kong Cash Go Bananas Jackpot King game launched in new window
    When User clicks on the screen for King Kong Cash Go Bananas Jackpot King
    And User selects the minimum bet for King Kong Cash Go Bananas Jackpot King
    Then Validate if minimum bet is selected for King Kong Cash Go Bananas Jackpot King
    And User clicks on spin button for King Kong Cash Go Bananas Jackpot King
    Then Validate if the balance is updated
    Examples:
      | GameName                               |
      | King Kong Cash Go Bananas Jackpot King |

  @Web @CrabbingForChristmasJK
  Scenario Outline: Validate if user is able to place bets in Crabbin For Cash Extra Big Catch Jackpot King cash collect game
    And Enter game name "<GameName>" in search bar
    And select game
    And User navigates to game window
    Then Validate if Crabbin for Christmas Jackpot King game launched in new window
    And User clicks on play icon for Crabbin for Christmas Jackpot King game
    Then User place the minimum bet for Crabbin cash
    Then User selects the minimum bet for Crabbin for Christmas Jackpot King game
    Then User clicks on spin button for Crabbin for Christmas Jackpot King game
    Then Validate if the balance is updated
    Examples:
      | GameName                           |
      | Crabbin for Christmas Jackpot King |

  @Web @GoldCashFreeSpins
  Scenario Outline: Validate if user is able to place bets in Gold Cash Free Spins game
    And Enter game name "<GameName>" in search bar
    And select game
    And User navigates to game window
    Then Validate if Gold Cash Free Spins game launched in new window
    When User clicks on Click screen to continue button in Gold Cash Free Spins game
    And User selects minimum bet for Gold Cash Free Spins game
    Then Validate if minimum bet is selected in Gold Cash Free Spins game
    When User clicks on spin button in Gold Cash Free Spins game
    Then Validate if the balance is updated
    Examples:
      | GameName             |
      | Gold Cash Free Spins |

  @Web @LuckOTheIrishGoldSFPJKing @ProneToFail
  Scenario Outline: Playing the Luck O the Irish Gold Spins Fortune Play Jackpot King game and place a bet for Valid Login Credentials
    And Enter game name "<GameName>" in search bar
    And select game
    And User navigates to game window
    Then Validate if Luck O the Irish Gold Spins Fortune Play Jackpot King game launched in new window
    When User clicks on play button for Luck O the Irish Gold Spins Fortune Play Jackpot King game
    And User clicks on play button inside tutorial screen for Luck O the Irish Gold Spins Fortune Play Jackpot King game
    And User turn off the audio for Luck O the Irish Gold Spins Fortune Play Jackpot King game
    And User selects minimum bet for Luck O the Irish Gold Spins Fortune Play Jackpot King game
    Then Validate if minimum bet is selected for Luck O the Irish Gold Spins Fortune Play Jackpot King game
    When User clicks on spin button for Luck O the Irish Gold Spins Fortune Play Jackpot King game
    Then Validate if the balance is updated
    Examples:
      | GameName                                              |
      | Luck O The Irish Gold Spins Fortune Play Jackpot King |

  @Web @TheGooniesReturnJKing @ThreeMin
  Scenario Outline: Playing The Goonies Return Jackpot King game and place a bet for Valid Login Credentials
    And Enter game name "<GameName>" in search bar
    And select game
    And User navigates to game window
    Then Validate if The Goonies Return Jackpot King game launched in new window
    When User clicks on play button for The Goonies Return Jackpot King game
    And User clicks on play button inside tutorial screen for The Goonies Return Jackpot King game
    And User clicks on play button inside The Goonies Return Jackpot King game introduction
    And User turn off the audio for The Goonies Return Jackpot King game
    And User selects minimum bet for The Goonies Return Jackpot King game
    Then Validate if minimum bet is selected for The Goonies Return Jackpot King game
    When User clicks on spin button for The Goonies Return Jackpot King game
    Then Validate if the balance is updated
    Examples:
      | GameName                        |
      | The Goonies Return Jackpot King |

  @Web @MoneyCartII
  Scenario Outline: Playing Money Cart 2 game and place a bet for Valid Login Credentials
    And Enter game name "<GameName>" in search bar
    And select game
    And User navigates to game window
    Then Validate if Money Cart II game launched in new window
    When User clicks on Click to continue button inside Money Cart II game
    And User turn off the audio for Money Cart II game
    Then Validate if minimum bet is pre-selected for Money Cart II game
    When User clicks on spin button for Money Cart II game
    Then Validate if the balance is updated
    Examples:
      | GameName     |
      | Money Cart 2 |

  @Web @RickAndMortyWubbaLubbaDDJKing
  Scenario Outline: Playing Rick and Morty Wubba Lubba Dub Dub Jackpot King game and place a bet for Valid Login Credentials
    And Enter game name "<GameName>" in search bar
    And select game
    And User navigates to game window
    Then Validate if Rick and Morty Wubba Lubba Dub Dub Jackpot King game launched in new window
    When User clicks on play button for Rick and Morty Wubba Lubba Dub Dub Jackpot King
    And User clicks on play button inside Rick and Morty Wubba Lubba Dub Dub Jackpot King game introduction
    And User selects minimum bet for Rick and Morty Wubba Lubba Dub Dub Jackpot King game using down button
    Then Validate if minimum bet is selected for Rick and Morty Wubba Lubba Dub Dub Jackpot King game
    When User clicks on spin button for Rick and Morty Wubba Lubba Dub Dub Jackpot King game
    Then Validate if the balance is updated
    Examples:
      | GameName                                        |
      | Rick and Morty Wubba Lubba Dub Dub Jackpot King |

  @Web @EyeOfHorusMegaways
  Scenario Outline: Playing Eye Of Horus Megaways game and place a bet for Valid Login Credentials
    And Enter game name "<GameName>" in search bar
    And select game
    And User navigates to game window
    Then Validate if Eye Of Horus Megaways game launched in new window
    When User clicks on play button for Eye Of Horus Megaways game
    And User selects minimum bet for Eye Of Horus Megaways game using down button
    Then Validate if minimum bet is selected for Eye Of Horus Megaways game
    When User clicks on spin button for Eye Of Horus Megaways game
    Then Validate if the balance is updated
    Examples:
      | GameName              |
      | Eye Of Horus Megaways |

  @Web @GoldenWinner
  Scenario Outline: Playing Golden Winner game and place a bet for Valid Login Credentials
    And Enter game name "<GameName>" in search bar
    And select game
    And User navigates to game window
    Then Validate if Golden Winner game launched in new window
    When User clicks on Touch to continue button in Golden Winner game
    And User selects minimum bet for Golden Winner with Bet button
    Then Validate if minimum bet is selected for Golden Winner game
    When User clicks on spin button for Golden Winner game
    Then Validate if the balance is updated
    Examples:
      | GameName      |
      | Golden Winner |
