package com.Mumms.page;

import org.openqa.selenium.By;

import com.automation.support.ConfiguratorSupport;

public class PatientPage {
	
	public static By firstContactDisplayed;
	public static By firstContactDisplayedLink;
	public static By topNameDisplayedOnContactHeader;
	
	public static By AccountTab ;
	public static By AccountTitle ;
	public static By Acconts_DropDown ;
	public static By Tabledata ;
	public static By Tabledata_DropDown_All ;
	public static By Acconts_Display;
	public static By Acconts_Detail;
	public static By Account_Teams;
	public static By GoBtn;
	public static By Account_Go_cigniti1;
	public static By Account_Go_cigniti1_title;
	
	public static By newAccount_title;
	public static By view_Hierarchy;
	public static By Account_Hierarchy;
	

	public static By homeTab;
	public static By accountsTab;
	public static By listview;
	public static By goButton;
	public static By tableData;
	public static By accountName;
	public static By accountDetail;
	public static By salesRep;

	public static By newAccount;
	public static By name;
	public static By type;
	public static By website;
	public static By description;
	public static By parentAccount;
	public static By phone;
	public static By industry;
	public static By employees;
	public static By billingStreet;
	public static By billingState;
	public static By billingCity;
	public static By billingZip;
	public static By billingCountry;

	public static By shippingStreet;
	public static By shippingState;
	public static By shippingCity;
	public static By shippingZip;
	public static By shippingCountry;
	public static By save;
	public static By descText;

	public static By newContact;
	public static By saluatation;
	public static By firstName;
	public static By middleName;
	public static By lastName;
	public static By suffix;
	public static By email;
	public static By title;
	public static By mobile;
	public static By reportsTo;
	public static By department;
	public static By fax;
	public static By mailingStreet;
	public static By mailingState;
	public static By mailingCity;
	public static By mailingZip;
	public static By mailingCountry;
	public static By contactSave;
	public static By contactsData;

	public static By reportsTab;
	public static By newReport;
	public static By newReportPage;
	public static By amountColumn;
	public static By opportunities;
	public static By create;
	public static By add;
	
	
	public static By homeicon;
	public static By mmenu;
	public static By loginlink;
	public static By emailid;
	public static By password;
	public static By signin;
	public static By search;
	public static By submit;

	public static By Hometab;
	public static By Accountstab;
	public static By view;
	public static By gobtn;
	public static By ExistAccountname;
	public static By saleslist;
	public static By newcontactbtn;
	public static By cancelbtn;
	public static By billingAddress;
	public static By shippingAddress;
	public static By showAddressSection;
	public static By hideAddressSection;
	public static By newTaskBtn;
	public static By newEventBtn;
	public static By editBtn;
	public static By phoneNumber;

	public static By phoneAfterSave;
	

	public static By filter;
	public static By filterValue;
	public static By ok;
	public static By runReport;
	public static By newReportData;
	public static By edit;
	public static By postalZip;
	public static By territoriesSave;
	public static By Hierarchy_Row;
	
	
	public static By accountData;

	public static By businessUnit;

	public static By contactsTable;
	public static By reportHeader;
	public static By accountsDetailSection;
	public static By newContactButton;
	public static By contactsTableData;
	public static By accountTeamHyperlink;
    public static By teamMember;
    public static By teamRole;
    public static By accountDetail_AccountName;
    public static By viewHierarchy_ParentAccount;
    public static By viewHierarchy_GrandParentAccount;
    public static By baseAccount;
    public static By competitorProductsName;
    public static By competitorProductDetailPageTitle;
	public static By competitorProductsNameOnCompetitorsPage;
	
	public static By contactsHyperlink;
	public static By contacts_contactNameOnMouseHover;

	public static By opportunitiesHyperlink;
	public static By opportunity_nameOnMouseHover;
	public static By opportunity_stageOnMouseHover;

	public static By openActivitiesHyperlink;
	public static By openActivities_subjectOnMouseHover;
	public static By openActivities_relatedTo;
	
	public static By contactsDisplayedTableData;
	public static By lpdBusinessPlanTextArea;
	public static By lpdBussinessAreaTextAfterSave;


	//public static ConfiguratorSupport configProps = new ConfiguratorSupport("config.properties");

	public void AccountsPage()

	{
		//if(configProps.getProperty("platformType").equalsIgnoreCase("Web_Fullscreen"))
		{

			AccountTab = By.xpath(".//*[@id='Account_Tab']/a");
			AccountTitle = By.xpath(".//*[@class='pageType']");
			Acconts_DropDown = By.xpath(".//*[@title='View:']");
			Tabledata=By.xpath(".//*[@id='ext-gen8']");
			Tabledata_DropDown_All=By.xpath(".//*[@id='00B28000003cpz1_listBody']");
			Acconts_Display = By.xpath(".//*[@id='bodyCell']/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th/a");
			Acconts_Detail = By.xpath(".//*[@id='ep']/div[1]/table/tbody/tr/td[1]/h2");
			Account_Teams = By.xpath(".//*[@id='00128000002TiYc_RelatedAccountSalesTeam_link']/span");
			GoBtn = By.xpath(".//*[@title='Go!']");
			Account_Go_cigniti1 = By.xpath(".//*[@id='00128000002TiYc_Name']/a/span");
			Account_Go_cigniti1_title = By.xpath(".//*[@id='contactHeaderRow']/div[2]/h2");
			newAccount = By.xpath(".//*[@id='00128000002TiYc_RelatedContactList']/div[1]/div/div[1]/table/tbody/tr/td[2]/input[1]");
			newAccount_title = By.xpath(".//*[@id='bodyCell']/div[1]/div[1]/div[1]/h2");
			view_Hierarchy = By.xpath(".//a[text()='[View Hierarchy]']");
			Account_Hierarchy = By.xpath(".//*[@class='pageType']");

			homeTab = By.xpath(".//*[@id='home_Tab']/a");
			accountsTab = By.xpath("//a[text()='Accounts']");
			goButton = By.xpath(".//*[@title='Go!']");
			tableData = By.xpath("//div[@id='ext-gen21']/div/div[2]/div");
			accountName = By.xpath(".//*[@id='00128000008utgr_Name']/a/span");
			accountDetail = By.xpath(".//*[@id='contactHeaderRow']/div[2]/h2");

			newAccount = By.xpath(".//*[@id='hotlist']/table/tbody/tr/td[2]/input");
			type = By.id("acc6");
			website = By.id("acc12");
			description = By.xpath(".//*[@id='acc20']");
			parentAccount = By.id("acc3");
			phone = By.id("acc10");
			industry = By.id("acc7");
			employees = By.id("acc15");
			billingStreet = By.id("acc17street");
			billingCity = By.id("acc17city");
			billingState = By.id("acc17state");
			billingZip = By.id("acc17zip");
			billingCountry = By.id("acc17country");
			shippingStreet = By.id("acc18street");
			shippingCity = By.id("acc18city");
			shippingState = By.id("acc18state");
			shippingZip = By.id("acc18zip");
			shippingCountry = By.id("acc18country");
			save = By.xpath(".//*[@id='bottomButtonRow']/input[1]");

			saluatation = By.xpath(".//*[@id='name_salutationcon2']");
			firstName = By.id("name_firstcon2");
			middleName = By.id("name_middlecon2");
			suffix = By.id("name_suffixcon2");
			email = By.id("con15");
			title = By.id("con5");
			mobile = By.id("con12");
			reportsTo = By.id("con8");
			department = By.id("con6");
			fax = By.id("con11");
			mailingStreet = By.id("con19street");
			mailingCity = By.id("con19city");
			mailingState = By.id("con19state");
			mailingZip = By.id("con19zip");
			mailingCountry = By.id("con19country");
			contactSave = By.xpath(".//*[@title='Save']");
			contactsData = By.id("ext-gen25");

			reportsTab = By.xpath(".//*[@id='report_Tab']/a");
			newReport = By.xpath(".//*[@id='ext-gen5']/input[1]");
			newReportPage = By
					.xpath(".//*[@id='bodyTable']/tbody/tr/td/div[1]/div/div[1]/h1");
			amountColumn = By.xpath(".//*[@id='headerRow_0']/th[4]/a/strong");
			opportunities = By
					.xpath(".//*[@id='ext-gen10']/div/li[2]/div/a/span");
			create = By.xpath(".//*[@id='thePage:rtForm:createButton']");
			add = By.xpath(".//*[@id='filterPanel_addFilterButton']/tbody/tr[2]/td[2]/em");
			filter = By.xpath(".//*[@id='ext-gen262']");
			filterValue = By.xpath(".//*[@id='val-ext-gen257']");
			ok = By.xpath(".//*[@id='ok-btn-id-ext-gen258']");
			runReport = By.xpath(".//*[@id='ext-gen63']");
			newReportData = By
					.xpath(".//*[@id='report']/div[2]/div/div[2]/div/div/div[1]/div");

			edit = By.xpath(".//*[@id='topButtonRow']/input[3]");
			postalZip = By.xpath(".//*[@id='acc17zip']");
			territoriesSave = By.xpath(".//*[@id='bottomButtonRow']/input[1]");
		
			Hometab = By.linkText("Home");
			Accountstab = By.xpath(".//*[@id='Account_Tab']/a");
			view = By.xpath(".//*[@id='fcf']");
			gobtn = By.name("go");
			ExistAccountname = By.id("00128000008utd2_Name");
			saleslist = By.xpath(".//*[@id='tsidLabel']");
			newcontactbtn = By.name("newContact");
			cancelbtn = By.name("cancel");
			shippingAddress = By
					.xpath("//*[text()='Shipping Address']/following-sibling::td[1]//tr[1]/td[1]");
			billingAddress = By
					.xpath("//*[text()='Billing Address']/following-sibling::td[1]//tr[1]/td[1]");
			showAddressSection = By
					.xpath(".//*[@title='Show Section - Address Information']");
			hideAddressSection = By
					.xpath(".//*[@title='Hide Section - Address Information']");
			newTaskBtn = By.xpath(".//*[@title='New Task']");
			newEventBtn = By.xpath(".//*[@title='New Event']");
			editBtn = By.xpath(".//*[@id='topButtonRow']//*[@name='edit']");
			lpdBusinessPlanTextArea =  By.xpath(".//label[text()='LPD Business Plan']/parent::span/parent::td/following-sibling::td[1]/textarea");
			save = By.xpath(".//td[@id='topButtonRow']/*[@title='Save']");
			lpdBussinessAreaTextAfterSave = By.xpath(".//span[text()='LPD Business Plan']//parent::td//following-sibling::td[1]/div");
			Hierarchy_Row = By.xpath(".//*[@class='detailList']/tbody/tr[2]/td[4]/div");
			
			homeTab = By.xpath(".//*[@id='home_Tab']/a");
			accountsTab = By.xpath("//a[text()='Accounts']");
			listview = By.xpath(".//*[@id='is:islv:inlineSchedulerListView:enhancedList_listSelect']");
			goButton = By.xpath(".//*[@title='Go!']");
			tableData = By.xpath(".//*[@id='00121000002LlPb_RelatedContactList_body']/table");
			accountData = By.xpath(".//*[@id='ext-gen24']");
			
			accountName = By.xpath(".//*[@id='00121000002LlPb_Name']/a/span");
			accountDetail = By.xpath(".//*[@id='contactHeaderRow']/div[2]/h2");

			newAccount = By.xpath(".//*[@id='hotlist']/table/tbody/tr/td[2]/input");
			name = By.xpath(".//label[text()='Account Name']/parent::td/following-sibling::td[1]//input");
			type = By.xpath(".//*[@id='acc6']");
			website = By.xpath(".//*[@id='acc12']");
			description = By.xpath(".//*[@id='acc20']");
			businessUnit = By.xpath(".//label[text()='Business Unit']/parent::td/following-sibling::td[1]//select");
			parentAccount = By.xpath(".//*[@id='acc3']");
			phone = By.id("acc10");
			industry = By.xpath(".//label[text()='Industry']/parent::td/following-sibling::td[1]//select");
			employees = By.id("acc15");
			billingStreet = By.xpath(".//*[@id='acc17street']");
			billingCity = By.id("acc17city");
			billingState = By.id("acc17state");
			billingZip = By.id("acc17zip");
			billingCountry = By.id("acc17country");
			shippingStreet = By.id("acc18street");
			shippingCity = By.id("acc18city");
			shippingState = By.id("acc18state");
			shippingZip = By.id("acc18zip");
			shippingCountry = By.id("acc18country");
			save = By.xpath(".//*[@id='bottomButtonRow']/input[1]");
			descText = By.xpath(".//*[@id='ep']/div[2]/div[2]/table/tbody/tr/td[2]/div");

			newContact = By.xpath(".//*[contains(@id,'RelatedContactList')]/div[1]/div/div[1]/table/tbody/tr/td[2]/input");
			saluatation = By.xpath(".//*[@id='name_salutationcon2']");
			firstName = By.id("name_firstcon2");
			middleName = By.id("name_middlecon2");
			lastName = By.xpath(".//label[text()='Last Name']/parent::td/following-sibling::td[1]//input");
			suffix = By.id("name_suffixcon2");
			email = By.id("con15");
			title = By.id("con5");
			mobile = By.id("con12");
			reportsTo = By.id("con8");
			department = By.id("con6");
			fax = By.id("con11");
			mailingStreet = By.id("con19street");
			mailingCity = By.id("con19city");
			mailingState = By.id("con19state");
			mailingZip = By.id("con19zip");
			mailingCountry = By.id("con19country");
			contactSave = By.xpath(".//*[@title='Save']");
			contactsData = By.id("ext-gen25");

			reportsTab = By.xpath(".//*[@id='report_Tab']/a");
			newReport = By.xpath(".//*[@id='ext-gen5']/input[1]");
			newReportPage = By
					.xpath(".//*[@id='bodyTable']/tbody/tr/td/div[1]/div/div[1]/h1");
			amountColumn = By.xpath(".//*[@id='headerRow_0']/th[4]/a/strong");
			opportunities = By
					.xpath(".//*[@id='ext-gen10']/div/li[2]/div/a/span");
			create = By.xpath(".//*[@id='thePage:rtForm:createButton']");
			add = By.xpath(".//*[@id='filterPanel_addFilterButton']/tbody/tr[2]/td[2]/em");
			filter = By.xpath(".//*[@id='ext-gen262']");
			filterValue = By.xpath(".//*[@id='val-ext-gen257']");
			ok = By.xpath(".//*[@id='ok-btn-id-ext-gen258']");
			runReport = By.xpath(".//*[@id='runReportBtn']/tbody/tr[2]/td[2]/em/button");
			newReportData = By
					.xpath(".//*[@id='report']/div[2]/div/div[2]/div/div/div[1]/div");

			edit = By.xpath(".//*[@id='topButtonRow']/input[3]");
			postalZip = By.xpath(".//*[@id='acc17zip']");
			territoriesSave = By.xpath(".//*[@id='bottomButtonRow']/input[1]");
			reportHeader = By.xpath(".//*[@id='noTableContainer']/div/div[1]/div[1]/div[1]/h1");
			contactsTable = By.xpath(".//*[contains(@id,'RelatedContactList_body')]/table");
			
			 firstContactDisplayed = By.xpath(".//div[contains(@class,'x-grid3-row-first')]/table/tbody/tr[1]/td[4]/div/a/span");
			 firstContactDisplayedLink = By.xpath(".//div[contains(@class,'x-grid3-row-first')]/table/tbody/tr[1]/td[4]/div/a");
			 topNameDisplayedOnContactHeader = By.xpath(".//*[@id='contactHeaderRow']/div[2]/h2");
             accountsDetailSection = By.xpath("//h2[@class='mainTitle'][text()='Account Detail']");
             newContactButton= By.xpath(".//*[@value='New Contact']");
             
             contactsTableData= By.xpath(".//*[contains(@id,'RelatedContactList_body')]/table");
             accountTeamHyperlink = By.xpath(".//*[@class='listTitle'][text()='Account Team']");
             teamMember = By.xpath(".//*[contains(@id,'RelatedAccountSalesTeam_body')]/table/tbody/tr[2]/th/a");
             teamRole = By.xpath(".//*[contains(@id,'RelatedAccountSalesTeam_body')]/table/tbody/tr[2]/td[2]");
             accountDetail_AccountName = By.xpath(".//a[text()='[View Hierarchy]']/parent::div");
             baseAccount = By.xpath(".//div[@class='relatedAccountHierarchy']//div[2]/table/tbody/tr[4]/th[1]/a");
             viewHierarchy_ParentAccount = By.xpath(".//div[@class='relatedAccountHierarchy']//div[2]/table/tbody/tr[3]/th[1]/a");
             viewHierarchy_GrandParentAccount = By.xpath(".//div[@class='relatedAccountHierarchy']//div[2]/table/tbody/tr[2]/th[1]/a");
             competitorProductsName = By.xpath(".//h3[text()='Competitor Products']//ancestor::div[@class='pbHeader']//following-sibling::div[1]//tr[2]/th[1]/a");
             competitorProductDetailPageTitle = By.xpath(".//h2[@class='mainTitle'][text()='Competitor Product Detail']");
             competitorProductsNameOnCompetitorsPage = By.xpath(".//td[text()='Competitor Products Name']/following-sibling::td[1]/div");
             contactsHyperlink = By.xpath(".//*[@class='listTitle'][text()='Contacts']");
             contacts_contactNameOnMouseHover = By.xpath(".//*[contains(@id,'RelatedContactList_body')]/table/tbody/tr[2]/th/a");
             
             opportunitiesHyperlink = By.xpath(".//*[@class='listTitle'][text()='Opportunities']");
             opportunity_nameOnMouseHover = By.xpath(".//*[contains(@id,'RelatedOpportunityList_body')]/table/tbody/tr[2]/th/a");
             opportunity_stageOnMouseHover = By.xpath(".//*[contains(@id,'RelatedOpportunityList_body')]/table/tbody/tr[2]/td[2]");
             
             openActivitiesHyperlink = By.xpath(".//*[@class='listTitle'][text()='Open Activities']");
             openActivities_subjectOnMouseHover = By.xpath(".//*[contains(@id,'RelatedActivityList_body')]/table/tbody/tr[2]/th/a");
             openActivities_relatedTo= By.xpath(".//*[contains(@id,'RelatedActivityList_body')]/table/tbody/tr[2]/td[3]/a");
             
             contactsDisplayedTableData = By.xpath(".//*[contains(@id,'RelatedContactList_body')]/table/tbody/tr");
		}

	}
}
