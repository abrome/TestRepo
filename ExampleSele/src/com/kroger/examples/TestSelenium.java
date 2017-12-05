package com.kroger.examples;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestSelenium {

	 static WebDriver driver;
	 static String Chromepath="D:\\Users\\romchava\\Selenium\\SeleniumJars\\chromedriver.exe";
	
	 
	 @Test
	 public void launch() {
			
		 System.setProperty("webdriver.chrome.driver", Chromepath);
		    driver=new ChromeDriver();
			driver.get("http://toolsqa.com/automation-practice-table/");
			String name=driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
			System.out.println(name);
		   // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();
			System.out.println("Link has been clicked otherwise an exception would have thrown");
			
			String sRowValue = "Clock Tower Hotel";
			for (int i=1;i<=5;i++){
				String sValue = null;
				sValue = driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[" + i + "]/th")).getText();
					if(sValue.equalsIgnoreCase(sRowValue)){
			for (int j=1;j<=5;j++){
				String sColumnValue= driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[" + i + "]/td["+ j +"]")).getText();
				System.out.println(sColumnValue);
			}
			break;
					}
		
			
			
	 }
			driver.close();
	 }
	 
}
