package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest2 {
	@Test
	public void TestHDFCBank() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4b.04.24\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		/*driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();*/
		
		
		//Assert.assertEquals(title, "Find a Flight: Mercury Tours:");
		//Assert.assertTrue(title.startsWith("Find a"));
		//<a target="" href="/personal/making-payments/pay-via-smarthub/smarthub">SmartHub</a>
	
		Actions act1 = new Actions(driver);
		act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products']"))).perform();
		act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat']"))).perform();
		act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat/demat-account']"))).click().build().perform();;	
		String title = driver.getTitle();
		Assert.assertTrue(title.startsWith("Demat"));
		act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/making_payments/making-payments-landing']"))).perform();
		act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/find-your-nearest/Multipaypoint-for-Tax-Bills-Fees-Donations-CreditCards']"))).perform();
		act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/making-payments/pay-via-smarthub/smarthub']"))).click().perform();;	
		Assert.assertTrue(title.contains("Smarthub"));
		}

}
