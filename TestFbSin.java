package com.ibm.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFbSin {

	public static void main(String[] args) {
	
	
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();

				//open URL
				driver.get("http://facebook.com");
				
				// maximize the window
				driver.manage().window().maximize();
				
				//Provide email or phone number
				driver.findElement(By.xpath("id('email')")).sendKeys("1234567891");
				
				// Provide password
				driver.findElement(By.xpath("id('pass')")).sendKeys("cs083595");
				
				//Select to login
				driver.findElement(By.xpath("id('u_0_2')")).click();
				
	}

}
