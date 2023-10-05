//package stepDefination;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//public class LoginBasic {
//	
//	WebDriver driver;
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//		String path= System.getProperty("user.dir");
//	    System.setProperty("WebDriver.Chrome.driver", path+"/src/test/resources/drivers/chromedriver.exe");
//	driver = new ChromeDriver();
//	   
//	}
//
//	@And("user is on login Page")
//	public void user_is_on_login_page() {
//		driver.get("https://practicetestautomation.com/practice-test-login/");
//	   
//	}
//
//	@When("^user Enter (.*) and (.*)$")
//	public void user_enter_username_and_password(String usrnm, String pswrd) {
//		driver.findElement(By.name("username")).sendKeys(usrnm);
//		driver.findElement(By.name("password")).sendKeys(pswrd);
//		
//		
//		
//	}
//
//	@And("some other action")
//	public void some_other_action() {
//		driver.findElement(By.id("submit")).click();
//	}
//
//	@Then("user is navigated to home page")
//	public void user_is_navigated_to_home_page() {
//		driver.getPageSource().contains("Practice");
//		driver.close();
//	}
//
//}
