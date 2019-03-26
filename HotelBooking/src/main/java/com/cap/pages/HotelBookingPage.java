package com.cap.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cap.testbase.TestBase;

public class HotelBookingPage {
	WebDriver driver;

	@FindBy(id = "txtFirstName")
	WebElement firstName;

	@FindBy(name = "txtLN")
	WebElement lastName;

	@FindBy(name = "Email")
	WebElement email;

	@FindBy(name = "Phone")
	WebElement phone;

	@FindBy(name = "city")
	WebElement city;

	@FindBy(name = "state")
	WebElement state;

	@FindBy(name = "persons")
	WebElement persons;

	@FindBy(id = "txtCardholderName")
	WebElement cardHolderName;

	@FindBy(name = "debit")
	WebElement debit;

	@FindBy(name = "cvv")
	WebElement cvv;

	@FindBy(name = "month")
	WebElement month;

	@FindBy(name = "year")
	WebElement year;

	@FindBy(id = "btnPayment")
	WebElement confirmButton;

	public HotelBookingPage() throws InterruptedException {
		super();
		driver = TestBase.Initialisation();
	}

	public void openHotelBookingPage() throws InterruptedException {
		String projectLocation = System.getProperty("user.dir");
		driver.get(projectLocation + "\\WebContent\\hotelbooking.html");
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void setFirstName(String string) {
		firstName.click();
		firstName.sendKeys(string);
	}

	public void setLastName(String string) {
		lastName.click();
		lastName.sendKeys(string);
	}

	public void setEmail(String string) {
		email.click();
		email.sendKeys(string);
	}

	public void setPhone(String string) {
		phone.click();
		phone.sendKeys(string);
	}

	public void setCity(String string) {
		Select city1 = new Select(city);
		city1.selectByVisibleText(string);
	}

	public void setState(String string) {
		Select state1 = new Select(state);
		state1.selectByVisibleText(string);
	}

	public void setPersons(String string) {
		Select persons1 = new Select(persons);
		persons1.selectByVisibleText(string);
	}

	public void setCardHolderName(String string) {
		cardHolderName.click();
		cardHolderName.sendKeys(string);
	}

	public void setDebit(String string) {
		debit.click();
		debit.sendKeys(string);
	}

	public void setCvv(String string) {
		cvv.click();
		cvv.sendKeys(string);
	}

	public void setMonth(String string) {
		month.click();
		month.sendKeys(string);
	}

	public void setYear(String string) {
		year.click();
		year.sendKeys(string);
	}

	public void clickConfirmButton() {
		confirmButton.click();
	}

	public String getMessage() {
		String alertMessage = null;
		if (this.isAlertPresent()) {
			alertMessage = driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
		}
		return alertMessage;
	}

	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void quitPage() {
		driver.close();
	}

}
