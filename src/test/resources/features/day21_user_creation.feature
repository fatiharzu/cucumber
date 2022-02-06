#Homework Due Saturday

Feature: user_creation_feature

  Scenario: login_with_admin_credentials
    Given user is on the login page
    And user clicks on login dropdown
    And user clicks on sign in button
    And user enters admin_id and admin_password
      |admin_username|admin_password|
      | CWoburn  | Cw192837?      |
    And user clicks on the login button

    # To use background for login
  Scenario Outline: creating_new_user
    Given admin clicks user management
    And admin clicks the button to create a user
    And admin enters "<login>" for login
    And admin enters "<firstname>" for firstname and "<lastname>" for lastname
    And admin sends  email as "<email>"
    And admin select language english
    And admin select profile ROLE_USER
    And admin enter save button




    And user clicks Save button
    Examples:
      | login | firstname | lastname | email              |
      | baApolera  | baApolera      | baadumen   |baapolerduman@amail.com|