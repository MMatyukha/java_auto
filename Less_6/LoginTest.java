package selenium_java.less_6;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class LoginTest {
    public static LoginPage loginPage;
    public static ProfilePage profilePage;

    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
        @Test
        public void loginTest() {
            loginPage.inputLogin("m@m.ru");
            loginPage.inputPasswd("19#10mm");
            String user= profilePage.getUserName();
            Assert.assertEquals(profilePage.getUserName(), user);
        }
        @AfterClass
        public static void tearDown() {
            profilePage.userLogout();
            driver.quit(); } }
}
