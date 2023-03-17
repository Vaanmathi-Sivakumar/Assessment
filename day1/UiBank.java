package test.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class UiBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://uibank.uipath.com/register-account");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Vaanmathi");
		
		WebElement soureDropDown=driver.findElement(By.xpath("//select[@id='title']"));
		Select dropDown =new Select(soureDropDown);
		dropDown.selectByValue("ms");
		
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("S");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Sivakumar");
		
		WebElement soureDropDown1=driver.findElement(By.name("gender"));
		Select dropDown1 =new Select(soureDropDown1);
		dropDown1.selectByValue("female");
		
		WebElement soureDropDown2=driver.findElement(By.id("employmentStatus"));
		Select dropDown2 =new Select(soureDropDown2);
		dropDown2.selectByVisibleText("Unemployed");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vaan");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vaan@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("//input[@id='password']");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.close();
		
		
	}

}
