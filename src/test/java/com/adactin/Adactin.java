package com.adactin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Java_task1\\Driver126\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(300);
		
		WebElement a = driver.findElement(By.xpath("//textarea[@title='Search']"));
		a.sendKeys("Adactin");
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement c = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		c.click();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ShrutheC");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Adactin@123");
		
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		login.click();
		
		WebElement singledrop = driver.findElement(By.id("location"));
		Select select = new Select(singledrop);
		select.selectByValue("London");
		Thread.sleep(300);
		
		WebElement s = driver.findElement(By.id("hotels"));
		Select select1 = new Select(s);
		select1.selectByValue("Hotel Creek");
		Thread.sleep(500);
		
		WebElement a1 = driver.findElement(By.id("room_type"));
		Select select2 = new Select(a1);
		select2.selectByValue("Double");
		Thread.sleep(300);
		
		WebElement sd = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select selects = new Select(sd);
		selects.selectByValue("2");
		Thread.sleep(300);
		
		WebElement f = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		f.clear();
		f.sendKeys("12/07/2024");
		Thread.sleep(300);
		
		WebElement f2 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		f2.clear();
		f2.sendKeys("13/07/2024");
		Thread.sleep(300);
		
		WebElement sd1 = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select selects1 = new Select(sd1);
		selects1.selectByValue("2");
		Thread.sleep(300);
		
		WebElement sd2 = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select selects2 = new Select(sd2);
		selects2.selectByValue("2");
		Thread.sleep(300);
		
		WebElement l = driver.findElement(By.xpath("//input[@value='Search']"));
		l.click();
		
		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
		driver.findElement(By.xpath("//input[@name='continue']")).click();
		
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Shruthe");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Chezhiyaan");
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("london");
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1546124514527895");
		
		WebElement sd3 = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select selects3 = new Select(sd3);
		selects3.selectByValue("MAST");
		Thread.sleep(300);
		
		WebElement sd4 = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select selects4 = new Select(sd4);
		selects4.selectByValue("5");
		Thread.sleep(300);
		
		WebElement sd5 = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select selects5 = new Select(sd5);
		selects5.selectByValue("2028");
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("342");
		
		WebElement l1 = driver.findElement(By.name("book_now"));
		l1.click();
		
		driver.findElement(By.linkText("Logout")).click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\HP\\eclipse-workspace\\Java_task1\\Screenshot\\Adactin1.png");
		FileUtils.copyFile(source, destination);
		
	}
}
