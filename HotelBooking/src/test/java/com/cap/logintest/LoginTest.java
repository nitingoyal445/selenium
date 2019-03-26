package com.cap.logintest;

import static org.junit.Assert.assertEquals;

import com.cap.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	LoginPage loginPage;
	
	
	
	@Given("^User open the web browser\\.$")
	public void user_open_the_web_browser() throws InterruptedException {
		loginPage = new LoginPage();
	}

	@Given("^Open the Login\\.html page\\.$")
	public void open_the_Login_html_page() throws Throwable {
		loginPage.openLoginPage();
	}

	@Then("^validate the page heading as \"([^\"]*)\"\\.$")
	public void validate_the_page_heading_as(String arg1) throws InterruptedException {
		String heading = loginPage.getHeading();
		assertEquals(arg1, heading);
		loginPage.quitPage();
	}

	@When("^Login button is clicked without entering the UserName in the text box\\.$")
	public void login_button_is_clicked_without_entering_the_UserName_in_the_text_box() {
		loginPage.setUserName("");
		loginPage.setUserPwd("password");
		loginPage.clickLogin();
	}

	@Then("^validate the error message as \"([^\"]*)\"\\.$")
	public void validate_the_error_message_as(String arg1){
		String alertMessage = loginPage.getMessage();
		if (alertMessage != null)
			assertEquals(alertMessage, arg1);
		loginPage.quitPage();
	}

	@When("^Login button is clicked without entering the Password in the text box\\.$")
	public void login_button_is_clicked_without_entering_the_Password_in_the_text_box(){
		loginPage.setUserName("username");
		loginPage.setUserPwd("");
		loginPage.clickLogin();
	}

	@When("^UserName as \"([^\"]*)\" and Password as \"([^\"]*)\" is entered,$")
	public void username_as_and_Password_as_is_entered(String arg1, String arg2) throws Throwable {
		loginPage.setUserName(arg1);
		loginPage.setUserPwd(arg2);
		loginPage.clickLogin();
	}

	@Then("^move to the next page with title as \"([^\"]*)\"$")
	public void move_to_the_next_page_with_title_as(String arg1) throws InterruptedException {
	 assertEquals(arg1, loginPage.getTitle());
	 Thread.sleep(2000);
	 loginPage.quitPage();
	}

}
