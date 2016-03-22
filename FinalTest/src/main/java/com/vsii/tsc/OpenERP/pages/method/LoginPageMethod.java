package com.vsii.tsc.OpenERP.pages.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.vsii.tsc.OpenERP.utility.TestBase;
//import com.relevantcodes.extentreports.ExtentReports;
import com.vsii.tsc.OpenERP.pages.LoginPage;

public class LoginPageMethod {
  
	//ExtentReports extent;
	// Create new Web Driver variable
	WebDriver driver;
	// Create new WebElementLogin object
	public LoginPage objLoginPage = new LoginPage();

 	// Initialize all web element
 	public LoginPageMethod(WebDriver driver) {
 	this.driver = driver;
	PageFactory.initElements(driver, objLoginPage);
}
 	//Enter user name in UserID text box
	public void setUserID(String txtUsername) {		
		objLoginPage.getTxtUsername().sendKeys(txtUsername);
	}

	// Enter password in password text box
	public void setPassword(String txtPassword) {	
		objLoginPage.getTxtPassword().sendKeys(txtPassword);
	}

	// Click Login button
	public void clickLogin() {
		objLoginPage.getBtnLogin().click();
	}
	
	// Get User ID in Login page
	public String getUserID() {
		return objLoginPage.getTxtUsername().getText();
		}

		// Get Password in Login page
	public String getPassword() {
		return objLoginPage.getTxtPassword().getText();
		
		}
 public void login(String username, String password){
	 objLoginPage.getTxtUsername().clear();
	 objLoginPage.getTxtUsername().sendKeys(username);
	 objLoginPage.getTxtPassword().clear();
	 objLoginPage.getTxtPassword().sendKeys(password);
	 objLoginPage.getBtnLogin().click(); 
 } 
}