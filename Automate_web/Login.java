package Automate_web;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


public class Login {

	public static void main(String[] args) 
	{
		  System.setProperty("webdriver.chrome.driver","F:\\Java_FSD\\Phase_5\\New folder/chromedriver.exe");
		String driverPath="F:\\Java_FSD\\Phase_5\\New folder/chromedriver.exe";
		WebDriver driver ;
		driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/?.intl=in");
		driver.findElement(By.id("login-username")).sendKeys("Admin@yahoo.com");
		driver.findElement(By.name("signin")).click();
		 
		
	

	}

}