package com.amazonfw.pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.amazonfw.base.BasePage;
import com.amazonfw.pages.locators.HomePageLocators;

public class HomePage extends BasePage {

public HomePageLocators home;
	

	public HomePage(){
		
		this.home = new HomePageLocators();
		PageFactory.initElements(driver, this.home);
		
	}
	
	public void gotoSignIn() {
	home.lnkSignIn.click();
	}
	public void gotoHelloLocation() {
			
	}


	public void gotoReturns() {
		
	}
}
