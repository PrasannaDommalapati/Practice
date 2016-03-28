package com.Mumms.libs;

import java.util.ArrayList;
import java.util.Hashtable;

import org.apache.tools.ant.taskdefs.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Mumms.page.AdminPage;
import com.Mumms.page.HomePage;
import com.Mumms.page.PatientPage;
import com.eviware.soapui.support.StringUtils;

public class AdminLib extends MummsLib {

	public int sleep = 3000;
	public String gstrInsuranceName, gstrHospiceDesc, gstrGroupName, type, reasondescription, description, hcpcs, rate;

	public void createRole(Hashtable<String, String> data, String vstrRollName, String vstrRole) throws Throwable {

		try {
			new HomePage().Home_Page();

			/* click(HomePage.AdminIcon, "Admin Icon"); */
			sleep(2000);
			new AdminPage().Admin_Page();
			click(AdminPage.Roles, "Roles link");
			sleep(2000);

			System.out.println("RolesGroup is " + vstrRollName);
			typeUsingJavaScriptExecutor(AdminPage.RolesGroup, vstrRollName, "RolesGroup field");
			sleep(5000);
			// type(AdminPage.RolesGroup, data.get("RolesGroup"),
			// "RolesGroup field");
			/*
			 * type(AdminPage.HCPCSCode, data.get("HCPCSCode"),
			 * "HCPCSCode field"); sleep(2000); type(AdminPage.DirectRevCode,
			 * data.get("DirectRevCode"), "DirectRevCode field"); sleep(3000);
			 * type(AdminPage.PhoneRevCode, data.get("PhoneRevCode"),
			 * "PhoneRevCode field");
			 */
			sleep(2000);
			type(AdminPage.Role, vstrRole, "Role field");
			sleep(2000);
			click(AdminPage.addIcon, "add Icon and created role name is " + vstrRollName);
			sleep(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void createRoleWithAllDetails(Hashtable<String, String> data, String vstrRollName, String vstrRole)
			throws Throwable {

		try {
			new HomePage().Home_Page();

			/* click(HomePage.AdminIcon, "Admin Icon"); */
			sleep(2000);
			new AdminPage().Admin_Page();
			click(AdminPage.Roles, "Roles link");
			sleep(2000);

			System.out.println("RolesGroup is " + vstrRollName);
			typeUsingJavaScriptExecutor(AdminPage.RolesGroup, vstrRollName, "RolesGroup field");
			sleep(5000);
			// type(AdminPage.RolesGroup, data.get("RolesGroup"),
			// "RolesGroup field");
			type(AdminPage.HCPCSCode, data.get("HCPCSCode"), "HCPCSCode field");
			sleep(2000);
			type(AdminPage.DirectRevCode, data.get("DirectRevCode"), "DirectRevCode field");
			sleep(3000);
			type(AdminPage.PhoneRevCode, data.get("PhoneRevCode"), "PhoneRevCode field");
			sleep(2000);
			type(AdminPage.Role, vstrRole, "Role field");
			sleep(2000);
			click(AdminPage.addIcon, "add Icon");
			sleep(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 03162016
	public void editRole(Hashtable<String, String> data, String vstrRollName, String RollName, String Role,
			String vstrRoleNew) throws Throwable {

		try {
			new AdminPage().Admin_Page();
			click(AdminPage.Roles, "Roles link");
			sleep(5000);
			System.out.println("RolesGroup is " + vstrRollName);
			clearData(AdminPage.RolesGroup);
			sleep(5000);
			type(AdminPage.RolesGroup, vstrRollName, "RolesGroup field");
			sleep(3000);
			String strTopDisplayedRole = Driver.findElement(AdminPage.topDisplayedRole).getAttribute("value");
			System.out.println("topDisplayedRole is " + strTopDisplayedRole);
			assertTextStringMatching(vstrRollName, strTopDisplayedRole);
			sleep(4000);
			clearData(AdminPage.RolesGroupChange);
			type(AdminPage.RolesGroupChange, RollName, "RolesGroup change field");
			sleep(4000);
			clearData(AdminPage.RolesGroup);
			sleep(4000);
			type(AdminPage.RolesGroup, RollName, "RolesGroup field");
			sleep(4000);
			String TopDisplayedRole = Driver.findElement(AdminPage.topDisplayedRole).getAttribute("value");
			System.out.println("topDisplayedRole is " + TopDisplayedRole);
			assertTextStringMatching(RollName, TopDisplayedRole);
			clearData(AdminPage.RolesChange);
			type(AdminPage.RolesChange, Role, "Role field");

			// 03212016
			type(AdminPage.Role, vstrRoleNew, " New Role field");
			sleep(4000);
			click(AdminPage.addIcon, "add Icon");
			sleep(4000);
			/*
			 * clearData(AdminPage.HcpcsCodeEdit); sleep(2000);
			 * type(AdminPage.HcpcsCodeEdit, data.get("HcpcsCodeEdit"),
			 * "HCPCS Code field"); sleep(2000);
			 * clearData(AdminPage.DirectRevCodeEdit); sleep(2000);
			 * type(AdminPage.DirectRevCodeEdit, data.get("DirectRevCodeEdit"),
			 * "RolesGroup field"); sleep(2000);
			 * clearData(AdminPage.PhoneRevCodeEdit); sleep(2000);
			 * type(AdminPage.PhoneRevCodeEdit, data.get("PhoneRevCodeEdit"),
			 * "RolesGroup field");
			 */
			// sleep(2000);
			// clearData(AdminPage.RolesChange);
			/*
			 * sleep(2000); type(AdminPage.RolesChange, data.get("RolesChange"),
			 * "RolesGroup field"); sleep(6000);
			 */
			/*
			 * Driver.findElement(AdminPage.RolesGroup).sendKeys(Keys.chord(Keys.
			 * CONTROL ,"a")); sleep(2000);
			 * Driver.findElement(AdminPage.RolesGroup).sendKeys(Keys.DELETE);
			 * sleep(6000);
			 */
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void clearData(By vstrXpath) throws Throwable {

		try {
			sleep(2000);
			new AdminPage().Admin_Page();
			Driver.findElement(vstrXpath).sendKeys(Keys.chord(Keys.CONTROL, "a"));
			sleep(2000);
			Driver.findElement(vstrXpath).sendKeys(Keys.DELETE);
			sleep(6000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void verifyEditRole(Hashtable<String, String> data, String vstrRollName, String Role, String NewRole)
			throws Throwable {

		try {
			sleep(2000);
			new AdminPage().Admin_Page();
			type(AdminPage.RolesGroup, vstrRollName, "RolesGroup field");
			sleep(5000);
			assertTextMatchingWithAttribute(AdminPage.RolesGroupChange, vstrRollName, "RolesGroup field");
			assertTextMatchingWithAttribute(AdminPage.RolesChange, Role, "Roles field");
			// 03212016
			assertTextMatchingWithAttribute(AdminPage.NewRole, NewRole, " New Role field");
			clearData(AdminPage.RolesGroup);
			sleep(3000);
			/*
			 * assertTextMatchingWithAttribute(AdminPage.HcpcsCodeEdit,
			 * data.get("HcpcsCodeEdit"), "HcpcsCode field");
			 * assertTextMatchingWithAttribute(AdminPage.DirectRevCodeEdit,
			 * data.get("DirectRevCodeEdit"), "Direct Rev Code field");
			 * assertTextMatchingWithAttribute(AdminPage.PhoneRevCodeEdit,
			 * data.get("PhoneRevCodeEdit"), "PhoneRev Code field");
			 */

			/*
			 * Driver.findElement(AdminPage.RolesGroup).sendKeys(Keys.chord(Keys.
			 * CONTROL ,"a")); sleep(2000);
			 * Driver.findElement(AdminPage.RolesGroup).sendKeys(Keys.DELETE);
			 * sleep(6000); click(AdminPage.saveButton, "save button");
			 */
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void verifyRole(Hashtable<String, String> data, String vstrRollName, String vstrRole) throws Throwable {

		try {
			sleep(2000);
			new AdminPage().Admin_Page();
			type(AdminPage.RolesGroup, vstrRollName, "RolesGroup field");
			sleep(5000);
			// String topDisplayedRole =
			// Driver.findElement(AdminPage.topDisplayedRole).getText();
			String strTopDisplayedRole = Driver.findElement(AdminPage.topDisplayedRole).getAttribute("value");
			System.out.println("topDisplayedRole is " + strTopDisplayedRole);
			assertTextStringMatching(vstrRollName, strTopDisplayedRole);
			sleep(2000);
			String strVerifyRole = Driver.findElement(AdminPage.RoleVerify).getAttribute("value");
			System.out.println("verifyRole is " + strVerifyRole);
			assertTextStringMatching(vstrRole, strVerifyRole);
			click(AdminPage.saveButton, "save button");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void deleteRole(Hashtable<String, String> data, String vstrRollName) throws Throwable {

		try {
			sleep(5000);
			new AdminPage().Admin_Page();
			type(AdminPage.RolesGroup, vstrRollName, "RolesGroup field");
			sleep(4000);

			// 03212016
			click(AdminPage.NewRoleDelete, "delete button");
			sleep(3000);
			type(AdminPage.RolesGroup, vstrRollName, "RolesGroup field");
			sleep(4000);
			isElementPresent(AdminPage.NewRole, "Verify", false);
			//

			click(AdminPage.deleteTopDisplayedRole, "delete button");
			sleep(4000);
			click(AdminPage.okDelete, "ok button");
			// Driver.switchTo().f
			sleep(3000);
			click(AdminPage.saveButton, "save button");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void verifydeleteRole(Hashtable<String, String> data, String vstrRollName) throws Throwable {

		try {
			sleep(5000);
			new AdminPage().Admin_Page();
			click(AdminPage.Roles, "Roles link");
			sleep(2000);
			type(AdminPage.RolesGroup, vstrRollName, "RolesGroup field");
			sleep(4000);
			isElementPresent(AdminPage.topDisplayedRole, "Verify", false);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void createProgram(Hashtable<String, String> data, String vstrProgramName, String vstrCode)
			throws Throwable {

		try {
			sleep(2000);
			new AdminPage().Admin_Page();
			click(AdminPage.Program, "Program link");
			sleep(2000);
			System.out.println("ProgramName is " + vstrProgramName);
			sleep(2000);
			Driver.findElement(AdminPage.ProgramName).sendKeys(Keys.chord(Keys.CONTROL, "a"));
			sleep(2000);
			Driver.findElement(AdminPage.ProgramName).sendKeys(Keys.DELETE);
			sleep(2000);
			Driver.findElement(AdminPage.ProgramName).sendKeys(vstrProgramName);
			sleep(2000);
			Driver.findElement(AdminPage.ProgramCode).sendKeys(vstrCode);
			sleep(5000);
			clickUsingJavascriptExecutor(AdminPage.ProgramAdd, "add Icon and created program name is " + vstrProgramName);
			sleep(3000);
			click(AdminPage.saveButton, "save button");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void verifyProgram(Hashtable<String, String> data, String vstrProgramName, String vstrCode)
			throws Throwable {

		try {
			sleep(2000);
			new AdminPage().Admin_Page();
			click(AdminPage.Program, "Program link");
			sleep(2000);
			type(AdminPage.ProgramName, vstrProgramName, "Name field");
			sleep(4000);
			String topDisplayedRole = Driver.findElement(AdminPage.TopDisplayedProgram).getAttribute("value");
			assertTextStringMatching(vstrProgramName, topDisplayedRole);
			sleep(2000);
			String TopDisplayedProgramCode = Driver.findElement(AdminPage.TopDisplayedProgramCode).getAttribute("value");
			assertTextStringMatching(vstrCode, TopDisplayedProgramCode);
			click(AdminPage.saveButton, "save button");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void softDeleteProgram(Hashtable<String, String> data, String vstrProgramName) throws Throwable {

		try {
			sleep(2000);
			new AdminPage().Admin_Page();
			click(AdminPage.Program, "Program link");
			sleep(2000);
			type(AdminPage.ProgramName, vstrProgramName, "Name field");
			sleep(4000);
			click(AdminPage.DeleteTopDisplayedProgram, "Delete button");
			sleep(2000);
			Driver.findElement(AdminPage.ProgramName).sendKeys(Keys.chord(Keys.CONTROL, "a"));
			sleep(2000);
			Driver.findElement(AdminPage.ProgramName).sendKeys(Keys.DELETE);
			click(AdminPage.saveButton, "save button");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void verifydeleteProgram(Hashtable<String, String> data, String vstrProgramName) throws Throwable {

		try {
			sleep(5000);
			new AdminPage().Admin_Page();
			click(AdminPage.Program, "Program link");
			sleep(2000);
			type(AdminPage.ProgramName, vstrProgramName, "Name field");
			sleep(4000);
			isElementPresent(AdminPage.TopDisplayedProgram, "Verify", false);
			Driver.findElement(AdminPage.ProgramName).sendKeys(Keys.chord(Keys.CONTROL, "a"));
			sleep(2000);
			Driver.findElement(AdminPage.ProgramName).sendKeys(Keys.DELETE);
			click(AdminPage.saveButton, "save button");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void configureSiteForProgramHardDelete(Hashtable<String, String> data, String vstrProgramName)
			throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		click(AdminPage.Sites, "Sites link");
		sleep(2000);
		click(AdminPage.SitesRuthGear, "Ruth Gear button");
		click(AdminPage.SitesRuthGearDetails, "Ruth Gear Details button");
		click(AdminPage.GearDetailsProgramDropDown, "DropDown");
		selectByVisibleText(AdminPage.GearDetailsProgramDropDown, vstrProgramName, vstrProgramName + "from drop down");
		sleep(2000);
		click(AdminPage.GearDetailsPrograSave, "add button");
		sleep(2000);
		click(AdminPage.IDGTeamDropSave, "Save button");
		click(AdminPage.saveButton, "Save button");

	}

	public void assignProgramToPatient(String vstrProgramName) throws Throwable {
		new AdminPage().Admin_Page();

		sleep(3000);
		click(AdminPage.PatientDetailsProgram, "Program Drop Down");
		sleep(2000);
		selectByVisibleText(AdminPage.PatientDetailsProgram, vstrProgramName, vstrProgramName + "from drop down");

	}

	public void hardDeleteProgram(String vstrPopUpTexConfirmationAct, String vstrPopUpTextDescAct,
			String vstrProgramName) throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		// click(AdminPage.PatientInfoRightGridBar, "RightGrid Bar");
		sleep(2000);
		click(AdminPage.DownGridBar, "DownGrid Bar");
		sleep(2000);
		goToAdmin();
		click(AdminPage.Program, "Program link");
		sleep(2000);
		type(AdminPage.ProgramName, vstrProgramName, "Name field");
		sleep(4000);
		click(AdminPage.DeleteTopDisplayedProgram, "Delete button");

		try {

			String strPopUpTexConfirmation = Driver.findElement(AdminPage.confirmDelete).getText();
			sleep(2000);
			String strPopUpTextDesc = Driver.findElement(AdminPage.PopUpTextDesc).getText();
			assertTextStringMatching(vstrPopUpTexConfirmationAct, strPopUpTexConfirmation);
			assertTextStringMatching(vstrPopUpTextDescAct, strPopUpTextDesc);
			sleep(2000);
			click(AdminPage.okDelete, "ok");

		} catch (Exception e) {
			e.printStackTrace();
		}

		sleep(2000);
		Driver.findElement(AdminPage.ProgramName).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		sleep(2000);
		Driver.findElement(AdminPage.ProgramName).sendKeys(Keys.DELETE);
		click(AdminPage.saveButton, "save button");

	}

	public void createReligion(Hashtable<String, String> data, String vstrReligionName) throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		click(AdminPage.Religion, "Religion link");
		sleep(2000);
		System.out.println("Religion is " + vstrReligionName);
		sleep(2000);
		// Driver.findElement(AdminPage.ReligionName).sendKeys(ReligionName);
		type(AdminPage.ReligionName, vstrReligionName, "Religion Name field");
		sleep(5000);
		// clickUsingJavascriptExecutor(AdminPage.ReligionAdd, "add Icon");
		click(AdminPage.ReligionAdd, "Religion link and created Religion Name is " + vstrReligionName);
		sleep(3000);
		Driver.findElement(AdminPage.ReligionName).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		sleep(2000);
		Driver.findElement(AdminPage.ReligionName).sendKeys(Keys.DELETE);
		sleep(3000);
		click(AdminPage.saveButton, "save button");

	}

	public void verifyReligion(Hashtable<String, String> data, String vstrReligionName, boolean vblnName)
			throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		click(AdminPage.Religion, "Religion link");
		sleep(2000);
		type(AdminPage.ReligionName, vstrReligionName, "Religion Name field");
		sleep(4000);
		assertTextMatchingWithAttribute(AdminPage.TopDisplayedReligion, vstrReligionName, "verify religion");
		isElementPresent(AdminPage.TopDisplayedReligion, vstrReligionName, vblnName);
		sleep(3000);
		Driver.findElement(AdminPage.ReligionName).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		sleep(2000);
		Driver.findElement(AdminPage.ReligionName).sendKeys(Keys.DELETE);
		sleep(3000);
		click(AdminPage.saveButton, "save button");

	}

	public void verifydeleteReligion(Hashtable<String, String> data, String vstrReligionName, boolean vblnName)
			throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		click(AdminPage.Religion, "Religion link");
		sleep(2000);
		type(AdminPage.ReligionName, vstrReligionName, "Religion Name field");
		sleep(4000);
		isElementPresent(AdminPage.TopDisplayedReligion, vstrReligionName, vblnName);
		sleep(3000);
		Driver.findElement(AdminPage.ReligionName).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		sleep(2000);
		Driver.findElement(AdminPage.ReligionName).sendKeys(Keys.DELETE);
		sleep(3000);
		click(AdminPage.saveButton, "save button");

	}

	public void softDeleteReligion(Hashtable<String, String> data, String vstrReligionName) throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		click(AdminPage.Religion, "Religion link");
		sleep(2000);
		type(AdminPage.ReligionName, vstrReligionName, "Religion Name field");
		sleep(5000);
		click(AdminPage.DeleteTopDisplayedReligion, "Delete button");
		Driver.findElement(AdminPage.ReligionName).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		sleep(2000);
		Driver.findElement(AdminPage.ReligionName).sendKeys(Keys.DELETE);
		sleep(3000);
		click(AdminPage.saveButton, "save button");

	}

	public void assignRelegionToPatient(String vstrReligionName) throws Throwable {
		new AdminPage().Admin_Page();

		sleep(2000);
		click(AdminPage.RelegionDropDown, "RelegionDropDown");
		sleep(2000);
		selectByVisibleText(AdminPage.RelegionDropDown, vstrReligionName, vstrReligionName + "from drop down");

	}

	public void hardDeleteReligion(String vstrPopUpTexConfirmationAct, String vstrPopUpTextDescAct,
			String vstrReligionName) throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		// click(AdminPage.PatientInfoRightGridBar, "RightGrid Bar");
		sleep(2000);
		click(AdminPage.DownGridBar, "DownGrid Bar");
		sleep(2000);
		goToAdmin();
		click(AdminPage.Religion, "Religion link");
		sleep(2000);
		type(AdminPage.ReligionName, vstrReligionName, "Religion Name field");
		sleep(5000);
		click(AdminPage.DeleteTopDisplayedReligion, "Delete button");
		String PopUpTexConfirmation = Driver.findElement(AdminPage.confirmDelete).getText();
		sleep(2000);
		String PopUpTextDesc = Driver.findElement(AdminPage.PopUpTextDesc).getText();
		assertTextStringMatching(vstrPopUpTexConfirmationAct, PopUpTexConfirmation);
		assertTextStringMatching(vstrPopUpTextDescAct, PopUpTextDesc);
		sleep(2000);
		click(AdminPage.okDelete, "ok");
		sleep(2000);
		Driver.findElement(AdminPage.ReligionName).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		sleep(2000);
		Driver.findElement(AdminPage.ReligionName).sendKeys(Keys.DELETE);
		sleep(3000);
		click(AdminPage.saveButton, "save button");
	}

	public void createAdjustmentReasons(Hashtable<String, String> data, String vstrAdjustmentReasons) throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		click(AdminPage.AdjustmentReasons, "AdjustmentReasons link");
		sleep(2000);
		System.out.println("AdjustmentReasons Name is " + vstrAdjustmentReasons);
		sleep(2000);
		type(AdminPage.ARShortDesc, vstrAdjustmentReasons, "ShortDesc Name field");
		sleep(2000);
		type(AdminPage.ARSClaimAdjustmentReason, data.get("ClaimAdjustmentReason"), "Religion Name field");
		sleep(2000);
		type(AdminPage.ARSCode, data.get("Code"), "Code field");
		sleep(5000);
		// clickUsingJavascriptExecutor(AdminPage.ARAdd, "add Icon");
		click(AdminPage.AdjustmentReasonAdd, "add Icon and created is " + vstrAdjustmentReasons);
		sleep(3000);

	}

	public void verifyAdjustmentReasons(String vstrXpath, String vstrAdjustmentReasons) throws Throwable {
		boolean blnFlag = false;
		String strText = null;
		sleep(2000);
		int intCount = Driver.findElements(By.xpath(vstrXpath)).size();
		System.out.println("count is--->" + intCount);

		sleep(2000);
		try {

			for (int i = 4; i <= intCount - 2; i++) {
				sleep(2000);
				strText = Driver.findElement(By.xpath(vstrXpath + "[" + i + "]")).getAttribute("value");
				System.out.println("text is ---->" + strText);
				if (strText.equalsIgnoreCase(vstrAdjustmentReasons)) {
					sleep(2000);
					blnFlag = true;
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (blnFlag)
				reporter.SuccessReport("Verify " + strText, "Successfully found " + strText);
			else
				reporter.failureReport("Verify " + strText, strText + "not found in list");
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
		// type(AdminPage.ExistShortDescField, AdjustmentReasons,
		// "ShortDesc field");
		sleep(2000);
		click(AdminPage.saveButton, "save Icon");
		sleep(3000);

	}

	public void editAdjustmentReasons1(String EditAdjustmentReasons, String vstrAdjustmentReasons, String vstrXpath)
			throws Throwable {

		sleep(4000);
		new AdminPage().Admin_Page();
		sleep(2000);

		String strText = null;
		sleep(2000);
		int intCount = Driver.findElements(By.xpath(vstrXpath)).size();
		System.out.println("count is--->" + intCount);

		sleep(2000);
		try {

			for (int i = 4; i <= intCount - 2; i++) {
				sleep(2000);
				strText = Driver.findElement(By.xpath(vstrXpath + "[" + i + "]")).getAttribute("value");
				System.out.println("text is ---->" + strText);
				if (strText.equalsIgnoreCase(vstrAdjustmentReasons)) {
					sleep(2000);
					Driver.findElement(By.xpath(vstrXpath + "[" + i + "]")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
					Driver.findElement(By.xpath(vstrXpath + "[" + i + "]")).sendKeys(Keys.CLEAR);
					Driver.findElement(By.xpath(vstrXpath + "[" + i + "]")).sendKeys(EditAdjustmentReasons);
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		click(AdminPage.saveButton, "save Icon and Edited AR Name is " + EditAdjustmentReasons);

	}

	public void createIGDTeams(String vstrIDGTeams) throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		click(AdminPage.IDGTeams, "IDGTeams link");
		sleep(4000);
		click(AdminPage.IDGTeamsAdd, "add Icon and created team name is " + vstrIDGTeams);
		sleep(4000);
		System.out.println("IDGTeams Name is " + vstrIDGTeams);
		type(AdminPage.IDGTeamName, vstrIDGTeams, "Team Name field");
		sleep(2000);
	}

	public void dropAndDragIGDTeams(String vstrAgency, String vstrXpath) throws Throwable {

		sleep(4000);
		new AdminPage().Admin_Page();
		String text = null;
		int count = Driver.findElements(By.xpath(vstrXpath)).size();
		System.out.println("count is--->" + count);
		sleep(2000);
		try {

			for (int i = 1; i <= count; i++) {
				sleep(2000);
				text = Driver.findElement(By.xpath(vstrXpath + "[" + i + "]" + "/div")).getText();
				System.out.println("text is ---->" + text);
				if (text.equalsIgnoreCase(vstrAgency)) {
					sleep(2000);
					Actions act = new Actions(Driver);
					WebElement IDGTeamSource = Driver.findElement(By.xpath(vstrXpath + "[" + i + "]"));
					WebElement IDGTeamDestination = Driver
							.findElement(By.xpath("(.//div[@class='dragdrop-dropTarget'])[3]"));
					act.dragAndDrop(IDGTeamSource, IDGTeamDestination).build().perform();
					sleep(4000);
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		click(AdminPage.IDGTeamDropSave, "save Icon");
		sleep(4000);
		click(AdminPage.saveButton, "save Icon");

	}

	public void verifyDropAndDragIGDTeams(String vstrIDGTeams, String vstrAgency, String vstrXpath) throws Throwable {

		sleep(4000);
		String strText = null;

		new AdminPage().Admin_Page();
		click(AdminPage.IDGTeams, "IDGTeams link");
		sleep(2000);
		int intCount = Driver.findElements(By.xpath(vstrXpath)).size();
		System.out.println("count is--->" + intCount);
		sleep(2000);
		try {

			for (int i = 3; i <= intCount; i++) {
				sleep(2000);
				strText = Driver.findElement(By.xpath(vstrXpath + "[" + i + "]")).getText();
				System.out.println("text is ---->" + strText);
				if (strText.equalsIgnoreCase(vstrIDGTeams)) {
					sleep(2000);

					String IDGTeamVerifyName = Driver.findElement(By.xpath(
							vstrXpath + "[" + i + "]" + "/parent::td/following-sibling::td[1]//*[text()='RUTH']"))
							.getText();
					assertTextStringMatching(vstrAgency, IDGTeamVerifyName);
					sleep(4000);
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		click(AdminPage.saveButton, "save Icon");

	}

	// shiney

	public void goToPhysicains(Hashtable<String, String> data) throws Throwable {
		new AdminPage().Admin_Page();
		click(AdminPage.Admin, "Admin");
		click(AdminPage.Physicians, "physician");
		// assertTextMatching(AdminPage.PhysiciansText,data.get("Physicians"),"PHYSICIANS");
		assertTextMatching(AdminPage.PhysiciansText, data.get("Physicians"), "PHYSICIANS");
		sleep(sleep);
		click(AdminPage.PhysicianModalSave, "Physician Close");
		sleep(sleep);
	}

	public void searchRecord(Hashtable<String, String> data) throws Throwable {
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

	public void goToRoleAssignments(Hashtable<String, String> data) throws Throwable {
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

		Actions act1 = new Actions(Driver);
		if (isVisible(AdminPage.AssignedTabRoles, "Accountant In Available Options")) {
			act1.dragAndDrop(Driver.findElement(AdminPage.AssignedTabRoles),
					Driver.findElement(AdminPage.rolesavailable)).build().perform();
			sleep(sleep);
		}

		WebElement drag1 = Driver.findElement(AdminPage.rolesdrag);
		WebElement drop1 = Driver.findElement(AdminPage.rolesdrop);
		act.dragAndDrop(drag1, drop1).build().perform();
		sleep(sleep);
		Actions act2 = new Actions(Driver);
		if (isVisible(AdminPage.AssignedTabsites, "RUTH In Available Options")) {
			act2.dragAndDrop(Driver.findElement(AdminPage.AssignedTabsites),
					Driver.findElement(AdminPage.sitesavailable)).build().perform();
			sleep(sleep);
		}

		WebElement drag2 = Driver.findElement(AdminPage.sitesdrag);
		WebElement drop2 = Driver.findElement(AdminPage.sitesdrop);
		act.dragAndDrop(drag2, drop2).build().perform();
		sleep(sleep);

		click(AdminPage.SaveTickMark, "Save Roles Tab");
		sleep(sleep);

		assertTextMatching(AdminPage.assignedsite, "RUTH", "Site ");
		assertTextMatching(AdminPage.assignedrole, "Accountant", "Role ");
		assertTextMatching(AdminPage.assignedoffice, "RUTH 2", "Offices ");
		sleep(sleep);
		click(AdminPage.RoleAssignmentsClose, "Role Assignments Close");
		sleep(sleep);

	}

	// 47
	public void goToFacilities(Hashtable<String, String> data) throws Throwable {
		String Facility = data.get("Facility") + Integer.toString(generateRandonNumber());

		new AdminPage().Admin_Page();
		clickUsingJavascriptExecutor(AdminPage.Admin, "Admin");
		clickUsingJavascriptExecutor(AdminPage.Facilities, "Facilities");
		// clickUsingJavascriptExecutor(locator, locatorName)
		sleep(sleep);
		type(AdminPage.FacilityTab, Facility, "Enter Facility ");
		sleep(sleep);
		selectByValue(AdminPage.FacilityTypeTab, data.get("FacilityType"), "Facility Type");
		sleep(sleep);
		click(AdminPage.FacilityAdd, "Facility Add");
		sleep(sleep);
		clickUsingJavascriptExecutor(AdminPage.FacilityModelSave, "Facility Save");
		sleep(sleep);
		type(AdminPage.FacilityTab, Facility, "Enter Facility ");
		sleep(5000);
		assertTextMatching(AdminPage.FacilityAssert, Facility, "Facility ");

		String text = Driver.findElement(AdminPage.FacilityTypeAssert).getAttribute("value");
		assertTextStringMatching(text, data.get("FacilityType"));

		// isElementPresent(AdminPage.FacilityAssert, "Facility Record", true);
		// isElementPresent(AdminPage.FacilityTypeAssert, "FacilityType Record",
		// true);
		sleep(sleep);
		clickUsingJavascriptExecutor(AdminPage.FacilityClose, "Facility Close");
		sleep(sleep);

	}

	public void goToChurch() throws Throwable {
		new AdminPage().Admin_Page();
		clickUsingJavascriptExecutor(AdminPage.Admin, "Admin");
		clickUsingJavascriptExecutor(AdminPage.Churches, "Churches");
		sleep(6000);

	}

	public void addChurch(Hashtable<String, String> data, String vstrChurch) throws Throwable {
		waitForElementPresent(AdminPage.ChurchTab, "Church Tab", 10);
		type(AdminPage.ChurchTab, vstrChurch, "Enter Church");
		sleep(sleep);
		selectByValue(AdminPage.ReligionTab, data.get("Religion"), "Religion");
		sleep(sleep);
		type(AdminPage.AddressTab, data.get("Address"), "Enter Address");
		sleep(5000);

		String strZip1 = data.get("Zip1");
		String[] arrstr = strZip1.split("");
		for (int i = 0; i < arrstr.length; i++) {
			Driver.findElement(AdminPage.zip1).sendKeys(arrstr[i]);
			sleep(1000);
		}

		sleep(4000);
		click(AdminPage.zip1sugg, " Zip1 Suggestion");

		type(AdminPage.ContactTab, data.get("Contact"), "Enter Contact");
		sleep(sleep);
		click(AdminPage.ChurchAddIcon, "Click Save icon");
		sleep(sleep);
	}

	public void verifyChurch(String vstrChurch) throws Throwable {
		sleep(sleep);
		type(AdminPage.ChurchTab, vstrChurch, "Enter Churches");
		assertTextMatching(AdminPage.ChurchAssert, vstrChurch, "Facility ");
		// isElementPresent(AdminPage.ChurchSearch, "Church Name", true);
		sleep(sleep);
		// String text =
		// Driver.findElement(AdminPage.ChurchSearch).getAttribute("value");
		// assertTextStringMatching(text, vstrChurch);

		// assertTrue(isElementPresent(AdminPage.ChurchSearch, "Church Name",
		// true), "Church is not added");

	}

	public void closeChurchTab(String vstrChurch) throws Throwable {
		clickUsingJavascriptExecutor(AdminPage.ChurchClose, "Close Church Model popup");
		sleep(sleep);
	}

	public void updateChurch(Hashtable<String, String> data, String vstrChurch) throws Throwable {
		new AdminPage().Admin_Page();
		sleep(sleep);
		click(AdminPage.gearicon, "gearicon");
		clickUsingJavascriptExecutor(AdminPage.Details, "Details");
		sleep(sleep);
		type(AdminPage.ChurchPhoneNumberUpdate, data.get("PhoneNumber"), "Church Phone Number Update");
		sleep(sleep);
		// type(AdminPage.ChurchReligionupdate,data.get("UpdatedReligion"),
		// "religion Update");
		click(AdminPage.ChurchReligionupdate, "Religion");
		selectByVisibleText(AdminPage.ChurchReligionupdate, data.get("UpdatedReligion"), "religion Update");
		sleep(8000);
		Driver.findElement(AdminPage.ChurchAddressUpdate).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		sleep(2000);
		Driver.findElement(AdminPage.ChurchAddressUpdate).sendKeys(Keys.DELETE);
		type(AdminPage.ChurchAddressUpdate, data.get("newaddress"), "addtess Update");
		sleep(sleep);
		// type(AdminPage.ChurchAddressUpdate, data.get("Address"),
		// "Church Address Update");
		click(AdminPage.SaveTickMark, "Save Chruch Update");
		sleep(5000);
		type(AdminPage.ChurchTab, vstrChurch, "Enter Churches");
		sleep(5000);
		String text = Driver.findElement(AdminPage.ChurchPhoneNumberAssert).getAttribute("value");
		assertTextStringMatching(text, data.get("PhoneNumber"));

		String text1 = Driver.findElement(AdminPage.ChurchReligionAssert).getAttribute("value");
		assertTextStringMatching(text1, data.get("UpdatedReligion"));

		String text2 = Driver.findElement(AdminPage.ChutchAddressAssert).getAttribute("value");
		assertTextStringMatching(text2, data.get("newaddress"));

		sleep(sleep);
	}

	// 75
	public void goToHospiceElection(Hashtable<String, String> data) throws Throwable {
		new AdminPage().Admin_Page();
		gstrHospiceDesc = data.get("HospiceDescription") + Integer.toString(generateRandonNumber());
		click(AdminPage.Admin, "Admin");
		click(AdminPage.HospiceElection, "HospiceElection");
		sleep(sleep);
		type(AdminPage.HospiceDescription, gstrHospiceDesc, "HospiceDescription");
		selectByValue(AdminPage.HospiceElectionPeriod, data.get("HospiceElection"), "HospiceElection Period");
		sleep(sleep);
		click(AdminPage.HospiceSaveIcon, "Click Save icon");
		sleep(sleep);
		type(AdminPage.HospiceDescription, gstrHospiceDesc, "HospiceDescription");
		// isElementPresent(AdminPage.HospiceSearch, "Hospice Name", true);

		ArrayList<WebElement> arrUsername = (ArrayList<WebElement>) Driver
				.findElements(By.xpath("//input[@id='gwt-debug-description']"));
		boolean blnFlag = false;
		String strText = null;

		try {

			for (int i = 1; i <= arrUsername.size(); i++) {

				strText = Driver.findElement(By.xpath("(//input[@id='gwt-debug-description'])[" + i + "]"))
						.getAttribute("value");
				System.out.println("text is ---->" + strText);
				if (strText.equalsIgnoreCase(gstrHospiceDesc)) {
					blnFlag = true;
					break;
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (blnFlag)
				reporter.SuccessReport("Verify " + strText, "Successfully found " + strText);

			else
				reporter.failureReport("Verify " + strText, strText + "not found in list");
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
		Boolean blnAutoCertified = Driver.findElement(By.xpath("(//*[@id='gwt-debug-autoCertified-input'])[2]"))
				.isSelected();
		System.out.println("Hospice Auto Certified checkbox is" + blnAutoCertified);
		assertTrue(blnAutoCertified, "Hospice Auto Certified Checkbox");
		sleep(sleep);
		click(AdminPage.HospiceClose, "Hospice Close");
		sleep(sleep);

	}

	// 77
	public void addInsurance(Hashtable<String, String> data) throws Throwable {

		new AdminPage().Admin_Page();
		gstrInsuranceName = data.get("InsuranceName") + Integer.toString(generateRandonNumber());
		click(AdminPage.Admin, "Admin");
		click(AdminPage.InsuranceCarriers, "Insurance Carriers");
		sleep(sleep);
		assertTextMatching(AdminPage.InsuranceCarriersHeading, data.get("InsuranceCarrier"),
				"Insurance Carriers Heading");
		click(AdminPage.InsurancePrayerType, "Insurance Prayer Type");
		sleep(sleep);
		click(AdminPage.InsurancePrayerTypeOption, "Insurance Prayer Type Option");
		sleep(sleep);
		type(AdminPage.InsuranceName, gstrInsuranceName, "Insurance Name");
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
		sleep(8000);
		type(AdminPage.InsuranceName, gstrInsuranceName, "Insurance Name");
		sleep(sleep);
		assertTextMatching(AdminPage.InsuranceAssertName, gstrInsuranceName, "Insurance Name");
		click(AdminPage.InsuranceSave, "Insurance Tick Box");
		sleep(sleep);

	}

	// 79
	public void updateInsurance(Hashtable<String, String> data) throws Throwable {
		new AdminPage().Admin_Page();
		click(AdminPage.Admin, "Admin");
		click(AdminPage.InsuranceCarriers, "Insurance Carriers");
		sleep(sleep);
		type(AdminPage.InsuranceName, gstrInsuranceName, "Insurance Name");
		assertTextMatching(AdminPage.InsuranceAssertName, gstrInsuranceName, "Insurance Name");
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
		click(AdminPage.MedicareIntermediary, "Medicare Intermediaries");
		sleep(sleep);
		selectByVisibleText(AdminPage.MedicareIntermediary, data.get("MedicareIntermediary"), "Medicare Intermediary");
		ArrayList<WebElement> arrDDEUsername = (ArrayList<WebElement>) Driver
				.findElements(By.xpath("//input[@id='gwt-debug-username']"));
		if (arrDDEUsername.size() > 2) {
			ArrayList<WebElement> arrDDEDel = (ArrayList<WebElement>) Driver.findElements(
					By.xpath("//div[contains(@class,'gwt-PopupPanel')]//img[@class='hb-mouse-over-clickable']"));
			for (int i = 2; i <= arrDDEDel.size(); i++) {
				Driver.findElement(
						By.xpath("(//div[contains(@class,'gwt-PopupPanel')]//img[@class='hb-mouse-over-clickable'])"
								+ "[" + i + "]"))
						.click();
				sleep(sleep);
			}

		}
		sleep(5000);
		click(AdminPage.MedicareIntermediary, "Medicare Intermediary");
		sleep(sleep);
		click(AdminPage.MedicareIntermediaryOption, "Medicare Intermediary Option");
		sleep(sleep);
		type(AdminPage.DDEusername, data.get("username"), "DDE Username");
		Driver.findElement(AdminPage.DDEPassword).clear();
		type(AdminPage.DDEPassword, data.get("password"), "DDE Password");
		sleep(sleep);
		type(AdminPage.DDEPasswordConfirm, data.get("password"), "DDE Confirm Password");
		sleep(sleep);
		click(AdminPage.MedicareAddIcon, "Medicare Add Icon");
		sleep(sleep);
		ArrayList<WebElement> arrUsername = (ArrayList<WebElement>) Driver
				.findElements(By.xpath("//input[@id='gwt-debug-username']"));
		boolean blnFlag = false;
		String strText = null;

		try {

			for (int i = 1; i <= arrUsername.size(); i++) {

				strText = Driver.findElement(By.xpath("(//input[@id='gwt-debug-username'])[" + i + "]"))
						.getAttribute("value");
				System.out.println("text is ---->" + strText);
				if (strText.equalsIgnoreCase(data.get("username"))) {
					blnFlag = true;
					break;
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (blnFlag)
				reporter.SuccessReport("Verify " + strText, "Successfully found " + strText);

			else
				reporter.failureReport("Verify " + strText, strText + "not found in list");
		}
		sleep(sleep);
		click(AdminPage.MedicareSave, "Medicare Model Save");
		sleep(sleep);
	}

	// 81
	public void deleteMedicareIntermediaries(Hashtable<String, String> data) throws Throwable {

		new AdminPage().Admin_Page();
		clickUsingJavascriptExecutor(AdminPage.Admin, "Admin");
		clickUsingJavascriptExecutor(AdminPage.MedicareIntermediaries, "Medicare Intermediaries");
		sleep(5000);
		click(AdminPage.MediacareIntermediaryOptionDelete, "Delete Medicare Intermediary");
		sleep(sleep);

		ArrayList<WebElement> arrUsername = (ArrayList<WebElement>) Driver
				.findElements(By.xpath("//input[@id='gwt-debug-username']"));
		boolean blnFlag = true;
		String strText = null;

		try {

			for (int i = 1; i <= arrUsername.size(); i++) {

				strText = Driver.findElement(By.xpath("(//input[@id='gwt-debug-username'])[" + i + "]"))
						.getAttribute("value");
				System.out.println("text is ---->" + strText);
				if (strText.equalsIgnoreCase(data.get("username"))) {
					blnFlag = false;
					break;
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (!blnFlag)
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

	public void PhysicianServices(Hashtable<String, String> data, String vstrProgramName) throws Throwable {

		new AdminPage().Admin_Page();
		String rate = Integer.toString(generateRandonNumber());
		// click(AdminPage.Admin,"Admin");
		click(AdminPage.PhysicianServices, "Physician Services");
		click(AdminPage.PhysicianServicesHCPCS, "Physician HPCS");
		hcpcs = data.get("hcpcs");
		type(AdminPage.PhysicianServicesHCPCS, hcpcs, "HCPCS Option");
		sleep(sleep);

		if (isElementPresent(AdminPage.PhysicianServicesHCPCSrecord, "Verify HCPCS")) {
			click(AdminPage.PhysicianRecordDelete, "delete");
			sleep(10000);
			addPhysicianServices(data, vstrProgramName);

		} else {

			addPhysicianServices(data, vstrProgramName);

		}

	}

	public void addPhysicianServices(Hashtable<String, String> data, String vstrProgramName) throws Throwable {

		new AdminPage().Admin_Page();
		String rate = Integer.toString(generateRandonNumber());
		// click(AdminPage.Admin,"Admin");
		// click(AdminPage.PhysicianServices, "Physician Services");

		sleep(10000);
		selectByVisibleText(AdminPage.PhysicianServicesMonth, data.get("month"), "Physician Services Month");
		selectByVisibleText(AdminPage.PhysicianServicesDay, data.get("day"), "Physician Services Day");
		selectByVisibleText(AdminPage.PhysicianServicesYear, data.get("year"), "Physician Services Year");
		sleep(5000);
		click(AdminPage.PhysicianServicesHCPCS, "Physician HPCS");
		sleep(sleep);
		hcpcs = data.get("hcpcs");
		type(AdminPage.PhysicianServicesHCPCS, hcpcs, "HCPCS Option");
		sleep(5000);
		click(AdminPage.PhysicianHCPCSOption, "Physician HCPCS Option");

		sleep(sleep);
		sleep(sleep);
		click(AdminPage.PhysicianServicesPgms, "Programs");
		selectByVisibleText(AdminPage.PhysicianServicesPgms, vstrProgramName, "Programs Option");
		System.out.println("program slected in Physician services " + vstrProgramName);

		type(AdminPage.PhysicianServicesRate, rate, "Physician Rate");
		click(AdminPage.PhysicianServicesAdd, "Physician Record Add");
		sleep(sleep);

		// click(AdminPage.physicianokbutton, "ok");
		isElementPresent(AdminPage.PhysicianRecordAssert, "Physician HSPCS ", true);
		sleep(sleep);
		click(AdminPage.PhysicianSave, "Save Physician Records");
		sleep(sleep);
	}

	public void verifyPhysicianServices(Hashtable<String, String> data, String vstrProgramName) throws Throwable {
		new AdminPage().Admin_Page();
		click(AdminPage.PhysicianServices, "Physician Services");
		sleep(20000);
		click(AdminPage.PhysicianServicesHCPCS, "Physician HPCS");
		sleep(sleep);
		type(AdminPage.PhysicianServicesHCPCS, hcpcs, "HCPCS Option");
		click(AdminPage.PhysicianHCPCSOption, "Physician HCPCS Option");
		sleep(20000);
		isElementPresent(AdminPage.PhysicianServicesPgmsupdate, "Physician Program", true);
		isElementPresent(AdminPage.physicianrateupdate, "rate", true);

		// String text =
		// Driver.findElement(AdminPage.PhysicianServicesPgmsupdate).getText();
		// assertTextStringMatching(text,vstrProgramName);
		//
		// String text1 =
		// Driver.findElement(AdminPage.physicianrateupdate).getText();
		// assertTextStringMatching(text1,rate);

	}

	// 84

	public void updatePhysicianServices(Hashtable<String, String> data) throws Throwable {

		new AdminPage().Admin_Page();
		String rate = Integer.toString(generateRandonNumber());
		click(AdminPage.Admin, "Admin");
		sleep(5000);
		click(AdminPage.PhysicianServices, "Physician Services");
		sleep(20000);
		click(AdminPage.PhysicianServicesHCPCS, "Physician HPCS");
		sleep(sleep);
		hcpcs = data.get("hcpcs");
		type(AdminPage.PhysicianServicesHCPCS, hcpcs, "HCPCS Option");
		click(AdminPage.PhysicianHCPCSOption, "Physician HCPCS Option");
		sleep(20000);
		click(AdminPage.PhysicianServicesPgmsupdate, "Program");
		selectByIndex(AdminPage.PhysicianServicesPgmsupdate, 2, "Programs Option");

		sleep(2000);
		type(AdminPage.physicianrateupdate, rate, "Physician Rate");
		sleep(2000);
		click(AdminPage.PhysicianSave, "Save Physician Records");
		sleep(sleep);

	}

	public void verifyupdatedPhysicianServices(Hashtable<String, String> data) throws Throwable {
		new AdminPage().Admin_Page();
		click(AdminPage.PhysicianServices, "Physician Services");
		sleep(20000);
		click(AdminPage.PhysicianServicesHCPCS, "Physician HPCS");
		sleep(sleep);
		type(AdminPage.PhysicianServicesHCPCS, hcpcs, "HCPCS Option");
		click(AdminPage.PhysicianHCPCSOption, "Physician HCPCS Option");
		sleep(20000);
		String text = Driver.findElement(AdminPage.PhysicianServicesPgmsupdate).getText();
		assertTextStringMatching(text, "Sample");

		String text1 = Driver.findElement(AdminPage.physicianrateupdate).getText();
		assertTextStringMatching(text1, rate);

	}

	// 85

	public void addRoomAndBorardRateTiers(Hashtable<String, String> data) throws Throwable {
		new AdminPage().Admin_Page();
		gstrGroupName = data.get("group") + Integer.toString(generateRandonNumber());
		String TierName = data.get("tier") + Integer.toString(generateRandonNumber());
		click(AdminPage.Admin, "Admin");
		click(AdminPage.RoomBoardTiers, "Room & Board Rate Tiers");
		sleep(sleep);
		type(AdminPage.RatesDetailsGroup, gstrGroupName, "Group Field in Rate Details");
		sleep(sleep);
		type(AdminPage.RatesDetailsTierName, TierName, "Tier Name in Rate Details");
		type(AdminPage.RatesDetailsRate, Integer.toString(generateRandonNumber()), "Rate in Rate Details");
		selectByValue(AdminPage.RatesDetailsMonth, "1", "Rate Details Month");
		selectByValue(AdminPage.RatesDetailsDay, "20", "Rate Details Day");
		selectByValue(AdminPage.RatesDetailsYear, "2015", "Rate Details Year");
		sleep(sleep);
		click(AdminPage.RatesDetailsAdd, "Add Record in Rate Details");
		type(AdminPage.RatesDetailsGroup, gstrGroupName, "Group Field in Rate Details");
		isElementPresent(AdminPage.RateDetailsRecordAssert, "Rate Details Record", true);
		sleep(sleep);
		for (int i = 0; i < 3; i++) {
			String strTierName_random = data.get("tier") + Integer.toString(generateRandonNumber());
			type(AdminPage.RatesDetailsGroup, gstrGroupName, "Group Field in Rate Details");
			sleep(sleep);
			type(AdminPage.RatesDetailsTierName, strTierName_random, "Tier Name in Rate Details");
			click(AdminPage.RatesDetailsAdd, "Add Record in Rate Details");
			sleep(1000);
			assertInputText("//input[@id='gwt-debug-name']", strTierName_random);
		}

		type(AdminPage.RatesDetailsGroup, gstrGroupName, "Group Field in Rate Details");
		for (int i = 2; i <= 4; i++) {
			String strRate = Integer.toString(generateRandonNumber());
			sleep(sleep);
			type(AdminPage.RatesDetailsGroup, gstrGroupName, "Group Field in Rate Details");
			sleep(5000);
			type(By.xpath("(//td[@class='rate-editor-amount']/input)" + "[" + i + "]"), strRate,
					"Rate in Rate Details");
			sleep(sleep);
			assertInputText("//td[@class='rate-editor-amount']/input", strRate);
			sleep(sleep);
		}
		click(AdminPage.RatesDetailsSave, "Rates Details Save");

	}

	// 86
	public void deleteRoomAndBorardRateTiers(Hashtable<String, String> data) throws Throwable {
		gstrGroupName = data.get("group") + Integer.toString(generateRandonNumber());
		String TierName = data.get("tier") + Integer.toString(generateRandonNumber());

		new AdminPage().Admin_Page();
		click(AdminPage.Admin, "Admin");
		click(AdminPage.RoomBoardTiers, "Room & Board Rate Tiers");
		sleep(sleep);
		type(AdminPage.RatesDetailsGroup, gstrGroupName, "Group Field in Rate Details");
		sleep(sleep);
		type(AdminPage.RatesDetailsTierName, TierName, "Tier Name in Rate Details");
		sleep(sleep);
		click(AdminPage.RatesDetailsAdd, "Add Record in Rate Details");
		sleep(sleep);
		type(AdminPage.RatesDetailsGroup, gstrGroupName, "Group Field in Rate Details");
		sleep(sleep);
		click(AdminPage.RateDetailRecordDelete, "Delete Rate Detail Record");
		sleep(sleep);
		click(AdminPage.RateDetailRecordDeleteConfirm, "Confirm Delete Record");
		type(AdminPage.RatesDetailsGroup, gstrGroupName, "Group Field in Rate Details");
		isElementPresent(AdminPage.RateDetailsRecordAssert, "Rate Details Record", false);

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

	public void createPatientInfo(String vstrPatientFirstName, String vstrPatientLastName) throws Throwable {
		new AdminPage().Admin_Page();

		click(AdminPage.PatientDownGridBar, "DownGrid Bar");

		click(AdminPage.patientInfoIcon, "patient Info Icon");
		sleep(sleep);
		type(AdminPage.patientFirstName, vstrPatientFirstName, "first name field");
		sleep(3000);
		type(AdminPage.patientLastName, vstrPatientLastName, "Lastname field");
		sleep(3000);
		click(AdminPage.PatientAdd, "add button");
		sleep(sleep);

	}

	public void verifyConfigurationRequiredFields(Hashtable<String, String> data, String vstrPatientFirstName,
			String vstrPatientLastName) throws Throwable {
		new AdminPage().Admin_Page();
		click(AdminPage.RequiredFields, "RequiredFields");
		sleep(sleep);
		click(AdminPage.RequiredFieldsAddressCriteria, "RequiredFieldsAddressCriteria");
		sleep(sleep);
		selectByVisibleText(AdminPage.RequiredFieldsAddressCriteria, data.get("AddressCriteria"), "from drop down");
		sleep(sleep);
		click(AdminPage.saveButton, "saveButton");
		createPatientInfo(vstrPatientFirstName, vstrPatientLastName);
		sleep(sleep);
		String strColor = Driver.findElement(By.xpath(".//*[text()='Address:']")).getCssValue("color");
		String[] hexValue = strColor.replace("rgba(", "").replace(")", "").split(",");

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

	public void createPatientInAdminCreatedSite(Hashtable<String, String> data, String vstrSiteNickName,
			String vstrPatientFirstName, String vstrPatientLastName) throws Throwable {

		selectAgency(vstrSiteNickName);
		createPatientInfo(vstrPatientFirstName, vstrPatientLastName);
		String strPatient_fn_act = Driver.findElement(AdminPage.patient_FN_Verification).getAttribute("value");
		assertTextStringMatching(strPatient_fn_act, vstrPatientFirstName);
	}

	public void createSite(Hashtable<String, String> data, String vstrSiteNickName) throws Throwable {
		new AdminPage().Admin_Page();
		// click(AdminPage.Sites, "Sites link");
		click(AdminPage.sites_addButton, "add Button");
		type(AdminPage.sites_siteName, data.get("siteName"), "site Name");
		type(AdminPage.sites_siteNickname, vstrSiteNickName, "site Nick Name");
		type(AdminPage.sites_BillingAddress, data.get("billingAddress"), "Billing Address");

		type(AdminPage.sites_zip1, data.get("zip1"), "zip1");
		sleep(sleep);
		click(AdminPage.sites_zip1_suggestion, "Suggestion of zip");
		sleep(sleep);
		type(AdminPage.sites_zip2, data.get("zip2"), "zip2");

		type(AdminPage.sites_timeZone, data.get("timeZone"), "timeZone");
		click(AdminPage.sites_timeZone_suggestion, "timezone suggestion");

		click(AdminPage.sites_Creation_SaveTick, "save site");
		click(AdminPage.sites_popUpClose, "close Sites popup");
	}

	public boolean verifySitePresent(String vstrSiteNickName) {
		boolean flag = false;

		try {
			int rows = Driver
					.findElements(By.xpath("(//div[@class='popupContent']//table[@class='hb-flex-table'])[2]/tbody/tr"))
					.size();
			System.out.println("row size " + rows);
			for (int i = 1; i <= rows; i++) {

				String nickName = Driver.findElement(
						By.xpath("(//div[@class='popupContent']//table[@class='hb-flex-table'])[2]/tbody/tr[" + i
								+ "]/td[2]/input"))
						.getAttribute("value");
				System.out.println("name- " + nickName);
				if (nickName.equalsIgnoreCase(vstrSiteNickName)) {
					flag = true;
					break;
				}
			}
		} catch (Exception ex) {

		}
		return flag;

	}

	public int getSiteRowNum(String siteNickName) {
		int rNum = 0;
		try {
			int rows = Driver
					.findElements(By.xpath("(//div[@class='popupContent']//table[@class='hb-flex-table'])[2]/tbody/tr"))
					.size();
			System.out.println("row size " + rows);
			for (int i = 1; i <= rows; i++) {

				String nickName = Driver.findElement(
						By.xpath("(//div[@class='popupContent']//table[@class='hb-flex-table'])[2]/tbody/tr[" + i
								+ "]/td[2]/input"))
						.getAttribute("value");
				System.out.println("name- " + nickName);
				if (nickName.equalsIgnoreCase(siteNickName)) {
					Driver.findElement(
							By.xpath("(//div[@class='popupContent']//table[@class='hb-flex-table'])[2]/tbody/tr[" + i
									+ "]/td[10]/div/img"))
							.click();
					rNum = i;
					break;
				}
			}
		} catch (Exception ex) {

		}
		return rNum;

	}

	public void updateSite(Hashtable<String, String> data, String vstrSiteNickName) throws Throwable {
		new AdminPage().Admin_Page();

		if (verifySitePresent(vstrSiteNickName)) {

			int rNum = getSiteRowNum(vstrSiteNickName);
			Driver.findElement(By.xpath("(//div[@class='popupContent']//table[@class='hb-flex-table'])[2]/tbody/tr["
					+ rNum + "]/td[10]/div/img")).click();
			click(AdminPage.Details, "Details");
			sleep(sleep);
			String strAddress = data.get("billingAddress") + "_Mod";
			System.out.println("new Address - > " + strAddress);

			typeUsingJavaScriptExecutor(AdminPage.sites_BillingAddress, strAddress, "new address entering");
			// type(AdminPage.sites_siteNickname,newSiteName,
			// "Site nickname Update");
			sleep(sleep);

			clickUsingJavascriptExecutor(AdminPage.sites_Creation_SaveTick, "Save SiteModelSave Update");
			sleep(5000);

			click(AdminPage.sites_popUpClose, "close Sites popup");
			sleep(sleep);

			goToSites();

			try {
				String strAddress1 = Driver.findElement(
						By.xpath("(//div[@class='popupContent']//table[@class='hb-flex-table'])[2]/tbody/tr[" + rNum
								+ "]/td[3]/input[1]"))
						.getAttribute("value");
				System.out.println("New addresss- " + strAddress1);

				assertTrue(strAddress1.equalsIgnoreCase(strAddress), "Site update failed");

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	public void createOffice(Hashtable<String, String> data, String vstrOfficeName) throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		click(AdminPage.Offices, "Offices link");
		sleep(2000);
		System.out.println("officeName Name is " + vstrOfficeName);
		sleep(2000);
		type(AdminPage.OfficeName, vstrOfficeName, "officeName field");
		sleep(4000);
		click(AdminPage.AdjustmentReasonAdd, "add Icon");
		type(AdminPage.OfficeNickName, data.get("OfficeNickName"), "Religion Name field");
		click(AdminPage.IDGTeamDropSave, "save Icon and officeName is created wuth" + vstrOfficeName);
		sleep(3000);

	}

	public void updateOffice(Hashtable<String, String> data, String vstrOfficeName) throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		// click(AdminPage.Offices, "Offices link");
		sleep(2000);
		System.out.println("officeName Name is " + vstrOfficeName);
		sleep(2000);
		type(AdminPage.OfficeName, vstrOfficeName, "officeName field");
		sleep(2000);
		click(AdminPage.OfficeGear, "Office Gear Icon");
		click(AdminPage.OfficeDetails, "Details button");
		sleep(3000);
		type(AdminPage.OfficeAdress, data.get("OfficeAdress"), "OfficeAdress Name field");

		click(AdminPage.IDGTeamDropSave, "save Icon");
		Driver.findElement(AdminPage.OfficeName).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Driver.findElement(AdminPage.OfficeName).sendKeys(Keys.DELETE);
		sleep(3000);

	}

	public void verifyUpdatedOffice(Hashtable<String, String> data, String vstrOfficeName) throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		// click(AdminPage.Offices, "Offices link");
		sleep(2000);
		System.out.println("officeName Name is " + vstrOfficeName);
		sleep(2000);
		type(AdminPage.OfficeName, vstrOfficeName, "officeName field");
		sleep(3000);

		String strTopDisplayedOffice = Driver.findElement(AdminPage.topDisplayedOffice).getAttribute("value");

		System.out.println("OfficeAdress is" + strTopDisplayedOffice);
		assertTextStringMatching(strTopDisplayedOffice, vstrOfficeName);
		sleep(2000);

		String strOfficeAdress = Driver.findElement(AdminPage.OfficeAdressverify).getAttribute("value");

		System.out.println("OfficeAdress is" + strOfficeAdress + "data.get is   " + data.get("OfficeAdress"));
		assertTextStringMatching(strOfficeAdress, data.get("OfficeAdress"));

		/*
		 * click(AdminPage.IDGTeamDropSave, "save Icon");
		 * Driver.findElement(AdminPage
		 * .OfficeName).sendKeys(Keys.chord(Keys.CONTROL,"a"));
		 * Driver.findElement(AdminPage.OfficeName).sendKeys(Keys.DELETE);
		 * sleep(3000);
		 */
	}

	public void verifyOffice(String vstrXpath, String vstrName, boolean vblnExpected) throws Throwable {
		boolean blnFlag = false;
		String strText = null;
		sleep(2000);
		int intCount = Driver.findElements(By.xpath(vstrXpath)).size();
		System.out.println("count is--->" + intCount);

		sleep(2000);
		try {

			for (int i = 2; i <= intCount; i++) {
				sleep(2000);
				strText = Driver.findElement(By.xpath(vstrXpath + "[" + i + "]")).getAttribute("value");
				System.out.println("text is ---->" + strText);
				if (strText.equalsIgnoreCase(vstrName)) {
					sleep(2000);
					blnFlag = true;
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (vblnExpected == blnFlag)
				reporter.SuccessReport("Verify " + vstrName, "Successfully verified " + vstrName);
			else
				reporter.failureReport("Verify " + vstrName, vstrName + "Successfully verified");
		}
	}

	public void deleteOffice(Hashtable<String, String> data, String vstrName) throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		// click(AdminPage.Offices, "Offices link");
		sleep(2000);
		System.out.println("AdjustmentReasons Name is " + vstrName);
		sleep(2000);
		type(AdminPage.OfficeName, vstrName, "officeName field");

		sleep(3000);

		String strTopDisplayedOffice = Driver.findElement(AdminPage.topDisplayedOffice).getAttribute("value");

		System.out.println("OfficeAdress is" + strTopDisplayedOffice);
		assertTextStringMatching(strTopDisplayedOffice, vstrName);
		sleep(2000);

		sleep(2000);
		click(AdminPage.OfficeGear, "Office Gear Icon");
		click(AdminPage.OfficeDelete, "Delete button");
		sleep(3000);
		Driver.findElement(AdminPage.OfficeName).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Driver.findElement(AdminPage.OfficeName).sendKeys(Keys.DELETE);
		sleep(2000);
		// click(AdminPage.saveButton, "save button");

	}

	public void createRegion(Hashtable<String, String> data, String RegionName) throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		click(AdminPage.Regions, "Regions link");
		sleep(4000);
		System.out.println("officeName Name is " + RegionName);
		sleep(2000);
		type(AdminPage.OfficeName, RegionName, "officeName field");
		sleep(4000);
		click(AdminPage.AdjustmentReasonAdd, "add Icon");
		sleep(3000);

	}

	public void updateRegion(Hashtable<String, String> data, String vstrOfficeName) throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		// click(AdminPage.Offices, "Offices link");
		sleep(2000);
		System.out.println("officeName Name is " + vstrOfficeName);
		sleep(2000);
		type(AdminPage.OfficeName, vstrOfficeName, "officeName field");
		sleep(2000);
		click(AdminPage.OfficeGear, "Office Gear Icon");
		click(AdminPage.OfficeDetails, "Details button");
		sleep(3000);
		type(AdminPage.regionDescUpdate, data.get("regionDescUpdate"), "OfficeAdress Name field");

		click(AdminPage.IDGTeamDropSave, "save Icon");
		Driver.findElement(AdminPage.OfficeName).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Driver.findElement(AdminPage.OfficeName).sendKeys(Keys.DELETE);
		sleep(3000);

	}

	public void verifyUpdatedRegions(Hashtable<String, String> data, String vstrRegionName) throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		// click(AdminPage.Offices, "Offices link");
		sleep(2000);
		System.out.println("officeName Name is " + vstrRegionName);
		sleep(2000);
		type(AdminPage.OfficeName, vstrRegionName, "officeName field");
		sleep(3000);

		String strTopDisplayedOffice = Driver.findElement(AdminPage.topDisplayedOffice).getAttribute("value");

		System.out.println("OfficeAdress is" + strTopDisplayedOffice);
		assertTextStringMatching(strTopDisplayedOffice, vstrRegionName);
		sleep(2000);

		String strRegionDesc = Driver.findElement(AdminPage.verifyregionDescUpdate).getAttribute("value");

		System.out.println("RegionDesc is" + strRegionDesc + "data.get is   " + data.get("regionDescUpdate"));
		assertTextStringMatching(strRegionDesc, data.get("regionDescUpdate"));

		/*
		 * click(AdminPage.IDGTeamDropSave, "save Icon");
		 * Driver.findElement(AdminPage
		 * .OfficeName).sendKeys(Keys.chord(Keys.CONTROL,"a"));
		 * Driver.findElement(AdminPage.OfficeName).sendKeys(Keys.DELETE);
		 * sleep(3000);
		 */
	}

	public void createPerson(Hashtable<String, String> data, String vstrPersonName) throws Throwable {

		sleep(2000);
		new AdminPage().Admin_Page();
		click(AdminPage.Persons, "Persons link");
		sleep(2000);
		System.out.println("officeName Name is " + vstrPersonName);
		sleep(2000);
		type(AdminPage.PersonsFirstName, vstrPersonName, "Persons FirstName field");
		type(AdminPage.PersonsLastName, data.get("PersonsLastName"), "Persons lastName field");
		selectByVisibleText(AdminPage.PersonsRole, data.get("PersonsRole"), "Business from drop down");
		sleep(3000);
		click(AdminPage.ARAdd, "add Icon");

	}

	public void verifyPersons(String vstrpath, String vstrName, boolean vblnexpected) throws Throwable {
		boolean blnFlag = false;
		String strText = null;
		sleep(2000);
		int intCount = Driver.findElements(By.xpath(vstrpath)).size();
		System.out.println("count is--->" + intCount);

		sleep(2000);
		try {

			for (int i = 53; i <= intCount; i++) {
				sleep(2000);
				strText = Driver.findElement(By.xpath(vstrpath + "[" + i + "]")).getAttribute("value");
				System.out.println("text is ---->" + strText);
				if (strText.equalsIgnoreCase(vstrName)) {
					sleep(2000);
					blnFlag = true;
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (vblnexpected == blnFlag)
				reporter.SuccessReport("Verify " + vstrName, "Successfully verified " + vstrName);
			else
				reporter.failureReport("Verify " + vstrName, vstrName + "Successfully verified");
		}
	}

	// shiney_09 march

	public void referalSourceType(Hashtable<String, String> data) throws Throwable {

		new AdminPage().Admin_Page();
		click(AdminPage.reasonsandcodes, "Reason and Codes");
		click(AdminPage.referalsourcetype, "referalsourcetype");
		sleep(sleep);
		type = data.get("Type") + Integer.toString(generateRandonNumber());
		type(AdminPage.referalsourcetype_type, type, "Type");
		sleep(sleep);
		click(AdminPage.referalsourcetype_addicon, "referalsourcetype add");
		sleep(sleep);
		click(AdminPage.referalsourcetype_save, "referalsourcetype save");
		// click(AdminPage.closebutton, "close");

	}

	public void verifyreferalSource(Hashtable<String, String> data) throws Throwable {

		new AdminPage().Admin_Page();
		click(AdminPage.reasonsandcodes, "Reason and Codes");
		click(AdminPage.referalsourcetype, "referalsourcetype");

		isElementPresent(AdminPage.referalsourcetype_type, type, false);
		type(AdminPage.referalsourcetype_type, type, "type");
		click(AdminPage.referalsourcetype_delete, "referalsourcetype delete");
		click(AdminPage.referalsourcetype_save, "referalsourcetype save");
		// click(AdminPage.closebutton, "close");
	}

	public void referralRejectionReasons(Hashtable<String, String> data) throws Throwable {

		new AdminPage().Admin_Page();
		click(AdminPage.reasonsandcodes, "Reason and Codes");
		click(AdminPage.referalrejectionreasons, "referalrejectionreasons");
		reasondescription = data.get("reasondescription") + Integer.toString(generateRandonNumber());
		type(AdminPage.reasondescription, reasondescription, "reasondescription");
		sleep(sleep);
		click(AdminPage.reasondescription_add, "reasondescription add");
		sleep(sleep);
		click(AdminPage.reasondescription_save, "reasondescription  save");

		// click(AdminPage.closebutton, "close");

	}

	public void verifyReferralRejection(Hashtable<String, String> data) throws Throwable {
		new AdminPage().Admin_Page();
		click(AdminPage.reasonsandcodes, "Reason and Codes");
		click(AdminPage.referalrejectionreasons, "referalrejectionreasons");
		isElementPresent(AdminPage.reasondescription, reasondescription, false);
		type(AdminPage.reasondescription, reasondescription, "reasondescription");
		click(AdminPage.reasondescription_delete, "reasondescription  delete");
		click(AdminPage.reasondescription_save, "reasondescription  save");
		// click(AdminPage.closebutton, "close");

	}

	public void dischargeCodes(Hashtable<String, String> data) throws Throwable {

		new AdminPage().Admin_Page();
		click(AdminPage.reasonsandcodes, "Reason and Codes");
		click(AdminPage.dischargecodes, "dischargecodes");
		selectByVisibleText(AdminPage.dischargecodes_type, data.get("dischargecodetype"),
				"dischargecodetype from dropdown");
		description = data.get("description") + Integer.toString(generateRandonNumber());
		type(AdminPage.dischargecodes_description, description, "discharge code discreption");
		sleep(sleep);
		click(AdminPage.dischargecodes_add, "add");
		sleep(sleep);
		click(AdminPage.dischargecodes_save, "save");
		// click(AdminPage.closebutton, "close");
		click(AdminPage.lowergrid, "grid");

	}

	public void dischargePatient(Hashtable<String, String> data) throws Throwable {
		PatientPage.Patient_Page();
		click(PatientPage.dischargeButton, "discharge");
		click(PatientPage.dischargetype, "dischargetype ");
		selectByVisibleText(PatientPage.dischargetype, data.get("dischargetype"), "dischargetype from drop down");
		sleep(sleep);
		click(PatientPage.dischargereason, "dischargetype description ");
		sleep(sleep);
		selectByVisibleText(PatientPage.dischargereason, description, "dischargereason from drop down");
		selectByVisibleText(PatientPage.dischargedate_day, data.get("dischargedate_day"),
				"dischargedate_day from drop down");
		selectByVisibleText(PatientPage.dischargedate_month, data.get("dischargedate_month"),
				"dischargedate_month from drop down");
		selectByVisibleText(PatientPage.dischargedate_year, data.get("dischargedate_year"),
				"dischargedate_year from drop down");
		clickUsingJavascriptExecutor(PatientPage.okBtn_admitPopup, "ok buton on discharge popup");

	}

	public void diagonsiscode(Hashtable<String, String> data) throws Throwable {

		new AdminPage().Admin_Page();
		click(AdminPage.reasonsandcodes, "Reason and Codes");
		click(AdminPage.diagonsiscode, "diagonsiscode");
		type(AdminPage.diagonsiscode_icd10, "C7A020", "icd-10");
		sleep(sleep);
		click(AdminPage.diagonsiscode_close, " diagonsis close");
		// click(AdminPage.closebutton, "close");
		click(AdminPage.lowergrid, "grid");

	}

	// Vamsi
	public void createPersonDetails(Hashtable<String, String> data, String personName) throws Throwable {

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
		click(AdminPage.ARAddPerson, "add Icon");
		sleep(15000);
		click(AdminPage.HummingBirdRadioNo, "Hummingbird No radio button");
		click(AdminPage.HospiceEmployeeradioNo, "Hospice Employee radio button");
		sleep(3000);
		type(AdminPage.AddressTextField, data.get("Address"), "Persons FirstName field");
		String strZip1 = "64093";
		// type(AdminPage.ZipTextField, data.get("Zipcode"),
		// "Persons FirstName field");
		try {

			String[] arrstr = strZip1.split("");

			System.out.println("strZip1 is " + strZip1 + " arrstr.length is " + arrstr.length);
			for (int i = 0; i < arrstr.length; i++) {
				Driver.findElement(AdminPage.ZipTextField).sendKeys(arrstr[i]);
				sleep(1000);
			}
			sleep(5000);
			Driver.findElement(By.xpath("//*[@class='hb-simple-grid-dropdown']")).click();
		} catch (Exception e) {

			e.printStackTrace();
		}

		// Driver.findElement(AdminPage.ZipTextField).sendKeys(strZip1);
		click(AdminPage.TickMark, "Tick Mark");
		// click(AdminPage.SaveAndExitButton, "Save and Exit Button");
		sleep(5000);
	}

	public void createNewPerson(Hashtable<String, String> data, String personName, String Email) throws Throwable {

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
		click(AdminPage.ARAddPerson, "add Icon and created person Name is " + personName);
		sleep(15000);
		click(AdminPage.HummingBirdRadio, "Hummingbird Yes radio button");
		sleep(5000);
		selectByVisibleText(AdminPage.UserTypeDropdown, data.get("UserType"), "Select User type from the drop down");
		click(AdminPage.HospiceEmployeeradio, "Hospice Employee radio button");
		sleep(5000);
		selectByVisibleText(AdminPage.EmployeeTypeDropdown, data.get("EmployeeType"),
				"Select Employee type from the drop down");
		selectByVisibleText(AdminPage.StartMonth, data.get("month"), "Select Month from the drop down");
		selectByVisibleText(AdminPage.StartDate, data.get("day"), "Select Day from the drop down");
		selectByVisibleText(AdminPage.StartYear, data.get("year"), "Select Year from the drop down");
		type(AdminPage.EmailID, Email, "Enter Email id");
		sleep(4000);
		click(AdminPage.CompanyName, "Company Name");
		sleep(3000);
		click(AdminPage.PasswordButton, "Password Button");
		sleep(3000);
		click(AdminPage.OKButton, "OK button");
		click(AdminPage.TickMark, "Tick Mark");
		// click(AdminPage.SaveAndExitButton, "Save and Exit Button");
		sleep(10000);

	}

	public void verifyNewPerson(String xpath, String name) throws Throwable {

		boolean verifystatus = false;
		sleep(3000);
		type(AdminPage.PersonsFirstName, name, "Persons FirstName field");
		sleep(8000);
		int count = Driver.findElements(By.xpath(xpath)).size();
		System.out.println(count);
		try {
			for (int i = 2; i <= count; i++) {
				String nameText = Driver.findElement(By.xpath(xpath + "[" + i + "]")).getAttribute("value");
				if (nameText.equalsIgnoreCase(name.trim())) {
					verifystatus = true;
					break;
				} else {
					verifystatus = false;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (verifystatus == true)
				reporter.SuccessReport("Verify " + name, "Successfully verified " + name);
			else
				reporter.failureReport("Verify " + name, name + "not Successfully verified");
		}
	}

	public void updatenewPersondetails(Hashtable<String, String> data) throws Throwable {

		sleep(2000);
		click(AdminPage.Gearicon, "Gear icon");
		click(AdminPage.EditDetails, "Details");
		sleep(3000);
		// typeUsingJavaScriptExecutor(AdminPage.CompanyName,
		// data.get("CompanyName"), "Company Name");

		String companyName = data.get("CompanyName");

		String[] arrstr = companyName.split("");

		try {
			for (int i = 0; i < arrstr.length; i++) {
				// typeUsingJavaScriptExecutor(AdminPage.CompanyName, arrstr[i],
				// "Company Name");

				Driver.findElement(AdminPage.CompanyName).sendKeys(arrstr[i]);
				sleep(1000);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		sleep(5000);
		clickUsingJavascriptExecutor(AdminPage.Title, "Title");
		try {
			sleep(2000);
			Driver.findElement(By.xpath("//input[@id='gwt-debug-credentials']")).click();
			sleep(2000);
			clickUsingJavascriptExecutor(AdminPage.CompanyName, "Company Name");
		} catch (Exception e) {

			e.printStackTrace();
		}
		sleep(3000);
		clickUsingJavascriptExecutor(AdminPage.TickMark, "Tick Mark");
		// click(AdminPage.SaveAndExitButton, "Save and Exit Button");
		sleep(5000);
	}

	public void verifyUpdatedDetails(Hashtable<String, String> data, String cxpath, String Companyname, String name)
			throws Throwable {

		boolean verifystatus = false;

		int count = Driver.findElements(By.xpath(cxpath)).size();
		System.out.println(count);
		try {
			for (int i = 2; i <= count; i++) {
				String companyText = Driver.findElement(By.xpath(cxpath + "[" + i + "]")).getAttribute("value");
				if (companyText.equalsIgnoreCase(Companyname)) {
					verifystatus = true;
					break;
				} else {
					verifystatus = false;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (verifystatus == true)
				reporter.SuccessReport("Verify " + Companyname, "Successfully verified " + Companyname);
			else
				reporter.failureReport("Verify " + Companyname, Companyname + "not Successfully verified");
		}

	}

	public void deletedetails() throws Throwable {

		sleep(3000);
		click(AdminPage.Gearicon, "Gear icon");
		click(AdminPage.Deleteicon, "Delete icon");
		sleep(5000);
	}

	public void verifydetails(String xpath, String personName) throws Throwable {

		boolean verifystatus = false;
		Driver.findElement(AdminPage.PersonsFirstName).clear();
		int count = Driver.findElements(By.xpath(xpath)).size();
		System.out.println("count is--->" + count);
		sleep(2000);
		try {
			for (int i = 2; i <= count; i++) {
				String text = Driver.findElement(By.xpath(xpath + "[" + i + "]")).getAttribute("value");
				if (text.equalsIgnoreCase(personName)) {
					sleep(2000);
					verifystatus = true;
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (verifystatus == false)
				reporter.SuccessReport("Delete " + personName, "Successfully Deleted " + personName);
			else
				reporter.failureReport("Delete " + personName, personName + "not deleted");
		}
	}

	/*
	 * public void verifyPersons(String xpath,String Name,boolean expected)
	 * throws Throwable{ boolean flag = false; String text=null; sleep(2000);
	 * int count = Driver.findElements(By.xpath(xpath)).size();
	 * System.out.println("count is--->"+count);
	 * 
	 * sleep(2000); try {
	 * 
	 * for(int i = 53; i<=count;i++){ sleep(2000); text =
	 * Driver.findElement(By.xpath(xpath+"["+i+"]")).getAttribute("value");
	 * System.out.println("text is ---->"+text);
	 * if(text.equalsIgnoreCase(Name)){ sleep(2000); flag=true; break; } }
	 * 
	 * } catch (Exception e) { e.printStackTrace(); }finally{ if(expected ==
	 * flag) reporter.SuccessReport("Verify "+Name, "Successfully verified "
	 * +Name); else reporter.failureReport("Verify "+Name, Name+
	 * "Successfully verified"); } }
	 */

	public void verifyEmail(Hashtable<String, String> data, String vstrUserName) throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) Driver;
		js.executeScript("window.open('https://mail.mumms.com/webmail/login2/','_blank');");
		ArrayList<String> windows = new ArrayList<String>(Driver.getWindowHandles());
		Driver.switchTo().window(windows.get(1));
		sleep(50000);

		/*
		 * WebDriverWait wait = new WebDriverWait(Driver, 100);
		 * wait.until(ExpectedConditions
		 * .elementToBeClickable(By.xpath("//*[@id='username']"))); sleep(3000);
		 */

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
			sleep(10000);
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

		sleep(120000);
		ArrayList<String> tabs = new ArrayList<String>(Driver.getWindowHandles());
		Driver.switchTo().window(tabs.get(2));

		try {

			WebDriverWait wait = new WebDriverWait(Driver, 300);
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//div[text()='Temporary Password:']/parent::td/following-sibling::td/input")));

			WebElement tmppwd;
			tmppwd = Driver.findElement(
					By.xpath("//div[text()='Temporary Password:']/parent::td/following-sibling::td/input"));

			if (tmppwd.isDisplayed() == true) {

				String[] arrstr = text.split("");

				try {
					for (int i = 0; i < arrstr.length; i++) {
						tmppwd.sendKeys(arrstr[i]);
						// js.executeScript("arguments[0].value='"+ arrstr[i]
						// +"';", tmppwd);
						sleep(1000);
					}
				} catch (Exception e) {

					e.printStackTrace();
				}
				// js.executeScript("arguments[0].value='"+ text +"';", tmppwd);
				reporter.SuccessReport("Enter the temporary password", "Temporary password is successfully entered");
			} else {
				reporter.failureReport("Enter the temporary password", "Temporary password is not entered");
			}

			wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//div[text()='New Password:']/parent::td/following-sibling::td/input")));
			WebElement newpwd;

			newpwd = Driver
					.findElement(By.xpath("//div[text()='New Password:']/parent::td/following-sibling::td/input"));

			if (newpwd.isDisplayed() == true) {

				String NewPassword = data.get("NewPassword");
				String[] arrstrNew = NewPassword.split("");

				try {
					for (int i = 0; i < arrstrNew.length; i++) {

						// js.executeScript("arguments[0].value='"+ arrstrNew[i]
						// +"';", newpwd);
						newpwd.sendKeys(arrstrNew[i]);
						sleep(1000);
					}
				} catch (Exception e) {

					e.printStackTrace();
				}
				// js.executeScript("arguments[0].value='"+
				// data.get("NewPassword") +"';", newpwd);
				sleep(3000);

				reporter.SuccessReport("Enter the New password", "New password is successfully entered");
			} else {
				reporter.failureReport("Enter the New password", "New password is not entered");
			}

			wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//div[text()='Repeat Password:']/parent::td/following-sibling::td/input")));

			sleep(5000);
			WebElement rptpwd = Driver
					.findElement(By.xpath("//div[text()='Repeat Password:']/parent::td/following-sibling::td/input"));
			sleep(5000);

			if (rptpwd.isDisplayed() == true) {

				String RepeatPassword = data.get("RepeatPassword");
				String[] arrstrRep = RepeatPassword.split("");

				try {
					for (int i = 0; i < arrstrRep.length; i++) {

						// js.executeScript("arguments[0].value='"+ arrstrRep[i]
						// +"';", rptpwd);
						rptpwd.sendKeys(arrstrRep[i]);
						sleep(1000);
					}
				} catch (Exception e) {

					e.printStackTrace();
				}

				// js.executeScript("arguments[0].value='"+
				// data.get("RepeatPassword") +"';", rptpwd);
				sleep(5000);
				reporter.SuccessReport("Enter the Repeat password", "Repeat password is successfully entered");
			} else {
				reporter.failureReport("Enter the Repeat password", "Repeat password is not entered");
			}
			sleep(10000);
			WebElement HummingbirdBtn = Driver.findElement(By.xpath("//button[text()='LOGIN TO HUMMINGBIRD']"));
			if (HummingbirdBtn.isEnabled() == true) {
				js.executeScript("arguments[0].click();", HummingbirdBtn);
				sleep(20000);
				reporter.SuccessReport("Click on Hummingbird button", "Hummingbird button is successfully clicked");
			} else {
				reporter.failureReport("Click on Hummingbird button", "Hummingbird button is not clicked");
			}

			wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//div[@class='hb-top-toolbar']/table/tbody/tr/td[6]/img")));
			sleep(3000);
			new HomePage().Home_Page();
			assertTextMatching(HomePage.UserName, vstrUserName, "verify UserName");

		} catch (Exception e) {

			e.printStackTrace();
		}

		Driver.close();

	}

	public void deleteEmail(String windowName) throws Throwable {

		try {
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

			try {
				sleep(3000);
				Driver.close();
				sleep(3000);
				Driver.switchTo().window(windowName);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String windowname() throws Throwable {

		sleep(2000);
		String currwindow = Driver.getWindowHandle();
		return currwindow;
	}

	// 23march
	public void verifyaddRoomAndBorardRateTiers(Hashtable<String, String> data) throws Throwable {
		try {
			new AdminPage().Admin_Page();

			click(AdminPage.RoomBoardTiers, "Room & Board Rate Tiers");
			sleep(sleep);
			type(AdminPage.RatesDetailsGroup, gstrGroupName, "Group Field in Rate Details");
			sleep(sleep);
			isElementPresent(AdminPage.RateDetailsRecordAssert, "record Details Record", false);
			isElementPresent(AdminPage.RateDetailsTier1Assert, "tier Details Record", false);
			isElementPresent(AdminPage.RateDetailsTier2Assert, "tier Details Record", false);
			isElementPresent(AdminPage.RateDetailsTier3Assert, "tier Details Record", false);
			isElementPresent(AdminPage.RateDetailsrates1Assert, "Rate Details Record", false);
			isElementPresent(AdminPage.RateDetailsrates2Assert, "Rate Details Record", false);
			isElementPresent(AdminPage.RateDetailsrates3Assert, "Rate Details Record", false);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
