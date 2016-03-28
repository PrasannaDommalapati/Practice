package com.Mumms.page;

import org.openqa.selenium.By;
import com.automation.accelerators.ActionEngine;

public class ReportsPage extends ActionEngine {

	public static By ReportIcon;
	public static By ReportTab;
	public static By MedlineReport;
	public static By BeginDateMonth;
	public static By BeginDateDay;
	public static By BeginDateYear;
	public static By EndDateMonth;
	public static By EndDateDay;
	public static By EndDateYear;
	public static By GenerateReport;
	public static By MedlineReportHeader;
	
	public static By MedlineFileType;
	public static By MedlineFileDownload;
	public static By MedlineFirstName;
	public static By MedlineLastName;
	public static By MedlineFacility;
	public static By MedlineStreet;
	public static By MedlineRoomNumber;
	public static By MedlineCity;
	public static By MedlineState;
	public static By MedlineCounty;
	public static By MedlineZip;
	public static By MedlineCountry;
	public static By MedlineTeam;
	public static By MedlinePayer;
	public static By MedlineHHRG;
	public static By MedlinePatientID;
	public static By MedlineICD10_1;
	public static By MedlineICD10_2;
	public static By MedlineICD10_3;
	public static By MedlineICD10_4;
	public static By MedlinePhone;
	public static By MedlineNotes;
	public static By CAHPSLink;
	public static By CAHPSMonth;
	public static By CAHPSYear;
	
	//03222016
	public static By CAHPHeader;
	public static By CAHPProvideName;
	public static By CAHPBranch;
	public static By CAHPProvideID;
	public static By CAHPNPI;
	public static By CAHPFacilityName;
	public static By CAHPSampleMonth;
	public static By CAHPSampleYear;
	public static By CAHPTotalCharges;
	
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
		 
		ReportIcon = By.xpath(".//*[@id='gwt-debug-reports-module-button']/tbody/tr[1]/td/div/img");
		ReportTab = By.xpath(".//*[@value='New Report...']");
		MedlineReport = By.xpath("//div[text()='Medline Report']");
		BeginDateMonth = By.xpath(".//*[@id='gwt-debug-p_from_date']//select[contains(@class,'month')]");
		BeginDateDay = By.xpath(".//*[@id='gwt-debug-p_from_date']//select[contains(@class,'day')]");
		BeginDateYear = By.xpath(".//*[@id='gwt-debug-p_from_date']//select[contains(@class,'year')]");
		EndDateMonth = By.xpath(".//*[@id='gwt-debug-p_to_date']//select[contains(@class,'month')]");
		EndDateDay = By.xpath(".//*[@id='gwt-debug-p_to_date']//select[contains(@class,'day')]");
		EndDateYear = By.xpath(".//*[@id='gwt-debug-p_to_date']//select[contains(@class,'year')]");
		GenerateReport = By.xpath("//button[text()='GENERATE REPORT']");
		MedlineReportHeader = By.xpath("//div[@class='draggable-label hb-mouse-over-dragable']//div[text()='Medline Report']");
		MedlineFileType = By.xpath("//label[text()='Export As:']");
		MedlineFileDownload = By.xpath("//button[text()='Download']");
		MedlineFirstName = By.xpath("//span[text()='First Name']");
		MedlineLastName = By.xpath("//span[text()='LastName']");
		MedlineFacility = By.xpath("//div[text()='Facility']");
		MedlineStreet = By.xpath("//span[text()='Street']");
		MedlineRoomNumber = By.xpath("//span[text()='Room Number']");
		MedlineCity = By.xpath("//span[text()='City']");
		MedlineState = By.xpath("//span[text()='State']");
		MedlineCounty = By.xpath("//span[text()='County']");
		MedlineZip = By.xpath("//span[text()='Zip']");
		MedlineCountry = By.xpath("//span[text()='Country']");
		MedlineTeam = By.xpath("//span[text()='Team']");
		MedlinePayer = By.xpath("//span[text()='Payer']");
		MedlineHHRG = By.xpath("//span[text()='HHRG']");
		MedlinePatientID = By.xpath("//span[text()='PatientID']");
		MedlineICD10_1 = By.xpath("//span[text()='ICD10_1']");
		MedlineICD10_2 = By.xpath("//span[text()='ICD10_2']");
		MedlineICD10_3 = By.xpath("//span[text()='ICD10_3']");
		MedlineICD10_4 = By.xpath("//span[text()='ICD10_4']");
		MedlinePhone = By.xpath("//span[text()='Phone']");
		MedlineNotes = By.xpath("//span[text()='Notes']");
		CAHPSLink = By.xpath("//div[@class='GKGO0M2BPK']//div[text()='CAHPS (DSS)']");
		CAHPSMonth = By.xpath("//div[@class='hb-formbox-header hb-vertically-aligned']/following-sibling::table//tr[1]/td[2]/select");
		CAHPSYear = By.xpath("//div[@class='hb-formbox-header hb-vertically-aligned']/following-sibling::table//tr[2]/td[2]/select");
		//GenerateReport = By.xpath("//button[text()='GENERATE REPORT']");
		
		
		CAHPHeader = By.xpath("//div[@class='draggable-label hb-mouse-over-dragable']//div[text()='CAHPS (DSS)']");
		CAHPProvideName = By.xpath("//span[text()='ProviderName']");
		CAHPBranch = By.xpath("//span[text()='Branch']");
		CAHPProvideID = By.xpath("//span[text()='ProviderID']");
		CAHPNPI = By.xpath("//span[text()='NPI']");
		CAHPFacilityName = By.xpath("//span[text()='FacilityName']");
		CAHPSampleMonth= By.xpath("//span[text()='SampleMonth']");
		CAHPSampleYear = By.xpath("//span[text()='SampleYear']");
		CAHPTotalCharges=  By.xpath("//span[text()='TotalLiveDischarges']");
		
		
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