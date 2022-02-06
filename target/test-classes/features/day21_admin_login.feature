@admin_login @smoke
  Feature: admin login feature

    Scenario: login_with_admin_creadentials

      Given user is on the login page
      And user clicks on login dropdown
      And user clicks on sign in button
      And user enters admin_id and admin_password
        |admin_username|admin_password|
        |CWoburn       |Cw192837?     |
      And user clicks on the login button
      Then verify succesful login
      When close the application
      # Data tables
        #They are used to provide data --- DDT (Data Driven Testing technique wit cucumber)
        #They are similar to Scenario Outline
        #Difference is Example Keyword -- For Data Table no usage for Example
       # We need to store the data coming from Feature file in a Data Collection like List or List of Map