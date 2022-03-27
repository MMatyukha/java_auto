import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autorize {
    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://demowebshop.tricentis.com/");
    driver.findElement(By.cssSelector(".ico-login")).click();
    driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("m@m.ru");
    driver.findElement(By.id("Password")).click();
    driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("19#10mm");
    driver.findElement(By.cssSelector(".login-button")).click();
    
  
   }

}
