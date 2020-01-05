package com.tripadvisor.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tripadvisor.qa.base.TestBase;
import com.tripadvisor.qa.pages.HomePage;
import com.tripadvisor.qa.pages.ReviewPage;
import com.tripadvisor.qa.pages.SelectedHotelHomePage;
import com.tripadvisor.qa.util.TestUtil;

public class ReviewHotel extends TestBase
{
	HomePage homePage;
	SelectedHotelHomePage selectedHotelHomePage;
	ReviewPage reviewPage;
	
	public ReviewHotel()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		homePage = new HomePage();
	}
	
	@Test
	public void reviewHotel() throws InterruptedException
	{
		selectedHotelHomePage = homePage.searchHotel();
		TestUtil.switchTab(1);
		reviewPage = selectedHotelHomePage.clickOnreview();
		TestUtil.switchTab(2);
		reviewPage.review();
		//reviewPage.hotelRating("5");
	}
}
