package com.amazonfw.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocators {
	@FindBy(how = How.CSS, using = " #nav-link-accountList" )
	public WebElement lnkSignIn;
	@FindBy(how = How.CSS, using = "div[id='nav-flyout-ya-signin'] span[class='nav-action-inner']" )
	WebElement btnSignIn;
	
}
