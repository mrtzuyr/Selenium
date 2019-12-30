package com.class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class TaskAlert extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUp("Chrome", "http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		
		driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[2]/li[2]/a")).click();
		
		driver.findElement(By.linkText("Javascript Alerts")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		String message=alert.getText();
		String expectedMessage="I am an alert box!";
		System.out.println(message.equals(expectedMessage));
		Thread.sleep(2000);
		alert.accept();
	}
}
