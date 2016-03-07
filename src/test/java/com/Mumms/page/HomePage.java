package com.Mumms.page;

import org.openqa.selenium.By;

import com.automation.accelerators.ActionEngine;
import com.automation.support.ConfiguratorSupport;

public class HomePage extends ActionEngine {

	// public static By filter ;

	public static By AgencyType;
	public static By AgencyAccountType;
	public static By AdminIcon;
	public static By ReportsIcon;

	// Jairam

	// public static ConfiguratorSupport configProps = new
	// ConfiguratorSupport("config.properties");

	public void Home_Page()

	{
		AgencyType = By.xpath("//div[contains(@class,'login-info-currentHospice')]");
		AgencyAccountType = By.xpath("//div[text()='RUTH']");
		AdminIcon = By.xpath(".//*[@id='gwt-debug-admin-module-button']/tbody/tr[1]/td/div/img");
		ReportsIcon = By.xpath("//table[@id='gwt-debug-reports-module-button']");
	}

}