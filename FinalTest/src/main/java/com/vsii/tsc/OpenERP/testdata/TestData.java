package com.vsii.tsc.OpenERP.testdata;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import com.vsii.tsc.OpenERP.testcase.*;
//import com.vsii.tsc.OpenERP.testcase.Login;
//import com.vsii.tsc.guru.testcase.NewCustomer;
//import com.vsii.tsc.utility.ExcelHandle;
import com.vsii.tsc.OpenERP.utility.ExcelHandle;

public class TestData {
	@DataProvider(name="reset")
	public static Object[][] getLoginValid() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "Login", "LO03");
		return data;
	}
	
	@DataProvider(name = "dpLogin")
	public static Object[][] getLoginData() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "Login", "LO02");
		return data;
	}

	@DataProvider(name = "dpValidateCustomer")
	public static Object[][] getValidateCustomerData() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "CreateNewCustomer", "CN02");
		return data;
	}
	
	@DataProvider(name="dpNewProject")
	public static Object[][]  getCustomerData() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "CreateNewProject", "CN01");
		return data;
	}

	@DataProvider(name = "dpEditProject")
	public static Object[][] editCustomerData() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "EditProject", "EP01");
		return data;
	}
	
	
}
