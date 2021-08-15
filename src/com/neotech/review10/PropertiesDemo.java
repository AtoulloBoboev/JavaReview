package com.neotech.review10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	
	public static void main(String[] args) throws IOException {
		
		String projectpath = System.getProperty("user.dir");
		String filePath = projectpath + "\\extra\\demo.properties";
		
		FileInputStream fileIS = new FileInputStream(filePath);
		
		Properties proper = new Properties();
		
		proper.load(fileIS);
		
		System.out.println(proper);
		
		//1st way
		Object lastName = proper.get("LastName");
		System.out.println(lastName);
		
		//2nd way, the correct way
		String firstName = proper.getProperty("FirstName");
		System.out.println(firstName);
		
		String age = proper.getProperty("Age");
		System.out.println(age);
		
		//Add more key->value pairs
		proper.setProperty("StudentNumber", "N123");
		System.out.println(proper);
		
		//or I can re-assign values
		proper.setProperty("Age", "25");
		System.out.println(proper);
		
		//Now let us save into a new file
		String newPath = projectpath + "\\extra\\NewFile.txt";
		FileOutputStream fileOut = new FileOutputStream(newPath);
		proper.store(fileOut, "Evis asked for the comment!");
		
	}

}
