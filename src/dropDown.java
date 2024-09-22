import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
		
public class dropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//		* To print all the options:
		driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
//		WebElement w = driver.findElement(By.name("coffee"));
//		Select s =  new Select(w);
//		List<WebElement> o = s.getOptions();
//		for (WebElement x:o) 
//		{
//		System.out.println(x.getAttribute("value"));
//		}
		
//		* To print all text
//		WebElement w = driver.findElement(By.name("coffee"));
//		Select s =  new Select(w);
//		List<WebElement> o = s.getOptions();
//		for (WebElement x:o) 
//		{
//		System.out.println(x.getText());
//		}

//		* Using normal for loop:
//		WebElement w = driver.findElement(By.name("coffee"));
//		Select s=new Select(w);
//		List<WebElement> o = s.getOptions();
//		for (int i=0;i<=o.size();i++) {
//		System.out.println(o.get(i).getAttribute("value"));
//		}

//		1.selectByIndex:
//		WebElement w = driver.findElement(By.name("coffee"));
//		Select s=new Select(w);
//		s.selectByIndex(3);
		
//		2.selectByValue:
//		WebElement w = driver.findElement(By.name("coffee"));
//		Select s=new Select(w);
//		s.selectByValue("regular");
		
//		3.selectByVisibleText:
//		WebElement w = driver.findElement(By.name("coffee"));
//		Select s=new Select(w);
//		s.selectByVisibleText("With cream & sugar");
			
//		* getAllSelectedOptions()
//		WebElement w = driver.findElement(By.name("coffee"));
//		Select s=new Select(w);
//		List<WebElement> web = s.getAllSelectedOptions();
//		for(WebElement x:web){
//		System.out.println(x.getText());
//		}
		
//		* isMultiple()
//		--------------
		
//		WebElement w = driver.findElement(By.name("coffee2"));
//		Select s=new Select(w);
//		boolean b = s.isMultiple();
//		System.out.println(b);
		
//		1.selectByIndex:
//		WebElement w = driver.findElement(By.name("coffee2"));
//		Select s=new Select(w);
//		List<WebElement> web = s.getOptions();
//		for(int i=0;i<web.size();i++)
//		{
//			s.selectByIndex(i);
//		}
		
//		2.selectByValue:
//		WebElement w = driver.findElement(By.name("coffee2"));
//		Select s=new Select(w);
//		List<WebElement> web = s.getOptions();
//		s.selectByValue("skim");
//		s.selectByValue("whipped");
		
//		**** DESELECT ****
//		------------------
		
//		1. deselect by index

//		WebElement w = driver.findElement(By.name("coffee2"));
//		Select s=new Select(w);
//		List<WebElement> web = s.getOptions();
//		for(int i=0;i<web.size();i++)
//		{
//			s.selectByIndex(i);
//			Thread.sleep(2000);
//			s.deselectByIndex(i);
//		}

//		2. deselect by value & deselectAll
		
//		WebElement w = driver.findElement(By.name("coffee2"));
//		Select s=new Select(w);
//		List<WebElement> web = s.getOptions();
//		s.selectByValue("skim");
//		s.selectByValue("whipped");
//		Thread.sleep(3000);
//		s.deselectByValue("skim");
//		s.deselectByValue("whipped");
//		s.deselectAll();
		
	}

}
