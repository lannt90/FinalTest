package com.vsii.tsc.OpenERP.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
public class LoginPage {
  
	@FindBy (name = "login")
	WebElement txtUsername;
	
	@FindBy (name = "password")
	WebElement txtPassword;		
	
	@FindBy (name = "submit")
	WebElement btnLogin;

//	public LoginPage(WebDriver driver) {
//		// TODO Auto-generated constructor stub
//	}

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public void setTxtUsername(WebElement txtUsername) {
		this.txtUsername = txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public void setTxtPassword(WebElement txtPassword) {
		this.txtPassword = txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(WebElement btnLogin) {
		this.btnLogin = btnLogin;
	}
	
}
