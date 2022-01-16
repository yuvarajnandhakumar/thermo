@thermofisher
Feature: Flipkart Automation

@accountcreation
  Scenario: Login into flipkart application
    Given Launch chromebrowser
    Then Click on Createaccount button
    Then bookmark the cookies

  
  
  @accountcreation
  Scenario Outline: Login into flipkart application
    Given Launch chromebrowser
    Then Click on Createaccount button for "<country>"
    Then bookmark the cookies
    
    Examples:
    |country|
    |IN|