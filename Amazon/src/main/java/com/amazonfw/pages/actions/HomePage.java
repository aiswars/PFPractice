package com.amazonfw.pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	@FindBy(how = How.CSS, using = " #nav-link-accountList" )
	WebElement lnkSignIn;
	@FindBy(how = How.CSS, using = "div[id='nav-flyout-ya-signin'] span[class='nav-action-inner']" )
	WebElement btnSignIn;
	public void gotoSignIn() {
		lnkSignIn.click();
	//	btnSignIn.click();
	}
	public void gotoHelloLocation() {
			
	}


	public void gotoReturns() {
		
	}
}
