package com.amazonfw.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LocationPageLocators { //HelloLocation on leftside

	

	@FindBy(how = How.CSS, using = "#GLUXZipUpdateInput" )
	public WebElement txtZipCode; 
	
	@FindBy(how = How.CSS, using = "input[aria-labelledby='GLUXZipUpdate-announce']" )
	public WebElement btnApplyZipCode; 
	
	@FindBy(how = How.CSS, using = "button[name='glowDoneButton']" )
	public WebElement btnDoneZipCode; 
	
}
