package com.automation.utilities;

public class ExcelToXml {

	public static void main(String[] args) throws Exception
	{
		try{
		System.out.println("This is the first SOP statement");
		ExcelUtility.createXml("Browsers");
		
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
