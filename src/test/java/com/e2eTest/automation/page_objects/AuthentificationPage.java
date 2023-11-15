package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class AuthentificationPage extends BasePage {

	/* Retrieve Web elements */
	@FindBy(how = How.ID, using = "Email")
	private static WebElement email;

	@FindBy(how = How.ID, using = "Password")
	private static WebElement password;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private static WebElement btnLogin;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Logout']")
	private static WebElement btnLogout;

	@FindBy(how = How.XPATH, using = "//h1[normalize-space()='Dashboard']")
	private static WebElement dashboard;

	@FindBy(how = How.XPATH, using = "//div[@class='message-error validation-summary-errors']")
	private static WebElement errorMsg;

	/* Create method */
	public AuthentificationPage() {
		super(Setup.getDriver());
	}

	public static WebElement getEmail() {
		return email;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getbtnLogin() {
		return btnLogin;
	}

	public static WebElement getbtnLogout() {
		return btnLogout;
	}

	public static WebElement getdashboard() {
		return dashboard;
	}

	public static WebElement geterrorMsg() {
		return errorMsg;
	}
}
