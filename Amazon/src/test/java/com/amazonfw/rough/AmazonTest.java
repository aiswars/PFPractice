package com.amazonfw.rough;

import com.amazonfw.base.BasePage;
import com.amazonfw.pages.actions.HomePage;

public class AmazonTest {

	public static void main(String[] args) {
		
		BasePage.initConfiguration();
		HomePage home = new HomePage();
		home.SearchingAnItem();
				
		System.out.println("SearchingAnItem done");
		BasePage.quitBrowser();
	}
}
