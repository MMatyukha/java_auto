package selenium_java.less_6;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage {

    public WebDriver driver;
    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    /**
     * определение локатора меню пользователя
     */
    @FindBy(css = ".account")
    private WebElement userMenu;
/**
 * определение локатора кнопки выхода из аккаунта
 */
    @FindBy(css = ".ico-logout")
    private WebElement logoutBtn;
/**
*    определение корзины
 */
    @FindBy(css=".cart-label")
    private WebElement basketBtn;

    /**
     *    методы
     */
    public String getUserName() {
        String userName = userMenu.getText();
        return userName; }

    public void userLogout() {
        logoutBtn.click(); } }
}

