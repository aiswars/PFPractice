package com.amazonfw.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocators {
	
	@FindBy(how = How.CSS, using = "#twotabsearchtextbox" )
	public WebElement txtSearchBox; 
	
	@FindBy(how = How.CSS, using = "#nav-search-submit-button" )
	public WebElement btnSearchSubmit; 
	
	
	@FindBy(how = How.CSS, using = "#nav-link-accountList" )
	public WebElement lnkSignIn; //signin on topbar
	@FindBy(how = How.CSS, using = "div[id='nav-flyout-ya-signin'] span[class='nav-action-inner']" )
	WebElement btnSignIn;
	
	@FindBy(how = How.CSS, using = "#glow-ingress-line2" )
	public WebElement lnkHelloLocation; //HelloLocation on leftside
	

	@FindBy(how = How.CSS, using = "a[id='nav-orders'] span[class='nav-line-1']" )
	public WebElement lnkReturnsOrders;


	
}
