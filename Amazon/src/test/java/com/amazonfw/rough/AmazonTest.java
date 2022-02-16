package com.amazonfw.rough;

import com.amazonfw.base.BasePage;
import com.amazonfw.pages.actions.HomePage;

public class AmazonTest {

	public static void main(String[] args) {
		
		BasePage.initConfiguration();
		HomePage home = new HomePage();
		home.gotoSignIn();
		
			
		System.out.println("done");
		BasePage.quitBrowser();
	}

}
