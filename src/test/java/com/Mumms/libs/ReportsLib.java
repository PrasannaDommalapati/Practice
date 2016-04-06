package com.Mumms.libs;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Mumms.page.HomePage;
import com.Mumms.page.PatientPage;
import com.Mumms.page.ReportsPage;

public class ReportsLib extends MummsLib {

	public int sleep = 3000;

	public void setMedlineInfo(Hashtable<String, String> data) throws Throwable {
		try {
			new ReportsPage().Reports_Page();

			// click(ReportsPage.MedlineReport, "Medline Link");
			clickUsingJavascriptExecutor(ReportsPage.MedlineReport, "Medline Link");

			/*
			 * try {
			 * 
			 * WebDriverWait wait = new WebDriverWait(Driver, 2000);
			 * 
			 * WebElement element =
			 * wait.until(ExpectedConditions.elementToBeClickable(ReportsPage.
			 * BeginDateDay)); } catch (Exception e) { e.printStackTrace(); }
			 */
			// sleep(60000);

			selectByVisibleText(ReportsPage.BeginDateMonth, data.get("BeginDateMonth"), "from drop down");
			selectByVisibleText(ReportsPage.BeginDateDay, data.get("BeginDateDay"), "from drop down");
			selectByVisibleText(ReportsPage.BeginDateYear, data.get("BeginDateYear"), "from drop down");
			selectByVisibleText(ReportsPage.EndDateMonth, data.get("EndDateMonth"), "from drop down");
			selectByVisibleText(ReportsPage.EndDateDay, data.get("EndDateDay"), "from drop down");
			selectByVisibleText(ReportsPage.EndDateYear, data.get("EndDateYear"), "from drop down");

			click(ReportsPage.GenerateReport, "Generate Report Link");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void verifyMedlineInfo(Hashtable<String, String> data) throws Throwable {
		try {
			new ReportsPage().Reports_Page();

			/*
			 * try {
			 * 
			 * WebDriverWait wait = new WebDriverWait(Driver, 200);
			 * 
			 * WebElement element =
			 * wait.until(ExpectedConditions.elementToBeClickable(ReportsPage.
			 * MedlineFileType)); } catch (Exception e) { e.printStackTrace(); }
			 */

			// sleep(45000);

			isElementPresent(ReportsPage.MedlineFirstName, "Verify First Name", true);
			isElementPresent(ReportsPage.MedlineLastName, "Last Name", true);
			isElementPresent(ReportsPage.MedlineFacility, "Facility", true);
			isElementPresent(ReportsPage.MedlineStreet, "Street", true);
			isElementPresent(ReportsPage.MedlineRoomNumber, "Room Number", true);
			isElementPresent(ReportsPage.MedlineCity, "City", true);
			isElementPresent(ReportsPage.MedlineState, "State", true);
			isElementPresent(ReportsPage.MedlineCounty, "County", true);
			isElementPresent(ReportsPage.MedlineZip, "Zip", true);
			isElementPresent(ReportsPage.MedlineCountry, "Country", true);
			isElementPresent(ReportsPage.MedlineTeam, "team", true);
			isElementPresent(ReportsPage.MedlinePayer, "Payer", true);
			isElementPresent(ReportsPage.MedlineHHRG, "HHRG", true);
			isElementPresent(ReportsPage.MedlinePatientID, "PatientID", true);
			isElementPresent(ReportsPage.MedlineICD10_1, "ICD10_1", true);
			isElementPresent(ReportsPage.MedlineICD10_2, "ICD10_2", true);
			isElementPresent(ReportsPage.MedlineICD10_3, "ICD10_3", true);
			isElementPresent(ReportsPage.MedlineICD10_4, "ICD10_4", true);
			isElementPresent(ReportsPage.MedlinePhone, "Phone", true);
			isElementPresent(ReportsPage.MedlineNotes, "Notes", true);
			click(ReportsPage.saveButton, "Save button");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void cahpsReportFlow(Hashtable<String, String> data) throws Throwable {
		try {
			new ReportsPage().Reports_Page();

			click(ReportsPage.CAHPSLink, "cahps Link");
			sleep(25000);
			selectByVisibleText(ReportsPage.CAHPSMonth, data.get("CAHPSMonth"), "from drop down");
			selectByVisibleText(ReportsPage.CAHPSYear, data.get("CAHPSYear"), "from drop down");
			click(ReportsPage.GenerateReport, "generate report Link");
			sleep(15000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void verifyCAHPSdata() throws Throwable {

		try {
			sleep(4000);
			isElementPresent(ReportsPage.CAHPHeader, "CAHPS(DSS) Header", true);
			isElementPresent(ReportsPage.CAHPProvideName, "Provider Name", true);
			isElementPresent(ReportsPage.CAHPBranch, "Branch", true);
			isElementPresent(ReportsPage.CAHPProvideID, "Provider ID", true);
			isElementPresent(ReportsPage.CAHPNPI, "NPI", true);
			isElementPresent(ReportsPage.CAHPFacilityName, "Facility Name", true);
			isElementPresent(ReportsPage.CAHPSampleMonth, "Sample Month", true);
			isElementPresent(ReportsPage.CAHPSampleYear, "Sample Year", true);
			isElementPresent(ReportsPage.CAHPTotalCharges, "Total Live Charges", true);
			click(ReportsPage.saveButton, "Save button");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * This method is to generate the visit report under the Clinical widget in
	 * reports tab
	 *
	 * @return nothing will be returned
	 */
	public void generateVisitReport(Hashtable<String, String> data) throws Throwable {

		try {
			sleep(2000);
			String from_month = data.get("fromDate_Month");
			String from_day = data.get("fromDate_Day");
			String from_year = data.get("fromDate_Year");
			String to_month = data.get("toDate_Month");
			String to_day = data.get("toDate_Day");
			String to_year = data.get("toDate_Year");
			new ReportsPage().Reports_Page();
			click(ReportsPage.visitReport, "Visit report");
			sleep(10000);
			if (VerifyElementPresent(ReportsPage.fromDate_day, "Day field from the From_date section", true)
					&& VerifyElementPresent(ReportsPage.fromDate_month, "Month field from the From_date", true)
					&& VerifyElementPresent(ReportsPage.fromDate_year, "Year field from the From_date", true)) {

				selectByValue(ReportsPage.fromDate_month, from_month, "");
				selectByValue(ReportsPage.fromDate_day, from_day, "");
				selectByValue(ReportsPage.fromDate_year, from_year, "");
			} else {
				System.out.println("The From date fields are not displayed");
			}

			if (VerifyElementPresent(ReportsPage.toDate_day, "Day field from the To_date section", true)
					&& VerifyElementPresent(ReportsPage.toDate_month, "Month field from the To_date section", true)
					&& VerifyElementPresent(ReportsPage.toDate_year, "Year field from the To_date section", true)) {

				selectByValue(ReportsPage.toDate_month, to_month, "");
				selectByValue(ReportsPage.toDate_day, to_day, "");
				selectByValue(ReportsPage.toDate_year, to_year, "");
			} else {
				System.out.println("The To date fields are not displayed");
			}

			selectByValue(ReportsPage.visitType, data.get("VisitType"), "");
			sleep(3000);
			selectByValue(ReportsPage.program, data.get("Program"), "");
			sleep(3000);
			click(ReportsPage.generateReport, "Generate report");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * This method is to verify the visit report under the Clinical widget in
	 * reports tab
	 *
	 * @return nothing will be returned
	 */
	public void verifyVisitReport(Hashtable<String, String> data, float timeTaken) throws Throwable {

		try {
			sleep(2000);
			// Variables declaration
			String reportingPeriod = data.get("ReportingPeriod");
			String reportName = data.get("ReportName");
			String visitType = data.get("VisitType_Report");
			String program = data.get("Program_Report");

			// This block of code will extract the text from each web element
			// and
			// then it vl compare it with the data coming from the excel sheet
			// assertTextMatching(ReportsPage.reportTitleInReport, reportName,
			// "Report name");
			assertTextMatching(ReportsPage.reportingPeriodInReport, reportingPeriod, "Reporting Period");
			assertTextMatching(ReportsPage.visitTypeInReport, visitType, "Visit type");
			assertTextMatching(ReportsPage.programInReport, program, "Program name");
			assertTextMatching(ReportsPage.reportTitleInReport, reportName, "ReportName name");
			click(ReportsPage.saveButton, "Save button");
			reporter.SuccessReport("Report generation time", timeTaken + " milli secs");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * This method is to generate the Month END AR Reconciliation report under
	 * the Financial widget in reports tab
	 *
	 * @return nothing will be returned
	 */
	public void generateMonthEndARReconciliationReport(Hashtable<String, String> data) throws Throwable {

		try {
			sleep(2000);
			String from_month = data.get("fromDate_Month");
			String from_day = data.get("fromDate_Day");
			String from_year = data.get("fromDate_Year");
			String to_month = data.get("toDate_Month");
			String to_day = data.get("toDate_Day");
			String to_year = data.get("toDate_Year");

			new ReportsPage().Reports_Page();
			click(ReportsPage.monthEndARReconciliation, "Month End AR Reconciliation report");
			sleep(10000);
			if (VerifyElementPresent(ReportsPage.fromDate_day, "Day field from the From_date section", true)
					&& VerifyElementPresent(ReportsPage.fromDate_month, "Month field from the From_date", true)
					&& VerifyElementPresent(ReportsPage.fromDate_year, "Year field from the From_date", true)) {

				selectByValue(ReportsPage.fromDate_month, from_month, "");
				selectByValue(ReportsPage.fromDate_day, from_day, "");
				selectByValue(ReportsPage.fromDate_year, from_year, "");
			} else {
				System.out.println("The From date fields are not displayed");
			}

			if (VerifyElementPresent(ReportsPage.toDate_day, "Day field from the To_date section", true)
					&& VerifyElementPresent(ReportsPage.toDate_month, "Month field from the To_date section", true)
					&& VerifyElementPresent(ReportsPage.toDate_year, "Year field from the To_date section", true)) {

				selectByValue(ReportsPage.toDate_month, to_month, "");
				selectByValue(ReportsPage.toDate_day, to_day, "");
				selectByValue(ReportsPage.toDate_year, to_year, "");
			} else {
				System.out.println("The To date fields are not displayed");
			}

			selectByValue(ReportsPage.program, data.get("Program"), "");
			sleep(3000);
			click(ReportsPage.generateReport, "Generate report");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * This method is to verify the visit report under the Clinical widget in
	 * reports tab
	 *
	 * @return nothing will be returned
	 */
	public void verifyMonthEndARReconciliationReport(Hashtable<String, String> data) throws Throwable {

		try {
			sleep(2000);
			// Variables declaration
			String reportingPeriod = data.get("ReportingPeriod");
			String reportName = data.get("ReportName");
			String program = data.get("Program_Report");
			String siteInReport = data.get("SiteInReport");

			// This block of code will extract the text from each web element
			// and
			// then it vl compare it with the data coming from the excel sheet
			assertTextMatching(ReportsPage.reportTitleInReport, reportName, "Report name");
			assertTextMatching(ReportsPage.reportingPeriodInReport, reportingPeriod, "Reporting Period");
			assertTextMatching(ReportsPage.programInReport, program, "Program name");
			assertTextMatching(ReportsPage.siteOrOfficeInReport, siteInReport, "Site/Office name");
			click(ReportsPage.saveButton, "Save button");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * This method is to generate the Monthly revenue report under the Financial
	 * widget in reports tab
	 *
	 * @return nothing will be returned
	 */
	public void generateMonthlyRevenueReport(Hashtable<String, String> data) throws Throwable {

		try {
			sleep(2000);
			String from_month = data.get("fromDate_Month");
			String from_day = data.get("fromDate_Day");
			String from_year = data.get("fromDate_Year");
			String to_month = data.get("toDate_Month");
			String to_day = data.get("toDate_Day");
			String to_year = data.get("toDate_Year");
			new ReportsPage().Reports_Page();
			click(ReportsPage.monthlyRevenue, "Monthly revenue report");
			sleep(10000);
			if (VerifyElementPresent(ReportsPage.fromDate_day, "Day field from the From_date section", true)
					&& VerifyElementPresent(ReportsPage.fromDate_month, "Month field from the From_date", true)
					&& VerifyElementPresent(ReportsPage.fromDate_year, "Year field from the From_date", true)) {

				selectByValue(ReportsPage.fromDate_month, from_month, "");
				selectByValue(ReportsPage.fromDate_day, from_day, "");
				selectByValue(ReportsPage.fromDate_year, from_year, "");
			} else {
				System.out.println("The From date fields are not displayed");
			}

			if (VerifyElementPresent(ReportsPage.toDate_day, "Day field from the To_date section", true)
					&& VerifyElementPresent(ReportsPage.toDate_month, "Month field from the To_date section", true)
					&& VerifyElementPresent(ReportsPage.toDate_year, "Year field from the To_date section", true)) {

				selectByValue(ReportsPage.toDate_month, to_month, "");
				selectByValue(ReportsPage.toDate_day, to_day, "");
				selectByValue(ReportsPage.toDate_year, to_year, "");
			} else {
				System.out.println("The To date fields are not displayed");
			}

			selectByValue(ReportsPage.program, data.get("Program"), "");
			sleep(3000);
			click(ReportsPage.generateReport, "Generate report");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * This method is to verify the Monthly revenue report under the Financial
	 * widget in reports tab
	 *
	 * @return nothing will be returned
	 */
	public void verifyMonthlyRevenueReport(Hashtable<String, String> data) throws Throwable {

		try {
			sleep(2000);
			// Variables declaration
			String reportingPeriod = data.get("ReportingPeriod");
			String reportName = data.get("ReportName");
			String program = data.get("Program_Report");

			// This block of code will extract the text from each web element
			// and
			// then it vl compare it with the data coming from the excel sheet
			assertTextMatching(ReportsPage.reportTitleInReport, reportName, "Report name");
			assertTextMatching(ReportsPage.reportingPeriodInReport, reportingPeriod, "Reporting Period");
			assertTextMatching(ReportsPage.programInReport, program, "Program name");
			click(ReportsPage.saveButton, "Save button");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * This method is to generate the Payments Adjustments Report By Date Report
	 * report under the Financial widget in reports tab
	 *
	 * @return nothing will be returned
	 */
	public void generatePaymentsAdjustmentsReportByDateReport(Hashtable<String, String> data) throws Throwable {

		try {
			sleep(2000);
			String from_month = data.get("fromDate_Month");
			String from_day = data.get("fromDate_Day");
			String from_year = data.get("fromDate_Year");
			String to_month = data.get("toDate_Month");
			String to_day = data.get("toDate_Day");
			String to_year = data.get("toDate_Year");
			new ReportsPage().Reports_Page();

			click(ReportsPage.paymentAdjustmentsReportByDate, "Payments and Adjustments by date report");
			sleep(10000);
			if (VerifyElementPresent(ReportsPage.fromDate_day, "Day field from the From_date section", true)
					&& VerifyElementPresent(ReportsPage.fromDate_month, "Month field from the From_date", true)
					&& VerifyElementPresent(ReportsPage.fromDate_year, "Year field from the From_date", true)) {

				selectByValue(ReportsPage.fromDate_month, from_month, "");
				selectByValue(ReportsPage.fromDate_day, from_day, "");
				selectByValue(ReportsPage.fromDate_year, from_year, "");
			} else {
				System.out.println("The From date fields are not displayed");
			}

			if (VerifyElementPresent(ReportsPage.toDate_day, "Day field from the To_date section", true)
					&& VerifyElementPresent(ReportsPage.toDate_month, "Month field from the To_date section", true)
					&& VerifyElementPresent(ReportsPage.toDate_year, "Year field from the To_date section", true)) {

				selectByValue(ReportsPage.toDate_month, to_month, "");
				selectByValue(ReportsPage.toDate_day, to_day, "");
				selectByValue(ReportsPage.toDate_year, to_year, "");
			} else {
				System.out.println("The To date fields are not displayed");
			}

			selectByValue(ReportsPage.program, data.get("Program"), "");
			sleep(3000);
			click(ReportsPage.generateReport, "Generate report");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * This method is to verify the Payments Adjustments Report By Date report
	 * under the Financial widget in reports tab
	 *
	 * @return nothing will be returned
	 */
	public void verifyPaymentsAdjustmentsReportByDateReport(Hashtable<String, String> data) throws Throwable {

		try {
			sleep(2000);
			// Variables declaration
			String reportingPeriod = data.get("ReportingPeriod");
			String reportName = data.get("ReportName");
			String program = data.get("Program_Report");

			// This block of code will extract the text from each web element
			// and
			// then it vl compare it with the data coming from the excel sheet
			assertTextMatching(ReportsPage.reportTitleInReport, reportName, "Report name");
			assertTextMatching(ReportsPage.reportingPeriodInReport, reportingPeriod, "Reporting Period");
			assertTextMatching(ReportsPage.programInReport, program, "Program name");
			click(ReportsPage.saveButton, "Save button");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * This method is to generate the HIS Report for Admission report under the
	 * clinical widget in reports tab
	 *
	 * @return nothing will be returned
	 */
	public void generateHISReportForAdmissionsReport(Hashtable<String, String> data) throws Throwable {

		try {
			sleep(2000);
			String from_month = data.get("fromDate_Month");
			String from_day = data.get("fromDate_Day");
			String from_year = data.get("fromDate_Year");
			String to_month = data.get("toDate_Month");
			String to_day = data.get("toDate_Day");
			String to_year = data.get("toDate_Year");
			new ReportsPage().Reports_Page();
			click(ReportsPage.hisReportForAdmission, "HIS report for Admission");
			sleep(10000);
			if (VerifyElementPresent(ReportsPage.fromDate_day, "Day field from the From_date section", true)
					&& VerifyElementPresent(ReportsPage.fromDate_month, "Month field from the From_date", true)
					&& VerifyElementPresent(ReportsPage.fromDate_year, "Year field from the From_date", true)) {

				selectByValue(ReportsPage.fromDate_month, from_month, "");
				selectByValue(ReportsPage.fromDate_day, from_day, "");
				selectByValue(ReportsPage.fromDate_year, from_year, "");
			} else {
				System.out.println("The From date fields are not displayed");
			}

			if (VerifyElementPresent(ReportsPage.toDate_day, "Day field from the To_date section", true)
					&& VerifyElementPresent(ReportsPage.toDate_month, "Month field from the To_date section", true)
					&& VerifyElementPresent(ReportsPage.toDate_year, "Year field from the To_date section", true)) {

				selectByValue(ReportsPage.toDate_month, to_month, "");
				selectByValue(ReportsPage.toDate_day, to_day, "");
				selectByValue(ReportsPage.toDate_year, to_year, "");
			} else {
				System.out.println("The To date fields are not displayed");
			}

			sleep(3000);
			click(ReportsPage.generateReport, "Generate report");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * This method is to verify the HIS report for Admission under the Clinical
	 * widget in reports tab
	 *
	 * @return nothing will be returned
	 */
	public void verifyHISReportForAdmissionReport(Hashtable<String, String> data, float timeTaken) throws Throwable {

		try {
			sleep(2000);
			// Variables declaration
			String reportingPeriod = data.get("ReportingPeriod");
			String reportName = data.get("ReportName");
			String site = data.get("SiteInReport");

			// This block of code will extract the text from each web element
			// and
			// then it vl compare it with the data coming from the excel sheet
			assertTextMatching(ReportsPage.reportTitleInReport, reportName, "Report name");
			assertTextMatching(ReportsPage.reportingPeriodInReport, reportingPeriod, "Reporting Period");
			assertTextMatching(ReportsPage.siteOrOfficeInReport, site, "Site/Office");
			click(ReportsPage.saveButton, "Save button");
			reporter.SuccessReport("Report generation time", timeTaken + " secs");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * This method is to generate the HIS Report for Discharge report under the
	 * clinical widget in reports tab
	 *
	 * @return nothing will be returned
	 */
	public void generateHISReportForDischargeReport(Hashtable<String, String> data) throws Throwable {

		try {
			sleep(2000);
			String from_month = data.get("fromDate_Month");
			String from_day = data.get("fromDate_Day");
			String from_year = data.get("fromDate_Year");
			String to_month = data.get("toDate_Month");
			String to_day = data.get("toDate_Day");
			String to_year = data.get("toDate_Year");
			new ReportsPage().Reports_Page();
			click(ReportsPage.hisReportForDischarge, "HIS report for Discharge");
			sleep(10000);
			if (VerifyElementPresent(ReportsPage.fromDate_day, "Day field from the From_date section", true)
					&& VerifyElementPresent(ReportsPage.fromDate_month, "Month field from the From_date", true)
					&& VerifyElementPresent(ReportsPage.fromDate_year, "Year field from the From_date", true)) {

				selectByValue(ReportsPage.fromDate_month, from_month, "");
				selectByValue(ReportsPage.fromDate_day, from_day, "");
				selectByValue(ReportsPage.fromDate_year, from_year, "");
			} else {
				System.out.println("The From date fields are not displayed");
			}

			if (VerifyElementPresent(ReportsPage.toDate_day, "Day field from the To_date section", true)
					&& VerifyElementPresent(ReportsPage.toDate_month, "Month field from the To_date section", true)
					&& VerifyElementPresent(ReportsPage.toDate_year, "Year field from the To_date section", true)) {

				selectByValue(ReportsPage.toDate_month, to_month, "");
				selectByValue(ReportsPage.toDate_day, to_day, "");
				selectByValue(ReportsPage.toDate_year, to_year, "");
			} else {
				System.out.println("The To date fields are not displayed");
			}

			sleep(3000);
			click(ReportsPage.generateReport, "Generate report");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * This method is to verify the HIS report for Discharge under the Clinical
	 * widget in reports tab
	 *
	 * @return nothing will be returned
	 */
	public void verifyHISReportForDischargeReport(Hashtable<String, String> data, float timeTaken) throws Throwable {

		try {
			sleep(2000);
			// Variables declaration
			String reportingPeriod = data.get("ReportingPeriod");
			String reportName = data.get("ReportName");
			String site = data.get("SiteInReport");

			// This block of code will extract the text from each web element
			// and
			// then it vl compare it with the data coming from the excel sheet
			assertTextMatching(ReportsPage.reportTitleInReport, reportName, "Report name");
			assertTextMatching(ReportsPage.reportingPeriodInReport, reportingPeriod, "Reporting Period");
			assertTextMatching(ReportsPage.siteOrOfficeInReport, site, "Site/Office");
			click(ReportsPage.saveButton, "Save button");
			reporter.SuccessReport("Report generation time", timeTaken + " secs");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * This method is to generate the Team meeting report in reports tab
	 *
	 * @return nothing will be returned
	 */
	public void generateTeamMeetingReport(Hashtable<String, String> data) throws Throwable {

		try {
			sleep(2000);
			new ReportsPage().Reports_Page();
			click(ReportsPage.teamMeeting, "Team meeting report");
			sleep(10000);
			if (VerifyElementPresent(ReportsPage.teamMeetingReportingPeriod, "Reporting period in Team report", true)
					&& VerifyElementPresent(ReportsPage.patientStatusTeamMeeting, "Patient Status (Team)", true)
					&& VerifyElementPresent(ReportsPage.teamInTeamMeeting, "Team", true)
					&& VerifyElementPresent(ReportsPage.site, "Site/Hospice", true)
					&& VerifyElementPresent(ReportsPage.program, "Program", true)) {

				selectByValue(ReportsPage.teamMeetingReportingPeriod, data.get("Reporting_Period"), "");
				selectByValue(ReportsPage.patientStatusTeamMeeting, data.get("PatientStatus"), "");
				selectByValue(ReportsPage.teamInTeamMeeting, data.get("Team"), "");
				selectByValue(ReportsPage.site, data.get("Site"), "");
				selectByValue(ReportsPage.program, data.get("Program"), "");

			} else {
				System.out.println("The input fields are not displayed");
			}

			sleep(3000);

			click(ReportsPage.generateReport, "Generate report");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * This method is to verify the Team meeting report in reports tab
	 *
	 * @return nothing will be returned
	 */
	public void verifyTeamMeetingReport(Hashtable<String, String> data, float timeTaken) throws Throwable {

		try {
			sleep(2000);

			// This block of code will extract the text from each web element
			// and
			// then it vl compare it with the data coming from the excel sheet
			assertTextMatching(ReportsPage.reportTitleInReport, data.get("ReportName"), "Report name");
			assertTextMatching(ReportsPage.reportingPeriodInReport, data.get("ReportingPeriodInReport"),
					"Reporting Period");
			assertTextMatching(ReportsPage.siteOrOfficeInReport, data.get("SiteInReport"), "Site/Office");
			assertTextMatching(ReportsPage.program, data.get("Program"), "Site/Office");
			assertTextMatching(ReportsPage.selectedTeam, data.get("Team"), "Selected Team");
			assertTextMatching(ReportsPage.patientStatusInReport, data.get("PatientStatus"), "Patient status");
			click(ReportsPage.saveButton, "Save button");
			reporter.SuccessReport("Report generation time", timeTaken + " secs");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * This method is to generate Upcoming F2F and Certifications report in
	 * reports tab
	 *
	 * @return nothing will be returned
	 */
	public void generateUpcomingF2FCertificationsReport(Hashtable<String, String> data) throws Throwable {

		try {
			sleep(2000);
			new ReportsPage().Reports_Page();
			click(ReportsPage.upcomingF2FCertifications, "Upcoming F2F and Certifications");
			sleep(10000);
			type(ReportsPage.warningDays, data.get("WarningDays"), "");
			selectByValue(ReportsPage.warningType, data.get("WarningType"), "");
			selectByValue(ReportsPage.site, data.get("Site"), "");
			click(ReportsPage.generateReport, "Generate report");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * This method is to verify Upcoming F2F and Certifications report in
	 * reports tab
	 *
	 * @return nothing will be returned
	 */
	public void verifyUpcomingF2FCertificationsReport(Hashtable<String, String> data, float timeTaken)
			throws Throwable {

		try {
			sleep(2000);
			// Variables declaration
			String reportTitle = data.get("ReportTitle");
			String warningDays = data.get("WarningDays");
			String warningType = data.get("WarningTypeInReport");
			String site = data.get("Site");

			// This block of code will extract the text from each web element
			// and
			// then it vl compare it with the data coming from the excel sheet
			assertTextMatching(ReportsPage.reportTitleInReport, reportTitle, "Report title");
			assertTextMatching(ReportsPage.warningDaysInReport, warningDays, "Warning days");
			assertTextMatching(ReportsPage.warningTypeInReport, warningType, "Warning Type");
			assertTextMatching(ReportsPage.siteOrOfficeInReport, site, "Site/Office");
			click(ReportsPage.saveButton, "Save button");
			reporter.SuccessReport("Report generation time", timeTaken + " secs");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * This method is to generate Contacts list report in reports tab
	 *
	 * @return nothing will be returned
	 */
	public void generateContactListReport(Hashtable<String, String> data) throws Throwable {

		try {
			sleep(2000);
			String role = data.get("Role");
			String employeeAll = data.get("Employee-All");
			String siteOffice = data.get("Site-Office");

			new ReportsPage().Reports_Page();
			click(ReportsPage.linkContactList, "Contacts list");
			sleep(10000);
			if (VerifyElementPresent(ReportsPage.roleContactsList, "Day field from the From_date section", true)
					&& VerifyElementPresent(ReportsPage.includeContactList, "Month field from the From_date", true)
					&& VerifyElementPresent(ReportsPage.site, "Year field from the From_date", true)) {

				selectByValue(ReportsPage.roleContactsList, role, "");
				selectByValue(ReportsPage.includeContactList, employeeAll, "");
				selectByValue(ReportsPage.site, siteOffice, "");
			} else {
				System.out.println("The From date fields are not displayed");
			}
			sleep(3000);
			click(ReportsPage.generateReport, "Generate report");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * This method is to verify contacts list report in reports tab
	 *
	 * @return nothing will be returned
	 */
	public void verifygenerateContactListReport(Hashtable<String, String> data, float timeTaken) throws Throwable {

		try {
			sleep(2000);
			// Variables declaration
			String roleInReport = data.get("RoleInReport");
			String siteInReport = data.get("Site");
			String include = data.get("Include");
			String reportTitle = data.get("ReportTitle");

			// This block of code will extract the text from each web element
			// and
			// then it vl compare it with the data coming from the excel sheet
			assertTextMatching(ReportsPage.roleInContactsListReport, roleInReport, "Role");
			assertTextMatching(ReportsPage.includeInReport, include, "");
			assertTextMatching(ReportsPage.siteOrOfficeInReport, siteInReport, "Site/Office");
			assertTextMatching(ReportsPage.reportTitleInReport, reportTitle, "Report name");
			click(ReportsPage.saveButton, "Save button");
			reporter.SuccessReport("Report generation time", timeTaken + " secs");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * This method is to generate Bereaved person list report in reports tab
	 *
	 * @return nothing will be returned
	 */
	public void generateBereavedPersonsReport(Hashtable<String, String> data) throws Throwable {

		try {
			sleep(2000);
			String from_month = data.get("fromDate_Month");
			String from_day = data.get("fromDate_Day");
			String from_year = data.get("fromDate_Year");
			String to_month = data.get("toDate_Month");
			String to_day = data.get("toDate_Day");
			String to_year = data.get("toDate_Year");
			String site = data.get("Site");
			String program = data.get("Program");

			new ReportsPage().Reports_Page();
			click(ReportsPage.linkBereavedPersons, "Bereaved Persons list");
			sleep(10000);
			if (VerifyElementPresent(ReportsPage.fromDate_day, "Day field from the From_date section", true)
					&& VerifyElementPresent(ReportsPage.fromDate_month, "Month field from the From_date", true)
					&& VerifyElementPresent(ReportsPage.fromDate_year, "Year field from the From_date", true)) {

				selectByValue(ReportsPage.fromDate_month, from_month, "");
				selectByValue(ReportsPage.fromDate_day, from_day, "");
				selectByValue(ReportsPage.fromDate_year, from_year, "");
			} else {
				System.out.println("The From date fields are not displayed");
			}

			if (VerifyElementPresent(ReportsPage.toDate_day, "Day field from the To_date section", true)
					&& VerifyElementPresent(ReportsPage.toDate_month, "Month field from the To_date section", true)
					&& VerifyElementPresent(ReportsPage.toDate_year, "Year field from the To_date section", true)) {

				selectByValue(ReportsPage.toDate_month, to_month, "");
				selectByValue(ReportsPage.toDate_day, to_day, "");
				selectByValue(ReportsPage.toDate_year, to_year, "");
			} else {
				System.out.println("The To date fields are not displayed");
			}

			sleep(3000);
			selectByValue(ReportsPage.site, site, "");
			selectByValue(ReportsPage.programInBereavedPerson, program, "");
			click(ReportsPage.generateReport, "Generate report");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * This method is to verify Bereaved Persons report in reports tab
	 *
	 * @return nothing will be returned
	 */
	public void verifyBereavedPersonstReport(Hashtable<String, String> data, float timeTaken) throws Throwable {

		try {
			sleep(2000);
			// Variables declaration
			String reportTitle = data.get("ReportTitle");
			String programNameInReport = data.get("Program_Report");
			String reportingPeriod = data.get("ReportingPeriod");
			String siteInReport = data.get("SiteInReport");

			// This block of code will extract the text from each web element
			// and
			// then it vl compare it with the data coming from the excel sheet
			assertTextMatching(ReportsPage.reportingPeriodInReport, reportingPeriod, "reporting period");
			assertTextMatching(ReportsPage.siteOrOfficeInReport, siteInReport, "Site/Office");
			assertTextMatching(ReportsPage.reportTitleInReport, reportTitle, "Report name");
			assertTextMatching(ReportsPage.programInReport, programNameInReport, "Program name");
			click(ReportsPage.saveButton, "Save button");
			reporter.SuccessReport("Report generation time", timeTaken + " secs");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * This method is to generate Referrals by Referral Source Report in reports
	 * tab
	 *
	 * @return nothing will be returned
	 */
	public void generateReferralsbyReferralSourceReport(Hashtable<String, String> data) throws Throwable {

		try {
			sleep(2000);
			String from_month = data.get("fromDate_Month");
			String from_day = data.get("fromDate_Day");
			String from_year = data.get("fromDate_Year");
			String to_month = data.get("toDate_Month");
			String to_day = data.get("toDate_Day");
			String to_year = data.get("toDate_Year");
			String site = data.get("Site");
			String program = data.get("Program");
			String referrralSourceType = data.get("ReferrralSourceType");
			String statusAfterReferral = data.get("StatusAfterReferral");

			new ReportsPage().Reports_Page();
			click(ReportsPage.linkReferralsbyReferralSource, "Referrals by referral source report");
			sleep(10000);
			if (VerifyElementPresent(ReportsPage.fromDate_day, "Day field from the From_date section", true)
					&& VerifyElementPresent(ReportsPage.fromDate_month, "Month field from the From_date", true)
					&& VerifyElementPresent(ReportsPage.fromDate_year, "Year field from the From_date", true)) {

				selectByValue(ReportsPage.fromDate_month, from_month, "");
				selectByValue(ReportsPage.fromDate_day, from_day, "");
				selectByValue(ReportsPage.fromDate_year, from_year, "");
			} else {
				System.out.println("The From date fields are not displayed");
			}

			if (VerifyElementPresent(ReportsPage.toDate_day, "Day field from the To_date section", true)
					&& VerifyElementPresent(ReportsPage.toDate_month, "Month field from the To_date section", true)
					&& VerifyElementPresent(ReportsPage.toDate_year, "Year field from the To_date section", true)) {

				selectByValue(ReportsPage.toDate_month, to_month, "");
				selectByValue(ReportsPage.toDate_day, to_day, "");
				selectByValue(ReportsPage.toDate_year, to_year, "");
			} else {
				System.out.println("The To date fields are not displayed");
			}

			sleep(3000);
			selectByValue(ReportsPage.referralSourceType, referrralSourceType, "");
			selectByValue(ReportsPage.statusAfterReferral, statusAfterReferral, "");
			selectByValue(ReportsPage.site, site, "");
			selectByValue(ReportsPage.programInReferral, program, "");
			click(ReportsPage.generateReport, "Generate report");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * This method is to verify Referrals by Referral Source Report report in
	 * reports tab
	 *
	 * @return nothing will be returned
	 */
	public void verifyReferralsbyReferralSourceReport(Hashtable<String, String> data, float timeTaken)
			throws Throwable {

		try {
			sleep(2000);
			// Variables declaration
			String reportTitle = data.get("ReportTitle");
			String programNameInReport = data.get("Program_Report");
			String reportingPeriod = data.get("ReportingPeriod");
			String siteInReport = data.get("SiteInReport");
			String referrralSourceType = data.get("ReferrralSourceType");
			String statusAfterReferral = data.get("StatusAfterReferral");

			// This block of code will extract the text from each web element
			// and
			// then it vl compare it with the data coming from the excel sheet
			assertTextMatching(ReportsPage.reportingPeriodInReport, reportingPeriod, "reporting period");
			assertTextMatching(ReportsPage.siteOrOfficeInReport, siteInReport, "Site/Office");
			assertTextMatching(ReportsPage.reportTitleInReport, reportTitle, "Report name");
			assertTextMatching(ReportsPage.referralSourceTypeInReport, referrralSourceType, "Referral source type");
			assertTextMatching(ReportsPage.statusAfterReferralInReport, statusAfterReferral, "Status after referral");
			assertTextMatching(ReportsPage.programInReport, programNameInReport, "Program name");
			click(ReportsPage.saveButton, "Save button");
			reporter.SuccessReport("Report generation time", timeTaken + " secs");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * This method is to generate Patient Days by Level of Care Report in
	 * reports tab
	 *
	 * @return nothing will be returned
	 */
	public void generatePatientDaysbyLevelofCareReport(Hashtable<String, String> data) throws Throwable {

		try {
			sleep(2000);
			String from_month = data.get("fromDate_Month");
			String from_day = data.get("fromDate_Day");
			String from_year = data.get("fromDate_Year");
			String to_month = data.get("toDate_Month");
			String to_day = data.get("toDate_Day");
			String to_year = data.get("toDate_Year");
			String site = data.get("Site");
			String patientStatus = data.get("PatientStatus");

			new ReportsPage().Reports_Page();
			click(ReportsPage.linkPatientDaysbyLevelofCare, "Patient Days by Level of Care Report");
			sleep(10000);
			if (VerifyElementPresent(ReportsPage.fromDate_day, "Day field from the From_date section", true)
					&& VerifyElementPresent(ReportsPage.fromDate_month, "Month field from the From_date", true)
					&& VerifyElementPresent(ReportsPage.fromDate_year, "Year field from the From_date", true)) {

				selectByValue(ReportsPage.fromDate_month, from_month, "");
				selectByValue(ReportsPage.fromDate_day, from_day, "");
				selectByValue(ReportsPage.fromDate_year, from_year, "");
			} else {
				System.out.println("The From date fields are not displayed");
			}

			if (VerifyElementPresent(ReportsPage.toDate_day, "Day field from the To_date section", true)
					&& VerifyElementPresent(ReportsPage.toDate_month, "Month field from the To_date section", true)
					&& VerifyElementPresent(ReportsPage.toDate_year, "Year field from the To_date section", true)) {

				selectByValue(ReportsPage.toDate_month, to_month, "");
				selectByValue(ReportsPage.toDate_day, to_day, "");
				selectByValue(ReportsPage.toDate_year, to_year, "");
			} else {
				System.out.println("The To date fields are not displayed");
			}

			sleep(3000);
			selectByValue(ReportsPage.patientStatusPatientDaysByLevelOfCare, patientStatus, "");
			selectByValue(ReportsPage.site, site, "");
			click(ReportsPage.generateReport, "Generate report");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * This method is to verify Patient Days by Level of Care Report report in
	 * reports tab
	 *
	 * @return nothing will be returned
	 */
	public void verifyPatientDaysbyLevelofCareReport(Hashtable<String, String> data, float timeTaken) throws Throwable {

		try {
			sleep(2000);
			// Variables declaration
			String reportTitle = data.get("ReportTitle");
			String patientStatus = data.get("PatientStatusInReport");
			String reportingPeriod = data.get("ReportingPeriod");
			String siteInReport = data.get("SiteInReport");

			// This block of code will extract the text from each web element
			// and
			// then it vl compare it with the data coming from the excel sheet
			assertTextMatching(ReportsPage.reportingPeriodInReport, reportingPeriod, "reporting period");
			assertTextMatching(ReportsPage.siteOrOfficeInReport, siteInReport, "Site/Office");
			assertTextMatching(ReportsPage.reportTitleInReport, reportTitle, "Report name");
			assertTextMatching(ReportsPage.patientStatusInReport, patientStatus, "Patient status in report");

			click(ReportsPage.saveButton, "Save button");
			reporter.SuccessReport("Report generation time", timeTaken + " secs");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * This method is to generate Credit Claim Balance Report in reports tab
	 *
	 * @return nothing will be returned
	 */
	public void generateCreditClaimBalanceReport(Hashtable<String, String> data) throws Throwable {

		try {
			sleep(2000);

			new ReportsPage().Reports_Page();
			click(ReportsPage.linkCreditClaimBalanceReport, "Credit claim balance report");
			sleep(10000);

			sleep(3000);
			selectByValue(ReportsPage.site, data.get("Site"), "");
			selectByValue(ReportsPage.program, data.get("Program"), "");
			click(ReportsPage.generateReport, "Generate report");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * This method is to verify Credit Claim Balance Report report in reports
	 * tab
	 *
	 * @return nothing will be returned
	 */
	public void verifyCreditClaimBalanceReport(Hashtable<String, String> data, float timeTaken) throws Throwable {

		try {
			sleep(2000);
			// Variables declaration
			String reportTitle = data.get("ReportTitle");
			String reportingDate = data.get("ReportingDate");
			String program = data.get("Program");
			String siteInReport = data.get("SiteInReport");

			// This block of code will extract the text from each web element
			// and
			// then it vl compare it with the data coming from the excel sheet
			assertTextMatching(ReportsPage.reportTitleInReport, reportTitle, "Report title");
			assertTextMatching(ReportsPage.siteOrOfficeInReport, siteInReport, "Site/Office");
			assertTextMatching(ReportsPage.programInReport, program, "Program");
			assertTextMatching(ReportsPage.reportingDateInCreditClaimBalanceReport, reportingDate, "Reporting date");
			click(ReportsPage.saveButton, "Save button");
			reporter.SuccessReport("Report generation time", timeTaken + " secs");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
