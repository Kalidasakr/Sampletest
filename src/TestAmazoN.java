import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestAmazoN {
	
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","F:\\Datas\\Kalidas Selenium\\ChromeDriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"nav-link-yourAccount\"]")).click();
		
		driver.findElement(By.name("email")).sendKeys("+917904020482");
		driver.findElement(By.className("a-button-input")).click();
		driver.findElement(By.name("password")).sendKeys("kalidas@22");
		driver.findElement(By.className("a-button-input")).click();
		driver.findElement(By.name("field-keywords")).sendKeys("iphone");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		
		
		
		String Parent=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/51R4ZvEJUPL._AC_UL436_.jpg']")).click();

		Set<String> allWindows=driver.getWindowHandles();
		int count=allWindows.size();
		
		for(String child:allWindows)
		{
			if(!Parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
			}
		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"address-book-entry-0\"]/div[2]/span/a")).click();
		
		driver.navigate().back();
		driver.navigate().back();
		
		Thread.sleep(3000);
		WebElement ele= driver.findElement(By.xpath("//*[@id=\"nav-link-yourAccount\"]/span[2]/span"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(ele).moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-tools\"]/a[2]"))).click();
		
		
		
		
		
		
		
}
}