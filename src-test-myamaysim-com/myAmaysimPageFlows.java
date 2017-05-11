package test.myamaysim.com;

import org.openqa.selenium.WebDriver;

public class myAmaysimPageFlows {

	WebDriver driver;
	
	public myAmaysimPageFlows (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void memberLogin()
	{
		myAmaysimElements Login = new myAmaysimElements(driver);
		
		Login.enterUsername();
		Login.enterPassword();
		Login.clickLogin();
		System.out.println("Login successful.");
	}
	
	public void popUp()
	{
		driver.switchTo().activeElement().click();
	}
	
	public void manageSettings()
	{
		myAmaysimElements settings = new myAmaysimElements(driver);
		
		settings.clickSetting();
		System.out.println("Settings menu clicked.");
	}
	
	public void saveSimNickname()
	{
		myAmaysimElements saveNickname = new myAmaysimElements(driver);
		
		saveNickname.clickEditSim();
		saveNickname.clickUpdateSim();
		saveNickname.saveSim();
		System.out.println("Nickname updated.");
	}
	
	public void cancelSimNickname()
	{
		myAmaysimElements cancelNickname = new myAmaysimElements(driver);
		
		cancelNickname.clickEditSim();
		cancelNickname.clickUpdateSim();
		cancelNickname.cancelSim();
		System.out.println("Nickname canceled.");
	}
		
	public void setCallerID()
	{
		myAmaysimElements setID = new myAmaysimElements(driver);
		
		setID.selectCallerID();
		System.out.println("Caller ID checkbox marked.");
	}
	
	public void saveCallForward()
	{	
		myAmaysimElements saveCall = new myAmaysimElements(driver);
		
		saveCall.clickCallForward();
		saveCall.clickCallNo();
		saveCall.saveCallForward();
		System.out.println("Call Forward updated.");
	}
	

}
