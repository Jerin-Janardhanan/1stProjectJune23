package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	static WebDriver driver; 
	
	public static void main(String[] args) {
		
		 init();
		 positiveLoginTest();
		 closeBrowser();
		
		 init();
		 negLginTest();
		 closeBrowser();
		
	}
	public static void init() {
		 //set System property
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\jerin\\eclipseSeleniumnew-workspace\\crmnew\\driver\\chromedriver.exe");
		//Launch browser
	    driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://codefios.com/ebilling/login");
		driver.manage().window().maximize();
		
		//wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public static void positiveLoginTest() {
		 // identify element and insert value
		driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		driver.findElement(By.id("login_submit")).click();
	}
	
	public static void negLginTest() {
		 // identify element and insert value
		driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		
		driver.findElement(By.id("password")).sendKeys("abc123444");
		
		driver.findElement(By.id("login_submit")).click();
	}
	
	public static void closeBrowser() {
		driver.close();
	}
		
	}
		
		

		