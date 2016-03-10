package com.automation.utilities;

public class ExcelToXml {

	public static void main(String[] args) throws Exception
	{
		try{
			System.out.println("****************In the ExcelToXml class of the project******************");
		ExcelUtility.createXml("Browsers");
		
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
