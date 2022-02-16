package com.amazonfw.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.amazonfw.pages.locators.TopNavigationLocators;

public class TopNavigation {

	public TopNavigationLocators topMenu;
	
public TopNavigation(WebDriver driver){
		
		this.topMenu = new TopNavigationLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10); 
		PageFactory.initElements(factory, this.topMenu);
		
	}
	
public void gotoAll(){
		
	
		
	}
public void gottoBestSellers(){
	
	
	
}
public void gotoAmazonBasics(){
	
	
	
}
public void gotoNewReleases(){
	
	
	
}
public void gotoCustomerService(){
	
	
	
}
public void gotoTodaysDeals(){
	
	
	
}
public void gotoPrime(){
	
	
	
}
}
