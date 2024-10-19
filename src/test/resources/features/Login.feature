@myLibrary
Feature:
  Library login features

  User story:
  As a user, I should be able to login with correct credentials to
  different accounts. And dashboard should be displayed.
#this is the first scenario
  @library
  Scenario:Login to librarian
    Given user is on the login page of the library application
    When user enters librarian username
    And user enters correct password
    Then user should see the dashboard
    #this is the second scenario
  Scenario:Login to librarian
    Given user is on the login page of the library application
    When user enters librarian username
    And user enters correct password
    Then user should see the dashboard
@student
  Scenario:Login as student
    Given user is on the login page of the library application
    When user enters student username
    And user enters student password
    Then user should see the dashboard
    #this is the second scenario
  @admin
  Scenario:Login as admin
    Given user is on the login page of the library application
    When user enters admin username
    And user enters admin password
    Then user should see the dashboard

