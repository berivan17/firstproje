import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class SearchBox extends BasePage {

    By searchBoxLocator = By.id("close");

    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        type(searchBoxLocator,text);
        click(searchBoxLocator);

    }
}
