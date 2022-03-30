package Anotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demoweb {
WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	@Test
	public void gettile() {
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void register() {
	driver.findElement(By.linkText("Register")).click();;
	    driver.findElement(By.xpath("//input[@id='gender-female']")).click();
	    driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("pogo");
	     driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("p");
	     driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("pogo1234@gmail.com");
	     driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("pogo1234");
	     driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("pogo1234");
	     driver.findElement(By.xpath("//input[@id='register-button']")).click();
	}
	
	@Test
	public void logib() {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		   driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("pogo1234@gmail.com");
		   driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("pogo1234");
		   driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		   
	}
	
		@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	

}
