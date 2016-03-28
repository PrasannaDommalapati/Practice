package com.Mumms.libs;

import java.util.Hashtable;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Mumms.page.AdminPage;
import com.Mumms.page.HomePage;
import com.Mumms.page.PatientPage;

public class PatientLib extends MummsLib{


	public String gstrpatientFirstName2, gstrpatientFirstName1,gstrpatientInsurance_prayername1,gstrpatientInsurance_prayerid1;
	public void selectAgency() throws Throwable{

		PatientPage.Patient_Page();
		click(PatientPage.loginType, "login Type");
		click(PatientPage.loginAccountType, "select AccountType");
		Thread.sleep(sleepTime_chrome);
	}

	public void setDemographicData(Hashtable<String, String> data,String vstrPatientFirstName) throws Throwable{


		setPatientInfo(data, vstrPatientFirstName);
		setDemographicsInfo(data);
		setRefferalInfo(data);
		setBasicInfo(data);
		setPhysicianInfo(data);
		setConcernsInfo(data);
		setNotesInfo(data);
		doLogout();
		loginAsUserRole("AdminUser ");
		selectAgency("RUTH");
		//searchPatientInfo(data, "Gallop_Demo_6411");
		searchPatientInfo(data, vstrPatientFirstName);
		verifyDemographicsInfo(data,vstrPatientFirstName);
		verifyRefferalInfo(data);
		verifyBasicInfo(data);
		verifyPhysicianInfo(data);
		verifyConcernsInfo(data);
		//verifyNotesInfo(data);
	}

	public void setDiagnosisData(Hashtable<String, String> data,String vstrPatientFirstName) throws Throwable{


		setPatientInfo(data, vstrPatientFirstName);
		setDemographicsInfo(data);
		setRefferalInfo(data);
		setBasicInfo(data);
		setPhysicianInfo(data);
		setConcernsInfo(data);
		setNotesInfo(data);
		admitPatient(data);
		goToDiagnosisTab();
		setDiagnosisInfo(data,"A300","001.0");
		setDiagnosisInfo(data,"Z3A12","001.9");
		setDiagnosisInfo(data,"F21","002.12");
		//dragAndDropDiagnosis();


	}

	public void setAllergiesData(Hashtable<String, String> data,String vstrPatientFirstName,String vstrAllergyName) throws Throwable{


		setPatientInfo(data, vstrPatientFirstName);
		setDemographicsInfo(data);
		setRefferalInfo(data);
		setBasicInfo(data);
		setPhysicianInfo(data);
		setConcernsInfo(data);
		setNotesInfo(data);
		admitPatient(data);
		goToAllergiesTab();
		setAllergyInfo(data, vstrAllergyName);
		//03162016
		setSecondAllergyInfo(data, data.get("allergyNameNew"));
		//setAllergyInfo(data, vstrAllergyName);
		verifyAllergyInfo(data, vstrAllergyName);



	}

	public void setAssignmentData(Hashtable<String, String> data,String vstrPatientFirstName) throws Throwable{


		setPatientInfo(data, vstrPatientFirstName);
		setDemographicsInfo(data);
		setRefferalInfo(data);
		setBasicInfo(data);
		setPhysicianInfo(data);
		setConcernsInfo(data);
		setNotesInfo(data);
		admitPatient(data);
		goToAssignmentTab();
		setAssignmentInfo(data);
		verifyAssignmentInfo(data);

	}



	public void searchPatientInfo(Hashtable<String, String> data,String vstrPatientFirstName) throws Throwable{


		PatientPage.Patient_Page();
		click(PatientPage.patientInfoIcon, "patient Info Icon");
		Thread.sleep(sleepTime_chrome);
		//click(PatientPage.patientListDropDown, "patient List DropDown");
		type(PatientPage.patientFirstName, vstrPatientFirstName, "first name field");
		sleep(3000);
		click(PatientPage.topDisplayedPatient, "patient");

	}

	public void verifyDemographicsInfo(Hashtable<String, String> data,String vstrPatientFirstName) throws Throwable{

		PatientPage.Patient_Page();

		assertTextMatchingWithAttribute(PatientPage.PatientTitle, data.get("PatientTitle"), "PatientTitle");
		sleep(3000);
		assertTextMatchingWithAttribute(PatientPage.PatientNickName, data.get("PatientNickName"), "Patient NickName");
		sleep(3000);
		assertTextMatchingWithAttribute(PatientPage.patientFirstNameVerify, vstrPatientFirstName, "Patient First Name");
		sleep(3000);
		
		assertTextMatchingWithAttribute(PatientPage.patientLastNameVerify, data.get("patientLastName"), "Patient Last Name");
		//assertTextMatchingWithAttribute(PatientPage.phoneNumber, data.get("phoneNumberDemo"), "Phone number");
		
		//03162016
		click(PatientPage.PhoneNumberlink, "Phone Link");
		String PhoneNumbers = getText(PatientPage.PhoneNumberText, "All Phone Numbers");
		System.out.println(PhoneNumbers);
		String FirstPhoneNumber = data.get("phoneNumberDemo");
		String SecondPhoneNumber = data.get("newPhoneNumber");
		if(PhoneNumbers.contains(FirstPhoneNumber) && PhoneNumbers.contains(SecondPhoneNumber)){
			reporter.SuccessReport("Verify Patient Phone Numbers", "Patient Phone numbers are successfully verified");
		}else{
			reporter.failureReport("Verify Patient Phone Numbers", "Patient Phone numbers are incorrect");
		}
		
		assertTextMatchingWithAttribute(PatientPage.PatientZip1, data.get("PatientZip1"), "zip");
		sleep(3000);
		assertTextMatching(PatientPage.patientHeader_firstName, vstrPatientFirstName, "Patient First Name in header");
		assertTextMatching(PatientPage.patientHeader_lastName, data.get("patientLastName"), "Patient Last Name in header");
		assertTextMatching(PatientPage.patientHeader_phone, data.get("phoneNumberDemo"), "Phone number in header");
		assertTextMatching(PatientPage.patientHeader_Zip, "CINCINNATI, OH, 45221", "zip");
	}
	public void verifyRefferalInfo(Hashtable<String, String> data) throws Throwable{

		PatientPage.Patient_Page();
		assertTextMatchingWithAttribute(PatientPage.PatientCallReceivedFrom, data.get("PatientCallReceivedFrom"), "Patient Call Received");
		sleep(3000);
		assertTextMatchingWithAttribute(PatientPage.PatientreRelationManager, data.get("PatientreRelationManager"), "Patient Relation Manager field");
		sleep(3000);
		Driver.findElement(By.xpath(".//*[@id='gwt-debug-Patient.patientReferral.referralDateTime']//select[contains(@class,'month')]/option[@value='2']")).getText();
		
		String RefDayValue = Driver.findElement(PatientPage.earlier_referralDate_day).getAttribute("value");
		String actRefDay = Driver.findElement(By.xpath(".//*[@id='gwt-debug-Patient.patientReferral.referralDateTime']//"
				+ "select[contains(@class,'day')]/option[@value='"+RefDayValue+"']")).getText();
		
		String RefMonthValue = Driver.findElement(PatientPage.earlier_referralDate_month).getAttribute("value");
		String actRefMonth = Driver.findElement(By.xpath(".//*[@id='gwt-debug-Patient.patientReferral.referralDateTime']//"
				+ "select[contains(@class,'month')]/option[@value='"+RefMonthValue+"']")).getText();
		
		assertTextStringMatching(actRefDay, data.get("earlier_referralDate_day"));
		assertTextStringMatching(actRefMonth, data.get("earlier_referralDate_month"));
		
		assertTextMatchingWithAttribute(PatientPage.earlier_referralDate_year, data.get("earlier_referralDate_year"), "verify Year");
		assertTextMatching(PatientPage.patientHeader_refDate, "03/01/16", "refferal time in header");
	}

	public void verifyBasicInfo(Hashtable<String, String> data) throws Throwable{

		PatientPage.Patient_Page();
		assertTextMatchingWithAttribute(PatientPage.PatientSex, data.get("PatientSex"), "Patien tSex");
		sleep(3000);
		assertTextMatchingWithAttribute(PatientPage.PatientEthnicity, data.get("PatientEthnicity"), "Patient Ethnicity");
		click(PatientPage.ssn, "ssn field");
		assertTextMatchingWithAttribute(PatientPage.ssn, data.get("ssnBasic"), "ssn");
	}

	public void verifyPhysicianInfo(Hashtable<String, String> data) throws Throwable{

		PatientPage.Patient_Page();
		assertTextMatchingWithAttribute(PatientPage.PatientRefPhysician, data.get("PatientRefPhysician"), "Ref Physician");
		sleep(3000);
		assertTextMatching(PatientPage.attendingPhysicianButtonVerify, data.get("attendingPhysician"), "Physician");
		//assertTextMatching(PatientPage.patientHeader_physician, "Dr Jeff Acker", "Physician in header");
		String text = getText(PatientPage.patientHeader_physician, "patientHeader_physician");
		assertTrue(StringUtils.contains(text, data.get("DoctorFN")), "verifying doctor on header");
		
	}

	public void verifyConcernsInfo(Hashtable<String, String> data) throws Throwable{

		PatientPage.Patient_Page();
		assertTextMatchingWithAttribute(PatientPage.PatientCauseOfStress,data.get("PatientCauseOfStress"), "Patient Cause Of Stress ");
		sleep(3000);
		//assertTextMatchingWithAttribute(PatientPage.patientGreatestNeed,data.get("patientGreatestNeed"), "patient Greatest Need");
	}

	public void verifyNotesInfo(Hashtable<String, String> data) throws Throwable{

		PatientPage.Patient_Page();
		sleep(3000);
		assertTextMatchingWithAttribute(PatientPage.PatientNotes,data.get("PatientNotes"), "Patient Notes");
	}


	public void verifyAllergyInfo(Hashtable<String, String> data,String vstrAllergyName) throws Throwable{

		PatientPage.Patient_Page();
		
		//03162016
		String SecondAllergy = data.get("allergyNameNew");
		sleep(sleep);
		assertTextMatchingWithAttribute(PatientPage.FirstAllergy, vstrAllergyName, "allergy grid");
		sleep(sleep);
		assertTextMatchingWithAttribute(PatientPage.SecondAllergy, SecondAllergy, "allergy grid");
		click(PatientPage.AllergiesLink, "Allergies Link");
		String Allergies = getText(PatientPage.AllergiesText, "All Allergy details");
		System.out.println(Allergies);	
		if(Allergies.contains(vstrAllergyName) && Allergies.contains(SecondAllergy)){
			reporter.SuccessReport("Verify Patient Allergy details", "Patient Allergy details are successfully verified");
		}else{
			reporter.failureReport("Verify Patient Allergy details", "Patient Allergy details are incorrect");
		}
		
/*		sleep(sleep);
		assertTextMatchingWithAttribute(PatientPage.TopDisplayedAllergy, vstrAllergyName, "allergy grid");
		sleep(sleep);
		assertTextMatching(PatientPage.AllergyVerify, vstrAllergyName, "allergy in patient Header");*/
		
	}

	public void dragAndDropDiagnosis() throws Throwable{

		PatientPage.Patient_Page();
		Actions act = new Actions(Driver);
		sleep(sleep);
		WebElement IDGTeamSource1 = Driver.findElement(By.xpath("(//tr[@class='hb-mouse-over-dragable'])[1]/td[1]"));
		WebElement IDGTeamDestination1 = Driver.findElement(By.xpath("(//tr[@class='hb-mouse-over-dragable'])[2]"));

		act.dragAndDrop(IDGTeamSource1, IDGTeamDestination1).build().perform();

		WebElement LocatorFrom = IDGTeamSource1;
		WebElement LocatorTo = IDGTeamDestination1;
		String xto=Integer.toString(LocatorTo.getLocation().x+5);
		String yto=Integer.toString(LocatorTo.getLocation().y+5);
		((JavascriptExecutor)Driver).executeScript("function simulate(f,c,d,e){var b,a=null;for(b in eventMatchers)if(eventMatchers[b].test(c)){a=b;break}if(!a)return!1;document.createEvent?(b=document.createEvent(a),a==\"HTMLEvents\"?b.initEvent(c,!0,!0):b.initMouseEvent(c,!0,!0,document.defaultView,0,d,e,d,e,!1,!1,!1,!1,0,null),f.dispatchEvent(b)):(a=document.createEventObject(),a.detail=0,a.screenX=d,a.screenY=e,a.clientX=d,a.clientY=e,a.ctrlKey=!1,a.altKey=!1,a.shiftKey=!1,a.metaKey=!1,a.button=1,f.fireEvent(\"on\"+c,a));return!0} var eventMatchers={HTMLEvents:/^(?:load|unload|abort|error|select|change|submit|reset|focus|blur|resize|scroll)$/,MouseEvents:/^(?:click|dblclick|mouse(?:down|up|over|move|out))$/}; " +
				"simulate(arguments[0],\"mousedown\",0,0); simulate(arguments[0],\"mousemove\",arguments[1],arguments[2]); simulate(arguments[0],\"mouseup\",arguments[1],arguments[2]); ",
				LocatorFrom,xto,yto);


		String javascript =
				"var dropTarget = jQuery(" + LocatorFrom + ");" +"\n" +"jQuery("+ LocatorTo + ").simulate('drag', { dropTarget: dropTarget });";


		((JavascriptExecutor)Driver).executeScript("var dropTarget = jQuery(" + LocatorFrom + ");" +"\n" +"jQuery("+ LocatorTo + ").simulate('drag', { dropTarget: dropTarget })");
		System.out.println("test");


		/*		act.moveToElement(IDGTeamDestination1);
		sleep(500);
		act.clickAndHold(IDGTeamDestination1);
		sleep(500);
		act.moveToElement(IDGTeamSource1);
		sleep(500);
		act.release().build().perform();
		sleep(500);
		 */		//dragAndDrop(IDGTeamSource1, IDGTeamDestination1).release(IDGTeamSource1).build().perform();

		//		act.dragAndDrop(IDGTeamSource1, IDGTeamDestination1);
		//		act.release(IDGTeamSource1);
		//		act.build().perform();
		sleep(5000);
		WebElement IDGTeamSource2 = Driver.findElement(PatientPage.diagnosisAddItem2);
		WebElement IDGTeamDestination2 = Driver.findElement(PatientPage.diagnosisAddItem3);
		act.dragAndDrop(IDGTeamSource2, IDGTeamDestination2).build().perform();
	}

	public void createNewPatientInAdminCreatedSite(Hashtable<String, String> data,String vstrPatientFirstName, String vstrPatientLastName) throws Throwable{

		new PatientPage().Patient_Page();
		click(PatientPage.patient_grid,"patient grid");

		type(PatientPage.patientFirstName, vstrPatientFirstName, "first name field");
		type(PatientPage.patientLastName, vstrPatientLastName, "Lastname field");
		click(PatientPage.PatientAdd, "add button");
		java.lang.String strPatientFirstName1 = vstrPatientFirstName;
		//	String patient_fn_act = getText(AdminPage.patient_FN_Verification, "first name displayed of the created patient");
		//assertTextStringMatching(patient_fn_act, patientFirstName);
	}


	public void updateExistPatientInAdminCreatedSite(Hashtable<String, String> data)throws Throwable{
		new PatientPage().Patient_Page();

		//	click(AdminPage.patient_grid,"patient grid");
		gstrpatientFirstName2= gstrpatientFirstName1;
		//type(AdminPage.patientFirstName,patientFirstName2, "first name field");
		//click(AdminPage.patientgrid_firstname,"patientgrid_firstname");

		//type(AdminPage.patientLastName, patientLastName, "Lastname field");
		type(PatientPage.Patientdemographics_initial, data.get("Patientdemographics_initial"), "Patient demographic");
		type(PatientPage.Patientdemographics_adderess1, data.get("Patientdemographics_adderess1"), "Patient adderess ");
		type(PatientPage.Patientdemographics_adderess2, data.get("Patientdemographics_adderess2"), "Patient adderess ");
		//gotoInsurence(data);
		//gotoHistroty(data);
		//	click(AdminPage.admitButton,"Admit Button");

	}
	public void gotoInsurence(Hashtable<String, String> data)throws Throwable{
		new PatientPage().Patient_Page();
		int randNum = generateRandonNumber();

		click(PatientPage.PatientInsurance_Tab, "patient insurance");
		click(PatientPage.patientInsurance_prayer, "patient insurance Prayer");
		gstrpatientInsurance_prayername1= data.get("patientInsurance_prayername")+Integer.toString(randNum);
		gstrpatientInsurance_prayerid1=data.get("patientInsurance_prayerid")+Integer.toString(randNum);
		type(PatientPage.patientInsurance_prayername,gstrpatientInsurance_prayername1, "patientInsurance_prayername");
		sleep(sleep);
		type(PatientPage.patientInsurance_prayerid,gstrpatientInsurance_prayerid1 , "patientInsurance_prayerid");
		sleep(sleep);
		click(PatientPage.patientInsurance_prayerAddIcon, "prayer add");
		sleep(sleep);
		click(PatientPage.patientInsurance_prayerSave, "prayer Save");
		type(PatientPage.patientInsurance_prayerPolicyNum, data.get("patientInsurance_prayerPolicyNum"), "patientInsurance_prayer");
		click(PatientPage.patientInsurance_prayerAddIcon, "insurance add");
		click(PatientPage.admitButton,"Admit Button");
	}


	public void goToAssignmentTab() throws Throwable{
		PatientPage.Patient_Page();
		click(PatientPage.assignmentTab, "assignment Tab");

	}

	public void setAssignmentInfo(Hashtable<String, String> data) throws Throwable{

		PatientPage.Patient_Page();
		click(PatientPage.CNAName,"CNA Name Grid");
		type(PatientPage.assignmentFirstName, data.get("assignmentFirstName"), "assignment FirstName field");
		sleep(4000);

		if(isElementPresent(PatientPage.topDisplayedPerson, "Verify FirstName"))
		{
			sleep(4000);
			click(PatientPage.topDisplayedPersonSelect, "assignmentFirstName");
		}
		else{
			sleep(3000);
			type(PatientPage.assignmentLastName, data.get("assignmentLastName"), "assignment LastName field");
			sleep(sleep);
			click(PatientPage.assignmentPersonAdd,"Add Icon");
			sleep(sleep);
			type(PatientPage.assignmentFirstName, data.get("assignmentFirstName"), "assignment FirstName field");
			sleep(sleep);
			click(PatientPage.topDisplayedPersonSelect, "assignmentFirstName");
			sleep(sleep);

		}

		click(PatientPage.saveButton,"save Button");
		sleep(sleep);
		selectByVisibleText(PatientPage.assignmentCNAStartDate_day, data.get("assignmentStartDate_Day"), "from drop down");
		selectByVisibleText(PatientPage.assignmentCNAStartDate_month, data.get("assignmentStartDate_Month"), "from drop down");
		selectByVisibleText(PatientPage.assignmentCNAStartDate_year, data.get("assignmentStartDate_Year"), "from drop down");
		selectByVisibleText(PatientPage.assignmentCNAEndDate_day, data.get("assignmentEndDate_Day"), "from drop down");
		selectByVisibleText(PatientPage.assignmentCNAEndDate_month, data.get("assignmentEndDate_Month"), "from drop down");
		selectByVisibleText(PatientPage.assignmentCNAEndDate_year, data.get("assignmentEndDate_Year"), "from drop down");
		sleep(sleep);
	}

	public void verifyAssignmentInfo(Hashtable<String, String> data) throws Throwable{

		PatientPage.Patient_Page();
		assertTextMatchingWithAttribute(PatientPage.selectedName, data.get("assignmentFirstName"), "Person Name");
	}

	//sampath
	
	public void openPatientInfo(Hashtable<String, String> data,String patientFirstName) throws Throwable{


		PatientPage.Patient_Page();
		//	click(PatientPage.patientInfoIcon, "patient Info Icon");
		//	Thread.sleep(sleepTime_chrome);
		//click(PatientPage.patientListDropDown, "patient List DropDown");
		System.out.println("fname - " +patientFirstName);
		System.out.println("lname - " +data.get("patientLastName"));
		type(PatientPage.patientFirstName, patientFirstName, "first name field");

		sleep(sleep);
		//type(PatientPage.patientLastName, data.get("patientLastName"), "Lastname field");

		//click(PatientPage.addPatientIcon_patientListing, "add Patient Icon in adding new patient");

		Thread.sleep(sleepTime_chrome);
		Driver.findElement(By.xpath("//td[@class='hb-flex-grid-data-cell']//*[@id='gwt-debug-firstName']")).click();
		Thread.sleep(sleepTime_chrome);	
	}

	public void clickOnPatientInfoIcon() throws Throwable{
	
		PatientPage.Patient_Page();

		click(PatientPage.patientInfoIcon, "patient Info Icon");
		Thread.sleep(sleepTime_chrome);

	}
	

	public void goToCaregiversTab() throws Throwable{
		PatientPage.Patient_Page();
		click(PatientPage.caregivers_tab, "caregivers tab");
	}

	public void addCareGiver(String firstName, String lastName, String relation) throws Throwable{
		PatientPage.Patient_Page();

		click(PatientPage.addButton_Caregiver, "add Button in care giver tab");
		sleep(sleep);
		type(PatientPage.firstName_caregiver, firstName, "first name caregiver 1");
		sleep(sleep);
		type(PatientPage.lastName_caregiver, lastName, "last name caregiver 1");
		sleep(sleep);
		selectByValue(PatientPage.relation_caregiver, relation, "caregiver 1");	
		sleep(sleep);
		click(PatientPage.addButton_caregiver_individual, "addButton on caregiver while creating");
		sleep(sleep+sleep+sleep);
		click(PatientPage.saveBtn_caregiverTab, "save");
	}
/*
	public void addDefaultInfoInInsuranceTab(String payer) throws Throwable{
		PatientPage.Patient_Page();
		click(PatientPage.insurancePayer, "Insurance payer");
		sleep(sleep+1000);
		Driver.findElement(By.xpath(".//*[text()='"+payer+"']/parent::td/preceding-sibling::td[1]//input")).click();
		click(PatientPage.saveButton, "save button after selecting payer");
		sleep(sleep);
	}*/

	public void addCommercialInsurance(String payer) throws Throwable{
		PatientPage.Patient_Page();
		click(PatientPage.insurancePayer, "Insurance payer");
		type(PatientPage.insurance_payerInput, payer, "policyNumber");
		sleep(sleep+2000);
		Driver.findElement(By.xpath(".//*[text()='"+payer+"']/parent::td/preceding-sibling::td[1]//input")).click();
		click(PatientPage.saveButton, "save button after selecting payer");
		sleep(sleep);
	}

	public void setTrueToBillForRB() throws Throwable{
		PatientPage.Patient_Page();
		click(PatientPage.billForRB, "set true for bill for R&B");
		sleep(sleep);
	}

	/*public void setPrimaryInsuranceInHistoryTab(Hashtable<String, String> data, String pri_insurance) throws Throwable{
		PatientPage.Patient_Page();
		selectByVisibleText(PatientPage.historyTab_effectiveDate_month, data.get("effectiveMonth"), "month");
		selectByVisibleText(PatientPage.historyTab_effectiveDate_day, data.get("effectiveDay"), "day");
		selectByVisibleText(PatientPage.historyTab_effectiveDate_year, data.get("effectiveYear"), "Year");
		click(PatientPage.historyTab_priInsuranceDropdown, "primary insurance dropdown");
		selectByVisibleText(PatientPage.historyTab_priInsuranceDropdown,pri_insurance, "primary insurance input");
		click(PatientPage.addButton_historyTab, "add button");
		sleep(sleep);
	}*/

	public void changeLocAndFacilityInHistoryTab(Hashtable<String, String> data) throws Throwable{
		PatientPage.Patient_Page();
		selectByVisibleText(PatientPage.historyTab_effectiveDate_month, data.get("effectiveMonth"), "month");
		selectByVisibleText(PatientPage.historyTab_effectiveDate_day, data.get("effectiveDay"), "day");
		selectByVisibleText(PatientPage.historyTab_effectiveDate_year, data.get("effectiveYear"), "Year");
		click(PatientPage.historyTab_LocationInput, "location input");
		sleep(sleep+3000);
		selectByVisibleText(PatientPage.historyTab_LocationDropdown, data.get("Location"), "location");

		//type(PatientPage.historyTab_FacilityInput, data.get("facility"), "facility");
		Driver.findElement(PatientPage.historyTab_FacilityInput).click();
		sleep(sleep);
		Driver.findElement(PatientPage.historyTab_FacilityInput).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Driver.findElement(PatientPage.historyTab_FacilityInput).sendKeys(Keys.DELETE);
		String facility = data.get("facility");
		String[] str = facility.split("");
		for(int i =0;i<str.length;i++)
		{
			Driver.findElement(PatientPage.historyTab_FacilityInput).sendKeys(str[i]);
			sleep(1000);
		}
		sleep(2000);
		clickUsingJavascriptExecutor(PatientPage.facilitySug, "facility Suggestion");

		click(PatientPage.okBtn_admitPopup, "ok button on popup");
		click(PatientPage.addButton_historyTab, "add button");
		sleep(sleep);
	}

	public void setLocationRespiteAndSetEndDate(Hashtable<String, String> data) throws Throwable{
		PatientPage.Patient_Page();
		selectByVisibleText(PatientPage.historyTab_effectiveDate_month, data.get("respite_effectiveDate_Month"), "month");
		selectByVisibleText(PatientPage.historyTab_effectiveDate_day, data.get("respite_effectiveDate_Day"), "day");
		selectByVisibleText(PatientPage.historyTab_effectiveDate_year, data.get("respite_effectiveDate_Year"), "Year");
		click(PatientPage.historyTab_LocationInput, "location input");
		sleep(sleep+3000);
		selectByVisibleText(PatientPage.historyTab_LocationDropdown, "Respite", "location");
		click(PatientPage.endDate_month_RespiteLocation, "end month");
		selectByVisibleText(PatientPage.endDate_month_RespiteLocation, data.get("respite_endMonth"), "month");
		click(PatientPage.endDate_day_RespiteLocation, "day");
		selectByVisibleText(PatientPage.endDate_day_RespiteLocation, data.get("respite_endDay"), "day");
		click(PatientPage.endDate_year_RespiteLocation, "year");
		selectByVisibleText(PatientPage.endDate_year_RespiteLocation, data.get("respite_endYear"), "Year");
		click(PatientPage.okBtn_admitPopup, "ok button on popup");
		setPhysicianInHistoryTab(data);
		click(PatientPage.addButton_historyTab, "add button");
		sleep(sleep);
	}

	public void setPhysicianInHistoryTab(Hashtable<String, String> data) throws Throwable{
		PatientPage.Patient_Page();
		click(PatientPage.physicianInput_historyTab, "physician Input");
		sleep(sleep);
	//	click(PatientPage.firstDisplayedAttendingPhysician, "first Displayed AttendingPhysician checkbox");
		Driver.findElement(By.xpath("(.//*[@id='gwt-debug-firstName-search-bar'])[2]")).click();
		Driver.findElement(By.xpath("(.//*[@id='gwt-debug-firstName-search-bar'])[2]")).sendKeys(data.get("DoctorFN"));
		sleep(3000);
		Driver.findElement(By.xpath("(.//*[@id='gwt-debug-lastName-search-bar'])[2]")).click();
		Driver.findElement(By.xpath("(.//*[@id='gwt-debug-lastName-search-bar'])[2]")).sendKeys(data.get("DoctorLN"));
		sleep(3000);
		Driver.findElement(By.xpath(".//*[text()='"+data.get("DoctorFN")+"']/parent::td/preceding-sibling::td[1]//input")).click();
		
		sleep(3000);
		click(PatientPage.saveButton, "save Button after selecting physician");
		sleep(3000);

	}


	public void setSecondaryInsuranceInHistoryTab(Hashtable<String, String> data, String sec_insurance) throws Throwable{
		PatientPage.Patient_Page();
		selectByVisibleText(PatientPage.historyTab_effectiveDate_month, data.get("effectiveMonth"), "month");
		selectByVisibleText(PatientPage.historyTab_effectiveDate_day, data.get("effectiveDay"), "day");
		selectByVisibleText(PatientPage.historyTab_effectiveDate_year, data.get("effectiveYear"), "Year");
		click(PatientPage.historyTab_secondaryinsuranceDropdown, "secondory insurance dropdown");
		selectByVisibleText(PatientPage.historyTab_secondaryinsuranceDropdown,sec_insurance, "Secondary insurance input");
		click(PatientPage.addButton_historyTab, "add button");
		sleep(sleep);
	}


	public void verifyPatientHeaderInformation() throws Throwable{


		PatientPage.Patient_Page();
		String fn = Driver.findElement(PatientPage.patientFirstNameVerify).getAttribute("value");
		assertTextStringMatching(fn, getText(PatientPage.patientHeader_firstName, "verify first name in patient header"));

		String ln = Driver.findElement(PatientPage.patientLastNameVerify).getAttribute("value");
		assertTextStringMatching(ln, getText(PatientPage.patientHeader_lastName, "verify last name in patient header"));

		String powerOfAttorney = Driver.findElement(PatientPage.powerOfAttorney).getAttribute("value");
		assertTextStringMatching(powerOfAttorney, getText(PatientPage.patientHeader_powerOfAtorney, "verify power of attorney in patient header"));

		String attendingPhysician = getText(PatientPage.attendingPhysicianVerify, "attendingPhysician");
		String patientHeader_attendingPhysician = getText(PatientPage.patientHeader_physician, "physician in header");
		assertTrue(patientHeader_attendingPhysician.contains(attendingPhysician), "verify physician on header");

		goToHistoryTab();
		String patientHeader_insurance = getText(PatientPage.patientHeader_insurance, "insuarance in patient header");
		assertTextMatching(PatientPage.insuranceVerify, patientHeader_insurance, "verify insurance on patient header");

	}

	public void dragAndDropIntarcationGrid() throws Throwable {

		new HomePage().Home_Page();
		boolean flag = false;

		By widget = By.xpath("//div[@class='gwt-Label hb-widget-title hb-mouse-over-clickable']");


		if(isElementPresent(widget, "widgets on homepage")){
			List<WebElement> elements = Driver.findElements(By.xpath("//div[@class='gwt-Label hb-widget-title hb-mouse-over-clickable']"));
			System.out.println("Number of elements: " +elements.size());
			//Display their links
			for(WebElement ele : elements){
				System.out.println(ele.getText());
				if(ele.getText().equalsIgnoreCase("INTERACTIONS")){
					flag = true;
					break;
				}

			}

		}
		if(!flag){
			click(HomePage.ridhtside_gridvar, "ridhtside_gridvar");
			Actions act = new Actions(Driver);
			WebElement intarction = Driver
					.findElement(By
							.xpath("//div[@class='hb-widget-icon-image-container dragdrop-draggable']/img[contains(@src, 'ezbr8WVkrAAAAAElFTkSuQmCC')]"));

			WebElement Destination = Driver.findElement(By
					.xpath("//div[@class='GKGO0M2BPK']"));
			act.dragAndDrop(intarction, Destination).build().perform();
		}else{

			System.out.println("Interaction grid is present on the page.");
		}
	}

	public void goToIntraction() throws Throwable{
		new HomePage().Home_Page();
		click(HomePage.intraction_text, "intraction");
		sleep(15000);

	}


	public void addIntarcationGrid(Hashtable<String, String> data, String patientFName)
			throws Throwable {

		new HomePage().Home_Page();
		/*click(HomePage.intraction_text, "intraction");
		sleep(15000);*/

		click(HomePage.intraction_startdate_mm, "HomePage.intraction_startdate_mm");
		selectByVisibleText(HomePage.intraction_startdate_mm,
				data.get("startdate_MM"), "Month");
		click(HomePage.intraction_startdate_dd, "HomePage.intraction_startdate_dd");
		selectByVisibleText(HomePage.intraction_startdate_dd,
				data.get("startdate_DD"), "Day");
		click(HomePage.intraction_startdate_year, "HomePage.intraction_startdate_year");
		selectByVisibleText(HomePage.intraction_startdate_year,
				data.get("startdate_Year"), "Year");

		selectByVisibleText(HomePage.intraction_duration,data.get("duration"),
				"Duration_mm");


		String[] str = patientFName.split("");
		for(int i =0;i<str.length;i++)
		{
			Driver.findElement(By.xpath(".//*[@id='gwt-debug-interaction.patient-search-bar']"))
			.sendKeys(str[i]);
			sleep(1000);
		}

		Driver.findElement(By.xpath(".//*[@class='hb-simple-grid-dropdown']//"
				+ "td[@class='suggestPopupMiddleCenter']//td[1][contains(text(),'"+patientFName+"')]")).click();

		//click(HomePage.interactionCareProvider_Suggestion, "care provider suggestion");
		sleep(sleep);
		click(HomePage.intraction_careprovider, "Click");
		sleep(sleep);
		Driver.findElement(HomePage.intraction_careprovider).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Driver.findElement(HomePage.intraction_careprovider).sendKeys(Keys.DELETE);
		sleep(1000);

		String[] str1 = "Alexandre".split("");
		for(int i =0;i<str1.length;i++)
		{
			Driver.findElement(HomePage.intraction_careprovider).sendKeys(str1[i]);
			sleep(1000);
		}

		Driver.findElement(By.xpath(".//*[@class='hb-simple-grid-dropdown']//"
				+ "td[@class='suggestPopupMiddleCenter']//td[1][contains(text(),'Alexandre')]")).click();

		sleep(sleep);

		By role;
		role = By.xpath("(//*[text()='Role'])[1]/../../../preceding-sibling::tr[1]//select[@id='gwt-debug-interaction.role-search-bar']");
		selectByVisibleText(role, "MD", "selecting MD role");

		sleep(sleep);

		By yesRadioButtonForF2F = By.xpath("//div[text()='Yes']/../../input");

		//clickUsingJavascriptExecutor(yesRadioButtonForF2F, "yes radio button for f2f");		
		WebElement f2fRadioInput = Driver.findElement(yesRadioButtonForF2F);
		new Actions(Driver).moveToElement(f2fRadioInput).click().build().perform();
		sleep(sleep);


		Driver.findElement(By.xpath("//*[@id='gwt-debug-code-search-bar']")).click();
		String code = "A0080";
		String[] str3 = code.split("");
		for(int i =0;i<str3.length;i++)
		{
			Driver.findElement(By.xpath("//*[@id='gwt-debug-code-search-bar']")).sendKeys(str3[i]);
			sleep(1000);
		}


		Driver.findElement(By.xpath(".//*[@class='hb-simple-grid-dropdown']//"
				+ "td[@class='suggestPopupMiddleCenter']//td[1][contains(text(),'A0080')]")).click();


		//	Driver.findElement(By.xpath("//*[@id='gwt-debug-code-search-bar']/../following-sibling::td[3]/div/img")).click();

		WebElement mo = Driver.findElement(By.xpath("//*[@id='gwt-debug-code-search-bar']/../following-sibling::td[3]/div/img"));

		new Actions(Driver).moveToElement(mo).click().build().perform();
		sleep(sleep);


		Driver.findElement(By.xpath("//*[@id='gwt-debug-ok-button']")).click();


		//selectByVisibleText(HomePage.intraction_Type, data.get("Type"), "Type");
		//click(HomePage.intraction_addIcon, "Save Click");
		Driver.findElement(By.xpath("(.//*[@id='gwt-debug-add-button-search-bar']/img)[2]")).click();

		click(HomePage.intraction_tick, "tick Click");

	}

	public void editIntarcationRecord(Hashtable<String, String> data)
			throws Throwable {

		new HomePage().Home_Page();
		//edit the date
		click(HomePage.intraction_EditStartdate_mm, "intraction_EditStartdate_mm");
		selectByVisibleText(HomePage.intraction_EditStartdate_mm,
				data.get("edit_startdate_MM"), "Month");

		click(HomePage.intraction_EditStartdate_dd, "intraction_EditStartdate_dd");
		selectByVisibleText(HomePage.intraction_EditStartdate_dd,
				data.get("edit_startdate_DD"), "Day");

		click(HomePage.intraction_EditStartdate_year, "intraction_EditStartdate_year");
		selectByVisibleText(HomePage.intraction_EditStartdate_year,
				data.get("edit_startdate_Year"), "Year");

		click(HomePage.intraction_tick, "search And Edit");

	}

	public void verifyEditIntractionInElectionGrid(Hashtable<String, String> data){

		System.out.println("after editing ...");
		String date = Driver.findElement(By.xpath("(.//*"
				+ "[@id='gwt-debug-certificationDTO.f2fVisitPhysicianDate']/div[1]/div[2])[2]")).getText();
		System.out.println("date -> " + date);
		//	06/16/2014
		String actDate = data.get("edit_startdate_MM") + "/" + data.get("edit_startdate_DD") +
				"/" + data.get("edit_startdate_Year");
		System.out.println("actdate-> " + actDate);

		if(date.equalsIgnoreCase(actDate)){
			System.out.println("date is displayed ....");
		}else
		{
			System.out.println("failed to see the date");
		}
	}
	
	public void verifydeleteIntractionInElectionGrid(){
		
		System.out.println("after delete ...");
		String docName = Driver.findElement(By.xpath("("
				+ "//*[@id='gwt-debug-certificationDTO.f2fVisitPhysicianName'])[2]")).getText();
		System.out.println("doctor Name -> " + docName);
		if(docName.equalsIgnoreCase("Need F2F visit")){
			System.out.println("DocName is displayed ....");
		}else
		{
			System.out.println("failed to see the doctor name");
		}
		
	}

	public void verifyAddIntractionInElectionGrid(Hashtable<String, String> data){

		String docName = Driver.findElement(By.xpath("("
				+ "//*[@id='gwt-debug-certificationDTO.f2fVisitPhysicianName'])[2]")).getText();
		System.out.println("doctor Name -> " + docName);
		if(docName.equalsIgnoreCase("Alexandre Abreu")){
			System.out.println("DocName is displayed ....");
		}else
		{
			System.out.println("failed to see the doctor name");
		}


		String date = Driver.findElement(By.xpath("(.//*"
				+ "[@id='gwt-debug-certificationDTO.f2fVisitPhysicianDate']/div[1]/div[2])[2]")).getText();
		System.out.println("date -> " + date);
		//	06/16/2014
		String actDate = data.get("startdate_MM") + "/" + data.get("startdate_DD") +
				"/" + data.get("startdate_Year");
		System.out.println("actdate-> " + actDate);

		if(date.equalsIgnoreCase(actDate)){
			System.out.println("date is displayed ....");
		}else
		{
			System.out.println("failed to see the date");
		}

	}


	public void searchPatientInSearchEditTab_Intraction(String month, String day, String year, String patientFName ) throws Throwable{

		new HomePage().Home_Page();

		click(HomePage.intraction_edit, "search And Edit");
		new HomePage().Home_Page();
		click(HomePage.intraction_edit, "search And Edit");
		
		//to search
		click(HomePage.intraction_searchEditStartdate_mm, "intraction_searchEditStartdate_mm");
		selectByVisibleText(HomePage.intraction_searchEditStartdate_mm,
				month, "Month");

		click(HomePage.intraction_searchEditStartdate_dd, "intraction_searchEditStartdate_dd");
		selectByVisibleText(HomePage.intraction_searchEditStartdate_dd,
				day, "Day");

		click(HomePage.intraction_searchEditStartdate_year, "intraction_searchEditStartdate_year");
		selectByVisibleText(HomePage.intraction_searchEditStartdate_year,
				year, "Year");

		//search patient name

		Driver.findElement(By.xpath(".//*[@id='gwt-debug-interaction.patient.firstName-search-bar']")).click();
		Driver.findElement(By.xpath(".//*[@id='gwt-debug-interaction.patient.firstName-search-bar']")).sendKeys(patientFName);
		Driver.findElement(By.xpath(".//*[@id='gwt-debug-interaction.patient.firstName-search-bar']")).sendKeys(Keys.ENTER);
		sleep(10000);

	}

	public void deleteIntarcationRecord() throws Throwable {
		new HomePage().Home_Page();
		click(HomePage.intraction_deleteIcon, "delete intraction");
		click(HomePage.okBtn_popup, "Ok button on confirmation popup for delete intraction");		
		click(HomePage.intraction_tick, "search And Edit");
	}

	
	
	//sampath
	public void verifyPatientHeaderInfo() throws Throwable {

		PatientPage.Patient_Page();
		String fn = Driver.findElement(PatientPage.patientFirstNameVerify)
				.getAttribute("value");
		assertTextStringMatching(
				fn,
				getText(PatientPage.patientHeader_firstName,
						"verify first name in patient header"));

		String ln = Driver.findElement(PatientPage.patientLastNameVerify)
				.getAttribute("value");
		assertTextStringMatching(
				ln,
				getText(PatientPage.patientHeader_lastName,
						"verify last name in patient header"));

		String status = getText(PatientPage.reffered_status_xpath,
				"reffered status");
		assertTextStringMatching(status, "Referred By");
		sleep(sleep);

	}
	public void verifyPatientSsnInfo() throws Throwable {
		PatientPage.Patient_Page();

		click(PatientPage.PatientInsurance_Tab, "patient insurance");
		
		String status = getText(PatientPage.SSN_status_xpath, "SSN status");
		assertTextStringMatching(status , "SSN");
	}
	
	public void verifyPatientHistroyInfo() throws Throwable {
		PatientPage.Patient_Page();
		click(PatientPage.history_updateddate, "History effective date");
		
		
	}
		
	//shiney 16march
	
	public void setInsuranceInHistoryTab(Hashtable<String, String> data, String pri_insurance) throws Throwable{
		PatientPage.Patient_Page();
		sleep(sleep);
		sleep(sleep);

		click(PatientPage.effectiveDatehistoryTab_month, "month");
		selectByVisibleText(PatientPage.effectiveDatehistoryTab_month, data.get("effectiveMonth"), "month");
		click(PatientPage.effectiveDatehistoryTab_day, "day");
		selectByVisibleText(PatientPage.effectiveDatehistoryTab_day, data.get("effectiveDay"), "day");
		click(PatientPage.effectiveDatehistoryTab_year, "year");
		selectByVisibleText(PatientPage.effectiveDatehistoryTab_year, data.get("effectiveYear"), "Year");
		click(PatientPage.historyTab_priInsuranceDropdown, "primary insurance dropdown");
		selectByVisibleText(PatientPage.historyTab_priInsuranceDropdown,pri_insurance, "primary insurance input");
		click(PatientPage.addButton_historyTab, "add button");
		sleep(sleep);
	}
	
	public void unadmitPatient() throws Throwable {

		click(PatientPage.unadmitButton, "unadmit");
		click(PatientPage.confirnunadmitbutton, "ok buton on admit popup");
		
		
		sleep(sleep);
		
	}

	public void afterunadmitadmitPatient(Hashtable<String, String> data)
			throws Throwable {

		click(PatientPage.admitButton, "admit");
		selectByVisibleText(PatientPage.admitMonth, data.get("newadmitMonth"),
				"month");
		selectByVisibleText(PatientPage.admitDay, data.get("newadmitDay"), "day");
		selectByVisibleText(PatientPage.admitYear, data.get("newadmitYear"),
				"Year");
		selectByVisibleText(PatientPage.facilityType,
				data.get("facilityInput"), "facilty type");
		click(PatientPage.okBtn_admitPopup, "ok buton on admit popup");
		sleep(sleep);
		String status = getText(PatientPage.admitted_status_xpath,
				"admit status");
		assertTextStringMatching(status, "Admitted");
		
	}
	public void verifyHistoryStatus() throws Throwable {

		click(PatientPage.historyStatus,"status");
		String status = getText(PatientPage.historyStatus,
				"status");
		assertTextStringMatching(status, "R");
	}

	//03162016
	
	public void setSecondAllergyInfo(Hashtable<String, String> data,String vstrAllergyName) throws Throwable{

		PatientPage.Patient_Page();
		type(PatientPage.DMEFirstName, vstrAllergyName, "Allergy Name field");
		selectByVisibleText(PatientPage.AllergyType, data.get("AllergyType"), "from drop down");
		type(PatientPage.AllergyReaction, data.get("AllergyReaction"), "Allergy Reaction field");
		click(PatientPage.AllergyAdd,"Add Icon");
		sleep(sleep);
	}
	//17
	
		public void patientdrawerinfo(Hashtable<String, String> data,String vstrPatientFirstName) throws Throwable{

			new PatientPage().Patient_Page();
			//click(PatientPage.patient_grid,"patient grid");

			click(PatientPage.leftside_grid,"grid");
			type(PatientPage.patientFirstName, vstrPatientFirstName, "first name field");
		sleep(5000);
			
			//String text1 = Driver.findElement(PatientPage.firstnameAssert).getText();
			assertTextMatching(PatientPage.firstnameAssert, vstrPatientFirstName, "First Name");
			
			//String text2 = Driver.findElement(PatientPage.ssnAssert).getAttribute("value");
			assertTextMatching(PatientPage.ssnAssert, "6123", "ssn");
			
			String text3 = Driver.findElement(PatientPage.statusdateAssert).getText();
			assertTextStringMatching(text3,"03/11/2016");
			
		}
		
		public void patientInfo(Hashtable<String, String> data,String vstrPatientFirstName)  throws Throwable{
			new PatientPage().Patient_Page();
			//click(PatientPage.patient_grid,"patient grid");

			click(PatientPage.leftside_grid,"grid");
			type(PatientPage.patientFirstName, vstrPatientFirstName, "first name field");
		sleep(5000);
			
			//String text1 = Driver.findElement(PatientPage.firstnameAssert).getText();
			assertTextMatching(PatientPage.firstnameAssert, vstrPatientFirstName, "First Name");
			
			//String text2 = Driver.findElement(PatientPage.ssnAssert).getAttribute("value");
			assertTextMatching(PatientPage.ssnAssert, "1222", "ssn");
			
			String text3 = Driver.findElement(PatientPage.statusdateAssert).getText();
			assertTextStringMatching(text3,"01/10/2014");
			
			assertTextMatching(PatientPage.statusassert, "R", "status");

		}
		
		
		public void patientclickforadmit(Hashtable<String, String> data,String vstrPatientFirstName)  throws Throwable{
			new PatientPage().Patient_Page();
			//click(PatientPage.patient_grid,"patient grid");

			click(PatientPage.leftside_grid,"grid");
			type(PatientPage.patientFirstName, vstrPatientFirstName, "first name field");
		sleep(5000);
			
			click(PatientPage.firstnameAssert, "Name");

		}
		
		 public void clickOnleftHandBar() throws Throwable{
			   PatientPage.Patient_Page();
			   click(PatientPage.leftside_grid, "left grid bar");
			  }

			  
			  public void OpenAndVerifyPatientDrawer() throws Throwable{

			   try{
			    PatientPage.Patient_Page();
			    assertTrue(isElementPresent(PatientPage.firstPatientRowInTable,
			      "first row in patient listing for site."), "Patients are visible for the currently selected site.");

			    assertTextMatchingWithAttribute(PatientPage.patientListDropDown, "AllPatients", "Default value to show patients"); 

			   }catch(Exception ex){

			   }

			  }
			  
			  public void verifyPatientDrawerIsClosed() throws Throwable{
			   PatientPage.Patient_Page();
			   assertTrue(isElementPresent(PatientPage.patientListDropDown,
			     "patient list dropdown"), "verify whether the drawer is closed");

			  }

			  public void closePatientDrawer() throws Throwable{
			   PatientPage.Patient_Page();
			   click(PatientPage.leftside_grid, "close the patient drawer");
			  }
		
		
}
