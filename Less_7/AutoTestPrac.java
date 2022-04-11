import io.qameta.allure.Allure;
import org.junit.After;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium_java.Lesson_6.MainPage;
import selenium_java.Lesson_6.MyAccountPage;

public class AutoTestPrac {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;

    @BeforeEach
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        ChromeOptions o = new ChromeOptions();
        o.addArguments("--incognito");
        driver = new ChromeDriver(o);
    }

    @Test
    public void addToBaskTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        ChromeOptions o = new ChromeOptions();
        o.addArguments("--incognito");
        driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        MyAccountPage page = new MainPage(driver)
                .clickLogInButton()
                .login("m@m.ru", "19#10mm");
         String pagetext  = page.AccountButton.getText();
        Assertions.assertEquals(pagetext, "m@m.ru");
        page.clickBooksBtn();
        page.BasketBtn();
     }

    @After
    public  void tearDown() {
        driver.quit();
    }
}


