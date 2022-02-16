package com.amazonfw.rough;

import com.amazonfw.base.BasePage;
import com.amazonfw.pages.actions.HomePage;
import com.amazonfw.pages.actions.SigninPage;

public class SgninTest {

	public static void main(String[] args) {
		
		BasePage.initConfiguration();
		HomePage home = new HomePage();
		SigninPage signin =  home.gotoSignIn();
		signin.doSignIn();
		System.out.println("SearchingAnItem done");
		BasePage.quitBrowser();
	}

}
