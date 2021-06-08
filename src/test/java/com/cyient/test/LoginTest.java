package com.cyient.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;

public class LoginTest extends WebDriverWrapper {

	@Test
	public void signupTest() throws InterruptedException 
	{
		driver.findElement(By.xpath("//div[@class='email-capture__body']//*[local-name()='svg']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
        driver.findElement(By.linkText("Create an account")).click();
        
        driver.findElement(By.xpath("//input[@data-placeholder='First name/Given name']")).sendKeys("Dennis ");
        driver.findElement(By.xpath("//input[@data-placeholder='Last name/Surname']")).sendKeys("Rich");
        
        driver.findElement(By.xpath("//span[text()='Month']")).click();
        driver.findElement(By.xpath("//span[text()=' April ']")).click();
        
        driver.findElement(By.xpath("//span[text()='Day']")).click();
        driver.findElement(By.xpath("//span[text()=' 5 ']")).click();
        
        driver.findElement(By.xpath("//input[@data-placeholder='Year']")).sendKeys("2000");
        
        driver.findElement(By.xpath("//span[text()='Country/Region of residence']")).click();
        driver.findElement(By.xpath("//span[text()=' India ']")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys("abcd13@gmail.com");
        driver.findElement(By.xpath("//input[@data-placeholder='Create new password']")).sendKeys("Abc@12456");
        
        driver.findElement(By.xpath("//span[text()='Select one security question']")).click();
        driver.findElement(By.xpath("//span[text()=' What is the name of the street where you first lived? ']")).click();
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//input[@data-placeholder='Answer']")).click();
        driver.findElement(By.xpath("//input[@data-placeholder='Answer']")).sendKeys("Street123");
        driver.findElement(By.xpath("//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='Done']")).click();   
	}
}
