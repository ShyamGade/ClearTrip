package com.cleartrip_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SerachResult {
	WebDriver ldriver;
	public SerachResult(WebDriver rdriver)
	{
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	
	@FindBy(xpath="(//button[text()='Book'])[1]")
	WebElement booknow;
	public void ClickBookNow()
	{
		booknow.click();
	}
	

}
