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

public class Actions_Drag_And_Drop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Actions a = new Actions (driver);
		WebElement source = driver.findElement(By.id("credit2"));
		WebElement des = driver.findElement(By.id("bank"));
		Thread.sleep(2000);
		a.dragAndDrop(source, des).perform();
		System.out.println("Git Demo");
		System.out.println("Git Demo");
		System.out.println("Git Demo");
//		a.clickAndHold(source).moveToElement(des).release(des).perform(); 	* WITHOUT USING DRAGANDDROP *
	}

}
