import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WAITS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://adactin.com/HotelApp/index.php");
//		*		IMPLICITYLY WAIT()		*
//		---------------------------------
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.id("username")).sendKeys("Venkat");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.id("password")).sendKeys("Venkat@123");
		
//		*		EXPLICITYLY WAIT()		*
//		---------------------------------
		
//		driver.findElement(By.id("username")).sendKeys("Venkat");
//		driver.findElement(By.id("password")).sendKeys("Venkat@123");
//		WebDriverWait wait = new WebDriverWait(driver, 60);
//		WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login")));
//        loginButton.click();


	}

}
