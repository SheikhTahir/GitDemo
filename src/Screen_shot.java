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

import com.google.common.io.Files;

public class Screen_shot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
//		*		SIMPLE SCREENSHOT		*
//		---------------------------------
//		driver.get("https://amazon.in");
//		driver.manage().window().maximize();
//		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		Files.copy(f,new File("D:\\amazonscreenshot.jpg"));
		
//		*		SCREENSHOT		*
//		-------------------------
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("Hello");
		TakesScreenshot tk = (TakesScreenshot) driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("D://facebook.png");
		FileUtils.copyFile(source,des);
	}
}
