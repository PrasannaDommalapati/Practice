package com.Mumms.scripts;

import java.util.Hashtable;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Mumms.libs.AdminLib;
import com.Mumms.page.AdminPage;
import com.Mumms.page.HomePage;
import com.automation.utilities.TestUtil;

public class Admin extends AdminLib {

	@Parameters({ "userrole" })
	@BeforeMethod
	public void login(String userrole) throws Throwable {
		loginAsUserRole(userrole);

	}

	@DataProvider
	public Object[][] getTestDataFor_editCreatedRole() {
		return TestUtil.getData("editCreatedRole", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_editCreatedRole")
	public void editCreatedRole(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y"))
			{
				this.reporter.initTestCaseDescription("SQA-50");	
				selectAgency("RUTH");
				goToAdmin();

				int intRandNum = generateRandonNumber();
				String strRollName = data.get("RolesGroup")+"_"+Integer.toString(intRandNum);
				String strRole = data.get("Role")+"_"+Integer.toString(intRandNum);

				/*createRole(data,strRollName,strRole);
				deleteRole(data, strRollName);
				verifydeleteRole(data, strRollName);*/
				
/*				createRoleWithAllDetails(data,strRollName,strRole);
				editRole(data, strRollName);
				verifyEditRole(data, strRollName);
				deleteRole(data,data.get("RolesGroupChange"));
				verifydeleteRole(data, data.get("RolesGroupChange"));*/
				
				createRoleWithAllDetails(data,strRollName,strRole);
				verifyRole(data, strRollName,strRole);
				
				int intRandNumNew = generateRandonNumber();
				String strRollNameNew = data.get("RolesGroup")+"_"+Integer.toString(intRandNumNew);
				String strRoleNew = data.get("Role")+"_"+Integer.toString(intRandNumNew);
				String strRoleNew1 = data.get("NewRole")+"_"+Integer.toString(intRandNumNew);
				
				editRole(data, strRollName,strRollNameNew,strRoleNew,strRoleNew1);
				//03212016
				verifyEditRole(data,strRollNameNew,strRoleNew,strRoleNew1);
				//
				deleteRole(data,strRollNameNew);
				verifydeleteRole(data, strRollNameNew);

			} }
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_addNewRole() {
		return TestUtil.getData("addNewRole", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_addNewRole")
	public void addNewRole(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y"))
			{
				this.reporter.initTestCaseDescription("SQA-51");	
				selectAgency("RUTH");
				goToAdmin();

				int intRandNum = generateRandonNumber();
				String strRollName = data.get("RolesGroup")+"_"+Integer.toString(intRandNum);
				String strRole = data.get("Role")+"_"+Integer.toString(intRandNum);

				createRole(data,strRollName,strRole);
				verifyRole(data, strRollName,strRole);

			} }
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_addNewProgram() {
		return TestUtil.getData("addNewProgram", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_addNewProgram")
	public void addNewProgram(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y"))
			{
				this.reporter.initTestCaseDescription("SQA-59");	
				selectAgency("RUTH");
				goToAdmin();

				int intRandNum = generateRandonNumber();
				String strProgramName = data.get("Name")+"_"+Integer.toString(intRandNum);
				String strCode = data.get("Code")+"_"+Integer.toString(intRandNum);
				createProgram(data,strProgramName,strCode);
				verifyProgram(data, strProgramName,strCode);
			} }
		catch (Exception e) 
		{
			e.printStackTrace();
		}}

	@DataProvider
	public Object[][] getTestDataFor_deleteCreatedProgram() {
		return TestUtil.getData("deleteCreatedProgram", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_deleteCreatedProgram")
	public void deleteCreatedProgram(Hashtable<String, String> data) throws Throwable {
		try {

			if (data.get("RunMode").equals("Y"))
			{
				this.reporter.initTestCaseDescription("SQA-60");	
				selectAgency("RUTH");
				goToAdmin();

				int intRandNum = generateRandonNumber();
				String strProgramName1 = data.get("Name")+"_"+Integer.toString(intRandNum);
				String strCode1 = data.get("Code")+"_"+Integer.toString(intRandNum);
				createProgram(data,strProgramName1,strCode1);
				softDeleteProgram(data, strProgramName1);
				verifydeleteProgram(data, strProgramName1);

				int intRandNum2 = generateRandonNumber();
				String strProgramName2 = data.get("Name")+"_"+Integer.toString(intRandNum2);
				String strCode2 = data.get("Code")+"_"+Integer.toString(intRandNum2);
				createProgram(data,strProgramName2,strCode2);

				String strPatientFirstName = data.get("patientFirstName")+"_"+Integer.toString(intRandNum2);
				String strPatientLastName = data.get("patientLastName")+"_"+Integer.toString(intRandNum2);

				configureSiteForProgramHardDelete(data, strProgramName2);
				createPatientInfo(strPatientFirstName, strPatientLastName);
				assignProgramToPatient(strProgramName2);
				String strPopUpTexConfirmation=data.get("PopUpTexConfirmation");
				String strPopUpTextDesc=data.get("PopUpText");
				System.out.println("PopUpTexConfirmation is-->"+strPopUpTexConfirmation+"and PopUpTextDesc is"+strPopUpTextDesc);
				hardDeleteProgram(strPopUpTexConfirmation,strPopUpTextDesc, strProgramName2);
				verifydeleteProgram(data, strProgramName2);

			} }
		catch (Exception e) 
		{
			e.printStackTrace();
		}}

	@DataProvider
	public Object[][] getTestDataFor_addNewReligion() {
		return TestUtil.getData("addNewReligion", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_addNewReligion")
	public void addNewReligion(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y"))
			{
				this.reporter.initTestCaseDescription("SQA-61");	
				selectAgency("RUTH");
				goToAdmin();

				int intRandNum = generateRandonNumber();
				String strReligionName = data.get("ReligionName")+"_"+Integer.toString(intRandNum);
				createReligion(data,strReligionName);
				verifyReligion(data, strReligionName,true);

			} }
		catch (Exception e) 
		{
			e.printStackTrace();
		}}

	@DataProvider
	public Object[][] getTestDataFor_deleteCreatedReligion() {
		return TestUtil.getData("deleteCreatedReligion", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_deleteCreatedReligion")
	public void deleteCreatedReligion(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y"))
			{
				this.reporter.initTestCaseDescription("SQA-62");	
				selectAgency("RUTH");
				goToAdmin();

				int intRandNum = generateRandonNumber();
				String strReligionName = data.get("ReligionName")+"_"+Integer.toString(intRandNum);
				createReligion(data,strReligionName);
				softDeleteReligion(data, strReligionName);
				verifydeleteReligion(data, strReligionName,false);

				int intRandNum2 = generateRandonNumber();
				String strReligionName2 = data.get("ReligionName")+"_"+Integer.toString(intRandNum2);
				createReligion(data,strReligionName2);

				String strPatientFirstName = data.get("patientFirstName")+"_"+Integer.toString(intRandNum2);
				String strPatientLastName = data.get("patientLastName")+"_"+Integer.toString(intRandNum2);

				createPatientInfo(strPatientFirstName, strPatientLastName);
				assignRelegionToPatient(strReligionName2);
				String strPopUpTexConfirmation=data.get("PopUpTexConfirmation");
				String strPopUpTextDesc=data.get("PopUpText");
				System.out.println("PopUpTexConfirmation is-->"+strPopUpTexConfirmation+"and PopUpTextDesc is"+strPopUpTextDesc);
				hardDeleteReligion(strPopUpTexConfirmation,strPopUpTextDesc, strReligionName2);
				verifydeleteReligion(data, strReligionName2,false);

			} }
		catch (Exception e) 
		{
			e.printStackTrace();
		}}

	// SQA-39

	@DataProvider
	public Object[][] getTestDataFor_addNewReasons() {
		return TestUtil.getData("addNewReasons", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_addNewReasons")
	public void addNewReasons(Hashtable<String, String> data) throws Throwable {

		try {


			if (data.get("RunMode").equals("Y"))
			{
				this.reporter.initTestCaseDescription("SQA-73");	
				selectAgency("RUTH");
				goToAdmin();

				int intRandNum = generateRandonNumber();
				String strAdjustmentReasons = data.get("ShortDesc")+"_"+Integer.toString(intRandNum);
				String strXpath= "(.//*[@id='gwt-debug-shortDescription'])";
				createAdjustmentReasons(data,strAdjustmentReasons);
				verifyAdjustmentReasons(strXpath,strAdjustmentReasons);

			} }
		catch (Exception e) 
		{
			e.printStackTrace();
		}}

	@DataProvider
	public Object[][] getTestDataFor_updateAdjustmentReasons() {
		return TestUtil.getData("updateAdjustmentReasons", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_updateAdjustmentReasons")
	public void updateAdjustmentReasons(Hashtable<String, String> data) throws Throwable {

		try {


			if (data.get("RunMode").equals("Y"))
			{
				this.reporter.initTestCaseDescription("SQA-74");	
				selectAgency("RUTH");
				goToAdmin();

				int intRandNum = generateRandonNumber();
				String strAdjustmentReasons = data.get("ShortDesc")+"_"+Integer.toString(intRandNum);
				createAdjustmentReasons(data,strAdjustmentReasons);

				String strEditAdjustmentReasons = data.get("EditShortDesc")+"_"+Integer.toString(intRandNum);
				String strXpath= "(.//*[@id='gwt-debug-shortDescription'])";
				editAdjustmentReasons1(strEditAdjustmentReasons,strAdjustmentReasons,strXpath);
				sleep(2000);
				new AdminPage().Admin_Page();
				click(AdminPage.AdjustmentReasons, "AdjustmentReasons link");

				verifyAdjustmentReasons(strXpath,strEditAdjustmentReasons);

			} }
		catch (Exception e) 
		{
			e.printStackTrace();
		}}

	@DataProvider
	public Object[][] getTestDataFor_addIDGTeams() {
		return TestUtil.getData("addIDGTeams", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_addIDGTeams")
	public void addIDGTeams(Hashtable<String, String> data) throws Throwable {

		try {


			if (data.get("RunMode").equals("Y"))
			{
				this.reporter.initTestCaseDescription("SQA-100");	
				selectAgency("RUTH");
				goToAdmin();

				int intRandNum = generateRandonNumber();
				String strIGDTeamName = data.get("TeamName")+"_"+Integer.toString(intRandNum);
				createIGDTeams(strIGDTeamName);
				String strXpathDragAndDrop= "(.//div[contains(@class,'hb-draggable')])";
				String strXpathVerifyDragAndDrop= "(.//*[@id='gwt-debug-name'])";
				String strIDGDropTeam = "RUTH";
				dropAndDragIGDTeams(strIDGDropTeam,strXpathDragAndDrop);
				verifyDropAndDragIGDTeams(strIGDTeamName, strIDGDropTeam, strXpathVerifyDragAndDrop);


			} }
		catch (Exception e) 
		{
			e.printStackTrace();
		}}

	// Navya

	//03172016
	@DataProvider
	public Object[][] getTestDataFor_verifyingPhysicianGrid() {
		return TestUtil.getData("verifyingPhysicianGrid", TestData, "Admin");
	}
	
	@Test(dataProvider = "getTestDataFor_verifyingPhysicianGrid")
	public void verifyingPhysicianGrid(Hashtable<String, String> data)
			throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-43");
				selectAgency("RUTH");
				goToPhysicains(data);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_searchPhysicianGrid() {
		return TestUtil.getData("searchPhysicianGrid", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_searchPhysicianGrid")
	public void searchPhysicianGrid(Hashtable<String, String> data)
			throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-44");
				selectAgency("RUTH");
				searchRecord(data);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_verifyRoleAssignments() {
		return TestUtil.getData("verifyRoleAssignments", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_verifyRoleAssignments")
	public void verifyRoleAssignments(Hashtable<String, String> data)
			throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-45");
				System.out.println("Executed");
				selectAgency("RUTH");
				goToRoleAssignments(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_roleAssignmentsDragVerify() {
		return TestUtil.getData("roleAssignmentsDragVerify", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_roleAssignmentsDragVerify")
	public void roleAssignmentsDragVerify(Hashtable<String, String> data)
			throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-46");
				System.out.println("Executed");
				selectAgency("RUTH");

				roleAssignmentsDrag(data);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_verifyingFacilities() {
		return TestUtil.getData("verifyingFacilities", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_verifyingFacilities")
	public void verifyingFacilities(Hashtable<String, String> data)
			throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-47");
				System.out.println("Executed");
				selectAgency("RUTH");
				goToFacilities(data);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_addNewChurch() {
		return TestUtil.getData("addNewChurch", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_addNewChurch")
	public void addNewChurch(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-48");
				System.out.println("Executed");
				selectAgency("RUTH");
				goToChurch();
				String strChurch = data.get("church")+ Integer.toString(generateRandonNumber());
				addChurch(data, strChurch);
				verifyChurch(strChurch);
				closeChurchTab(strChurch);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_updateExistingChurch() {
		return TestUtil.getData("updateExistingChurch", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_updateExistingChurch")
	public void updateExistingChurch(Hashtable<String, String> data)
			throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-49");
				System.out.println("Executed");
				selectAgency("RUTH");
				String vstrChurch = data.get("church")+ Integer.toString(generateRandonNumber());
				goToChurch();
				addChurch(data, vstrChurch);
				verifyChurch(vstrChurch);
				updateChurch(data, vstrChurch);
				closeChurchTab(vstrChurch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@DataProvider
	public Object[][] getTestDataFor_saveHospiceElection() {
		return TestUtil.getData("saveHospiceElection", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_saveHospiceElection")
	public void saveHospiceElection(Hashtable<String, String> data)
			throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-75");
				System.out.println("Executed");
				selectAgency("RUTH");
				goToHospiceElection(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_addHospiceElection() {
		return TestUtil.getData("addHospiceElection", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_addHospiceElection")
	public void addHospiceElection(Hashtable<String, String> data)
			throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-76");
				System.out.println("Executed");
				selectAgency("RUTH");
				modifyHospiceElection(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_addInsuranceCarrier() {
		return TestUtil.getData("addInsuranceCarrier", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_addInsuranceCarrier")
	public void addInsuranceCarrier(Hashtable<String, String> data)
			throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-77");
				System.out.println("Executed");
				selectAgency("RUTH");
				addInsurance(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_insuranceCarrierSearch() {
		return TestUtil.getData("insuranceCarrierSearch", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_insuranceCarrierSearch")
	public void insuranceCarrierSearch(Hashtable<String, String> data)
			throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-78");
				System.out.println("Executed");
				selectAgency("RUTH");
				addInsuranceSearch(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_insuranceCarrierUpdate() {
		return TestUtil.getData("insuranceCarrierUpdate", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_insuranceCarrierUpdate")
	public void insuranceCarrierUpdate(Hashtable<String, String> data)
			throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-78");
				System.out.println("Executed");
				selectAgency("RUTH");
				updateInsurance(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_addMedicareIntermediary() {
		return TestUtil.getData("addMedicareIntermediary", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_addMedicareIntermediary")
	public void addMedicareIntermediary(Hashtable<String, String> data)
			throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-80");
				System.out.println("Executed");
				selectAgency("RUTH");
				addMedicareIntermediaries(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_deleteMedicare() {
		return TestUtil.getData("deleteMedicare", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_deleteMedicare")
	public void deleteMedicare(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-81");
				System.out.println("Executed");
				selectAgency("RUTH");
				addMedicareIntermediaries(data);
				deleteMedicareIntermediaries(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_wrongPasswordMedicare() {
		return TestUtil.getData("wrongPasswordMedicare", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_wrongPasswordMedicare")
	public void wrongPasswordMedicare(Hashtable<String, String> data)
			throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-78");
				System.out.println("Executed");
				selectAgency("RUTH");
				mediacarePasswordValidation(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_addPhysicianServicesRecord() {
		return TestUtil
				.getData("addPhysicianServicesRecord", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_addPhysicianServicesRecord")
	public void addPhysicianServicesRecord(Hashtable<String, String> data)
			throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-83");
				System.out.println("Executed");
			
				int intRandNum = generateRandonNumber();
				String strProgramName = data.get("Name")+"_"+Integer.toString(intRandNum);
				String strCode = data.get("Code")+"_"+Integer.toString(intRandNum);
				selectAgency("RUTH");
				createProgram(data,strProgramName,strCode);
				PhysicianServices(data, strProgramName);
				//verifyProgram(data, strProgramName, strCode);
				//addPhysicianServices(data, strProgramName);
				verifyPhysicianServices(data,strProgramName);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_updatePhysicianServicesRecord() {
		return TestUtil.getData("updatePhysicianServicesRecord", TestData,
				"Admin");
	}

	@Test(dataProvider = "getTestDataFor_updatePhysicianServicesRecord")
	public void updatePhysicianServicesRecord(Hashtable<String, String> data)
			throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-84");
				System.out.println("Executed");
				selectAgency("RUTH");
				//addPhysicianServices(data);
				updatePhysicianServices(data);
				verifyupdatedPhysicianServices(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_addRecordRoomBoardRateTiers() {
		return TestUtil.getData("addRecordRoomBoardRateTiers", TestData,
				"Admin");
	}

	@Test(dataProvider = "getTestDataFor_addRecordRoomBoardRateTiers")
	public void addRecordRoomBoardRateTiers(Hashtable<String, String> data)
			throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-85");
				System.out.println("Executed");
					selectAgency("RUTH");
				addRoomAndBorardRateTiers(data);
				verifyaddRoomAndBorardRateTiers(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	

	@DataProvider
	public Object[][] getTestDataFor_deleteRecordRoomBoardRateTiers() {
		return TestUtil.getData("deleteRecordRoomBoardRateTiers", TestData,
				"Admin");
	}

	@Test(dataProvider = "getTestDataFor_deleteRecordRoomBoardRateTiers")
	public void deleteRecordRoomBoardRateTiers(Hashtable<String, String> data)
			throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-78");
				System.out.println("Executed");
				selectAgency("RUTH");
				deleteRoomAndBorardRateTiers(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 24-02-2016

	@DataProvider
	public Object[][] getTestDataFor_configureRequiredFields() {
		return TestUtil.getData("configureRequiredFields", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_configureRequiredFields")
	public void configureRequiredFields(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y"))
			{
				this.reporter.initTestCaseDescription("SQA-95");	
				selectAgency("RUTH");
				goToAdmin();

				int intRandNum = generateRandonNumber();
				String strPatientFirstName = data.get("patientFirstName")+"_"+Integer.toString(intRandNum);
				String strPatientLastName = data.get("patientLastName")+"_"+Integer.toString(intRandNum);

				verifyConfigurationRequiredFields(data, strPatientFirstName, strPatientLastName);

			} }
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_testCreatePatientInAdminCreatedSite() {
		return TestUtil.getData("testCreatePatientInAdminCreatedSite", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_testCreatePatientInAdminCreatedSite")
	public void testCreatePatientInAdminCreatedSite(Hashtable<String, String> data)	throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-95");
				selectAgency("RUTH");
				goToAdmin();
				int intRandNum = generateRandonNumber();
				String strSiteNickName = data.get("siteNickName") + "_"
						+ Integer.toString(intRandNum);
				String strPatientFirstName = data.get("patientFirstName") + "_"
						+ Integer.toString(intRandNum);
				String strPatientLastName = data.get("patientLastName") + "_"
						+ Integer.toString(intRandNum);
				goToSites();
				createSite(data, strSiteNickName);
				createPatientInAdminCreatedSite(data, strSiteNickName, strPatientFirstName, strPatientLastName);


			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@DataProvider
	public Object[][] getTestDataFor_testUpdateSite() {
		return TestUtil.getData("testUpdateSite", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_testUpdateSite")
	public void testUpdateSite(Hashtable<String, String> data)	throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-96");
				selectAgency("RUTH");
				goToAdmin();
				goToSites();
				int intRandNum = generateRandonNumber();
				String strSiteNickName = data.get("siteNickName") + "_"
						+ Integer.toString(intRandNum);
				System.out.println("site - > " + strSiteNickName);
				createSite(data, strSiteNickName);
				goToSites();
				sleep(sleep);
				updateSite(data, strSiteNickName);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	

	@DataProvider
	public Object[][] getTestDataFor_verifyOfficeDetails() {
		return TestUtil.getData("verifyOfficeDetails", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_verifyOfficeDetails")
	public void verifyOfficeDetails(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y"))
			{
				this.reporter.initTestCaseDescription("SQA-98");	
				selectAgency("RUTH");
				goToAdmin();

				int intRandNum = generateRandonNumber();
				String strOfficeName = data.get("officeName")+"_"+Integer.toString(intRandNum);
				createOffice(data, strOfficeName);

				String strXpath= "(.//*[@id='gwt-debug-name'])";
				verifyOffice(strXpath, strOfficeName,true);

				updateOffice(data, strOfficeName);
				verifyUpdatedOffice(data, strOfficeName);

				deleteOffice(data, strOfficeName);
				verifyOffice(strXpath, strOfficeName,false);

			} }
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_verifyRegionsDetails() {
		return TestUtil.getData("verifyRegionsDetails", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_verifyRegionsDetails")
	public void verifyRegionsDetails(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y"))
			{
				this.reporter.initTestCaseDescription("SQA-99");	
				selectAgency("RUTH");
				goToAdmin();

				int intRandNum = generateRandonNumber();
				String strRegionName = data.get("RegionsName")+"_"+Integer.toString(intRandNum);
				createRegion(data, strRegionName);

				String strXpath= "(.//*[@id='gwt-debug-name'])";
				verifyOffice(strXpath, strRegionName,true);

				updateRegion(data, strRegionName);
				verifyUpdatedRegions(data, strRegionName);

				deleteOffice(data, strRegionName);
				verifyOffice(strXpath, strRegionName,false);

			} }
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/*@DataProvider
	public Object[][] getTestDataFor_verifyPersonsDetails() {
		return TestUtil.getData("verifyPersonsDetails", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_verifyPersonsDetails")
	public void verifyPersonsDetails(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y"))
			{
				this.reporter.initTestCaseDescription("SQA-101");	
				selectAgency("RUTH");
				goToAdmin();

				int intRandNum = generateRandonNumber();
				String strPersonName = data.get("PersonsFirstName")+"_"+Integer.toString(intRandNum);
				createPerson(data, strPersonName);

				String strXpath= "(.//*[@id='gwt-debug-firstName'])";
				verifyPersons(strXpath, strPersonName,true);

				updateRegion(data, strPersonName);
				verifyUpdatedRegions(data, strPersonName);

				deleteOffice(data, strPersonName);
				verifyOffice(strXpath, strPersonName,false);

			} }
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}*/

	
	//shiney_09 march
	
	@DataProvider
	public Object[][] getTestDataFor_verifyReferalSourceType() {
		return TestUtil.getData("verifyReferalSourceType", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_verifyReferalSourceType")
	public void verifyReferalSourceType(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y"))
			{
				this.reporter.initTestCaseDescription("SQA-130");	
				selectAgency("RUTH");
				goToAdmin();
				referalSourceType(data);
				verifyreferalSource(data);


			} }
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	

	@DataProvider
	public Object[][] getTestDataFor_verifyReferralRejectionReasons() {
		return TestUtil.getData("verifyReferralRejectionReasons", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_verifyReferralRejectionReasons")
	public void verifyReferralRejectionReasons(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y"))
			{
				this.reporter.initTestCaseDescription("SQA-127");	
				selectAgency("RUTH");
				goToAdmin();
				referralRejectionReasons(data);
				verifyReferralRejection(data);
				

			} }
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@DataProvider
	public Object[][] getTestDataFor_verifyDischargecodes() {
		return TestUtil.getData("verifyDischargecodes", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_verifyDischargecodes")
	public void verifyDischargecodes(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y"))
			{
				this.reporter.initTestCaseDescription("SQA-126");	
				int randNum = generateRandonNumber();
				String personName = data.get("patientFirstName")+"_"+Integer.toString(randNum);
				selectAgency("RUTH");
				goToAdmin();
				dischargeCodes(data);
				setPatientInfo(data, personName);
				setDemographicsInfo(data);
				setRefferalInfo(data);
				admitPatient(data);
				dischargePatient(data);
				

			} }
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	@DataProvider
	public Object[][] getTestDataFor_verifyDiagnosisCodes() {
		return TestUtil.getData("verifyDiagnosisCodes", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_verifyDiagnosisCodes")
	public void verifyDiagnosisCodes(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y"))
			{
				this.reporter.initTestCaseDescription("SQA-125");	
				int randNum = generateRandonNumber();
				String personName = data.get("patientFirstName")+"_"+Integer.toString(randNum);

				selectAgency("RUTH");
				goToAdmin();
				diagonsiscode(data);
				
				setPatientInfo(data, personName);
//				setDemographicsInfo(data);
//				setBasicInfo(data);
//				setRefferalInfo(data);
				goToDiagnosisTab();
				setDiagnosisInfo(data, "C7A020", "001.0");
				

			} }
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@DataProvider
	public Object[][] getTestDataFor_verifyNewPersonsDetails() {
		return TestUtil.getData("verifyNewPersonsDetails", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_verifyNewPersonsDetails")
	public void verifyNewPersonsDetails(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y"))
			{
				this.reporter.initTestCaseDescription("SQA-101");	
				selectAgency("RUTH");
				goToAdmin();

			    int randNum = generateRandonNumber();
				String personName = data.get("PersonsFirstName")+"_"+Integer.toString(randNum);
				createPersonDetails(data, personName);

				String xpath= "(.//input[@id='gwt-debug-firstName'])";
				verifyNewPerson(xpath, personName);

				String cxpath = "(.//input[@id='gwt-debug-company'])";
				String CompanyName = data.get("CompanyName");
				updatenewPersondetails(data);
				verifyUpdatedDetails(data, cxpath, CompanyName, personName);


				deletedetails();
				verifydetails(xpath, personName);

			} 
			}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	
	@DataProvider
	public Object[][] getTestDataFor_sendActivationEmail() {
		return TestUtil.getData("sendActivationEmail", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_sendActivationEmail")
	public void sendActivationEmail(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y"))
			{
				this.reporter.initTestCaseDescription("SQA-138");	
				selectAgency("RUTH");
				//String userName = getUserName();
				String strTime = getCurrentTime();
				System.out.println("UserName is  "+userName);
				goToAdmin();
	

			    int randNum = generateRandonNumber();
				String personName = data.get("PersonsFirstName")+"_"+Integer.toString(randNum);
				String Email = data.get("EmailId")+ "+" + strTime + "@mumms.com";
				createNewPerson(data, personName, Email);
				
				String name = windowname();
				System.out.println("window is" + name);
				
				verifyEmail(data,personName);
				deleteEmail(name);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}	
	
	
	@AfterMethod
	public void logOut() throws Throwable {
		doLogout();
	}
}
