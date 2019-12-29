package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver();
		
		dr.get("http://www.newtours.demoaut.com");
		dr.findElement(By.cssSelector("input[type='text']")).sendKeys("dwightschrute");
		dr.findElement(By.cssSelector("input[type^='pass']")).sendKeys("1970");
		Thread.sleep(3000);
		dr.findElement(By.cssSelector("input[value='Login']")).click();
		
	}

}
