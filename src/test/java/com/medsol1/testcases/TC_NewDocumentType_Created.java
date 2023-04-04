package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medsol1.pageobjects.DocumentType;
import com.medsol1.pageobjects.Loginpage;
import com.medsol1.utilities.Readconfiguration;

public class TC_NewDocumentType_Created extends BaseClass{
  
	Readconfiguration readconfiguration=new Readconfiguration();
	public String Documenttype=readconfiguration.getDocumenttype();
	
	
	@Test
	public void NewDocumentType()throws InterruptedException{
		Loginpage lp=new Loginpage(driver);
		lp.clickOnLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		Thread.sleep(3000);
		lp.clickOnLoginSubmit();
		
		DocumentType dtp=new DocumentType(driver);
		dtp.clickOnDocuments();
		dtp.clickOnDocumenttypes();
		Thread.sleep(2000);
		dtp.clickOnNewDocumentType();
		dtp.setDocumentType(Documenttype);
		dtp.clickOnSave();
	
		
	}
	
	
	
	
	
}
