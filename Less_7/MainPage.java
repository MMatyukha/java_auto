package selenium_java.Lesson_6;


import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BaseTest {
    @FindBy(css = ".ico-login")
    public WebElement logInButton;

    @Step ("ЖМЯКАЕМ НА АВТОРИЗАЦИЮ")
    public LoginPage clickLogInButton() {
        logInButton.click();
        return new LoginPage(driver);
    }

    public MainPage(WebDriver driver) {
        super(driver);
    }
}
