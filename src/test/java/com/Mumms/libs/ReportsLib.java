package com.Mumms.libs;

import java.util.ArrayList;
import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.Mumms.page.ReportsPage;
import com.Mumms.page.AdminPage;
import com.Mumms.page.HomePage;

public class ReportsLib extends MummsLib {

	public int sleep = 3000;
	public String Church, InsuranceName, HospiceDesc, GroupName;

	/**
	 * This method is to generate the visit report under the Clinical widget in
	 * reports tab
	 *
	 * @return nothing will be returned
	 */
	public void generateVisitReport(Hashtable<String, String> data) throws Throwable {

		sleep(2000);
		String from_month = null;
		String from_day = null;
		String from_year = null;
		String to_month = null;
		String to_day = null;
		String to_year = null;
		if (data.get("fromDate_Month").contains(".")) {

			from_month = data.get("fromDate_Month").substring(0, data.get("fromDate_Month").indexOf("."));

		} else {
			from_month = data.get("fromDate_Month");

		}
		if (data.get("fromDate_Day").contains(".")) {

			from_day = data.get("fromDate_Day").substring(0, data.get("fromDate_Day").indexOf("."));

		} else {
			from_day = data.get("fromDate_Day");

		}
		if (data.get("fromDate_Year").contains(".")) {

			from_year = data.get("fromDate_Year").substring(0, data.get("fromDate_Year").indexOf("."));

		} else {
			from_year = data.get("fromDate_year");

		}
		if (data.get("toDate_Month").contains(".")) {

			to_month = data.get("toDate_Month").substring(0, data.get("toDate_Month").indexOf("."));

		} else {
			to_month = data.get("toDate_Month");

		}
		if (data.get("toDate_Day").contains(".")) {

			to_day = data.get("toDate_Day").substring(0, data.get("toDate_Day").indexOf("."));

		} else {
			to_day = data.get("toDate_Day");

		}
		if (data.get("toDate_Year").contains(".")) {

			to_year = data.get("toDate_Year").substring(0, data.get("toDate_Year").indexOf("."));

		} else {
			to_year = data.get("toDate_Year");

		}
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
	}

	/**
	 * This method is to verify the visit report under the Clinical widget in
	 * reports tab
	 *
	 * @return nothing will be returned
	 */
	public void verifyVisitReport(Hashtable<String, String> data) throws Throwable {

		sleep(2000);
		// Variables declaration
		String reportingPeriod = data.get("ReportingPeriod");
		String reportName = data.get("ReportName");
		String visitType = data.get("VisitType_Report");
		String program = data.get("Program");

		// This block of code will extract the text from each web element and
		// then it vl compare it with the data coming from the excel sheet
		assertTextMatching(ReportsPage.reportTitleInReport, reportName, "Report name");
		assertTextMatching(ReportsPage.reportingPeriodInReport, reportingPeriod, "Reporting Period");
		assertTextMatching(ReportsPage.visitTypeInReport, visitType, "Visit type");
		assertTextMatching(ReportsPage.programInReport, program, "Program name");

	}

	/**
	 * This method is to generate the Month END AR Reconciliation report under
	 * the Financial widget in reports tab
	 *
	 * @return nothing will be returned
	 */
	public void generateMonthEndARReconciliationReport(Hashtable<String, String> data) throws Throwable {

		sleep(2000);
		String from_month = null;
		String from_day = null;
		String from_year = null;
		String to_month = null;
		String to_day = null;
		String to_year = null;
		if (data.get("fromDate_Month").contains(".")) {

			from_month = data.get("fromDate_Month").substring(0, data.get("fromDate_Month").indexOf("."));

		} else {
			from_month = data.get("fromDate_Month");

		}
		if (data.get("fromDate_Day").contains(".")) {

			from_day = data.get("fromDate_Day").substring(0, data.get("fromDate_Day").indexOf("."));

		} else {
			from_day = data.get("fromDate_Day");

		}
		if (data.get("fromDate_Year").contains(".")) {

			from_year = data.get("fromDate_Year").substring(0, data.get("fromDate_Year").indexOf("."));

		} else {
			from_year = data.get("fromDate_year");

		}
		if (data.get("toDate_Month").contains(".")) {

			to_month = data.get("toDate_Month").substring(0, data.get("toDate_Month").indexOf("."));

		} else {
			to_month = data.get("toDate_Month");

		}
		if (data.get("toDate_Day").contains(".")) {

			to_day = data.get("toDate_Day").substring(0, data.get("toDate_Day").indexOf("."));

		} else {
			to_day = data.get("toDate_Day");

		}
		if (data.get("toDate_Year").contains(".")) {

			to_year = data.get("toDate_Year").substring(0, data.get("toDate_Year").indexOf("."));

		} else {
			to_year = data.get("toDate_Year");

		}
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
	}

	/**
	 * This method is to verify the visit report under the Clinical widget in
	 * reports tab
	 *
	 * @return nothing will be returned
	 */
	public void verifyMonthEndARReconciliationReport(Hashtable<String, String> data) throws Throwable {

		sleep(2000);
		// Variables declaration
		String reportingPeriod = data.get("ReportingPeriod");
		String reportName = data.get("ReportName");
		String program = data.get("Program");

		// This block of code will extract the text from each web element and
		// then it vl compare it with the data coming from the excel sheet
		assertTextMatching(ReportsPage.reportTitleInReport, reportName, "Report name");
		assertTextMatching(ReportsPage.reportingPeriodInReport, reportingPeriod, "Reporting Period");
		assertTextMatching(ReportsPage.programInReport, program, "Program name");

	}

	/**
	 * This method is to generate the Monthly revenue report under the Financial
	 * widget in reports tab
	 *
	 * @return nothing will be returned
	 */
	public void generateMonthlyRevenueReport(Hashtable<String, String> data) throws Throwable {

		sleep(2000);
		String from_month = null;
		String from_day = null;
		String from_year = null;
		String to_month = null;
		String to_day = null;
		String to_year = null;
		if (data.get("fromDate_Month").contains(".")) {

			from_month = data.get("fromDate_Month").substring(0, data.get("fromDate_Month").indexOf("."));

		} else {
			from_month = data.get("fromDate_Month");

		}
		if (data.get("fromDate_Day").contains(".")) {

			from_day = data.get("fromDate_Day").substring(0, data.get("fromDate_Day").indexOf("."));

		} else {
			from_day = data.get("fromDate_Day");

		}
		if (data.get("fromDate_Year").contains(".")) {

			from_year = data.get("fromDate_Year").substring(0, data.get("fromDate_Year").indexOf("."));

		} else {
			from_year = data.get("fromDate_year");

		}
		if (data.get("toDate_Month").contains(".")) {

			to_month = data.get("toDate_Month").substring(0, data.get("toDate_Month").indexOf("."));

		} else {
			to_month = data.get("toDate_Month");

		}
		if (data.get("toDate_Day").contains(".")) {

			to_day = data.get("toDate_Day").substring(0, data.get("toDate_Day").indexOf("."));

		} else {
			to_day = data.get("toDate_Day");

		}
		if (data.get("toDate_Year").contains(".")) {

			to_year = data.get("toDate_Year").substring(0, data.get("toDate_Year").indexOf("."));

		} else {
			to_year = data.get("toDate_Year");

		}
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
	}

	/**
	 * This method is to verify the Monthly revenue report under the Financial
	 * widget in reports tab
	 *
	 * @return nothing will be returned
	 */
	public void verifyMonthlyRevenueReport(Hashtable<String, String> data) throws Throwable {

		sleep(2000);
		// Variables declaration
		String reportingPeriod = data.get("ReportingPeriod");
		String reportName = data.get("ReportName");
		String program = data.get("Program");

		// This block of code will extract the text from each web element and
		// then it vl compare it with the data coming from the excel sheet
		assertTextMatching(ReportsPage.reportTitleInReport, reportName, "Report name");
		assertTextMatching(ReportsPage.reportingPeriodInReport, reportingPeriod, "Reporting Period");
		assertTextMatching(ReportsPage.programInReport, program, "Program name");

	}

	/**
	 * This method is to generate the Payments Adjustments Report By Date Report
	 * report under the Financial widget in reports tab
	 *
	 * @return nothing will be returned
	 */
	public void generatePaymentsAdjustmentsReportByDateReport(Hashtable<String, String> data) throws Throwable {

		sleep(2000);
		String from_month = null;
		String from_day = null;
		String from_year = null;
		String to_month = null;
		String to_day = null;
		String to_year = null;
		if (data.get("fromDate_Month").contains(".")) {

			from_month = data.get("fromDate_Month").substring(0, data.get("fromDate_Month").indexOf("."));

		} else {
			from_month = data.get("fromDate_Month");

		}
		if (data.get("fromDate_Day").contains(".")) {

			from_day = data.get("fromDate_Day").substring(0, data.get("fromDate_Day").indexOf("."));

		} else {
			from_day = data.get("fromDate_Day");

		}
		if (data.get("fromDate_Year").contains(".")) {

			from_year = data.get("fromDate_Year").substring(0, data.get("fromDate_Year").indexOf("."));

		} else {
			from_year = data.get("fromDate_year");

		}
		if (data.get("toDate_Month").contains(".")) {

			to_month = data.get("toDate_Month").substring(0, data.get("toDate_Month").indexOf("."));

		} else {
			to_month = data.get("toDate_Month");

		}
		if (data.get("toDate_Day").contains(".")) {

			to_day = data.get("toDate_Day").substring(0, data.get("toDate_Day").indexOf("."));

		} else {
			to_day = data.get("toDate_Day");

		}
		if (data.get("toDate_Year").contains(".")) {

			to_year = data.get("toDate_Year").substring(0, data.get("toDate_Year").indexOf("."));

		} else {
			to_year = data.get("toDate_Year");

		}
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
	}

	/**
	 * This method is to verify the Payments Adjustments Report By Date report
	 * under the Financial widget in reports tab
	 *
	 * @return nothing will be returned
	 */
	public void verifyPaymentsAdjustmentsReportByDateReport(Hashtable<String, String> data) throws Throwable {

		sleep(2000);
		// Variables declaration
		String reportingPeriod = data.get("ReportingPeriod");
		String reportName = data.get("ReportName");
		String program = data.get("Program");

		// This block of code will extract the text from each web element and
		// then it vl compare it with the data coming from the excel sheet
		assertTextMatching(ReportsPage.reportTitleInReport, reportName, "Report name");
		assertTextMatching(ReportsPage.reportingPeriodInReport, reportingPeriod, "Reporting Period");
		assertTextMatching(ReportsPage.programInReport, program, "Program name");

	}

	/**
	 * This method is to generate the HIS Report for Admission report under the
	 * clinical widget in reports tab
	 *
	 * @return nothing will be returned
	 */
	public void generateHISReportForAdmissionsReport(Hashtable<String, String> data) throws Throwable {

		sleep(2000);
		String from_month = null;
		String from_day = null;
		String from_year = null;
		String to_month = null;
		String to_day = null;
		String to_year = null;
		if (data.get("fromDate_Month").contains(".")) {

			from_month = data.get("fromDate_Month").substring(0, data.get("fromDate_Month").indexOf("."));

		} else {
			from_month = data.get("fromDate_Month");

		}
		if (data.get("fromDate_Day").contains(".")) {

			from_day = data.get("fromDate_Day").substring(0, data.get("fromDate_Day").indexOf("."));

		} else {
			from_day = data.get("fromDate_Day");

		}
		if (data.get("fromDate_Year").contains(".")) {

			from_year = data.get("fromDate_Year").substring(0, data.get("fromDate_Year").indexOf("."));

		} else {
			from_year = data.get("fromDate_year");

		}
		if (data.get("toDate_Month").contains(".")) {

			to_month = data.get("toDate_Month").substring(0, data.get("toDate_Month").indexOf("."));

		} else {
			to_month = data.get("toDate_Month");

		}
		if (data.get("toDate_Day").contains(".")) {

			to_day = data.get("toDate_Day").substring(0, data.get("toDate_Day").indexOf("."));

		} else {
			to_day = data.get("toDate_Day");

		}
		if (data.get("toDate_Year").contains(".")) {

			to_year = data.get("toDate_Year").substring(0, data.get("toDate_Year").indexOf("."));

		} else {
			to_year = data.get("toDate_Year");

		}
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
	}

	/**
	 * This method is to verify the HIS report for Admission under the Clinical
	 * widget in reports tab
	 *
	 * @return nothing will be returned
	 */
	public void verifyHISReportForAdmissionReport(Hashtable<String, String> data) throws Throwable {

		sleep(2000);
		// Variables declaration
		String reportingPeriod = data.get("ReportingPeriod");
		String reportName = data.get("ReportName");
		String program = data.get("Program");
		String site = data.get("Site");

		// This block of code will extract the text from each web element and
		// then it vl compare it with the data coming from the excel sheet
		assertTextMatching(ReportsPage.reportTitleInReport, reportName, "Report name");
		assertTextMatching(ReportsPage.reportingPeriodInReport, reportingPeriod, "Reporting Period");
		assertTextMatching(ReportsPage.siteOrOfficeInReport, site, "Site/Office");

	}
	/**
	 * This method is to generate the HIS Report for Discharge report under the
	 * clinical widget in reports tab
	 *
	 * @return nothing will be returned
	 */
	public void generateHISReportForDischargeReport(Hashtable<String, String> data) throws Throwable {

		sleep(2000);
		String from_month = null;
		String from_day = null;
		String from_year = null;
		String to_month = null;
		String to_day = null;
		String to_year = null;
		if (data.get("fromDate_Month").contains(".")) {

			from_month = data.get("fromDate_Month").substring(0, data.get("fromDate_Month").indexOf("."));

		} else {
			from_month = data.get("fromDate_Month");

		}
		if (data.get("fromDate_Day").contains(".")) {

			from_day = data.get("fromDate_Day").substring(0, data.get("fromDate_Day").indexOf("."));

		} else {
			from_day = data.get("fromDate_Day");

		}
		if (data.get("fromDate_Year").contains(".")) {

			from_year = data.get("fromDate_Year").substring(0, data.get("fromDate_Year").indexOf("."));

		} else {
			from_year = data.get("fromDate_year");

		}
		if (data.get("toDate_Month").contains(".")) {

			to_month = data.get("toDate_Month").substring(0, data.get("toDate_Month").indexOf("."));

		} else {
			to_month = data.get("toDate_Month");

		}
		if (data.get("toDate_Day").contains(".")) {

			to_day = data.get("toDate_Day").substring(0, data.get("toDate_Day").indexOf("."));

		} else {
			to_day = data.get("toDate_Day");

		}
		if (data.get("toDate_Year").contains(".")) {

			to_year = data.get("toDate_Year").substring(0, data.get("toDate_Year").indexOf("."));

		} else {
			to_year = data.get("toDate_Year");

		}
		new ReportsPage().Reports_Page();
		click(ReportsPage.hisReportForDischarge, "HIS report for Admission");
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
	}

	/**
	 * This method is to verify the HIS report for Discharge under the Clinical
	 * widget in reports tab
	 *
	 * @return nothing will be returned
	 */
	public void verifyHISReportForDischargeReport(Hashtable<String, String> data) throws Throwable {

		sleep(2000);
		// Variables declaration
		String reportingPeriod = data.get("ReportingPeriod");
		String reportName = data.get("ReportName");
		String program = data.get("Program");
		String site = data.get("Site");

		// This block of code will extract the text from each web element and
		// then it vl compare it with the data coming from the excel sheet
		assertTextMatching(ReportsPage.reportTitleInReport, reportName, "Report name");
		assertTextMatching(ReportsPage.reportingPeriodInReport, reportingPeriod, "Reporting Period");
		assertTextMatching(ReportsPage.siteOrOfficeInReport, site, "Site/Office");

	}

}
