package com.Mumms.page;

import org.openqa.selenium.By;
import com.automation.accelerators.ActionEngine;

public class LoginPage extends ActionEngine {

	public static By userName;
	public static By password;
	public static By loginBtn;
	public static By logOut;

	public void Login_Page()

	{
		 {

			userName = By.xpath(".//*[@name='j_username']");
			password = By.xpath("//*[@name='j_password']");
			loginBtn = By.xpath("//*[@value='Log In']");
			logOut = By.xpath("//img[@class='gwt-Image hb-top-toolbar-icon hb-mouse-over-clickable GKGO0M2BOK']");
		}
	}
}