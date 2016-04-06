package com.Mumms.page;

import org.openqa.selenium.By;

import com.automation.accelerators.ActionEngine;
import com.automation.support.ConfiguratorSupport;

public class HomePage extends ActionEngine {

	// public static By filter ;

	public static By AgencyType;
	public static By AgencyAccountType;
	public static By AdminIcon;
	public static By homeIcon;

	//Shiney
	/*public static By  ridhtside_gridvar;
	public static By intractionWidget;
	public static By intraction_text;
	public static By intraction_duration;
	public static By intraction_startdate_mm;
	public static By intraction_startdate_dd;
	public static By intraction_careprovider;
	public static By intraction_Type;
	public static By intraction_startdate_year;
	public static By intraction_tick;
	public static By Widget_close;
	public static By intraction_addIcon;
	public static By intraction_edit;
	public static By intraction_patient;
	public static By intraction_delete;
	 */
	public static By intractionWidget;
	public static By intraction_text;
	public static By intraction_duration;
	public static By intraction_startdate_mm;
	public static By intraction_startdate_dd;
	public static By intraction_careprovider;
	public static By interactionCareProvider_Suggestion;
	public static By intraction_Type;
	public static By intraction_startdate_year;
	public static By intraction_tick;
	public static By Widget_close;
	public static By intraction_addIcon;
	public static By intraction_edit;
	public static By intraction_patient;
	// public static By intraction_delete;
	//  public static By intaraction_editType;
	//public static By  intaction_edit_save;
	// public static By intraction_recorddelete;
	//   public static By deletebutton;

	public static By intraction_searchEditStartdate_mm;
	public static By intraction_searchEditStartdate_dd;
	public static By intraction_searchEditStartdate_year;

	public static By intraction_EditStartdate_mm;
	public static By intraction_EditStartdate_dd;
	public static By intraction_EditStartdate_year;
	public static By intraction_deleteIcon;
	public static By okBtn_popup;
	public static By ridhtside_gridvar;


	public static By patientwithoutdiagnosis_widget;
	public static By patientwithoutdiagnosis_text;
	public static By patientwithoutdiagnosis_close;

	public static By Adrthermometer_Widget;
	public static By Adrthermometer_text;
	public static By Adrthermometer_close;

	public static By arrecap_widget;
	public static By arrecap_text;
	public static By arrecap_close;

	public static By medications;
	public static By medication_text;
	public static By medication_UploadButton;
	public static By medication_tick;
	public static By medication_uploadok;
	public static By medication_details;
	public static By ReportIcon;
	public static By medicareBar;
	public static By selectPatient;
	public static By insuraceType ;
	public static By payerTypeWidget_close;
	public static By DownGridBar;
	public static By payerTypeWidgetVerify;
	public static By medicareGridVerify;
	public static By insuranceAdd;
	public static By primaryInsuranceVerify;


	//Claims Management objects
	public static By VerticalBar;
	public static By ClaimsManagementImg;
	public static By DropArea;
	public static By ClaimHeader;
	public static By PayerType;
	public static By PatientFirstName;
	public static By PatientLastName;
	public static By PatientID;
	public static By PostedMonth;
	public static By PostedDate;
	public static By PostedYear;
	public static By StatusDropdown;
	public static By StatusMonth;
	public static By StatusDate;
	public static By StatusYear;
	public static By NoesTab;
	public static By NoesID;
	public static By NoesFirstName;
	public static By NoesLastName;
	public static By NoesInsurance;
	public static By NoesTOB;
	public static By NoesAPhysician;
	public static By NoesCPhysician;
	public static By NoesOffice;
	public static By NoesStatus;
	public static By OutStandingTab;
	public static By Closeicon;
	public static By Saveicon;

	public static By billingReport;
	public static By billingReport_text;

	public static By  claimsmanagement;
	public static By  claimsmanagement_text;

	public static By claimssubmisssionlogs;
	public static By claimssubmisssionlogs_text;

	//03162016
	public static By ClaimsNotSentGearIcon;
	public static By BillingReportLink;
	public static By RevenueDetailsLink;
	public static By NotSentTab;
	public static By NotSentFirstName;
	public static By BillPrimaryInsurance;
	public static By BillPolicyHolder;
	public static By BillPolicyNumber;
	public static By BillDiganosisCode;
	public static By RevenueFirstName;
	public static By RevenueLastName;
	public static By RevenueID;


	//03172016
	public static By RevenueClaim;
	public static By RevenuePostedDate;
	public static By RevenueStatus;
	public static By RevenueDateRange;
	public static By MainGridID;
	public static By MainGridPostedDate;
	public static By MainGridClaim;
	public static By MainGridDateRange;
	public static By MainGridStatus;
	public static By selectMonth;
	public static By verifyDate;
	public static By verifyDateRange;
	public static By verifyDateRangeNextPatient;
	public static By BillingWidgetsaveButton;

	//03212016
	public static By BillDateRange;
	public static By BillStartDate;
	public static By BillEndDate;
	public static By GenerateClaims;
	public static By ClaimsPayerType;
	public static By ClaimsPatient;
	public static By RevenuePayer;
	public static By RevenueDate;
	public static By ClaimOK;
	public static By ClaimsPatientDrpDwn;
	public static By ClaimsXMLOk;
	public static By RevenueDetailsTickMark;
	public static By BillingTickMark;
	public static By UserName;
	public static By verifyDate1;
	public static By verifyDate2;
	public static By SiteName;

	//public static ConfiguratorSupport configProps = new ConfiguratorSupport("config.properties");

	public void Home_Page()

	{
		AgencyType = By.xpath("//div[contains(@class,'login-info-currentHospice')]");
		AgencyAccountType= By.xpath("//div[text()='RUTH']");
		AdminIcon = By.xpath(".//*[@id='gwt-debug-admin-module-button']/tbody/tr[1]/td/div/img");
		homeIcon = By.xpath(".//*[@id='gwt-debug-home-button']/tbody/tr[1]/td/div/img");
		ReportIcon = By.xpath(".//*[@id='gwt-debug-reports-module-button']/tbody/tr[1]/td/div/img");


		//2nd March
		ridhtside_gridvar=By.xpath(".//div[@class='hb-drawer hb-dance-floor-z hb-listing-drawer hb-left-grip-bar']");

		intractionWidget=By.xpath("//div[@class='hb-start-page-content']//img[contains(@src, 'ezbr8WVkrAAAAAElFTkSuQmCC')]");

		intraction_text=By.xpath("//div[text()='INTERACTIONS']");
		Widget_close=By.xpath("(//img[@class='gwt-Image hb-widget-header-btns hb-widget-close-icon'])[1]");

		intraction_startdate_mm=By.xpath("(.//*[@id='gwt-debug-interaction.effectiveDate-search-bar']/div[1]/div[2]/span/select[1])[1]");
		intraction_startdate_dd=By.xpath("(.//*[@id='gwt-debug-interaction.effectiveDate-search-bar']/div[1]/div[2]/span/select[2])[1]");
		intraction_startdate_year=By.xpath("(.//*[@id='gwt-debug-interaction.effectiveDate-search-bar']/div[1]/div[2]/span/select[3])[1]");

		intraction_searchEditStartdate_mm=By.xpath("(.//*[@id='gwt-debug-interaction.effectiveDate-search-bar']/div[1]/div[2]/span/select[1])[2]");
		intraction_searchEditStartdate_dd=By.xpath("(.//*[@id='gwt-debug-interaction.effectiveDate-search-bar']/div[1]/div[2]/span/select[2])[2]");
		intraction_searchEditStartdate_year=By.xpath("(.//*[@id='gwt-debug-interaction.effectiveDate-search-bar']/div[1]/div[2]/span/select[3])[2]");


		intraction_EditStartdate_mm=By.xpath("(//tr[1]//*[@id='gwt-debug-interaction.effectiveDate']/div[1]/div[2]/span/select[1])[4]");
		intraction_EditStartdate_dd=By.xpath("(//tr[1]//*[@id='gwt-debug-interaction.effectiveDate']/div[1]/div[2]/span/select[2])[4]");
		intraction_EditStartdate_year=By.xpath("(//tr[1]//*[@id='gwt-debug-interaction.effectiveDate']/div[1]/div[2]/span/select[3])[4]");
		intraction_deleteIcon = By.xpath("(//tr[1]//*[@id='gwt-debug-interaction.effectiveDate']/div[1]/div[2]/span/select[1])[4]/ancestor::td[1]/following-sibling::td[12]/div/img");

		intraction_duration=By.xpath("//select[@class='minute hb-date-dropdown-required']");
		intraction_patient=By.xpath(".//input[@id='gwt-debug-interaction.patient-search-bar']");
		intraction_careprovider=By.xpath(".//input[@id='gwt-debug-interaction.careProvider-search-bar']");
		intraction_Type=By.xpath("(//*[text()='Type'])[1]/../../../preceding-sibling::tr[1]//select[@id='gwt-debug-interaction.type-search-bar']");

		intraction_tick=By.xpath(".//img[@id='gwt-debug-float-save-button']");

		okBtn_popup = By.xpath(".//*[@id='gwt-debug-ok-button']");

		intraction_edit=By.xpath(" //div[text()='Search & Edit']");
		interactionCareProvider_Suggestion = By.xpath(".//*[@class='hb-simple-grid-dropdown']//"
				+ "td[@class='suggestPopupMiddleCenter']//td[1][contains(text(),'Alexandre')]");

		//	deletebutton=By.xpath("//div[text()='OK']");
		//intaraction_editType=By.xpath("(//div[@class='popupContent']//table[@class='hb-flex-grid-top-level-table hb-table-spacing gwt-TabLayoutPanelContent']//tbody//tr[4]//td[8]//div//select)[2]");


		patientwithoutdiagnosis_widget=By.xpath(" //div[@class='hb-start-page-content']//img[contains(@src, 'kfjHmz9lXJcgIAAAAASUVORK5CYII')]");
		patientwithoutdiagnosis_text=By.xpath("//div[text()='PATIENT WITHOUT DIAGNOSIS']");
		patientwithoutdiagnosis_close=By.xpath("(//img[@class='gwt-Image hb-widget-header-btns hb-widget-close-icon'])[1]");

		Adrthermometer_Widget=By.xpath(" //div[@class='hb-start-page-content']//img[contains(@src, 'Xk36G6OVSH2gr7D1PLEtRZUl')]");
		Adrthermometer_text=By.xpath("//div[text()='ADR - X']");
		Adrthermometer_Widget=By.xpath("(//img[@class='gwt-Image hb-widget-header-btns hb-widget-close-icon'])[1]");

		arrecap_widget=By.xpath("//div[@class='hb-start-page-content']//img[contains(@src, 'ff2krzAAAAAElFTkSuQmCC')]");
		arrecap_text=By.xpath("//div[text()='A/R RECAP - X']");
		arrecap_close=By.xpath("(//img[@class='gwt-Image hb-widget-header-btns hb-widget-close-icon'])[1]");



		medications=By.xpath("//div[@class='hb-widget-icon-image-container dragdrop-draggable']//img[contains(@src,'RmMAAAAAElFTkSuQmCC')]");
		medication_text=By.xpath("//div[text()='UPLOAD MEDICATIONS']");
		medication_UploadButton=By.xpath("(//div[text()='Upload New Records'])[2]");
		medication_tick=By.xpath(".//img[@id='gwt-debug-float-save-button']");
		medication_uploadok=By.xpath(".//button[@id='gwt-debug-ok-no-cancel-button']");
		medication_details=By.xpath(".//div[@id='gwt-debug-batchInfo']");
		medicareBar = By.xpath("(.//*[@class='highcharts-series highcharts-tracker'])[3]");
		selectPatient = By.xpath(".//*[text()='9194']");
		insuraceType = By.xpath(".//div[text()='Insurance']/parent::td/following-sibling::td/div");
		payerTypeWidget_close = By.xpath("//div[text()='PATIENTS BY PAYER TYPE']/parent::td/following-sibling::td//img[@class='gwt-Image hb-widget-header-btns hb-widget-close-icon']");
		DownGridBar = By.xpath("(.//div[contains(@class,'hb-horizontal-grip-bar-clickable')])[2]");
		payerTypeWidgetVerify = By.xpath("//div[text()='PATIENTS BY PAYER TYPE']");
		medicareGridVerify = By.xpath("//div[text()='MEDICARE']");
		insuranceAdd = By.xpath(".//img[@class='gwt-Image hb-flex-add-button hb-mouse-over-clickable']");
		primaryInsuranceVerify = By.xpath(".//div[@class='GKGO0M2BAM']/table[@class='hb-flex-grid-top-level-table hb-table-spacing']/tbody/tr[2]//*[text()='Medicare']");

		//Claims Management Text fields - Vamsi
		VerticalBar = By.xpath("//*[@class='gwt-HTML hb-vertical-grip-bar-clickable hb-drawer-grip-z hb-left-grip-bar']");
		ClaimsManagementImg = By.xpath("//div[@class='hb-start-page-content']//div[@class='hb-widget-container']/div[2]/img");
		DropArea = By.xpath("//div[@class='GKGO0M2BPK']");
		ClaimHeader = By.xpath("//div[@class='gwt-Label hb-widget-title hb-mouse-over-clickable']");
		PayerType = By.xpath("//div[@class='gwt-TabLayoutPanelContentContainer']/div[2]//*[@id='gwt-debug-payerType-search-bar']");
		PatientFirstName = By.xpath("//div[@class='gwt-TabLayoutPanelContentContainer']/div[2]//*[@id='gwt-debug-patientFirstName-search-bar']");
		PatientLastName = By.xpath("//div[@class='gwt-TabLayoutPanelContentContainer']/div[2]//*[@id='gwt-debug-patientLastName-search-bar']");
		PatientID = By.xpath("//div[@class='gwt-TabLayoutPanelContentContainer']/div[2]//*[@id='gwt-debug-patientNumber-search-bar']");
		PostedMonth = By.xpath("//div[@class='gwt-TabLayoutPanelContentContainer']/div[2]//*[@id='gwt-debug-posted-search-bar']//select[contains(@class,'month')]");
		PostedDate = By.xpath("//div[@class='gwt-TabLayoutPanelContentContainer']/div[2]//*[@id='gwt-debug-posted-search-bar']//select[contains(@class,'day')]");
		PostedYear = By.xpath("//div[@class='gwt-TabLayoutPanelContentContainer']/div[2]//*[@id='gwt-debug-posted-search-bar']//select[contains(@class,'year')]");
		StatusDropdown = By.xpath("//div[@class='gwt-TabLayoutPanelContentContainer']/div[2]//*[@id='gwt-debug-claimStatus-search-bar']");
		StatusMonth = By.xpath("//div[@class='gwt-TabLayoutPanelContentContainer']/div[2]//*[@id='gwt-debug-updated-search-bar']//select[contains(@class,'month')]");
		StatusDate = By.xpath("//div[@class='gwt-TabLayoutPanelContentContainer']/div[2]//*[@id='gwt-debug-updated-search-bar']//select[contains(@class,'day')]");
		StatusYear = By.xpath("//div[@class='gwt-TabLayoutPanelContentContainer']/div[2]//*[@id='gwt-debug-updated-search-bar']//select[contains(@class,'year')]");
		Saveicon = By.xpath("//*[@id='gwt-debug-float-save-button']");
		Closeicon = By.xpath("//*[@class='gwt-Image hb-widget-header-btns hb-widget-close-icon']");

		//NOES tab Objects - Vamsi
		OutStandingTab = By.xpath("//div[@class='gwt-TabLayoutPanelTabs']//*[text()= 'OUTSTANDING']");
		NoesTab = By.xpath("//div[@class='gwt-TabLayoutPanelTabs']//div[5]//*[@class='gwt-Label']");
		NoesID = By.xpath("//div[@class='gwt-TabLayoutPanelContentContainer']/div[6]//input[@id='gwt-debug-patientDTO.patientNumber-search-bar']");
		NoesFirstName = By.xpath("//div[@class='gwt-TabLayoutPanelContentContainer']/div[6]//input[@id='gwt-debug-patientDTO.firstName-search-bar']");
		NoesLastName = By.xpath("//div[@class='gwt-TabLayoutPanelContentContainer']/div[6]//input[@id='gwt-debug-patientDTO.lastName-search-bar']");	
		NoesInsurance = By.xpath("//*[@id='gwt-debug-insuranceCoverageDTO.carrierName-search-bar']");
		NoesTOB = By.xpath("//*[@id='gwt-debug-typeOfBill-search-bar']");
		NoesAPhysician = By.xpath("//*[@id='gwt-debug-attendingPhysicianDTO.physicianName-search-bar']");
		NoesCPhysician = By.xpath("//*[@id='gwt-debug-certifyingPhysicianDTO.physicianName-search-bar']");
		NoesOffice = By.xpath("//div[@class='gwt-TabLayoutPanelContentContainer']/div[6]//*[@id='gwt-debug-currentOffice.name-search-bar']");
		NoesStatus = By.xpath("//div[@class='gwt-TabLayoutPanelContentContainer']/div[6]//*[@id='gwt-debug-status-search-bar']");		



		billingReport=By.xpath("//div[@class='hb-start-page-content']//img[contains(@src, 'kDEjNDM8NeEa4oJ14RrwjXFhGvCbYzy')]");
		billingReport_text=By.xpath("//div[text()='BILLING REPORT']");

		claimsmanagement=By.xpath("//div[@class='hb-start-page-content']//img[contains(@src, 'Vz2iWaiQAAAAASUVORK5CYII')]");
		claimsmanagement_text=By.xpath("//div[text()='CLAIMS MANAGEMENT']");

		claimssubmisssionlogs=By.xpath("//div[@class='hb-start-page-content']//img[contains(@src, 'wCPfOt16Kz6HAAAAABJRU5ErkJggg')]");
		claimssubmisssionlogs_text=By.xpath("//div[text()='CLAIM SUBMISSION LOGS']");

		//03162016
		ClaimsNotSentGearIcon = By.xpath("//div[@class='gwt-TabLayoutPanelContentContainer']/div[3]//div[@class='gwt-TabLayoutPanelContent']/div[2]/div[3]//table[@class='hb-flex-grid-top-level-table hb-table-spacing']//tr[2]//table[@class='hb-flex-table']//tr[2]//div[@class='hb-grid-button-column']//img");
		BillingReportLink = By.xpath("//div[text()='Billing Report']");
		RevenueDetailsLink = By.xpath("//div[text()='Revenue Details']");
		NotSentTab = By.xpath("//div[text()='NOT SENT']");
		NotSentFirstName = By.xpath("//div[@class='gwt-TabLayoutPanelContentContainer']/div[3]//input[@id='gwt-debug-patientFirstName-search-bar']");
		BillPrimaryInsurance = By.xpath("//div[text()='Primary Insurance:']//parent::td/following-sibling::td[2]/div");
		BillPolicyHolder = By.xpath("//div[text()='Policy Holder:']//parent::td/following-sibling::td[2]/div");
		BillPolicyNumber = By.xpath("//table[@class='prebill-patient-detail-panel']/tbody/tr/td[3]/table/tbody/tr[3]//div[text()='Policy Number:']//parent::td/following-sibling::td[2]/div");
		BillDiganosisCode = By.xpath("//div[text()='Diagnosis Codes:']//parent::td/following-sibling::td[2]/div");
		RevenueFirstName = By.xpath("//table[@class='hb-flex-grid-top-level-table hb-table-spacing']/tbody/tr[2]//*[@id='gwt-debug-patient.firstName']");
		RevenueLastName = By.xpath("//table[@class='hb-flex-grid-top-level-table hb-table-spacing']/tbody/tr[2]//*[@id='gwt-debug-patient.lastName']");
		RevenueID = By.xpath("//table[@class='hb-flex-grid-top-level-table hb-table-spacing']/tbody/tr[2]//*[@id='gwt-debug-patient.patientNumber']");

		//03172016
		RevenueClaim = By.xpath("(.//table[@class='hb-flex-table']/tbody/tr[1]//td[8][@class='hb-flex-grid-data-cell']//input[@id='gwt-debug-claimTotal'])[3]");
		RevenuePostedDate = By.xpath("(.//table[@class='hb-flex-table']/tbody/tr[1]//td[5][@class='hb-flex-grid-data-cell']/div/div/div[2])[3]");
		RevenueStatus = By.xpath("//table[@class='hb-flex-table']/tbody/tr[1]//td[12][@class='hb-flex-grid-data-cell']/select/option");
		RevenueDateRange = By.xpath("//table[@class='hb-flex-table']/tbody/tr[1]//td[6][@class='hb-flex-grid-data-cell']//div[@id='gwt-debug-datesOfService']");
		MainGridID = By.xpath("//div[@class='gwt-TabLayoutPanelContentContainer']/div[3]//table[@class='hb-flex-grid-top-level-table hb-table-spacing']/tbody/tr[2]//table//tr[1]/td[4]/div");
		MainGridPostedDate = By.xpath("//div[@class='gwt-TabLayoutPanelContentContainer']/div[3]//table[@class='hb-flex-grid-top-level-table hb-table-spacing']/tbody/tr[2]//table//tr[1]/td[5]//*[@class='hb-uneditable-text']");
		MainGridClaim = By.xpath("//div[@class='gwt-TabLayoutPanelContentContainer']/div[3]//table[@class='hb-flex-grid-top-level-table hb-table-spacing']/tbody/tr[2]//table//tr[1]/td[8]/input");
		MainGridDateRange = By.xpath("//div[@class='gwt-TabLayoutPanelContentContainer']/div[3]//table[@class='hb-flex-grid-top-level-table hb-table-spacing']/tbody/tr[2]//table//tr[1]/td[6]/div");
		MainGridStatus = By.xpath("//div[@class='gwt-TabLayoutPanelContentContainer']/div[3]//table[@class='hb-flex-grid-top-level-table hb-table-spacing']/tbody/tr[2]//table//tr[1]/td[13]/div");
		selectMonth = By.xpath("//*[text()='Jan - 2015']");
		verifyDate1 = By.xpath("(//tr[@class='prebill-detail-grid-header-row']/following-sibling::tr[2]/td[2])[1]");
		//verifyDate2 = By.xpath("//div[text()='DOB:']/../following-sibling::td[2]/div")[2];
		verifyDateRange = By.xpath("//div[@class='hb-float-title hb-center-align']");
		verifyDateRangeNextPatient = By.xpath("(//div[text()='Claim Status:'])[2]");
		BillingWidgetsaveButton = By.xpath("//table[@class='hb-float-icons hb-float-btn-z']//tr/td[6]//img[@class='gwt-Image hb-widget-header-btns']"); 

		//03212016
		GenerateClaims = By.xpath("//button[text()='Generate Claims']");
		ClaimsPayerType = By.xpath("//div[@class='GKGO0M2BIO']//select[@class='hb-dropdown-novalue']");
		ClaimsPatient = By.xpath("//div[@class='GKGO0M2BIO']//input");
		BillDateRange = By.xpath("//div[text()='Date Range:']//parent::td/following-sibling::td[2]/div");
		BillStartDate = By.xpath("//div[@class='GKGO0M2BDP']//table/tbody/tr[4]/td[2]");
		BillEndDate = By.xpath("//div[@class='GKGO0M2BDP']//table/tbody/tr[4]/td[3]");
		RevenuePayer = By.xpath("//body[@class='dragdrop-dropTarget dragdrop-boundary']/div[5]//*[@class='hb-flex-grid-data-cell']/select/option[3]");
		RevenueDate = By.xpath("(//*[@id='gwt-debug-date']/div[1]/div[2])[2]");
		ClaimOK = By.xpath("//*[@id='gwt-debug-ok-button']");
		ClaimsPatientDrpDwn = By.xpath("//div[@class='hb-simple-grid-dropdown']//td[text()='Bills repo']");
		ClaimsXMLOk = By.xpath("//*[@id='gwt-debug-ok-no-cancel-button']");
		RevenueDetailsTickMark = By.xpath("(//*[@id='gwt-debug-float-save-button'])[2]");
		BillingTickMark = By.xpath("(//*[@id='gwt-debug-float-save-button'])[2]");
		
		UserName = By.xpath("//div[@class='hb-top-toolbar-login-info-username']");
		SiteName = By.xpath("//div[@class='hb-top-toolbar-login-info-currentSite']");


	}

}