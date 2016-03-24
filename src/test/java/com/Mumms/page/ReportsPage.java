package com.Mumms.page;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import com.automation.accelerators.ActionEngine;

public class ReportsPage extends ActionEngine {

	public static By newReportButton;
	public static By accountsAndContactsNode;
	public static By accountsChildNode;
	public static By createButton;
	public static By fromDate;
	public static By addButton;
	public static By add_FilterByDropDown;
	public static By byAccountNameOption;
	public static By add_FilterComparator;
	public static By byEqualsOption;
	public static By add_FilterInputBox;
	public static By add_FilterOk;
	public static By runReport;
	public static By showDropdownXpath;
	public static By allAccountsXpath;
	public static By visitReport;
	public static By monthEndARReconciliation;
	public static By monthlyRevenue;
	public static By hisReportForAdmission;
	public static By hisReportForDischarge;
	public static By teamMeeting;
	public static By upcomingF2FCertifications;
	public static By fromDate_month;
	public static By fromDate_day;
	public static By fromDate_year;
	public static By toDate_month;
	public static By toDate_day;
	public static By toDate_year;
	public static By visitType;
	public static By generateReport;
	public static By exportButton;
	public static By exportOptions;
	public static By reportTitleBeforeReport;
	public static By reportTitleInReport;
	public static By reportingPeriodInReport;
	public static By visitTypeInReport;
	public static By siteOrOfficeInReport;
	public static By program;
	public static By programInReport;
	public static By paymentAdjustmentsReportByDate;
	public static By teamMeetingReport;
	public static By teamMeetingReportingPeriod;
	public static By patientStatusTeamMeeting;
	public static By teamInTeamMeetingReport;
	public static By site;
	public static By saveButton;
	public static By selectedTeam;
	public static By patientStatusInReport;
	public static By roleContactsList;
	public static By includeContactList;
	public static By roleInContactsListReport;
	public static By includeInReport;
	public static By programInBereavedPerson;
	public static By referralSourceType;
	public static By statusAfterReferral;
	public static By programInReferral;
	public static By referralSourceTypeInReport;
	public static By statusAfterReferralInReport;
	public static By patientStatusPatientDaysByLevelOfCare;
	public static By warningDays;
	public static By warningType;
	public static By linkContactList;
	public static By linkBereavedPersons;
	public static By linkReferralsbyReferralSource;
	public static By linkPatientDaysbyLevelofCare;
	public static By warningDaysInReport;
	public static By warningTypeInReport;
	public static By linkCreditClaimBalanceReport;
	public static By reportingDateInCreditClaimBalanceReport;
	public static By teamInTeamMeeting;

	public void Reports_Page()

	{
		{

			newReportButton = By.xpath(".//*[@value='New Report...']");
			accountsAndContactsNode = By.xpath(".//span[text()='Accounts & Contacts']");
			accountsChildNode = By.xpath(".//span[text()='Accounts']");
			createButton = By.xpath(".//input[@value='Create']");
			/*
			 * showDropDown = By.xpath(".//*[@name='scope']"); dateFieldDropDown
			 * = By.xpath(".//*[@name='dateColumn']");
			 */
			fromDate = By.xpath(".//*[@name='startDate']");
			addButton = By.xpath(".//button[text()='Add']");
			add_FilterByDropDown = By.xpath(".//div[contains(@id,'filter-prefix-id')]/following-sibling::div[1]/img");
			byAccountNameOption = By.xpath(".//*[@class='x-combo-list-item'][text()='Account Name']");
			add_FilterComparator = By.xpath(".//div[contains(@id,'filter-prefix-id')]/following-sibling::div[2]/img");
			byEqualsOption = By.xpath(".//*[contains(@class,'x-combo-list-item')][text()='equals']");
			add_FilterInputBox = By.xpath(".//div[contains(@id,'filter-prefix-id')]/following-sibling::div[3]/input");
			showDropdownXpath = By.xpath(".//*[@name='scope']");
			allAccountsXpath = By.xpath(".//*[text()='All accounts']");
			add_FilterOk = By.xpath(".//button[text()='OK']");
			runReport = By.xpath(".//button[text()='Run Report']");

			// 01-03-2016

			visitReport = By.xpath("//div[text()='Visit Report']");
			monthEndARReconciliation = By.xpath(
					"//div[@class='gwt-Label hb-uneditable-text-clickable' and text()='Month End AR Reconciliation']");
			monthlyRevenue = By
					.xpath("//div[@class='gwt-Label hb-uneditable-text-clickable' and text()='Monthly Revenue']");
			hisReportForAdmission = By.xpath("//div[text()='HIS Report For Admission']");
			hisReportForDischarge = By.xpath("//div[text()='HIS Report For Discharge']");
			teamMeeting = By.xpath("//div[text()='Team Meeting']");
			paymentAdjustmentsReportByDate = By.xpath(
					"//div[@class='gwt-Label hb-uneditable-text-clickable' and text()='Payments and Adjustments Report by date']");
			upcomingF2FCertifications = By.xpath("//div[text()='Upcoming F2F and Certifications']");
			linkContactList = By.xpath("//div[text()='Contact List']");
			linkBereavedPersons = By.xpath("//div[text()='Bereaved Persons']");
			linkReferralsbyReferralSource = By.xpath("//div[text()='Referrals by Referral Source']");
			linkPatientDaysbyLevelofCare = By.xpath("//div[text()='Patient Days by Level of Care']");
			linkPatientDaysbyLevelofCare = By.xpath("//div[text()='Patient Days by Level of Care']");
			linkCreditClaimBalanceReport = By.xpath("//div[text()='Credit Claim Balance Report']");

			fromDate_month = By
					.xpath("//div[@id='gwt-debug-p_from_date']//select[@class='month hb-date-dropdown-novalue']");
			fromDate_day = By
					.xpath("//div[@id='gwt-debug-p_from_date']//select[@class='day hb-date-dropdown-novalue']");
			fromDate_year = By
					.xpath("//div[@id='gwt-debug-p_from_date']//select[@class='year hb-date-dropdown-novalue']");
			toDate_month = By
					.xpath("//div[@id='gwt-debug-p_to_date']//select[@class='month hb-date-dropdown-novalue']");
			toDate_day = By.xpath("//div[@id='gwt-debug-p_to_date']//select[@class='day hb-date-dropdown-novalue']");
			toDate_year = By.xpath("//div[@id='gwt-debug-p_to_date']//select[@class='year hb-date-dropdown-novalue']");
			visitType = By.xpath("//select[@id='gwt-debug-p_visit_type']");
			program = By.xpath("//select[@id='gwt-debug-p_program_id']");
			programInBereavedPerson = By.xpath("//select[@id='gwt-debug-p_program_optional_id']");
			generateReport = By.xpath("//button[text()='GENERATE REPORT']");
			exportButton = By.xpath("//button[@id='gwt-debug-exportButton']");
			exportOptions = By.xpath("//select[@id='reportExportOptionsSelect']");
			reportTitleBeforeReport = By.xpath("//div[contains(@class,'hb-float-title')]");
			reportTitleInReport = By.xpath("//div[@class='hb-float-title']");
			reportingPeriodInReport = By.xpath("//span[contains(text(),'REPORTING PERIOD')]");
			visitTypeInReport = By.xpath("//span[contains(text(),'VISIT TYPE:')]");
			siteOrOfficeInReport = By.xpath("//span[contains(text(),'SITE/OFFICE')]");
			programInReport = By.xpath("//span[contains(text(),'PROGRAM')]");
			teamMeetingReportingPeriod = By.xpath("//select[@id='gwt-debug-days_back']");
			patientStatusTeamMeeting = By.xpath("//select[@id='gwt-debug-Choose_Patient_Status_Filter']");
			teamInTeamMeetingReport = By.xpath("//select[@id='gwt-debug-p_teampersonlist_id']");
			selectedTeam = By.xpath("//span[contains(text(),'TEAM:')]");
			site = By.xpath("//div[text()='Site/Office:']/parent::*/parent::*//select[@class='hb-textbox']");
			saveButton = By.id("gwt-debug-data-modal-save-button");
			patientStatusInReport = By.xpath("//span[contains(text(),'PATIENT STATUS:')]");

			roleContactsList = By.xpath("//select[@class='hb-textbox-novalue']");
			includeContactList = By.id("gwt-debug-p_employee_filter");
			roleInContactsListReport = By.xpath("//span[contains(text(),'ROLE:')]");
			includeInReport = By.xpath("//span[contains(text(),'Include')]");

			referralSourceType = By.xpath("//select[@class='hb-textbox-subdued']");
			statusAfterReferral = By.xpath("//select[@id='gwt-debug-p_referral_status']");
			programInReferral = By
					.xpath("//div[text()='Programs:']/parent::*/parent::*//select[@class='hb-textbox-required']");

			referralSourceTypeInReport = By.xpath("//span[contains(text(),'REFFERAL SOURCE TYPE:')]");
			statusAfterReferralInReport = By.xpath("//span[contains(text(),'STATUS AFTER REFERRAL:')]");

			patientStatusPatientDaysByLevelOfCare = By.xpath("//select[@id='gwt-debug-p_patient_group']");

			warningDays = By.xpath("input[@id='gwt-debug-p_warning_days']");
			warningType = By.xpath("//select[@id='gwt-debug-p_cert_warning_type']");

			warningDaysInReport = By.xpath("//span[contains(text(),'WARNING DAYS:')]");
			warningTypeInReport = By.xpath("//span[contains(text(),'WARNING TYPE:')]");

			reportingDateInCreditClaimBalanceReport = By.xpath("//span[contains(text(),'REPORTING DATE')]");
			teamInTeamMeeting = By.xpath("//select[@id='gwt-debug-p_teampersonlist_id']");

		}
	}
}