package com.Mumms.page;

import org.openqa.selenium.By;
import com.automation.accelerators.ActionEngine;

public class ReportsPage extends ActionEngine {

	public static By ReportIcon;
	public static By ReportTab;
	public static By MedlineReport;
	public static By BeginDateMonth;
	public static By BeginDateDay;
	public static By BeginDateYear;
	public static By EndDateMonth;
	public static By EndDateDay;
	public static By EndDateYear;
	public static By GenerateReport;
	public static By MedlineReportHeader;
	
	public static By MedlineFileType;
	public static By MedlineFileDownload;
	public static By MedlineFirstName;
	public static By MedlineLastName;
	public static By MedlineFacility;
	public static By MedlineStreet;
	public static By MedlineRoomNumber;
	public static By MedlineCity;
	public static By MedlineState;
	public static By MedlineCounty;
	public static By MedlineZip;
	public static By MedlineCountry;
	public static By MedlineTeam;
	public static By MedlinePayer;
	public static By MedlineHHRG;
	public static By MedlinePatientID;
	public static By MedlineICD10_1;
	public static By MedlineICD10_2;
	public static By MedlineICD10_3;
	public static By MedlineICD10_4;
	public static By MedlinePhone;
	public static By MedlineNotes;
	public static By CAHPSLink;
	public static By CAHPSMonth;
	public static By CAHPSYear;
	
	//03222016
	public static By CAHPHeader;
	public static By CAHPProvideName;
	public static By CAHPBranch;
	public static By CAHPProvideID;
	public static By CAHPNPI;
	public static By CAHPFacilityName;
	public static By CAHPSampleMonth;
	public static By CAHPSampleYear;
	public static By CAHPTotalCharges;
	
	
	public void Reports_Page()

	{
		 
		ReportIcon = By.xpath(".//*[@id='gwt-debug-reports-module-button']/tbody/tr[1]/td/div/img");
		ReportTab = By.xpath(".//*[@value='New Report...']");
		MedlineReport = By.xpath("//div[text()='Medline Report']");
		BeginDateMonth = By.xpath(".//*[@id='gwt-debug-p_from_date']//select[contains(@class,'month')]");
		BeginDateDay = By.xpath(".//*[@id='gwt-debug-p_from_date']//select[contains(@class,'day')]");
		BeginDateYear = By.xpath(".//*[@id='gwt-debug-p_from_date']//select[contains(@class,'year')]");
		EndDateMonth = By.xpath(".//*[@id='gwt-debug-p_to_date']//select[contains(@class,'month')]");
		EndDateDay = By.xpath(".//*[@id='gwt-debug-p_to_date']//select[contains(@class,'day')]");
		EndDateYear = By.xpath(".//*[@id='gwt-debug-p_to_date']//select[contains(@class,'year')]");
		GenerateReport = By.xpath("//button[text()='GENERATE REPORT']");
		MedlineReportHeader = By.xpath("//div[@class='draggable-label hb-mouse-over-dragable']//div[text()='Medline Report']");
		MedlineFileType = By.xpath("//label[text()='Export As:']");
		MedlineFileDownload = By.xpath("//button[text()='Download']");
		MedlineFirstName = By.xpath("//span[text()='First Name']");
		MedlineLastName = By.xpath("//span[text()='LastName']");
		MedlineFacility = By.xpath("//div[text()='Facility']");
		MedlineStreet = By.xpath("//span[text()='Street']");
		MedlineRoomNumber = By.xpath("//span[text()='Room Number']");
		MedlineCity = By.xpath("//span[text()='City']");
		MedlineState = By.xpath("//span[text()='State']");
		MedlineCounty = By.xpath("//span[text()='County']");
		MedlineZip = By.xpath("//span[text()='Zip']");
		MedlineCountry = By.xpath("//span[text()='Country']");
		MedlineTeam = By.xpath("//span[text()='Team']");
		MedlinePayer = By.xpath("//span[text()='Payer']");
		MedlineHHRG = By.xpath("//span[text()='HHRG']");
		MedlinePatientID = By.xpath("//span[text()='PatientID']");
		MedlineICD10_1 = By.xpath("//span[text()='ICD10_1']");
		MedlineICD10_2 = By.xpath("//span[text()='ICD10_2']");
		MedlineICD10_3 = By.xpath("//span[text()='ICD10_3']");
		MedlineICD10_4 = By.xpath("//span[text()='ICD10_4']");
		MedlinePhone = By.xpath("//span[text()='Phone']");
		MedlineNotes = By.xpath("//span[text()='Notes']");
		CAHPSLink = By.xpath("//div[@class='GKGO0M2BPK']//div[text()='CAHPS (DSS)']");
		CAHPSMonth = By.xpath("//div[@class='hb-formbox-header hb-vertically-aligned']/following-sibling::table//tr[1]/td[2]/select");
		CAHPSYear = By.xpath("//div[@class='hb-formbox-header hb-vertically-aligned']/following-sibling::table//tr[2]/td[2]/select");
		//GenerateReport = By.xpath("//button[text()='GENERATE REPORT']");
		
		
		CAHPHeader = By.xpath("//div[@class='draggable-label hb-mouse-over-dragable']//div[text()='CAHPS (DSS)']");
		CAHPProvideName = By.xpath("//span[text()='ProviderName']");
		CAHPBranch = By.xpath("//span[text()='Branch']");
		CAHPProvideID = By.xpath("//span[text()='ProviderID']");
		CAHPNPI = By.xpath("//span[text()='NPI']");
		CAHPFacilityName = By.xpath("//span[text()='FacilityName']");
		CAHPSampleMonth= By.xpath("//span[text()='SampleMonth']");
		CAHPSampleYear = By.xpath("//span[text()='SampleYear']");
		CAHPTotalCharges=  By.xpath("//span[text()='TotalLiveDischarges']");
		
		
		
	}
}