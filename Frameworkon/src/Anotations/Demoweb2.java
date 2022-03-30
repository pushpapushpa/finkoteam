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

public class Demoweb2 {
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
	public void appeal() {
		driver.findElement(By.xpath("(//a[contains(text(),'Apparel &')])[3]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Rockabilly')]/../../..//input[@class='button-2 product-box-add-to-cart-button']")).click();
		
	}
	@Test
	public void aandz() {
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[3]")).click();
		WebElement sortby=driver.findElement(By.cssSelector("select#products-orderby"));
		Select element1= new Select(sortby);
		element1.selectByVisibleText("Name: A to Z");
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
	