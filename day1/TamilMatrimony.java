package test.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement soureDropDown=driver.findElement(By.id("REGISTERED_BY"));
		Select dropDown =new Select(soureDropDown);
		dropDown.selectByValue("1");
		
		driver.findElement(By.xpath("//input[@id='NAME']")).sendKeys("Vaanmathi");
		driver.findElement(By.xpath("//input[@id='genderfemale']")).click();
		
		WebElement soureDropDown1=driver.findElement(By.xpath("//select[@id='DOBDAY']"));
		Select dropDown1 =new Select(soureDropDown1);
		dropDown1.selectByValue("27");
		
		WebElement soureDropDown2=driver.findElement(By.xpath("//select[@id='DOBMONTH']"));
		Select dropDown2 =new Select(soureDropDown2);
		dropDown2.selectByValue("7");
		

		WebElement soureDropDown3=driver.findElement(By.xpath("//select[@id='DOBYEAR']"));
		Select dropDown3 =new Select(soureDropDown3);
		dropDown3.selectByValue("2000");
		
		WebElement soureDropDown4=driver.findElement(By.xpath("//select[@id='RELIGION']"));
		Select dropDown4 =new Select(soureDropDown4);
		dropDown4.selectByValue("1");
		
		WebElement soureDropDown5=driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']"));
		Select dropDown5 =new Select(soureDropDown5);
		dropDown5.selectByValue("47");
		
		WebElement soureDropDown6=driver.findElement(By.xpath("//select[@id='COUNTRY']"));
		Select dropDown6 =new Select(soureDropDown6);
		dropDown6.selectByValue("98");
		
		WebElement soureDropDown7=driver.findElement(By.xpath("//select[@id='M_COUNTRYCODE']"));
		Select dropDown7=new Select(soureDropDown7);
		dropDown7.selectByValue("98");
		
		driver.findElement(By.id("MOBILENO")).sendKeys("9393939393");
		driver.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("vaan@gmail.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.close();
		
		
		
		
		
	}

}
