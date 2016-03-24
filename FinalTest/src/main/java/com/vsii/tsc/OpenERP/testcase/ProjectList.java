package com.vsii.tsc.OpenERP.testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsii.tsc.OpenERP.commethods.CommonMethods;
import com.vsii.tsc.OpenERP.pages.ProjectCreateNew;
import com.vsii.tsc.OpenERP.pages.method.LoginPageMethod;
import com.vsii.tsc.OpenERP.pages.method.ProjectCreateNewMethod;
import com.vsii.tsc.OpenERP.pages.method.ProjectGroupPageMethod;
import com.vsii.tsc.OpenERP.pages.method.ProjectListPageMethod;
import com.vsii.tsc.OpenERP.utility.TestBase;

public class ProjectList {
	LoginPageMethod objLogin;
	ProjectListPageMethod objProjectListMethod;
	ProjectCreateNewMethod objCreateProjectMethod;
	ProjectCreateNew objCreateProject;
	ProjectGroupPageMethod objProjectGroupMethod;

	@BeforeClass
	public void setupClass() throws Exception {
		objLogin = new LoginPageMethod(TestBase.driver);
		objProjectListMethod = new ProjectListPageMethod(TestBase.driver);
		CommonMethods.checkLogin();
	}
	
	@Test(priority = 0, description = "Check Project List With Role Manager: View TSC")
	public void PM01() throws InterruptedException {
		TestBase.methodName = "PM01";	
		objProjectGroupMethod.clickProjectMenu();
		CommonMethods.waitUntil(objProjectGroupMethod.getLbGroup());
		Thread.sleep(3000);	
		objProjectListMethod.clickDepartment();
		Assert.assertEquals(objProjectListMethod.getlbProject1(), "TSC_General _Non project works");
		Assert.assertEquals(objProjectListMethod.getlbProject2(), "Laplink 07");
		Assert.assertEquals(objProjectListMethod.getlbProject3(), "VIB-IP3");
		Assert.assertEquals(objProjectListMethod.getlbProject4(), "Vpbank testing");
		
	}
	
}
