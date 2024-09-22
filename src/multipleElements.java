import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		//	* COUNT NUMBER OF LINKS AVAILABLE IN GOOGLE
//	driver.get("https://www.google.com/");
//	driver.manage().window().maximize();
//	List<WebElement> x = driver.findElements(By.tagName("a"));
//	// To find the count of the link
//	System.out.println(x.size());
//	// To print all links
//	for (WebElement x1 : x) {
//	System.out.println(x1.getAttribute("href"));
//	}
		
//		//	* SINGLE CHECKBOX
//	driver.get("https://mcqquestions.net/practice/ms-word-mcq");
//	driver.findElement(By.xpath("//*[@id='opt1_21494']")).click();
//	boolean logo = driver.findElement(By.xpath("//*[@id='opt1_21494']")).isSelected();
//	if(logo==true) {
//		System.out.println("check box is selected");
//	}
//	else
//	{
//		System.out.println("is not selected");
//	}
		
		//		* SELECT MORE THAN ONE CHECKBOX
//		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
//		List<WebElement> w = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		for(WebElement x:w){
//		x.click();
//		Thread.sleep(500);
//		}
		
//		//		* SELECT ALL CHECKBOX USING NORMAL FOR LOOP
//		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
//		List<WebElement> w = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		for(int i=0;i<w.size();i++){
//				w.get(i).click();
//			}
		
//		//		* SELECT CUSTOM CHECKBOX
//		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
//		List<WebElement> w = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		for(WebElement x:w){
//			if(x.getAttribute("value").equals("red")||x.getAttribute("value").equals("blue")||x.getAttribute("value").equals("purple")){
//		x.click();
//		Thread.sleep(500);
//			}
//		}
		
//		//		* SELECT CUSTOM CHECKBOX USING NORMAL FOR LOOP
//		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
//		List<WebElement> w = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		for(int i=0;i<w.size();i++){
//			if(w.get(i).getAttribute("value").equals("red")||w.get(i).getAttribute("value").equals("blue")||w.get(i).getAttribute("value").equals("purple")){
//		w.get(i).click();
//		Thread.sleep(500);
//			}
//			if(w.get(i).isSelected()) {
//				System.out.println(w.get(i).getAttribute("value"));
//			}
//		}
		
//		//		* SELECT CUSTOM CHECKBOX USING NORMAL FOR LOOP
//		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
//		List<WebElement> w = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		for(int i=0;i<w.size();i++){
//			if(w.get(i).getAttribute("value").equals("red")||w.get(i).getAttribute("value").equals("blue")||w.get(i).getAttribute("value").equals("purple")){
//		w.get(i).click();
//		Thread.sleep(500);
//			}

//		//		*	TO PRINT THE UNSELECTED CHECKBOXES
//			if(!w.get(i).isSelected()) {
//				System.out.println(w.get(i).getAttribute("value"));
//			}

//			*	TO SELECT THE UNSELECTED CHECKBOXES
//			if(!w.get(i).isSelected()) {
//				w.get(i).click();
//			}
//		}
//		

//		//		*	WAS for the following scenario.
//		 Navigate to google
//		 Search for selenium
//		 Count and print all the auto-suggestions
//		 Click on last suggestion
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		// To get address of all the suggestions
		String xp = "//span[contains(text(),'selenium')]";
		List<WebElement> allSuggestions = driver.findElements(By.xpath(xp));
		// To count number of suggetions
		int count = allSuggestions.size();
		System.out.println(count);
		// To print all the suggestions
		for (int i = 0; i < count; i++) {
		WebElement suggestion = allSuggestions.get(i);
		String text = suggestion.getText();
		System.out.println(text);
		}
		// To click on last suggestion
		allSuggestions.get(count - 1).click();


	}	
}

