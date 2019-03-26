#Author: KNT_SM_RK

Feature: This is a Hotel Login Page

  Scenario: Verify login page heading.
    Given User open the web browser.
    And Open the Login.html page.
    Then validate the page heading as "Hotel Booking Application".
    
     Scenario: Ensure the error message is displayed.
    Given User open the web browser.
    And Open the Login.html page.
    When Login button is clicked without entering the UserName in the text box.
    Then validate the error message as "Please enter UserName".
    
     Scenario: Ensure the error message is displayed.
    Given User open the web browser.
    And Open the Login.html page.
    When Login button is clicked without entering the Password in the text box.
    Then validate the error message as "Please enter Password".
    
    Scenario: On Entering valid username and password,Login successful. 
    Given User open the web browser.
    And Open the Login.html page.
    When UserName as "Capgemini" and Password as "capg1234" is entered, 
    Then move to the next page with title as "Hotel Booking"
    
    