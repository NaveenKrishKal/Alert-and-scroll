package com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.sdk.internal.JavaVersionSpecific;

public class Scroll {
	// USING ELEMENT
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naveen Krish Kalyan\\eclipse-workspace\\Training\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		WebElement down = driver.findElement(By.xpath("//a[text()='Amazon Science']"));
		JavascriptExecutor d = (JavascriptExecutor) driver;
		d.executeScript("arguments[0].scrollIntoView();", down);
		Thread.sleep(2000);
		
		WebElement up = driver.findElement(By.xpath("//span[text()='Footwear']"));
		d.executeScript("arguments[0].scrollIntoView();", up);
		Thread.sleep(2000);
		
		//USING  PIXEL
		
		d.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(2000);
		
		d.executeScript("window.scrollBy(0,-1000)");
	}

}
