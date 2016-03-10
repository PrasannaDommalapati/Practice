package com.automation.utilities;

public class ExcelToXml {

	public static void main(String[] args) throws Exception {
		try {
			System.out.println("***************Successfully entered the create xml method*********");
			ExcelUtility.createXml("Browsers");
			System.out.println("***************Successfull completed the create xml method*********");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
