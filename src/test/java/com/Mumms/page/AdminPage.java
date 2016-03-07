package com.Mumms.page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.automation.accelerators.ActionEngine;
import com.automation.support.ConfiguratorSupport;

public class AdminPage extends ActionEngine {

	public static By Roles;
	public static By RolesGroup;
	public static By HCPCSCode;
	public static By DirectRevCode;
	public static By PhoneRevCode;
	public static By Role;
	public static By addIcon;
	public static By saveButton;
	public static By topDisplayedRole;
	public static By deleteTopDisplayedRole;
	public static By okDelete;
	public static By Religion;
	public static By Program;
	public static By ProgramName;
	public static By ProgramCode;
	public static By ProgramAdd;
	public static By TopDisplayedProgram;
	public static By DeleteTopDisplayedProgram;
	public static By ReligionName;
	public static By ReligionAdd;
	public static By TopDisplayedReligion;
	public static By DeleteTopDisplayedReligion;
	public static By AdjustmentReasons;
	public static By ARShortDesc;
	public static By ARSClaimAdjustmentReason;
	public static By ARSCode;
	public static By ARAdd;
	public static By ExistShortDescField;
	public static By IDGTeams;
	public static By IDGTeamsAdd;
	public static By IDGTeamName;
	public static By IDGTeamDrop;
	public static By IDGTeamDropSave;
	public static By IDGTeamVerifyName;
	public static By RequiredFields;


	

	public static By MyAccount;
	public static By Acconts_Detail;
	public static By NewContact;
	public static By NewAccount;

	public static By AccountName;
	public static By AccountNumber;
	public static By AccountSite;
	public static By BillingCity;
	public static By Description;

	public static By AccountSave;
	public static By NewCase;

	public static By OpportunityName;
	public static By CloseDate;
	public static By NextStep;
	public static By NewOpp_Description;
	public static By BusinessUnit;
	public static By Industry;
	public static By OpportunityRecordType;
	public static By OpportunityRecordType_Con;
	public static By Stage;
	public static By Probability ;

	public static By newCase;
	public static By status;
	public static By caseOrigin;
	public static By contactName; 
	public static By change;
	public static By owner;
	public static By setUp;
	public static By caseEscalations; 
	public static By caseReason;
	public static By division;
	public static By product;
	public static By caseSubReason;
	public static By createdCases;
	public static By changeOwner;
	public static By caseAction;
	public static By caseResolution;
	public static By caseSubject;
	public static By caseDesc;
	public static By caseComments;
	public static By caseError;
	public static By contactNameAfterSave;
	public static By newDealSupportRequest;
	public static By caseEditPage;
	public static By caseContactName;
	public static By dealCaseOriginError;
	public static By caseOpportunity;
	public static By caseOpportunityErrorDesc;
	public static By caseOwnerChange;
	public static By caseText;
	public static By topNameDisplayedCase;


	public static By  Admin;
	public static By Physicians;
	public static By PhysiciansText;
	public static By PhysicianModalSave;
	public static By Searchfromtopfrom;
	public static By SearchedText;
	public static By  RoleandAssignments;
	public static By RoleAssignmentsGearIcon;
	public static By  gearicon;
	public static By Details;
	public static By RoleAssignmentsClose;
	public static By SiteText;
	public static By OfficesText;
	public static By RolesText;
	public static By AssignedTabEast;
	public static By OfficesDrag;
	public static By OfficesDrop;
	public static By SaveTickMark;
	public static By AssignedOfficesTab;
	public static By OfficesAvailable;
	public static By Facilities;
	public static By FacilityTab;
	public static By FacilityTypeTab;
	public static By FacilityAdd;
	public static By FacilityModelSave;
	public static By FacilityAssert;
	public static By FacilityClose;

	public static By Churches;
	public static By ChurchTab;
	public static By ReligionTab;
	public static By ChurchGearIcon;
	public static By ContactTab;
	public static By AddressTab;
	public static By ChurchAddIcon;
	public static By ChurchesText;
	public static By ChurchSearch;
	public static By ChurchPhoneNumberUpdate;
	public static By ChurchPhoneNumberAssert;
	public static By ChurchAddressUpdate;
	public static By ChurchClose;
	public static By MedicrePhysician;


	public static By HospiceElection;
	public static By HospiceDescription;
	public static By HospiceElectionPeriod;
	public static By HospiceSaveIcon;
	public static By  HospiceSearch;
	public static By Hospicegearicon;
	public static By HospiceDetails;
	public static By HospiceUpdate;
	public static By HospiceAutoCertified;
	public static By HospiceClose;

	public static By InsuranceCarriers;
	public static By InsurancePrayerType;
	public static By InsurancePrayerTypeOption;
	public static By InsuranceName;
	public static By InsuranceContact;
	public static By InsurancePhone;
	public static By InsuranceAdd;
	public static By InsuranceSave;
	public static By InsuranceAssertName;
	public static By InsuranceCarriersHeading;
	public static By InsuranceAddress;
	public static By InsuranceNotes;
	public static By InsuranceModalSave;
	public static By InsurancePhoneModelBox;
	public static By InsurancePhoneModelBoxType;
	public static By InsurancecarriersGearIcon;
	public static By InsuranceGearDetails;

	public static By MedicareIntermediaries;
	public static By MedicareIntermediary;
	public static By DDEusername;
	public static By DDEPassword;
	public static By DDEPasswordConfirm;
	public static By MedicareAddIcon;
	public static By MedicareIntermediaryOption;
	public static By MediacareIntermediaryOptionDelete;
	public static By MedicareSave;
	public static By PhysicianServices; 
	public static By PhysicianServicesMonth; 
	public static By PhysicianServicesDay;
	public static By PhysicianServicesYear;
	public static By PhysicianServicesHCPCS;
	public static By PhysicianHCPCSOption;
	public static By PhysicianServicesPgms; 
	public static By PhysicianServicesRate; 
	public static By PhysicianServicesAdd;
	public static By PhysicianShortDesc;
	public static By PhysicianLongDesc;
	public static By PhysicianSave;
	public static By PhysicianpgmUpdate;
	public static By PhysicianRecordDelete;
	public static By PhysicianRecordAssert;
	public static By RoomBoardTiers;
	public static By RatesDetailsGroup;
	public static By RatesDetailsTierName;
	public static By RatesDetailsRate;
	public static By RatesDetailsDay;
	public static By RatesDetailsMonth;
	public static By RatesDetailsYear;
	public static By RatesDetailsAdd;
	public static By RatesDetailsSave;
	public static By RateDetailsRecordAssert;
	public static By RateDetailRecordDelete;
	public static By RateDetailRecordDeleteConfirm;

	public static By PeopleSites;
	public static By PeopleAddSite;
	public static By SiteSite;
	public static By SiteBillingAddress;
	public static By SiteZip1;
	public static By SiteZip2;
	public static By SiteZipSuggested;
	public static By SiteNickName;
	public static By SiteTimeZone;
	public static By SiteTimeZoneSuggested;
	public static By SiteModelSave;

	//24-02-2016

	public static By RequiredFieldsAddressCriteria;
	public static By LeftSideGridBar;	
	public static By DownGridBar;
	public static By patientInfoIcon;
	public static By patientLastName;
	public static By patientFirstName;
	public static By PatientAdd;
	public static By Sites;
	public static By SitesRuthGear;
	public static By SitesRuthGearDetails;
	public static By GearDetailsProgramDropDown;
	public static By GearDetailsPrograSave;
	public static By PatientDetailsProgram;
	public static By confirmDelete;
	public static By PopUpTextDesc;
	
	//26-02-2016
	
	public static By hospiceAgencies;
	public static By hospiceAgenciesMonth;
	public static By hospiceAgenciesDay;
	public static By hospiceAgenciesYear;
	public static By hospiceName;
	public static By hospiceNickname;
	public static By hospiceTenantID;
	public static By hospiceSensitiveCheckbox;
	public static By hospiceAdd;
	public static By hospiceSave;
	
	public static By language;
	public static By languageName;
	
	public static By languageAdd;
	public static By languageSave;
	public static By languagesList;
	public static By deleteLanguage;
	public static By langDeleteConfirmation;
	public static By deleteLanguageCancel;
	public static By deleteLanguageOK;
	



	public void Admin_Page()

	{
		Roles = By.xpath(".//div[text()='Roles']");
		RolesGroup = By.xpath("(//input[@class='hb-grid-search-box-required'])[1]");
		HCPCSCode = By.xpath("(//input[@class='hb-grid-search-box'])[1]");
		DirectRevCode = By.xpath("(//input[@class='hb-grid-search-box'])[2]");
		PhoneRevCode = By.xpath("(//input[@class='hb-grid-search-box'])[3]");
		Role = By.xpath("(//input[@class='hb-grid-search-box-required'])[2]");
		addIcon = By.xpath("(//td[@class='hb-accordion-flex-table-cell'])[9]/img");
		saveButton = By.xpath(".//*[@id='gwt-debug-float-save-button']");
		topDisplayedRole = By.xpath("(//*[@id='gwt-debug-name'])[1]");
		deleteTopDisplayedRole = By.xpath("(//div[@class='hb-mouse-over-clickable'])[1]/img");
		okDelete = By.xpath(".//*[@id='gwt-debug-ok-button']");
		Program = By.xpath(".//div[text()='Programs']");
		ProgramName = By.xpath(".//table[@class='hb-grid-search-bar']/tbody/tr/td[1]/input");
		ProgramCode = By.xpath(".//table[@class='hb-grid-search-bar']/tbody/tr/td[2]/input");
		ProgramAdd = By.xpath("//div[@class='hb-grid-search-column']/img");
		TopDisplayedProgram = By.xpath("(//input[@class='hb-textbox hb-nomax-width'])[1]");
		DeleteTopDisplayedProgram = By.xpath("(//tr[@class='GKGO0M2BNG'])[1]//img");
		Religion = By.xpath(".//div[text()='Religion']");
		ReligionName = By.xpath(".//*[@id='gwt-debug-value-search-bar']");
		ReligionAdd = By.xpath("(.//*[@id='gwt-debug-add-button-search-bar'])[2]/img");
		TopDisplayedReligion = By.xpath("(.//*[@id='gwt-debug-value'])[1]");
		DeleteTopDisplayedReligion = By.xpath("(.//*[@class='hb-grid-button-column'])[51]/img");
		AdjustmentReasons = By.xpath(".//div[text()='Adjustment Reasons']");
		ARShortDesc = By.xpath(".//*[@id='gwt-debug-shortDescription-search-bar']");
		ARSClaimAdjustmentReason = By.xpath(".//*[@id='gwt-debug-claimAdjustmentReason-search-bar']");
		ARSCode = By.xpath(".//*[@id='gwt-debug-code-search-bar']");
		ARAdd = By.xpath("(.//*[@id='gwt-debug-add-button-search-bar'])[2]/img");
		ExistShortDescField = By.xpath("(.//*[@id='gwt-debug-shortDescription'])[7]");
		IDGTeams = By.xpath(".//div[text()='IDG Teams']");
		IDGTeamsAdd = By.xpath(".//*[@id='gwt-debug-float-add-button']");
		IDGTeamName = By.xpath("(.//div[contains(@class,'hb-form-question')])[1]//input");
		IDGTeamDrop = By.xpath("(.//table[@class='hb-draggable-item-box'])[2]//div[text()='RUTH']");
		IDGTeamDropSave = By.xpath(".//*[@id='gwt-debug-data-modal-save-button']");
		IDGTeamVerifyName = By.xpath("(.//*[@id='gwt-debug-name'])[9]/parent::td/following-sibling::td[1]//*[text()='RUTH']");
		RequiredFields = By.xpath(".//div[text()='Required Fields']");


		//Jairam
		Admin=By.xpath(" (//div[@class='hb-app-icon-container']/img)[5]");
		Physicians=By.xpath("//div[text()='Physicians']");
		PhysiciansText = By.xpath("//div[text()='PHYSICIANS']");
		PhysicianModalSave = By.xpath("//img[@id='gwt-debug-selection-grid-view-save-button']");
		Searchfromtopfrom=By.xpath("//input[@id='gwt-debug-firstName-search-bar'][@class='hb-grid-search-box']");
		SearchedText = By.xpath("(//div[@id='gwt-debug-firstName'])[53]");
		SiteText = By.xpath("//div[text()='SITE:']");
		OfficesText = By.xpath("//div[text()='OFFICES:']");
		RolesText = By.xpath("//div[text()='ROLES:']");
		RoleandAssignments=By.xpath("//div[text()='Role Assignments']");
		gearicon=By.xpath("(//div[@class='hb-grid-button-column']/img)[51]");
		Details=By.xpath("//tr[@class='enabled-gear-menu-item']//div[text()='Details']");
		RoleAssignmentsClose = By.xpath("//img[@id='gwt-debug-float-save-button']");

		Facilities=By.xpath("//div[text()='Facilities']");
		FacilityTab=By.xpath("//input[@id='gwt-debug-name-search-bar']");
		FacilityTypeTab=By.xpath("//select[@class='hb-grid-search-box-required']");
		FacilityModelSave=By.xpath("//img[@id='gwt-debug-data-modal-save-button']");
		FacilityAdd = By.xpath("(//div[@id='gwt-debug-add-button-search-bar'])[2]");
		FacilityAssert = By.xpath("//td[@class='hb-flex-grid-data-cell']/input[@id='gwt-debug-name']");
		FacilityClose = By.xpath("//img[@id='gwt-debug-float-save-button']");

		RoleAssignmentsGearIcon = By.xpath("(//img[@class='hb-mouse-over-clickable'])[51]");
		AssignedTabEast = By.xpath("(//div[@class='dragdrop-dropTarget'])[5]//div[text()='Ruth 2']");
		OfficesAvailable = By.xpath("(//div[@class='dragdrop-dropTarget'])[4]");
		OfficesDrag = By.xpath("//div[contains(@class,'dragdrop-handle')][text()='Ruth 2']");
		OfficesDrop = By.xpath("(//div[@class='dragdrop-dropTarget'])[5]");
		SaveTickMark = By.xpath("//img[@id='gwt-debug-data-modal-save-button']");
		AssignedOfficesTab = By.xpath("//table[@id='gwt-debug-offices']/tbody/tr/td[2]/select");

		Churches=By.xpath("//div[text()='Churches']");
		ChurchesText=By.xpath("//div[@class='hb-float-title']");
		ChurchTab=By.xpath("//input[@id='gwt-debug-name-search-bar']");
		ReligionTab=By.xpath("//select[@id='gwt-debug-religion-search-bar']");
		AddressTab=By.xpath("//div[@id='gwt-debug-primaryAddress-search-bar']/input");
		ContactTab=By.xpath("//input[@id='gwt-debug-contact-search-bar']");
		ChurchAddIcon=By.xpath("(//div[@id='gwt-debug-add-button-search-bar']/img)[2]");
		ChurchSearch = By.xpath("//input[@id='gwt-debug-name']");
		//ChurchGearIcon=By.xpath("(//div[@class='hb-grid-button-column']/img)[1]");
		ChurchPhoneNumberUpdate = By.xpath("//div[@class='gwt-TabLayoutPanelContent']//table[@id='gwt-debug-phones']//input[@class='hb-textbox-novalue']");
		ChurchPhoneNumberAssert = By.xpath("(//table[@id='gwt-debug-phones']//input)[2]");
		ChurchAddressUpdate = By.xpath("//div[@id='gwt-debug-primaryAddress']/table/tbody/tr[2]/td/input");
		ChurchClose = By.xpath("//img[@id='gwt-debug-float-save-button']");

		HospiceElection=By.xpath("//div[text()='Hospice Election Definition']");
		HospiceDescription=By.xpath("//input[@id='gwt-debug-description-search-bar']");
		HospiceElectionPeriod=By.xpath("//select[@id='gwt-debug-electionPeriod-search-bar']");
		HospiceSaveIcon=By.xpath("(//div[@id='gwt-debug-add-button-search-bar']/img)[2]");
		HospiceSearch=By.xpath("//div[@class='hb-float-title']");
		Hospicegearicon=By.xpath("(//div[@class='hb-grid-button-column']//img)[52]");
		HospiceDetails=By.xpath("//tr[@class='enabled-gear-menu-item']//div[text()='Details']");
		HospiceAutoCertified=By.xpath("//div[@class='hb-bean-editor-container']//span[@id='gwt-debug-autoCertified']/input[@id='gwt-debug-autoCertified-input']");
		HospiceClose = By.xpath("//img[@id='gwt-debug-float-save-button']");

		InsuranceCarriers = By.xpath("//div[text()='Insurance Carriers']");
		InsurancePrayerType = By.xpath("//select[@class='hb-grid-search-box-required']");
		InsurancePrayerTypeOption = By.xpath("//select[@class='hb-grid-search-box-required']/option[1]");
		InsuranceName = By.xpath("//input[@id='gwt-debug-carrierName-search-bar']");
		InsuranceContact = By.xpath("//input[@id='gwt-debug-contactPerson-search-bar']");
		InsurancePhone = By.xpath("(//input[@class='hb-grid-search-box'])[5]");
		InsuranceAdd = By.xpath("(//div[@id='gwt-debug-add-button-search-bar']/img)[2]");
		InsuranceSave = By.xpath("//img[@id='gwt-debug-float-save-button']");
		InsuranceAssertName = By.xpath("(//div[@id='gwt-debug-carrierName'])[2]");
		InsuranceCarriersHeading = By.xpath("//div[text()='INSURANCE CARRIERS']");
		//InsuranceAddress = By.xpath("(//input[@class='hb-textbox-novalue'])[10]");
		InsuranceNotes = By.xpath("//textarea[@id='gwt-debug-notes']");
		InsurancePhoneModelBox = By.xpath("(//table[@id='gwt-debug-phones']//input)[3]");
		InsurancePhoneModelBoxType = By.xpath("(//table[@id='gwt-debug-phones']//select)[3]");
		InsuranceModalSave = By.xpath("//img[@id='gwt-debug-data-modal-save-button']");
		InsurancecarriersGearIcon = By.xpath("(//div[@class='hb-grid-button-column']/img)[51]");
		InsuranceGearDetails = By.xpath("//tr[@class='enabled-gear-menu-item']//div[text()='Details']");

		MedicareIntermediaries=By.xpath("//div[text()='Medicare Intermediaries']");
		MedicareIntermediary=By.xpath("//select[@id='gwt-debug-medicareIntermediary-search-bar']");
		DDEusername=By.xpath("//input[@id='gwt-debug-username-search-bar']");
		DDEPassword=By.xpath("(//input[@class='password-disabled'])[1]");
		DDEPasswordConfirm=By.xpath("(//input[@class='password-incorrect'][@placeholder='Confirm'])[1]");
		MedicareAddIcon=By.xpath("//div[@id='gwt-debug-add-button-search-bar']/img[contains(@class,'hb-flex-add-button')][contains(@class,'hb-mouse-over-clickable')]");
		MedicareIntermediaryOption = By.xpath("//select[@id='gwt-debug-medicareIntermediary-search-bar']/option[2]");
		MediacareIntermediaryOptionDelete = By.xpath("(//td[contains(@class,'hb-flex-grid-data-cell')]/div[@class='hb-grid-button-column']/img)[2]");
		MedicareSave = By.xpath("//img[@id='gwt-debug-float-save-button']");

		PhysicianServices = By.xpath("//div[text()='Physician Services']");
		PhysicianServicesMonth = By.xpath("(//select[contains(@class,'month')][contains(@class,'hb-date-dropdown-novalue')])[2]");
		PhysicianServicesDay = By.xpath("(//select[contains(@class,'day')][contains(@class,'hb-date-dropdown-novalue')])[2]");
		PhysicianServicesYear = By.xpath("(//select[contains(@class,'year')][contains(@class,'hb-date-dropdown-novalue')])[2]");
		PhysicianServicesHCPCS = By.xpath("//input[@id='gwt-debug-hcpcscpt-search-bar']");
		PhysicianHCPCSOption = By.xpath("//div[contains(@class,'suggestPopupContent')]//tr[4]/td");
		PhysicianShortDesc = By.xpath("//input[@id='gwt-debug-description-search-bar']");
		PhysicianLongDesc = By.xpath("//input[@id='gwt-debug-longDescription-search-bar']");
		PhysicianServicesPgms = By.xpath("//table[@id='gwt-debug-programs-search-bar']//select");
		//PhysicianServicesPgmsOption = By.xpath("");
		PhysicianServicesRate = By.xpath("//input[@id='gwt-debug-rate-search-bar']");
		PhysicianServicesAdd = By.xpath("//div[@id='gwt-debug-add-button-search-bar']/img[contains(@class,'hb-mouse-over-clickable')]");
		PhysicianSave = By.xpath("//img[@id='gwt-debug-float-save-button']");
		PhysicianpgmUpdate = By.xpath("(//select[@class='hb-textbox'])[2]");
		PhysicianRecordDelete = By.xpath("//td/div[@id='gwt-debug-hcpcscpt'][text()='A0100']/parent::td/following-sibling::td[contains(@class,'hb-grid-button-column')]//img");
		PhysicianRecordAssert = By.xpath("//div[@id='gwt-debug-hcpcscpt'][text()='A0100']");


		RoomBoardTiers = By.xpath("//div[text()='Room & Board Rate Tiers']");
		RatesDetailsGroup = By.xpath("//table[@class='hb-table-spacing']/tbody/tr[3]/td[2]/input");
		RatesDetailsTierName = By.xpath("//table[@class='hb-table-spacing']/tbody/tr[3]/td[3]/input");
		RatesDetailsRate = By.xpath("(//td[@class='rate-editor-amount']/input)[1]");
		RatesDetailsMonth = By.xpath("(//select[contains(@class,'month')][contains(@class,'hb-date-dropdown-novalue')])[2]");
		RatesDetailsDay = By.xpath("(//select[contains(@class,'day')][contains(@class,'hb-date-dropdown-novalue')])[2]");
		RatesDetailsYear = By.xpath("(//select[contains(@class,'year')][contains(@class,'hb-date-dropdown-novalue')])[2]");
		RatesDetailsAdd = By.xpath("//td[@class='hb-accordion-flex-table-cell']/img[contains(@class,'hb-widget-header-btns')][contains(@class,'gwt-Image')]");
		RatesDetailsSave = By.xpath("//img[@id='gwt-debug-float-save-button']");
		RateDetailsRecordAssert = By.xpath("(//input[@id='gwt-debug-name'])[1]");
		RateDetailRecordDelete = By.xpath("(//div[@class='hb-mouse-over-clickable']/img)[1]");
		RateDetailRecordDeleteConfirm = By.xpath("//button[@id='gwt-debug-ok-button']");

		PeopleSites = By.xpath("//div[text()='Sites']");
		PeopleAddSite = By.xpath("//img[@id='gwt-debug-float-add-button']");
		SiteSite = By.xpath("//div[@class='hb-tabpanel']//input[@id='gwt-debug-name']");
		SiteBillingAddress = By.xpath("(//div[@class='hb-tabpanel']//div[@id='gwt-debug-billingAddress']//input[@class='hb-textbox-required'])[1]");
		SiteZip1 = By.xpath("(//div[@class='hb-tabpanel']//div[@id='gwt-debug-billingAddress']//table[@class='hb-zip4-width']//input[@class='hb-textbox-required'])[1]");
		SiteZip2 = By.xpath("(//div[@class='hb-tabpanel']//div[@id='gwt-debug-billingAddress']//table[@class='hb-zip4-width']//input[@class='hb-textbox-required'])[2]");
		SiteZipSuggested = By.xpath("(//div[contains(@class,'suggestPopupMiddleCenterInner')]//td[@role='menuitem'])[1]");
		SiteNickName = By.xpath("//div[@class='hb-bean-editor-container']//input[@id='gwt-debug-nickName']");
		SiteTimeZone = By.xpath("//input[@id='gwt-debug-timezone']");
		SiteTimeZoneSuggested = By.xpath("//td[text()='IST']");
		SiteModelSave = By.xpath("//img[@id='gwt-debug-data-modal-save-button']");

		//24-02-2016

		RequiredFieldsAddressCriteria = By.xpath("(.//*[@class='hb-dropdown hb-referral-required'])[3]");
		LeftSideGridBar = By.xpath("(.//*[@id='gwt-debug-vertical-drawer-grip-bar'])[1]");
		patientInfoIcon = By.xpath(".//*[@id='gwt-debug-patient-module-button']/tbody/tr[1]/td/div/img");
		patientLastName = By.xpath(".//*[@id='gwt-debug-lastName-search-bar']");
		patientFirstName = By.xpath(".//*[@id='gwt-debug-firstName-search-bar']");
		DownGridBar = By.xpath(".//div[contains(@class,'hb-horizontal-grip-bar-clickable')]");
		PatientAdd = By.xpath(".//*[@id='gwt-debug-add-button-search-bar']/img");
		Sites = By.xpath(".//div[text()='Sites']");
		SitesRuthGear = By.xpath("(.//*[@id='gwt-debug-nickName'])[3]/parent::td/following-sibling::td[8]//img[@class='hb-mouse-over-clickable']");
		SitesRuthGearDetails = By.xpath("//div[text()='Details']");
		GearDetailsProgramDropDown = By.xpath(".//select[@class='hb-search-dropdown-novalue']");

		GearDetailsPrograSave = By.xpath(".//*[@class='hb-grid-search-column']/img");
		PatientDetailsProgram = By.xpath(".//*[@id='gwt-debug-Patient.programSite']");
		confirmDelete = By.xpath(".//*[@id='gwt-debug-dialog-box-title']");
		PopUpTextDesc = By.xpath(".//*[@id='gwt-debug-dialog-box']//div[@class='hb-dialog-message']");
		
		//Jairam 26-02-2016
		
		hospiceAgencies = By.xpath("//div[text()='Hospice Agencies']");
		hospiceAgenciesMonth = By.xpath("//select[@class='month hb-date-dropdown-novalue']");
		hospiceAgenciesDay = By.xpath("//select[@class='day hb-date-dropdown-novalue']");
		hospiceAgenciesYear = By.xpath("//select[@class='year hb-date-dropdown-novalue']");
		hospiceName = By.xpath("//input[@id='gwt-debug-name-search-bar']");
		hospiceNickname = By.xpath("//input[@id='gwt-debug-nickName-search-bar']");
		hospiceTenantID = By.xpath("//input[@id='gwt-debug-bin-search-bar']");
		hospiceSensitiveCheckbox = By.xpath("//input[@id='gwt-debug-sensitive-search-bar-input']");
		hospiceAdd = By.xpath("//div[@id='gwt-debug-add-button-search-bar']/img");
		hospiceSave = By.xpath("//img[@id='gwt-debug-float-save-button']");
		
		language = By.xpath("//div[text()='Languages']");
		languageName = By.id("gwt-debug-value-search-bar");
		languageAdd = By.xpath("//input[@id='gwt-debug-value-search-bar']/parent::*/parent::*//div[@id='gwt-debug-add-button-search-bar']/img");
		languageSave = By.xpath("//img[@id='gwt-debug-float-save-button']");
		languagesList = By.xpath("//input[@id='gwt-debug-value']");
		deleteLanguage = By.xpath("//td[@class='hb-flex-grid-data-cell hb-grid-button-column']//img");
		langDeleteConfirmation = By.id("gwt-debug-dialog-box-title");
		deleteLanguageCancel = By.id("gwt-debug-cancel-button");
		deleteLanguageOK = By.id("gwt-debug-ok-button");
		
		
		
		
	}
}
