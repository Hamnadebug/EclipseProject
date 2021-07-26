package Seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PassportSeva 
{
	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Setup\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);	
		driver.get("https://passportindia.gov.in/AppOnlineProject/welcomeLink#");
		driver.manage().window().maximize();
		driver.findElement(By.className("main_button_typ_002")).click();
		driver.findElement(By.id("cpvLocationPO")).click();
		WebElement dropdown1 = driver.findElement(By.id("dcdrLocation"));
		Select set1 = new Select(dropdown1);
		set1.selectByVisibleText("Nagpur");
		driver.findElement(By.id("givenName")).sendKeys("Harry Potter");
		driver.findElement(By.id("surname")).sendKeys("Potter");
		driver.findElement(By.id("dob")).sendKeys(" 18/10/1988");
		driver.findElement(By.id("email")).sendKeys("hamna1234@gmail.com");
		driver.findElement(By.id("emailloginSameyes")).click();
	//	driver.findElement(By.id("loginId")).sendKeys("hamna1234@gmail.com");
		driver.findElement(By.id("pwd")).sendKeys("PowerFull");
		driver.findElement(By.id("confirmPwd")).sendKeys("PowerFull");
		WebElement dropdown2 = driver.findElement(By.id("hintQues"));
		Select set2 = new Select(dropdown2);
		set2.selectByIndex(2);
		driver.findElement(By.id("hintAns")).sendKeys("Pink");
		
		
		/*System.setProperty("webdriver.chrome.driver","E:\\Selenium Setup\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://passportindia.gov.in/AppOnlineProject/welcomeLink#");
		driver.manage().window().maximize();
		driver.findElement(By.className("main_button_typ_002")).click();
		*/
	}
	
	

}
