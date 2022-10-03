package Automate_web;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\Java_FSD\\Phase_5\\New folder/chromedriver.exe");
		String driverPath="F:\\Java_FSD\\Phase_5\\New folder/chromedriver.exe";
		WebDriver driver ;
		driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create");
    	driver.findElement(By.id("usernamereg-firstName")).sendKeys("Admin");
    	driver.findElement(By.id("usernamereg-lastName")).sendKeys("home");
    	driver.findElement(By.id("usernamereg-userId")).sendKeys("adhome");
    	driver.findElement(By.id("usernamereg-password")).sendKeys("aabbajaabba");
    	driver.findElement(By.id("usernamereg-birthYear")).sendKeys("1900");
    	driver.findElement(By.name("signup")).click();
		
		
	
		


	}

}