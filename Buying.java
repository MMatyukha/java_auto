package selenium_java;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import  org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Buying {
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        driver.findElement(By.cssSelector(".ico-login")).click();
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("m@m.ru");
        driver.findElement(By.id("Password")).click();
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("19#10mm");
        driver.findElement(By.cssSelector(".login-button")).click();
        driver.findElement(By.linkText("Books")).click();
        driver.findElement(By.xpath("//div[3]/div/div[2]/div[3]/div[2]/input")).click();
        driver.findElement(By.linkText("Computers")).click();
        driver.findElement(By.xpath("(//a[@title=\"Show products in category Notebooks\"]")).click();
        driver.findElement(By.xpath("//span[contains(.,'Shopping cart')]\", \"xpath:innerText\"")).click();
        driver.quit()
    }

}
