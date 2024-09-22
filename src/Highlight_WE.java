import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlight_WE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactin.com/HotelApp/index.php");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		WebElement username = driver.findElement(By.id("username"));
		j.executeScript("arguments[0].setAttribute('style', 'background: green; border: 2px solid red;')", username);
		Thread.sleep(2000);
		username.sendKeys("venkat");
		
		
		WebElement password = driver.findElement(By.id("password"));
		j.executeScript("arguments[0].setAttribute('style', 'background: orange; border: 4px solid green;')", password);
		Thread.sleep(2000);
		password.sendKeys("vengat@1234");
		

		Thread.sleep(2000);
		WebElement login = driver.findElement(By.id("login"));
		j.executeScript("arguments[0].setAttribute('style', 'background: violet; border: 6px solid yellow;')", login);
		Thread.sleep(2000);
		login.click();
		
		
	}

}
