package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.Loginpage;

public class LoginDemo_POM {

		WebDriver driver;
		
		Loginpage login;
		
		@Given("browser is open")
		public void browser_is_open() {
			
			String path= System.getProperty("user.dir");
		    System.setProperty("WebDriver.Chrome.driver", path+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		   
		}

		@And("user is on login Page")
		public void user_is_on_login_page() {
//			System.out.println("Hello Pom");
			driver.get("https://practicetestautomation.com/practice-test-login/");
		   
		}

		@When("^user Enter (.*) and (.*)$")
		public void user_enter_username_and_password(String usrnm, String pswrd) {
//			driver.findElement(By.name("username")).sendKeys(usrnm);
//			driver.findElement(By.name("password")).sendKeys(pswrd);
			login= new Loginpage(driver);
			
			login.enterUserName(usrnm);
			login.enterPassword(pswrd);
			
			
			
		}

		@And("some other action")
		public void some_other_action() {
//			login= new Loginpage(driver);
//			driver.findElement(By.id("submit")).click();
			login.login();
		}

		@Then("user is navigated to home page")
		public void user_is_navigated_to_home_page() {
			driver.getPageSource().contains("Practice");
			driver.close();
		}

	}



