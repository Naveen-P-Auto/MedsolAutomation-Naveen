package com.medsol1.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingAccount {

	WebDriver driver;
	public BillingAccount(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[text()='Billings']")
	WebElement Billings;
	
	@FindBy(xpath="//a[@href='http://cls-medsol.in/accounts']")
	WebElement Account;
	
	@FindBy(name="Search")
	WebElement txtSearchbox;
	
	@FindBy(xpath="//*[@id=\"accountantFilterBtn\"]/svg/path")
	WebElement Filterbtn;
	
	@FindBy(xpath="//*[@id=\"datatable-GGzmjOKBnQw9OTDXCJcA\"]/div[2]/div[2]/div[2]/div/div/div/div[2]/div[1]/span/span[1]/span")
	WebElement StatusDropdown;
	
	@FindBy(id="select2-account_filter_status-result-50yg-1")
	WebElement txtActiveStatus;
	
	@FindBy(id="select2-account_filter_status-result-55pg-2")
	WebElement txtDeactiveStatus;
	
	@FindBy(xpath="//*[@id=\"datatable-GGzmjOKBnQw9OTDXCJcA\"]/div[2]/div[2]/div[2]/div/div/div/div[2]/div[2]/span/span[1]/span")
	WebElement TypeDropdown;
	
	@FindBy(id="select2-account_filter_type-result-xk99-1")
	WebElement txtDebitType;
	
	@FindBy(id="select2-account_filter_type-result-ixmb-2")
	WebElement txtCreditType;
	
	@FindBy(id="accountResetFilter")
	WebElement Resetbtn;
	
	@FindBy(xpath="/html/body/div/div[1]/div[3]/div[2]/div/div/div[1]/div/div[2]/div[2]/div[2]/a")
	WebElement NewAccountbtn;
	
	@FindBy(xpath="//*[@id=\"name\"]")
	WebElement txtAccountName;
	
	@FindBy(name="description")
	WebElement txtDescription;
	
	@FindBy(name="status")
	WebElement Statuscheckbox;
	
	@FindBy(id="createDebitAccount")
	WebElement Debitradiobtn;
	
	@FindBy(id="createCreditAccount")
	WebElement Creditradiobtn;
	
	@FindBy(id="btnSave")
	WebElement Savebtn;
	
	@FindBy(xpath="//*[@id=\"addAccountForm\"]/div[2]/button[2]")
	WebElement Cancelbtn;
	
	@FindBy(xpath="/html/body/div/div[1]/div[3]/div[2]/div/div/div[1]/div/div[3]/table/tbody/tr[2]/td[4]/a[1]/svg")
	WebElement Editpencilicon;
	
	@FindBy(xpath="/html/body/div/div[1]/div[3]/div[2]/div/div/div[1]/div/div[3]/table/tbody/tr[1]/td[4]/a[2]/svg/path")
	WebElement Deleteicon;
	
	@FindBy(xpath="/html/body/div[2]/div/div[4]/div[1]/button")
	WebElement Yes_Deletebtn;
	
	@FindBy(xpath="/html/body/div[2]/div/div[4]/div[2]/button")
	WebElement No_Cancelbtn;
  
	public void clickOnBillings() {
		Billings.click();
	}
 
	public void clickOnAccount() {
	  Account.click();
  }
   
   public void clickOnNewAccount() {
	   NewAccountbtn.click();
	 
   }
   
   public void setAccount(String Account) {
	   txtAccountName.sendKeys(Account);
	   txtAccountName.sendKeys(Keys.ENTER);
	   
   }
   
   public void setDescription(String Description) {
	   txtDescription.sendKeys(Description); 
	   txtDescription.sendKeys(Keys.ENTER);
   }
  
   public void clickOnStatuscheckbox() {
		Statuscheckbox.click();
   }
   
   public void clickOnDebit() {
	   Debitradiobtn.click();
	   
   }
   
   public void clickOnCredit() {
	   Creditradiobtn.click();
   }
   
   public void clickOnSave() {
	   Savebtn.click();
	   
   }
   public void clickOnCancel() {
	   Cancelbtn.click();
   }
  
   public void setSearch(String Search) {
	   txtSearchbox.sendKeys(Search);
	   txtSearchbox.sendKeys(Keys.ENTER);
   }
   public void clickOnFilter() {
	   Filterbtn.click();
   }
   public void clickOnStatus(){
	  StatusDropdown.click();
   }
   public void setActiveStatus(){
	   txtActiveStatus.click();
   }
   public void setDectiveStatus(){
	   txtDeactiveStatus.click();
   }   
   public void clickOnType(){
		  TypeDropdown.click();
   }
   public void setCreditType(){
		   txtCreditType.click();
	}
   public void setDebitType(){
		   txtDebitType.click();	 
   }
   
   public void clickOnReset() {
	   Resetbtn.click();
	   
   }
   public void clickOnEdit() {
	   Editpencilicon.click();
   }
   public void clickOnDelete() {
	   Deleteicon.click();
   }
   public void clickOnYes_Delete() {
		Yes_Deletebtn.click();
	}
	
	public void clickOnNo_Cancel() {
		No_Cancelbtn.click();
	}
   
}



