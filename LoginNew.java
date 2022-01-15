package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class LoginNew {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		WebElement username = driver.findElement(By.id("username"));
		
		username.sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");;
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
//driver.close();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ashwin");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ramesh");
driver.findElement(By.className("smallSubmit")).click();

	}

}
