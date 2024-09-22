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

public class Actions_Mouse_Hover_Actions {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		WebElement courses = driver.findElement(By.linkText("COURSES"));
		Actions a = new Actions(driver);
		a.moveToElement(courses).perform();
		Thread.sleep(2000);
		WebElement devOpTraining = driver.findElement(By.xpath("//span[text()='DevOps Training']"));
		a.click(devOpTraining).perform();
	}

}
