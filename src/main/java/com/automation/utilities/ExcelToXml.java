package com.automation.utilities;

public class ExcelToXml {

	public static void main(String[] args) throws Exception {
		try {
			System.out.println("***************Successfully entered the create xml  - Need to remove these statements*********");
			ExcelUtility.createXml("Browsers");
			System.out.println("***************Successfull completed the create xml method   - Need to remove these statements*********");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
