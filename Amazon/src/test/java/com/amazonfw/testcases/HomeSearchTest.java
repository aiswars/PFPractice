package com.amazonfw.testcases;

import org.testng.annotations.Test;

import com.amazonfw.base.BasePage;
import com.amazonfw.pages.actions.HomePage;

public class HomeSearchTest {

	@Test
	public void ItemSearchTest() {
		
		BasePage.initConfiguration();
		HomePage home = new HomePage();
		home.SearchingAnItem();
				
		System.out.println("SearchingAnItem done");
		BasePage.quitBrowser();
	}
}
