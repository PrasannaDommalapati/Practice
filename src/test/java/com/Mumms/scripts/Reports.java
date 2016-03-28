package com.Mumms.scripts;

import java.util.Hashtable;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Mumms.libs.ReportsLib;
import com.automation.utilities.TestUtil;

public class Reports extends ReportsLib{
	
	@Parameters({"userrole"})
	@BeforeMethod
	public void login(String userrole) throws Throwable{
		loginAsUserRole(userrole);
	}

	@DataProvider
	public Object[][] getTestDataFor_verifyCAHPSReport() {
		return TestUtil.getData("verifyCAHPSReport", TestData, "Reports");
	}

	@Test(dataProvider = "getTestDataFor_verifyCAHPSReport")

	public void verifyCAHPSReport(Hashtable<String, String> data) throws Throwable {
		try {

			this.reporter.initTestCaseDescription("SQA-166");	
			selectAgency("RUTH");
			goToReports();
			cahpsReportFlow(data);
			verifyCAHPSdata();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@DataProvider
	public Object[][] getTestDataFor_medlineReport() {
		return TestUtil.getData("medlineReport", TestData, "Reports");
	}

	@Test(dataProvider = "getTestDataFor_medlineReport")

	public void medlineReport(Hashtable<String, String> data) throws Throwable {
		try {

			this.reporter.initTestCaseDescription("SQA-179");	
			goToReports();
			setMedlineInfo(data);
			verifyMedlineInfo(data);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void logOut() throws Throwable {
		doLogout();
	}


}
