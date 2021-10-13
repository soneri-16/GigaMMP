package org.iit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseClass {
	
	protected WebDriver driver;
	protected Properties prop = new Properties();
	
	public void instantiateDriver() {
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	}
	
	public void readproperty() throws IOException {
		
		String absolutePath = System.getProperty("user.dir")+"/config.selassgnment.properties";
		//System.out.println(absolutePath);
		
		File f = new File(absolutePath);
		FileInputStream fis = new FileInputStream(f);
		//Properties prop = new Properties();// mention at static above
		prop.load(fis);;
	}
}

