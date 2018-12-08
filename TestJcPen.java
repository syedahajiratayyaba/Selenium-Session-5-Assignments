package com.ibm.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestJcPen {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//open URL
		driver.get("http://www.jcpenney.com");
		
		// maximize the window
		driver.manage().window().maximize();
		Thread.sleep(6000);
				
		driver.findElement(By.xpath("id('closeButton')")).click();
		
		driver.findElement(By.xpath("id('searchTerm')")).sendKeys("shirts");
		
		driver.findElement(By.cssSelector("class('button.btn_searchForm')")).click();
		
		//driver.findElement(By.xpath("class('btn_searchForm')")).click();
		
		
		driver.switchTo().frame("predictiveSearchPP predictiveSearchPP--wideHeader");
		driver.findElement(By.xpath("class('predictiveSearchPP predictiveSearchPP--wideHeader')")).click();
		
		//Select drpMen= new Select(driver.findElement(By.xpath("src('/j/global/header/hoverpanel?N=20000014&deptCount=7\')"));
		Thread.sleep(6000);
	

	}

}
