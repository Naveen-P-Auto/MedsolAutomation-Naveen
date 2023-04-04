package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medsol1.pageobjects.BillingAdvancePayment;
import com.medsol1.pageobjects.Loginpage;
import com.medsol1.utilities.Readconfiguration;

public class TC_Billings_NewAdvancePayment_Created extends BaseClass {
	
	Readconfiguration  readconfiguration = new Readconfiguration();
    public String patient=readconfiguration.getpatient();
    public String amount=readconfiguration.getAmount();
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
       
	   bp.clickOnNewAdvancePayment();
	   bp.clickOnPatientDropdown();
	   bp.selectPatient(patient);
	   Thread.sleep(2000);
	   bp.setAmount(amount);
	   bp.setDateofpayment(Year, Month, Date);
	   bp.clickOnSave();
	   
	}
	   
	
	
	
	
	
}
