package org.iit.healthcare.selassingments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PortalLogin  {
	
WebDriver driver;
	
	@Test
	public void validateAppointment() {   
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
	driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
	
	    String actual = login("ria1", "Ria12345");
	    String expected = "ria1";
	    Assert.assertTrue(actual.contains(expected));
	
	}
	
	
	
	public String login(String uname, String password) {
		
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		
	String actual=	driver.findElement(By.tagName("h3")).getText();
	System.out.print(actual);
		return actual;
		

	}
}
