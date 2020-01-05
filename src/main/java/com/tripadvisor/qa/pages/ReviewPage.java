package com.tripadvisor.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tripadvisor.qa.base.TestBase;
import com.tripadvisor.qa.util.TestUtil;

public class ReviewPage extends TestBase
{
	@FindBy(xpath="//input[@id='ReviewTitle']")
	WebElement enterTitle;
	
	@FindBy(xpath="//textarea[@id='ReviewText']")
	WebElement enterReview;
	
	@FindBy(xpath="//input[@id='noFraud']")
	WebElement clickOnCheckbox;
	
	public ReviewPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void hotelRating(String stars)
	{
		
	}
	public void review() throws InterruptedException
	{		        
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//span[@class='ui_bubble_rating fl bubble_00']")), -80, 0).click().perform();
		Thread.sleep(2000);
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//span[@class='ui_bubble_rating fl bubble_10']")), -40, 0).click().perform();
		Thread.sleep(2000);
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//span[@class='ui_bubble_rating fl bubble_20']")), 0, 0).click().perform();
		Thread.sleep(2000);
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//span[@class='ui_bubble_rating fl bubble_30']")), 40, 0).click().perform();
		Thread.sleep(2000);
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//span[@class='ui_bubble_rating fl bubble_40']")), 80, 30).click().perform();
		Thread.sleep(2000);
		enterTitle.sendKeys("GOOD");
		enterReview.sendKeys("GOOD");
		Boolean isPresent = driver.findElements(By.xpath("//div[contains(text(),'Hotel Ratings')]")).size() > 0;
		if(isPresent)
		{
			WebElement Image1 = driver.findElement(By.xpath("//span[@id='qid12_bubbles']"));
		    TestUtil.scrollDown(Image1);
		    Thread.sleep(2000);
			new Actions(driver).moveToElement(driver.findElement(By.xpath("//span[@id='qid12_bubbles']")), 60, 24).click().perform();
			Thread.sleep(3000);
			clickOnCheckbox.click();
		}
	}
	
	
}
