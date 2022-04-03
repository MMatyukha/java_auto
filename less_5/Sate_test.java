import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.*;
import java.time.Duration;

public class Sate_test {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Action actions;
    private  final  static String SATE_URL ="http://demowebshop.tricentis.com/";

    @BeforeAll
    static void registerDriver() {
       WebDriverManager.chromedriver().setup();

    }

    @BeforeEach
    void  setDriver(){
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions= (Action) new Actions(driver);
        driver.get(SATE_URL);
    }

    @Test
    void Bying(){
        driver.get(SATE_URL);
        driver.findElement(By.cssSelector(".ico-login")).click();
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("m@m.ru");
        driver.findElement(By.id("Password")).click();
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("19#10mm");
        driver.findElement(By.cssSelector(".login-button")).click();
		    Assertions.assertEquals(driver.findElement(By.cssSelector(".account")).getText(),"m@m.ru");
        driver.findElement(By.linkText("Books")).click();       
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("input.button-2.product-box-add-to-cart-button")))).click();
        driver.findElement(By.linkText("Computers")).click();
        driver.findElement(By.linkText("Notebooks")).click();
        driver.findElement(By.cssSelector("span.cart-label")).click();
		    Assertions.assertEquals(driver.findElement(By.cssSelector(".page-title")).getText(),"Shopping cart");
    }

    @AfterEach
    void tearDown() {

        driver.quit();
    }

}
