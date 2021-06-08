package com.cyient.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;

public class FindACrusisesTest extends WebDriverWrapper {

	@Test
	public void invalidCredentialTest() throws Exception
	{
		driver.findElement(By.xpath("//div[@class='email-capture__body']//*[local-name()='svg']")).click();
		driver.findElement(By.xpath("//div[@class='headerMainToolbar__menu__icon']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Find a Cruise']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2021-2022 Cruises']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='rciFirstName']")).sendKeys("Dennis");
		driver.findElement(By.name("last-name")).sendKeys("Rich");
		
		Select selectCountry = new Select(driver.findElement(By.xpath("//select[@class='md-input']")));
		selectCountry.selectByValue("IND");
		driver.findElement(By.xpath("//button[normalize-space()='Sign Up']")).click();

		String actualValue= driver.findElement(By.id("rciEmailAddressMissing")).getText();
		Assert.assertEquals( actualValue,"Missing Email Address");
	}
}
