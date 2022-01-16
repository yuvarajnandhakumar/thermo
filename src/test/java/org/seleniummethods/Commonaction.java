package org.seleniummethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.coding.DataInputProvider;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonaction {
	public static WebDriver d;
	public String excelname;



	public void launch(String url)
	{
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
		d.get(url);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

public void jscript(WebElement ele) throws InterruptedException
{
	JavascriptExecutor jj = (JavascriptExecutor)d;
	Thread.sleep(1000);
	jj.executeScript("arguments[0].scrollIntoView();", ele);
}
	public void passvalue(WebElement element,String value) throws InterruptedException
	{
		element.sendKeys(value);
		Thread.sleep(1000);
	}
	
	public void submit(WebElement ele) throws InterruptedException//login
	{
		ele.click();//login.click
		Thread.sleep(1000);
	}
	
	public void mouseover(WebElement ele) throws InterruptedException
	{
		Actions a = new Actions(d);
		a.moveToElement(ele).build().perform();
		Thread.sleep(1000);
	}
	
	//selenium reusable 
	
	//select - frame -alert -action - screenshot - webtable - window -javascriptexe
	
	
	public void acceptalert()
	{
		Alert a =(Alert)d;
		a.accept();
	}
	public void closebrowser()
	{
		d.quit();
	}
	
	public String getproperty(String data) throws FileNotFoundException, IOException
	{
		Properties p = new Properties();
		p.load(new FileInputStream(new File(".//Testdata//logincredentials.properties")));
		String value = p.getProperty(data);
		return value;
	}
	
	public String[][] getData(String excelname,String country) throws FileNotFoundException, IOException 
	{
		return DataInputProvider.getSheet(excelname,country);

	}


}
