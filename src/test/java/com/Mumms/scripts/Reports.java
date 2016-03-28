package com.Mumms.scripts;

import java.util.Hashtable;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Mumms.libs.ReportsLib;
import com.Mumms.page.ReportsPage;
import com.automation.utilities.TestUtil;

public class Reports extends ReportsLib {

	@Parameters({ "userrole" })
	@BeforeMethod
	public void login(String userrole) throws Throwable {
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
				float pageLoadTime = appLoadingTime(ReportsPage.exportButton);
				verifyVisitReport(data, pageLoadTime);
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

				this.reporter.initTestCaseDescription("SQA-104 - To validation of the Month End AR Reconciliation");
				System.out.println("In the testGenerateMonthEndARReconciliationReport method");
				selectAgency("RUTH");
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

				this.reporter.initTestCaseDescription("SQA-105 - To validation of the Monthly Revenue");
				System.out.println("In the testGenerateMonthlyRevenueReport method");
				selectAgency("RUTH");
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

				this.reporter.initTestCaseDescription(
						"SQA-115 - To validation of the Payments and Adjustments Report by date.");
				System.out.println("In the testGeneratePaymentsAndAdjustmentsReport method");
				selectAgency("RUTH");
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

				this.reporter
						.initTestCaseDescription("SQA-116 - To validation of the HIS Report For Admission. report");
				System.out.println("In the testGenerateHISForAdmissionReport method");
				selectAgency("RUTH");
				goToReports();
				generateHISReportForAdmissionsReport(data);
				float pageLoadTime = appLoadingTime(ReportsPage.exportButton);
				verifyHISReportForAdmissionReport(data, pageLoadTime);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_HISForDischargeReport() {
		return TestUtil.getData("testGenerateHISForDischargeReport", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_HISForDischargeReport")
	public void testGenerateHISForDischargeReport(Hashtable<String, String> data) throws Throwable {

		try {
			if (data.get("RunMode").equals("Y")) {

				this.reporter.initTestCaseDescription("SQA-117 - To validation of the HIS Report For Discharge report");
				System.out.println("In the testGenerateHISForDischargeReport method");
				selectAgency("RUTH");
				goToReports();
				generateHISReportForDischargeReport(data);
				float pageLoadTime = appLoadingTime(ReportsPage.exportButton);
				verifyHISReportForDischargeReport(data, pageLoadTime);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_TeamMeetingReport() {
		return TestUtil.getData("testGenerateTeamMeetingReport", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_TeamMeetingReport")
	public void testGenerateTeamMeetingReport(Hashtable<String, String> data) throws Throwable {

		try {
			if (data.get("RunMode").equals("Y")) {

				this.reporter.initTestCaseDescription("SQA-118 - To validation of the Team Meeting report report");
				System.out.println("In the testGenerateTeamMeetingReport method");
				selectAgency("RUTH");
				goToReports();
				generateTeamMeetingReport(data);
				float pageLoadTime = appLoadingTime(ReportsPage.exportButton);
				verifyTeamMeetingReport(data, pageLoadTime);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_ContactListReport() {
		return TestUtil.getData("testGenerateContactsListReport", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_ContactListReport")
	public void testGenerateContactsListReport(Hashtable<String, String> data) throws Throwable {

		try {
			if (data.get("RunMode").equals("Y")) {

				this.reporter.initTestCaseDescription("SQA-124 - To validate the operation of the Contact List report");
				System.out.println("In the testGenerateContactsListReport method");
				selectAgency("RUTH");
				goToReports();
				generateContactListReport(data);
				float pageLoadTime = appLoadingTime(ReportsPage.exportButton);
				verifygenerateContactListReport(data, pageLoadTime);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_BereavedPersonsReport() {
		return TestUtil.getData("testGenerateBereavedPersonsReport", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_BereavedPersonsReport")
	public void testGenerateBereavedPersonsReport(Hashtable<String, String> data) throws Throwable {

		try {
			if (data.get("RunMode").equals("Y")) {

				this.reporter.initTestCaseDescription("SQA-123 - To validation of the Bereaved Person report report");
				System.out.println("In the testGenerateBereavedPersonsReport method");
				selectAgency("RUTH");
				goToReports();
				generateBereavedPersonsReport(data);
				float pageLoadTime = appLoadingTime(ReportsPage.exportButton);
				verifyBereavedPersonstReport(data, pageLoadTime);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_ReferralsbyReferralSourceReport() {
		return TestUtil.getData("testGenerateReferralsbyReferralSourceReportReport", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_ReferralsbyReferralSourceReport")
	public void testGenerateReferralsbyReferralSourceReportReport(Hashtable<String, String> data) throws Throwable {

		try {
			if (data.get("RunMode").equals("Y")) {

				this.reporter
						.initTestCaseDescription("SQA-122 - To validation of the Referrals by Referral Source report");
				System.out.println("In the testGenerateReferralsbyReferralSourceReportReport method");
				selectAgency("RUTH");
				goToReports();
				generateReferralsbyReferralSourceReport(data);
				float pageLoadTime = appLoadingTime(ReportsPage.exportButton);
				verifyReferralsbyReferralSourceReport(data, pageLoadTime);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_PatientDaysbyLevelofCareReport() {
		return TestUtil.getData("testGeneratePatientDaysbyLevelofCareReport", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_PatientDaysbyLevelofCareReport")
	public void testGeneratePatientDaysbyLevelofCareReport(Hashtable<String, String> data) throws Throwable {

		try {
			if (data.get("RunMode").equals("Y")) {

				this.reporter
						.initTestCaseDescription("SQA-121 - To validation of the Patient Days by Level of Care report");
				System.out.println("In the testGeneratePatientDaysbyLevelofCareReport method");
				selectAgency("RUTH");
				goToReports();
				generatePatientDaysbyLevelofCareReport(data);
				float pageLoadTime = appLoadingTime(ReportsPage.exportButton);
				verifyPatientDaysbyLevelofCareReport(data, pageLoadTime);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_generateUpcomingF2FCertificationsReport() {
		return TestUtil.getData("testGenerateUpcomingF2FCertificationsReport", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_generateUpcomingF2FCertificationsReport")
	public void testGenerateUpcomingF2FCertificationsReport(Hashtable<String, String> data) throws Throwable {

		try {
			if (data.get("RunMode").equals("Y")) {

				this.reporter.initTestCaseDescription(
						"SQA-119 - To validation of the Upcoming F2F and Certifications report");
				System.out.println("In the testGeneratePatientDaysbyLevelofCareReport method");
				selectAgency("RUTH");
				goToReports();
				generateUpcomingF2FCertificationsReport(data);
				float pageLoadTime = appLoadingTime(ReportsPage.exportButton);
				verifyUpcomingF2FCertificationsReport(data, pageLoadTime);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_generateCreditClaimBalanceReport() {
		return TestUtil.getData("testGenerateCreditClaimBalanceReport", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_generateCreditClaimBalanceReport")
	public void testGenerateCreditClaimBalanceReport(Hashtable<String, String> data) throws Throwable {

		try {
			if (data.get("RunMode").equals("Y")) {

				this.reporter.initTestCaseDescription("SQA-103 - To validation of the Credit Claim Balance Report.");
				System.out.println("In the testGenerateCreditClaimBalanceReport method");
				selectAgency("ORLANDO");
				goToReports();
				generateCreditClaimBalanceReport(data);
				float pageLoadTime = appLoadingTime(ReportsPage.exportButton);
				verifyCreditClaimBalanceReport(data, pageLoadTime);
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
