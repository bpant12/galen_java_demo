package com.teachingpark.java.code.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LandingPage {

	@FindBy(className="tc-hdr__login-link")
	WebElement btn_loginToggle;
	
	@FindBy(className="tc-hdr__nav__toggler")
	WebElement btn_Mobile_Menu_Toggle;
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver){
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 60);
		PageFactory.initElements(factory, this);
	}
	
	public void clickLoginToggle(){
		btn_loginToggle.click();
	}
	
	public void clickMobileMenuToggle(){
		btn_Mobile_Menu_Toggle.click();
	}
	
}
