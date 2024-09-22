import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.seleniumhq.org/download/");
//		JavascriptExecutor j = (JavascriptExecutor) driver;
//		
		//To scroll down
//		j.executeScript("window.scrollBy(0,1000)");
//		Thread.sleep(3000);
//		//To scroll up
//		j.executeScript("window.scrollBy(0,-500)");
//		Thread.sleep(2000);
//		j.executeScript("window.scrollBy(0,1000)");
		
//		* SCROLL UP AND SCROLL DOWN 10 TIMES *
//		--------------------------------------
		
//		for(int i=1;i<=10;i++)
//		{
//			j.executeScript("window.scrollBy(0,50)");
//			Thread.sleep(200);
//		}
//		
//		for(int k=1;k<=10;k++)
//		{
//			j.executeScript("window.scrollBy(0,-50)");
//			Thread.sleep(200);
//		}
		
		
//		*	Write a Script to scroll web page upto specified element	*
//		-----------------------------------------------------------------

		// assign up to which path we want to down
//		WebElement w = driver.findElement(By.xpath("//*[text()='Selenium IDE']"));
//		//scroll down up to particular path
//		j.executeScript("arguments[0].scrollIntoView(true)",w); 
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[text()='Chrome']")).click();

		
//		*	Write a Script to enter textbox value and click using javascript	*
//		-------------------------------------------------------------------------
		
//		driver.get("https://adactin.com/HotelApp/index.php");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("document.getElementById('username').setAttribute('value','Hello')");
//		// to print the value
//		Object s = js.executeScript("return document.getElementById('username').getAttribute('value')");
//		System.out.println(s);
//		// to click login
//		js.executeScript("return document.getElementById('login').click()");
		
//							*	OR	*
//							---------
//		driver.get("https://adactin.com/HotelApp/index.php");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement w = driver.findElement(By.id("username"));
//		js.executeScript("arguments[0].setAttribute('value','Hello')",w);
//		WebElement w1 = driver.findElement(By.id("login"));
//		js.executeScript("arguments[0].click()",w1);
		
//		*		Using Page down:		*
//		---------------------------------
		
		driver.get("https://www.seleniumhq.org/download/"); 
		JavascriptExecutor j=(JavascriptExecutor) driver;
		WebElement w = driver.findElement(By.xpath("//*[text()='Selenium IDE']"));
		w.sendKeys(Keys.PAGE_DOWN);

	}
}
