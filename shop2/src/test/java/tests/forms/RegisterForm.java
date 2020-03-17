package tests.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisterForm {
	WebDriver driver;
	
  @Test
  public void r1() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector(
			  "#homeslider > li:nth-child(2) > div > p:nth-child(3) > button")).click();
	  System.out.println("testai veikia");
  }
  @Test
  public void r2() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector(
			  "#homeslider > li:nth-child(2) > div > p:nth-child(3) > button")).click();
	  System.out.println("testai veikia");
  }
  @Test
  public void r3() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector(
			  "#homeslider > li:nth-child(2) > div > p:nth-child(3) > button")).click();
	  System.out.println("testai veikia");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://automationpractice.com");
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
