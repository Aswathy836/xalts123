package test1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
 
  @BeforeClass
  public void beforeClass() 
  {
	 driver=new ChromeDriver();
  }
  @Test
  public void signup() 
  {
	  driver.get("https://xaltsocnportal.web.app/signin");
	  driver.findElement(By.id("email")).sendKeys("valid@example.com");
	  driver.findElement(By.id("outlined")).sendKeys("StrongP@ssword123");
	  driver.findElement(By.id("sign_up_button")).click();
  }
  @Test
  public void signin() 
  {
	  driver.findElement(By.id("email")).sendKeys("valid@example.com");
	  driver.findElement(By.id("outlined-basic")).sendKeys("StrongP@ssword123");
	  driver.findElement(By.id("login_button")).click();
	   
  }
  @Test
  public void signout() 
  {
	  driver.findElement(By.id("sign_out_button")).click();
  }

  @AfterClass
  public void afterClass() {
  }

}
