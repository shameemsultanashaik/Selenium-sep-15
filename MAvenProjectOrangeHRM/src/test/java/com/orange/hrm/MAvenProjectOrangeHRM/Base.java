package com.orange.hrm.MAvenProjectOrangeHRM;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base {
	
	WebDriver  driver;
	Properties prop;
	@BeforeClass
	
	public void getProperties() {
		try {
			prop = new Properties();
			System.out.println(System.getProperty("user.dir"));
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com/orange/hrm/MAvenProjectOrangeHRM/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	@BeforeClass
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);

		driver = new ChromeDriver(capability);
		System.out.println("hello1");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		// driver.get("http://zero.webappsecurity.com/login.html");
		driver.get(prop.getProperty("url"));
		
		
	}
		
	
	@AfterClass
	public void closeApplication() {
		// driver.quit();
	}

}

