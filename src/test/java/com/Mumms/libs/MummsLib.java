package com.Mumms.libs;

import java.util.Hashtable;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.Mumms.page.HomePage;
import com.Mumms.page.LoginPage;
import com.automation.accelerators.ActionEngine;
import com.automation.utilities.TestUtil;
import com.automation.utilities.Xls_Reader;

public class MummsLib extends ActionEngine {
	
	
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
	
	public void loginAsUserRole(String userrole) throws Throwable {

		Hashtable<String, String> data = TestUtil.getDataSignUp(userrole,"login");
		new LoginPage().Login_Page();
		/*WebElement searchbox = Driver.findElement(LoginPage.userName);
		JavascriptExecutor myExecutor = ((JavascriptExecutor) Driver);
		myExecutor.executeScript("arguments[0].value='"+data.get("username")+"';", searchbox);*/
		typeUsingJavaScriptExecutor(LoginPage.userName, data.get("username"), "username");
		type(LoginPage.password, data.get("password"), "password");
		click(LoginPage.loginBtn, "Login button");
		sleep(10000);
		System.out.println("login completed ");

	}

	// logout
	public void doLogout() throws Throwable {
		sleep(3000);
		new LoginPage().Login_Page();
		click(LoginPage.logOut,"LogOut");
		
	}
	
	
	public void selectAgency(String Agency) throws Throwable{

		new HomePage().Home_Page();
		click(HomePage.AgencyType, "login Type");

		if(Agency.equalsIgnoreCase("RUTH"))
		{
			click(HomePage.AgencyAccountType, Agency);
		}
		sleep(3000);
	}

	public void goToAdmin() throws Throwable{

		new HomePage().Home_Page();
		click(HomePage.AdminIcon, "Admin Icon");

	}
	
	public void goToReports() throws Throwable{

		new HomePage().Home_Page();
		click(HomePage.ReportsIcon, "Reports Icon");
		sleep(3000);

	}
	
	public int generateRandonNumber() throws Throwable {


		Random generator = new Random();
		int random_number = generator.nextInt(9999) + 1000;
		  
		  return random_number;
		}
	
}
