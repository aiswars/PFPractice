package com.amazonfw.rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.amazonfw.pages.actions.HomePage;

public class AmazonTesr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aiswa\\eclipse-workspaceN\\BankUsers\\Drivers\\chromedriver.exe");
		                                                    // C:\automation\workspace\projects\Amazonsrc\test\resources\executables\chromedriver.exe
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.amazon.com/");
		System.out.println("hello");
		
		//HomePage home = new HomePage();
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		home.gotoSignIn();
		
		
		driver.manage().window().maximize();
	
		System.out.println("done");
		
	}

}
