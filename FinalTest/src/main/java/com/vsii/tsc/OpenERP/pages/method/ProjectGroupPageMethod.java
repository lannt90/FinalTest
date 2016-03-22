package com.vsii.tsc.OpenERP.pages.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.vsii.tsc.OpenERP.pages.ProjectGroupPage;

public class ProjectGroupPageMethod {
 WebDriver driver;
 
 public ProjectGroupPage objProjectGroup = new ProjectGroupPage();
 
//Initialize all web element
	public ProjectGroupPageMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objProjectGroup);
	}
	public void clickProjectMenu (){
//		objProjectGroup.getMenuProject();
		objProjectGroup.getMenuProject().click();		
	}
 public String getGrouplb (){
	 
	 objProjectGroup.getLbGroup();
	 return objProjectGroup.getLb7thGroup().getText();
 }
 public String getProjectName (){
	 
	 objProjectGroup.getLbProjectName();
	 return objProjectGroup.getLbProjectName().getText();
 }
 public String getProjectManager (){
	 
	 objProjectGroup.getLbProjectManager();
	 return objProjectGroup.getLbProjectManager().getText();
 }
 public String getContact (){
	 
	 objProjectGroup.getContact();
	 return objProjectGroup.getContact().getText();
 }
 public String getPlannedTime (){
	 
	 objProjectGroup.getLbPlannedTime();
	 return objProjectGroup.getLbPlannedTime().getText();
 }
 public String getTotalTime (){
	 
	 objProjectGroup.getLbTotalTime();
	 return objProjectGroup.getLbTotalTime().getText();
 }
 
 public String getSpendTime (){
	 
	 objProjectGroup.getLbTimeSpent();
	 return objProjectGroup.getLbTimeSpent().getText();
 }
 public String getProjectCode (){
	 
	 objProjectGroup.getLbProjectCode();
	 return objProjectGroup.getLbProjectCode().getText();
 }
 
 public String getProgress (){
	 
	 objProjectGroup.getLbProgress();
	 return objProjectGroup.getLbProgress().getText();
 }
 public String getStatus (){
	 
	 objProjectGroup.getLbStatus();
	 return objProjectGroup.getLbStatus().getText();
 }
 
}

