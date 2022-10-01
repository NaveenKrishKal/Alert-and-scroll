package com;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTC {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naveen Krish Kalyan\\eclipse-workspace\\Alert&Scroll\\driver\\chromedriver.exe");
		
		ChromeOptions copt	= new ChromeOptions();
		copt.addArguments("--start-maximized");
		copt.addArguments("disable-notifications");
		
		WebDriver driver = new ChromeDriver(copt);
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		
	}

}
