package com.java.selenium.comments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumSimpleAlert {

	public static void main(String[] args) throws InterruptedException {

		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert2");
		
		//driver.findElement(By.xpath("//button[@onclick='alert()']")).click();
		
		if(driver instanceof JavascriptExecutor)
		{
			((JavascriptExecutor) driver)
				.executeScript("alert('Hello\nHow are you?'')");
					
		}
		
		Alert alrttxt = driver.switchTo().alert();
		System.out.println("Alert Text -->"+alrttxt.getText());
		alrttxt.accept();
		
		/*
		try
		{
			String strtxt = driver.switchTo().alert();
			System.out.println("Alert Text Output -->"+strtxt);
		}
		catch(Exception e)
		{
			System.out.println("Alert not triggered");
		}
		*/
		
		Thread.sleep(2000);
		driver.close();
	}

}
