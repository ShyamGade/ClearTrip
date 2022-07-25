package com.cleartrip_testcases;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.cleartrip_object.LoginPage;
import com.cleartrip_object.SerachResult;


public class TC_LoginTest_001 extends BaseClass {
	
	
@Test(priority=1)
	public void LoginTest() throws InterruptedException
	{
	WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		LoginPage log=new LoginPage(driver);
	
		log.Clickclosepop();
		log.Clickclosepop2();
		log.Input1(input1);
		logger.info("First City Enterd");
		
		List<WebElement>options=driver.findElements(By.xpath("//li[starts-with(@class,'ls-reset br-4 ')]"));
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase(city1))
			{
				option.click();
				break;
			}
		}
		
		logger.info("First city selected correctly");

		
		log.Input2(input2);
		logger.info("Second City Enterd");

		List<WebElement>options1=driver.findElements(By.xpath("//li[starts-with(@class,'ls-reset br-4 ')]"));
		for(WebElement option:options1)
		{
			if(option.getText().equalsIgnoreCase(city2))
			{
				option.click();
				break;
			}
		}
			
		logger.info("Second city selected correctly");
		log.calenderclick();
		
		logger.info("Calender open for select next week  date ");
		
		log.getDateSelected();

		logger.info("Calender next week date selected");

		//search flight click button
				//Thread.sleep(2000);
				log.clickSearchFligt();
				logger.warn("Search button clicked for required fligt information");
						
				List<WebElement> element=mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/div/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/p[1]")));
								
				for(int i=1;i<element.size();i++)
				{
					String str=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/div["+i+"]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/p[1]")).getText();
					System.out.println(str);
					
				}
									
			}
	@Test(priority=2)
	public void SerachResultpage()
	{
		SerachResult sr=new SerachResult(driver);
		sr.ClickBookNow();
		logger.info("Minimum Flight Ticket Selected");
	}
		


}
