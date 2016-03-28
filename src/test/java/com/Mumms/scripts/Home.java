package com.Mumms.scripts;

import java.util.Hashtable;

import org.apache.xml.utils.res.IntArrayWrapper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Mumms.libs.HomeLib;
import com.Mumms.libs.PatientLib;
import com.Mumms.page.HomePage;
import com.Mumms.page.PatientPage;
import com.automation.accelerators.TestEngine;
import com.automation.accelerators.TestEngineWeb;
import com.automation.utilities.TestUtil;

public class Home extends HomeLib {

	@Parameters({"userrole"})
	@BeforeMethod
	public void login(String userrole) throws Throwable{
		loginAsUserRole(userrole);
	}

	@DataProvider
	public Object[][] getTestDataFor_verifyIntractiongrid () {
		return TestUtil.getData("verifyIntractiongrid", TestData, "Home");
	}

	@Test(dataProvider = "getTestDataFor_verifyIntractiongrid")

	public void verifyIntractiongrid(Hashtable<String, String> data) throws Throwable {
		try {
			if (data.get("RunMode").equals("Y"))
			{

				this.reporter.initTestCaseDescription("SQA-67");	
				selectAgency("Sam_3881");
				int intRandNum = generateRandonNumber();
				String strSiteNickName = data.get("siteNickName") + "_"
						+ Integer.toString(intRandNum);
				String strPatientFirstName = data.get("patientFirstName") + "_"
						+ Integer.toString(intRandNum);
				String strPatientLastName = data.get("patientLastName") + "_"
						+ Integer.toString(intRandNum);
				//				dragAndDropIntarcationGrid();
				//				addIntarcationGrid(data);
				//				editIntarcationGrid(data);
				//				deleteIntarcationGrid();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@DataProvider
	public Object[][] getTestDataFor_verifyWidgetsfunctionslity() {
		return TestUtil.getData("verifyWidgetsfunctionslity", TestData, "Home");
	}

	@Test(dataProvider = "getTestDataFor_verifyWidgetsfunctionslity")
	public void verifyWidgetsfunctionslity(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y"))
			{
				this.reporter.initTestCaseDescription("SQA-68");	
				selectAgency("RUTH");
				dragAndDropWigets();

			} }
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}


	@DataProvider
	public Object[][] getTestDataFor_verifyMedicationsWidget() {
		return TestUtil.getData("verifyMedicationsWidget", TestData, "Home");
	}

	@Test(dataProvider = "getTestDataFor_verifyMedicationsWidget")
	public void verifyMedicationsWidget(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y"))
			{
				this.reporter.initTestCaseDescription("SQA-69");	
				selectAgency("RUTH");
				dragAndDropMedicationsWidget();
				medicationUpload(data);
				logOut();
				login("AdminUser ");
				selectAgency("RUTH");
				dragAndDropMedicationsWidget();
				medicationsWidgetDetails();

			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}


	@DataProvider
	public Object[][] getTestDataFor_verifyPatientsbyPayerType() {
		return TestUtil.getData("verifyPatientsbyPayerType", TestData, "Home");
	}

	@Test(dataProvider = "getTestDataFor_verifyPatientsbyPayerType")
	public void verifyPatientsbyPayerType(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y"))
			{
				this.reporter.initTestCaseDescription("SQA-168");	
				selectAgency("RUTH");
				closePayerTypeWidgetStart();

				int intRandNum = generateRandonNumber();
				String personName = data.get("patientFirstName")+"_"+Integer.toString(intRandNum);
				setDataFordragAndDropPatients(data, personName);
				dragAndDropPatientsbyPayerTypeWidget();
				PatientsbyPayerTypeWidgetDetails(personName);
				verifyPayerTypeWidgetDetails();
				closePayerTypeWidgetEnd();
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	//Vamsi
	@DataProvider
	public Object[][] getTestDataFor_claimsManagement() {
		return TestUtil.getData("claimsManagement", TestData, "Home");
	}

	@Test(dataProvider = "getTestDataFor_claimsManagement")
	public void claimsManagement(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y"))
			{
				this.reporter.initTestCaseDescription("SQA-131");	
				selectAgency("RUTH");
				System.out.println(data.get("ID"));

				claimManagementFlow();

				String Payerxpath = "(.//select[@id='gwt-debug-payerType']//option[1])";
				String payer = data.get("Payer");
				claimPayerSearchValidations(Payerxpath, payer);

				String Fnamexpath = "(.//div[@id='gwt-debug-patientFirstName'])";
				String FirstName = data.get("FirstName");
				claimFirstNameSearchValidations(Fnamexpath, FirstName);

				String Lnamexpath = "(.//div[@id='gwt-debug-patientLastName'])";
				String LastName = data.get("LastName");
				claimLastNameSearchValidations(Lnamexpath, LastName);

				String IDxpath = "(.//div[@class='gwt-TabLayoutPanelContent']//div[@id='gwt-debug-patientNumber'])";
				String PatientID = data.get("ID");
				claimIDSearchValidations(IDxpath, PatientID);

				String Pdatexpath = "(.//*[@id='gwt-debug-posted']//div[@class='hb-uneditable-text'])";
				String Pmonth = data.get("month");
				String Pdate = data.get("day");
				String Pyear = data.get("year");
				claimPostedDateSearchValidations(Pdatexpath, Pmonth, Pdate, Pyear);

				String Statusxpath = "(.//div[@class='gwt-TabLayoutPanelContentContainer']/div[2]//table[@class='hb-flex-grid-top-level-table hb-table-spacing']//tr[2]//*[@id='gwt-debug-claimStatus']/option[1])";
				String Status = data.get("Status");				
				claimStatusSearchValidations(Statusxpath, Status);

				String Sdatexpath = "(.//*[@id='gwt-debug-updated']//div[@class='hb-uneditable-text'])";
				String Smonth = data.get("Statusmonth");
				String Sdate = data.get("Statusday");
				String Syear = data.get("Statusyear");
				claimStatusDateSearchValidations(Sdatexpath, Smonth, Sdate, Syear);

			}
		}catch (Exception e){
			e.printStackTrace();
		}

	}        

	@DataProvider
	public Object[][] getTestDataFor_claimsManagementNoesTab() {
		return TestUtil.getData("claimsManagementNoesTab", TestData, "Home");
	}

	@Test(dataProvider = "getTestDataFor_claimsManagementNoesTab")
	public void claimsManagementNoesTab(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y"))
			{
				this.reporter.initTestCaseDescription("SQA-132");	
				selectAgency("RUTH");

				claimManagementNeoTabFlow();

				String NIDxpath = "(.//div[@class='GKGO0M2BLN']//div[@id='gwt-debug-patientDTO.patientNumber'])";
				String NoesID = data.get("NoesID");
				noesIDSearchValidations(NIDxpath, NoesID);

				String NFxpath = "(.//div[@class='GKGO0M2BLN']//div[@id='gwt-debug-patientDTO.firstName'])";
				String FirstName = data.get("FirstName");
				noesFirstNameSearchValidations(NFxpath, FirstName);

				String NLxpath = "(.//div[@class='GKGO0M2BLN']//*[@id='gwt-debug-patientDTO.lastName'])";
				String LastName = data.get("LastName");
				noesLastNameSearchValidations(NLxpath, LastName);

				String NIxpath = "(.//div[@class='GKGO0M2BLN']//*[@id='gwt-debug-insuranceCoverageDTO.carrierName']/input)";
				String Insurance = data.get("Insurance");
				noesInsuranceSearchValidations(NIxpath, Insurance);

				String TOBxpath = "(.//div[@class='GKGO0M2BLN']//select[@id='gwt-debug-typeOfBill']/option[1])";
				String TOB = data.get("TOB");
				noesTOBSearchValidations(TOBxpath, TOB);

				String Aphysicianxpath = "(.//div[@class='GKGO0M2BLN']//*[@id='gwt-debug-attendingPhysicianDTO.physicianName']/div[2])";
				String APhysician = data.get("Aphysician");				
				noesAPhysicianSearchValidations(Aphysicianxpath, APhysician);

				String Cphysicianxpath = "(.//div[@class='GKGO0M2BLN']//div[@id='gwt-debug-certifyingPhysicianDTO.physicianName']/div[2])";
				String CPhysician = data.get("Cphysician");
				noesCPhysicianSearchValidations(Cphysicianxpath, CPhysician);

				String NStatusxpath = "(.//div[@class='GKGO0M2BLN']//div[@id='gwt-debug-status']/div)";
				String NStatus = data.get("Status");
				noesStatusSearchValidations(NStatusxpath, NStatus);

			}
		}catch (Exception e){
			e.printStackTrace();
		}

	}        

	//03162016
	@DataProvider
	public Object[][] getTestDataFor_claimsManagementBillingReport() {
		return TestUtil.getData("claimsManagementBillingReport", TestData, "Home");
	}

	@Test(dataProvider = "getTestDataFor_claimsManagementBillingReport")
	public void claimsManagementBillingReport(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y"))
			{
				this.reporter.initTestCaseDescription("SQA-173");	
				selectAgency("RUTH");

				String AllergyName = data.get("AllergyName");
				verifyPatientInfo(data, AllergyName);
				
	            //Driver.findElement(HomePage.Closeicon).click();
				clickUsingJavascriptExecutor(HomePage.Closeicon, "close icon");
	            zoomIn();
			}
		}catch (Exception e){
			e.printStackTrace();
		}

	}        


	@DataProvider
	public Object[][] getTestDataFor_claimsManagementRevenueDetails() {
		return TestUtil.getData("claimsManagementRevenueDetails", TestData, "Home");
	}

	@Test(dataProvider = "getTestDataFor_claimsManagementRevenueDetails")
	public void claimsManagementRevenueDetails(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y"))
			{
				this.reporter.initTestCaseDescription("SQA-174");	
				selectAgency("RUTH");

				String AllergyName = data.get("AllergyName");
				verifyRevenueDetailsInfo(data, AllergyName);
				
				clickUsingJavascriptExecutor(HomePage.Closeicon, "close icon");
                zoomIn();
				
			}
		}catch (Exception e){
			e.printStackTrace();
		}

	}   
	
	@DataProvider
	public Object[][] getTestDataFor_verifyBillingWidget() {
		return TestUtil.getData("verifyBillingWidget", TestData, "Home");
	}

	@Test(dataProvider = "getTestDataFor_verifyBillingWidget")
	public void verifyBillingWidget(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y"))
			{
				this.reporter.initTestCaseDescription("SQA-174");	
				selectAgency("RUTH");

				verifybillingReportInfo(data);
				verifyWidgetDetailsFlow(data);
				verifyWidgetNextPatient(data);
				
				Driver.findElement(HomePage.Closeicon).click();
			}
		}catch (Exception e){
			e.printStackTrace();
		}

	}   

	@AfterMethod
	public void logOut() throws Throwable {
		doLogout();
	}
}
