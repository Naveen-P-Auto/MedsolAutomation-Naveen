package com.medsol1.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfiguration {

	Properties prop;
	
	public Readconfiguration()
	{
		File src = new File("./Configuration//Config.properties");
		try { 
			FileInputStream fis = new FileInputStream(src);
			prop =new Properties();
			prop.load(fis);
			} catch (Exception e) {
				System.out.println("Exception is"+ e.getMessage());
			}
	}
	
	public String getAppicationURL() {
		String url=prop.getProperty("baseurl");
		return url;
	}
	public String getUsername() {
		String username=prop.getProperty("username");
		return username;
	}
	public String getPassword() {
		String password = prop.getProperty("password");
		return password;
	}

	public String getChromePath() {
		String chromepath = prop.getProperty("chromepath");
		return chromepath;
	}

	public String getFirefoxPath() {
		String firefoxpath = prop.getProperty("firefoxpath");
		return firefoxpath;
	}

	public String getmsedgepath() {
		String msedgepath = prop.getProperty("msedgepath");
		return msedgepath;
	}

	public String getFirstName() {
		String firstname = prop.getProperty("firstname");
		return firstname;
	}

	public String getLastName() {
		String lastname = prop.getProperty("lastname");
		return lastname;
	}

	public String getEmail() {
		String email = prop.getProperty("email");
		return email;
	}

	public String getPhoneNumber() {
		String phonenumber = prop.getProperty("phonenumber");
		return phonenumber;
	}
	
	public String getAccount() {
		String Account = prop.getProperty("Account");
		return Account;
	}
	public String getDescription() {
		String Description=prop.getProperty("Description");
		return Description;
	}
	public String getSearchAccount() {
		String SearchAccount=prop.getProperty("SearchAccount");
		return SearchAccount;
	}
	public String getSearchAdvacepayment() {
		String SearchAdvancepayment=prop.getProperty("SearchAdvancepayment");
		return SearchAdvancepayment;
	}
	public String getStatus1() {
		String Status1=prop.getProperty("Status1");
		return Status1;
	}
	public String getStatus2() {
		String Status2=prop.getProperty("Status2");
		return Status2;
	}
	public String getpatient() {
		String patient=prop.getProperty("patient");
		return patient;
	}
	public String getAmount() {
		String Amount=prop.getProperty("Amount");
		return Amount;
	}
	public String getDate() {
		String Date=prop.getProperty("Date");
		return Date;
	}
	public String getMonth() {
		String Month=prop.getProperty("Month");
		return Month;
	}
	public String getYear(){
		String Year=prop.getProperty("Year");
		return Year;
	}
	public String getDocumenttype() {
		String Documenttype=prop.getProperty("Documenttype");
		return Documenttype;
	}
}


