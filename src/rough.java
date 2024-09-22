import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rough {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.adactin.com/HotelApp/index.php");
//		driver.findElement(By.id("username")).sendKeys("vengat16");
//		driver.findElement(By.id("password")).sendKeys("Karthick");
//		String s = driver.getCurrentUrl();
//		if (s.equals("https://adactinhotelapp.com/")) {
//		System.out.println("u r in adactin website");
//		} else {
//		System.out.println("u r not in adactin website");
		
////		* LOGO AVAILABLE OR NOT
//		driver.get("https://www.google.co.in/");
//		boolean logo = driver.findElement(By.xpath("html/body/div/div/div/img")).isDisplayed();
//		if (logo == true) {
//		System.out.println("logo is available");
//		} else {
//		System.out.println("logo is not available");
		
//		driver.get("https://www.google.co.in/");
//		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
//		String s = driver.getTitle();
//		if (s.equals("Gmail")) {
//		System.out.println("Gmail ACC");
//		} else {
//		System.out.println("Invalid");
		
////		* sendKeys() KEYBOARD CONTROLS
//		driver.get("https://adactin.com/HotelApp/index.php");
//		driver.manage().window().maximize();
//		WebElement x = driver.findElement(By.id("username"));
//		x.sendKeys("vengatram");
//		WebElement x1 = driver.findElement(By.name("password"));
//		x.sendKeys(Keys.CONTROL,"ac");
//		x1.sendKeys(Keys.CONTROL,"v");
		
////		* getSize() AND getLocation()
//		driver.get("https://www.facebook.com/");
//		WebElement un = driver.findElement(By.xpath("//*[@id=\'email\']"));
//		//To get the size of an element; height & width
//		Dimension s = un.getSize();
//		int h = s.getHeight();
//		int w = s.getWidth();
//		System.out.println("Height: "+h);
//		System.out.println("Width: "+w);
//		//To get location of an element; x-axis & y-axis
//		Point l = un.getLocation();
//		int x = l.getX();
//		int y = l.getY();
//		System.out.println("x-axis: "+x);
//		System.out.println("y-axis: "+y);
//		Thread.sleep(1000);
//		driver.close();
		
////		* getCssValue()
		driver.get("https://adactin.com/HotelApp/index.php");
		driver.manage().window().maximize();
		WebElement x = 
		driver.findElement(By.xpath("//td[@class='build_title']"));
		String x1 = x.getCssValue("font-size");
		System.out.println(x1);
		String x2 = x.getCssValue("color");
		System.out.println(x2);
		String x3 = x.getCssValue("font-weight");
		System.out.println(x3);
		String x4 = x.getCssValue("font-family");
		System.out.println(x4);
		String x5 = x.getCssValue("background");
		System.out.println(x5);
		


		
	}
}

