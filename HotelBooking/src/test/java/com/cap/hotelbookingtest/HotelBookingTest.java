package com.cap.hotelbookingtest;

import static org.junit.Assert.assertEquals;

import com.cap.pages.HotelBookingPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HotelBookingTest {
	HotelBookingPage hotelBookingPage;

	@Given("^User open the web browser\\.$")
	public void user_open_the_web_browser() throws InterruptedException {
		hotelBookingPage = new HotelBookingPage();
	}

	@Given("^Open the hotelbooking\\.html page\\.$")
	public void open_the_hotelbooking_html_page() throws Throwable {
		hotelBookingPage.openHotelBookingPage();
	}

	@Then("^validate the page title as \"([^\"]*)\"\\.$")
	public void validate_the_page_title_as(String arg1) throws InterruptedException{
		assertEquals(arg1, hotelBookingPage.getTitle());
		Thread.sleep(2000);
		hotelBookingPage.quitPage();
	}

	@When("^Confirm Booking button is clicked without entering the First Name in the text box\\.$")
	public void confirm_Booking_button_is_clicked_without_entering_the_First_Name_in_the_text_box(){
		hotelBookingPage.setFirstName("");
		hotelBookingPage.setLastName("lastName");
		hotelBookingPage.setEmail("ravi@gmail.com");
		hotelBookingPage.setPhone("9876543210");
		hotelBookingPage.setCity("Pune");
		hotelBookingPage.setState("Tamilnadu");
		hotelBookingPage.setPersons("2");
		hotelBookingPage.setCardHolderName("Ravi Agrawal");
		hotelBookingPage.setDebit("9876543210321456");
		hotelBookingPage.setCvv("256");
		hotelBookingPage.setMonth("12");
		hotelBookingPage.setYear("2026");
		hotelBookingPage.clickConfirmButton();
	}

	@When("^Confirm Booking button is clicked without entering the Last Name in the text box\\.$")
	public void confirm_Booking_button_is_clicked_without_entering_the_Last_Name_in_the_text_box() throws Throwable {

		hotelBookingPage.setFirstName("firstName");
		hotelBookingPage.setLastName("");
		hotelBookingPage.setEmail("ravi@gmail.com");
		hotelBookingPage.setPhone("9876543210");
		hotelBookingPage.setCity("Pune");
		hotelBookingPage.setState("Tamilnadu");
		hotelBookingPage.setPersons("2");
		hotelBookingPage.setCardHolderName("Ravi Agrawal");
		hotelBookingPage.setDebit("9876543210321456");
		hotelBookingPage.setCvv("256");
		hotelBookingPage.setMonth("12");
		hotelBookingPage.setYear("2026");
		hotelBookingPage.clickConfirmButton();
	}

	@When("^Confirm Booking button is clicked without entering the correct email format in the text box\\.$")
	public void confirm_Booking_button_is_clicked_without_entering_the_correct_email_format_in_the_text_box()
			throws Throwable {
		hotelBookingPage.setFirstName("firstName");
		hotelBookingPage.setLastName("lastName");
		hotelBookingPage.setEmail("ravigmail.com");
		hotelBookingPage.setPhone("9876543210");
		hotelBookingPage.setCity("Pune");
		hotelBookingPage.setState("Tamilnadu");
		hotelBookingPage.setPersons("2");
		hotelBookingPage.setCardHolderName("Ravi Agrawal");
		hotelBookingPage.setDebit("9876543210321456");
		hotelBookingPage.setCvv("256");
		hotelBookingPage.setMonth("12");
		hotelBookingPage.setYear("2026");
		hotelBookingPage.clickConfirmButton();
	}

	@When("^Confirm Booking button is clicked without entering the Mobile Number in the text box\\.$")
	public void confirm_Booking_button_is_clicked_without_entering_the_Mobile_Number_in_the_text_box()
			throws Throwable {
		hotelBookingPage.setFirstName("firstName");
		hotelBookingPage.setLastName("lastName");
		hotelBookingPage.setEmail("ravi@gmail.com");
		hotelBookingPage.setPhone("");
		hotelBookingPage.setCity("Pune");
		hotelBookingPage.setState("Tamilnadu");
		hotelBookingPage.setPersons("2");
		hotelBookingPage.setCardHolderName("Ravi Agrawal");
		hotelBookingPage.setDebit("9876543210321456");
		hotelBookingPage.setCvv("256");
		hotelBookingPage.setMonth("12");
		hotelBookingPage.setYear("2026");
		hotelBookingPage.clickConfirmButton();
	}

	@When("^Confirm Booking button is clicked without entering the correct Mobile Number format in the text box\\.$")
	public void confirm_Booking_button_is_clicked_without_entering_the_correct_Mobile_Number_format_in_the_text_box()
			throws Throwable {
		hotelBookingPage.setFirstName("firstName");
		hotelBookingPage.setLastName("lastName");
		hotelBookingPage.setEmail("ravi@gmail.com");
		hotelBookingPage.setPhone("123");
		hotelBookingPage.setCity("Pune");
		hotelBookingPage.setState("Tamilnadu");
		hotelBookingPage.setPersons("2");
		hotelBookingPage.setCardHolderName("Ravi Agrawal");
		hotelBookingPage.setDebit("9876543210321456");
		hotelBookingPage.setCvv("256");
		hotelBookingPage.setMonth("12");
		hotelBookingPage.setYear("2026");
		hotelBookingPage.clickConfirmButton();
	}

	@When("^Confirm Booking button is clicked without selecting the Number of people statying at the hotel\\.$")
	public void confirm_Booking_button_is_clicked_without_selecting_the_Number_of_people_statying_at_the_hotel()
			throws Throwable {
		hotelBookingPage.setFirstName("firstName");
		hotelBookingPage.setLastName("lastName");
		hotelBookingPage.setEmail("ravi@gmail.com");
		hotelBookingPage.setPhone("9876543210");
		hotelBookingPage.setCity("Pune");
		hotelBookingPage.setState("Tamilnadu");
		hotelBookingPage.setCardHolderName("Ravi Agrawal");
		hotelBookingPage.setDebit("9876543210321456");
		hotelBookingPage.setCvv("256");
		hotelBookingPage.setMonth("12");
		hotelBookingPage.setYear("2026");
		hotelBookingPage.clickConfirmButton();
	}

	@When("^Confirm Booking button is clicked without selecting the city\\.$")
	public void confirm_Booking_button_is_clicked_without_selecting_the_city() throws Throwable {
		hotelBookingPage.setFirstName("firstName");
		hotelBookingPage.setLastName("lastName");
		hotelBookingPage.setEmail("ravi@gmail.com");
		hotelBookingPage.setPhone("9876543210");
		hotelBookingPage.setState("Tamilnadu");
		hotelBookingPage.setPersons("2");
		hotelBookingPage.setCardHolderName("Ravi Agrawal");
		hotelBookingPage.setDebit("9876543210321456");
		hotelBookingPage.setCvv("256");
		hotelBookingPage.setMonth("12");
		hotelBookingPage.setYear("2026");
		hotelBookingPage.clickConfirmButton();
	}

	@When("^Confirm Booking button is clicked without selecting the state\\.$")
	public void confirm_Booking_button_is_clicked_without_selecting_the_state() throws Throwable {
		hotelBookingPage.setFirstName("firstName");
		hotelBookingPage.setLastName("lastName");
		hotelBookingPage.setEmail("ravi@gmail.com");
		hotelBookingPage.setPhone("9876543210");
		hotelBookingPage.setCity("Pune");
		hotelBookingPage.setPersons("2");
		hotelBookingPage.setCardHolderName("Ravi Agrawal");
		hotelBookingPage.setDebit("9876543210321456");
		hotelBookingPage.setCvv("256");
		hotelBookingPage.setMonth("12");
		hotelBookingPage.setYear("2026");
		hotelBookingPage.clickConfirmButton();
	}

	@When("^Confirm Booking button is clicked without entering the Card Holder Name in the text box\\.$")
	public void confirm_Booking_button_is_clicked_without_entering_the_Card_Holder_Name_in_the_text_box()
			throws Throwable {
		hotelBookingPage.setFirstName("firstName");
		hotelBookingPage.setLastName("lastName");
		hotelBookingPage.setEmail("ravi@gmail.com");
		hotelBookingPage.setPhone("9876543210");
		hotelBookingPage.setCity("Pune");
		hotelBookingPage.setState("Tamilnadu");
		hotelBookingPage.setPersons("2");
		hotelBookingPage.setCardHolderName("");
		hotelBookingPage.setDebit("9876543210321456");
		hotelBookingPage.setCvv("256");
		hotelBookingPage.setMonth("12");
		hotelBookingPage.setYear("2026");
		hotelBookingPage.clickConfirmButton();
	}

	@When("^Confirm Booking button is clicked without entering the Debit card Number in the text box\\.$")
	public void confirm_Booking_button_is_clicked_without_entering_the_Debit_card_Number_in_the_text_box()
			throws Throwable {
		hotelBookingPage.setFirstName("firstName");
		hotelBookingPage.setLastName("lastName");
		hotelBookingPage.setEmail("ravi@gmail.com");
		hotelBookingPage.setPhone("9876543210");
		hotelBookingPage.setCity("Pune");
		hotelBookingPage.setState("Tamilnadu");
		hotelBookingPage.setPersons("2");
		hotelBookingPage.setCardHolderName("Ravi Agrawal");
		hotelBookingPage.setDebit("");
		hotelBookingPage.setCvv("256");
		hotelBookingPage.setMonth("12");
		hotelBookingPage.setYear("2026");
		hotelBookingPage.clickConfirmButton();
	}

	@When("^Confirm Booking button is clicked without entering the Card expiration month in the text box\\.$")
	public void confirm_Booking_button_is_clicked_without_entering_the_Card_expiration_month_in_the_text_box()
			throws Throwable {
		hotelBookingPage.setFirstName("firstName");
		hotelBookingPage.setLastName("lastName");
		hotelBookingPage.setEmail("ravi@gmail.com");
		hotelBookingPage.setPhone("9876543210");
		hotelBookingPage.setCity("Pune");
		hotelBookingPage.setState("Tamilnadu");
		hotelBookingPage.setPersons("2");
		hotelBookingPage.setCardHolderName("Ravi Agrawal");
		hotelBookingPage.setDebit("9876543210321456");
		hotelBookingPage.setCvv("256");
		hotelBookingPage.setMonth("");
		hotelBookingPage.setYear("2026");
		hotelBookingPage.clickConfirmButton();
	}

	@When("^Confirm Booking button is clicked without entering the Card expiration year in the text box\\.$")
	public void confirm_Booking_button_is_clicked_without_entering_the_Card_expiration_year_in_the_text_box()
			throws Throwable {
		hotelBookingPage.setFirstName("firstName");
		hotelBookingPage.setLastName("lastName");
		hotelBookingPage.setEmail("ravi@gmail.com");
		hotelBookingPage.setPhone("9876543210");
		hotelBookingPage.setCity("Pune");
		hotelBookingPage.setState("Tamilnadu");
		hotelBookingPage.setPersons("2");
		hotelBookingPage.setCardHolderName("Ravi Agrawal");
		hotelBookingPage.setDebit("9876543210321456");
		hotelBookingPage.setCvv("256");
		hotelBookingPage.setMonth("12");
		hotelBookingPage.setYear("");
		hotelBookingPage.clickConfirmButton();
	}

	@When("^Confirm Booking button is clicked\\.$")
	public void confirm_Booking_button_is_clicked() throws Throwable {
		hotelBookingPage.setFirstName("firstName");
		hotelBookingPage.setLastName("lastName");
		hotelBookingPage.setEmail("ravi@gmail.com");
		hotelBookingPage.setPhone("9876543210");
		hotelBookingPage.setCity("Pune");
		hotelBookingPage.setState("Tamilnadu");
		hotelBookingPage.setPersons("2");
		hotelBookingPage.setCardHolderName("Ravi Agrawal");
		hotelBookingPage.setDebit("9876543210321456");
		hotelBookingPage.setCvv("256");
		hotelBookingPage.setMonth("12");
		hotelBookingPage.setYear("2020");
		hotelBookingPage.clickConfirmButton();

	}

	@Then("^move to the next page with title as \"([^\"]*)\"$")
	public void move_to_the_next_page_with_title_as(String arg1) throws Throwable {
		
		assertEquals(arg1, hotelBookingPage.getTitle());
		Thread.sleep(2000);
		hotelBookingPage.quitPage();

	}
	
	
	@Then("^validate the error message as \"([^\"]*)\"\\.$")
	public void validate_the_error_message_as(String arg1){
		
		String alertMessage = hotelBookingPage.getMessage();
		if (alertMessage != null)
			assertEquals(alertMessage, arg1);
		hotelBookingPage.quitPage();
		
	}
	
	
}

