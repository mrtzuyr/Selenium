package com.class01;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageCommands {
public static void main(String[] args) throws InterruptedException {
		
	System.out.println("The expected and actual url matched");
		ChromeDriver driver=new ChromeDriver();
		
		final String expectedTitle="Google";
		
		driver.get("http://www.google.com");
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Titles match");
		}else {
			System.out.println("Titles don't match");
		}
		
		String actualUrl=driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		String expectedUrl="https://www.google.com/?gws_rd=ssl";
		
		if(expectedUrl.equals(actualUrl)) {
			System.out.println("The expected and actual url matched");
		}else {
			System.err.println("The expected and actual url didn't match");
		}
		
		driver.close();
		
		
	}

}
