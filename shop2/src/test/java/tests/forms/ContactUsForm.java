package tests.forms;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ContactUsForm {
	WebDriver driver;
	
	  @Test
	  public void c1() {
		  
		  System.out.println("testai veikia");
	  }
	  @Test
	  public void c2() {
		  System.out.println("testai veikia");
		  Assert.assertTrue(false);
	  }
	  @Test
	  public void c3() {
		  System.out.println("testai veikia");
	  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://automationpractice.com/index.php?controller=contact");
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
