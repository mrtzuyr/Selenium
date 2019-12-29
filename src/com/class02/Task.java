package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String[] args) {
		/*
		 * Using Xpath ONLY
			TC 1: Facebook login: 
			Open chrome browser
			Go to “https://www.facebook.com/”
			Enter valid username and valid password and click login 
			User successfully logged in
		 */
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");//input[@name='lastname']
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Murtaza");;
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Uyar");
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		
	}
}
