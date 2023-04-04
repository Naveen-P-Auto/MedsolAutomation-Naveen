package com.medsol1.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;
 public Loginpage (WebDriver driver){
	 PageFactory.initElements(driver, this);
 }
	@FindBy(xpath="//*[@id=\"navbarNav\"]/div/a[1]")
	WebElement loginButton;
	
	@FindBy(name="email")
	WebElement txtEmail;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(id="remember_me")
	WebElement RememberMeButton;
	
	@FindBy(xpath="//a[normalize-space()='Forgot Password ?']")
	WebElement forgotPasswordLink;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement loginButtonSubmit;
	
	@FindBy (xpath="//a[normalize-space()='Create an Account']")
	WebElement createAnAccountLink;
	
	@FindBy(xpath="//ul[@class='nav align-items-center flex-nowrap']//li[@class='px-xxl-3 px-2']//button[@id='dropdownMenuButton1']")
	WebElement logoutDropdown;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement logoutButton;
	
	@FindBy(xpath="//a[@href='http://cls-medsol.in/theme-mode']")
	WebElement theme;
	
	public void clickOnLogin() {
		loginButton.click();
	}
	public void setUserName(String username) {
	txtEmail.sendKeys(username);	
	}
	
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void clickOnLoginSubmit() {
		loginButtonSubmit.click();
	}
	
	public void clickOnLogoutDropdown() {
		logoutDropdown.click();
	}
	
	public void clickOnLogoutButton() {
		logoutButton.click();
	}
	
	public void clickOnRememberMeButton() {
		RememberMeButton.click();
	}
	
	public void clickOnForgotPassword() {
		forgotPasswordLink.click();
	}
	
	public void clickOnCreateAnAccount() {
		createAnAccountLink.click();
	}
	
	public void clickOnTheme() {
		theme.click();
	}
	
}

