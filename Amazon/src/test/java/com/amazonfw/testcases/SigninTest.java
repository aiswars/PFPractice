package com.amazonfw.testcases;

import org.testng.annotations.Test;

import com.amazonfw.base.BasePage;
import com.amazonfw.pages.actions.HomePage;
import com.amazonfw.pages.actions.SigninPage;

public class SigninTest {

	@Test
	public void signInTest(){
		
		BasePage.initConfiguration();
		HomePage home = new HomePage();
		SigninPage signin =  home.gotoSignIn();
		signin.doSignIn();
		System.out.println("SearchingAnItem done");
		BasePage.quitBrowser();
	}

}
