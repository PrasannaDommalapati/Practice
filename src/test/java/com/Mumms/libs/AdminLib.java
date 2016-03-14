package com.Mumms.libs;

import java.util.ArrayList;
import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Mumms.page.AdminPage;
import com.Mumms.page.HomePage;

public class AdminLib extends MummsLib {

	public int sleep = 3000;
	public String Church, InsuranceName, HospiceDesc, GroupName;

	public void createRole(Hashtable<String, String> data, String rollName, String role) throws Throwable {

		new HomePage().Home_Page();

		/* click(HomePage.AdminIcon, "Admin Icon"); */
		sleep(2000);
		new AdminPage().Admin_Page();
		click(AdminPage.Roles, "Roles link");
		sleep(2000);

		System.out.println("RolesGroup is " + rollName);
		typeUsingJavaScriptExecutor(AdminPage.RolesGroup, rollName, "RolesGroup field");
		// sleep(5000);
		// type(AdminPage.RolesGroup, data.get("RolesGroup"), "RolesGroup
		// field");
		type(AdminPage.HCPCSCode, data.get("HCPCSCode"), "HCPCSCode field");
		sleep(2000);
		type(AdminPage.DirectRevCode, data.get("DirectRevCode"), "DirectRevCode field");
		// sleep(3000);
		type(AdminPage.PhoneRevCode, data.get("PhoneRevCode"), "PhoneRevCode field");
		sleep(2000);
		type(AdminPage.Role, role, "Role field");
		sleep(2000);
		click(AdminPage.addIcon, "add Icon");
		// sleep(3000);

	}

	public void verifyRole(Hashtable<String, String> data, String rollName) throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		type(AdminPage.RolesGroup, rollName, "RolesGroup field");
		sleep(5000);
		String topDisplayedRole = Driver.findElement(AdminPage.topDisplayedRole).getText();
		// String topDisplayedRole =
		// Driver.findElement(AdminPage.topDisplayedRole).getAttribute("value");
		System.out.println("topDisplayedRole is " + topDisplayedRole);
		assertTextStringMatching(rollName, topDisplayedRole);
		// isElementPresent(AdminPage.topDisplayedRole, rollName, true);
		click(AdminPage.saveButton, "save button");

	}

	public void deleteRole(Hashtable<String, String> data, String rollName) throws Throwable {

		// sleep(5000);
		new AdminPage().Admin_Page();
		type(AdminPage.RolesGroup, rollName, "RolesGroup field");
		// sleep(4000);
		click(AdminPage.deleteTopDisplayedRole, "delete button");
		sleep(2000);
		click(AdminPage.okDelete, "ok button");
		// Driver.switchTo().f
		// sleep(3000);
		click(AdminPage.saveButton, "save button");

	}

	public void createProgram(Hashtable<String, String> data, String ProgramName) throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		click(AdminPage.Program, "Program link");
		sleep(2000);
		Driver.findElement(AdminPage.ProgramName).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		sleep(2000);
		Driver.findElement(AdminPage.ProgramName).sendKeys(Keys.DELETE);

		System.out.println("ProgramName is " + ProgramName);
		sleep(2000);
		Driver.findElement(AdminPage.ProgramName).sendKeys(ProgramName);
		sleep(2000);
		Driver.findElement(AdminPage.ProgramCode).sendKeys(data.get("Code"));
		// sleep(5000);
		clickUsingJavascriptExecutor(AdminPage.ProgramAdd, "add Icon");
		// sleep(3000);

	}

	public void verifyProgram(Hashtable<String, String> data, String ProgramName) throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		type(AdminPage.ProgramName, ProgramName, "Name field");
		sleep(4000);
		String topDisplayedRole = Driver.findElement(AdminPage.TopDisplayedProgram).getAttribute("value");
		assertTextStringMatching(ProgramName, topDisplayedRole);
		click(AdminPage.saveButton, "save button");

	}

	public void softDeleteProgram(Hashtable<String, String> data, String ProgramName) throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		type(AdminPage.ProgramName, ProgramName, "Name field");
		// sleep(4000);
		click(AdminPage.DeleteTopDisplayedProgram, "Delete button");
		click(AdminPage.saveButton, "save button");

	}

	public void configureSiteForProgramHardDelete(Hashtable<String, String> data, String ProgramName) throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		click(AdminPage.Sites, "Sites link");
		sleep(2000);
		click(AdminPage.SitesRuthGear, "Ruth Gear button");
		click(AdminPage.SitesRuthGearDetails, "Ruth Gear Details button");
		click(AdminPage.GearDetailsProgramDropDown, "DropDown");
		selectByVisibleText(AdminPage.GearDetailsProgramDropDown, ProgramName, ProgramName + "from drop down");
		sleep(2000);
		click(AdminPage.GearDetailsPrograSave, "add button");
		sleep(2000);
		click(AdminPage.IDGTeamDropSave, "Save button");
		click(AdminPage.saveButton, "Save button");

	}

	public void assignProgramToPatient(String ProgramName) throws Throwable {
		new AdminPage().Admin_Page();

		sleep(2000);
		selectByVisibleText(AdminPage.PatientDetailsProgram, ProgramName, ProgramName + "from drop down");

	}

	public void hardDeleteProgram(Hashtable<String, String> data, String ProgramName) throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		click(AdminPage.DownGridBar, "DownGrid Bar");
		sleep(2000);
		goToAdmin();
		click(AdminPage.Program, "Program link");
		sleep(2000);
		type(AdminPage.ProgramName, ProgramName, "Name field");
		// sleep(4000);
		String PopUpTexConfirmation = data.get("PopUpTexConfirmation");
		String PopUpTextDesc = data.get("PopUpTextDesc");
		System.out
				.println("PopUpTexConfirmation is-->" + PopUpTexConfirmation + "and PopUpTextDesc is" + PopUpTextDesc);
		click(AdminPage.DeleteTopDisplayedProgram, "Delete button");
		assertTextMatching(AdminPage.confirmDelete, PopUpTexConfirmation, "PopUpTexConfirmation");
		assertTextMatching(AdminPage.PopUpTextDesc, PopUpTextDesc, "PopUpTextDesc");

		// click(AdminPage.saveButton, "save button");

	}

	public void createReligion(Hashtable<String, String> data, String ReligionName) throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		click(AdminPage.Religion, "Religion link");
		sleep(2000);
		System.out.println("Religion is " + ReligionName);
		sleep(2000);
		// Driver.findElement(AdminPage.ReligionName).sendKeys(ReligionName);
		type(AdminPage.ReligionName, ReligionName, "Religion Name field");
		// sleep(5000);
		// clickUsingJavascriptExecutor(AdminPage.ReligionAdd, "add Icon");
		click(AdminPage.ReligionAdd, "Religion link");
		// sleep(3000);

	}

	public void verifyReligion(Hashtable<String, String> data, String ReligionName) throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		type(AdminPage.ReligionName, ReligionName, "Religion Name field");
		// sleep(4000);

		isElementPresent(AdminPage.TopDisplayedReligion, ReligionName, true);
		click(AdminPage.saveButton, "save button");

	}

	public void softDeleteReligion(Hashtable<String, String> data, String ReligionName) throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		type(AdminPage.ReligionName, ReligionName, "Religion Name field");
		// sleep(5000);
		click(AdminPage.DeleteTopDisplayedReligion, "Delete button");
		click(AdminPage.saveButton, "save button");

	}

	public void createAdjustmentReasons(Hashtable<String, String> data, String AdjustmentReasons) throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		click(AdminPage.AdjustmentReasons, "AdjustmentReasons link");
		sleep(2000);
		System.out.println("AdjustmentReasons Name is " + AdjustmentReasons);
		sleep(2000);
		type(AdminPage.ARShortDesc, AdjustmentReasons, "ShortDesc Name field");
		sleep(2000);
		type(AdminPage.ARSClaimAdjustmentReason, data.get("ClaimAdjustmentReason"), "Religion Name field");
		sleep(2000);
		type(AdminPage.ARSCode, data.get("Code"), "Religion Name field");
		// sleep(5000);
		// clickUsingJavascriptExecutor(AdminPage.ARAdd, "add Icon");
		click(AdminPage.ARAdd, "add Icon");
		// sleep(3000);

	}

	public void verifyAdjustmentReasons(String xpath, String AdjustmentReasons) throws Throwable {
		boolean flag = false;
		String text = null;
		sleep(2000);
		int count = Driver.findElements(By.xpath(xpath)).size();
		System.out.println("count is--->" + count);

		sleep(2000);
		try {

			for (int i = 4; i <= count - 2; i++) {
				sleep(2000);
				text = Driver.findElement(By.xpath(xpath + "[" + i + "]")).getAttribute("value");
				System.out.println("text is ---->" + text);
				if (text.equalsIgnoreCase(AdjustmentReasons)) {
					sleep(2000);
					flag = true;
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag)
				reporter.SuccessReport("Verify " + text, "Successfully found " + text);
			else
				reporter.failureReport("Verify " + text, text + "not found in list");
		}
	}

	public void editAdjustmentReasons(Hashtable<String, String> data, String AdjustmentReasons) throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		click(AdminPage.AdjustmentReasons, "AdjustmentReasons link");
		sleep(2000);
		Driver.findElement(AdminPage.ExistShortDescField).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Driver.findElement(AdminPage.ExistShortDescField).sendKeys(Keys.CLEAR);
		Driver.findElement(AdminPage.ExistShortDescField).sendKeys(AdjustmentReasons);
		// type(AdminPage.ExistShortDescField, AdjustmentReasons, "ShortDesc
		// field");
		sleep(2000);
		click(AdminPage.saveButton, "save Icon");
		// sleep(3000);

	}

	public void editAdjustmentReasons1(String EditAdjustmentReasons, String AdjustmentReasons, String xpath)
			throws Throwable {

		// sleep(4000);
		new AdminPage().Admin_Page();
		sleep(2000);

		String text = null;
		sleep(2000);
		int count = Driver.findElements(By.xpath(xpath)).size();
		System.out.println("count is--->" + count);

		sleep(2000);
		try {

			for (int i = 4; i <= count - 2; i++) {
				sleep(2000);
				text = Driver.findElement(By.xpath(xpath + "[" + i + "]")).getAttribute("value");
				System.out.println("text is ---->" + text);
				if (text.equalsIgnoreCase(AdjustmentReasons)) {
					sleep(2000);
					Driver.findElement(By.xpath(xpath + "[" + i + "]")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
					Driver.findElement(By.xpath(xpath + "[" + i + "]")).sendKeys(Keys.CLEAR);
					Driver.findElement(By.xpath(xpath + "[" + i + "]")).sendKeys(EditAdjustmentReasons);
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		click(AdminPage.saveButton, "save Icon");

	}

	public void createIGDTeams(String IDGTeams) throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		click(AdminPage.IDGTeams, "IDGTeams link");
		// sleep(4000);
		click(AdminPage.IDGTeamsAdd, "add Icon");
		// sleep(4000);
		System.out.println("IDGTeams Name is " + IDGTeams);
		type(AdminPage.IDGTeamName, IDGTeams, "Team Name field");
		sleep(2000);
	}

	public void dropAndDragIGDTeams(String agency, String xpath) throws Throwable {

		// sleep(4000);
		new AdminPage().Admin_Page();
		String text = null;
		int count = Driver.findElements(By.xpath(xpath)).size();
		System.out.println("count is--->" + count);
		sleep(2000);
		try {

			for (int i = 1; i <= count; i++) {
				sleep(2000);
				text = Driver.findElement(By.xpath(xpath + "[" + i + "]" + "/div")).getText();
				System.out.println("text is ---->" + text);
				if (text.equalsIgnoreCase(agency)) {
					sleep(2000);
					Actions act = new Actions(Driver);
					WebElement IDGTeamSource = Driver.findElement(By.xpath(xpath + "[" + i + "]"));
					WebElement IDGTeamDestination = Driver
							.findElement(By.xpath("(.//div[@class='dragdrop-dropTarget'])[3]"));
					act.dragAndDrop(IDGTeamSource, IDGTeamDestination).build().perform();
					// sleep(4000);
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		click(AdminPage.IDGTeamDropSave, "save Icon");
		// sleep(4000);
		click(AdminPage.saveButton, "save Icon");

	}

	public void verifydropAndDragIGDTeams(String IDGTeams, String agency, String xpath) throws Throwable {

		// sleep(4000);
		String text = null;

		new AdminPage().Admin_Page();
		click(AdminPage.IDGTeams, "IDGTeams link");
		sleep(2000);
		int count = Driver.findElements(By.xpath(xpath)).size();
		System.out.println("count is--->" + count);
		sleep(2000);
		try {

			for (int i = 3; i <= count; i++) {
				sleep(2000);
				text = Driver.findElement(By.xpath(xpath + "[" + i + "]")).getText();
				System.out.println("text is ---->" + text);
				if (text.equalsIgnoreCase(IDGTeams)) {
					sleep(2000);

					String IDGTeamVerifyName = Driver
							.findElement(By.xpath(
									xpath + "[" + i + "]" + "/parent::td/following-sibling::td[1]//*[text()='RUTH']"))
							.getText();
					assertTextStringMatching(agency, IDGTeamVerifyName);
					// sleep(4000);
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		click(AdminPage.saveButton, "save Icon");

	}

	// Navya

	public void gotoPhysicains(Hashtable<String, String> data) throws Throwable {
		new AdminPage().Admin_Page();
		click(AdminPage.Admin, "Admin");
		click(AdminPage.Physicians, "physician");
		// assertTextMatching(AdminPage.PhysiciansText,data.get("Physicians"),"PHYSICIANS");
		assertTextMatching(AdminPage.PhysiciansText, data.get("Physicians"), "PHYSICIANS");
		sleep(sleep);
		click(AdminPage.PhysicianModalSave, "Physician Close");
		sleep(sleep);
	}

	public void SearchRecord(Hashtable<String, String> data) throws Throwable {
		new AdminPage().Admin_Page();

		click(AdminPage.Admin, "Admin");
		click(AdminPage.Physicians, "physician");
		sleep(sleep);
		type(AdminPage.Searchfromtopfrom, data.get("FirstName"), "firstfield");
		sleep(sleep);
		assertTextMatching(AdminPage.SearchedText, data.get("FirstName"), "Physicians Text");
		sleep(sleep);
		click(AdminPage.PhysicianModalSave, "Physician Close");
		sleep(sleep);

	}

	public void gotoRoleAssignments(Hashtable<String, String> data) throws Throwable {
		new AdminPage().Admin_Page();
		click(AdminPage.Admin, "Admin");
		click(AdminPage.RoleandAssignments, "rolesAssignments");
		click(AdminPage.RoleAssignmentsGearIcon, "gearicon");
		click(AdminPage.Details, "Details");

		assertTextMatching(AdminPage.SiteText, data.get("Site"), "Site Heading");
		assertTextMatching(AdminPage.RolesText, data.get("Roles"), "Roles Heading");
		assertTextMatching(AdminPage.OfficesText, data.get("Offices"), "Offices Heading");
		click(AdminPage.SaveTickMark, "Save Roles Tab");
		sleep(sleep);
		click(AdminPage.RoleAssignmentsClose, "Role Assignments Close");
		sleep(sleep);

	}

	public void roleAssignmentsDrag(Hashtable<String, String> data) throws Throwable {
		new AdminPage().Admin_Page();
		click(AdminPage.Admin, "Admin");
		click(AdminPage.RoleandAssignments, "rolesAssignments");
		sleep(sleep);
		click(AdminPage.gearicon, "gearicon");
		click(AdminPage.Details, "Details");
		Actions act = new Actions(Driver);
		if (isVisible(AdminPage.AssignedTabEast, "Ruth-2 In Available Options")) {
			act.dragAndDrop(Driver.findElement(AdminPage.AssignedTabEast),
					Driver.findElement(AdminPage.OfficesAvailable)).build().perform();
			sleep(sleep);
		}

		WebElement drag = Driver.findElement(AdminPage.OfficesDrag);
		WebElement drop = Driver.findElement(AdminPage.OfficesDrop);
		act.dragAndDrop(drag, drop).build().perform();
		sleep(sleep);
		click(AdminPage.SaveTickMark, "Save Roles Tab");
		sleep(sleep);
		isElementPresent(AdminPage.AssignedOfficesTab, "Ruth-2 Option", true);
		sleep(sleep);
		click(AdminPage.RoleAssignmentsClose, "Role Assignments Close");
		sleep(sleep);

	}

	// 47
	public void gotoFacilities(Hashtable<String, String> data) throws Throwable {
		String Facility = data.get("Facility") + Integer.toString(generateRandonNumber());

		new AdminPage().Admin_Page();
		click(AdminPage.Admin, "Admin");
		click(AdminPage.Facilities, "Facilities");
		sleep(sleep);
		type(AdminPage.FacilityTab, Facility, "Enter Facility ");
		selectByValue(AdminPage.FacilityTypeTab, data.get("FacilityType"), "Facility Type");
		sleep(sleep);
		click(AdminPage.FacilityAdd, "Facility Add");
		sleep(sleep);
		click(AdminPage.FacilityModelSave, "Facility Save");
		sleep(sleep);
		type(AdminPage.FacilityTab, Facility, "Enter Facility ");
		sleep(sleep);
		isElementPresent(AdminPage.FacilityAssert, "Facility Record", true);
		sleep(sleep);
		click(AdminPage.FacilityClose, "Facility Close");
		sleep(sleep);

	}

	public void gotoChurches(Hashtable<String, String> data) throws Throwable {
		new AdminPage().Admin_Page();
		Church = data.get("Churches") + Integer.toString(generateRandonNumber());
		click(AdminPage.Admin, "Admin");
		click(AdminPage.Churches, "Churches");
		// sleep(5000);
		type(AdminPage.ChurchTab, Church, "Enter Churches");
		selectByValue(AdminPage.ReligionTab, data.get("Religion"), "Religion");
		sleep(sleep);
		type(AdminPage.AddressTab, data.get("Address"), "Enter Address");
		sleep(sleep);
		type(AdminPage.ContactTab, data.get("Contact"), "Enter Contact");
		click(AdminPage.ChurchAddIcon, "Click Save icon");
		type(AdminPage.ChurchTab, Church, "Enter Churches");
		isElementPresent(AdminPage.ChurchSearch, "Church Name", true);
		sleep(sleep);
		click(AdminPage.ChurchClose, "Close Church Model popup");
		sleep(sleep);

	}

	public void modifyChurches(Hashtable<String, String> data) throws Throwable {
		new AdminPage().Admin_Page();
		Church = data.get("Churches") + Integer.toString(generateRandonNumber());
		click(AdminPage.Admin, "Admin");
		click(AdminPage.Churches, "Churches");
		// sleep(5000);
		type(AdminPage.ChurchTab, Church, "Enter Churches");
		selectByValue(AdminPage.ReligionTab, data.get("Religion"), "Religion");
		sleep(sleep);
		type(AdminPage.AddressTab, data.get("Address"), "Enter Address");
		sleep(sleep);
		type(AdminPage.ContactTab, data.get("Contact"), "Enter Contact");
		click(AdminPage.ChurchAddIcon, "Click Save icon");
		type(AdminPage.ChurchTab, Church, "Enter Churches");
		isElementPresent(AdminPage.ChurchSearch, "Church Name", true);
		sleep(sleep);
		click(AdminPage.gearicon, "gearicon");
		click(AdminPage.Details, "Details");
		sleep(sleep);
		type(AdminPage.ChurchPhoneNumberUpdate, data.get("PhoneNumber"), "Church Phone Number Update");
		sleep(sleep);
		// type(AdminPage.ChurchAddressUpdate, data.get("Address"), "Church
		// Address Update");
		click(AdminPage.SaveTickMark, "Save Chruch Update");
		sleep(sleep);
		type(AdminPage.ChurchTab, Church, "Enter Churches");
		sleep(sleep);
		String text = Driver.findElement(AdminPage.ChurchPhoneNumberAssert).getAttribute("value");
		assertTextStringMatching(text, data.get("PhoneNumber"));
		sleep(sleep);
		click(AdminPage.ChurchClose, "Close Church Model popup");
		sleep(sleep);
	}

	// 75
	public void gotoHospiceElection(Hashtable<String, String> data) throws Throwable {
		new AdminPage().Admin_Page();
		HospiceDesc = data.get("HospiceDescription") + Integer.toString(generateRandonNumber());
		click(AdminPage.Admin, "Admin");
		click(AdminPage.HospiceElection, "HospiceElection");
		sleep(sleep);
		type(AdminPage.HospiceDescription, HospiceDesc, "HospiceDescription");
		selectByValue(AdminPage.HospiceElectionPeriod, data.get("HospiceElection"), "HospiceElection Period");
		sleep(sleep);
		click(AdminPage.HospiceSaveIcon, "Click Save icon");
		sleep(sleep);
		type(AdminPage.HospiceDescription, HospiceDesc, "HospiceDescription");
		// isElementPresent(AdminPage.HospiceSearch, "Hospice Name", true);

		ArrayList<WebElement> Username = (ArrayList<WebElement>) Driver
				.findElements(By.xpath("//input[@id='gwt-debug-description']"));
		boolean flag = false;
		String text = null;

		try {

			for (int i = 1; i <= Username.size(); i++) {

				text = Driver.findElement(By.xpath("(//input[@id='gwt-debug-description'])[" + i + "]"))
						.getAttribute("value");
				System.out.println("text is ---->" + text);
				if (text.equalsIgnoreCase(HospiceDesc)) {
					flag = true;
					break;
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag)
				reporter.SuccessReport("Verify " + text, "Successfully found " + text);

			else
				reporter.failureReport("Verify " + text, text + "not found in list");
		}
		sleep(sleep);
		click(AdminPage.HospiceClose, "Hospice Close");
		sleep(sleep);
	}

	// 76
	public void modifyHospiceElection(Hashtable<String, String> data) throws Throwable {
		new AdminPage().Admin_Page();
		click(AdminPage.Admin, "Admin");
		click(AdminPage.HospiceElection, "HospiceElection");
		sleep(sleep);
		// type(AdminPage.HospiceDescription,HospiceDesc, "Enter Churches");
		// sleep(sleep);
		click(AdminPage.Hospicegearicon, "Hospicegearicon");
		click(AdminPage.HospiceDetails, "HospiceDetails");
		sleep(sleep);
		if (Driver.findElement(AdminPage.HospiceAutoCertified).isSelected()) {
			click(AdminPage.HospiceAutoCertified, "HospiceAutoCertified");
		}
		click(AdminPage.HospiceAutoCertified, "HospiceAutoCertified");
		click(AdminPage.SaveTickMark, "Save Hospice Update");
		Boolean AutoCertified = Driver.findElement(By.xpath("(//*[@id='gwt-debug-autoCertified-input'])[2]"))
				.isSelected();
		System.out.println("Hospice Auto Certified checkbox is" + AutoCertified);
		assertTrue(AutoCertified, "Hospice Auto Certified Checkbox");
		sleep(sleep);
		click(AdminPage.HospiceClose, "Hospice Close");
		sleep(sleep);

	}

	// 77
	public void addInsurance(Hashtable<String, String> data) throws Throwable {

		new AdminPage().Admin_Page();
		InsuranceName = data.get("InsuranceName") + Integer.toString(generateRandonNumber());
		click(AdminPage.Admin, "Admin");
		click(AdminPage.InsuranceCarriers, "Insurance Carriers");
		sleep(sleep);
		assertTextMatching(AdminPage.InsuranceCarriersHeading, data.get("InsuranceCarrier"),
				"Insurance Carriers Heading");
		click(AdminPage.InsurancePrayerType, "Insurance Prayer Type");
		sleep(sleep);
		click(AdminPage.InsurancePrayerTypeOption, "Insurance Prayer Type Option");
		sleep(sleep);
		type(AdminPage.InsuranceName, InsuranceName, "Insurance Name");
		type(AdminPage.InsuranceContact, data.get("InsuranceAddress"), "Insurance Contact");
		type(AdminPage.InsurancePhone, data.get("InsurancePhone"), "Insurance Phone");
		click(AdminPage.InsuranceAdd, "Add Insurance Details");
		sleep(sleep);
		click(AdminPage.InsuranceModalSave, "Insurance Model Save");
		sleep(sleep);
		/*
		 * type(AdminPage.InsuranceName, InsuranceName , "Insurance Name");
		 * assertTextMatching(AdminPage.InsuranceAssertName, InsuranceName,
		 * "Insurance Name"); click(AdminPage.InsuranceSave,
		 * "Insurance Tick Box");
		 */
		click(AdminPage.InsuranceSave, "Insurance Tick Box");
		sleep(sleep);
	}

	// 78
	public void addInsuranceSearch(Hashtable<String, String> data) throws Throwable {
		new AdminPage().Admin_Page();
		click(AdminPage.Admin, "Admin");
		click(AdminPage.InsuranceCarriers, "Insurance Carriers");
		// sleep(5000);
		type(AdminPage.InsuranceName, InsuranceName, "Insurance Name");
		assertTextMatching(AdminPage.InsuranceAssertName, InsuranceName, "Insurance Name");
		click(AdminPage.InsuranceSave, "Insurance Tick Box");
		sleep(sleep);

	}

	// 79
	public void updateInsurance(Hashtable<String, String> data) throws Throwable {
		new AdminPage().Admin_Page();
		click(AdminPage.Admin, "Admin");
		click(AdminPage.InsuranceCarriers, "Insurance Carriers");
		sleep(sleep);
		type(AdminPage.InsuranceName, InsuranceName, "Insurance Name");
		assertTextMatching(AdminPage.InsuranceAssertName, InsuranceName, "Insurance Name");
		click(AdminPage.InsurancecarriersGearIcon, "Insurance Carrier Gear Icon");
		click(AdminPage.InsuranceGearDetails, "Details link");
		sleep(sleep);
		selectByValue(AdminPage.InsurancePhoneModelBoxType, data.get("PhoneType"), "Insurance Carrier Phone Type");
		type(AdminPage.InsurancePhoneModelBox, data.get("PhoneNumber"), "Insurance Carrier Phone Number");
		click(AdminPage.InsuranceModalSave, "Insurance Model Save");
		sleep(sleep);
		// type(AdminPage.InsuranceName, InsuranceName , "Insurance Name");
		String text = Driver.findElement(By.xpath("(//table[@id='gwt-debug-phones']//input)[2]")).getAttribute("value");
		assertTextStringMatching(text, data.get("PhoneNumber"));
		sleep(sleep);
		click(AdminPage.InsuranceSave, "Insurance Model Save");
		sleep(sleep);
	}

	// 80
	public void addMedicareIntermediaries(Hashtable<String, String> data) throws Throwable {

		new AdminPage().Admin_Page();
		click(AdminPage.Admin, "Admin");
		click(AdminPage.MedicareIntermediaries, "Medicare Intermediaries");
		sleep(sleep);
		// selectByIndex(AdminPage.MedicareIntermediary, 1, "Medicare
		// Intermediary");
		ArrayList<WebElement> DDEUsername = (ArrayList<WebElement>) Driver
				.findElements(By.xpath("//input[@id='gwt-debug-username']"));
		if (DDEUsername.size() > 2) {
			ArrayList<WebElement> DDEDel = (ArrayList<WebElement>) Driver.findElements(
					By.xpath("//div[contains(@class,'gwt-PopupPanel')]//img[@class='hb-mouse-over-clickable']"));
			for (int i = 2; i <= DDEDel.size(); i++) {
				Driver.findElement(
						By.xpath("(//div[contains(@class,'gwt-PopupPanel')]//img[@class='hb-mouse-over-clickable'])"
								+ "[" + i + "]"))
						.click();
				sleep(sleep);
			}

		}
		// sleep(5000);
		click(AdminPage.MedicareIntermediary, "Medicare Intermediary");
		sleep(sleep);
		click(AdminPage.MedicareIntermediaryOption, "Medicare Intermediary Option");
		sleep(sleep);
		type(AdminPage.DDEusername, data.get("username"), "DDE Username");
		Driver.findElement(AdminPage.DDEPassword).clear();
		type(AdminPage.DDEPassword, data.get("password"), "DDE Password");
		sleep(sleep);
		type(AdminPage.DDEPasswordConfirm, data.get("password"), "DDE Confirm Password");
		click(AdminPage.MedicareAddIcon, "Medicare Add Icon");
		sleep(sleep);
		ArrayList<WebElement> Username = (ArrayList<WebElement>) Driver
				.findElements(By.xpath("//input[@id='gwt-debug-username']"));
		boolean flag = false;
		String text = null;

		try {

			for (int i = 1; i <= Username.size(); i++) {

				text = Driver.findElement(By.xpath("(//input[@id='gwt-debug-username'])[" + i + "]"))
						.getAttribute("value");
				System.out.println("text is ---->" + text);
				if (text.equalsIgnoreCase(data.get("username"))) {
					flag = true;
					break;
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag)
				reporter.SuccessReport("Verify " + text, "Successfully found " + text);

			else
				reporter.failureReport("Verify " + text, text + "not found in list");
		}
		sleep(sleep);
		click(AdminPage.MedicareSave, "Medicare Model Save");
		sleep(sleep);
	}

	// 81
	public void deleteMedicareIntermediaries(Hashtable<String, String> data) throws Throwable {

		new AdminPage().Admin_Page();
		click(AdminPage.Admin, "Admin");
		click(AdminPage.MedicareIntermediaries, "Medicare Intermediaries");
		// sleep(5000);
		click(AdminPage.MediacareIntermediaryOptionDelete, "Delete Medicare Intermediary");
		sleep(sleep);

		ArrayList<WebElement> Username = (ArrayList<WebElement>) Driver
				.findElements(By.xpath("//input[@id='gwt-debug-username']"));
		boolean flag = true;
		String text = null;

		try {

			for (int i = 1; i <= Username.size(); i++) {

				text = Driver.findElement(By.xpath("(//input[@id='gwt-debug-username'])[" + i + "]"))
						.getAttribute("value");
				System.out.println("text is ---->" + text);
				if (text.equalsIgnoreCase(data.get("username"))) {
					flag = false;
					break;
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (!flag)
				reporter.failureReport("Verify " + data.get("username"), "Successfully found " + data.get("username"));

			else
				reporter.SuccessReport("Verify " + data.get("username"), data.get("username") + "not found in list");
		}
		sleep(sleep);
		click(AdminPage.MedicareSave, "Medicare Model Save");
		sleep(sleep);
	}

	// 82
	public void mediacarePasswordValidation(Hashtable<String, String> data) throws Throwable {

		new AdminPage().Admin_Page();
		click(AdminPage.Admin, "Admin");
		click(AdminPage.MedicareIntermediaries, "Medicare Intermediaries");
		sleep(sleep);
		click(AdminPage.MedicareIntermediary, "Medicare Intermediary");
		click(AdminPage.MedicareIntermediaryOption, "Medicare Intermediary Option");
		type(AdminPage.DDEusername, data.get("username"), "DDE Username");
		Driver.findElement(AdminPage.DDEPassword).clear();
		type(AdminPage.DDEPassword, data.get("password"), "DDE Password");
		sleep(sleep);
		type(AdminPage.DDEPasswordConfirm, data.get("confirmPassword"), "DDE Confirm Password");
		isElementPresent(AdminPage.MedicareAddIcon, "Medicare Add Icon", false);
		sleep(sleep);
		click(AdminPage.MedicareSave, "Medicare Model Save");
		sleep(sleep);
	}

	// 83

	public void addPhysicianServices(Hashtable<String, String> data) throws Throwable {

		new AdminPage().Admin_Page();
		String rate = Integer.toString(generateRandonNumber());
		click(AdminPage.Admin, "Admin");
		click(AdminPage.PhysicianServices, "Physician Services");
		// sleep(5000);
		if (Driver.findElement(AdminPage.PhysicianRecordDelete).isDisplayed()) {

			Driver.findElement(AdminPage.PhysicianRecordDelete).click();
			sleep(sleep);

		}
		sleep(sleep);
		selectByValue(AdminPage.PhysicianServicesMonth, "2", "Physician Services Month");
		selectByValue(AdminPage.PhysicianServicesDay, "20", "Physician Services Day");
		selectByValue(AdminPage.PhysicianServicesYear, "2015", "Physician Services Year");
		// sleep(5000);
		click(AdminPage.PhysicianServicesHCPCS, "Physician HPCS");
		sleep(sleep);
		// type(AdminPage.PhysicianServicesHCPCS,data.get("hcpcs"),"HCPCS
		// Option");
		click(AdminPage.PhysicianHCPCSOption, "Physician HCPCS Option");
		// type(AdminPage.PhysicianShortDesc, data.get("shortDesc"), "Physician
		// Short Description");
		// type(AdminPage.PhysicianLongDesc, data.get("longDesc"), "Physician
		// Long Description");
		sleep(sleep);
		selectByValue(AdminPage.PhysicianServicesPgms, data.get("pgms"), "Physician Programs");
		// click(AdminPage.PhysicianServicesPgms, "Physician Programs");
		// click(AdminPage.P)
		type(AdminPage.PhysicianServicesRate, rate, "Physician Rate");
		click(AdminPage.PhysicianServicesAdd, "Physician Record Add");
		sleep(sleep);

		click(AdminPage.PhysicianSave, "Save Physician Records");
		sleep(sleep);
	}

	// 84

	public void updatePhysicianServices(Hashtable<String, String> data) throws Throwable {

		new AdminPage().Admin_Page();
		// String rate = Integer.toString(generateRandonNumber());
		click(AdminPage.Admin, "Admin");
		click(AdminPage.PhysicianServices, "Physician Services");
		// sleep(5000);
		selectByIndex(AdminPage.PhysicianpgmUpdate, 2, "Update Physician Program for a Record");
		// sleep(5000);
		// assertInputText("//select[@class='hb-textbox']", data.get("pgms"));
		sleep(sleep);
		click(AdminPage.PhysicianSave, "Save Physician Records");
		sleep(sleep);
	}

	// 85

	public void addroomAndBorardRateTiers(Hashtable<String, String> data) throws Throwable {
		new AdminPage().Admin_Page();
		GroupName = data.get("group") + Integer.toString(generateRandonNumber());
		String TierName = data.get("tier") + Integer.toString(generateRandonNumber());
		click(AdminPage.Admin, "Admin");
		click(AdminPage.RoomBoardTiers, "Room & Board Rate Tiers");
		sleep(sleep);
		type(AdminPage.RatesDetailsGroup, GroupName, "Group Field in Rate Details");
		sleep(sleep);
		type(AdminPage.RatesDetailsTierName, TierName, "Tier Name in Rate Details");
		type(AdminPage.RatesDetailsRate, Integer.toString(generateRandonNumber()), "Rate in Rate Details");
		selectByValue(AdminPage.RatesDetailsMonth, "1", "Rate Details Month");
		selectByValue(AdminPage.RatesDetailsDay, "20", "Rate Details Day");
		selectByValue(AdminPage.RatesDetailsYear, "2015", "Rate Details Year");
		sleep(sleep);
		click(AdminPage.RatesDetailsAdd, "Add Record in Rate Details");
		type(AdminPage.RatesDetailsGroup, GroupName, "Group Field in Rate Details");
		isElementPresent(AdminPage.RateDetailsRecordAssert, "Rate Details Record", true);
		sleep(sleep);
		for (int i = 0; i < 3; i++) {
			String TierName_random = data.get("tier") + Integer.toString(generateRandonNumber());
			type(AdminPage.RatesDetailsGroup, GroupName, "Group Field in Rate Details");
			sleep(sleep);
			type(AdminPage.RatesDetailsTierName, TierName_random, "Tier Name in Rate Details");
			click(AdminPage.RatesDetailsAdd, "Add Record in Rate Details");
			// sleep(1000);
			assertInputText("//input[@id='gwt-debug-name']", TierName_random);
		}

		type(AdminPage.RatesDetailsGroup, GroupName, "Group Field in Rate Details");
		for (int i = 2; i <= 4; i++) {
			String rate = Integer.toString(generateRandonNumber());
			sleep(sleep);
			// type(AdminPage.RatesDetailsGroup, GroupName , "Group Field in
			// Rate Details");
			sleep(sleep);
			type(By.xpath("(//td[@class='rate-editor-amount']/input)" + "[" + i + "]"), rate, "Rate in Rate Details");
			sleep(sleep);
			assertInputText("//td[@class='rate-editor-amount']/input", rate);
		}
		click(AdminPage.RatesDetailsSave, "Rates Details Save");

	}

	// 86
	public void deleteroomAndBorardRateTiers(Hashtable<String, String> data) throws Throwable {
		GroupName = data.get("group") + Integer.toString(generateRandonNumber());
		String TierName = data.get("tier") + Integer.toString(generateRandonNumber());

		new AdminPage().Admin_Page();
		click(AdminPage.Admin, "Admin");
		click(AdminPage.RoomBoardTiers, "Room & Board Rate Tiers");
		sleep(sleep);
		type(AdminPage.RatesDetailsGroup, GroupName, "Group Field in Rate Details");
		sleep(sleep);
		type(AdminPage.RatesDetailsTierName, TierName, "Tier Name in Rate Details");
		sleep(sleep);
		click(AdminPage.RatesDetailsAdd, "Add Record in Rate Details");
		sleep(sleep);
		type(AdminPage.RatesDetailsGroup, GroupName, "Group Field in Rate Details");
		sleep(sleep);
		click(AdminPage.RateDetailRecordDelete, "Delete Rate Detail Record");
		sleep(sleep);
		click(AdminPage.RateDetailRecordDeleteConfirm, "Confirm Delete Record");
		type(AdminPage.RatesDetailsGroup, GroupName, "Group Field in Rate Details");
		isElementPresent(AdminPage.RateDetailsRecordAssert, "Rate Details Record", false);

	}

	public void selectAgency(String Agency) throws Throwable {

		new HomePage().Home_Page();
		click(HomePage.AgencyType, "login Type");

		if (Agency.equalsIgnoreCase("RUTH")) {
			click(HomePage.AgencyAccountType, Agency);
		}
		sleep(sleep);
	}

	public void assertInputText(String xpath, String asserttext) throws Throwable {

		ArrayList<WebElement> Username = (ArrayList<WebElement>) Driver.findElements(By.xpath(xpath));
		boolean flag = false;
		String text = null;

		try {

			for (int i = 1; i <= Username.size(); i++) {

				text = Driver.findElement(By.xpath("(" + xpath + ")" + "[" + i + "]")).getAttribute("value");
				System.out.println("text is ---->" + text);
				if (text.equalsIgnoreCase(asserttext)) {
					flag = true;
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag)
				reporter.SuccessReport("Verify " + text, "Successfully found " + text);

			else
				reporter.failureReport("Verify " + text, text + "not found in list");
		}
	}
	// 24-02-2016

	public void createPatientInfo(String patientFirstName, String patientLastName) throws Throwable {
		new AdminPage().Admin_Page();

		click(AdminPage.DownGridBar, "DownGrid Bar");

		click(AdminPage.patientInfoIcon, "patient Info Icon");
		Thread.sleep(sleep);
		type(AdminPage.patientFirstName, patientFirstName, "first name field");
		type(AdminPage.patientLastName, patientLastName, "Lastname field");
		click(AdminPage.PatientAdd, "add button");

	}

	public void verifyconfigurationRequiredFields(Hashtable<String, String> data, String patientFirstName,
			String patientLastName) throws Throwable {
		new AdminPage().Admin_Page();
		click(AdminPage.RequiredFields, "RequiredFields");
		sleep(sleep);
		selectByVisibleText(AdminPage.RequiredFieldsAddressCriteria, data.get("AddressCriteria"),
				"All Patients from drop down");
		sleep(sleep);
		click(AdminPage.saveButton, "saveButton");
		createPatientInfo(patientFirstName, patientLastName);

		String color = Driver.findElement(By.xpath(".//*[text()='Address:']")).getCssValue("color");
		String[] hexValue = color.replace("rgba(", "").replace(")", "").split(",");

		int hexValue1 = Integer.parseInt(hexValue[0]);
		hexValue[1] = hexValue[1].trim();
		int hexValue2 = Integer.parseInt(hexValue[1]);
		hexValue[2] = hexValue[2].trim();
		int hexValue3 = Integer.parseInt(hexValue[2]);

		String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
		System.out.println("actualColor is-->" + actualColor);
		if (actualColor.equalsIgnoreCase("#c95858"))
			reporter.SuccessReport("Verify color: ", "Red Color found successfully.");
		else
			reporter.failureReport("Verify color: ", "Red Color not found.", WebDriver);

	}

	/**
	 * This method is to create a new Hospice agency
	 *
	 * @return nothing will be returned
	 */
	public void createHospiceAgencies(Hashtable<String, String> data, String hospiceName, String TenantID)
			throws Throwable {
		new AdminPage().Admin_Page();
		click(AdminPage.hospiceAgencies, "Hospice Agencies");
		sleep(sleep);
		selectByVisibleText(AdminPage.hospiceAgenciesMonth, data.get("Month"), "Selecting month from the date picker");
		sleep(sleep);
		selectByVisibleText(AdminPage.hospiceAgenciesDay, data.get("Day"), "Selecting day from the date picker");
		sleep(sleep);
		selectByVisibleText(AdminPage.hospiceAgenciesYear, data.get("Year"), "Selecting year from the date picker");
		sleep(sleep);
		type(AdminPage.hospiceName, hospiceName, "Name of the Hospice agency");
		sleep(sleep);
		type(AdminPage.hospiceNickname, data.get("Nickname"), "Nickname of the Hospice agency");
		sleep(sleep);
		type(AdminPage.hospiceTenantID, TenantID, "TenantID of the Hospice agency");
		sleep(sleep);
		if (data.get("HospiceSensitive").equalsIgnoreCase("Y")) {
			click(AdminPage.hospiceSensitiveCheckbox, "Sensitive checkbox");
		}
		click(AdminPage.hospiceAdd, "Add button");
		sleep(sleep);
		click(AdminPage.hospiceSave, "Save button");

	}

	/**
	 * This method is to create a new Hospice agency
	 *
	 * @return nothing will be returned
	 */
	public void addNewLanguage(String langName) throws Throwable {
		new AdminPage().Admin_Page();
		click(AdminPage.language, "Language");
		type(AdminPage.languageName, langName, "Name of the language");
		sleep(sleep);
		click(AdminPage.languageAdd, "Add button");
		sleep(sleep);
		click(AdminPage.languageSave, "Save button");

	}

	/**
	 * This method is to verify that given language exist or not
	 *
	 * @return nothing will be returned
	 */
	public void verifyLanguage(String langName) throws Throwable {
		sleep(2000);
		new AdminPage().Admin_Page();
		click(AdminPage.language, "Language");
		type(AdminPage.languageName, langName, "Language Name field");
		sleep(4000);
		isElementPresent(AdminPage.languagesList, langName, true);
		click(AdminPage.languageSave, "save button");

	}

	/**
	 * This method is to delete the given language
	 *
	 * @return nothing will be returned
	 */
	public void deleteLanguage(String langName) throws Throwable {
		sleep(2000);
		new AdminPage().Admin_Page();
		click(AdminPage.language, "Language");
		type(AdminPage.languageName, langName, "Language Name field");
		sleep(4000);
		isElementPresent(AdminPage.languagesList, langName, true);
		click(AdminPage.deleteLanguage, "Delete the selected language");
		if (Driver.findElement(AdminPage.langDeleteConfirmation).isDisplayed()
				&& Driver.findElement(AdminPage.deleteLanguageCancel).isDisplayed()
				&& Driver.findElement(AdminPage.deleteLanguageOK).isDisplayed()) {
			click(AdminPage.deleteLanguageCancel, "Cancel in the delete confirmation email");
		}
		click(AdminPage.languageSave, "save button");
	}

	public void createNewPerson(Hashtable<String, String> data, String personName) throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		click(AdminPage.Persons, "Persons link");
		sleep(4000);
		type(AdminPage.PersonsFirstName, personName, "Persons FirstName field");
		sleep(3000);
		type(AdminPage.PersonsLastName, data.get("PersonsLastName"), "Persons lastName field");
		sleep(3000);
		selectByVisibleText(AdminPage.PersonsRole, data.get("PersonsRole"), "Business from drop down");
		sleep(3000);
		click(AdminPage.ARAdd, "add Icon");
		sleep(10000);
		click(AdminPage.HummingBirdRadio, "Hummingbird Yes radio button");
		sleep(2000);
		selectByVisibleText(AdminPage.UserTypeDropdown, data.get("UserType"), "Select User type from the drop down");
		click(AdminPage.HospiceEmployeeradio, "Hospice Employee radio button");
		sleep(2000);
		selectByVisibleText(AdminPage.EmployeeTypeDropdown, data.get("EmployeeType"),
				"Select Employee type from the drop down");
		selectByVisibleText(AdminPage.StartMonth, data.get("month"), "Select Month from the drop down");
		selectByVisibleText(AdminPage.StartDate, data.get("day"), "Select Day from the drop down");
		selectByVisibleText(AdminPage.StartYear, data.get("year"), "Select Year from the drop down");
		type(AdminPage.EmailID, data.get("EmailId"), "Enter Email id");
		sleep(3000);
		click(AdminPage.PasswordButton, "Password Button");
		sleep(3000);
		click(AdminPage.OKButton, "OK button");
		click(AdminPage.TickMark, "Tick Mark");
		// click(AdminPage.SaveAndExitButton, "Save and Exit Button");
		sleep(10000);
	}

	public void verifyEmail(Hashtable<String, String> data) throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) Driver;
		js.executeScript("window.open('https://mail.mumms.com/webmail/login2/','_blank');");
		ArrayList<String> windows = new ArrayList<String>(Driver.getWindowHandles());
		Driver.switchTo().window(windows.get(1));
		sleep(6000);

		WebElement user = Driver.findElement(By.xpath("//*[@id='username']"));

		if (user.isDisplayed() == true) {
			js.executeScript("arguments[0].value='" + data.get("UserName") + "';", user);
			reporter.SuccessReport("Enter the user name", "User name is successfully entered");
		} else {
			reporter.failureReport("Enter the user name", "User name is not entered");
		}

		WebElement pwd = Driver.findElement(By.xpath("//*[@id='password']"));
		if (pwd.isDisplayed() == true) {
			js.executeScript("arguments[0].value='" + data.get("Password") + "';", pwd);
			reporter.SuccessReport("Enter the password", "Password is successfully entered");
		} else {
			reporter.failureReport("Enter the password", "Password is not entered");
		}

		WebElement Btn = Driver.findElement(By.xpath("//*[@id='login-button']"));
		if (Btn.isDisplayed() == true) {
			js.executeScript("arguments[0].click();", Btn);
			sleep(6000);
			reporter.SuccessReport("Click on Login Button", "Login Button is successfully clicked");
		} else {
			reporter.failureReport("Click on Login Button", "Login Button is not clicked");
		}

		WebElement email = Driver
				.findElement(By.xpath("//*[@class='x-grid-cell-inner x-unselectable']//div[@class='from']/span"));
		String fromtext = email.getText();
		if (fromtext.equalsIgnoreCase("jira-hbs@mumms.com")) {
			System.out.println("Selected correct email id");
			reporter.SuccessReport("Select and open the email", "Email is successfully opened");
		} else {
			reporter.failureReport("Select and open the email", "Correct email is not opened");
		}

		WebElement tmp = Driver.findElement(By.xpath("//div[@class='mcnt']/div/div/p[4]/strong[2]"));
		if (tmp.isDisplayed() == true) {
			System.out.println(tmp.getText());
			reporter.SuccessReport("Retrieve the temporary password", "Temporary password is successfully retrieved");
		} else {
			reporter.failureReport("Retrieve the temporary password", "Temporary password is not retrieved");
		}

		String text = tmp.getText();

		WebElement CnfrmBtn = Driver.findElement(
				By.xpath("//*[@class='mcnt']/div/div//*[text()='click here']/parent::p/following-sibling::p/a"));
		if (CnfrmBtn.isDisplayed() == true) {
			js.executeScript("arguments[0].click();", CnfrmBtn);
			sleep(2000);
			reporter.SuccessReport("Click on Confirm your Account Button",
					"Confirm your Account Button is successfully clicked");
		} else {
			reporter.failureReport("Click on Confirm your Account Button",
					"Confirm your Account Button is not clicked");
		}

		sleep(10000);
		ArrayList<String> tabs = new ArrayList<String>(Driver.getWindowHandles());
		Driver.switchTo().window(tabs.get(2));

		WebElement tmppwd = Driver
				.findElement(By.xpath("//div[text()='Temporary Password:']/parent::td/following-sibling::td/input"));
		if (tmppwd.isDisplayed() == true) {
			js.executeScript("arguments[0].value='" + text + "';", tmppwd);
			sleep(4000);
			reporter.SuccessReport("Enter the temporary password", "Temporary password is successfully entered");
		} else {
			reporter.failureReport("Enter the temporary password", "Temporary password is not entered");
		}

		WebElement newpwd = Driver
				.findElement(By.xpath("//div[text()='New Password:']/parent::td/following-sibling::td/input"));
		if (tmppwd.isDisplayed() == true) {
			js.executeScript("arguments[0].value='" + data.get("NewPassword") + "';", newpwd);
			sleep(5000);
			reporter.SuccessReport("Enter the New password", "New password is successfully entered");
		} else {
			reporter.failureReport("Enter the New password", "New password is not entered");
		}

		WebElement rptpwd = Driver
				.findElement(By.xpath("//div[text()='Repeat Password:']/parent::td/following-sibling::td/input"));
		if (rptpwd.isDisplayed() == true) {
			js.executeScript("arguments[0].value='" + data.get("RepeatPassword") + "';", rptpwd);
			sleep(5000);
			reporter.SuccessReport("Enter the Repeat password", "Repeat password is successfully entered");
		} else {
			reporter.failureReport("Enter the Repeat password", "Repeat password is not entered");
		}

		WebElement HummingbirdBtn = Driver.findElement(By.xpath("//button[text()='LOGIN TO HUMMINGBIRD']"));
		if (HummingbirdBtn.isDisplayed() == true) {
			js.executeScript("arguments[0].click();", HummingbirdBtn);
			sleep(5000);
			reporter.SuccessReport("Click on Hummingbird button", "Hummingbird button is successfully clicked");
		} else {
			reporter.failureReport("Click on Hummingbird button", "Hummingbird button is not clicked");
		}

		Driver.close();

	}

	public void deleteEmail() throws Throwable {

		sleep(3000);
		ArrayList<String> tabs = new ArrayList<String>(Driver.getWindowHandles());
		Driver.switchTo().window(tabs.get(1));

		JavascriptExecutor myExecutor = ((JavascriptExecutor) Driver);
		WebElement DeleteBtn = Driver.findElement(By.xpath("//*[@id='webmailbutton-1177-btn']"));
		if (DeleteBtn.isDisplayed() == true) {
			myExecutor.executeScript("arguments[0].click();", DeleteBtn);
			sleep(2000);
			reporter.SuccessReport("Click on Delete button", "Delete button is successfully clicked");
		} else {
			reporter.failureReport("Click on Delete button", "Delete button is not clicked");
		}

	}

	/**
	 * This method is to delete the given language
	 *
	 * @return nothing will be returned
	 */
	public void addWidgets() throws Throwable {
		sleep(2000);
		new AdminPage().Admin_Page();
		click(AdminPage.verticalRightBar, "vertical right bar");
		Actions act = new Actions(Driver);
		WebElement PatientsbyPayer = Driver.findElement(By.xpath("//div[@class='hb-widget-container']/div[6]/img"));
		WebElement Destination = Driver.findElement(By.xpath("//div[@class='GKGO0M2BPK']"));
		act.dragAndDrop(PatientsbyPayer, Destination).build().perform();
		long start = System.currentTimeMillis();
		WebDriverWait wait = new WebDriverWait(Driver, 100);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(AdminPage.loadingText));
		long stop = System.currentTimeMillis();
		float timeTaken = (stop - start) / 1000;
		reporter.SuccessReport("Took", timeTaken + " secs to load the widget");
	}
	
	/**
	 * This method is to delete the given language
	 *
	 * @return nothing will be returned
	 */
	public void addWidgetsName() throws Throwable {
		sleep(2000);
		new AdminPage().Admin_Page();
		click(AdminPage.verticalRightBar, "vertical right bar");
		Actions act = new Actions(Driver);
		WebElement PatientsbyPayer = Driver.findElement(By.xpath("//div[@class='hb-widget-container']/div[7]/img"));
		WebElement Destination = Driver.findElement(By.xpath("//div[@class='GKGO0M2BPK']"));
		act.dragAndDrop(PatientsbyPayer, Destination).build().perform();
		long start = System.currentTimeMillis();
		WebDriverWait wait = new WebDriverWait(Driver, 100);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(AdminPage.loadingText));
		long stop = System.currentTimeMillis();
		float timeTaken = (stop - start) / 1000;
		reporter.SuccessReport("Took", timeTaken + " secs to load the widget");
	}

}
