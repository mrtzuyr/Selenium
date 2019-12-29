package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class Task extends CommonMethods {
	public static void main(String[] args) {
	
		CommonMethods.setUp("chrome","http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		
		
		WebElement maleButton=driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input"));
		maleButton.click();
		System.out.println(maleButton.isSelected());
		driver.close();
		
	}
}
