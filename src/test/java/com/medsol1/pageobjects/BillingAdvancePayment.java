package com.medsol1.pageobjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BillingAdvancePayment {

	WebDriver driver;
	public BillingAdvancePayment(WebDriver driver) {
		PageFactory.initElements(driver, this);}
	
	@FindBy(xpath="//span[text()='Billings']")
	WebElement Billings;
	
	@FindBy(xpath="//a[@href='https://cls-medsol.in/advanced-payments']")
	WebElement AdvancePayments;
	
	@FindBy(xpath="//*[@id=\"datatable-UI0eASXOYoQypjAo9Deb\"]/div[2]/div[2]/div[2]/a")
	WebElement NewAdvancePaymentbtn;
	
	@FindBy(id="select2-advancePaymentPatientId-container")
	WebElement PatientDropdown;
	
	@FindBy(xpath="//*[@id=\"addAdvancedPaymentForm\"]/div[1]/div[2]/div[1]/span[2]/span[1]/span")
	WebElement txtSelectPatient;
	
	@FindBy(name="amount")
	WebElement txtAmount;
	
	@FindBy(xpath="//input[@class='bg-white form-control flatpickr-input']")
	WebElement txtDateofpayment;
	
	@FindBy(xpath="//input[@aria-label='Year']")
	WebElement txtYearinDateofpayment;
	
	@FindBy(xpath="//select[@aria-label='Month']")
	WebElement txtMonthinDateofpayment;
	
	@FindBy(xpath="//div[@class='dayContainer']/span")
	List<WebElement> txtDateinDateofpayment;
	
	@FindBy(id="advancePaymentSave")
	WebElement Savebtn;
	
	@FindBy(xpath="//*[@id=\"addAdvancedPaymentForm\"]/div[2]/button[2]")
	WebElement Cancelbtn;
	
	@FindBy(className ="svg-inline--fa fa-pen-to-square")
	WebElement EditPenicon;
	
	@FindBy(xpath="//*[@id=\"datatable-UI0eASXOYoQypjAo9Deb\"]/div[3]/table/tbody/tr[4]/td[5]/a[2]/svg/path")
	WebElement Deleteicon;
	
	@FindBy(xpath="/html/body/div[4]/div/div[4]/div[1]/button")
	WebElement Yes_Deletebtn;
	
	@FindBy(xpath="/html/body/div[4]/div/div[4]/div[2]/button")
	WebElement No_Cancelbtn;
	
	@FindBy(name="search")
	WebElement txtSearch;
	
	public void clickOnBillings() {
		Billings.click();
	}
	
	public void clickOnAdvancePayments() {
		AdvancePayments.click();
		
	}

	public void clickOnNewAdvancePayment() {
		NewAdvancePaymentbtn.click();
	}
	public void clickOnPatientDropdown() {
		
		PatientDropdown.click();
		
	}
	public void selectPatient(String Patient) {
		txtSelectPatient.sendKeys(Patient);
		txtSelectPatient.sendKeys(Keys.ENTER);
	}
	
	public void setAmount(String amount) {
		txtAmount.sendKeys(amount);
		txtAmount.sendKeys(Keys.ENTER);
	}
	
	public void setDateofpayment(String Year, String Month , String Date) {
		txtDateofpayment.click();
		txtYearinDateofpayment.click();
		txtYearinDateofpayment.sendKeys(Year);
		
		Select Month_drp =new Select(txtMonthinDateofpayment);
		Month_drp.selectByVisibleText(Month);
		List<WebElement> alldates=txtDateinDateofpayment;
		
		for(WebElement ele:alldates) {
			String dt= ele.getText();
			
			if(dt.equals(Date)) {
				
				ele.click();
				break;
			}
		}
	}
	
	public void clickOnSave() {
	  Savebtn.click();
	  
	}
	
	public void clickOnCancel() {
		Cancelbtn.click();
	}
	
	public void clickOnEditPenicon() {
		EditPenicon.click();
		
	}
	
	public void clickOnDeleteicon() {
		Deleteicon.click();
		
	}
	public void clickOnYes_Delete() {
		Yes_Deletebtn.click();
	}
	
	public void clickOnNo_Cancel() {
		No_Cancelbtn.click();
	}
	public void setSearch(String Search) {
		   txtSearch.sendKeys(Search);
		   txtSearch.sendKeys(Keys.ENTER);
	   }
}
