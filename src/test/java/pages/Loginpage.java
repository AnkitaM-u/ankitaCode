package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	WebDriver driver;
	
	By enter_usernm = By.name("username");
	
	By enter_password = By.name("password");
	
	By click_login = By.id("submit");
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
	}
	public void enterUserName(String username)
	{
		driver.findElement(enter_usernm).sendKeys(username);
	}
	public void enterPassword(String password)
	{
		driver.findElement(enter_password).sendKeys(password);
	}
	public void login()
	{
		driver.findElement(click_login).click();
	}

}
