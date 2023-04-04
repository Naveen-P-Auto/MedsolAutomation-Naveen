package com.medsol1.testcases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.medsol1.utilities.Readconfiguration;

public class BaseClass {

	Readconfiguration readconfiguration=new Readconfiguration();
	
	public String baseurl=readconfiguration.getAppicationURL();
	public String username=readconfiguration.getUsername();
	public String password=readconfiguration.getPassword();
	public static WebDriver driver;
	
	public static Logger Logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", readconfiguration.getChromePath());
			ChromeOptions c=new ChromeOptions();
			c.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(c);	
	
	driver.get(baseurl);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(90));
	
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	 public String randomstring() {
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		 return (generatedstring);
		 
	 }
	 public String randomnum() {
		 String generatedstring2=RandomStringUtils.randomNumeric(5);
		 return (generatedstring2);
		 
	 }
	
	
}
