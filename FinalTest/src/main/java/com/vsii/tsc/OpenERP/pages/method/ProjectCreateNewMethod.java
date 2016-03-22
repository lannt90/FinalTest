package com.vsii.tsc.OpenERP.pages.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.vsii.tsc.OpenERP.pages.ProjectCreateNew;

public class ProjectCreateNewMethod {
  WebDriver driver;
  ProjectCreateNew objCreateProject = new ProjectCreateNew();
  public ProjectCreateNewMethod(WebDriver driver) {
	  
	  this.driver = driver;
	  PageFactory.initElements(driver, objCreateProject);
  }
  // get all value of all fields:
  
  public void clickCreatebtn (){
	  
	  objCreateProject.getBtnCreate().click();  
  }
  public String getProjectName(){
	  
	  objCreateProject.getTxtProjectName();
	  return objCreateProject.getTxtProjectName().getText();
	  
  }
  public String getRefContract(){
	  
	  objCreateProject.getTxtRefContract();
	  return objCreateProject.getTxtRefContract().getText();
	  
  }
  public String getProjectCode(){
	  
	  objCreateProject.getTxtProjectCode();
	  return objCreateProject.getTxtProjectCode().getText();
	  
  }
  public String getPrivacy(){
	  
	  objCreateProject.getDropPrivacy();
	  return objCreateProject.getDropPrivacy().getText();
	  
  }
  public String getProjectManager(){
	  
	  objCreateProject.getDropProjectManager();
	  return objCreateProject.getDropProjectManager().getText();	  
  }
  public String getAppEffort(){
	  
	  objCreateProject.getTxtApprovedEffort();
	  return objCreateProject.getTxtApprovedEffort().getText();
	  
  }
  public String getDepartment(){
	  
	  objCreateProject.getDropDepartment();
	  return objCreateProject.getDropDepartment().getText();
	  
  }
  public String getProjectType(){
	  
	  objCreateProject.getDropProjectType();
	  return objCreateProject.getDropProjectType().getText();
	  
  }
  public String getCommercialDetails(){
	  
	  objCreateProject.getDropCommercialDetails();
	  return objCreateProject.getDropCommercialDetails().getText();
	  
  }
  public String getCustomer(){
	  
	  objCreateProject.getDropCustomer();
	  return objCreateProject.getDropCustomer().getText();
	  
  }
  // Create New Project
  
  public void createNewProject (String projectName, String refContract, String projectCode, String privacy, String projectManager, 
		  String appEffort, String department, String projectType, String commDetails, String customer ){
	 objCreateProject.getMenunProject();
	 objCreateProject.getBtnCreate();
	 objCreateProject.getTxtProjectName();
	 objCreateProject.getTxtRefContract();
	 objCreateProject.getTxtProjectCode();
	 objCreateProject.getDropPrivacy();
	 objCreateProject.getDropProjectManager();
	 objCreateProject.getTxtApprovedEffort();
	 objCreateProject.getDropDepartment();
	 objCreateProject.getDropProjectType();
	 objCreateProject.getDropCommercialDetails();
	 objCreateProject.getDropCustomer();
	 objCreateProject.getBtnSave().click();
	  
  }	  
  public String CreateSuccess(){
	  return  objCreateProject.getTbnSubmit().getText(); 
	    }

  public void gotoCreateNewPage (){
	  objCreateProject.getMenunProject();
	  objCreateProject.getBtnCreate().click();  
	  
  }
}