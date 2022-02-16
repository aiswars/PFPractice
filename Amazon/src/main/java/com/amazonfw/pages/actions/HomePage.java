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
	
	public void SearchingAnItem() {
		
		home.txtSearchBox.sendKeys("7yr old toys");
		home.btnSearchSubmit.click();
		
	}
	
	public SigninPage gotoSignIn() {
		
	    home.lnkSignIn.click();
	    
	    return new SigninPage(); //create object of SigninpAge - consructor is called
	
	}
	public void gotoHelloLocation() {
		
		home.lnkHelloLocation.click();
	}


	public void gotoReturns() {
		home.lnkReturnsOrders.click();
		
	}
}
