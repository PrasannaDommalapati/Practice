package com.Mumms.libs;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Mumms.page.HomePage;
import com.Mumms.page.PatientPage;
import com.Mumms.page.ReportsPage;

public class ReportsLib extends MummsLib {

	public int sleep = 3000;


	public void setMedlineInfo(Hashtable<String, String> data) throws Throwable
	{
		new ReportsPage().Reports_Page();

		//click(ReportsPage.MedlineReport, "Medline Link");
		clickUsingJavascriptExecutor(ReportsPage.MedlineReport, "Medline Link");
		

		/*try {

			WebDriverWait wait = new WebDriverWait(Driver, 2000);

			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ReportsPage.BeginDateDay));
		} catch (Exception e) {
		e.printStackTrace();	
		}
*/
		//sleep(60000);

		selectByVisibleText(ReportsPage.BeginDateMonth, data.get("BeginDateMonth"), "from drop down");
		selectByVisibleText(ReportsPage.BeginDateDay, data.get("BeginDateDay"), "from drop down");
		selectByVisibleText(ReportsPage.BeginDateYear, data.get("BeginDateYear"), "from drop down");
		selectByVisibleText(ReportsPage.EndDateMonth, data.get("EndDateMonth"), "from drop down");
		selectByVisibleText(ReportsPage.EndDateDay, data.get("EndDateDay"), "from drop down");
		selectByVisibleText(ReportsPage.EndDateYear, data.get("EndDateYear"), "from drop down");

		click(ReportsPage.GenerateReport, "Generate Report Link");

	}

	public void verifyMedlineInfo(Hashtable<String, String> data) throws Throwable
	{
		new ReportsPage().Reports_Page();


		/*try {

			WebDriverWait wait = new WebDriverWait(Driver, 200);

			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ReportsPage.MedlineFileType));
		} catch (Exception e) {
		e.printStackTrace();	
		}*/

		//sleep(45000);

		isElementPresent(ReportsPage.MedlineFirstName, "Verify First Name",true);
		isElementPresent(ReportsPage.MedlineLastName, "Last Name",true);
		isElementPresent(ReportsPage.MedlineFacility, "Facility",true);
		isElementPresent(ReportsPage.MedlineStreet, "Street",true);
		isElementPresent(ReportsPage.MedlineRoomNumber, "Room Number",true);
		isElementPresent(ReportsPage.MedlineCity, "City",true);
		isElementPresent(ReportsPage.MedlineState, "State",true);
		isElementPresent(ReportsPage.MedlineCounty, "County",true);
		isElementPresent(ReportsPage.MedlineZip, "Zip",true);
		isElementPresent(ReportsPage.MedlineCountry, "Country",true);
		isElementPresent(ReportsPage.MedlineTeam, "team",true);
		isElementPresent(ReportsPage.MedlinePayer, "Payer",true);
		isElementPresent(ReportsPage.MedlineHHRG, "HHRG",true);
		isElementPresent(ReportsPage.MedlinePatientID, "PatientID",true);
		isElementPresent(ReportsPage.MedlineICD10_1, "ICD10_1",true);
		isElementPresent(ReportsPage.MedlineICD10_2, "ICD10_2",true);
		isElementPresent(ReportsPage.MedlineICD10_3, "ICD10_3",true);
		isElementPresent(ReportsPage.MedlineICD10_4, "ICD10_4",true);
		isElementPresent(ReportsPage.MedlinePhone, "Phone",true);
		isElementPresent(ReportsPage.MedlineNotes, "Notes",true);


	}

	public void cahpsReportFlow(Hashtable<String, String> data)  throws Throwable{
		new ReportsPage().Reports_Page();

		click(ReportsPage.CAHPSLink, "cahps Link");
		sleep(20000);
		selectByVisibleText(ReportsPage.CAHPSMonth, data.get("CAHPSMonth"), "from drop down");
		selectByVisibleText(ReportsPage.CAHPSYear, data.get("CAHPSYear"), "from drop down");
		click(ReportsPage.GenerateReport, "generate report Link");
		sleep(15000);
		
	}

	public void verifyCAHPSdata() throws Throwable{
		
		sleep(4000);
		isElementPresent(ReportsPage.CAHPHeader, "CAHPS(DSS) Header",true);
		isElementPresent(ReportsPage.CAHPProvideName, "Provider Name",true);
		isElementPresent(ReportsPage.CAHPBranch, "Branch",true);
		isElementPresent(ReportsPage.CAHPProvideID, "Provider ID",true);
		isElementPresent(ReportsPage.CAHPNPI, "NPI",true);
		isElementPresent(ReportsPage.CAHPFacilityName, "Facility Name",true);
		isElementPresent(ReportsPage.CAHPSampleMonth, "Sample Month",true);
		isElementPresent(ReportsPage.CAHPSampleYear, "Sample Year",true);
		isElementPresent(ReportsPage.CAHPTotalCharges, "Total Live Charges",true);
		
		
	}

}
