@register @smoke
Feature: User Gives Creadentials For Registering
  Scenario Outline: User Register
    Given User is on register page
    When user sends ssn "<Ssn>"
    And user sends firstname as "<firstname>" and lastname as "<lastname>"
    And user sends address as "<address>"
    And user sends phone number as "<phone_number>"
    And user sends username as "<username>"
    And user sends  email as "<email>"
    And user sends new password as "<newPassword>"
    And user sends second password as "<passwordConfirmation>"
    And user clicks register button
    Then user see pop up "<message>"
    Then user close application

    Examples:
    |Ssn        |firstname|lastname|address  |phone_number |username    |email             |newPassword|passwordConfirmation|message                |
    |676-77-4405|New User |last    |Milky way|456-279-5588 |utilisate123|adsdqpgwer2hd@gmail.com|Utilisateur123.|Utilisateur123.|successfully registered|