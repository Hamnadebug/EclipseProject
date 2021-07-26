package DishaniProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Categories 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dishaniaqua.in/serviceon/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("demoperfection@gmail.com");//setting email address
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("serviceon@123!");//setting password
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[3]/input[1]")).click();//login Button
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/a[1]")).click();//master
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[2]/a[1]")).click();//categories
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();//add category
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("create");//category title
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();//click on submit button
	}

}
