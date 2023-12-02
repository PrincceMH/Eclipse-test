package webdriverdemo;



import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;

public class WebDriverDemo {
   
   @Test
   public void testDiferenceCalculator() {
	 //Set up web driver (chrome, firefox,...)
		//System.setProperty("webdriver.gecko.driver", "C:\\...\\Selenium\\Selenium WebDriver\\Java\\Libs\\geckodriver-v0.23.0-win32\\geckodriver.exe");
		   
		WebDriver driver = new ChromeDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	      // Click on Math Calculators
	      driver.findElement(By.xpath("//*[@id=\"homelistwrap\"]/div[3]/div[2]/a")).click();
	      
	      // Click on Percent Calculators
	      driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();
	      
	      // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.name("c3par1")).sendKeys("20");
	      driver.findElement(By.name("c3par2")).sendKeys("35");
	      
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath("//*[@id=\"content\"]/form[5]/table/tbody/tr[3]/td/input[2]")).click();

	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath(".//*[@id=\"content\"]/p[2]/font/b")).getText();

	      ///*[@id="content"]/h2[1]
	      // Assert actual value and expected value
	      assertEquals(result, "54.545454545455%");
	      
	      //Close the Browser.
	      driver.close();
	   
   }
   @Test
   public void testDiferenceCalculatorValorIgual() {
	 //Set up web driver (chrome, firefox,...)
		//System.setProperty("webdriver.gecko.driver", "C:\\...\\Selenium\\Selenium WebDriver\\Java\\Libs\\geckodriver-v0.23.0-win32\\geckodriver.exe");
		   
		WebDriver driver = new ChromeDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	      // Click on Math Calculators
	      driver.findElement(By.xpath("//*[@id=\"homelistwrap\"]/div[3]/div[2]/a")).click();
	      
	      // Click on Percent Calculators
	      driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();
	      
	      // Enter value 10 in the first number of the Percentage Difference Calculator
	      driver.findElement(By.name("c3par1")).sendKeys("20");
	      driver.findElement(By.name("c3par2")).sendKeys("20");
	      
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath("//*[@id=\"content\"]/form[5]/table/tbody/tr[3]/td/input[2]")).click();

	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath(".//*[@id=\"content\"]/p[2]/font/b")).getText();

	      ///*[@id="content"]/h2[1]
	      // Assert actual value and expected value
	      assertEquals(result, "50%");
	      
	      //Close the Browser.
	      driver.close();
	   
   }
	
  

public static void main(String[] args) {
   }
}