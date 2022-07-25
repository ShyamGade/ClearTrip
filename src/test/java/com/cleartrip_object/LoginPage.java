package com.cleartrip_object;





import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class LoginPage {
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	
	
	@FindBy(xpath="//div[starts-with(@class,'px-1')]")
	WebElement closepop;
	public void Clickclosepop()
	{
		closepop.click();
	}
	
	
	
	
	@FindBy(xpath="(//div[@class='card']//*[name()='svg'])[1]")
	WebElement closepop2;
	public void Clickclosepop2()
	{
		closepop2.click();
	}
	
	
	
	
	
	@FindBy(xpath="(//div[@class=\"p-relative\"]//input)[1]")
	WebElement input1;

	public void Input1(String BLR) throws InterruptedException
	{
		input1.sendKeys(BLR);
		
	}
	
	
	
	
	
	@FindBy(xpath="(//input[starts-with(@class,'field bw-1 bs-solid')])[2]")
	WebElement input2;
	
	public void Input2(String DLH) throws InterruptedException
	{
		input2.sendKeys(DLH);
		
	}
	
	
	
	
	
	
	@FindBy(xpath="(//button[starts-with(@class,'flex flex-middle flex-between')])[4]")
	WebElement oncalenderclick;
	public void calenderclick()
	{
		oncalenderclick.click();
	}
	
	
	
	
	
	@FindBy(xpath="//button[text()='Search flights']")
	WebElement FligtButton;
	public void clickSearchFligt()
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click();", FligtButton);
	}
	
	
	
	
	
	
	@FindBy(xpath="//div[@aria-label='Sat Jul 30 2022']//div[@class='p-1 day-gridContent flex flex-middle flex-column flex-center flex-top'][normalize-space()='30']")
	WebElement dateselect;
	public void getDateSelected()
	{
		JavascriptExecutor js1 = (JavascriptExecutor) ldriver;
		js1.executeScript("arguments[0].click();", dateselect);
	}
	
	
	
	
	
}
