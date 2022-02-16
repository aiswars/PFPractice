package com.amazonfw.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TopNavigationLocators {
	@FindBy(how = How.CSS, using = ".hm-icon-label" )
	public WebElement lnkAll; //HelloLocation on leftside
	
}
