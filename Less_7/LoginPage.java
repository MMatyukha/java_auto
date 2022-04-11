package selenium_java.Lesson_6;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseTest {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //описали поля
    @FindBy(xpath = "//input[@id='Email']")
    public WebElement emailField;

    @FindBy(id = "Password")
    public WebElement PasswordField;

    @FindBy(css = ".login-button")
    public WebElement LoginButton;


    @Step("ЛОГИН")
    //    Рисуем  сам   метод
    public MyAccountPage login(String email, String password) {
        emailField.sendKeys(email);
        PasswordField.sendKeys(password);
        LoginButton.click();
        return new MyAccountPage(driver);
    }

}