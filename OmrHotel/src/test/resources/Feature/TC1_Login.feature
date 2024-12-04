@login
Feature: Verifying OMR Branch Hotel Login Automation

  Scenario Outline: Verifying Login With Valid Credentials
    Given User is on the OMR Branch Hotel Page
    When User login "<UserName>","<Password>"
    Then User should verify Success Message After Login "Welcome Ganesh"

    Examples: 
      | UserName              | Password    |
      | ganesh24124@gmail.com | Ganesh@5798 |

  Scenario Outline: Verifying Login With Valid Credentials Using ENTER Key
    Given User is on the OMR Branch Hotel Page
    When User login "<UserName>","<Password>" with ENTER key
    Then User should verify Success Message After Login "Welcome Ganesh"

    Examples: 
      | UserName              | Password    |
      | ganesh24124@gmail.com | Ganesh@5798 |

  Scenario Outline: Verifying Login With Invalid Credentials
    Given User is on the OMR Branch Hotel Page
    When User login "<UserName>","<Password>" with ENTER key
    Then User should verify Error Message After Login "Invalid Login details or Your Password might have expired"

    Examples: 
      | UserName              | Password   |
      | ganesh24124@gmail.com | Ganesh@123 |
