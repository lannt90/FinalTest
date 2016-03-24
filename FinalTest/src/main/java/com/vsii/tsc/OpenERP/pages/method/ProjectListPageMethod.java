package com.vsii.tsc.OpenERP.pages.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.vsii.tsc.OpenERP.pages.ProjectListPage;

public class ProjectListPageMethod {
	 WebDriver driver;
	 
	 public ProjectListPage objProjectList = new ProjectListPage();
	 
	//Initialize all web element
		public ProjectListPageMethod(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, objProjectList);
		}
		public void clickDepartment(){
			objProjectList.getLbDepartement();
			objProjectList.getLbDepartement().click();		
		}
	 public String getlbProject1(){
		 return objProjectList.getLbProject1().getText();
	 }
	 public String getlbProject2(){
		 return objProjectList.getLbProject2().getText();
	 }
	 
	 public String getlbProject3(){
		 return objProjectList.getLbProject3().getText();
	 }
	 
	 public String getlbProject4(){
		 return objProjectList.getLbProject4().getText();
	 }
	 
}
