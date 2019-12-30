package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class TaskFrame extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		
	
		CommonMethods.setUp("chrome", "http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		driver.manage().window().fullscreen();
		driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[2]/li[4]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Iframe")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(1000);
		
		
		WebElement logo=driver.findElement(By.cssSelector("img#hide"));
		
		if(logo.isDisplayed()) {
			System.out.println("Syntax logo is displayed");
		}else {
			System.out.println("Synyax logo is not diplayed");
		}
		
		driver.quit();
	}
}
