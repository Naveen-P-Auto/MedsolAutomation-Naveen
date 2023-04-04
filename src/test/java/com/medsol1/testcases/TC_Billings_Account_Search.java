package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medsol1.pageobjects.BillingAccount;
import com.medsol1.pageobjects.Loginpage;
import com.medsol1.utilities.Readconfiguration;

public class TC_Billings_Account_Search extends BaseClass{

	Readconfiguration readconfiguration=new Readconfiguration();
	public String SearchAccount=readconfiguration.getSearchAccount();
		@Test
		public void AccountSearch() throws InterruptedException {
			
			Loginpage lp=new Loginpage(driver);
			lp.clickOnLogin();
			lp.setUserName(username);
			lp.setPassword(password);
			Thread.sleep(3000);
			lp.clickOnLoginSubmit();
			
			BillingAccount ba=new BillingAccount(driver);
			ba.clickOnBillings();
			ba.clickOnAccount();
			Thread.sleep(3000);
			ba.setSearch(SearchAccount);
			
	}
	
	
	
	
	
}
