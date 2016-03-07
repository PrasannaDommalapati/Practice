package com.Mumms.scripts;

import java.util.Hashtable;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Mumms.libs.*;
import com.Mumms.page.*;

import com.automation.utilities.TestUtil;

public class Reports extends ReportsLib {

	@Parameters({ "userrole" })
	@BeforeMethod
	public void login(String userrole) throws Throwable {
		loginAsUserRole(userrole);
	}

	@DataProvider
	public Object[][] getTestDataFor_visitReport() {
		return TestUtil.getData("testGenerateVisitReport", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_visitReport")
	public void testGenerateVisitReport(Hashtable<String, String> data) throws Throwable {

		try {
			if (data.get("RunMode").equals("Y")) {

				this.reporter.initTestCaseDescription("SQA-120 - To Validate the visit report");
				System.out.println("In the testVisitReport method");
				// selectAgency("RUTH");
				goToReports();
				generateVisitReport(data);
				verifyVisitReport(data);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_monthEndARReconciliationReport() {
		return TestUtil.getData("testGenerateMonthEndARReconciliationReport", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_monthEndARReconciliationReport")
	public void testGenerateMonthEndARReconciliationReport(Hashtable<String, String> data) throws Throwable {

		try {
			if (data.get("RunMode").equals("Y")) {

				this.reporter.initTestCaseDescription("SQA-120 - To Validate the visit report");
				System.out.println("In the testVisitReport method");
				// selectAgency("RUTH");
				goToReports();
				generateMonthEndARReconciliationReport(data);
				verifyMonthEndARReconciliationReport(data);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_monthlyRevenueReport() {
		return TestUtil.getData("testGenerateMonthlyRevenueReport", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_monthlyRevenueReport")
	public void testGenerateMonthlyRevenueReport(Hashtable<String, String> data) throws Throwable {

		try {
			if (data.get("RunMode").equals("Y")) {

				this.reporter.initTestCaseDescription("SQA-120 - To Validate the visit report");
				System.out.println("In the testVisitReport method");
				// selectAgency("RUTH");
				goToReports();
				generateMonthlyRevenueReport(data);
				verifyMonthlyRevenueReport(data);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_PaymentsAndAdjustmentsReport() {
		return TestUtil.getData("testGeneratePaymentsAndAdjustmentsReport", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_PaymentsAndAdjustmentsReport")
	public void testGeneratePaymentsAndAdjustmentsReport(Hashtable<String, String> data) throws Throwable {

		try {
			if (data.get("RunMode").equals("Y")) {

				this.reporter.initTestCaseDescription("SQA-120 - To Validate the visit report");
				System.out.println("In the testVisitReport method");
				// selectAgency("RUTH");
				goToReports();
				generatePaymentsAdjustmentsReportByDateReport(data);
				verifyPaymentsAdjustmentsReportByDateReport(data);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_HISForAdmissionReport() {
		return TestUtil.getData("testGenerateHISForAdmissionReport", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_HISForAdmissionReport")
	public void testGenerateHISForAdmissionReport(Hashtable<String, String> data) throws Throwable {

		try {
			if (data.get("RunMode").equals("Y")) {

				this.reporter.initTestCaseDescription("SQA-120 - To Validate the visit report");
				System.out.println("In the testVisitReport method");
				// selectAgency("RUTH");
				goToReports();
				generateHISReportForAdmissionsReport(data);
				verifyHISReportForAdmissionReport(data);
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
