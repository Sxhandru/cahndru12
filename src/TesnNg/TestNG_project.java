package TesnNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNG_project {
      public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Chandru\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Chandrusrinivasan");
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("2ZRY7E");
		
		driver.findElement(By.xpath("//input[@name=\"login\"]")).click();
		
		driver.findElement(By.xpath("//select[@name=\"location\"]")).sendKeys("New York");
		
		driver.findElement(By.xpath("//select[@name=\"hotels\"]")).sendKeys("Hotel Sunshine");
		
		driver.findElement(By.xpath("//select[@name=\"room_type\"]")).sendKeys("Super Deluxe");
		
		driver.findElement(By.xpath("//select[@name=\"room_nos\"]")).sendKeys("8-Eight");
		
		driver.findElement(By.xpath("//input[@name=\"datepick_in\"]")).sendKeys("09/09/2022");
		
		driver.findElement(By.xpath("//input[@name=\"datepick_out\"]")).sendKeys("10/09/2022");
		
		driver.findElement(By.xpath("//select[@name=\"adult_room\"]")).sendKeys("4-Four");
		
		driver.findElement(By.xpath("//select[@name=\"child_room\"]")).sendKeys("3-Three");
		
		driver.findElement(By.xpath("//input[@name=\"Submit\"]")).click();
		
		driver.findElement(By.xpath("//input[@name=\"radiobutton_0\"]")).click();
		
		driver.findElement(By.xpath("//input[@name=\"continue\"]")).click();
		
		driver.findElement(By.xpath("//input[@name=\"first_name\"]")).sendKeys("Chandru");
		
		driver.findElement(By.xpath("//input[@name=\"last_name\"]")).sendKeys("Srinivasan");
		
		driver.findElement(By.xpath("//textarea[@name=\"address\"]")).sendKeys(" 1511 Pillayar Kovil Thottam, Lakshmi Nagar, Bhavani,Erode-638316");
		
		driver.findElement(By.xpath("//input[@name=\"cc_num\"]")).sendKeys("1234567891234567");
		
		driver.findElement(By.xpath("//select[@name=\"cc_type\"]")).sendKeys("VISA");
		
		driver.findElement(By.xpath("//select[@name=\"cc_exp_month\"]")).sendKeys("August");
		
		driver.findElement(By.xpath("//select[@name=\"cc_exp_year\"]")).sendKeys("2022");
		
		driver.findElement(By.xpath("//input[@name=\"cc_cvv\"]")).sendKeys("123");
		
		driver.findElement(By.xpath("//input[@name=\"book_now\"]")).click();
		
      }
}
