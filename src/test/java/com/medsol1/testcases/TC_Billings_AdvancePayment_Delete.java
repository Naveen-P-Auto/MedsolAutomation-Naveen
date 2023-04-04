package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medsol1.pageobjects.BillingAdvancePayment;
import com.medsol1.pageobjects.Loginpage;
import com.medsol1.utilities.Readconfiguration;

public class TC_Billings_AdvancePayment_Delete extends BaseClass{

	Readconfiguration  readconfiguration = new Readconfiguration();
    public String SearchAdvancePayment=readconfiguration.getSearchAdvacepayment();

    @Test
	public void NewAdvancePayment()throws InterruptedException {
		
		Loginpage lp=new Loginpage(driver);
		lp.clickOnLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		Thread.sleep(3000);
		lp.clickOnLoginSubmit();

       BillingAdvancePayment bp=new BillingAdvancePayment(driver);
       bp.clickOnBillings();
       bp.clickOnAdvancePayments();
       bp.setSearch(SearchAdvancePayment);
       bp.clickOnDeleteicon();
       bp.clickOnYes_Delete();
    }
	
	
}
