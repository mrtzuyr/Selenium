package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		
		driver.findElement(By.id("txtUsername")).sendKeys("VanceEddie");
		driver.findElement(By.id("txtPassword")).sendKeys("VanceEddie@&12");
		driver.findElement(By.id("btnLogin")).click();
		
		
		//WebElement logo= driver.findElement(By.xpath("//*[@id=\"branding\"]/a[1]/img")); //copy xpath directly
		WebElement logo= driver.findElement(By.xpath("//img[@alt='OrangeHRM']"));
		
		if(logo.isDisplayed()) {
			System.out.println("Syntax logo is displayed");
		}else {
			System.out.println("Syntax logo is not displayed");
		}
		
		
		
	}
}
