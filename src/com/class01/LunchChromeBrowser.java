package com.class01;

import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChromeBrowser  {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		Thread.sleep(4000);
		driver.navigate().to("http://www.facebook.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		driver.close();
	}
}
