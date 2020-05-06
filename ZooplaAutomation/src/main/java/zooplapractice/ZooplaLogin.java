package zooplapractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZooplaLogin {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.zoopla.co.uk/");
		
		//*[@class='ui-button-primary ui-cookie-accept-all-medium-large']
		
		driver.findElement(By.xpath("//*[@class='ui-button-primary ui-cookie-accept-all-medium-large']")).click();
		//*[@class='button button--tertiary-dark account-link__text']
		driver.findElement(By.xpath("//*[@class='button button--tertiary-dark account-link__text']")).click();
		//*[@type='email']
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("israrnj@gmail.com");
		//*[@type='password']
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("smarttech");
		
		driver.findElement(By.xpath("//*[@id='signin_submit']")).click();
		
//		driver.getTitle()
		
		System.out.println(driver.getTitle());
		
		
	}

}
