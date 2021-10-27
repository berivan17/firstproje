import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class HomePage extends BasePage{

    SearchBox searchBox;
    By cartCountLocator = By.id("spanCart");
    By cartContainerLocator = By.className("header cart");

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox(){
        return this.searchBox;
    }

    public boolean isProductCountUp(){
        return getCartCount()>0;
    }

    public void gotoCart(){
        click(cartContainerLocator);
    }

    private int getCartCount(){
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }
}
