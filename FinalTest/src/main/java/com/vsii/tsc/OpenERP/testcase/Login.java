package com.vsii.tsc.OpenERP.testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.vsii.tsc.OpenERP.pages.method.LoginPageMethod;
import com.vsii.tsc.OpenERP.utility.TestBase;

public class Login {
	LoginPageMethod objLogin;
	@BeforeClass
	public void setupClass() throws NumberFormatException, IOException {
		objLogin = new LoginPageMethod(TestBase.driver);
//	}
//        
//    public void setup(){
//     
        TestBase.driver = new FirefoxDriver();     
        TestBase.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        TestBase.driver.get("http://118.70.170.128:8068/?db=VSIIERPdemo");
     }
    @Test
    public void testLogin(){
    	objLogin.login("phuongnt3","12345678");
    }
    
    @AfterClass
	public void teardownClass() {
    	TestBase.driver.quit();
		objLogin = null;	
	}
}
