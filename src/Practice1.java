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

public class Practice1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
//		--------------------------------------------------------------------
//		Q) GO TO FLIPKART.COM , CHECK MOBILE CASE USING MOUSE HOVER ACTION & 
//			CHECK THE PARTICULAR TITLE IS CORRECT & TAKE SCREENSHOT Q)
//		--------------------------------------------------------------------
		
//		driver.get("https://www.flipkart.com/");
//		WebElement web = driver.findElement(By.xpath(".//*[text()='Electronics']"));
//		Actions a=new Actions(driver);
//		a.moveToElement(web).perform();
//		Thread.sleep(2000);
//		WebElement MA = driver.findElement(By.xpath(".//*[text()='MobileAccessory']"));
//		a.moveToElement(MA).perform();
//		WebElement DC = driver.findElement(By.xpath(".//*[text()='Designer Cases']"));
//		a.moveToElement(DC).click().perform();
////		Thread.sleep(2000);
////		DC.click();
//		String s = driver.getCurrentUrl();
//		if(s.equalsIgnoreCase("https://www.flipkart.com/mobile-accessories/cases-and-covers/designer-cases-covers/pr?sid=tyy,4mr,q2u,qgl&otracker=categorytree&fm=neo%2Fmerchandising&iid=M_b423b9ae-0892-4eb2-bd9b-736350f0f8a4_1_372UD5BXDFYS_MC.Y7DAA3WHIX67&otracker=hp_rich_navigation_3_1.navigationCard.RICH_NAVIGATION_Electronics~MobileAccessory~Designer%2BCases_Y7DAA3WHIX67&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_3_L2_view-all&cid=Y7DAA3WHIX67")) 
//		{	
//			System.out.println("u r in mobile case page");
//		}
//		else
//		{
//			System.out.println("u r not in mobile case");
//		}
//		Thread.sleep(3000);
//		TakesScreenshot tk=(TakesScreenshot) driver;
//		File f = tk.getScreenshotAs(OutputType.FILE);
//		File f1=new File("D:/flipkart mobile case.png");
//		FileUtils.copyFile(f,f1 );
		
//		-----------------------------------
//		Q)  GMAIL LOGIN USING JAVASCRIPT Q)
//		-----------------------------------
		
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(5000);
		WebElement w = driver.findElement(By.xpath(".//*[@id='identifierId']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','venkat12345')",w);
		WebElement w1 = driver.findElement(By.xpath(".//*[text()='Next']"));
		js.executeScript("arguments[0].click()",w1);
		Thread.sleep(6000);
		WebElement w2 = driver.findElement(By.xpath("//*[@name='password']"));
		js.executeScript("arguments[0].setAttribute('value','venkat12345')",w2);
		Thread.sleep(6000);
		WebElement w3 = driver.findElement(By.xpath(".//*[@id='passwordNext']/div[2]"));
		js.executeScript("arguments[0].click()",w3);
				
	}

}
