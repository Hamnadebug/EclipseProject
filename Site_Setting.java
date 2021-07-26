package DishaniProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Site_Setting 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dishaniaqua.in/serviceon/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("demoperfection@gmail.com");//Email Address
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("serviceon@123!");//Password
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[3]/input[1]")).click();//Login Button
		driver.findElement(By.xpath("//p[contains(text(),'Dashboard')]")).click();
		
		// Site Setting 
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Site Settings')]")).click();
		WebElement F1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
		F1.clear();
		F1.sendKeys("Facebook");
	}

}
