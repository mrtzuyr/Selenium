package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskMercury {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.newtours.demoaut.com");
		
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Dwight");
		
		driver.findElement(By.name("lastName")).sendKeys("Schrute");
		driver.findElement(By.name("phone")).sendKeys("4567895567");
		driver.findElement(By.id("userName")).sendKeys("dwightschrute@dundermifflin.com");
		
		driver.findElement(By.name("address1")).sendKeys("king dr");
		driver.findElement(By.name("city")).sendKeys("Scranton");
		driver.findElement(By.name("state")).sendKeys("Pennsylvania");
		driver.findElement(By.name("postalCode")).sendKeys("12345");
		driver.findElement(By.name("state")).sendKeys("Pennsylvania");
		
		driver.findElement(By.id("email")).sendKeys("dwightschrute");
		driver.findElement(By.name("password")).sendKeys("1970");
		driver.findElement(By.name("confirmPassword")).sendKeys("1970");
		
		driver.findElement(By.name("register")).click();
		
		driver.findElement(By.linkText("sign-in")).click();
		
		driver.findElement(By.name("userName")).sendKeys("dwightschrute");
		driver.findElement(By.name("password")).sendKeys("1970");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("SIGN-OFF")).click();
	}
}
