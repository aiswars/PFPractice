package com.amazonfw.base;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazonfw.pages.actions.TopNavigation;
import com.amazonfw.utilities.ExcelReader;
import com.amazonfw.utilities.ExtentManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class BasePage {
	/*
	 * webDriver
	 * excel
	 * logs
	 * extentreports
	 * webdriver wait
	 * 
		
	*/
	
	public static WebDriver driver;  //everytime a new driver object should not be created.
		public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\\resources\\com\\excel\\testdata.xlsx");
		public static Logger log = Logger.getLogger("devpinoyLogger");
	public static WebDriverWait wait;
	//public ExtentReports rep = ExtentManager.getInstance();
	//public ExtentReports rep = ExtentManager.createInstance();
	public static ExtentTest test;
	public static String browser;
	public static TopNavigation topNavigation; //for creating object of TopNavigation
	
	
	
	public static void initConfiguration(){
if(Constants.browser.equals("firefox")){
			
			driver = new FirefoxDriver();
			log.debug("Launching Firefox");
		}else if(Constants.browser.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");

			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-infobars");

			driver = new ChromeDriver(options);
			log.debug("Launching Chrome");
		}else if(Constants.browser.equals("ie")){
			
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\IEDriverServer.exe");
			
			driver = new InternetExplorerDriver();
			log.debug("Launching IE");
		}
		
		driver.get(Constants.testsiteurl);
		driver.manage().window().maximize();
	/*	driver.manage().timeouts().implicitlyWait(Constants.implicitwait, TimeUnit.SECONDS);
		wait = new WebDriverWait()*/
		topNavigation = new TopNavigation(driver); //object of TopNavigation
		
	
	}
	
	
public static void quitBrowser(){
		
		driver.quit();
		
	}
	
	
	
	
	
	
}
