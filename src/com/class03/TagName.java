package com.class03;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		
		driver.findElement(By.id("txtUsername")).sendKeys("VanceEddie");
		driver.findElement(By.id("txtPassword")).sendKeys("VanceEddie@&12");
		driver.findElement(By.id("btnLogin")).click();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(WebElement link:links) {
			String allLink=link.getText();
			
			if(!allLink.isEmpty()) {
				System.out.println(allLink);
			}
		}
		
		
		
		
	}
}
