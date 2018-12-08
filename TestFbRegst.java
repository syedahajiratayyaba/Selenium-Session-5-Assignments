package com.ibm.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFbRegst {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//open URL
		driver.get("http://facebook.com");
		
		// maximize the window
		driver.manage().window().maximize();
		
		//Full name
		driver.findElement(By.xpath("id('u_0_j')")).sendKeys("Amar");
		
		//Sur Name
		driver.findElement(By.xpath("id('u_0_l')")).sendKeys("Akbar");
		
		//provide Phone number
		driver.findElement(By.xpath("id('u_0_o')")).sendKeys("1234567891");
		
		//provide password
		driver.findElement(By.xpath("id('u_0_v')")).sendKeys("cs083595");
		
		//select day
		Select date = new Select(driver.findElement(By.xpath("id('day')")));
        date.selectByVisibleText("24");
        
        //select month
        Select month = new Select(driver.findElement(By.xpath("id('month')")));
        month.selectByVisibleText("Dec");
        
        //select year
        Select year = new Select(driver.findElement(By.xpath("id('year')")));
        year.selectByVisibleText("1990");
        
        //select male option 
        driver.findElement(By.xpath("id('u_0_a')")).click();
        
        
        //submit application 
        driver.findElement(By.xpath("id('u_0_11')")).click();
        				
	}

}
