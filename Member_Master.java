package DishaniProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Member_Master
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dishaniaqua.in/serviceon/");//getting site
		driver.manage().window().maximize();//maximizing site
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("demoperfection@gmail.com");//setting email address
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("serviceon@123!");//setting password
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[3]/input[1]")).click();//login Button
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/a[1]")).click();//Master Button
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[1]/a[1]")).click();//membership package
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();//add new member
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Harry");//name
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("500");//km
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys("50000");//price
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/input[1]")).sendKeys("26");//leads
		WebElement F1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[2]/div[1]/div[1]/button[1]/div[1]/div[1]/div[1]"));//validity
		Select set = new Select(F1);
		set.selectByVisibleText("Year");
		
	}

}