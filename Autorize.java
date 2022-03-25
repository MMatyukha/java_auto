import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autorize {

    WebDriver driver = new ChromeDriver();
   try {
        driver.get("http://demowebshop.tricentis.com/");
        driver.findElement(By.cssSelector(".ico-login")).click();
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("m@m.ru");
        driver.findElement(By.id("Password")).click();
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("19#10mm");
        driver.findElement(By.cssSelector(".login-button")).click();
    } (InterruptedException e) {
        e.printStackTrace();
    }finally {driver.quit ();
   }

}
