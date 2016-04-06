package com.Mumms.page;

import org.openqa.selenium.By;

import com.automation.support.ConfiguratorSupport;

public class PatientPage {

	public static By loginType;
	public static By loginAccountType;
	public static By patientInfoIcon;
	public static By patientLastName;
	public static By patientFirstName;
	public static By patientListDropDown;
	public static By addPatientIcon_patientListing;
	public static By addPatientIcon_insuranceTab;
	public static By addPatientIcon_historyTab;
	//*[contains(text(),'History')]/parent::div//*[@id='gwt-debug-add-button-search-bar']/img

	public static By referredTo;
	public static By address;
	public static By phoneNumber;
	public static By dob_month;
	public static By dob_day;
	public static By dob_year;
	public static By genderDropdown;
	public static By ssn;
	public static By earlier_referralDate_month;
	public static By earlier_referralDate_day;
	public static By earlier_referralDate_year;
	public static By attendingPhysicianButton;
	//public static By firstDisplayedAttendingPhysician;
	public static By saveButton;
	public static By insuranceTab;
	public static By insurancePayer;
	public static By selectMedicareInsurance;
	public static By historyTab;
	public static By historyTab_priInsuranceDropdown;
	public static By historyTab_effectiveDate_month;
	public static By historyTab_effectiveDate_day;
	public static By historyTab_effectiveDate_year;
	public static By admitButton;
	public static By admitDay;
	public static By admitMonth;
	public static By admitYear;
	public static By okBtn_admitPopup;
	public static By facilityInput;
	public static By suggestPopupFacilty;
	public static By statusPatient;
	public static By gearIcon;
	public static By electionsMenu;
	public static By electionsTab;
	public static By electionPeriod;
	//	public static By physician_electionTab;
	//scenario 2
	public static By bottomGripBar;
	public static By homeIcon;
	public static By rightGripBar;
	public static By claimsManagementSource;
	public static By claimsManagementDestination;
	public static By claimsManagement;
	public static By notSent;
	public static By generateClaimsBtn;
	public static By monthAndYear;//Dec - 2015
	public static By selectPayerType;//MEDICAID
	public static By patientName;
	public static By generateClaimsokBtn;
	public static By okBtn;//.//div[@id='gwt-debug-dialog-box']/div[3]/div/table/tbody/tr/td/table/tbody/tr/td/button
	public static By patientFirstName_1;
	public static By patientLastName_1;
	public static By verifyStatus;

	public static By PatientTitle;
	public static By PatientMiddleInitial;
	public static By PatientSuffix;
	public static By PatientNickName;
	public static By PatientAdressLine1;
	public static By PatientAdressLine2;
	public static By PatientZip1;
	public static By PatientZip1Sug;
	public static By PatientZip2;
	public static By PatientOffice;
	public static By PatientOfficeSug1;
	public static By PatientIDGTeams;
	public static By PatientCallReceivedFrom;
	public static By PatientPhoneNumber;
	public static By PatientcallTakenBy;
	public static By PatientreferralSourceType;
	public static By PatientreRelationManager;
	public static By PatientreRelationManagerSug1;
	public static By PatientSex;
	public static By maritalStatus;
	public static By PatientRace;
	public static By PatientEthnicity;
	public static By PatientLanguage;
	public static By secondaryLanguage;
	public static By PatientReligion;
	public static By PatientChurch;
	public static By PatientChurchSelect;
	public static By PatientPharmacy;
	public static By PatientPharmacySelect;
	public static By PatientDme;
	public static By PatientDmeSelect;
	public static By PatientfuneralHome;
	public static By PatientfuneralHomeSelect;
	public static By PatientVeteran;
	public static By PatientAtRisk;
	public static By PatientCauseOfStress;
	public static By patientGreatestNeed;
	public static By PatientResuscitate;
	public static By powerOfAttorney;
	public static By personpowerOfAttorney;
	public static By PatientRefPhysician;
	//public static By personPhysician;
	public static By personPhysicianPhone1;
	public static By personPhysicianPhone2;
	public static By PatientNotes;
	public static By PatientChurchName;

	//1st Mar
	public static By topDisplayedPatient;
	public static By attendingPhysicianButtonVerify;
	public static By facilityType;
	public static By admitted_status_xpath;
	public static By diagnosisTab;
	public static By diagnosisPhysicalCondition;
	public static By diagnosisEmotionalCondition;
	public static By diagnosisPatient;
	public static By diagnosisFamily;
	public static By PrognosisPatient;
	public static By PrognosisFamily;
	public static By ICD9Code;
	public static By ICD9CodeSug1;
	public static By ICD10Code;
	public static By ICD10CodeSug1;
	public static By diagnosisAdd;
	public static By diagnosisAddItem1;
	public static By diagnosisAddItem2;
	public static By diagnosisAddItem3;

	//shiney
	public static By patient_grid;
	public static By patientgrid_firstname;
	public static By patientgrid_lastname;
	public static By patientgrid_AddIcon;
	public static By patientsearch;
	public static By patienttab;
	public static By Patientdemographics_initial;
	public static By Patientdemographics_adderess1;
	public static By Patientdemographics_adderess2;
	public static By PatientInsurance_Tab;
	public static By patientInsurance_prayer;
	public static By patientInsurance_prayername;
	public static By patientInsurance_prayerid;
	public static By patientInsurance_prayerPolicyNum;
	public static By patientInsurance_prayerAddIcon;
	public static By patientInsurance_prayerSave;
	public static By PatientAdd;
	public static By AttorneyFirstName;
	public static By AttorneyLastName;
	public static By topDisplayedAttorneyFirstName;
	public static By topDisplayedDMEFirstName;
	public static By DMEFirstName;
	public static By DMEAdress;
	public static By DMEAdd;
	public static By topDisplayedChurch;
	public static By pharmacyAdd;
	public static By allergiesTab;
	public static By AllergyConfirm;
	public static By AllergyType;
	public static By AllergyReaction;
	public static By AllergyAdd;
	public static By TopDisplayedAllergy;
	public static By AllergyVerify;
	public static By assignmentTab;
	public static By CNAName;
	public static By assignmentFirstName;
	public static By assignmentLastName;
	public static By assignmentPersonAdd;
	public static By topDisplayedPerson;
	public static By assignmentCNAStartDate_day;
	public static By assignmentCNAStartDate_month;
	public static By assignmentCNAStartDate_year;
	public static By assignmentCNAEndDate_day;
	public static By assignmentCNAEndDate_month;
	public static By assignmentCNAEndDate_year;
	public static By selectedName;
	public static By topDisplayedPersonSelect;
	public static By addButton_historyTab;

	//shiney
	public static By  dischargeButton;
	public static By dischargetype;
	public static By dischargereason;
	public static By dischargedate_month;
	public static By dischargedate_day;
	public static By dischargedate_year;

	//sam
	// sampath
	public static By caregivers_tab;
	//	public static By admitted_status_xpath;
	//	public static By facilityType;
	public static By addButton_Caregiver;
	public static By firstName_caregiver;
	public static By lastName_caregiver;
	public static By relation_caregiver;
	public static By addButton_caregiver_individual;
	public static By saveBtn_caregiverTab;
	public static By firstName_powerOfAttorney;

	public static By insurance_policyNumberInput;

	public static By insurance_payerInput;
	public static By billForRB;
	//public static By addButton_historyTab;
	public static By current_election_Label;
	public static By electionGrid_AttendingPhysician_priInsurer;
	public static By electionGrid_verbalDate_month_attendingPhysician;
	public static By electionGrid_verbalDate_day_attendingPhysician;
	public static By electionGrid_verbalDate_year_attendingPhysician;
	public static By electionGrid_signatureDate_month_attendingPhysician;
	public static By electionGrid_signatureDate_day_attendingPhysician;
	public static By electionGrid_signatureDate_year_attendingPhysician;

	public static By electionGrid_verbalDate_month_hospicePhysician;
	public static By electionGrid_verbalDate_day_hospicePhysician;
	public static By electionGrid_verbalDate_year_hospicePhysician;
	public static By electionGrid_signatureDate_month_hospicePhysician;
	public static By electionGrid_signatureDate_day_hospicePhysician;
	public static By electionGrid_signatureDate_year_hospicePhysician;
	public static By electionGrid_hospicePhysicianName;
	public static By electionGrid_physicianName;
	public static By electionGrid_certifyingPhysicianInput;

	public static By historyTab_LocationInput;
	public static By historyTab_LocationDropdown;
	public static By historyTab_FacilityInput;
	public static By endDate_month_RespiteLocation;
	public static By endDate_day_RespiteLocation;
	public static By endDate_year_RespiteLocation;
	public static By physicianInput_historyTab;
	public static By facilitySug;
	public static By electionGrid_TickMark;

	//patientHeader
	public static By patientHeader_firstName;
	public static By patientHeader_lastName;
	public static By patientHeader_powerOfAtorney;
	public static By patientHeader_physician;
	public static By patientHeader_insurance;
	public static By attendingPhysicianVerify;
	public static By insuranceVerify;
	public static By patientFirstNameVerify;
	public static By patientLastNameVerify;
	public static By historyTab_secondaryinsuranceDropdown;
	public static By patientHeader_refDate;
	public static By patientHeader_phone;
	public static By patientHeader_Zip;

	//samblock
	//14
	public static By reffered_status_xpath;

	public static By insurence_newssn;
	public static By history_updateddate;
	public static By demographictab;
	public static By SSN_status_xpath;



	//16 march shiney
	public static By unadmitButton;
	public static By confirnunadmitbutton;
	public static By reffered_status;
	public static By historyStatus;

	public static By effectiveDatehistoryTab_day ;
	public static By effectiveDatehistoryTab_month ;
	public static By effectiveDatehistoryTab_year ;
	public static By billingreport_widget;
	public static By billingmonth;


	public static By cliamdetailspatientname;
	public static By claimdetailspatientid;
	public static By cliamdetailsPolicyNumber;
	public static By cliamdetailsprimaryinsurance;
	public static By cliamdetailsdob;
	public static By cliamdetailsdiagnosiscode;
	public static By cliamdetailsstatus;

	//030162016
	public static By PhoneAddicon;
	public static By NewPhoneNumber;
	public static By PhoneNumberlink;
	public static By PhoneNumberText;
	public static By AllergiesLink;
	public static By AllergiesText;
	public static By FirstAllergy;
	public static By SecondAllergy;
	public static By patientFirstNameReport;
	//17

	public static By  firstnameAssert;
	public static By  ssnAssert;
	public static By  statusdateAssert;
	public static By  leftside_grid;
	public static By statusassert;

	//03172016
	public static By historyTab__day;
	public static By historyTab__month;
	public static By historyTab__year;
	public static By AllergyAddNew;
	public static By PrimaryInsuVerify;
	public static By SecondInsuVerify;
	public static By firstPatientRowInTable;
	
	/*//march 22
		public static By firstPatientRowInTable;*/
		//23 march
		public static By addCaregiversTabHeader;
		public static By existingFirstRowInCareGiversTab;
		public static By firstRowDisplayedInCareGiversTab;
		public static By patientHeader_CareGiverDisplayed;
		
		public static By funeralHomeFaciltyName;
		public static By funeralHomeFacilityAddress;
		public static By topDisplayedFuneralFacilityHome;
		
	//public static ConfiguratorSupport configProps = new ConfiguratorSupport("config.properties");

	public static void Patient_Page()

	{
		{
			loginType = By.xpath("//div[contains(@class,'login-info-currentHospice')]");
			loginAccountType= By.xpath("//div[text()='RUTH']");
			patientInfoIcon = By.xpath(".//*[@id='gwt-debug-patient-module-button']/tbody/tr[1]/td/div/img");
			patientLastName = By.xpath(".//*[@id='gwt-debug-lastName-search-bar']");
			patientFirstName = By.xpath(".//*[@id='gwt-debug-firstName-search-bar']");
			patientListDropDown = By.xpath(".//*[@id='gwt-debug-patient-filter-select']");
			//All Patients
			addPatientIcon_patientListing = By.xpath(".//*[@id='gwt-debug-patient-listing']//*[@id='gwt-debug-add-button-search-bar']/img");
			addPatientIcon_insuranceTab = By.xpath("//*[contains(text(),'insurance coverage')]/parent::div//*[@id='gwt-debug-add-button-search-bar']/img");
			addPatientIcon_historyTab = By.xpath("//*[contains(text(),'History')]/parent::div//*[@id='gwt-debug-add-button-search-bar']/img");
			referredTo = By.xpath("//div[text()='Referred']//parent::td//following-sibling::td[2]");
			address = By.xpath("//input[@id='gwt-debug-Patient.primaryAddress.street1']");
			phoneNumber = By.xpath(".//div[text()='Phone:']/parent::td/following-sibling::td[1]//td[2]/input");
			dob_month = By.xpath(".//*[@id='gwt-debug-Patient.dateOfBirth']//span/select[contains(@class,'month')]");
			dob_day = By.xpath(".//*[@id='gwt-debug-Patient.dateOfBirth']//select[contains(@class,'day')]");
			dob_year = By.xpath(".//*[@id='gwt-debug-Patient.dateOfBirth']//select[contains(@class,'year')]");
			genderDropdown = By.xpath(".//*[@id='gwt-debug-Patient.sex']");
			ssn = By.xpath(".//*[@id='gwt-debug-Patient.ssn']");
			earlier_referralDate_month = By.xpath(".//*[@id='gwt-debug-Patient.patientReferral.referralDateTime']//select[contains(@class,'month')]");
			earlier_referralDate_day = By.xpath(".//*[@id='gwt-debug-Patient.patientReferral.referralDateTime']//select[contains(@class,'day')]");
			earlier_referralDate_year = By.xpath(".//*[@id='gwt-debug-Patient.patientReferral.referralDateTime']//select[contains(@class,'year')]");
			attendingPhysicianButton = By.xpath(".//*[@id='gwt-debug-transient.attPhysician']/input");
			//firstDisplayedAttendingPhysician = By.xpath(".//*[text()='Jeff']/parent::td/preceding-sibling::td[1]//input");
			saveButton = By.xpath(".//*[@id='gwt-debug-selection-grid-view-save-button']");
			insuranceTab = By.xpath(".//*[@id='gwt-debug-patient-basic-information']//div[text()='Insurance']");
			insurancePayer = By.xpath(".//*[@id='gwt-debug-insurancecarrier-search-bar']/input");
			selectMedicareInsurance = By.xpath(".//*[text()='Medicare']/parent::td/preceding-sibling::td[1]//input");
			historyTab = By.xpath(".//*[@id='gwt-debug-patient-basic-information']//div[text()='HISTORY']");
			historyTab_priInsuranceDropdown = By.xpath(".//*[@id='gwt-debug-primaryCoverage.carrierName-search-bar']");

			historyTab_effectiveDate_day = By.xpath(".//*[@id='gwt-debug-effectiveDate-search-bar']//select[contains(@class,'day')]");
			historyTab_effectiveDate_month = By.xpath(".//*[@id='gwt-debug-effectiveDate-search-bar']//select[contains(@class,'month')]");
			historyTab_effectiveDate_year = By.xpath(".//*[@id='gwt-debug-effectiveDate-search-bar']//select[contains(@class,'year')]");
			admitButton = By.xpath("//button[text()='ADMIT']");
			admitDay = By.xpath(".//*[@id='gwt-debug-admitDate']/div[1]/div[2]/span/select[2]");
			admitMonth = By.xpath(".//*[@id='gwt-debug-admitDate']/div[1]/div[2]/span/select[1]");
			admitYear = By.xpath(".//*[@id='gwt-debug-admitDate']/div[1]/div[2]/span/select[3]");
			okBtn_admitPopup = By.xpath(".//*[@id='gwt-debug-ok-button']");
			facilityInput = By.xpath(".//*[@id='gwt-debug-facilityProxy']");
			suggestPopupFacilty = By.xpath(".//*[text()='Autumn Care-Marion']");
			statusPatient = By.xpath("//div[@class='hb-patient-header-box'][1]/table[2]//table/tbody/tr/td[1]/div");
			gearIcon = By.xpath(".//*[@id='gwt-debug-insurancecarrier']/div[text()='Medicare']/parent::div/parent::td/following-sibling::td[6]/div/img");
			electionsMenu = By.xpath("//div[text()='Elections']");
			electionsTab = By.xpath("//div[@class='gwt-TabLayoutPanelTabInner']/div[text()='Elections']");
			electionPeriod = By.xpath(".//tr[2]//*[@id='gwt-debug-electionPeriod']");
			// physician_electionTab = By.xpath(".//*[@id='gwt-debug-certificationDTO.hospicePhysicianName']/div[1]/div[2]/input");

			//scenario2

			bottomGripBar = By.xpath("//div[@style='position: absolute; overflow: hidden; left: 0em; top: 0em; right: 0em; height: 1.82em;']/div");
			homeIcon = By.xpath(".//*[@id='gwt-debug-home-button']/tbody/tr[1]/td/div/img");
			rightGripBar = By.xpath("//div[@class='hb-drawer hb-dance-floor-z hb-listing-drawer hb-left-grip-bar']/div/div[3]/div");
			claimsManagementSource = By.xpath("//div[@class='hb-widget-container']/div[2]/img");
			claimsManagementDestination = By.xpath("//div[@class='hb-panel-drop-placeholder dragdrop-dropTarget']/div/div[3]/div");
			claimsManagement = By.xpath("//div[contains(text(),'CLAIMS MANAGEMENT')]");
			notSent = By.xpath("//div[contains(text(),'NOT SENT')]");
			generateClaimsBtn = By.xpath("(//button[contains(text(),'Generate Claims')])[1]");
			monthAndYear = By.xpath("(//select[@class='hb-dropdown'])[2]");
			selectPayerType = By.xpath("(//select[@class='hb-dropdown-novalue'])[3]");
			patientName = By.xpath("//*[@id='gwt-debug-dialog-box']/div[3]/div/div/div[2]/div[3]/div[2]/input");
			generateClaimsokBtn = By.xpath(".//*[@id='gwt-debug-ok-button']");

			okBtn = By.xpath("//*[@id='gwt-debug-ok-no-cancel-button']");
			patientFirstName_1 = By.xpath("(.//*[@id='gwt-debug-patientFirstName-search-bar'])[2]");
			patientLastName_1 = By.xpath("(.//*[@id='gwt-debug-patientLastName-search-bar'])[2]")	;
			verifyStatus = By.xpath("(//table[@class='hb-flex-table']/tbody/tr[1]/td[13])[4]");
			PatientTitle = By.xpath(".//*[@id='gwt-debug-Patient.title']");
			PatientMiddleInitial = By.xpath(".//*[@id='gwt-debug-Patient.middleInitial']");
			PatientSuffix = By.xpath(".//*[@id='gwt-debug-Patient.suffix']");
			PatientNickName = By.xpath(".//*[@id='gwt-debug-Patient.nickname']");
			PatientAdressLine1 = By.xpath(".//*[@id='gwt-debug-Patient.primaryAddress.street1']");
			PatientAdressLine2 = By.xpath(".//*[@id='gwt-debug-Patient.primaryAddress.street2']");
			PatientZip1 = By.xpath(".//*[@id='gwt-debug-Patient.primaryAddress.zip']");
			PatientZip1Sug = By.xpath(".//*[@class='hb-simple-grid-dropdown']//td[@class='suggestPopupMiddleCenter']//td[1][contains(text(),'45221')]");

			PatientZip2 = By.xpath(".//*[@id='gwt-debug-Patient.primaryAddress.zip4']");
			PatientOffice = By.xpath(".//*[@id='gwt-debug-Patient.office']");
			PatientIDGTeams = By.xpath(".//*[@id='gwt-debug-Patient.teamPersonList']");
			PatientCallReceivedFrom = By.xpath(".//*[@id='gwt-debug-Patient.patientReferral.callReceivedFrom']");
			PatientPhoneNumber = By.xpath(".//*[@id='gwt-debug-Patient.patientReferral.callReceivedPhone.number']//input[@class='hb-textbox-novalue']");
			PatientcallTakenBy = By.xpath(".//*[@id='gwt-debug-Patient.patientReferral.callTakenBy']");
			PatientreferralSourceType = By.xpath(".//*[@id='gwt-debug-Patient.patientReferral.referralSourceType']");
			PatientreRelationManager = By.xpath(".//*[@id='gwt-debug-Patient.patientReferral.crm']");
			PatientSex = By.xpath(".//*[@id='gwt-debug-Patient.sex']");
			maritalStatus = By.xpath(".//*[@id='gwt-debug-Patient.maritalStatus']");
			PatientRace = By.xpath(".//*[@id='gwt-debug-Patient.race']");
			PatientEthnicity = By.xpath(".//*[@id='gwt-debug-Patient.ethnicity']");
			PatientLanguage = By.xpath(".//*[@id='gwt-debug-Patient.language']");
			secondaryLanguage = By.xpath(".//*[@id='gwt-debug-Patient.secondaryLanguage']");
			PatientReligion = By.xpath(".//*[@id='gwt-debug-Patient.religion']");
			PatientChurch = By.xpath(".//*[@id='gwt-debug-Patient.church']/input");
			PatientPharmacy = By.xpath(".//*[@id='gwt-debug-Patient.pharmacy']/input");
			PatientDme = By.xpath(".//*[@id='gwt-debug-Patient.dme']/input");
			PatientfuneralHome = By.xpath(".//*[@id='gwt-debug-Patient.funeralHome']/input");
			PatientVeteran = By.xpath("//*[text()='Veteran:']/parent::td/following-sibling::td//tr/td[2]//*[contains(@id,'gwt-uid')]");
			PatientAtRisk = By.xpath(".//*[@id='gwt-uid-133']");
			PatientCauseOfStress = By.xpath(".//*[@id='gwt-debug-Patient.causeOfStress']");
			patientGreatestNeed = By.xpath(".//*[@id='gwt-debug-Patient.patientGreatestNeed']");
			PatientResuscitate = By.xpath(".//*[@id='gwt-uid-135']");
			powerOfAttorney = By.xpath(".//*[@id='gwt-debug-Patient.powerOfAttorney']/input");
			personpowerOfAttorney = By.xpath(".//*[text()='Attoney1255']/parent::td/preceding-sibling::td[1]//input");
			PatientRefPhysician = By.xpath(".//*[@id='gwt-debug-transient.refPhysician']/input");
		//	personPhysician = By.xpath(".//*[text()='Jeff']/parent::td/preceding-sibling::td[1]//input");
			personPhysicianPhone1 = By.xpath("(.//*[@id='gwt-debug-patient-demographics']//table[@class='hb-font-size hb-widget-right-space']//input[@class='hb-textbox-novalue'])[2]");
			personPhysicianPhone2 = By.xpath("(.//*[@id='gwt-debug-patient-demographics']//table[@class='hb-font-size hb-widget-right-space']//input[@class='hb-textbox-novalue'])[3]");
			PatientNotes = By.xpath(".//*[@id='gwt-debug-Patient.notes']");
			PatientreRelationManagerSug1 = By.xpath(".//*[text()='test CRM role']");
			PatientChurchSelect = By.xpath(".//*[text()='Church1255']/parent::td/preceding-sibling::td[1]//input");
			PatientPharmacySelect = By.xpath(".//*[text()='Cipla1255']/parent::td/preceding-sibling::td[1]//input");
			PatientDmeSelect = By.xpath(".//*[text()='DME1255']/parent::td/preceding-sibling::td[1]//input");
			PatientfuneralHomeSelect = By.xpath(".//*[text()='Contact']/parent::td/preceding-sibling::td[1]//input");
			PatientChurchName = By.xpath(".//*[@id='gwt-debug-name-search-bar']");

			//1st Mar

			topDisplayedPatient = By.xpath(".//td[@class='hb-flex-grid-data-cell']//div[@id='gwt-debug-firstName']");
			attendingPhysicianButtonVerify = By.xpath(".//*[@id='gwt-debug-transient.attPhysician']/div");
			facilityType = By.xpath(".//*[@id='gwt-debug-facilityTypeProxy']");
			admitted_status_xpath = By.xpath("//div[text()='Admitted']");
			diagnosisTab = By.xpath(".//div[@class='gwt-TabLayoutPanelTabInner']//div[text()='DIAGNOSIS']");
			diagnosisPhysicalCondition = By.xpath(".//div[text()='Physical Condition:']/parent::td/following-sibling::td/select");
			diagnosisEmotionalCondition = By.xpath(".//div[text()='Emotional Condition:']/parent::td/following-sibling::td/select");
			diagnosisPatient = By.xpath("(.//div[text()='Patient:']/parent::td/following-sibling::td/select)[1]");
			diagnosisFamily = By.xpath("(.//div[text()='Family:']/parent::td/following-sibling::td/select)[1]");
			PrognosisPatient = By.xpath("(.//div[text()='Patient:']/parent::td/following-sibling::td/select)[2]");
			PrognosisFamily = By.xpath("(.//div[text()='Family:']/parent::td/following-sibling::td/select)[2]");
			ICD10Code = By.xpath(".//*[@id='gwt-debug-icd10diagnosis-search-bar']");
			ICD10CodeSug1 = By.xpath(".//*[@class='hb-simple-grid-dropdown']//td[@class='suggestPopupMiddleCenter']//td[1][contains(text(),'Z3A12')]");
			ICD9Code = By.xpath(".//*[@id='gwt-debug-diagnosis-search-bar']");
			ICD9CodeSug1 = By.xpath(".//*[@class='hb-simple-grid-dropdown']//td[@class='suggestPopupMiddleCenter']//td[1][contains(text(),'001.0 : Cholera')]");
			diagnosisAdd = By.xpath(".//div[@class='hb-formbox-header']/following-sibling::div//*[@id='gwt-debug-add-button-search-bar']/img");
			/*diagnosisAddItem1 = By.xpath("(.//tr[@class='hb-mouse-over-dragable']//*[@id='gwt-debug-rank'])[1]");
			diagnosisAddItem2 = By.xpath("(.//tr[@class='hb-mouse-over-dragable']//*[@id='gwt-debug-rank'])[2]");
			diagnosisAddItem3 = By.xpath("(.//tr[@class='hb-mouse-over-dragable']//*[@id='gwt-debug-rank'])[3]");*/
			diagnosisAddItem1 = By.xpath("(.//tr[@class='hb-mouse-over-dragable']//*[@id='gwt-debug-rank'])[1]/..");
			diagnosisAddItem2 = By.xpath("(.//tr[@class='hb-mouse-over-dragable']//*[@id='gwt-debug-rank'])[2]/..");
			diagnosisAddItem3 = By.xpath("(.//tr[@class='hb-mouse-over-dragable']//*[@id='gwt-debug-rank'])[3]/..");

			//shiney
			patient_grid=By.xpath(".//*[@id='gwt-debug-patient-module-button']/tbody/tr[1]/td/div/img");
			patientgrid_firstname=By.xpath(".//td[@class='hb-flex-grid-data-cell']//div[@id='gwt-debug-firstName']");
			patientgrid_lastname=By.xpath(".//*[@id='gwt-debug-lastName-search-bar']");
			patientgrid_AddIcon=By.xpath(".//div[@id='gwt-debug-add-button-search-bar']/img");
			patientsearch=By.xpath(".//div[@id='gwt-debug-firstName']");
			patienttab=By.xpath(".//input[@id='gwt-debug-firstName-search-bar']");

			Patientdemographics_initial=By.xpath(".//input[@id='gwt-debug-Patient.middleInitial']");
			Patientdemographics_adderess1=By.xpath(".//input[@id='gwt-debug-Patient.primaryAddress.street1']");
			Patientdemographics_adderess2=By.xpath(".//input[@id='gwt-debug-Patient.primaryAddress.street2']");

			PatientInsurance_Tab=By.xpath("//div[@class='gwt-TabLayoutPanelTabInner']//div[text()='Insurance']");
			patientInsurance_prayer=By.xpath(".//div[@id='gwt-debug-insurancecarrier-search-bar']/input");
			patientInsurance_prayername=By.xpath(".//input[@id='gwt-debug-carrierName-search-bar']");
			patientInsurance_prayerid=By.xpath(".//input[@id='gwt-debug-payerId-search-bar']");
			patientInsurance_prayerPolicyNum=By.xpath("//div[contains(text(),'Use this interface to manage')]/parent::div/div//table/tbody/tr[2]/td[3]/input");
			patientInsurance_prayerAddIcon=By.xpath("//img[@class='gwt-Image hb-flex-add-button hb-mouse-over-clickable']");
			patientInsurance_prayerSave=By.xpath(".//*[@id='gwt-debug-selection-grid-view-save-button']");

			PatientAdd = By.xpath(".//*[@id='gwt-debug-add-button-search-bar']/img");


			//4Th Mar
			PatientOfficeSug1 = By.xpath(".//*[@class='hb-simple-grid-dropdown']//td[@class='suggestPopupMiddleCenter']//td[1][contains(text(),'Gallop_Ofc_8556')]");
			AttorneyFirstName = By.xpath(".//*[@id='gwt-debug-person.firstName-search-bar']");
			AttorneyLastName = By.xpath(".//*[@id='gwt-debug-person.lastName-search-bar']");
			topDisplayedAttorneyFirstName = By.xpath(".//td[@class='hb-flex-grid-data-cell']//div[@id='gwt-debug-person.firstName']");
			topDisplayedDMEFirstName = By.xpath(".//*[text()='DME1255']");
			DMEFirstName = By.xpath(".//*[@id='gwt-debug-name-search-bar']");
			DMEAdress = By.xpath(".//*[@id='gwt-debug-primaryAddress-search-bar']/input");
			DMEAdd = By.xpath(".//td[@class='hb-flex-grid-entry-bar-cell']/div//*[@class='gwt-Image hb-flex-add-button hb-mouse-over-clickable']");
			topDisplayedChurch = By.xpath(".//td[@class='hb-flex-grid-data-cell']//*[@id='gwt-debug-name']");
			pharmacyAdd = By.xpath(".//img[@class='gwt-Image hb-flex-add-button hb-mouse-over-clickable']");

			allergiesTab = By.xpath(".//div[text()='ALLERGIES']");
			AllergyConfirm = By.xpath(".//div[contains(text(),'any allergies?')]/parent::td/following-sibling::td//input[contains(@name,'Yes')]");
			AllergyType = By.xpath(".//*[@id='gwt-debug-allergyType-search-bar']");
			AllergyReaction = By.xpath(".//*[@id='gwt-debug-reaction-search-bar']");
			AllergyAdd = By.xpath("(.//div[@class='hb-grid-button-column hb-grid-button-column-up']//img)[2]");
			TopDisplayedAllergy = By.xpath("//td[@class='hb-flex-grid-data-cell']//*[@id='gwt-debug-name']");
			AllergyVerify = By.xpath(".//*[contains(text(),'Allergy_Name_')]");
			assignmentTab = By.xpath(".//div[text()='Assignments']");
			CNAName = By.xpath(".//div[text()='Certified Nurse Assistant']/parent::td/following-sibling::td//div[@id='gwt-debug-person']/input");
			assignmentFirstName = By.xpath(".//td[@class='hb-flex-grid-entry-bar-cell']//*[@id='gwt-debug-firstName-search-bar']");
			assignmentLastName = By.xpath(".//td[@class='hb-flex-grid-entry-bar-cell']//*[@id='gwt-debug-lastName-search-bar']");
			assignmentPersonAdd = By.xpath(".//*[@id='gwt-debug-add-button-search-bar']/img[@class='gwt-Image hb-flex-add-button hb-mouse-over-clickable']");
			topDisplayedPerson = By.xpath("//div[text()='assignmentPerson']");

			assignmentCNAStartDate_day = By.xpath(".//div[text()='Certified Nurse Assistant']/parent::td/following-sibling::td[2]//div[@id='gwt-debug-startDate']//select[contains(@class,'day')]");
			assignmentCNAStartDate_month = By.xpath(".//div[text()='Certified Nurse Assistant']/parent::td/following-sibling::td[2]//div[@id='gwt-debug-startDate']//select[contains(@class,'month')]");
			assignmentCNAStartDate_year = By.xpath(".//div[text()='Certified Nurse Assistant']/parent::td/following-sibling::td[2]//div[@id='gwt-debug-startDate']//select[contains(@class,'year')]");

			assignmentCNAEndDate_day = By.xpath(".//div[text()='Certified Nurse Assistant']/parent::td/following-sibling::td[3]//div[@id='gwt-debug-endDate']//select[contains(@class,'day')]");
			assignmentCNAEndDate_month = By.xpath(".//div[text()='Certified Nurse Assistant']/parent::td/following-sibling::td[3]//div[@id='gwt-debug-endDate']//select[contains(@class,'month')]");
			assignmentCNAEndDate_year = By.xpath(".//div[text()='Certified Nurse Assistant']/parent::td/following-sibling::td[3]//div[@id='gwt-debug-endDate']//select[contains(@class,'year')]");
			selectedName = By.xpath(".//div[text()='Certified Nurse Assistant']/parent::td/following-sibling::td[1]//input");
			topDisplayedPersonSelect = By.xpath(".//*[text()='assignmentPerson']/parent::td/preceding-sibling::td[1]//input");
			addButton_historyTab = By.xpath(".//*[@id='gwt-debug-primaryCoverage.carrierName-search-bar']/../following-sibling::td[3]//img");

			//shiney

			dischargeButton=By.xpath("//button[text()='DISCHARGE']");
			dischargetype=By.xpath(".//select[@id='gwt-debug-dischargeCodeType.s']");
			dischargereason=By.xpath(".//select[@id='gwt-debug-dischargeReason']");
			dischargedate_month=By.xpath("//*[@id='gwt-debug-dischargeDate']//select[contains(@class,'month')]");
			dischargedate_day=By.xpath("//*[@id='gwt-debug-dischargeDate']//select[contains(@class,'day')]");
			dischargedate_year=By.xpath("//*[@id='gwt-debug-dischargeDate']//select[contains(@class,'year')]");


			//sam

			//sampath
			caregivers_tab = By.xpath("//div[text()='CAREGIVERS']");
			admitted_status_xpath = By.xpath("//div[text()='Admitted']");
			addButton_Caregiver = By.xpath(".//*[@id='gwt-debug-patient-basic-information']//img[contains(@class,'hb-flex-add-button')]");
			firstName_caregiver = By.xpath(".//*[@id='gwt-debug-person.firstName-search-bar']");
			lastName_caregiver = By.xpath(".//*[@id='gwt-debug-person.lastName-search-bar']");
			relation_caregiver = By.xpath(".//*[@id='gwt-debug-relationship-search-bar']");
			addButton_caregiver_individual = By.xpath("(//*[@id='gwt-debug-add-button-search-bar']/img)[2]");
			saveBtn_caregiverTab = By.xpath(".//*[@id='gwt-debug-selection-grid-view-save-button']");

			insurance_policyNumberInput = By.xpath("//div[text()='Policy Number']/../../../preceding-sibling::tr[1]/td[3]/input");
			insurance_payerInput = By.xpath(".//*[@id='gwt-debug-carrierName-search-bar']");
			billForRB = By.xpath(".//*[@id='gwt-debug-billForRB-search-bar-input']");
			addButton_historyTab = By.xpath(".//*[@id='gwt-debug-primaryCoverage.carrierName-search-bar']/../following-sibling::td[3]//img");
			historyTab_secondaryinsuranceDropdown = By.xpath(".//*[@id='gwt-debug-secondaryCoverage.carrierName-search-bar']");
			current_election_Label = By.xpath("(//div[text()='Current Election'])[1]");

			electionGrid_AttendingPhysician_priInsurer = By.xpath("//div[contains(text(),'Attending:')]/../div[2]/input");
			electionGrid_verbalDate_month_attendingPhysician = By.xpath(".//*[@id='gwt-debug-certificationDTO.attendingPhysicianVerbalDate']//select[contains(@class,'month')]");
			electionGrid_verbalDate_day_attendingPhysician = By.xpath(".//*[@id='gwt-debug-certificationDTO.attendingPhysicianVerbalDate']//select[contains(@class,'day')]");
			electionGrid_verbalDate_year_attendingPhysician = By.xpath(".//*[@id='gwt-debug-certificationDTO.attendingPhysicianVerbalDate']//select[contains(@class,'year')]");
			electionGrid_signatureDate_month_attendingPhysician = By.xpath("//*[@id='gwt-debug-certificationDTO.attendingPhysicianWrittenDate']//select[contains(@class,'month')]");
			electionGrid_signatureDate_day_attendingPhysician = By.xpath("//*[@id='gwt-debug-certificationDTO.attendingPhysicianWrittenDate']//select[contains(@class,'day')]");
			electionGrid_signatureDate_year_attendingPhysician = By.xpath("//*[@id='gwt-debug-certificationDTO.attendingPhysicianWrittenDate']//select[contains(@class,'year')]");

			electionGrid_verbalDate_month_hospicePhysician = By.xpath(".//*[@id='gwt-debug-certificationDTO.hospicePhysicianVerbalDate']//select[contains(@class,'month')]");
			electionGrid_verbalDate_day_hospicePhysician = By.xpath(".//*[@id='gwt-debug-certificationDTO.hospicePhysicianVerbalDate']//select[contains(@class,'day')]");
			electionGrid_verbalDate_year_hospicePhysician = By.xpath(".//*[@id='gwt-debug-certificationDTO.hospicePhysicianVerbalDate']//select[contains(@class,'year')]");
			electionGrid_signatureDate_month_hospicePhysician = By.xpath("//*[@id='gwt-debug-certificationDTO.hospicePhysicianWrittenDate']//select[contains(@class,'month')]");
			electionGrid_signatureDate_day_hospicePhysician = By.xpath("//*[@id='gwt-debug-certificationDTO.hospicePhysicianWrittenDate']//select[contains(@class,'day')]");
			electionGrid_signatureDate_year_hospicePhysician = By.xpath("//*[@id='gwt-debug-certificationDTO.hospicePhysicianWrittenDate']//select[contains(@class,'year')]");
			electionGrid_hospicePhysicianName = By.xpath("//div[contains(text(),'Hospice:')]/../div[2]/input");
			electionGrid_physicianName = By.xpath("//div[text()='Physician:']/parent::td/following-sibling::td/input");
			electionGrid_certifyingPhysicianInput = By.xpath("//div[contains(text(),'Certifying Physician:')]/../div[2]/input");

			historyTab_LocationInput = By.xpath(".//input[@id='gwt-debug-loc-search-bar']");
			historyTab_LocationDropdown = By.xpath(".//select[@id='gwt-debug-levelOfCare']");
			historyTab_FacilityInput = By.xpath("//div[text()='Facility:']/../following-sibling::td/input");
			endDate_month_RespiteLocation = By.xpath(".//*[@id='gwt-debug-endDateProvided']//select[contains(@class,'month hb-date-dropdown-novalue')]");
			endDate_day_RespiteLocation = By.xpath(".//*[@id='gwt-debug-endDateProvided']//select[contains(@class,'day hb-date-dropdown-novalue')]");
			endDate_year_RespiteLocation = By.xpath(".//*[@id='gwt-debug-endDateProvided']//select[contains(@class,'year hb-date-dropdown-novalue')]");

			physicianInput_historyTab = By.xpath(".//*[@id='gwt-debug-physician-search-bar']/input");
			facilitySug = By.xpath(".//*[@class='hb-simple-grid-dropdown']//td[@class='suggestPopupMiddleCenter']//td[1][contains(text(),'Aklohano Jiolthsori Salwteamc')]");
			electionGrid_TickMark = By.xpath(".//*[@id='gwt-debug-data-modal-save-button']");

			//PatientHeader
			patientHeader_firstName = By.xpath("//table[@class='hb-patient-info-header']/tbody/tr/td[1]/table/tbody/tr/td[3]/div");
			patientHeader_lastName  = By.xpath("//table[@class='hb-patient-info-header']/tbody/tr/td[1]/table/tbody/tr/td[5]/div");
			patientHeader_powerOfAtorney = By.xpath(" //div[text()='CG']/../following-sibling::td[1]/div");
			patientHeader_physician = By.xpath("//div[text()='Phys']/../following-sibling::td[1]/div");
			patientHeader_insurance = By.xpath("//div[text()='Insurance']/../following-sibling::td[1]/div");
			attendingPhysicianVerify = By.xpath(".//*[@id='gwt-debug-transient.attPhysician']/div");
			insuranceVerify = By.xpath("//div[@class='GKGO0M2BAM']/table/tbody/tr[2]//table/tbody/tr[1]/td[11]/div");
			patientFirstNameVerify = By.xpath(".//*[@id='gwt-debug-Patient.firstName']");
			patientLastNameVerify = By.xpath(".//*[@id='gwt-debug-Patient.lastName']");
			patientHeader_refDate = By.xpath("//div[text()='as of']/../following-sibling::td[1]/div");
			patientHeader_phone = By.xpath("//div[text()='Phone']/../following-sibling::td[1]//div");
			patientHeader_Zip = By.xpath("//div[@class='hb-patient-header-box GKGO0M2BPM']/table[2]//div");



			//sam block

			reffered_status_xpath=By.xpath(".//div[text()='Referred By']");

			insurence_newssn=By.xpath("(.//input[@id='gwt-debug-*-search-bar']");
			history_updateddate=By.xpath("(.//*[@id='gwt-debug-effectiveDate']/div[1]/div[2])[2]");
			demographictab=By.xpath("//div[@class='gwt-TabLayoutPanelTabInner']//div[text()='DEMOGRAPHICS']");
			SSN_status_xpath=By.xpath("(//div[text()='SSN'])[2]");
			//SSN_status_xpath=By.xpath(".//*[@id='gwt-debug-insurancecarrier']//div[text()='Medicare']");


			//16 march

			unadmitButton = By.xpath("//button[text()='UN-ADMIT']");
			confirnunadmitbutton=By.xpath(".//*[@id='gwt-debug-ok-button']");
			reffered_status=By.xpath(".//div[text()='Referred']");
			historyStatus=By.xpath("//div[@class='GKGO0M2BAM']//table//..//tr[1]//td[4]//div[text()='R']");

			effectiveDatehistoryTab_day = By.xpath("(.//*[@id='gwt-debug-effectiveDate-search-bar']//select[contains(@class,'day')])[2]");
			effectiveDatehistoryTab_month = By.xpath("(.//*[@id='gwt-debug-effectiveDate-search-bar']//select[contains(@class,'month')])[2]");
			effectiveDatehistoryTab_year = By.xpath("(.//*[@id='gwt-debug-effectiveDate-search-bar']//select[contains(@class,'year')])[2]");

			billingreport_widget=By.xpath("//div[@class='hb-start-page-content']//img[contains(@src, '0A9PbllAAAAAElFTkSuQmCC')]");
			billingmonth=By.xpath("//div[text()='Mar - 2016']");


			/*cliamdetailspatientname=By.xpath("//table[@class='prebill-patient-header-panel']//tbody//tr[1]//td[1]//table//tbody//tr[1]//td[1]//div");
			claimdetailspatientid=By.xpath("//table[@class='prebill-patient-header-panel']//tbody//tr[1]//td[1]//table//tbody//tr[1]//td[3]//div");

			cliamdetailsPolicyNumber=By.xpath("//table[@class='prebill-patient-detail-panel']/tbody/tr/td[3]/table/tbody/tr[3]//div[text()='Policy Number:']//parent::td/following-sibling::td[2]/div");
			cliamdetailsprimaryinsurance=By.xpath("//table[@class='prebill-patient-detail-panel']/tbody/tr//td[3]/table/tbody/tr//div[text()='Primary Insurance:']//parent::td/following-sibling::td[2]/div");
			cliamdetailsdob=By.xpath("//table[@class='prebill-patient-detail-panel']/tbody/tr//td/table/tbody/tr[4]//div[text()='DOB:']//parent::td/following-sibling::td[2]/div");
			cliamdetailsdiagnosiscode=By.xpath("//table[@class='prebill-patient-detail-panel']/tbody/tr//td/table/tbody/tr[1]//div[text()='Diagnosis Codes:']//parent::td/following-sibling::td[2]/div");
			cliamdetailsstatus=By.xpath("//table[@class='prebill-patient-detail-panel']/tbody/tr//td/table/tbody/tr[9]//div[text()='Claim Status:']//parent::td/following-sibling::td[2]/div");
			 */



			//03162016
			PhoneAddicon = By.xpath("//table[@class='hb-table-spacing hb-font-size']//tr/td[1]//img[@class='gwt-Image hb-mouse-over-clickable']");
			NewPhoneNumber = By.xpath("//div[@id='gwt-debug-patient-demographics']//div[1]//*[@class='hb-table-spacing hb-font-size']//tr[1]//*[@class='hb-font-size hb-widget-right-space']//input");
			PhoneNumberlink = By.xpath("//div[@class='hb-patient-hdr-info-header-data-blue-underline']");
			PhoneNumberText = By.xpath("//div[@class='hb-patient-info-header-popup-text-blue']");
			AllergiesLink = By.xpath("//div[text()='Allergies']//parent::td//following-sibling::td//div");
			AllergiesText = By.xpath("//div[@class='hb-patient-info-header-popup-text-blue']");
			FirstAllergy = By.xpath("//table[@class='hb-flex-table']//tr[1]//input[@id='gwt-debug-name']");
			SecondAllergy = By.xpath("//table[@class='hb-flex-table']//tr[2]//input[@id='gwt-debug-name']");


			//17
			leftside_grid=By.xpath("(.//*[@id='gwt-debug-vertical-drawer-grip-bar'])[1]");
			firstnameAssert=By.xpath("(.//*[@id='gwt-debug-firstName'])[2]");
			ssnAssert=By.xpath("(.//*[@id='gwt-debug-ssn'])[2]");
			statusdateAssert=By.xpath("(.//*[@id='gwt-debug-statusDate']/div[1]/div[2])[2]");
			statusassert=By.xpath("(.//*[@id='gwt-debug-status'])[2]");
			
			
			//03172016
			patientFirstNameReport = By.xpath("(.//*[@id='gwt-debug-patientFirstName-search-bar'])[2]");
			historyTab__day = By.xpath(".//div[@class='GKGO0M2BAM']//*[@id='gwt-debug-effectiveDate-search-bar']//select[contains(@class,'day')]");
			historyTab__month = By.xpath(".//div[@class='GKGO0M2BAM']//*[@id='gwt-debug-effectiveDate-search-bar']//select[contains(@class,'month')]");
			historyTab__year = By.xpath(".//div[@class='GKGO0M2BAM']//*[@id='gwt-debug-effectiveDate-search-bar']//select[contains(@class,'year')]");
			AllergyAddNew = By.xpath("//div[@class='hb-grid-button-column hb-grid-button-column-up']//img[@class='gwt-Image hb-flex-add-button hb-mouse-over-clickable']");
			PrimaryInsuVerify = By.xpath("(.//*[@id='gwt-debug-primaryInsurance'])[2]");
			SecondInsuVerify = By.xpath("(.//*[@id='gwt-debug-secondaryInsurance'])[2]");
			
			//22 march
			firstPatientRowInTable = By.xpath("(.//*[@id='gwt-debug-patient-listing']//table//table)[2]/tbody/tr[1]");
			
			//23 march
			addCaregiversTabHeader = By.xpath("//div[text()='Add Caregiver']");
			existingFirstRowInCareGiversTab = By.xpath("//div[@class='popupContent']//table/tbody/tr[2]/td/div/div/table/tbody/tr[1]");
			firstRowDisplayedInCareGiversTab = By.xpath("(.//*[@id='gwt-debug-person.firstName'])[2]");
			patientHeader_CareGiverDisplayed = By.xpath("//div[text()='CG']/parent::td/following-sibling::td[1]/div");
			
			//march 29
			   funeralHomeFaciltyName = By.xpath(".//*[@id='gwt-debug-name-search-bar']");
			   funeralHomeFacilityAddress = By.xpath(".//*[@id='gwt-debug-primaryAddress-search-bar']/input");
			   topDisplayedFuneralFacilityHome = By.xpath(".//*[text()='Funeral Facility Contact']/parent::td/preceding-sibling::td[1]/span/input");
			  
		}
	}}
