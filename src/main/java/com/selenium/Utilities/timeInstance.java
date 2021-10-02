package com.selenium.Utilities;

import java.util.Date;

public class timeInstance {
	
	//To get time at that instances
	public static String getname() {
		
		Date date = new Date();
		return date.toString().replaceAll(":","_").replaceAll(" ", "_");
	}
}
