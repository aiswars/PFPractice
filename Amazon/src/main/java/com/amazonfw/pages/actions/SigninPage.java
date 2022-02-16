package com.amazonfw.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.amazonfw.base.BasePage;
import com.amazonfw.pages.locators.SigninPageLocators;

public class SigninPage extends BasePage {
	
public SigninPageLocators signinPage;
	

	public SigninPage(){
		
		this.signinPage = new SigninPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10); 
		PageFactory.initElements(factory, this.signinPage);
		
	}
	 public void doSignIn() {
		 
		 signinPage.txtEmail.sendKeys("daxvnair@gmail.com");
		 signinPage.btnContinue.click();
		 signinPage.txtPassword.sendKeys("jobs@2022");
		 signinPage.btnSigninSubmit.click();
				 
	 }

}
