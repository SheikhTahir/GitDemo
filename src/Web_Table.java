import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
//		******     To print particular values(data) in the table:     *****
//					---------------------------------------------					
//		String s = driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr[2]/td[2]")).getText();
//		System.out.println(s);
		
//		*****     To print all data’s in the table:     *****
//				  ---------------------------------
//		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
//		for(WebElement rows:tRows)
//		{
//			List<WebElement> tData = driver.findElements(By.tagName("td"));
//			for(WebElement data:tData)
//			{
//			System.out.println(data.getText()); 
//			}
//		}
		
//		*****     To print all data’s in the table using normal loops:     *****
//		  		------------------------------------------------------
		
//		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
//		for(int i=0;i<tRows.size();i++)
//		{
//			List<WebElement> tData = driver.findElements(By.tagName("td"));
//			for(int j=0;j<tData.size();j++)
//			{
//				System.out.println(tData.get(j).getText()); 
//			}
//		}
		
//		*****     To print particular data only:     *****
//				  ------------------------------
		
//		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
//		for(int i=0;i<tRows.size();i++){
//		List<WebElement> tData = driver.findElements(By.tagName("td"));
//			for(int j=0;j<tData.size();j++)
//			{
//				if(tData.get(j).getText().equals("Afghanistan"))
//				{
//				System.out.println(tData.get(j).getText()); 
//				}
//			}
//		}
		
//		*****     To print relevant data(Dynamic Table):     *****
//		  		  --------------------------------------
		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
		for(int i=0;i<tRows.size();i++){
			List<WebElement> tData = driver.findElements(By.tagName("td"));
			for(int j=0;j<tData.size();j++)
			{
				if(tData.get(j).getText().equals("Afghanistan"))
				{
				driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr["+i+"]/td[2]"));
				System.out.println(tData.get(j).getText()); 
				}
			}
		}

	}
}
