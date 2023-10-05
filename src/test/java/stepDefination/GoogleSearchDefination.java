package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import io.cucumber.java.en.*;

public class GoogleSearchDefination {
	WebDriver driver;
	
	
	@Given("Browser is open")
	public void browser_is_open() {
		String path= System.getProperty("user.dir");
	    System.setProperty("WebDriver.Chrome.driver", path+"/src/test/resources/drivers/chromedriver.exe");
	driver = new ChromeDriver();
	
	}

	@And("User is on Google search Page")
	public void user_is_on_google_search_page() {
		driver.get("https://www.google.co.in/");
	    
	}

	@When("user Enters text in Google Search Text")
	public void user_enters_text_in_google_search_text() {
		driver.findElement(By.name("q")).sendKeys("Automation Testing");
	   
	}

	@And("hits Enter")
	public void hits_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    
	}

	@Then("user is Navigate to search Result")
	public void user_is_navigate_to_search_result() {
		driver.getPageSource().contains("Automation testing types");
		driver.close();
		driver.quit();
	   
	}


}
