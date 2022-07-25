package com.cleartrip_utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties prop;
	File src=new File("./Configuration//config.properties");
	
	public ReadConfig()
	{
			try
			{
				FileInputStream fio=new FileInputStream(src);
				prop= new Properties();
				prop.load(fio);
				
		
			}
			catch(Exception e)
			{
			System.out.println("Exception occure"+e.getMessage());
			}
	}	
	
	public String getApplicationURL()
	{
		String url=prop.getProperty("baseURL");
		return url;
	}
	
	public String getinput1()
	{
		String input1=prop.getProperty("input1");
		return input1;
	}
	public String getinput2()
	{
		String input2=prop.getProperty("input2");
		return input2;
	}
	public String getFireFoxpath()
	{
		String firefox=prop.getProperty("firefoxpath");
		return firefox;
	}
	public String getEdgePath()
	{
		String edge=prop.getProperty("edgepath");
		return edge;
	}
	public String getChromePath()
	{
		String chrome=prop.getProperty("chromepath");
		return chrome;
	}
	public String getCity1()
	{
		String city=prop.getProperty("city1");
		return city;
	}
	public String getCity2()
	{
		String city=prop.getProperty("city2");
		return city;
	}
	

}
