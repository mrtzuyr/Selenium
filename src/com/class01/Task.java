package com.class01;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.amazon.com");
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
	
		
		
		driver.get("http://www.google.com");
		
		driver.navigate().to("http://www.syntaxtechs.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String u = driver.getCurrentUrl();
		System.out.println(u.contains("syntax"));
		
	}
}
