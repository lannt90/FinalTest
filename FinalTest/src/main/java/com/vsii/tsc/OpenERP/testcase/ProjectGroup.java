package com.vsii.tsc.OpenERP.testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsii.tsc.OpenERP.commethods.CommonMethods;
import com.vsii.tsc.OpenERP.pages.method.LoginPageMethod;
import com.vsii.tsc.OpenERP.pages.method.ProjectGroupPageMethod;
import com.vsii.tsc.OpenERP.utility.TestBase;
import com.vsii.tsc.OpenERP.utility.CommonOperations;



public class ProjectGroup {
 LoginPageMethod objLogin; 
 ProjectGroupPageMethod objProjectGroupMethod;
 
 @BeforeClass
	public void setupClass() throws NumberFormatException, IOException {
		objLogin = new LoginPageMethod(TestBase.driver);
		objProjectGroupMethod = new ProjectGroupPageMethod(TestBase.driver);
		CommonMethods.checkLogin();
	}
@Test(priority = 0, description = "Check Project Group")
	public void viewProjectList() throws InterruptedException {
		TestBase.methodName = "viewProjectList";		
		objLogin.loginToManagerPage("phuongnt3", "12345678");
		objProjectGroupMethod.clickProjectMenu();
		TestBase.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Assert.assertEquals(objProjectGroupMethod.getGrouplb(), "Group");
		Assert.assertEquals(objProjectGroupMethod.getProjectName(), "Project Name");
		Assert.assertEquals(objProjectGroupMethod.getProjectManager(), "Project Manager");
		Assert.assertEquals(objProjectGroupMethod.getContact(), "Contact");
		Assert.assertEquals(objProjectGroupMethod.getPlannedTime(), "Planned Time");
		Assert.assertEquals(objProjectGroupMethod.getTotalTime(), "Total Time ");
		Assert.assertEquals(objProjectGroupMethod.getSpendTime(), "Spend Time");
		Assert.assertEquals(objProjectGroupMethod.getProjectCode(), "Project Code");
		Assert.assertEquals(objProjectGroupMethod.getProgress(), "Progress");
		Assert.assertEquals(objProjectGroupMethod.getStatus(), "Status");		
 
	}
	
	@AfterMethod
	public void afterMethod() throws Exception {
		CommonOperations.takePicture();
	}

	@AfterClass
	public void teardownClass() {
		objLogin = null;
	}
}
