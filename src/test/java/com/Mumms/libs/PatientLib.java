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

public class PatientLib extends MummsLib{
	
	public int sleepTime_chrome = 3000;

	//Accounts
	public void viewAndEditMyAccount(Hashtable<String, String> data) throws Throwable
	{
		/**
		 * By hovering on 'Account Detail', we do not see any data available.
		 * Assuming it is a defect.
		 * 
		 * Instead we can proceed by mouse hover on the 'Account owner' field in 'accounts detail' section ...do we need to proceed ? 
		 */
		
		new PatientPage().AccountsPage();
		click(PatientPage.editBtn, "clicked on Edit btn");
		Thread.sleep(2000);
		//System.out.println(data.get("LPDBusinessPlanText"));
		Thread.sleep(2000);
		clickUsingJavascriptExecutor(PatientPage.lpdBusinessPlanTextArea, "lpdBusinessPlanTextArea field");
		type(PatientPage.lpdBusinessPlanTextArea, data.get("LPDBusinessPlanText"), "Entering LPD business plan text");
		Thread.sleep(2000);
		click(PatientPage.save, "clicked on Save button");
		Thread.sleep(2000);
		//assertTextStartsByPrefix(text, prefix)
		assertText(PatientPage.lpdBussinessAreaTextAfterSave, data.get("LPDBusinessPlanText"));
	}
	
	}
