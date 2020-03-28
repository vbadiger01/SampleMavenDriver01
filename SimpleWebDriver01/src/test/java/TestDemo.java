package test.java;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestDemo {
	
	WebDriver driver = null;
	
	@Test
	public void Testdemo001() throws Exception {
		System.out.println("In method 1"+Thread.currentThread());
		
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome Downloads\\SeleniumFiles\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://google.com");
		Thread.sleep(5000);
		
	}
	
	@Test
	public void Testdemo002() throws Exception {
		System.out.println("In method 2"+Thread.currentThread());
		
		System.setProperty("webdriver.ie.driver", "E:\\Chrome Downloads\\SeleniumFiles\\drivers\\IEDriverServer.exe");
		driver= new InternetExplorerDriver();
		
		driver.get("http://gmail.com");
		Thread.sleep(5000);	
		
	}
	
	@Test
	public void Testdemo003() throws Exception {
		System.out.println("In method 2"+Thread.currentThread());
		
		System.setProperty("webdriver.ie.driver", "E:\\Chrome Downloads\\SeleniumFiles\\drivers\\IEDriverServer.exe");
		driver= new InternetExplorerDriver();
		
		driver.get("http://facebook.com");
		Thread.sleep(5000);	
		
	}
	
	@AfterMethod
	public void teardownall()
	{
		this.driver.quit();
	}
			
	

}
