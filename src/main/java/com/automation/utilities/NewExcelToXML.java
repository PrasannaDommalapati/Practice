package com.automation.utilities;

public class NewExcelToXML {

	public static void main(String[] args) throws Exception
	{
		try{
		System.out.println("NewExcelToXML");
		ExcelUtility.createXml("Browsers");
		
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
