package com.Mumms.libs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Mumms.page.AdminPage;
import com.Mumms.page.HomePage;
import com.Mumms.page.LoginPage;
import com.Mumms.page.PatientPage;
import com.automation.accelerators.ActionEngine;
import com.automation.utilities.TestUtil;
import com.automation.utilities.Xls_Reader;

public class MummsLib extends ActionEngine {
	public int sleepTime_chrome = 3000;

	HomePage h = new HomePage();

	public Xls_Reader TestData = new Xls_Reader(System.getProperty("user.dir")+"/TestData/TestData.xlsx");

	public final int LOWWAITTIME = 2000;
	public final int WAITTIME = 50000;
	public final int LONGWAITTIME = 200000;
	public String gErrMsg = "";

	/**
	 * Launches the ESPN Web Application
	 * 
	 * @return
	 * @throws Throwable
	 */
	public boolean launchUrl() throws Throwable {
		gErrMsg = "";
		boolean flag = false;
		try {
			/*if (configProps.getProperty("platformType").equalsIgnoreCase(
					"Mobile")) {
				remoteWebDriverForAppium.get("https://login.salesforce.com/");
				flag = true;
			}
			if (configProps.getProperty("platformType").equalsIgnoreCase(
					"Web_Fullscreen")) {
				driver.get("https://login.salesforce.com/?locale=in");
				flag = true;
			}*/
			Driver.get("https://login.salesforce.com/?locale=in");
			return flag;
		} catch (Exception e) {
			e.printStackTrace();
			gErrMsg = "Launch Failed";
			return false;
		}

	}
	
	public void checkPageIsReadyUsingJavaScript() 
	{ JavascriptExecutor js = (JavascriptExecutor)Driver; 
	//Initially bellow given if condition will check ready state of page.
	if (js.executeScript("return document.readyState").toString().equals("complete"))
	{
		System.out.println("Page Is loaded.");
		return;
	}

	//This loop will rotate for 25 times to check If page Is ready after every 1 second.
	//You can replace your value with 25 If you wants to Increase or decrease wait time.
	for (int i=0; i<25; i++)
	{
		try 
		{ Thread.sleep(1000);
		}catch (InterruptedException e) {} 
		//To check page ready state.
		if (js.executeScript("return document.readyState").toString().equals("complete")){
			break; 
		}
	}
	}


	/*public void loginAsUserRole(String userrole) throws Throwable {

		Hashtable<String, String> data = TestUtil.getDataSignUp(userrole,"login");
		new LoginPage().Login_Page();
		WebElement searchbox = Driver.findElement(LoginPage.userName);
		JavascriptExecutor myExecutor = ((JavascriptExecutor) Driver);
		myExecutor.executeScript("arguments[0].value='"+data.get("username")+"';", searchbox);
		typeUsingJavaScriptExecutor(LoginPage.userName, data.get("username"), "username");
		type(LoginPage.password, data.get("password"), "password");
		click(LoginPage.loginBtn, "Login button");
		sleep(10000);
		//Driver.manage().deleteAllCookies();
		System.out.println("login completed ");

	}
*/
	public void loginAsUserRole(String userrole) throws Throwable {

		Hashtable<String, String> data = TestUtil.getDataSignUp(userrole,"login");
		doLogin(data.get("username"), data.get("password"));
	}


	public void doLogin(String userName, String password) throws Throwable{

		new LoginPage().Login_Page();
		System.out.println("username - " + userName);
		System.out.println("password - " + password);
		type(LoginPage.userName, userName, "username");
		type(LoginPage.password, password, "password");
		click(LoginPage.loginBtn, "Login button");
		sleep(10000);
		//Driver.manage().deleteAllCookies();
		System.out.println("login completed ");

	}
	
	// logout
	public void doLogout() throws Throwable {
		sleep(3000);
		new LoginPage().Login_Page();
		click(LoginPage.logOut,"LogOut");

	}


	public void selectAgency(String vstrAgency) throws Throwable{

		try {
			new HomePage().Home_Page();
			click(HomePage.AgencyType, "login Type");
			Driver.findElement(By.xpath("//div[text()='"+vstrAgency+"']")).click();
			sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

	public void goToAdmin() throws Throwable{

		new HomePage().Home_Page();
		click(HomePage.AdminIcon, "Admin Icon");

	}

	public String getCurrentTime()
	{
		DateFormat df = new SimpleDateFormat("MMddyyyyHHmmss");
		Date dateobj = new Date();
		String time = df.format(dateobj);
		System.out.println(time);
		return time;

	}

	public String getUserName() throws Throwable{

		new HomePage().Home_Page();
		String strUserName = getText(HomePage.UserName, "user name");
		return strUserName;

	}

	public void goToReports() throws Throwable{

		new HomePage().Home_Page();
		click(HomePage.ReportIcon, "Report Icon");

	}

	public void goToSites() throws Throwable
	{
		new AdminPage().Admin_Page();
		click(AdminPage.Sites, "Sites link");
	}

	public void goToHome() throws Throwable{

		new HomePage().Home_Page();

		if(Driver.findElement(HomePage.homeIcon).isEnabled())
			click(HomePage.homeIcon, "Home Icon");

	}



	public int generateRandonNumber() throws Throwable {


		Random generator = new Random();
		int intRandom_number = generator.nextInt(9999) + 1000;

		return intRandom_number;
	}

	public void addDefaultInfoInInsuranceTab(String strPayer) throws Throwable{
		PatientPage.Patient_Page();
		click(PatientPage.insurancePayer, "Insurance payer");

		try {
			Driver.findElement(By.xpath(".//*[text()='"+strPayer+"']/parent::td/preceding-sibling::td[1]//input")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}

		click(PatientPage.saveButton, "save button after selecting payer");
		sleep(sleep);
	}

	public void setPatientInfo(Hashtable<String, String> data,String vstrPatientFirstName) throws Throwable{


		PatientPage.Patient_Page();
		click(PatientPage.patientInfoIcon, "patient Info Icon");
		Thread.sleep(sleepTime_chrome);
		//click(PatientPage.patientListDropDown, "patient List DropDown");
		type(PatientPage.patientFirstName, vstrPatientFirstName, "first name field");
		sleep(2000);
		type(PatientPage.patientLastName, data.get("patientLastName"), "Lastname field");
		sleep(3000);


		System.out.println("First Name"+vstrPatientFirstName);
		System.out.println("LastName"+ data.get("patientLastName"));


		click(PatientPage.addPatientIcon_patientListing, "add Patient Icon and new patient first name is  "+vstrPatientFirstName);
		Thread.sleep(sleepTime_chrome);
	}
	public void setDemographicsInfo(Hashtable<String, String> data) throws Throwable{

		PatientPage.Patient_Page();
		selectByVisibleText(PatientPage.PatientTitle, data.get("PatientTitle"), "Miss from drop down");
		type(PatientPage.PatientMiddleInitial, data.get("PatientMiddleInitial"), "Middle Initial field");
		sleep(2000);
		selectByVisibleText(PatientPage.PatientSuffix, data.get("PatientSuffix"), "IV from drop down");
		type(PatientPage.PatientNickName, data.get("PatientNickName"), "Middle Initial field");
		type(PatientPage.PatientAdressLine1, data.get("PatientAdressLine1"), "Patient AdressLine1 field");
		type(PatientPage.PatientAdressLine2, data.get("PatientAdressLine2"), "Patient AdressLine2 field");

		String strZip1 = data.get("PatientZip1");
		String[] arrstr = strZip1.split("");
		for(int i =0;i<arrstr.length;i++)
		{
			Driver.findElement(PatientPage.PatientZip1).sendKeys(arrstr[i]);
			sleep(1000);
		}

		sleep(4000);
		click(PatientPage.PatientZip1Sug, "Patient Zip1 Suggestion");
		type(PatientPage.PatientZip2, data.get("PatientZip2"), "Patient Zip2 field");
		type(PatientPage.phoneNumber, data.get("phoneNumber"), "phoneNumber field");
		//here
		//03162016
		sleep(3000);
		click(PatientPage.PatientOffice, "Phone Office icon");
		sleep(4000);
		click(PatientPage.PhoneAddicon, "Phone Add icon");
		sleep(4000);
		type(PatientPage.NewPhoneNumber, data.get("newPhoneNumber"), "New phoneNumber field");

		sleep(2000);
		type(PatientPage.PatientOffice, data.get("PatientOffice"), "Patient Office field");
		sleep(2000);
		click(PatientPage.PatientOfficeSug1, "Patient Suggestions");
		click(PatientPage.PatientIDGTeams, "Patient IDGTeams");
		sleep(3000);
		selectByVisibleText(PatientPage.PatientIDGTeams, data.get("PatientIDGTeams"), "month from drop down");
	}
	public void setRefferalInfo(Hashtable<String, String> data) throws Throwable{

		PatientPage.Patient_Page();
		selectByVisibleText(PatientPage.earlier_referralDate_month, data.get("earlier_referralDate_month"), "month from drop down");
		selectByVisibleText(PatientPage.earlier_referralDate_day, data.get("earlier_referralDate_day"), "day from drop down");
		selectByVisibleText(PatientPage.earlier_referralDate_year, data.get("earlier_referralDate_year"), "year from drop down");
		type(PatientPage.PatientCallReceivedFrom, data.get("PatientCallReceivedFrom"), "Patient Office field");
		type(PatientPage.PatientPhoneNumber, data.get("PatientPhoneNumber"), "Patient Office field");
		type(PatientPage.PatientcallTakenBy, data.get("PatientcallTakenBy"), "Patient Office field");
		sleep(2000);
		click(PatientPage.PatientreferralSourceType, "Patientre ferral Source Type");
		sleep(4000);
		selectByVisibleText(PatientPage.PatientreferralSourceType, data.get("PatientreferralSourceType"), "Facility from drop down");
		sleep(2000);
		type(PatientPage.PatientreRelationManager, data.get("PatientreRelationManager"), "Patientre Relation Manager field");
		sleep(2000);
		click(PatientPage.PatientreRelationManagerSug1, "Patient RelationManager");
	}
	public void setBasicInfo(Hashtable<String, String> data) throws Throwable{

		PatientPage.Patient_Page();
		selectByVisibleText(PatientPage.dob_month, data.get("dob_month"), "month from drop down");
		selectByVisibleText(PatientPage.dob_day, data.get("dob_day"), "day from drop down");
		selectByVisibleText(PatientPage.dob_year, data.get("dob_year"), "year from drop down");
		selectByVisibleText(PatientPage.PatientSex, data.get("PatientSex"), "year from drop down");
		type(PatientPage.ssn,data.get("ssn"), "ssn field");
		sleep(2000);
		click(PatientPage.maritalStatus, "marital Status");
		sleep(2000);
		selectByVisibleText(PatientPage.maritalStatus, data.get("maritalStatus"), "year from drop down");
		click(PatientPage.PatientRace, "Patient Race");
		sleep(2000);
		selectByVisibleText(PatientPage.PatientRace, data.get("PatientRace"), "from drop down");
		selectByVisibleText(PatientPage.PatientEthnicity, data.get("PatientEthnicity"), "from drop down");
		click(PatientPage.secondaryLanguage, "secondaryLanguage");
		sleep(2000);
		selectByVisibleText(PatientPage.secondaryLanguage, data.get("secondaryLanguage"), "from drop down");
		sleep(2000);
		click(PatientPage.PatientReligion, "PatientReligion");
		sleep(2000);
		selectByVisibleText(PatientPage.PatientReligion, data.get("PatientReligion"), "from drop down");
		sleep(4000);
		click(PatientPage.PatientChurch, "Patient Church");
		sleep(4000);
		type(PatientPage.PatientChurchName,data.get("PatientChurchName"), "Patient ChurchName field");
		sleep(5000);

		if(isElementPresent(PatientPage.topDisplayedChurch, "Verify Name"))
		{
			sleep(2000);
			click(PatientPage.PatientChurchSelect, "Church name");
		}
		else{
			sleep(2000);
			click(PatientPage.DMEAdd, "Add Icon");
			sleep(4000);
			type(PatientPage.PatientChurchName,data.get("PatientChurchName"), "Patient ChurchName field");
			sleep(2000);
			click(PatientPage.PatientChurchSelect, "Church name");
			sleep(2000);

		}
		click(PatientPage.saveButton, "saveButton");

		click(PatientPage.PatientPharmacy, "Patient Pharmacy");
		sleep(4000);
		type(PatientPage.DMEFirstName,data.get("PharmacyName"), "Patient ChurchName field");
		sleep(5000);
		if(isElementPresent(PatientPage.topDisplayedChurch, "Verify Name"))
		{
			sleep(2000);
			click(PatientPage.PatientPharmacySelect, "Pharmacy");
		}
		else{
			sleep(2000);
			type(PatientPage.DMEAdress,data.get("PharmacyAdress"), "Patient ChurchName field");
			sleep(4000);
			click(PatientPage.pharmacyAdd, "Add Icon");
			sleep(4000);
			type(PatientPage.DMEFirstName,data.get("PharmacyName"), "Patient ChurchName field");
			sleep(2000);
			click(PatientPage.PatientPharmacySelect, "Pharmacy");
			sleep(2000);
		}

		click(PatientPage.saveButton, "saveButton");

		click(PatientPage.PatientDme, "Patient DME");
		sleep(2000);
		type(PatientPage.DMEFirstName,data.get("DMEFirstName"), "DME Name field");

		sleep(4000);

		if(isElementPresent(PatientPage.topDisplayedDMEFirstName, "Verify Name"))
		{
			sleep(3000);
			click(PatientPage.PatientDmeSelect, "DME");
		}
		else{
			sleep(2000);
			type(PatientPage.DMEAdress,data.get("DMEAdress"), "DME Adress field");
			sleep(3000);
			click(PatientPage.DMEAdd, "Add Icon");
			sleep(3000);
			type(PatientPage.DMEFirstName,data.get("DMEFirstName"), "DME Name field");
			sleep(5000);
			click(PatientPage.PatientDmeSelect, "DME");
			sleep(2000);

		}

		click(PatientPage.saveButton, "saveButton");


		click(PatientPage.PatientfuneralHome, "Patient funeralHome");
		click(PatientPage.PatientfuneralHomeSelect, "Contact");
		click(PatientPage.saveButton, "saveButton");
		sleep(2000);
		click(PatientPage.PatientVeteran, "PatientVeteran");
		//click(PatientPage.PatientAtRisk, "PatientAtRisk");
	}
	public void setPhysicianInfo(Hashtable<String, String> data) throws Throwable{

		PatientPage.Patient_Page();
		click(PatientPage.PatientRefPhysician, "RefPhysician Button");
		sleep(4000);
	//	click(PatientPage.personPhysician, "Jeff");
		
		Driver.findElement(By.xpath("(.//*[@id='gwt-debug-firstName-search-bar'])[2]")).click();
		Driver.findElement(By.xpath("(.//*[@id='gwt-debug-firstName-search-bar'])[2]")).sendKeys(data.get("DoctorFN"));
		sleep(3000);
		Driver.findElement(By.xpath("(.//*[@id='gwt-debug-lastName-search-bar'])[2]")).click();
		Driver.findElement(By.xpath("(.//*[@id='gwt-debug-lastName-search-bar'])[2]")).sendKeys(data.get("DoctorLN"));
		sleep(3000);
		Driver.findElement(By.xpath(".//*[text()='"+data.get("DoctorFN")+"']/parent::td/preceding-sibling::td[1]//input")).click();
		sleep(3000);
		
		click(PatientPage.saveButton, "saveButton");
		sleep(3000);
		//type(PatientPage.personPhysicianPhone1,data.get("personPhysicianPhone1"), "personPhysicianPhone1 field");
		click(PatientPage.attendingPhysicianButton, "Physician Button");
		Thread.sleep(sleepTime_chrome+3000);
		//click(PatientPage.firstDisplayedAttendingPhysician, "first Displayed AttendingPhysician checkbox");
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
		//type(PatientPage.personPhysicianPhone2,data.get("personPhysicianPhone2"), "personPhysicianPhone2 field");
	}
	public void setConcernsInfo(Hashtable<String, String> data) throws Throwable{

		PatientPage.Patient_Page();
		type(PatientPage.PatientCauseOfStress,data.get("PatientCauseOfStress"), "PatientCauseOfStress field");
		type(PatientPage.patientGreatestNeed,data.get("patientGreatestNeed"), "patientGreatestNeed field");
		sleep(2000);
		//click(PatientPage.PatientResuscitate, "PatientResuscitate");
		click(PatientPage.powerOfAttorney, "powerOfAttorney");
		sleep(4000);
		type(PatientPage.AttorneyFirstName,data.get("AttoneyFirstName"), "FirstName field");
		sleep(2000);
		if(isElementPresent(PatientPage.topDisplayedAttorneyFirstName, "Verify FirstName"))
		{
			click(PatientPage.personpowerOfAttorney, "GallopAttoney");
		}
		else{
			type(PatientPage.AttorneyLastName,data.get("AttorneyLastName"), "FirstName field");
			sleep(2000);
			click(PatientPage.pharmacyAdd, "Add Icon");
			sleep(5000);
			click(PatientPage.personpowerOfAttorney, "GallopAttoney");

		}
		click(PatientPage.saveButton, "saveButton");
	}


	public void setNotesInfo(Hashtable<String, String> data) throws Throwable{

		PatientPage.Patient_Page();
		type(PatientPage.PatientNotes,data.get("PatientNotes"), "PatientNotes field");
		sleep(3000);
	}

	public void admitPatient(Hashtable<String, String> data) throws Throwable{

		PatientPage.Patient_Page();
		click(PatientPage.admitButton,"admit");
		selectByVisibleText(PatientPage.admitMonth, data.get("admitMonth"), "month");
		selectByVisibleText(PatientPage.admitDay, data.get("admitDay"), "day");
		selectByVisibleText(PatientPage.admitYear, data.get("admitYear"), "Year");
		sleep(sleep);
		selectByVisibleText(PatientPage.facilityType, data.get("facilityInput"), "facilty type");
		click(PatientPage.okBtn_admitPopup, "ok buton on admit popup");
		sleep(sleep);
		String status = getText(PatientPage.admitted_status_xpath, "admit status");
		assertTextStringMatching(status , "Admitted");
		sleep(sleep);
	}

	public void goToInsuranceTab() throws Throwable{
		PatientPage.Patient_Page();
		click(PatientPage.insuranceTab, "Insurance Tab");
	}
	public void goToHistoryTab() throws Throwable{
		PatientPage.Patient_Page();
		click(PatientPage.historyTab, "History Tab");

	}

	public void setPrimaryInsuranceInHistoryTab(Hashtable<String, String> data, String strPri_insurance) throws Throwable{
		PatientPage.Patient_Page();
		selectByVisibleText(PatientPage.historyTab_effectiveDate_month, data.get("admitMonth"), "month");
		selectByVisibleText(PatientPage.historyTab_effectiveDate_day, data.get("admitDay"), "day");
		selectByVisibleText(PatientPage.historyTab_effectiveDate_year, data.get("admitYear"), "Year");
		click(PatientPage.historyTab_priInsuranceDropdown, "primary insurance dropdown");
		selectByVisibleText(PatientPage.historyTab_priInsuranceDropdown,strPri_insurance, "primary insurance input");
		click(PatientPage.addButton_historyTab, "add button");
		sleep(sleep);
	}

	public void goToDiagnosisTab() throws Throwable{
		PatientPage.Patient_Page();
		click(PatientPage.diagnosisTab, "diagnosis Tab");

	}
	public void setDiagnosisInfo(Hashtable<String, String> data,String strICD10Code,String strICD9Code) throws Throwable{

		PatientPage.Patient_Page();
		click(PatientPage.diagnosisPhysicalCondition,"Physical Condition");
		selectByVisibleText(PatientPage.diagnosisPhysicalCondition, data.get("diagnosisPhysicalCondition"), "from drop down");

		click(PatientPage.diagnosisEmotionalCondition,"Emotional Condition");
		selectByVisibleText(PatientPage.diagnosisEmotionalCondition, data.get("diagnosisEmotionalCondition"), "from drop down");

		click(PatientPage.diagnosisPatient,"diagnosis Patient Drop Down Button");
		selectByVisibleText(PatientPage.diagnosisPatient, data.get("diagnosisPatient"), "from drop down");

		click(PatientPage.diagnosisFamily,"diagnosis Family Condition");
		selectByVisibleText(PatientPage.diagnosisFamily, data.get("diagnosisFamily"), "from drop down");

		click(PatientPage.PrognosisPatient,"Prognosis Patient Button");
		selectByVisibleText(PatientPage.PrognosisPatient, data.get("PrognosisPatient"), "from drop down");

		click(PatientPage.PrognosisFamily,"Prognosis Family Button");
		selectByVisibleText(PatientPage.PrognosisFamily, data.get("PrognosisFamily"), "from drop down");
		sleep(sleep);
		selectByVisibleText(PatientPage.historyTab_effectiveDate_month, data.get("effectiveDate_month"), "month from drop down");
		selectByVisibleText(PatientPage.historyTab_effectiveDate_day, data.get("effectiveDate_day"), "day from drop down");
		selectByVisibleText(PatientPage.historyTab_effectiveDate_year, data.get("effectiveDate_year"), "year from drop down");
		sleep(sleep);

		type(PatientPage.ICD10Code, strICD10Code, "ICDCode field");
		sleep(sleep);
		//click(PatientPage.ICD10CodeSug1,"ICD10 Code Suggestion");
		Driver.findElement(By.xpath("(.//*[@class='hb-simple-grid-dropdown']//td[@class='suggestPopupMiddleCenter']//td[1][contains(text(),'"+strICD10Code+"')])[1]")).click();
		type(PatientPage.ICD9Code, strICD9Code, "ICDCode field");
		sleep(sleep+1000);
		Driver.findElement(By.xpath("(.//*[@class='hb-simple-grid-dropdown']//td[@class='suggestPopupMiddleCenter']//td[1][contains(text(),'"+strICD9Code+"')])[1]")).click();
		sleep(sleep);
		click(PatientPage.diagnosisAdd,"Add Button");
		sleep(5000);
	}

	public void setPatientDemographicsInfo(Hashtable<String, String> data) throws Throwable{

		PatientPage.Patient_Page();
		selectByVisibleText(PatientPage.PatientTitle, data.get("PatientTitle"), "Miss from drop down");

		type(PatientPage.PatientMiddleInitial, data.get("PatientMiddleInitial"), "Middle Initial field");
		sleep(2000);
		selectByVisibleText(PatientPage.PatientSuffix, data.get("PatientSuffix"), "IV from drop down");
		type(PatientPage.PatientNickName, data.get("PatientNickName"), "Middle Initial field");
		type(PatientPage.PatientAdressLine1, data.get("PatientAdressLine1"), "Patient AdressLine1 field");
		type(PatientPage.PatientAdressLine2, data.get("PatientAdressLine2"), "Patient AdressLine2 field");

		String strZip1 = data.get("PatientZip1");
		String[] arrstr = strZip1.split("");
		for(int i =0;i<arrstr.length;i++)
		{
			Driver.findElement(PatientPage.PatientZip1).sendKeys(arrstr[i]);
			sleep(1000);
		}


		sleep(4000);
		click(PatientPage.PatientZip1Sug, "Patient Zip1 Suggestion");
		type(PatientPage.PatientZip2, data.get("PatientZip2"), "Patient Zip2 field");
		type(PatientPage.phoneNumber, data.get("phoneNumber"), "phoneNumber field");
		sleep(2000);
	}

	public void setRefferalInfoUpdate(Hashtable<String, String> data) throws Throwable{

		PatientPage.Patient_Page();

		selectByVisibleText(PatientPage.earlier_referralDate_month, data.get("newearlier_referralDate_month"), "month from drop down");
		selectByVisibleText(PatientPage.earlier_referralDate_day, data.get("nwearlier_referralDate_day"), "day from drop down");
		selectByVisibleText(PatientPage.earlier_referralDate_year, data.get("newearlier_referralDate_year"), "year from drop down");

	}
	public void setBasicInfoUpdate(Hashtable<String, String> data) throws Throwable{

		PatientPage.Patient_Page();
		type(PatientPage.ssn,data.get("updatedssn"), "ssn field");
		sleep(2000);
		click(PatientPage.maritalStatus, "marital Status");
		sleep(2000);
		selectByVisibleText(PatientPage.maritalStatus, data.get("updatedmaritalStatus"), "year from drop down");
	}



	public void goToDemographicTab() throws Throwable{
		PatientPage.Patient_Page();
		click(PatientPage.demographictab, "demographic Tab");
	}

	//16march shiney

	public void setPatientBasicInfo(Hashtable<String, String> data) throws Throwable{

		PatientPage.Patient_Page();
		selectByVisibleText(PatientPage.dob_month, data.get("dob_month"), "month from drop down");
		selectByVisibleText(PatientPage.dob_day, data.get("dob_day"), "day from drop down");
		selectByVisibleText(PatientPage.dob_year, data.get("dob_year"), "year from drop down");
		selectByVisibleText(PatientPage.PatientSex, data.get("PatientSex"), "year from drop down");
		type(PatientPage.ssn,data.get("ssn"), "ssn field");
		sleep(2000);
		click(PatientPage.maritalStatus, "marital Status");
		sleep(2000);
		selectByVisibleText(PatientPage.maritalStatus, data.get("maritalStatus"), "year from drop down");
		click(PatientPage.PatientRace, "Patient Race");
		sleep(2000);
		selectByVisibleText(PatientPage.PatientRace, data.get("PatientRace"), "from drop down");
		selectByVisibleText(PatientPage.PatientEthnicity, data.get("PatientEthnicity"), "from drop down");
		click(PatientPage.secondaryLanguage, "secondaryLanguage");
		sleep(2000);
		selectByVisibleText(PatientPage.secondaryLanguage, data.get("secondaryLanguage"), "from drop down");
		sleep(2000);
		click(PatientPage.PatientReligion, "PatientReligion");
		sleep(2000);
		selectByVisibleText(PatientPage.PatientReligion, data.get("PatientReligion"), "from drop down");
		sleep(4000);
	}

	public void clickOnLowerGrid() throws Throwable {

		new AdminPage().Admin_Page();
		WebElement mo = Driver.findElement(AdminPage.lowergrid);

		new Actions(Driver).moveToElement(mo).click().build().perform();
		sleep(sleep);
	}

	//03162016
	public void goToAllergiesTab() throws Throwable{
		PatientPage.Patient_Page();
		click(PatientPage.allergiesTab, "allergies Tab");

	}

	public void setAllergyInfo(Hashtable<String, String> data,String vstrAllergyName) throws Throwable{

		PatientPage.Patient_Page();
		click(PatientPage.AllergyConfirm,"Allergy Yes CheckBox");
		type(PatientPage.DMEFirstName, vstrAllergyName, "Allergy Name field");
		selectByVisibleText(PatientPage.AllergyType, data.get("AllergyType"), "from drop down");
		type(PatientPage.AllergyReaction, data.get("AllergyReaction"), "Allergy Reaction field");
		click(PatientPage.AllergyAdd,"Add Icon");
		sleep(sleep);
	}


	public void appendLetterToPolicyNumber(String letter) throws Throwable{
		PatientPage.Patient_Page();
		String policyNumber = Driver.findElement(PatientPage.insurance_policyNumberInput).getAttribute("value");
		String newPolicynumber = policyNumber + letter ;
		type(PatientPage.insurance_policyNumberInput, newPolicynumber, " new policyNumber");
		sleep(sleep);
	}

	public void clickOnAddInsuranceButton() throws Throwable{
		PatientPage.Patient_Page();
		click(PatientPage.addPatientIcon_insuranceTab, "Add button in insurance");	
		sleep(sleep);
	}

	public void goToElectionsForInsurer(String insurer) throws Throwable{


		PatientPage.Patient_Page();

		int size_rows = Driver.findElements(By.xpath("//div[@class='GKGO0M2BPL']/table/tbody/tr[2]//table/tbody/tr")).size();
		for(int i = 1; i<= size_rows; i++){

			String text = Driver.findElement(By.xpath("//div[@class='GKGO0M2BPL']/table/tbody/tr[2]//table/tbody/tr["+
					i+"]/td/div/div")).getText();
			System.out.println("insurere---> " + text);

			if(text.equalsIgnoreCase(insurer))
			{

				Driver.findElement(By.xpath("//div[@class='GKGO0M2BPL']/table/tbody/tr[2]//table/tbody/tr["+
						i+"]/td[7]/div/img")).click();
				click(PatientPage.electionsMenu, "elections menu");
				sleep(sleep+2000);
			}	

		}


	}

	public void click_AttendingPhysician_priInsurer() throws Throwable{

		PatientPage.Patient_Page();
		click(PatientPage.electionGrid_AttendingPhysician_priInsurer, " electionGrid_AttendingPhysician");
		sleep(sleep+2000);
	}

	public void fillVerbalAndSignatureDates_attendingPhysician(Hashtable<String, String> data) throws Throwable{
		PatientPage.Patient_Page();
		selectByVisibleText(PatientPage.electionGrid_verbalDate_month_attendingPhysician, data.get("admitMonth"), "month");
		selectByVisibleText(PatientPage.electionGrid_verbalDate_day_attendingPhysician, data.get("admitDay"), "day");
		selectByVisibleText(PatientPage.electionGrid_verbalDate_year_attendingPhysician, data.get("admitYear"), "Year");
		selectByVisibleText(PatientPage.electionGrid_signatureDate_month_attendingPhysician, data.get("admitMonth"), "month");
		selectByVisibleText(PatientPage.electionGrid_signatureDate_day_attendingPhysician, data.get("admitDay"), "day");
		selectByVisibleText(PatientPage.electionGrid_signatureDate_year_attendingPhysician, data.get("admitYear"), "Year");
		sleep(sleep);
		//	Driver.findElement(PatientPage.electionGrid_signatureDate_year).sendKeys(Keys.TAB);
		clickUsingJavascriptExecutor(PatientPage.okBtn_admitPopup, "ok buton on admit popup");
		sleep(sleep+2000);
	}

	public void selectHospicePhysicianForPriMaryInsurer_electionGrid(Hashtable<String, String> data) throws Throwable{
		PatientPage.Patient_Page();
		click(PatientPage.electionGrid_hospicePhysicianName, "hospice physician name input");
		click(PatientPage.electionGrid_physicianName,"click on physician Name");
	//	click(PatientPage.firstDisplayedAttendingPhysician,"select physician");
		
		Driver.findElement(By.xpath("(.//*[@id='gwt-debug-firstName-search-bar'])[2]")).click();
		Driver.findElement(By.xpath("(.//*[@id='gwt-debug-firstName-search-bar'])[2]")).sendKeys(data.get("DoctorFN"));
		sleep(3000);
		Driver.findElement(By.xpath("(.//*[@id='gwt-debug-lastName-search-bar'])[2]")).click();
		Driver.findElement(By.xpath("(.//*[@id='gwt-debug-lastName-search-bar'])[2]")).sendKeys(data.get("DoctorLN"));
		sleep(3000);
		Driver.findElement(By.xpath(".//*[text()='"+data.get("DoctorFN")+"']/parent::td/preceding-sibling::td[1]//input")).click();
		
		sleep(3000);
		click(PatientPage.saveButton, "save tick on physician selection grid");
		sleep(sleep);
	}

	public void fillVerbalAndSignatureDates_hospicePhysician(Hashtable<String, String> data) throws Throwable{
		PatientPage.Patient_Page();
		selectByVisibleText(PatientPage.electionGrid_verbalDate_month_hospicePhysician, data.get("admitMonth"), "month");
		selectByVisibleText(PatientPage.electionGrid_verbalDate_day_hospicePhysician, data.get("admitDay"), "day");
		selectByVisibleText(PatientPage.electionGrid_verbalDate_year_hospicePhysician, data.get("admitYear"), "Year");
		selectByVisibleText(PatientPage.electionGrid_signatureDate_month_hospicePhysician, data.get("admitMonth"), "month");
		selectByVisibleText(PatientPage.electionGrid_signatureDate_day_hospicePhysician, data.get("admitDay"), "day");
		selectByVisibleText(PatientPage.electionGrid_signatureDate_year_hospicePhysician, data.get("admitYear"), "Year");
		sleep(sleep);
		//	Driver.findElement(PatientPage.electionGrid_signatureDate_year).sendKeys(Keys.TAB);
		clickUsingJavascriptExecutor(PatientPage.okBtn_admitPopup, "ok buton on admit popup");
		sleep(sleep+2000);
	}

	public void selectCertifyingPhysicianForPriMaryInsurer_electionGrid(Hashtable<String, String> data) throws Throwable{
		PatientPage.Patient_Page();
		click(PatientPage.electionGrid_certifyingPhysicianInput, "hospice physician name input");
		click(PatientPage.electionGrid_physicianName,"click on physician Name");
	//	click(PatientPage.firstDisplayedAttendingPhysician,"select physician");
		Driver.findElement(By.xpath("(.//*[@id='gwt-debug-firstName-search-bar'])[2]")).click();
		Driver.findElement(By.xpath("(.//*[@id='gwt-debug-firstName-search-bar'])[2]")).sendKeys(data.get("DoctorFN"));
		sleep(3000);
		Driver.findElement(By.xpath("(.//*[@id='gwt-debug-lastName-search-bar'])[2]")).click();
		Driver.findElement(By.xpath("(.//*[@id='gwt-debug-lastName-search-bar'])[2]")).sendKeys(data.get("DoctorLN"));
		
		sleep(3000);
		Driver.findElement(By.xpath(".//*[text()='"+data.get("DoctorFN")+"']/parent::td/preceding-sibling::td[1]//input")).click();
		
		sleep(3000);
		click(PatientPage.saveButton, "save tick on physician selection grid");
		sleep(sleep+2000);
	}

	public void fillVerbalAndSignatureDates_certifyingPhysician(Hashtable<String, String> data) throws Throwable{
		PatientPage.Patient_Page();
		selectByVisibleText(PatientPage.electionGrid_verbalDate_month_hospicePhysician, data.get("certifyingMonth"), "month");
		selectByVisibleText(PatientPage.electionGrid_verbalDate_day_hospicePhysician, data.get("certifyingDay"), "day");
		selectByVisibleText(PatientPage.electionGrid_verbalDate_year_hospicePhysician, data.get("certifyingYear"), "Year");
		selectByVisibleText(PatientPage.electionGrid_signatureDate_month_hospicePhysician, data.get("certifyingMonth"), "month");
		selectByVisibleText(PatientPage.electionGrid_signatureDate_day_hospicePhysician, data.get("certifyingDay"), "day");
		selectByVisibleText(PatientPage.electionGrid_signatureDate_year_hospicePhysician, data.get("certifyingYear"), "Year");
		sleep(sleep);
		//	Driver.findElement(PatientPage.electionGrid_signatureDate_year).sendKeys(Keys.TAB);
		clickUsingJavascriptExecutor(PatientPage.okBtn_admitPopup, "ok buton on admit popup");
		sleep(sleep+2000);
	}

	public void close_ElectionGrid() throws Throwable{

		PatientPage.Patient_Page();
		click(PatientPage.electionGrid_TickMark, " electionGrid_save tick mark");
		sleep(sleep+2000);
	}

	//03172016
	public void setInsuranceInHistoryTab(Hashtable<String, String> data, String strPri_insurance) throws Throwable{
		PatientPage.Patient_Page();
		selectByVisibleText(PatientPage.historyTab__month, data.get("admitMonth"), "month");
		selectByVisibleText(PatientPage.historyTab__day, data.get("admitDay"), "day");
		selectByVisibleText(PatientPage.historyTab__year, data.get("admitYear"), "Year");
		click(PatientPage.historyTab_priInsuranceDropdown, "primary insurance dropdown");
		selectByVisibleText(PatientPage.historyTab_priInsuranceDropdown,strPri_insurance, "primary insurance input");
		click(PatientPage.addButton_historyTab, "add button");
		sleep(sleep);
	}

	public void VerbalAndSignatureDates_attendingPhysician(Hashtable<String, String> data) throws Throwable{
		PatientPage.Patient_Page();
		selectByVisibleText(PatientPage.electionGrid_verbalDate_month_attendingPhysician, data.get("APMonth"), "month");
		selectByVisibleText(PatientPage.electionGrid_verbalDate_day_attendingPhysician, data.get("APDay"), "day");
		selectByVisibleText(PatientPage.electionGrid_verbalDate_year_attendingPhysician, data.get("APYear"), "Year");
		selectByVisibleText(PatientPage.electionGrid_signatureDate_month_attendingPhysician, data.get("APMonth"), "month");
		selectByVisibleText(PatientPage.electionGrid_signatureDate_day_attendingPhysician, data.get("APDay"), "day");
		selectByVisibleText(PatientPage.electionGrid_signatureDate_year_attendingPhysician, data.get("APYear"), "Year");
		sleep(sleep);
		//	Driver.findElement(PatientPage.electionGrid_signatureDate_year).sendKeys(Keys.TAB);
		clickUsingJavascriptExecutor(PatientPage.okBtn_admitPopup, "ok buton on admit popup");
		sleep(sleep+2000);
	}

	public void VerbalAndSignatureDates_hospicePhysician(Hashtable<String, String> data) throws Throwable{
		PatientPage.Patient_Page();
		selectByVisibleText(PatientPage.electionGrid_verbalDate_month_hospicePhysician, data.get("HPMonth"), "month");
		selectByVisibleText(PatientPage.electionGrid_verbalDate_day_hospicePhysician, data.get("HPDay"), "day");
		selectByVisibleText(PatientPage.electionGrid_verbalDate_year_hospicePhysician, data.get("HPYear"), "Year");
		selectByVisibleText(PatientPage.electionGrid_signatureDate_month_hospicePhysician, data.get("HPMonth"), "month");
		selectByVisibleText(PatientPage.electionGrid_signatureDate_day_hospicePhysician, data.get("HPDay"), "day");
		selectByVisibleText(PatientPage.electionGrid_signatureDate_year_hospicePhysician, data.get("HPYear"), "Year");
		sleep(sleep);
		//	Driver.findElement(PatientPage.electionGrid_signatureDate_year).sendKeys(Keys.TAB);
		clickUsingJavascriptExecutor(PatientPage.okBtn_admitPopup, "ok buton on admit popup");
		sleep(sleep+2000);
	}

	public void setAllergyData(Hashtable<String, String> data,String vstrAllergyName) throws Throwable{

		PatientPage.Patient_Page();
		click(PatientPage.AllergyConfirm,"Allergy Yes CheckBox");
		type(PatientPage.DMEFirstName, vstrAllergyName, "Allergy Name field");
		selectByVisibleText(PatientPage.AllergyType, data.get("AllergyType"), "from drop down");
		type(PatientPage.AllergyReaction, data.get("AllergyReaction"), "Allergy Reaction field");
		click(PatientPage.AllergyAddNew,"Add Icon");
		sleep(sleep);
	}
}
