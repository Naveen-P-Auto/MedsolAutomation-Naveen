package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medsol1.pageobjects.BillingAccount;
import com.medsol1.pageobjects.Loginpage;
import com.medsol1.utilities.Readconfiguration;

public class TC_Billings_NewAccount_Created extends BaseClass{
	
	Readconfiguration  readconfiguration = new Readconfiguration();
    public String Account=readconfiguration.getAccount();
    public String Description=readconfiguration.getDescription();
	public String Satus1=readconfiguration.getStatus1();
	
	@Test
	public void NewAccount()throws InterruptedException {
		
		Loginpage lp=new Loginpage(driver);
		lp.clickOnLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		Thread.sleep(3000);
		lp.clickOnLoginSubmit();
		
		BillingAccount ba=new BillingAccount(driver);
		ba.clickOnBillings();
		ba.clickOnAccount();
		ba.clickOnNewAccount();
		Thread.sleep(3000);
		ba.setAccount(Account);
		ba.setDescription(Description);
		Thread.sleep(3000);
		ba.clickOnStatuscheckbox();
		ba.clickOnCredit();
		ba.clickOnSave();
	
		Thread.sleep(3000);
	}
	
	
	
}
