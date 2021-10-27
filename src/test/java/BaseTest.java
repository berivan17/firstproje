import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BaseTest {

    WebDriver driver ;
    @BeforeAll
    public void setUp()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.lcwaikiki.com/tr-TR/TR/");
        driver.manage().window().maximize();


    }
    public void signIn() {
        WebDriver driver = new ChromeDriver();
        WebElement nameElement = driver.findElement(By.id("serverName"));
        nameElement.click();

        WebElement mailElement = driver.findElement(By.id("LoginEmail"));
        mailElement.click();
        mailElement.sendKeys("E-Posta Adresiniz");

        WebElement password = driver.findElement(By.id("password"));
        password.click();
        password.sendKeys("Şifreniz");

        WebElement girisYap = driver.findElement(By.id("loginLink"));
        girisYap.click();
    }
    @AfterAll
    public void tearDown()
    {
        driver.quit();
    }



}
