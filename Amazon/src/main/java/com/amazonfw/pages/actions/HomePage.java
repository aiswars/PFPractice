package com.amazonfw.pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.amazonfw.base.BasePage;
import com.amazonfw.pages.locators.HomePageLocators;

public class HomePage extends BasePage {

public HomePageLocators home;
	

	public HomePage(){
		
		this.home = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10); 
		PageFactory.initElements(factory, this.home);
		
	}
	
	public void gotoSignIn() {
		
	    home.lnkSignIn.click();
	
	}
	public void gotoHelloLocation() {
		
		home.lnkHelloLocation.click();
	}


	public void gotoReturns() {
		home.lnkReturnsOrders.click();
		
	}
}
