package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_Junit {
   
	WebDriver driver;
	
	 @BeforeClass
	
	public static void beforeClass() {
		System.out.println("before class");
		
	}
	
	 @AfterClass
	 public static void afterClass() {
		 System.out.println("after class");
	 }

	 @Before
		public void init() {
			
			System.out.println("Before method");
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\jerin\\eclipseSeleniumnew-workspace\\crmnew\\driver\\chromedriver.exe");
			// Launch browser
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.get("https://codefios.com/ebilling/login");
			driver.manage().window().maximize();

			// wait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}
        @Test
		public void positiveLoginTest() {
        	System.out.println("positive login");
			driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");

			driver.findElement(By.id("password")).sendKeys("abc123");

			driver.findElement(By.id("login_submit")).click();
		}

           
        @Test
        public void negLginTest() {
			
        	System.out.println("neg test");
			driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");

			driver.findElement(By.id("password")).sendKeys("abc123444");

			driver.findElement(By.id("login_submit")).click();
		}
        
      
     @After
     
		public void closeBrowser() {
    	 System.out.println("after method");
			driver.close();
			driver.quit();
		}

	}


