package com.cleartrip_testcases;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.cleartrip_utilities.ReadConfig;

public class BaseClass {
	ReadConfig readconfig= new ReadConfig();
	
	public String BaseURL=readconfig.getApplicationURL();
	public String input1=readconfig.getinput1();
	public String input2=readconfig.getinput2();
	public String city1=readconfig.getCity1();
	public String city2=readconfig.getCity2();
	public static Logger logger= LogManager.getLogger(BaseClass.class.getName());
	public static WebDriver driver;
	
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	
	
	{
		
		logger=LogManager.getLogger("BaseClass");	
		if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getFireFoxpath());
			driver= new FirefoxDriver();
		}
		else if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
			driver= new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver",readconfig.getEdgePath());
			driver= new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(BaseURL);
	}
	@AfterClass
	public void TearDown()
	{
		//driver.quit();
	}
	
}
