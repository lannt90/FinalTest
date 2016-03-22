package com.vsii.tsc.OpenERP.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.vsii.tsc.OpenERP.pages.method.ProjectCreateNewMethod;
import com.vsii.tsc.OpenERP.pages.LoginPage;
import com.vsii.tsc.OpenERP.pages.ProjectCreateNew;
import com.vsii.tsc.OpenERP.pages.method.LoginPageMethod;
import com.vsii.tsc.OpenERP.utility.TestBase;
import com.vsii.tsc.OpenERP.testdata.TestData;
import com.vsii.tsc.OpenERP.utility.CommonOperations;
import com.vsii.tsc.OpenERP.commethods.CommonMethods;

public class CreateNewProject {
  LoginPageMethod objLogin;
  ProjectCreateNewMethod objCreateProjectMethod;
  ProjectCreateNew objCreateProject;
  String username;
  String password;
  
  @BeforeClass
	public void setupClass() throws Exception{
		objLogin = new LoginPageMethod(TestBase.driver);
		objCreateProjectMethod = new ProjectCreateNewMethod(TestBase.driver);
		CommonMethods.checkLogin();	
		
	}
  @Test (priority = 0, description = "Create New Project", dataProvider = "dpNewProject", dataProviderClass = TestData.class)
  public void CN01(String projectName, String refContract, String projectCode, String privacy, String projectManager, 
		String appEffort, String department, String projectType, String commDetails, String customer ) throws Exception {
  		objCreateProjectMethod.gotoCreateNewPage();
	  	TestBase.methodName = "CN01";
  		objCreateProjectMethod.createNewProject(projectName, refContract, projectCode, privacy, projectManager, appEffort, department, projectType, commDetails, customer);
//  		Assert.assertTrue(objCreateProjectMethod.CreateSuccess().contains("Submit to Review"));
  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

  }
  @AfterMethod
	public void afterMethod() throws Exception{
		CommonOperations.takePicture();
	}

}
