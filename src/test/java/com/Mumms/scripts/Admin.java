package com.Mumms.scripts;

import java.util.Hashtable;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Mumms.libs.AdminLib;
import com.Mumms.page.AdminPage;
import com.automation.utilities.TestUtil;

public class Admin extends AdminLib {

	@Parameters({ "userrole" })
	@BeforeMethod
	public void login(String userrole) throws Throwable {
		loginAsUserRole(userrole);
	}

	@DataProvider
	public Object[][] getTestDataFor_deleteCreatedRole() {
		return TestUtil.getData("deleteCreatedRole", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_deleteCreatedRole")
	public void deleteCreatedRole(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("TC-50");
				selectAgency("RUTH");
				goToAdmin();

				int randNum = generateRandonNumber();
				String rollName = data.get("RolesGroup") + "_" + Integer.toString(randNum);
				String role = data.get("Role") + "_" + Integer.toString(randNum);

				createRole(data, rollName, role);
				deleteRole(data, rollName);

			}
		} catch (Exception e) {
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

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-51 -");
				selectAgency("RUTH");
				goToAdmin();

				int randNum = generateRandonNumber();
				String roleName = data.get("RolesGroup") + "_" + Integer.toString(randNum);
				String role = data.get("Role") + "_" + Integer.toString(randNum);

				createRole(data, roleName, role);
				// verifyRole(data, rollName);

			}
		} catch (Exception e) {
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

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-59");
				selectAgency("RUTH");
				goToAdmin();

				int randNum = generateRandonNumber();
				String ProgramName = data.get("Name") + "_" + Integer.toString(randNum);
				createProgram(data, ProgramName);
				verifyProgram(data, ProgramName);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_deleteCreatedProgram() {
		return TestUtil.getData("deleteCreatedProgram", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_deleteCreatedProgram")
	public void deleteCreatedProgram(Hashtable<String, String> data) throws Throwable {
		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("TC-60");
				selectAgency("RUTH");
				goToAdmin();

				int randNum = generateRandonNumber();
				String ProgramName1 = data.get("Name") + "_" + Integer.toString(randNum);
				createProgram(data, ProgramName1);
				softDeleteProgram(data, ProgramName1);

				int randNum2 = generateRandonNumber();
				String ProgramName2 = data.get("Name") + "_" + Integer.toString(randNum2);
				createProgram(data, ProgramName2);

				String patientFirstName = data.get("patientFirstName") + "_" + Integer.toString(randNum2);
				String patientLastName = data.get("patientLastName") + "_" + Integer.toString(randNum2);

				configureSiteForProgramHardDelete(data, ProgramName2);
				createPatientInfo(patientFirstName, patientLastName);
				assignProgramToPatient(ProgramName2);
				hardDeleteProgram(data, ProgramName2);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_addNewReligion() {
		return TestUtil.getData("addNewReligion", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_addNewReligion")
	public void addNewReligion(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("TC-61");
				selectAgency("RUTH");
				goToAdmin();

				int randNum = generateRandonNumber();
				String ReligionName = data.get("ReligionName") + "_" + Integer.toString(randNum);
				createReligion(data, ReligionName);
				verifyReligion(data, ReligionName);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_deleteCreatedReligion() {
		return TestUtil.getData("deleteCreatedReligion", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_deleteCreatedReligion")
	public void deleteCreatedReligion(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("TC-62");
				selectAgency("RUTH");
				goToAdmin();

				int randNum = generateRandonNumber();
				String ReligionName = data.get("ReligionName") + "_" + Integer.toString(randNum);
				createReligion(data, ReligionName);
				softDeleteReligion(data, ReligionName);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// SQA-39

	@DataProvider
	public Object[][] getTestDataFor_addNewReasons() {
		return TestUtil.getData("addNewReasons", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_addNewReasons")
	public void addNewReasons(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-73");
				selectAgency("RUTH");
				goToAdmin();

				int randNum = generateRandonNumber();
				String AdjustmentReasons = data.get("ShortDesc") + "_" + Integer.toString(randNum);
				String xpath = "(.//*[@id='gwt-debug-shortDescription'])";
				createAdjustmentReasons(data, AdjustmentReasons);
				verifyAdjustmentReasons(xpath, AdjustmentReasons);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_updateAdjustmentReasons() {
		return TestUtil.getData("updateAdjustmentReasons", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_updateAdjustmentReasons")
	public void updateAdjustmentReasons(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("TC-74");
				selectAgency("RUTH");
				goToAdmin();

				int randNum = generateRandonNumber();
				String AdjustmentReasons = data.get("ShortDesc") + "_" + Integer.toString(randNum);
				createAdjustmentReasons(data, AdjustmentReasons);

				String EditAdjustmentReasons = data.get("EditShortDesc") + "_" + Integer.toString(randNum);
				String xpath = "(.//*[@id='gwt-debug-shortDescription'])";
				editAdjustmentReasons1(EditAdjustmentReasons, AdjustmentReasons, xpath);
				sleep(2000);
				new AdminPage().Admin_Page();
				click(AdminPage.AdjustmentReasons, "AdjustmentReasons link");

				verifyAdjustmentReasons(xpath, EditAdjustmentReasons);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_addIDGTeams() {
		return TestUtil.getData("addIDGTeams", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_addIDGTeams")
	public void addIDGTeams(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("TC-100");
				selectAgency("RUTH");
				goToAdmin();

				int randNum = generateRandonNumber();
				String IGDTeamName = data.get("TeamName") + "_" + Integer.toString(randNum);
				createIGDTeams(IGDTeamName);
				String xpathDragAndDrop = "(.//div[contains(@class,'hb-draggable')])";
				String xpathVerifyDragAndDrop = "(.//*[@id='gwt-debug-name'])";
				String IDGDropTeam = "RUTH";
				dropAndDragIGDTeams(IDGDropTeam, xpathDragAndDrop);
				verifydropAndDragIGDTeams(IGDTeamName, IDGDropTeam, xpathVerifyDragAndDrop);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Navya

	@DataProvider
	public Object[][] getTestDataFor_verifyingPhysicianGrid() {
		return TestUtil.getData("verifyingPhysicianGrid", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_verifyingPhysicianGrid")
	public void verifyingPhysicianGrid(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-43");
				selectAgency("RUTH");
				gotoPhysicains(data);

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
	public void searchPhysicianGrid(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-44");
				selectAgency("RUTH");
				SearchRecord(data);

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
	public void verifyRoleAssignments(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-45");
				System.out.println("Executed");
				selectAgency("RUTH");
				gotoRoleAssignments(data);
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
	public void roleAssignmentsDragVerify(Hashtable<String, String> data) throws Throwable {

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
	public void verifyingFacilities(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-47");
				System.out.println("Executed");
				selectAgency("RUTH");
				gotoFacilities(data);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_saveChurches() {
		return TestUtil.getData("saveChurches", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_saveChurches")
	public void saveChurches(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-48");
				System.out.println("Executed");
				selectAgency("RUTH");
				gotoChurches(data);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_addChurches() {
		return TestUtil.getData("addChurches", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_addChurches")
	public void addChurches(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-49");
				System.out.println("Executed");
				selectAgency("RUTH");
				modifyChurches(data);
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
	public void saveHospiceElection(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-75");
				System.out.println("Executed");
				selectAgency("RUTH");
				gotoHospiceElection(data);
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
	public void addHospiceElection(Hashtable<String, String> data) throws Throwable {

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
	public void addInsuranceCarrier(Hashtable<String, String> data) throws Throwable {

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
	public void insuranceCarrierSearch(Hashtable<String, String> data) throws Throwable {

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
	public void insuranceCarrierUpdate(Hashtable<String, String> data) throws Throwable {

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
	public void addMedicareIntermediary(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-78");
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
				this.reporter.initTestCaseDescription("SQA-78");
				System.out.println("Executed");
				selectAgency("RUTH");
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
	public void wrongPasswordMedicare(Hashtable<String, String> data) throws Throwable {

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
		return TestUtil.getData("addPhysicianServicesRecord", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_addPhysicianServicesRecord")
	public void addPhysicianServicesRecord(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-78");
				System.out.println("Executed");
				selectAgency("RUTH");
				addPhysicianServices(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_updatePhysicianServicesRecord() {
		return TestUtil.getData("updatePhysicianServicesRecord", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_updatePhysicianServicesRecord")
	public void updatePhysicianServicesRecord(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-78");
				System.out.println("Executed");
				selectAgency("RUTH");
				updatePhysicianServices(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_addRecordRoomBoardRateTiers() {
		return TestUtil.getData("addRecordRoomBoardRateTiers", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_addRecordRoomBoardRateTiers")
	public void addRoomBoardRateTiers(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-78");
				System.out.println("Executed");
				selectAgency("RUTH");
				addroomAndBorardRateTiers(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_deleteRecordRoomBoardRateTiers() {
		return TestUtil.getData("deleteRecordRoomBoardRateTiers", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_deleteRecordRoomBoardRateTiers")
	public void deleteRoomBoardRateTiers(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-78");
				System.out.println("Executed");
				selectAgency("RUTH");
				deleteroomAndBorardRateTiers(data);
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

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("TC-95");
				selectAgency("RUTH");
				goToAdmin();

				int randNum = generateRandonNumber();
				String patientFirstName = data.get("patientFirstName") + "_" + Integer.toString(randNum);
				String patientLastName = data.get("patientLastName") + "_" + Integer.toString(randNum);

				verifyconfigurationRequiredFields(data, patientFirstName, patientLastName);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_addHospiceAgency() {
		return TestUtil.getData("addHospiceAgency", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_addHospiceAgency")
	public void addHospiceAgency(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("TC-53 - create new Hospice Agencies");
				selectAgency("RUTH");
				goToAdmin();

				int randNum = generateRandonNumber();
				String hospiceName = data.get("Name") + "_" + Integer.toString(randNum);
				String hospiceTenantID = data.get("TenantID") + "_" + Integer.toString(randNum);

				createHospiceAgencies(data, hospiceName, hospiceTenantID);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_addLanguage() {
		return TestUtil.getData("addLanguage", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_addLanguage")
	public void addLanguage(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-55 - Add new language");
				selectAgency("RUTH");
				goToAdmin();

				int randNum = generateRandonNumber();
				String langName = data.get("LanguageName") + "_" + Integer.toString(randNum);
				addNewLanguage(langName);
				verifyLanguage(langName);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_delLanguage() {
		return TestUtil.getData("addLanguage", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_delLanguage")
	public void delLanguage(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-55 - Add new language");
				selectAgency("RUTH");
				goToAdmin();

				int randNum = generateRandonNumber();
				String langName = data.get("LanguageName") + "_" + Integer.toString(randNum);
				addNewLanguage(langName);
				verifyLanguage(langName);
				deleteLanguage(langName);

			}
		} catch (Exception e) {
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

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("SQA-102");
				selectAgency("RUTH");
				goToAdmin();

				int randNum = generateRandonNumber();
				String personName = data.get("PersonsFirstName") + "_" + Integer.toString(randNum);
				createNewPerson(data, personName);

				verifyEmail(data);
				deleteEmail();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	@DataProvider
	public Object[][] getTestDataFor_addWidgets() {
		return TestUtil.getData("testaddWidgetPatientByFacilityType", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_addWidgets")
	public void testaddWidgetPatientByFacilityType(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("Adding Widgets");
				selectAgency("RUTH");
				addWidgetPatientByFacilityType();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	@DataProvider
	public Object[][] getTestDataFor_addWidgetsname() {
		return TestUtil.getData("testaddWidgetPatientByPayerType", TestData, "Admin");
	}

	@Test(dataProvider = "getTestDataFor_addWidgetsname")
	public void testaddWidgetPatientByPayerType(Hashtable<String, String> data) throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("Adding Widgets");
				selectAgency("RUTH");
				addWidgetPatientByPayerType();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	

	@AfterMethod
	public void logOut() throws Throwable {
		doLogout();
	}
}
