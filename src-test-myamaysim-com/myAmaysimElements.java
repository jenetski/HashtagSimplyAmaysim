package test.myamaysim.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class myAmaysimElements {
	
	private static final By Login_Username = By.id("username");
	private static final By Login_Password = By.id("password");
	private static final By Login_Button = By.xpath("//*[@id='new_session']/input[4]");
	private static final By Manage_Settings = By.linkText("Settings");
	
	private static final By Edit_Sim_Nickname = By.xpath("//*[@id='edit_settings_phone_label']");
	private static final By Update_Sim_Nickname = By.xpath("//*[@id='my_amaysim2_setting_phone_label']");
	private static final By Save_Sim_Nickname = By.xpath("//*[@id='edit_settings_sim_nickname']/div[3]/div/input");
	private static final By Cancel_Sim_Nickname = By.xpath("//*[@id='show_settings_sim_nickname']");
	
	private static final By Caller_ID = By.xpath("//*[@id='edit_setting_caller_id_out_1749551']/div[2]/label");
	
	private static final By Edit_Call_Forwarding = By.xpath("//*[@id='edit_settings_call_forwarding']") ;
	private static final By Call_Forwarding_Popup = By.className("confirm_popup_confirm");
	private static final By Call_Forward_Yes = By.xpath("//*[@id='update_call_forwarding_form']/div[2]/div/label[1]/span");
	private static final By Call_Forward_No = By.xpath("//*[@id='update_call_forwarding_form']/div[2]/div/label[2]/span");
	private static final By Save_Call_Forward = By.xpath("//*[@id='update_call_forwarding_form']/div[4]/div/input");
	private static final By Cancel_Call_Forward = By.xpath("//*[@id='cancel_settings_call_forwarding']");
	
	WebDriver driver;
	
	public myAmaysimElements (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterUsername()
	{
		driver.findElement(Login_Username).sendKeys("0468827174");
	}
	
	public void enterPassword()
	{
		driver.findElement(Login_Password).sendKeys("theHoff34");
	}
	
	public void clickLogin()
	{
		driver.findElement(Login_Button).click();
	}
		
	public void clickSetting()
	{
		driver.findElement(Manage_Settings).click();
	}
	
	public void clickEditSim()
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement editSim = wait.until(ExpectedConditions.visibilityOfElementLocated(Edit_Sim_Nickname));
		editSim.click();
	}

	public void clickUpdateSim()
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement clickUpdate = wait.until(ExpectedConditions.visibilityOfElementLocated(Update_Sim_Nickname));
		clickUpdate.clear();
		clickUpdate.sendKeys("Test 005");
	}
	
	public void saveSim()
	{
		driver.findElement(Save_Sim_Nickname).click();
	}
	
	public void cancelSim()
	{
		driver.findElement(Cancel_Sim_Nickname).click();
	}
		
	public void selectCallerID()
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement selectID = wait.until(ExpectedConditions.visibilityOfElementLocated(Caller_ID));
		selectID.click();
	}
	
	public void clickCallForward()
	{	
	    WebDriverWait wait = new WebDriverWait(driver,30);
        WebElement editCall = wait.until(ExpectedConditions.visibilityOfElementLocated(Edit_Call_Forwarding));
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);",editCall);
        editCall.click();
        WebElement confirmBtn = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(Call_Forwarding_Popup));
        js.executeScript("arguments[0].click();", confirmBtn);
	}
	
	public void clickCallYes()
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement Yes = wait.until(ExpectedConditions.visibilityOfElementLocated(Call_Forward_Yes));
		Yes.click();
	}
	
	public void clickCallNo()
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement No = wait.until(ExpectedConditions.visibilityOfElementLocated(Call_Forward_No));
		No.click();
	}
	
	public void saveCallForward()
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement saveCallForward = wait.until(ExpectedConditions.visibilityOfElementLocated(Save_Call_Forward));
		saveCallForward.click();
	}
	
	public void cancelCallForward()
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement cancelCallForward = wait.until(ExpectedConditions.visibilityOfElementLocated(Cancel_Call_Forward));
		cancelCallForward.click();
	}
	
	
}