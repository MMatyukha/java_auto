package selenium_java.Lesson_6;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BaseTest {
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = ".account")
    public WebElement AccountButton;

    @FindBy(linkText = "Books")
    private WebElement booksBtn;

    @FindBy(linkText = "Computers")
    private WebElement computersBtn;

    @FindBy(linkText = "Electronics")
    private WebElement electronicsBtn;

    @FindBy(linkText = "Apparel & Shoes")
    private WebElement apparelBtn;

    @FindBy(linkText = "Digital downloads")
    private WebElement DigitalBtn;

    @FindBy(linkText = "Jewelry")
    private WebElement JewelryBtn;

    @FindBy(linkText = "Gift Cards" )
    private WebElement GiftBtn;

    @FindBy(css = "input.button-2.product-box-add-to-cart-button" )
    private WebElement BasketBtn;

    public void clickApparelBtn() {
        this.apparelBtn.click();
    }

    @Step("КНИГИ")
    public void clickBooksBtn() {
        this.booksBtn.click();
    }

    @Step("КОМПЬЮТЕРЫ")
    public void clickComputersBtn() {
        this.computersBtn.click();
    }

    public void clickDigitalBtn() {
        DigitalBtn.click();
    }

    @Step("ЮВЕЛИРКА")
    public void clickJewelryBtn() {
        JewelryBtn.click();
    }

    @Step("ПОДАРКИ")
    public void clickGiftBtn() {
        GiftBtn.click();
    }
    @Step("КОРЗИНА")
    public void BasketBtn() {
        BasketBtn.click();
    }

}
