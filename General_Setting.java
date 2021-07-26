package DishaniProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class General_Setting
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Setup\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://dishaniaqua.in/serviceon/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("div.limiter:nth-child(1) div.container-login100 div.wrap-login100 form.login100-form.validate-form div.wrap-input100.validate-input:nth-child(2) > input.input100")).sendKeys("demoperfection@gmail.com");//Email address
		driver.findElement(By.cssSelector("div.limiter:nth-child(1) div.container-login100 div.wrap-login100 form.login100-form.validate-form div.wrap-input100.validate-input:nth-child(3) > input.input100:nth-child(1)")).sendKeys("serviceon@123!");//Password
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/form[1]/div[3]/input[1]")).click();//Login Button
		driver.findElement(By.xpath("//p[contains(text(),'Dashboard')]")).click();//Dashboard
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();//Setting
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/div[1]/ul[1]/li[1]/a[1]")).click();//Genereal Setting
		
		WebElement F1=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));//Application Name
		F1.clear();
		F1.sendKeys("Demo Application");
		WebElement F2 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]"));//Admin Email
		F2.clear();
		F2.sendKeys("Work Rapidly");
		WebElement F3 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/textarea[1]"));//description
		F3.clear();
		F3.sendKeys("testing");
		WebElement F4 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]"));//Application title
		F4.clear();
		F4.sendKeys("testing");
		WebElement F5 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/input[1]"));//Copyright
		F5.clear();
		F5.sendKeys("testing");
		WebElement F6 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/textarea[1]"));//Footer about
		F6.clear();
		F6.sendKeys("testing");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();//Submit Button
	}

}
