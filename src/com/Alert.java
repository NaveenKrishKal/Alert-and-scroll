package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws Throwable  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naveen Krish Kalyan\\eclipse-workspace\\Alert&Scroll\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
	WebElement alertBox = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	alertBox.click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	
	
	WebElement withOk = driver.findElement(By.xpath("(//a[@data-toggle='tab']) [2]"));
	withOk.click();
	WebElement confirmBox = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
	confirmBox.click();
	Thread.sleep(2000);
	driver.switchTo().alert().dismiss();
	Thread.sleep(2000);
	
	WebElement textBox = driver.findElement(By.xpath("(//a[@data-toggle='tab']) [3]"));
	textBox.click();
	WebElement promptBox = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
	promptBox.click();
	driver.switchTo().alert().sendKeys("Naveen Kumar Krishnan");
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	
	
	
	}

}
