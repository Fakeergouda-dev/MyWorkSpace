package org.Simple.MyWorkSpace;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBasic {

	
WebDriver driver;
	
	@Test
	public void launch() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.geeksforgeeks.org/trending/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		List<WebElement> elem=driver.findElements(By.tagName("a"));
		try
		{			
			System.out.println("List of elements"+elem.size());
			for(int i=0; i<elem.size();i++)
			{
				String href=elem.get(i).getDomAttribute("href");
				System.out.println(href);
			}
		}catch(StaleElementReferenceException e)
			{
			for(int i=0; i<elem.size();i++)
			{
				String href=elem.get(i).getDomAttribute("href");
				System.out.println(href);
			}
			}		
		driver.quit();
	}


}
