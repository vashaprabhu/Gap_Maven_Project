
@tag
Feature: Gap Login Feature

  @tag1
  Scenario Outline: userlogsin with valid credentials
    Given User launches the loginpage
    When User enters "<username>" and "<password>"
		When User clicks on login button
		Then User should land on HomePage

    Examples: 
      | username                |		 password 			|
      | varshaks14@gmail.com 		|    Varsha@123			|
      #| varshaks14@gmail.com    |    varsha@123			|
