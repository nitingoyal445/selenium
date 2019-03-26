#Author: KNT_SM_RK

Feature: This is a Hotel Booking Page

  Scenario: Verify Hotel Booking page title.
    Given User open the web browser.
    And Open the hotelbooking.html page.
    Then validate the page title as "Hotel Booking".
    
    
   Scenario: Ensure the alert box is displayed.
    Given User open the web browser.
    And  Open the hotelbooking.html page.
    When Confirm Booking button is clicked without entering the First Name in the text box.
    Then validate the error message as "Please fill the First Name".
    

       
   Scenario: Ensure the alert box is displayed.
    Given User open the web browser.
    And  Open the hotelbooking.html page.
    When Confirm Booking button is clicked without entering the Last Name in the text box.
    Then validate the error message as "Please fill the Last Name".
    
       Scenario: Ensure the alert box is displayed.
    Given User open the web browser.
    And  Open the hotelbooking.html page.
    When Confirm Booking button is clicked without entering the correct email format in the text box.
    Then validate the error message as "Please enter valid Email Id.".
    
      Scenario: Ensure the alert box is displayed.
    Given User open the web browser.
    And  Open the hotelbooking.html page.
    When Confirm Booking button is clicked without entering the Mobile Number in the text box.
    Then validate the error message as "Please fill the Mobile No.".
    
    Scenario: Ensure the alert box is displayed.
    Given User open the web browser.
    And  Open the hotelbooking.html page.
    When Confirm Booking button is clicked without entering the correct Mobile Number format in the text box. 
     #7,8 or 9 and doesn’t have 10 digits in the text box.
    Then validate the error message as "Please enter valid Contact no.".
    
      
      Scenario: Ensure the alert box is displayed.
    Given User open the web browser.
    And  Open the hotelbooking.html page.
    When Confirm Booking button is clicked without selecting the Number of people statying at the hotel.
    Then validate the error message as "Number of people attending.".
    
     Scenario: Ensure the alert box is displayed.
    Given User open the web browser.
    And  Open the hotelbooking.html page.
    When Confirm Booking button is clicked without selecting the city.
    Then validate the error message as "Please select city".
    
    Scenario: Ensure the alert box is displayed.
    Given User open the web browser.
    And  Open the hotelbooking.html page.
    When Confirm Booking button is clicked without selecting the state.
    Then validate the error message as "Please select state".
    
     Scenario: Ensure the alert box is displayed.
    Given User open the web browser.
    And  Open the hotelbooking.html page.
    When Confirm Booking button is clicked without entering the Card Holder Name in the text box.
    Then validate the error message as "Please fill the Card holder name".
    
      Scenario: Ensure the alert box is displayed.
    Given User open the web browser.
    And  Open the hotelbooking.html page.
    When Confirm Booking button is clicked without entering the Debit card Number in the text box.
    Then validate the error message as "Please fill the Debit card Number".
    
    
      Scenario: Ensure the alert box is displayed.
    Given User open the web browser.
    And  Open the hotelbooking.html page.
    When Confirm Booking button is clicked without entering the Card expiration month in the text box.
    Then validate the error message as "Please fill expiration month".
    
    Scenario: Ensure the alert box is displayed.
    Given User open the web browser.
    And  Open the hotelbooking.html page.
    When Confirm Booking button is clicked without entering the Card expiration year in the text box.
    Then validate the error message as "Please fill expiration year".
    
        Scenario: Navigates to Success Page.
    Given User open the web browser.
    And  Open the hotelbooking.html page.
    When Confirm Booking button is clicked.
    Then move to the next page with title as "Payment Details"
    
    