package com.Mumms.scripts;

import java.util.Hashtable;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Mumms.libs.PatientLib;
import com.Mumms.page.PatientPage;
import com.automation.accelerators.TestEngine;
import com.automation.accelerators.TestEngineWeb;
import com.automation.utilities.TestUtil;

public class Patient extends PatientLib {

	@Parameters({"userrole"})
	@BeforeMethod
	public void login(String userrole) throws Throwable{
		loginAsUserRole(userrole);
	}


	@DataProvider
	public Object[][] getTestDataFor_verifyDemographicsTab() {
		return TestUtil.getData("verifyDemographicsTab", TestData, "Patient");
	}

	@Test(dataProvider = "getTestDataFor_verifyDemographicsTab")

	public void verifyDemographicsTab(Hashtable<String, String> data) throws Throwable {
		try {

			this.reporter.initTestCaseDescription("SQA-87");	
			//selectAgency("RUTH");

			int intrandNum = generateRandonNumber();
			String strPersonName = data.get("patientFirstName")+"_"+Integer.toString(intrandNum);

			setDemographicData(data,strPersonName);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@DataProvider
	public Object[][] getTestDataFor_verifyDiagnosisTab() {
		return TestUtil.getData("verifyDiagnosisTab", TestData, "Patient");
	}

	@Test(dataProvider = "getTestDataFor_verifyDiagnosisTab")

	public void verifyDiagnosisTab(Hashtable<String, String> data) throws Throwable {
		try {

			this.reporter.initTestCaseDescription("SQA-88");	
			//selectAgency("RUTH");

			int intrandNum = generateRandonNumber();
			String personName = data.get("patientFirstName")+"_"+Integer.toString(intrandNum);

			setDiagnosisData(data,personName);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@DataProvider
	public Object[][] getTestDataFor_verifyAllergiesTab() {
		return TestUtil.getData("verifyAllergiesTab", TestData, "Patient");
	}

	@Test(dataProvider = "getTestDataFor_verifyAllergiesTab")

	public void verifyAllergiesTab(Hashtable<String, String> data) throws Throwable {
		try {

			this.reporter.initTestCaseDescription("SQA-89");	
			//selectAgency("RUTH");

			int intrandNum = generateRandonNumber();
			String personName = data.get("patientFirstName")+"_"+Integer.toString(intrandNum);
			String AllergyName = data.get("AllergyName")+"_"+Integer.toString(intrandNum);

			setAllergiesData(data,personName,AllergyName);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_verifyAssignmentTab() {
		return TestUtil.getData("verifyAssignmentTab", TestData, "Patient");
	}

	@Test(dataProvider = "getTestDataFor_verifyAssignmentTab")

	public void verifyAssignmentTab(Hashtable<String, String> data) throws Throwable {
		try {

			this.reporter.initTestCaseDescription("SQA-90");	
			//selectAgency("RUTH");

			int intrandNum = generateRandonNumber();
			String personName = data.get("patientFirstName")+"_"+Integer.toString(intrandNum);

			setAssignmentData(data,personName);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getTestDataFor_TestAddPatient() {
		return TestUtil.getData("TestAddPatient", TestData, "Patient");
	}
	
	@Test(dataProvider = "getTestDataFor_TestAddPatient")
	public void TestAddPatient(Hashtable<String, String> data)	throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("TC-65");
			//	selectAgency("RUTH");
				//gotoPatientGrid();
			//	addPatientinPatientGrid(data);
				int intrandNum = generateRandonNumber();
			
				String patientFirstName = data.get("patientFirstName") + "_"
						+ Integer.toString(intrandNum);
			
				setPatientInfo(data, patientFirstName);
				setPatientDemographicsInfo(data);
				setRefferalInfo(data);
				setPatientBasicInfo(data);
				setPhysicianInfo(data);
				verifyPatientHeaderInfo();
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@DataProvider
	public Object[][] getTestDataFor_TestUpdatePatient() {
		return TestUtil.getData("TestUpdatePatient", TestData, "Patient");
	}
	
	@Test(dataProvider = "getTestDataFor_TestUpdatePatient")
	public void TestUpdatePatient(Hashtable<String, String> data)	throws Throwable {

		try {

			if (data.get("RunMode").equals("Y")) {
				this.reporter.initTestCaseDescription("TC-66");
				//selectAgency("RUTH");
			int intrandNum = generateRandonNumber();
				
				String patientFirstName = data.get("patientFirstName") + "_"
						+ Integer.toString(intrandNum);
				
				setPatientInfo(data, patientFirstName);
				setPatientDemographicsInfo(data);
				setRefferalInfo(data);
				setPatientBasicInfo(data);
				goToInsuranceTab();
				//addDefaultInfoInInsuranceTab("Medicare");
				verifyPatientSsnInfo();
				sleep(sleep);
				goToHistoryTab();
				verifyPatientHistroyInfo();
				sleep(sleep);
		
				goToDemographicTab();
				setBasicInfoUpdate(data);
				verifyPatientSsnInfo();
				
				goToDemographicTab();
				setRefferalInfoUpdate(data);
				goToHistoryTab();
				verifyPatientHistroyInfo();
				
			
				patientdrawerinfo(data,patientFirstName );
				
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	//sampath
	//sampath
	
			@DataProvider
			public Object[][] getTestDataFor_TestCareGiversTab() {
				return TestUtil.getData("TestCareGiversTab", TestData, "Patient");
			}

			@Test(dataProvider = "getTestDataFor_TestCareGiversTab")
			public void TestCareGiversTab(Hashtable<String, String> data) throws Throwable {
				try {

					this.reporter.initTestCaseDescription("SQA-91");	
				//	//selectAgency("RUTH");

					int randNum = generateRandonNumber();
					String strPatientFirstName = data.get("patientFirstName")+"_"+Integer.toString(randNum);

					setPatientInfo(data, strPatientFirstName);
					setDemographicsInfo(data);
					setRefferalInfo(data);
					setBasicInfo(data);
					
					/*clickOnPatientInfoIcon();
					openPatientInfo(data, "Gallop_FN_6654");
					*/
					setPhysicianInfo(data);
					setConcernsInfo(data);
					setNotesInfo(data);
					admitPatient(data);
					goToCaregiversTab();

					randNum = generateRandonNumber();
					String strFirstName1 = "fn_CareGiver"+"_"+Integer.toString(randNum);
					String strLastName1 = "ln_CareGiver"+"_"+Integer.toString(randNum);
					String strRelation1 = "Child";
					addCareGiver(strFirstName1, strLastName1, strRelation1);

					randNum = generateRandonNumber();
					String strFirstName2 = "fn_CareGiver"+"_"+Integer.toString(randNum);
					String strLastName2 = "ln_CareGiver"+"_"+Integer.toString(randNum);
					String strRelation2 = "Grandchild";
					addCareGiver(strFirstName2, strLastName2, strRelation2);

					randNum = generateRandonNumber();
					String strFirstName3 = "fn_CareGiver"+"_"+Integer.toString(randNum);
					String strLastName3	= "ln_CareGiver"+"_"+Integer.toString(randNum);
					String strRelation3 = "Parent";
					addCareGiver(strFirstName3, strLastName3, strRelation3);
					
					String careGiverOnFirstRow = getAttributeByValue(PatientPage.firstRowDisplayedInCareGiversTab,
							"first row displayed on care giver tab.");
									
					assertTextMatching(PatientPage.patientHeader_CareGiverDisplayed, careGiverOnFirstRow,
							"Verify the first row on caregiver tab is displayed on patient header.");

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			@DataProvider
			public Object[][] getTestDataFor_TestValidateInsuranceTab() {
				return TestUtil.getData("TestValidateInsuranceTab", TestData, "Patient");
			}

			@Test(dataProvider = "getTestDataFor_TestValidateInsuranceTab")
			public void TestValidateInsuranceTab(Hashtable<String, String> data) throws Throwable {
				try {

					this.reporter.initTestCaseDescription("SQA-92");	
					////selectAgency("RUTH");

					int randNum = generateRandonNumber();
					String strPatientFirstName = data.get("patientFirstName")+"_"+Integer.toString(randNum);

					setPatientInfo(data, strPatientFirstName);
					setDemographicsInfo(data);
					setRefferalInfo(data);
					setBasicInfo(data);
					setPhysicianInfo(data);
					setConcernsInfo(data);
					setNotesInfo(data);
					admitPatient(data);
					goToInsuranceTab();
					addDefaultInfoInInsuranceTab(data.get("priInsurance"));
					appendLetterToPolicyNumber("A");
					clickOnAddInsuranceButton();
					addCommercialInsurance(data.get("secInsurance"));
					appendLetterToPolicyNumber("B");
					setTrueToBillForRB();
					clickOnAddInsuranceButton();
					goToHistoryTab();
					setPrimaryInsuranceInHistoryTab(data, data.get("priInsurance"));
					setSecondaryInsuranceInHistoryTab(data, data.get("secInsurance"));
					assertText(PatientPage.current_election_Label, "Current Election");

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			@DataProvider
			public Object[][] getTestDataFor_TestValidateElectionGrid() {
				return TestUtil.getData("TestValidateElectionGrid", TestData, "Patient");
			}

			@Test(dataProvider = "getTestDataFor_TestValidateElectionGrid")
			public void TestValidateElectionGrid(Hashtable<String, String> data) throws Throwable {
				try {

					this.reporter.initTestCaseDescription("SQA-93");	
					////selectAgency("RUTH");

					int randNum = generateRandonNumber();
					String strPatientFirstName = data.get("patientFirstName")+"_"+Integer.toString(randNum);
					
					setPatientInfo(data, strPatientFirstName);
					setDemographicsInfo(data);
					setRefferalInfo(data);
					setBasicInfo(data);
					setPhysicianInfo(data);
					setConcernsInfo(data);
					setNotesInfo(data);
					admitPatient(data);
					goToInsuranceTab();
					addDefaultInfoInInsuranceTab(data.get("priInsurance"));
					appendLetterToPolicyNumber("A");
					clickOnAddInsuranceButton();
					addCommercialInsurance(data.get("secInsurance"));
					appendLetterToPolicyNumber("B");
					setTrueToBillForRB();
					clickOnAddInsuranceButton();
					
					goToHistoryTab();
					setPrimaryInsuranceInHistoryTab(data, data.get("priInsurance"));
					setSecondaryInsuranceInHistoryTab(data, data.get("secInsurance"));
					
					/*clickOnPatientInfoIcon();
					openPatientInfo(data, "Gallop_FN_10252");*/
					
					goToInsuranceTab();
					goToElectionsForInsurer(data.get("priInsurance"));
					click_AttendingPhysician_priInsurer();
					fillVerbalAndSignatureDates_attendingPhysician(data);
					selectHospicePhysicianForPriMaryInsurer_electionGrid(data);
					fillVerbalAndSignatureDates_hospicePhysician(data);
					selectCertifyingPhysicianForPriMaryInsurer_electionGrid(data);
					fillVerbalAndSignatureDates_certifyingPhysician(data);
					close_ElectionGrid();
					
				//	goToInsuranceTab();
					goToElectionsForInsurer(data.get("secInsurance"));
					click_AttendingPhysician_priInsurer();
					fillVerbalAndSignatureDates_attendingPhysician(data);
					selectHospicePhysicianForPriMaryInsurer_electionGrid(data);
					fillVerbalAndSignatureDates_hospicePhysician(data);
					selectCertifyingPhysicianForPriMaryInsurer_electionGrid(data);
					fillVerbalAndSignatureDates_certifyingPhysician(data);
					close_ElectionGrid();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			@DataProvider
			public Object[][] getTestDataFor_TestValidateHistoryTab() {
				return TestUtil.getData("TestValidateHistoryTab", TestData, "Patient");
			}

			@Test(dataProvider = "getTestDataFor_TestValidateHistoryTab")
			public void TestValidateHistoryTab(Hashtable<String, String> data) throws Throwable {
				try {

					this.reporter.initTestCaseDescription("SQA-94");	
					////selectAgency("RUTH");

					int randNum = generateRandonNumber();
					String strPatientFirstName = data.get("patientFirstName")+"_"+Integer.toString(randNum);

					setPatientInfo(data, strPatientFirstName);
					setDemographicsInfo(data);
					setRefferalInfo(data);
					setBasicInfo(data);
					setPhysicianInfo(data);
					setConcernsInfo(data);
					setNotesInfo(data);
					admitPatient(data);
					goToInsuranceTab();
					addDefaultInfoInInsuranceTab(data.get("priInsurance"));
					appendLetterToPolicyNumber("A");
					clickOnAddInsuranceButton();
					addCommercialInsurance(data.get("secInsurance"));
					appendLetterToPolicyNumber("B");
					setTrueToBillForRB();
					clickOnAddInsuranceButton();
					//openPatientInfo(data, "Gallop_FN_9532");
					goToHistoryTab();
					setPrimaryInsuranceInHistoryTab(data, data.get("priInsurance"));
					setSecondaryInsuranceInHistoryTab(data, data.get("secInsurance"));
					changeLocAndFacilityInHistoryTab(data);
					setLocationRespiteAndSetEndDate(data);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			@DataProvider
			public Object[][] getTestDataFor_TestValidatePatientHeader() {
				return TestUtil.getData("TestValidatePatientHeader", TestData, "Patient");
			}

			@Test(dataProvider = "getTestDataFor_TestValidatePatientHeader")
			public void TestValidatePatientHeader(Hashtable<String, String> data) throws Throwable {
				try {

					this.reporter.initTestCaseDescription("SQA-70");	
					////selectAgency("RUTH");

					int randNum = generateRandonNumber();
					String strPatientFirstName = data.get("patientFirstName")+"_"+Integer.toString(randNum);

					setPatientInfo(data, strPatientFirstName);
					setDemographicsInfo(data);
					setRefferalInfo(data);
					setBasicInfo(data);
					
					//clickOnPatientInfoIcon();
					//openPatientInfo(data, "Gallop_FN_2806");
				
					setPhysicianInfo(data);
					setConcernsInfo(data);
					setNotesInfo(data);
					admitPatient(data);
					goToInsuranceTab();
					addDefaultInfoInInsuranceTab(data.get("priInsurance"));

					clickOnAddInsuranceButton();

					goToHistoryTab();
					setPrimaryInsuranceInHistoryTab(data, data.get("priInsurance"));
					verifyPatientHeaderInformation();



				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			@DataProvider
			public Object[][] getTestDataFor_verifyintractiongrid () {
				return TestUtil.getData("verifyintractiongrid", TestData, "Patient");
			}

			@Test(dataProvider = "getTestDataFor_verifyintractiongrid")
			public void verifyintractiongrid(Hashtable<String, String> data) throws Throwable {
				try {
					if (data.get("RunMode").equals("Y"))
					{

						this.reporter.initTestCaseDescription("SQA-67");	
						////selectAgency("RUTH");
						int randNum = generateRandonNumber();

						String strPatientFirstName = data.get("patientFirstName") + "_"
								+ Integer.toString(randNum);
						//clickOnPatientInfoIcon();
						//openPatientInfo(data, "Gallop_FN_10285");
						setPatientInfo(data, strPatientFirstName);
						setDemographicsInfo(data);
						setRefferalInfo(data);
						setBasicInfo(data);
						setPhysicianInfo(data);
						setConcernsInfo(data);
						setNotesInfo(data);
						admitPatient(data);
						goToInsuranceTab();
						addDefaultInfoInInsuranceTab(data.get("priInsurance"));
						clickOnAddInsuranceButton();
						goToHistoryTab();
						setPrimaryInsuranceInHistoryTab(data, data.get("priInsurance"));				
						
						goToInsuranceTab();
						
						goToElectionsForInsurer(data.get("priInsurance"));
						click_AttendingPhysician_priInsurer();
						fillVerbalAndSignatureDates_attendingPhysician(data);
						selectHospicePhysicianForPriMaryInsurer_electionGrid(data);
						fillVerbalAndSignatureDates_hospicePhysician(data);
						selectCertifyingPhysicianForPriMaryInsurer_electionGrid(data);
						fillVerbalAndSignatureDates_certifyingPhysician(data);
						close_ElectionGrid();
						
						
						clickOnLowerGrid();
						goToHome();
						
						dragAndDropIntarcationGrid();
						goToIntraction();
						addIntarcationGrid(data, strPatientFirstName);
						
						
						clickOnPatientInfoIcon();
						goToInsuranceTab();
						goToElectionsForInsurer(data.get("priInsurance"));
						verifyAddIntractionInElectionGrid(data);
						close_ElectionGrid();
						
						clickOnLowerGrid();
						goToHome();
						goToIntraction();	
						searchPatientInSearchEditTab_Intraction(data.get("startdate_MM"), data.get("startdate_DD"),
								data.get("startdate_Year"), strPatientFirstName);
						editIntarcationRecord(data);
						clickOnPatientInfoIcon();
						goToElectionsForInsurer(data.get("priInsurance"));
						verifyEditIntractionInElectionGrid(data);
						close_ElectionGrid();
						
						clickOnLowerGrid();
						goToHome();
						goToIntraction();	
						searchPatientInSearchEditTab_Intraction(data.get("edit_startdate_MM"), data.get("edit_startdate_DD"),
								data.get("edit_startdate_Year"), strPatientFirstName);		
						deleteIntarcationRecord();
						
						clickOnPatientInfoIcon();
						goToElectionsForInsurer(data.get("priInsurance"));
						verifydeleteIntractionInElectionGrid();
						close_ElectionGrid();
							
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			
			//sampath
	
	//sampath
	
	
	//16 march-shiney
	
		@DataProvider
		public Object[][] getTestDataFor_verifyUnadmitFunctionality() {
			return TestUtil.getData("verifyUnadmitFunctionality", TestData, "Patient");
		}

		@Test(dataProvider = "getTestDataFor_verifyUnadmitFunctionality")
		public void verifyUnadmitFunctionality(Hashtable<String, String> data) throws Throwable {
			try {

				this.reporter.initTestCaseDescription("SQA-172");	
				//selectAgency("RUTH");

				int randNum = generateRandonNumber();
				String patientFirstName = data.get("patientFirstName")+"_"+Integer.toString(randNum);

				setPatientInfo(data, patientFirstName);
				setDemographicsInfo(data);
				setRefferalInfo(data);
				setPatientBasicInfo(data);
				setPhysicianInfo(data);
				
				admitPatient(data);
							
				goToDiagnosisTab();
				setDiagnosisInfo(data,"A300","001.0");
				
				goToInsuranceTab();
				addDefaultInfoInInsuranceTab("Medicare");
				clickOnAddInsuranceButton();
				
				goToHistoryTab();
				setInsuranceInHistoryTab(data,"Medicare");
				
				unadmitPatient();
				goToHistoryTab();
				verifyHistoryStatus();
				
				
				patientInfo(data, patientFirstName);
				patientclickforadmit(data, patientFirstName);
				afterunadmitadmitPatient(data);
				
				

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		@DataProvider
		  public Object[][] getTestDataFor_verifyPatientDrawerFunctionality() {
		   return TestUtil.getData("verifyPatientDrawerFunctionality", TestData, "Patient");
		  }

		  @Test(dataProvider = "getTestDataFor_verifyPatientDrawerFunctionality")
		  public void verifyPatientDrawerFunctionality(Hashtable<String, String> data) throws Throwable {
		   try {

		    this.reporter.initTestCaseDescription("SQA-64"); 
		    //selectAgency("RUTH");
		    clickOnleftHandBar();
		    OpenAndVerifyPatientDrawer();
		    closePatientDrawer();
		    verifyPatientDrawerIsClosed();
		    
		    click(PatientPage.patientInfoIcon, "patient Info Icon");
		    Thread.sleep(sleepTime_chrome);
		    OpenAndVerifyPatientDrawer();
		    
		    selectAgency("rT");
		    Thread.sleep(sleepTime_chrome);
		    OpenAndVerifyPatientDrawer();
		    
		    clickOnLowerGrid();
		    goToHome();
		    verifyPatientDrawerIsClosed();
		    

		   } catch (Exception e) {
		    e.printStackTrace();
		   }
		  }

	@AfterMethod
	public void logOut() throws Throwable {
		doLogout();
	}
}
