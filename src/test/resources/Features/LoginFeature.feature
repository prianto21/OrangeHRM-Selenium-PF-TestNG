Feature: Test Login functionality

  Scenario : check login is successful with valid credentialss
    Given browser "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And user is on login pagee
    When user enters username "Admin" and password "admin123"
    And user click on loginn
    Then user is navigate to the home pages