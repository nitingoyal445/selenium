package com.cap.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cap.testbase.TestBase;

public class LoginPage {

	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"mainCnt\"]/div/div[1]/h1")
	WebElement heading;

	@FindBy(name = "userName")
	WebElement userName;

	@FindBy(name = "userPwd")
	WebElement userPwd;

	@FindBy(xpath = "//*[@id=\"mainCnt\"]/div/div[1]/form/table/tbody/tr[4]/td[2]/input")
	WebElement login;

	public String getHeading() {
		return heading.getText();
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(String string) {
		userName.click();
		userName.sendKeys(string);
	}

	public WebElement getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String string) {
		userPwd.click();
		userPwd.sendKeys(string);
	}

	public void clickLogin() {
		login.click();
	}

	public LoginPage() {
		super();
		driver = TestBase.Initialisation();
	}

	public void openLoginPage() throws InterruptedException {
		String projectLocation = System.getProperty("user.dir");
		driver.get(projectLocation + "\\WebContent\\login.html");
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
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
