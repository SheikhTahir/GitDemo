import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
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

public class Window_Handling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		WebElement txtSearch = driver.findElement(By.id("inputValEnter"));
		txtSearch.sendKeys("Hand Sanitizer");
		WebElement btnSearch = driver.findElement(By.xpath("//span[text()='Search']"));
		btnSearch.click();
		WebElement btnPro = driver.findElement(By.xpath("(//img[@class='product-image '])[1]"));
		btnPro.click();
		
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String cd : allWindows)
		{
			if(!(parentWindow.equals(cd)))
					{
						driver.switchTo().window(cd);
					}
		}
		
		WebElement btnAdd = driver.findElement(By.id("add-cart-button-id"));
		btnAdd.click();
		driver.switchTo().defaultContent();
	}

}

