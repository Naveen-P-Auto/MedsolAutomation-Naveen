package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medsol1.pageobjects.BillingAdvancePayment;
import com.medsol1.pageobjects.Loginpage;
import com.medsol1.utilities.Readconfiguration;

public class TC_Billings_AdvancePayment_Edit extends BaseClass{

	Readconfiguration  readconfiguration = new Readconfiguration();
    public String SearchAdvancePayment=readconfiguration.getSearchAdvacepayment();
    public String Patient=readconfiguration.getpatient();
    public String Amount=readconfiguration.getAmount();
    public String Date=readconfiguration.getDate();
    public String Month=readconfiguration.getMonth();
    public String Year=readconfiguration.getYear();
     

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
       Thread.sleep(2000);
	   bp.clickOnEditPenicon();
	   bp.clickOnPatientDropdown();
	   bp.selectPatient(Patient);
	   bp.setAmount(Patient);
	   bp.setAmount(Amount);
	   bp.setDateofpayment(Year, Month, Date);
	   bp.clickOnSave();
	
    }	
	
}
