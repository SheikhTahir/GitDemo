import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.ls.LSOutput;

public class demo1 {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
//		driver.manage().window().minimize();

		String title = driver.getTitle();
		System.out.println("Title : "+title);
		
		String url = driver.getCurrentUrl();
		System.out.println("URL : "+url);
		Thread.sleep(2000);
		
//		String pg = driver.getPageSource();
//		System.out.println("PS :"+ pg);
		
		Dimension d = new Dimension(500, 500);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		//To set the position of the window
		Point p = new Point(250, 250);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(1000);
		//To navigate to previous page
		driver.navigate().back();
		Thread.sleep(1000);
		//To navigate to next page
		driver.navigate().forward();
		Thread.sleep(1000);
		//Refresh current web page
		driver.navigate().refresh();
		driver.getPageSource();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
	}
}
