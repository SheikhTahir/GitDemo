import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoSuchElementException;

public class locators {

	public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
//		driver.get("https://adactin.com/HotelApp/index.php");
//		driver.manage().window().maximize();
//		WebElement x = driver.findElement(By.id("username"));
//		x.sendKeys("vengatram");
//		Thread.sleep(500);
//		WebElement x1 = driver.findElement(By.name("password"));
//		x1.sendKeys("vengat@123445");
//		Thread.sleep(500);
//		WebElement x2 = driver.findElement(By.id("login"));
//		x2.click();
//		Thread.sleep(1000);
//		
//		WebElement x3 = driver.findElement(By.linkText("Forgot Password?"));
//		Thread.sleep(1000);
//		x3.click();
//		WebElement x4 = driver.findElement(By.partialLinkText("Forgot"));
//		x4.click();
		
//		* isDisplayed()
		driver.get("https://www.facebook.com/");
		boolean logo=driver.findElement(By.xpath("//*[@id='globalContainer']/div/div/div/div/div/div/img")).isDisplayed();
		if(logo==true)
		{ 
		System.out.println("logo is available");
		}
		else{
		System.out.println("logo is not available");
		}
		
//		* getAttributes() and getText()
//		driver.get("http://www.adactin.com/HotelApp/index.php");
//		driver.findElement(By.id("username")).sendKeys("Karthick");
//		driver.findElement(By.id("password")).sendKeys("vengat16");
//		String s = driver.findElement(By.id("username")).getAttribute("value");
//		String s1 = driver.findElement(By.id("password")).getAttribute("value");
//		System.out.println(s);
//		System.out.println(s1);
		
//		* isEnabled()
//		boolean logo = driver.findElement(By.xpath("//*[@id='email']"))
//				.isEnabled();
//				if (logo == true) {
//				System.out.println("Text box is enable to print");
//				} else {
//				System.out.println("not enable");
//				}
		
//		*isSelected()
//		driver.get("https://mcqquestions.net/practice/ms-word-mcq");
//		driver.findElement(By.xpath("//*[@id='opt1_21494']")).click();
//		boolean logo = driver.findElement(By.xpath("//*[@id='opt1_21497']")).isSelected();
//			if (logo == true) {
//			System.out.println("button is selected");
//			} else {
//			System.out.println("not selected");
//			}

		}
	}
