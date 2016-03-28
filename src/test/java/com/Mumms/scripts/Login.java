package com.Mumms.scripts;

import java.util.Hashtable;

import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Mumms.libs.MummsLib;
import com.automation.utilities.TestUtil;


public class Login extends MummsLib {

	@DataProvider
	public Object[][] getTestDataFor_loginWithDiffferentCredentials () {
		return TestUtil.getData("loginWithDiffferentCredentials", TestData, "Home");
	}

	@Test(dataProvider = "getTestDataFor_loginWithDiffferentCredentials")
	public void loginWithDiffferentCredentials(Hashtable<String, String> data) throws Throwable {
		try {
			if (data.get("RunMode").equals("Y"))
			{

				this.reporter.initTestCaseDescription("SQA-63");	
				
				System.out.println("Admin user login ....");
				//doLogin("s.mundla@mumms.com", "Sailaxmi1@");
				loginAsUserRole("AdminUser");
				checkPageIsReadyUsingJavaScript();
				System.out.println("Url - " + Driver.getCurrentUrl());
				assertTrue(StringUtils.containsIgnoreCase(Driver.getCurrentUrl(), "HomePage"),
						"Whether Landing page is homePage");
				doLogout();

				System.out.println("hospice user login ....");
				//doLogin("a.muchakhandi-anilgallop@mumms.com", "1!Qa1!Qa");
				loginAsUserRole("HospiceUser");
				checkPageIsReadyUsingJavaScript();
				System.out.println("Url - " + Driver.getCurrentUrl());	
				assertTrue(StringUtils.containsIgnoreCase(Driver.getCurrentUrl(), "HomePage"),
						"Whether Landing page is homePage");
				doLogout();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
