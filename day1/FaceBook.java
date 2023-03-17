package test.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Vaanmathi");
		driver.findElement(By.name("lastname")).sendKeys("Sivakumar");
		driver.findElement(By.name("reg_email__")).sendKeys("9393939393");
		driver.findElement(By.name("reg_passwd__")).sendKeys("vaanvaan");
		
		
		WebElement soureDropDown=driver.findElement(By.name("birthday_day"));
		Select dropDown =new Select(soureDropDown);
		dropDown.selectByValue("27");
		
		WebElement soureDropDown1=driver.findElement(By.name("birthday_month"));
		Select dropDown1 =new Select(soureDropDown1);
		dropDown1.selectByValue("7");
		
		WebElement soureDropDown2=driver.findElement(By.name("birthday_year"));
		Select dropDown2 =new Select(soureDropDown2);
		dropDown2.selectByValue("2000");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		driver.close();

	}

}
