package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Mobileautomation1 extends Mobileautomation {
	@Test
	public void signup()
	{
		driver.findElement(By.xpath("//button[.='SIGN IN']")).click();
		driver.findElement(By.xpath("//a[.='Sign up']")).click();
		
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("yasmeen");
	

		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("Yasmeenkouser199@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Yasmeen@12");
		
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("01-12-1999");
		
		
		driver.findElement(By.xpath("//label[.='Male']/following-sibling::input[1]")).click();
		driver.findElement(By.xpath("//label[.='Female']/following-sibling::input")).click();
		
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9567864383");
		
		driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("welcome to mobileworld ");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[.='Sign In']")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("username")).sendKeys("Yasmeenkouser199@gmail.com");

		driver.findElement(By.id("password")).sendKeys("Yasmeen@12");
		driver.findElement(By.xpath("//a[@type='submit']")).click();
		@Test(priority=2,dataprovider="getdata")
		public void login(String email,String pwd)
		{
			driver.findElement(By.xpath("))
		}
	
		
		
	}

}
