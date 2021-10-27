import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProductsDetailPage extends BasePage {

    By addToCartButtonLocator = By.id("pd_add_to_cart");

    public ProductsDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToCartButtonLocator);
    }

    public void addtoCar() {
        click(addToCartButtonLocator);
    }
}
