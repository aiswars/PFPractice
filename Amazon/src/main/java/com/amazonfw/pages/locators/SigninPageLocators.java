package com.amazonfw.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SigninPageLocators {

	
	
	@FindBy(how = How.CSS, using = "#ap_email" ) 
	public WebElement txtEmail;
	
	@FindBy(how = How.XPATH, using = "//input[@id='continue']" ) 
	public WebElement btnContinue;
	
	@FindBy(how = How.CSS, using = "#ap_password" )
	public WebElement txtPassword;
	
	@FindBy(how = How.CSS, using = "#signInSubmit" )
	public WebElement btnSigninSubmit; 

	
	
}
