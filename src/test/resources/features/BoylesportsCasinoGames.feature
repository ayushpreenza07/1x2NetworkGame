@BoyleSport @CasinoPage
Feature: Casino game page

  @Web @MegaFire
  Scenario: Playing the Mega Fire game and place a bet for Valid Login Credentials
    When Navigate to the boyle url
    Then Enter the Boyle login credentials
    Then User choose the mega fire blaze game
    And User navigates to game window
    Then User click on play icon for mfb
    Then User place the minimum bet for mfb
    Then User spin and try his luck in mfb

  @Web @GodOfStorms2
  Scenario: Playing the AOTG God of storms 2 cash collect game and place a bet for Valid Login Credentials
    When Navigate to the boyle url
    Then Enter the Boyle login credentials
    Then User choose the AOTG god of storms 2 game
    And User navigates to game window
    And  User click on play icon for AOTG
    Then User place the minimum bet for AOTG
    And User spin and try his luck in AOTG

  @Web @GodOfStorms
  Scenario Outline: Playing the AOTG God of storms cash collect game and place a bet for Valid Login Credentials
    And Navigate to the boyle url
    When Enter the Boyle login credentials
    And User search for "<GameName>" inside Casino search bar
    And User clicks on the desired game inside Casino search result
    And User navigates to game window
    Then Validate if AOTG God of Storms game launched in new window
    And User clicks on Continue button inside AOTG God of Storms game
    Then Validate if minimum bet is pre-selected for AOTG God of Storms game
    When User clicks on Spin button inside AOTG God of Storms game
    Then Validate if the balance is updated
    Examples:
      | GameName                      |
      | Age of the Gods God of Storms |

  @Web @AOTGGodOfStormsIII
  Scenario Outline: Playing the AOTG God of storms 3 cash collect game and place a bet for Valid Login Credentials
    And Navigate to the boyle url
    When Enter the Boyle login credentials
    And User search for "<GameName>" inside Casino search bar
    And User clicks on the desired game inside Casino search result
    And User navigates to game window
    Then Validate if AOTG God of storms III game launched in new window
    And User clicks on Continue button inside AOTG God of storms III game
    And User selects minimum bet for AOTG God of storms III game
    And User clicks on confirm button for AOTG God of storms III game
    Then Validate if minimum bet is selected for AOTG God of storms III game
    When User clicks on Spin button inside AOTG God of storms III game
    Then Validate if the balance is updated
    Examples:
      | GameName                        |
      | Age of the Gods God of Storms 3 |

  @Web @AOTGKingOfOlympusMegaways
  Scenario Outline: Playing the Age of the Gods King of Olympus Megaways game and place a bet for Valid Login Credentials
    And Navigate to the boyle url
    When Enter the Boyle login credentials
    And User search for "<GameName>" inside Casino search bar
    And User clicks on the desired game inside Casino search result
    And User navigates to game window
    Then Validate if AOTG King of Olympus Megaways game launched in new window
    When User clicks on play button inside AOTG King of Olympus Megaways game
    And User selects the minimum bet for AOTG King of Olympus Megaways game
    Then Validate if minimum bet is selected for AOTG King of Olympus Megaways game
    When User clicks on spin button inside AOTG King of Olympus Megaways game
    Then Validate if the balance is updated
    Examples:
      | GameName                                 |
      | Age of the Gods King of Olympus Megaways |

  @Web @QOTPMegaCash
  Scenario Outline: Playing the Queen of the Pyramids Mega Cash Collect game and place a bet for Valid Login Credentials
    And Navigate to the boyle url
    When Enter the Boyle login credentials
    And User search for "<GameName>" inside Casino search bar
    And User clicks on the desired game inside Casino search result
    And User navigates to game window
    Then Validate if QOTP Mega Cash game launched in new window
    When User clicks on play button inside QOTP Mega Cash game
    And User selects the minimum bet for QOTP Mega Cash game
    Then Validate if minimum bet is selected for QOTP Mega Cash game
    When User clicks on spin button inside QOTP Mega Cash game
    Then Validate if the balance is updated
    Examples:
      | GameName                                |
      | Queen of the Pyramids Mega Cash Collect |

  @Web @SilentSamuraiMegaCashCollect
  Scenario Outline: Playing the Silent Samurai Mega Cash Collect game and place a bet for Valid Login Credentials
    And Navigate to the boyle url
    When Enter the Boyle login credentials
    And User search for "<GameName>" inside Casino search bar
    And User clicks on the desired game inside Casino search result
    And User navigates to game window
    Then Validate if Silent Samurai Mega Cash Collect game launched in new window
    When User clicks on play button in Silent Samurai Mega Cash Collect game
    And User selects the minimum bet for Silent Samurai Mega Cash Collect game
    Then Validate if minimum bet is selected for Silent Samurai Mega Cash Collect game
    When User clicks on spin button inside Silent Samurai Mega Cash Collect game
    Then Validate if the balance is updated
    Examples:
      | GameName                         |
      | Silent Samurai Mega Cash Collect |

  @Web @BlueWizard
  Scenario Outline: Playing the Blue Wizard game and place a bet for Valid Login Credentials
    And Navigate to the boyle url
    When Enter the Boyle login credentials
    And User search for "<GameName>" inside Casino search bar
    And User clicks on the desired game inside Casino search result
    And User navigates to game window
    Then Validate if Blue Wizard game launched in new window
    When User clicks on start button on Blue Wizard game
    And User selects minimum bet on Blue Wizard game
    Then Validate if minimum bet is selected for Blue Wizard game
    When User clicks on spin button in Blue Wizard game
    Then Validate if the balance is updated
    Examples:
      | GameName    |
      | Blue Wizard |

  @Web @HalloweenFortune
  Scenario Outline: Playing the Halloween Fortune game and place a bet for Valid Login Credentials
    And Navigate to the boyle url
    When Enter the Boyle login credentials
    And User search for "<GameName>" inside Casino search bar
    And User clicks on the desired game inside Casino search result
    And User navigates to game window
    Then Validate if Halloween Fortune game launched in new window
    When User selects minimum bet on Halloween Fortune game
    Then Validate if minimum bet is selected for Halloween Fortune game
    When User clicks on spin button in Halloween Fortune game
    Then Validate if the balance is updated
    Examples:
      | GameName          |
      | Halloween Fortune |

  @Web @FootballCashCollect
  Scenario Outline: Playing the Football Cash Collect game and place a bet for Valid Login Credentials
    And Navigate to the boyle url
    When Enter the Boyle login credentials
    And User search for "<GameName>" inside Casino search bar
    And User clicks on the desired game inside Casino search result
    And User navigates to game window
    Then Validate if Football Cash Collect game launched in new window
    When User clicks on play button on Football Cash Collect game
    And User selects minimum bet for Football Cash Collect game
    Then Validate if minimum bet is selected for Football Cash Collect game
    When User clicks on spin button in Football Cash Collect game
    Then Validate if the balance is updated
    Examples:
      | GameName              |
      | Football Cash Collect |

  @Web @LeprechaunsLuckCC
  Scenario Outline: Playing the Leprechauns Luck Cash Collect game and place a bet for Valid Login Credentials
    And Navigate to the boyle url
    When Enter the Boyle login credentials
    And User search for "<GameName>" inside Casino search bar
    And User clicks on the desired game inside Casino search result
    And User navigates to game window
    Then Validate if Leprechauns Luck Cash Collect game launched in new window
    When User turn off the audio for Leprechauns Luck Cash Collect game
    And User clicks on play button inside Leprechauns Luck Cash Collect game
    And User selects minimum bet for Leprechauns Luck Cash Collect game
    Then Validate if minimum bet is selected for Leprechauns Luck Cash Collect game
    When User clicks on spin button in Leprechauns Luck Cash Collect game
    Then Validate if the balance is updated
    Examples:
      | GameName                      |
      | Leprechauns Luck Cash Collect |

  @Web @LuckyEmeralds
  Scenario Outline: Playing Lucky Emeralds game and place a bet for Valid Login Credentials
    And Navigate to the boyle url
    When Enter the Boyle login credentials
    And User search for "<GameName>" inside Casino search bar
    And User clicks on the desired game inside Casino search result
    And User navigates to game window
    Then Validate if Lucky Emeralds game launched in new window
    When User turn off the audio for Lucky Emeralds game
    And User clicks on continue button in Lucky Emeralds game
    And User selects minimum bet for Lucky Emeralds game
    Then Validate if minimum bet is selected for Lucky Emeralds game
    When User clicks on spin button for Lucky Emeralds game
    Then Validate if the balance is updated
    Examples:
      | GameName       |
      | Lucky Emeralds |

  @Web @GoldHitOReillysCharms
  Scenario Outline: Playing Gold Hit: O Reillys Charms game and place a bet for Valid Login Credentials
    And Navigate to the boyle url
    When Enter the Boyle login credentials
    And User search for "<GameName>" inside Casino search bar
    And User clicks on the desired game inside Casino search result
    And User navigates to game window
    Then Validate if Gold Hit: O Reillys Charms game launched in new window
    When User turn off the audio for Gold Hit: O Reillys Charms game
    And User clicks on play button in Gold Hit: O Reillys Charms game
    And User selects minimum bet in Gold Hit: O Reillys Charms game and close the popup
    Then Validate if minimum bet is selected for Gold Hit: O Reillys Charms game
    When User clicks on spin button for Gold Hit: O Reillys Charms game
    When User clicks on spin button for Gold Hit: O Reillys Charms game
    Then Validate if the balance is updated
    Examples:
      | GameName                   |
      | Gold Hit: O Reillys Charms |

  @Web @SaharaRichesMegaWaysCashCollect
  Scenario Outline: Playing Sahara Riches Megaways Cash Collect game and place a bet for Valid Login Credentials
    And Navigate to the boyle url
    When Enter the Boyle login credentials
    And User search for "<GameName>" inside Casino search bar
    And User clicks on the desired game inside Casino search result
    And User navigates to game window
    Then Validate if Sahara Riches Megaways Cash Collect game launched in new window
    When User clicks on play button in Sahara Riches Megaways Cash Collect game
    And User selects the minimum bet from the bet selector popup in Sahara Riches Megaways Cash Collect game
    Then Validate if minimum bet is selected for Sahara Riches Megaways Cash Collect game
    When User clicks on spin button in Sahara Riches Megaways Cash Collect game
    Then Validate if the balance is updated
    Examples:
      | GameName                            |
      | Sahara Riches Megaways Cash Collect |

  @Web @FireBlazeBlueWizardPowerPlayJackpot
  Scenario Outline: Playing Fire Blaze: Blue Wizard PowerPlay Jackpot game and place a bet for Valid Login Credentials
    And Navigate to the boyle url
    When Enter the Boyle login credentials
    And User search for "<GameName>" inside Casino search bar
    And User clicks on the desired game inside Casino search result
    And User navigates to game window
    Then Validate if Fire Blaze Blue Wizard PowerPlay Jackpot game launched in new window
    When User clicks on start button on Fire Blaze: Blue Wizard PowerPlay Jackpot game
    And User selects minimum bet on Fire Blaze: Blue Wizard PowerPlay Jackpot game with minus button
    Then Validate if minimum bet is selected for Fire Blaze: Blue Wizard PowerPlay Jackpot game
    When User clicks on spin button in Fire Blaze: Blue Wizard PowerPlay Jackpot game
    Then Validate if the balance is updated
    Examples:
      | GameName                                  |
      | Fire Blaze: Blue Wizard PowerPlay Jackpot |