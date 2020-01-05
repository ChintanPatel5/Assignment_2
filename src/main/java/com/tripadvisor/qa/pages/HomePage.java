package com.tripadvisor.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tripadvisor.qa.base.TestBase;

public class HomePage extends TestBase
{
	@FindBy(xpath="//div[@title='Search']")
	WebElement searchhotel;
	
	@FindBy(xpath="//input[@id='mainSearch']")
	WebElement writeHotelName;
	
	@FindBy(xpath="//button[@id='SEARCH_BUTTON']")
	WebElement clickSearch;
	
	@FindBy(xpath="//div[@class='result-title']")
	WebElement selectHotel;
	
	public HomePage()
	{
		PageFactory.initElements(driver,  this);
	}
	
	public SelectedHotelHomePage searchHotel()
	{
		searchhotel.click();
		writeHotelName.sendKeys(prop.getProperty("hotel"));
		clickSearch.click();
		selectHotel.click();
		return new SelectedHotelHomePage();
	}
}
