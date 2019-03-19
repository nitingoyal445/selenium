import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonExample {
	
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.in"); 
  driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("soap");
        driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[contains(text(),'Dettol Original Soap, 125g (Pack Of 6)')]")).click();//Park Avenue
        Set<String> ids = driver.getWindowHandles(); 
  Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        driver.findElement(By.id("add-to-cart-button")).click();
    } 

}
