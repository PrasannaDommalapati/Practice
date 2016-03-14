package com.Mumms.libs;

import java.util.Hashtable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.Mumms.page.HomePage;
import com.Mumms.page.PatientPage;
import com.Mumms.page.ReportsPage;

public class PatientLib extends MummsLib {

	public int sleepTime_chrome = 3000;

	// Accounts

	public void searchPatientInfo(Hashtable<String, String> data) throws Throwable {

		PatientPage.Patient_Page();
		click(PatientPage.patientInfoIcon, "patient Info Icon");
		Thread.sleep(sleepTime_chrome);
		// click(PatientPage.patientListDropDown, "patient List DropDown");
		type(PatientPage.patientFirstName, data.get("patientFirstName"), "firstname field");
		System.out.println("The value of last name is " + data.get("patientLastName"));
		typeUsingJavaScriptExecutor(PatientPage.patientLastName, data.get("patientLastName"), "lastname field");
		appLoadingTimeByElementVisible(PatientPage.searchGridFirstName);

	}

}