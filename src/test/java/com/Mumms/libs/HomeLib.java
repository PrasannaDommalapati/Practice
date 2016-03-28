package com.Mumms.libs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.Mumms.page.AdminPage;
import com.Mumms.page.HomePage;
import com.Mumms.page.PatientPage;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;



public class HomeLib extends MummsLib{

	public int sleepTime_chrome = 3000;
	String Patient,Patient1;

	String patientInsurance_prayername1, patientInsurance_prayerid1;



	public void dragAndDropWigets() throws Throwable{


		sleep(4000);
		new HomePage().Home_Page();

		click(HomePage.ridhtside_gridvar, "ridhtside_gridvar");
		Actions act = new Actions(Driver);
		WebElement intarction = Driver.findElement(By.xpath("//div[@class='hb-start-page-content']//img[contains(@src, 'ezbr8WVkrAAAAAElFTkSuQmCC')]"));
		WebElement Destination = Driver.findElement(By.xpath("//div[@class='GKGO0M2BPK']"));

		WebElement patientwithoutdiagnosis_widget = Driver.findElement(By.xpath("//div[@class='hb-start-page-content']//img[contains(@src, 'kfjHmz9lXJcgIAAAAASUVORK5CYII')]"));
		WebElement patientwithoutdiagnosis_widgetDestination = Driver.findElement(By.xpath("//div[@class='GKGO0M2BPK']"));


		WebElement billingReport_widget = Driver.findElement(By.xpath("//div[@class='hb-start-page-content']//img[contains(@src, 'kDEjNDM8NeEa4oJ14RrwjXFhGvCbYzy')]"));
		WebElement billingReport_widgetDestination = Driver.findElement(By.xpath("//div[@class='GKGO0M2BPK']"));

		WebElement claimsmanagement_widget = Driver.findElement(By.xpath("//div[@class='hb-start-page-content']//img[contains(@src, 'Vz2iWaiQAAAAASUVORK5CYII')]"));
		WebElement claimsmanagement_widgetDestination = Driver.findElement(By.xpath("//div[@class='GKGO0M2BPK']"));

		WebElement claimssubmisssionlogs = Driver.findElement(By.xpath("//div[@class='hb-start-page-content']//img[contains(@src, 'wCPfOt16Kz6HAAAAABJRU5ErkJggg')]"));
		WebElement claimssubmisssionlogs_widgetDestination = Driver.findElement(By.xpath("//div[@class='GKGO0M2BPK']"));




		act.dragAndDrop(intarction,Destination).build().perform();
		sleep(sleep);

		click(HomePage.ridhtside_gridvar, "ridhtside_gridvar");
		act.dragAndDrop(patientwithoutdiagnosis_widget,patientwithoutdiagnosis_widgetDestination).build().perform();
		sleep(sleep);

		click(HomePage.ridhtside_gridvar, "ridhtside_gridvar");
		act.dragAndDrop(billingReport_widget,patientwithoutdiagnosis_widgetDestination).build().perform();
		sleep(sleep);

		click(HomePage.ridhtside_gridvar, "ridhtside_gridvar");
		act.dragAndDrop(claimsmanagement_widget,claimsmanagement_widgetDestination).build().perform();
		sleep(sleep);

		click(HomePage.ridhtside_gridvar, "ridhtside_gridvar");
		act.dragAndDrop(claimssubmisssionlogs,claimssubmisssionlogs_widgetDestination).build().perform();
		sleep(sleep);

		click(HomePage.intraction_text,"intaraction");
		click(HomePage.intraction_tick,"intraction grid close");
		click(HomePage.Widget_close,"close");
		sleep(sleep);


		click(HomePage.patientwithoutdiagnosis_text,"patientwithoutdiagnosis");
		click(HomePage.intraction_tick,"patientwithoutdiagnosis grid close");
		click(HomePage.Widget_close,"close");
		sleep(sleep);


		click(HomePage.billingReport_text,"billingReport");
		click(HomePage.Widget_close,"close");
		sleep(sleep);


		click(HomePage.claimsmanagement_text,"claimsmanagement");
		click(HomePage.intraction_tick,"claimsmanagement  grid close");
		click(HomePage.Widget_close,"close");
		sleep(sleep);


		click(HomePage.claimssubmisssionlogs_text,"claimssubmisssionlogs");
		click(HomePage.intraction_tick,"claimssubmisssionlogs grid close");
		click(HomePage.Widget_close,"close");
		sleep(sleep);







	}
	public void dragAndDropMedicationsWidget() throws Throwable{


		sleep(4000);
		new HomePage().Home_Page();

		click(HomePage.ridhtside_gridvar, "ridhtside_gridvar");
		Actions act = new Actions(Driver);
		WebElement medications = Driver.findElement(By.xpath("//div[@class='hb-widget-icon-image-container dragdrop-draggable']//img[contains(@src,'RmMAAAAAElFTkSuQmCC')]"));


		WebElement Destination = Driver.findElement(By.xpath("//div[@class='GKGO0M2BPK']"));

		act.dragAndDrop(medications,Destination).build().perform();

	}
	public void medicationUpload(Hashtable<String, String> data) throws Throwable{

		new HomePage().Home_Page();
		click(HomePage.medication_text, "medication");
		click(HomePage.medication_UploadButton, "upload record");

		String strFilepath = System.getProperty("user.dir")+"\\UploadData\\meds.data"; 

		setClipboardData(strFilepath);

		try {


			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V); 
			robot.keyRelease(KeyEvent.VK_V); 
			robot.keyRelease(KeyEvent.VK_CONTROL); 
			robot.keyPress(KeyEvent.VK_ENTER); 
			robot.keyRelease(KeyEvent.VK_ENTER); 

		} catch (Exception e) {
			e.printStackTrace();
		}
		waitForElementPresent(HomePage.medication_uploadok, "upload ok", 10);

		click(HomePage.medication_uploadok, "ok");
		click(HomePage.medication_tick, "save");

		//  sleep(sleep);		  
		click(HomePage.Widget_close,"close");

	}

	//14
	public void medicationsWidgetDetails() throws Throwable{

		new HomePage().Home_Page();


		isElementPresent(HomePage.medication_details,"first row in the widget", true);
		sleep(15000);

		click(HomePage.Widget_close,"close");

	}

	public static void setClipboardData(String string) {
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard()
		.setContents(stringSelection, null);
	}

	public void setDataFordragAndDropPatients(Hashtable<String, String> data,String patientFirstName) throws Throwable{


		setPatientInfo(data, patientFirstName);
		setDemographicsInfo(data);
		setRefferalInfo(data);
		setBasicInfo(data);
		admitPatient(data);
		goToInsuranceTab();

		addDefaultInfoInInsuranceTab("Medicare");
		click(HomePage.insuranceAdd, "add button");
		goToHistoryTab();
		setPrimaryInsuranceInHistoryTab(data, "Medicare");
		click(HomePage.DownGridBar,"Down Bar");
		click(HomePage.homeIcon,"Home Icon");

	}

	public void dragAndDropPatientsbyPayerTypeWidget() throws Throwable{


		sleep(4000);
		new HomePage().Home_Page();
		click(HomePage.ridhtside_gridvar, "ridhtside_gridvar");
		sleep(2000);
		Actions act = new Actions(Driver);
		WebElement PatientsbyPayer = Driver.findElement(By.xpath("//div[@class='hb-widget-icon-image-container dragdrop-draggable']//img[contains(@src,'1XMARgSkAAAAASUVORK5CYII')]"));

		WebElement Destination = Driver.findElement(By.xpath("//div[@class='GKGO0M2BPK']"));

		act.dragAndDrop(PatientsbyPayer,Destination).build().perform();

	}



	public void PatientsbyPayerTypeWidgetDetails(String strPersonName) throws Throwable{

		new HomePage().Home_Page();
		//click(HomePage.medication_details, "details");
		sleep(25000);
		assertTextMatching(HomePage.payerTypeWidgetVerify, "PATIENTS BY PAYER TYPE", "Patients by Payer Typ widget ");
		click(HomePage.medicareBar,"medicare bar");
		sleep(5000);
		assertTextMatching(HomePage.medicareGridVerify, "MEDICARE", "Patients List ");
		click(HomePage.selectPatient,"patient");
		Driver.findElement(By.xpath(".//*[text()='"+strPersonName+"']")).click();


	}

	public void verifyPayerTypeWidgetDetails() throws Throwable{

		new HomePage().Home_Page();
		assertTextMatching(HomePage.insuraceType, "Medicare", "verify Insurance Type");
		sleep(sleep);
		goToHistoryTab();
		sleep(sleep);
		assertTextMatching(HomePage.primaryInsuranceVerify, "Medicare", "verify Primary Insurance Type");

	}


	public void closePayerTypeWidgetStart() throws Throwable{

		new HomePage().Home_Page();
		//click(HomePage.medication_details, "details");
		sleep(sleep);
		/*		click(HomePage.DownGridBar,"Down Bar");
		click(HomePage.homeIcon,"Home Icon");*/
		if(isElementPresent(HomePage.payerTypeWidget_close, "close"))
			click(HomePage.payerTypeWidget_close,"close");

	}

	public void closePayerTypeWidgetEnd() throws Throwable{

		new HomePage().Home_Page();
		//click(HomePage.medication_details, "details");
		sleep(sleep);
		click(HomePage.DownGridBar,"Down Bar");
		click(HomePage.homeIcon,"Home Icon");
		if(isElementPresent(HomePage.payerTypeWidget_close, "close"))
			click(HomePage.payerTypeWidget_close,"close");

	}

	//Claims Management methods - Vamsi

	public void draganddropclaims() throws Throwable{

		sleep(4000);
		Actions act = new Actions(Driver);
		WebElement ClaimsManagement = Driver.findElement(By.xpath("//div[@class='hb-start-page-content']//div[@class='hb-widget-container']/div[2]/img"));

		WebElement Destination = Driver.findElement(By.xpath("//div[@class='GKGO0M2BPK']"));

		act.dragAndDrop(ClaimsManagement,Destination).build().perform();

	}

	public void draganddropBillingReport() throws Throwable{

		try {
			sleep(4000);
			Actions act = new Actions(Driver);
			WebElement ClaimsManagement = Driver.findElement(By.xpath("//div[@class='hb-start-page-content']//div[@class='hb-widget-container']/div[1]/img"));

			WebElement Destination = Driver.findElement(By.xpath("//div[@class='GKGO0M2BPK']"));

			act.dragAndDrop(ClaimsManagement,Destination).build().perform();
			sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}



	}


	public void claimManagementFlow() throws Throwable{

		sleep(3000);
		click(HomePage.VerticalBar,"Vertical Bar");
		draganddropclaims();
		sleep(5000);
		click(HomePage.ClaimHeader, "Claims Management Header");
	}

	public void bllingWidgetFlow() throws Throwable{

		sleep(3000);
		click(HomePage.VerticalBar,"Vertical Bar");
		draganddropBillingReport();
		sleep(5000);
	}

	public void claimPayerSearchValidations(String Payerxpath, String Payer) throws Throwable{

		boolean verifystatus = false;
		sleep(2000);

		selectByVisibleText(HomePage.PayerType, Payer ,"Medicare from drop down");
		sleep(8000);
		int count = Driver.findElements(By.xpath(Payerxpath)).size();
		System.out.println(count);

		try{
			for(int i=2;i<=count;i++){
				String nameText = Driver.findElement(By.xpath(Payerxpath+"["+i+"]")).getAttribute("value");
				if(nameText!= null){
					if(nameText.equalsIgnoreCase(Payer.trim())){
						verifystatus = true;	

					}else{
						verifystatus = false;
						break;
					}
				}
			}
			selectByVisibleText(HomePage.PayerType, "" ,"drop down");
			sleep(5000);

		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(verifystatus == true)
				reporter.SuccessReport("Verify "+Payer + " search results", "Successfully verified "+ Payer + " search results");
			else
				reporter.failureReport("Verify "+Payer + " search results", Payer +" search results are not Successfully verified");
		}

	}

	public void claimFirstNameSearchValidations(String Fnamexpath, String FirstName) throws Throwable{

		boolean verifystatus = false;
		type(HomePage.PatientFirstName, FirstName, "First Name field");
		sleep(8000);
		int count = Driver.findElements(By.xpath(Fnamexpath)).size();
		System.out.println(count);

		try{
			for(int i=2;i<=count;i++){
				String nameText = Driver.findElement(By.xpath(Fnamexpath+"["+i+"]")).getText();
				System.out.println(nameText);
				if(!nameText.equalsIgnoreCase("")){
					if(nameText.equalsIgnoreCase(FirstName.trim())){
						verifystatus = true;			      
					}else{
						verifystatus = false;
						break;
					}
				}
			}

			Driver.findElement(HomePage.PatientFirstName).click();
			Driver.findElement(HomePage.PatientFirstName).clear();
			sleep(5000);
			click(HomePage.Saveicon, "Save icon");
			click(HomePage.ClaimHeader, "Claims Management Header");

		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(verifystatus == true)
				reporter.SuccessReport("Verify "+FirstName + " search results", "Successfully verified "+ FirstName + " search results");
			else
				reporter.failureReport("Verify "+FirstName + " search results", FirstName +" search results are not Successfully verified");
		}

	}

	public void claimLastNameSearchValidations(String Lnamexpath, String LastName) throws Throwable{

		boolean verifystatus = false;
		type(HomePage.PatientLastName, LastName, "Last Name field");
		sleep(8000);
		int count = Driver.findElements(By.xpath(Lnamexpath)).size();
		System.out.println(count);

		try{
			for(int i=2;i<=count;i++){
				String nameText = Driver.findElement(By.xpath(Lnamexpath+"["+i+"]")).getText();
				if(!nameText.equalsIgnoreCase("")){
					if(nameText.equalsIgnoreCase(LastName.trim())){
						verifystatus = true;			      
					}else{
						verifystatus = false;
						break;
					}
				}
			}
			Driver.findElement(HomePage.PatientLastName).click();
			Driver.findElement(HomePage.PatientLastName).clear();
			sleep(5000);
			click(HomePage.Saveicon, "Save icon");
			click(HomePage.ClaimHeader, "Claims Management Header");
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(verifystatus == true)
				reporter.SuccessReport("Verify "+LastName + " search results", "Successfully verified "+ LastName + " search results");
			else
				reporter.failureReport("Verify "+LastName + " search results", LastName +" search results are not Successfully verified");
		}

	}

	public void claimIDSearchValidations(String IDxpath, String ID) throws Throwable{

		boolean verifystatus = false;
		type(HomePage.PatientID, ID, "ID field");
		sleep(8000);
		int count = Driver.findElements(By.xpath(IDxpath)).size();
		System.out.println(count);

		try{
			for(int i=2;i<=count;i++){
				String nameText = Driver.findElement(By.xpath(IDxpath+"["+i+"]")).getText();
				if(!nameText.equalsIgnoreCase("")){
					if(nameText.equalsIgnoreCase(ID.trim())){
						verifystatus = true;			      
					}else{
						verifystatus = false;
						break;
					}
				}
			}
			Driver.findElement(HomePage.PatientID).click();
			Driver.findElement(HomePage.PatientID).clear();    
			sleep(5000);
			click(HomePage.Saveicon, "Save icon");
			click(HomePage.ClaimHeader, "Claims Management Header");
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(verifystatus == true)
				reporter.SuccessReport("Verify "+ID + " search results", "Successfully verified "+ ID + " search results");
			else
				reporter.failureReport("Verify "+ID + " search results", ID +" search results are not Successfully verified");
		}

	}


	public void claimPostedDateSearchValidations(String Pdatexpath, String Pmonth, String Pdate, String Pyear) throws Throwable{

		boolean verifystatus = false;
		sleep(3000);
		selectByVisibleText(HomePage.PostedMonth, Pmonth, "Select Month from the drop down");
		sleep(5000);
		selectByVisibleText(HomePage.PostedDate, Pdate, "Select Day from the drop down");
		sleep(5000);
		selectByVisibleText(HomePage.PostedYear, Pyear, "Select Year from the drop down");
		sleep(5000);

		int count = Driver.findElements(By.xpath(Pdatexpath)).size();
		System.out.println(count);

		try{
			for(int i=2;i<=count;i++){
				String nameText = Driver.findElement(By.xpath(Pdatexpath+"["+i+"]")).getText();
				if(!nameText.equalsIgnoreCase("")){
					if(nameText.equalsIgnoreCase((Pmonth+"/"+Pdate+"/"+Pyear).trim())){
						verifystatus = true;			      
					}else{
						verifystatus = false;
						break;
					}
				}
			}
			selectByVisibleText(HomePage.PostedMonth, "MM", "Clear the drop down");
			sleep(5000);
			selectByVisibleText(HomePage.PostedDate, "DD", "Clear the drop down");
			sleep(5000);
			selectByVisibleText(HomePage.PostedYear, "YYYY", "Clear the drop down"); 
			sleep(5000);
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(verifystatus == true)
				reporter.SuccessReport("Verify Posted Date search results", "Successfully verified Posted Date search results");
			else
				reporter.failureReport("Verify Posted Date search results" , "Posted Date search results are not Successfully verified");
		}

	}


	public void claimStatusSearchValidations(String Statusxpath, String Status) throws Throwable{

		boolean verifystatus = false;
		selectByVisibleText(HomePage.StatusDropdown, Status ,"SENT from drop down");
		sleep(8000);
		int count = Driver.findElements(By.xpath(Statusxpath)).size();
		System.out.println(count);

		try{
			for(int i=2;i<=count;i++){
				String nameText = Driver.findElement(By.xpath(Statusxpath+"["+i+"]")).getAttribute("value");
				if(nameText!= null){
					if(nameText.equalsIgnoreCase(Status.trim())){
						verifystatus = true;			      
					}else{
						verifystatus = false;
						break;
					}
				}
			}
			selectByVisibleText(HomePage.StatusDropdown, "" ,"Clear the drop down");
			sleep(5000);

		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(verifystatus == true)
				reporter.SuccessReport("Verify "+Status + " search results", "Successfully verified "+ Status + " search results");
			else
				reporter.failureReport("Verify "+Status + " search results", Status +" search results are not Successfully verified");
		}

	}




	public void claimStatusDateSearchValidations(String Sdatexpath, String Smonth, String Sdate, String Syear) throws Throwable{

		boolean verifystatus = false;
		sleep(3000);
		selectByVisibleText(HomePage.StatusMonth, Smonth, "Select Month from the drop down");
		sleep(5000);
		selectByVisibleText(HomePage.StatusDate, Sdate, "Select Day from the drop down");
		sleep(5000);
		selectByVisibleText(HomePage.StatusYear, Syear, "Select Year from the drop down");
		sleep(5000);

		int count = Driver.findElements(By.xpath(Sdatexpath)).size();
		System.out.println(count);

		try{
			for(int i=2;i<=count;i++){
				String nameText = Driver.findElement(By.xpath(Sdatexpath+"["+i+"]")).getText();
				if(!nameText.equalsIgnoreCase("")){
					if(nameText.equalsIgnoreCase((Smonth+"/"+Sdate+"/"+Syear).trim())){
						verifystatus = true;			      
					}else{
						verifystatus = false;
						break;
					}
				}
			}
			selectByVisibleText(HomePage.StatusMonth, "MM", "Clear the drop down");
			sleep(5000);
			selectByVisibleText(HomePage.StatusDate, "DD", "Clear the drop down");
			sleep(5000);
			selectByVisibleText(HomePage.StatusYear, "YYYY", "Clear the drop down");
			sleep(5000);
			click(HomePage.Saveicon, "Save icon");
			click(HomePage.Closeicon, "Close");

		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(verifystatus == true)
				reporter.SuccessReport("Verify Status Date search results", "Successfully verified Status Date search results");
			else
				reporter.failureReport("Verify Status Date search results" , "Status Date search results are not Successfully verified");
		}

	}


	public void claimManagementNeoTabFlow() throws Throwable{

		sleep(3000);
		click(HomePage.VerticalBar,"Vertical Bar");
		draganddropclaims();
		sleep(5000);
		click(HomePage.ClaimHeader, "Claims Management Header");
		click(HomePage.NoesTab, "Noes Tab");
		sleep(10000);
	}


	//Noes Tab 
	public void noesIDSearchValidations(String NIDxpath, String NoesID) throws Throwable{

		boolean verifystatus = false;
		type(HomePage.NoesID, NoesID, "Noes ID field");
		sleep(5000);
		int count = Driver.findElements(By.xpath(NIDxpath)).size();
		System.out.println(count);

		try{
			for(int i=2;i<=count;i++){
				String nameText = Driver.findElement(By.xpath(NIDxpath+"["+i+"]")).getText();
				if(!nameText.equalsIgnoreCase("")){
					if(nameText.equalsIgnoreCase(NoesID.trim())){
						verifystatus = true;			      
					}else{
						verifystatus = false;
						break;
					}
				}
			}
			Driver.findElement(HomePage.NoesID).click();
			Driver.findElement(HomePage.NoesID).clear();    
			sleep(2000);
			click(HomePage.OutStandingTab, "Outstanding Tab");
			click(HomePage.NoesTab, "Noes Tab");

		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(verifystatus == true)
				reporter.SuccessReport("Verify "+NoesID + " search results", "Successfully verified "+ NoesID + " search results");
			else
				reporter.failureReport("Verify "+NoesID + " search results", NoesID +" search results are not Successfully verified");
		}

	}



	public void noesFirstNameSearchValidations(String NFxpath, String FirstName) throws Throwable{

		boolean verifystatus = false;
		type(HomePage.NoesFirstName, FirstName, "First Name field");
		sleep(5000);
		int count = Driver.findElements(By.xpath(NFxpath)).size();
		System.out.println(count);

		try{
			for(int i=2;i<=count;i++){
				String nameText = Driver.findElement(By.xpath(NFxpath+"["+i+"]")).getText();
				if(!nameText.equalsIgnoreCase("")){
					if(nameText.equalsIgnoreCase(FirstName.trim())){
						verifystatus = true;			      
					}else{
						verifystatus = false;
						break;
					}
				}
			}

			Driver.findElement(HomePage.NoesFirstName).click();
			Driver.findElement(HomePage.NoesFirstName).clear();    
			sleep(2000);
			click(HomePage.OutStandingTab, "Outstanding Tab");
			click(HomePage.NoesTab, "Noes Tab");

		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(verifystatus == true)
				reporter.SuccessReport("Verify "+FirstName + " search results", "Successfully verified "+ FirstName + " search results");
			else
				reporter.failureReport("Verify "+FirstName + " search results", FirstName +" search results are not Successfully verified");
		}

	}

	public void noesLastNameSearchValidations(String NLxpath, String LastName) throws Throwable{

		boolean verifystatus = false;
		type(HomePage.NoesLastName, LastName, "Last Name field");
		sleep(8000);
		int count = Driver.findElements(By.xpath(NLxpath)).size();
		System.out.println(count);

		try{
			for(int i=2;i<=count;i++){
				String nameText = Driver.findElement(By.xpath(NLxpath+"["+i+"]")).getText();
				if(!nameText.equalsIgnoreCase("")){
					if(nameText.equalsIgnoreCase(LastName.trim())){
						verifystatus = true;			      
					}else{
						verifystatus = false;
						break;
					}
				}
			}

			Driver.findElement(HomePage.NoesLastName).click();
			Driver.findElement(HomePage.NoesLastName).clear();    
			sleep(2000);
			click(HomePage.OutStandingTab, "Outstanding Tab");
			click(HomePage.NoesTab, "Noes Tab");

		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(verifystatus == true)
				reporter.SuccessReport("Verify "+LastName + " search results", "Successfully verified "+ LastName + " search results");
			else
				reporter.failureReport("Verify "+LastName + " search results", LastName +" search results are not Successfully verified");
		}

	}


	public void noesInsuranceSearchValidations(String NIxpath, String Insurance) throws Throwable{

		boolean verifystatus = false;
		type(HomePage.NoesInsurance, Insurance, "Insurance field");
		sleep(8000);
		int count = Driver.findElements(By.xpath(NIxpath)).size();
		System.out.println(count);

		try{
			for(int i=2;i<=count;i++){
				String nameText = Driver.findElement(By.xpath(NIxpath+"["+i+"]")).getAttribute("value");
				if(!nameText.equalsIgnoreCase("")){
					if(nameText.equalsIgnoreCase(Insurance.trim())){
						verifystatus = true;			      
					}else{
						verifystatus = false;
						break;
					}
				}
			}

			Driver.findElement(HomePage.NoesInsurance).click();
			Driver.findElement(HomePage.NoesInsurance).clear();    
			sleep(2000);
			click(HomePage.OutStandingTab, "Outstanding Tab");
			click(HomePage.NoesTab, "Noes Tab");


		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(verifystatus == true)
				reporter.SuccessReport("Verify "+Insurance + " search results", "Successfully verified "+ Insurance + " search results");
			else
				reporter.failureReport("Verify "+Insurance + " search results", Insurance +" search results are not Successfully verified");
		}

	}


	public void noesTOBSearchValidations(String TOBxpath, String TOB) throws Throwable{

		boolean verifystatus = false;
		selectByVisibleText(HomePage.NoesTOB, TOB, "TOB drop down");
		sleep(6000);
		int count = Driver.findElements(By.xpath(TOBxpath)).size();
		System.out.println(count);

		try{
			for(int i=2;i<=count;i++){
				String nameText = Driver.findElement(By.xpath(TOBxpath+"["+i+"]")).getAttribute("value");
				if(nameText!=null){
					if(nameText.equalsIgnoreCase(TOB.trim())){
						verifystatus = true;			      
					}else{
						verifystatus = false;
						break;
					}
				}
			}

			selectByVisibleText(HomePage.NoesTOB, "", "Clear the drop down");
			sleep(5000);

		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(verifystatus == true)
				reporter.SuccessReport("Verify "+TOB + " search results", "Successfully verified "+ TOB + " search results");
			else
				reporter.failureReport("Verify "+TOB + " search results", TOB +" search results are not Successfully verified");
		}

	}


	public void noesAPhysicianSearchValidations(String Aphysicianxpath, String APhysician) throws Throwable{

		boolean verifystatus = false;
		type(HomePage.NoesAPhysician, APhysician, "Attending Physician field");
		sleep(5000);
		int count = Driver.findElements(By.xpath(Aphysicianxpath)).size();
		System.out.println(count);

		try{
			for(int i=2;i<=count;i++){
				String nameText = Driver.findElement(By.xpath(Aphysicianxpath+"["+i+"]")).getText();
				if(!nameText.equalsIgnoreCase("")){
					if(nameText.equalsIgnoreCase(APhysician.trim())){
						verifystatus = true;			      
					}else{
						verifystatus = false;
						break;
					}
				}
			}

			Driver.findElement(HomePage.NoesAPhysician).click();
			Driver.findElement(HomePage.NoesAPhysician).clear();    
			sleep(2000);
			click(HomePage.OutStandingTab, "Outstanding Tab");
			click(HomePage.NoesTab, "Noes Tab"); 

		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(verifystatus == true)
				reporter.SuccessReport("Verify "+APhysician + " search results", "Successfully verified "+ APhysician + " search results");
			else
				reporter.failureReport("Verify "+APhysician + " search results", APhysician +" search results are not Successfully verified");
		}

	}


	public void noesCPhysicianSearchValidations(String Cphysicianxpath, String CPhysician) throws Throwable{

		boolean verifystatus = false;
		type(HomePage.NoesCPhysician, CPhysician, "Certifying Physician field");
		sleep(5000);
		int count = Driver.findElements(By.xpath(Cphysicianxpath)).size();
		System.out.println(count);

		try{
			for(int i=2;i<=count;i++){
				String nameText = Driver.findElement(By.xpath(Cphysicianxpath+"["+i+"]")).getText();
				if(!nameText.equalsIgnoreCase("")){
					if(nameText.equalsIgnoreCase(CPhysician.trim())){
						verifystatus = true;			      
					}else{
						verifystatus = false;
						break;
					}
				}
			}

			Driver.findElement(HomePage.NoesCPhysician).click();
			Driver.findElement(HomePage.NoesCPhysician).clear();    
			sleep(2000);
			click(HomePage.OutStandingTab, "Outstanding Tab");
			click(HomePage.NoesTab, "Noes Tab");

		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(verifystatus == true)
				reporter.SuccessReport("Verify "+CPhysician + " search results", "Successfully verified "+ CPhysician + " search results");
			else
				reporter.failureReport("Verify "+CPhysician + " search results", CPhysician +" search results are not Successfully verified");
		}

	}


	public void noesStatusSearchValidations(String NStatusxpath, String NStatus) throws Throwable{

		boolean verifystatus = false;
		sleep(8000);
		selectByVisibleText(HomePage.NoesStatus, NStatus, "Status drop down");
		sleep(5000);
		int count = Driver.findElements(By.xpath(NStatusxpath)).size();
		System.out.println(count);

		try{
			for(int i=2;i<=count;i++){
				String nameText = Driver.findElement(By.xpath(NStatusxpath+"["+i+"]")).getText();
				if(!nameText.equalsIgnoreCase("")){
					if(nameText.equalsIgnoreCase(NStatus.trim())){
						verifystatus = true;			      
					}else{
						verifystatus = false;
						break;
					}
				}
			}

			selectByVisibleText(HomePage.NoesStatus, "", "Clear the drop down");
			click(HomePage.Saveicon, "Save icon");
			click(HomePage.Closeicon, "Close");

		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(verifystatus == true)
				reporter.SuccessReport("Verify "+NStatus + " search results", "Successfully verified "+ NStatus + " search results");
			else
				reporter.failureReport("Verify "+NStatus + " search results", NStatus +" search results are not Successfully verified");
		}

	}


	//03172016

	public void verifyPatientInfo(Hashtable<String, String> data, String vstrAllergyName) throws Throwable{

		PatientPage.Patient_Page();
		click(PatientPage.patientInfoIcon, "patient Info Icon");
		Thread.sleep(sleepTime_chrome);
		type(PatientPage.patientFirstName, data.get("patientFirstName"), "Patient first name field");
		sleep(3000);

		if(isElementPresent(PatientPage.topDisplayedPatient, "Patient Name")){

			billingReportFlow(data);

		}else{

			type(PatientPage.patientLastName, data.get("patientLastName"), "Lastname field");
			sleep(3000);
			click(PatientPage.addPatientIcon_patientListing, "add Patient Icon in adding new patient");
			Thread.sleep(sleepTime_chrome);
			setDemographicsInfo(data);
			setRefferalInfo(data);
			setBasicInfo(data);
			setPhysicianInfo(data);
			setConcernsInfo(data);
			setNotesInfo(data);
			goToDiagnosisTab();
			sleep(5000);
			setDiagnosisInfo(data,data.get("ICD10Code"),data.get("ICDCode"));
			goToAllergiesTab();
			sleep(5000);
			setAllergyData(data, vstrAllergyName);
			admitPatient(data);
			goToInsuranceTab();
			sleep(5000);
			addDefaultInfoInInsuranceTab("Medicare");
			appendLetterToPolicyNumber("A");
			clickOnAddInsuranceButton();
			goToHistoryTab();
			sleep(5000);
			setInsuranceInHistoryTab(data, "Medicare");
			goToInsuranceTab();
			sleep(5000);
			goToElectionsForInsurer("Medicare");
			click_AttendingPhysician_priInsurer();
			VerbalAndSignatureDates_attendingPhysician(data);
			selectHospicePhysicianForPriMaryInsurer_electionGrid(data);
			VerbalAndSignatureDates_hospicePhysician(data);
			close_ElectionGrid();
			billingReportFlow(data);

		}

		 sleep(3000);
	}


	public void billingReportFlow(Hashtable<String, String> data) throws Throwable{

		sleep(2000);
		click(HomePage.DownGridBar, "DownGrid Bar");
		sleep(2000);
		click(HomePage.homeIcon, "Home icon");
		sleep(2000);
		claimManagementFlow();
		sleep(4000);
		click(HomePage.NotSentTab, "NotSent Tab");
		sleep(5000);
		zoomOut();
		sleep(4000);
		//03212016
		generateClaims(data);

		type(PatientPage.patientFirstNameReport, data.get("patientFirstName"), "Patient first name field");
		sleep(4000);
		//03212016
		//clickUsingJavascriptExecutor(HomePage.ClaimsNotSentGearIcon, "Gear icon");
		//Driver.findElement(HomePage.ClaimsNotSentGearIcon).click();
		click(HomePage.ClaimsNotSentGearIcon, "Gear icon");
		
		sleep(6000);
		clickUsingJavascriptExecutor(HomePage.BillingReportLink, "Billing Report Link");
		sleep(5000);
		assertTextMatching(HomePage.BillPrimaryInsurance, data.get("Insurance"), "Insurance");
		assertTextMatching(HomePage.BillPolicyHolder, data.get("patientFirstName"), "Patient First Name");
		assertTextMatching(HomePage.BillPolicyNumber, data.get("PolicyNumber"), "Policy Number");
		assertTextMatching(HomePage.BillDiganosisCode, data.get("ICDCode"), "Diagnosis Code");
		//03212016
		assertTextMatching(HomePage.BillDateRange, "02/16/16 - 02/29/16", "Date Range");
		assertTextMatching(HomePage.BillStartDate, "02/16/16", "Start Date");
		assertTextMatching(HomePage.BillEndDate, "02/29/16", "End Date");
		clickUsingJavascriptExecutor(HomePage.BillingTickMark, "Billing Report Tick mark");
		//click(HomePage.BillingWidgetsaveButton, "save Button");
		clickUsingJavascriptExecutor(HomePage.BillingWidgetsaveButton, "save icon");
		sleep(2000);
	}

	public void closeClaims() throws Exception{

		new HomePage().Home_Page();
		sleep(2000);
		Driver.findElement(HomePage.Closeicon).click();
	}

	public void zoomOut(){
		try{

			//WebDriverBackedSelenium.focus(By.xpath("(//div[text()='CLAIMS MANAGEMENT'])[2]"));
			Robot robot = new Robot();
			robot.delay(1000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			sleep(2000);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	public void zoomIn(){
		try{

			//WebDriverBackedSelenium.focus(By.xpath("(//div[text()='CLAIMS MANAGEMENT'])[2]"));
			Robot robot = new Robot();
			robot.delay(1000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ADD);
			sleep(2000);
			robot.keyRelease(KeyEvent.VK_ADD);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	public void verifyRevenueDetailsInfo(Hashtable<String, String> data, String vstrAllergyName) throws Throwable{

		PatientPage.Patient_Page();
		click(PatientPage.patientInfoIcon, "patient Info Icon");
		Thread.sleep(sleepTime_chrome);
		type(PatientPage.patientFirstName, data.get("patientFirstName"), "Patient first name field");
		sleep(3000);

		if(isElementPresent(PatientPage.topDisplayedPatient, "Patient Name")){

			revenueDetailsFlow(data);

		}else{

			type(PatientPage.patientLastName, data.get("patientLastName"), "Lastname field");
			sleep(3000);
			click(PatientPage.addPatientIcon_patientListing, "add Patient Icon in adding new patient");
			Thread.sleep(sleepTime_chrome);
			setDemographicsInfo(data);
			setRefferalInfo(data);
			setBasicInfo(data);
			setPhysicianInfo(data);
			setConcernsInfo(data);
			setNotesInfo(data);
			goToDiagnosisTab();
			sleep(5000);
			setDiagnosisInfo(data,data.get("ICD10Code"),data.get("ICDCode"));
			goToAllergiesTab();
			sleep(5000);
			setAllergyData(data, vstrAllergyName);
			admitPatient(data);
			goToInsuranceTab();
			sleep(5000);
			addDefaultInfoInInsuranceTab("Medicare");
			appendLetterToPolicyNumber("A");
			clickOnAddInsuranceButton();
			goToHistoryTab();
			sleep(5000);
			setPrimaryInsuranceInHistoryTab(data, "Medicare");
			goToInsuranceTab();
			sleep(5000);
			goToElectionsForInsurer("Medicare");
			click_AttendingPhysician_priInsurer();
			VerbalAndSignatureDates_attendingPhysician(data);
			selectHospicePhysicianForPriMaryInsurer_electionGrid(data);
			VerbalAndSignatureDates_hospicePhysician(data);
			close_ElectionGrid();
			revenueDetailsFlow(data);

		}
		  sleep(3000);

	}

	public void verifybillingReportInfo(Hashtable<String, String> data) throws Throwable{


		bliingWidgetDetailsFlow(data);
	}

	public void revenueDetailsFlow(Hashtable<String, String> data) throws Throwable{

		sleep(2000);
		click(HomePage.DownGridBar, "DownGrid Bar");
		sleep(2000);
		click(HomePage.homeIcon, "Home icon");
		sleep(2000);
		claimManagementFlow();
		sleep(4000);
		click(HomePage.NotSentTab, "NotSent Tab");
		sleep(5000);
		zoomOut();
		sleep(4000);
		//03212016
		generateClaims(data);

		type(PatientPage.patientFirstNameReport, data.get("patientFirstName"), "Patient first name field");
		sleep(5000);

		//03172016
	/*	String ID = Driver.findElement(HomePage.MainGridID).getText();
		String PostedDate = Driver.findElement(HomePage.MainGridPostedDate).getText();
		String Claim = Driver.findElement(HomePage.MainGridClaim).getAttribute("value");
		String DateRange = Driver.findElement(HomePage.MainGridDateRange).getText();
		String Status = Driver.findElement(HomePage.MainGridStatus).getText();*/

		//clickUsingJavascriptExecutor(HomePage.ClaimsNotSentGearIcon, "Gear icon");
		Driver.findElement(HomePage.ClaimsNotSentGearIcon).click();
		
		sleep(6000);
		clickUsingJavascriptExecutor(HomePage.RevenueDetailsLink, "Revenue Details Link");
		sleep(5000);
		assertTextMatching(HomePage.RevenueFirstName, data.get("patientFirstName"), "Patient First Name");
		assertTextMatching(HomePage.RevenueLastName, data.get("patientLastName"), "Patient Last Name");
/*		assertTextMatching(HomePage.RevenueID, ID, "Patient ID");
		assertTextMatchingWithAttribute(HomePage.RevenueClaim, Claim, "Claim");
		assertTextMatching(HomePage.RevenuePostedDate, PostedDate, "Posted Date");
		assertTextMatching(HomePage.RevenueStatus, Status, "Status");*/
		//assertTextMatching(HomePage.RevenueDateRange, DateRange, "Date Range");

		//03212016
		assertTextMatchingWithAttribute(HomePage.RevenuePayer, data.get("ClaimsPayer"), "Revenue Payer Type");
		assertTextMatching(HomePage.RevenueDate, data.get("admitMonth") + "/" + data.get("admitDay") + "/" + data.get("admitYear"), "Revenue Details Date");
		clickUsingJavascriptExecutor(HomePage.RevenueDetailsTickMark, "Revenue Details Tick mark");
		sleep(2000);
		/*click(HomePage.BillingWidgetsaveButton, "save Button");*/
		clickUsingJavascriptExecutor(HomePage.BillingWidgetsaveButton, "save icon");
		sleep(2000);

	}

	public void bliingWidgetDetailsFlow(Hashtable<String, String> data) throws Throwable{


		sleep(2000);
		bllingWidgetFlow();	
		click(HomePage.selectMonth, "Month");
		sleep(8000);
		


	}

	public void verifyWidgetDetailsFlow(Hashtable<String, String> data) throws Throwable{
		
		sleep(5000);

		String Date = Driver.findElement(HomePage.verifyDate).getText();
		String DateRange = Driver.findElement(HomePage.verifyDateRange).getText();

		assertTextMatching(HomePage.verifyDate, Date, "Date");

		System.out.println("Date is  "+Date+" and DateRange is "+DateRange);

		String[] str = DateRange.split("-");

		System.out.println(str[0]+"  "+str[1]);

		String[] day = str[1].split("/");

		int Intday = Integer.parseInt(day[1]);

		System.out.println("Intday is "+Intday);

		if(Intday<=31)
		{
			reporter.SuccessReport("Verify day field in date raneg", "Day is lesser than or equals 31");
		}

	}

	public void verifyWidgetNextPatient(Hashtable<String, String> data) throws Throwable{

		sleep(5000);
		scroll(HomePage.verifyDateRangeNextPatient, "scroll down");
		sleep(2000);

		String DateRange = Driver.findElement(HomePage.verifyDateRangeNextPatient).getText();


		String[] str = DateRange.split("-");

		System.out.println(str[0]+"  "+str[1]);

		String[] day = str[1].split("/");

		int Intday = Integer.parseInt(day[1]);

		System.out.println("Intday is "+Intday);

		if(Intday<=31)
		{
			reporter.SuccessReport("Verify day field in date raneg", "Day is greater than 31");
		}
		
		click(HomePage.BillingWidgetsaveButton, "save Button");
		sleep(2000);

	}



	//03212016
	public void generateClaims(Hashtable<String, String> data) throws Throwable{

		clickUsingJavascriptExecutor(HomePage.GenerateClaims, "Generate Claims");
		sleep(2000);
		selectByVisibleText(HomePage.ClaimsPayerType, data.get("ClaimsPayer"), "Select Medicare from the down");
		sleep(2000);
		type(HomePage.ClaimsPatient, data.get("patientFirstName"), "Patient Name field");
		sleep(4000);
		//click(HomePage.ClaimsPatientDrpDwn, "Select Patient Name");
		clickUsingJavascriptExecutor(HomePage.ClaimsPatientDrpDwn, "Select Patient Name");
		sleep(3000);
		clickUsingJavascriptExecutor(HomePage.ClaimOK, "OK button");
		sleep(15000);
		clickUsingJavascriptExecutor(HomePage.ClaimsXMLOk, "OK button");
		sleep(8000);
	}

}




