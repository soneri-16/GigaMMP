package org.iit.healthcare.selassingments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class Fees {
	
		WebDriver driver ;
	
 public void feeinfo() {
	 
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
		
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");   
		
		driver.findElement(By.id("username")).sendKeys("ria1");
		driver.findElement(By.id("password")).sendKeys("Ria12345");
		
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Fees']")).click();
		
	 
	List<WebElement> c=	driver.findElements(By.xpath("//div[@class='panel-body nopadding']/li"));
	System.out.println(c.size());
	
	for (int i=0;i< 5; i++) {
	String a =c.get(i).getText();
	System.out.println(a);
	
	String dot = a;
	String name[]= dot.split(" ");
     String	d=name[0];
     String	m=name[1];
     
//String r=name[2];

System.out.println(d);
System.out.println(m);
//System.out.println(r);



//String[] t = r.split(":......");

int count =0;
		if(d.equalsIgnoreCase("vaccination")) {
		
		int r =	count ++;
			System.out.println(d);
			System.out.println(r);
			
		}
	}
	
 }
}