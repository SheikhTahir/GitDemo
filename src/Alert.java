import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert {

	public static void main(String[] args) throws InterruptedException	 {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
//		*		SIMPLE ALERT POP-UP		*
//				-------------------
//		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		org.openqa.selenium.Alert a = driver.switchTo().alert();
//		System.out.println(a.getText());
//		Thread.sleep(2000);
//		a.accept();
//		driver.switchTo().defaultContent();
//		driver.findElement(By.id("login1")).sendKeys("venkat123");
//		driver.quit();
		
//		*		CONFIRM	POP-UP	*
//				______________
//		driver.get("https://demoqa.com/alerts");
//		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
//		Thread.sleep(3000);
//		org.openqa.selenium.Alert a = driver.switchTo().alert();
//		System.out.println(a.getText());
////		driver.quit();
		
		
//		*		PROMPT POP-UP		*
//				_____________
//		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
//		driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/div/div/div/div/div[2]/input[3]")).click();
//		Thread.sleep(3000);
//		org.openqa.selenium.Alert a = driver.switchTo().alert();
//		Thread.sleep(5000);
//		a.sendKeys("yes");
//		System.out.println(a.getText());
//		a.accept();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		Thread.sleep(3000);
		org.openqa.selenium.Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
//		driver.quit();

			
	}

}
