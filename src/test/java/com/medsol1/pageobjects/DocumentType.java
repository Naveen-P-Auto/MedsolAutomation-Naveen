package com.medsol1.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentType {

	WebDriver driver;
	public DocumentType(WebDriver driver) {
		PageFactory.initElements(driver, this);}
		
		@FindBy(xpath="//a[@href='https://cls-medsol.in/documents']")
		WebElement Documents;
		
		@FindBy(xpath="//a[@href='https://cls-medsol.in/document-types']")
		WebElement DocumentTypes;
		
		@FindBy(name="Search")
		WebElement txtSearchBox;
		
		@FindBy(xpath="//*[@id=\"datatable-WfARqvtOpkG5hTVceXqL\"]/div[2]/div[2]/div[2]/a")
		WebElement NewDocumentType;
		
		@FindBy(xpath="//input[@class='form-control']")
		WebElement txtDocumentType;
			
		@FindBy(id="docTypeSave")
		WebElement Savebtn;
		
		@FindBy(xpath="//*[@id=\"addDocTypeForm\"]/div[2]/button[2]")
		WebElement Cancelbtn;
		
		@FindBy(xpath="//*[@id=\"add_document_types_modal\"]/div/div/div/button")
		WebElement Closebtn;
		
		@FindBy(xpath="//*[@id=\"datatable-WfARqvtOpkG5hTVceXqL\"]/div[3]/table/tbody/tr[1]/td[2]/div/a[1]/svg")
		WebElement Editpenicon;
		
		@FindBy(xpath="//*[@id=\"datatable-WfARqvtOpkG5hTVceXqL\"]/div[3]/table/tbody/tr[1]/td[2]/div/a[2]/svg/path")
		WebElement Deleteicon;
		
		@FindBy(xpath="/html/body/div[2]/div/div[4]/div[1]/button")
		WebElement Yes_Deletebtn;
		
		@FindBy(xpath="/html/body/div[2]/div/div[4]/div[2]/button")
		WebElement No_Cancelbtn;
		
		public void clickOnDocuments() {
			Documents.click();
	}
	
		public void clickOnDocumenttypes() {
			DocumentTypes.click();
		
	}
	
		public void clickOnNewDocumentType() {
			NewDocumentType.click();
			
	}
	
        public void setDocumentType(String Document) {
        	txtDocumentType.sendKeys(Document);
        	txtDocumentType.sendKeys(Keys.ENTER);
        }
	
	    public void clickOnSave() {
	    	Savebtn.click();
	    }
	    public void clickOnCancel() {
	    	Cancelbtn.click();
	    }
	    public void clickOnClose() {
	    	Closebtn.click();
	    }
	    public void clickOnEdit() {
	    	Editpenicon.click();
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



