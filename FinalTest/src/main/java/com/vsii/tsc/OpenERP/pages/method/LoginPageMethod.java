package com.vsii.tsc.OpenERP.pages.method;

//import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.vsii.tsc.OpenERP.pages.LoginPage;
//import com.vsii.tsc.guru.pages.NewPageLogin;

public class LoginPageMethod {
//	Logger log = Logger.getLogger("trunghung");
	WebDriver driver;
	LoginPage objLogin = new LoginPage();
	
	public LoginPageMethod(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, objLogin);
//	log.debug("Initiate web driver");
	}
	
	// Enter username in UserID textbox
	public void enterUserID(String txtUsername) {
		objLogin.getUserNametxt().sendKeys(txtUsername);
//		log.debug("Set username");
	}
	
	// Enter password in password textbox
	public void enterPassword(String txtPass) {
		objLogin.getPasswordtxt().sendKeys(txtPass);
//		log.debug("Set password");
	}
	
	// Click login button
	public void clickLogin() {
		objLogin.getLoginbutt().click();
//		log.debug("Click login button");
	}
	
	// Get the title of Login page
	public String getLoginTitle() {
//		log.debug("Get web title text");
		return objLogin.getWebTitleText().getText();
	}
	
	// Log in manager page
	public void loginToManagerPage(String username, String password) {
		objLogin.getUserNametxt().sendKeys(username);
		objLogin.getPasswordtxt().sendKeys(password);
		objLogin.getLoginbutt().click();
//		log.debug("Login to Manager page");
	}

	// Get Manager ID in Manager page
	public String getManagerIDInManagerPage() {
//		log.debug("Get Manager ID in manager page");
		return objLogin.getManagerID().getText();
	}
	
}


