package com.tripadvisor.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tripadvisor.qa.base.TestBase;

public class SelectedHotelHomePage extends TestBase
{
	@FindBy(xpath="//a[@class='ui_button primary']")
	WebElement clickOnReview;
	
	public SelectedHotelHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public ReviewPage clickOnreview()
	{
		new WebDriverWait(driver, 20).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(clickOnReview));
		clickOnReview.click();
		return new ReviewPage();
	}
	
}
