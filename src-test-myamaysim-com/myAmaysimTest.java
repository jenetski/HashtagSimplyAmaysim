package test.myamaysim.com;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import test.myamaysim.com.myAmaysimPageFlows;


public class myAmaysimTest {
	
	WebDriver driver;
	
	@Before
	public void setUp(){
		File file = new File("C://Users//jenetski//Desktop//Selenium Practice//chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		driver.get("https://accounts.amaysim.com.au/");
		driver.manage().window().maximize();
		System.out.println("Amaysim Homepage is loaded successfully!");
	}
	
	@Test
	public void runTest()
	{
		myAmaysimPageFlows myAmaysimFlow =  new myAmaysimPageFlows(driver);
		
		myAmaysimFlow.memberLogin();
		myAmaysimFlow.popUp();
		myAmaysimFlow.manageSettings();
		myAmaysimFlow.saveCallForward();
	}
	
	
	@After
	public void Close()
	{
		driver.close();
		driver.quit();
	}
}
