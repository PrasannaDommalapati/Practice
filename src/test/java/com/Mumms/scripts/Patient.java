package com.Mumms.scripts;

import java.util.Hashtable;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Mumms.libs.PatientLib;
import com.Mumms.page.PatientPage;
import com.automation.accelerators.TestEngine;
import com.automation.accelerators.TestEngineWeb;
import com.automation.utilities.TestUtil;

public class Patient extends PatientLib {


	@Parameters({"userrole"})
	@BeforeMethod
	public void login(String userrole) throws Throwable{	
		System.out.println("The value of User role is "+userrole);
		loginAsUserRole(userrole);
	}

	@DataProvider
	public Object[][] getTestDataFor_TestCreateNewAccount() {
		return TestUtil.getData("TestCreateNewAccount", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_TestCreateNewAccount")
	public void TestCreateNewAccount(Hashtable<String, String> data) throws Throwable {
		try {
			if (data.get("RunMode").equals("Y")){

				this.reporter.initTestCaseDescription("TC1.2");	
				selectAgency("ruth");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@DataProvider
	public Object[][] getTestDataFor_TestSearchPatientInfo() {
		return TestUtil.getData("testSearchPatientInfo", TestData, "Patient");
	}

	@Test(dataProvider = "getTestDataFor_TestSearchPatientInfo")
	public void testSearchPatientInfo(Hashtable<String, String> data) throws Throwable {
		try {
			if (data.get("RunMode").equals("Y")){

				this.reporter.initTestCaseDescription("This test case is to verify the time taken for the search results to apepar");	
				selectAgency("RUTH");
				searchPatientInfo(data);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	@AfterMethod
	public void logOut() throws Throwable {
		doLogout();
	}

}
