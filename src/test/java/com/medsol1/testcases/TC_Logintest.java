package com.medsol1.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.medsol1.pageobjects.Loginpage;

public class TC_Logintest extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException{
		
		Loginpage lp= new Loginpage(driver);
		lp.clickOnLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickOnLoginSubmit();
		
		if(driver.getTitle().equals("Dashboard\r\n|HMS"))
		{
			Assert.assertTrue(true);
			
		}
		else {
			Assert.assertTrue(false);
			
		}
	}
	
	
}
