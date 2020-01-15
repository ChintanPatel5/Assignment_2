package com.tripadvisor.qa.util;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.tripadvisor.qa.base.TestBase;

public class TestUtil extends TestBase
{
	public static long pageLoad_timeout= 100; //increase time if page is taking more time to load.
	public static long implicitelyWait_timeout=20;
	
	public static void switchTab(int tabNo)
	{
		 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		 driver.switchTo().window(tabs2.get(tabNo));
		    //driver.close();
		  //  driver.switchTo().window(tabs2.get(0));
	}
	
	public static void scrollDown(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);

	}
}
