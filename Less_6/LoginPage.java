package selenium_java.less_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver =driver;
    }
//    где же   где же  вводить  email
//описали поля
    @FindBy(xpath ="//input[@id='Email']")
    public WebElement emailField;

    @FindBy(id="Password")
    public WebElement PasswordField;

    @FindBy(css = ".login-button")
    public WebElement LoginButton;

    public void inputLogin(String login) {
        emailField.sendKeys(login); }
    /**
     * метод для ввода пароля
     */
    public void inputPasswd(String passwd) {
        PasswordField.sendKeys(passwd); }
    /**
     * метод для осуществления нажатия кнопки входа в аккаунт
     */
    public void clickLoginBtn() {
        LoginButton.click(); } }
}
