import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_Add_Product_To_Cart extends BaseTest {

    HomePage homePage ;
    ProductsPage productsPage ;
    ProductsDetailPage productDetailPage ;
    CartPage cartPage ;

    @Test
    @Order(1)
    public void search_a_product(){
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        homePage.searchBox().search("Pantolon");
        Assertions.assertTrue(productsPage.isOnProductPage(),"Not on products page!");

    }
    @Test
    @Order(2)
    public void select_a_product(){
        productDetailPage = new ProductsDetailPage(driver);
        productsPage.selectProduct(1);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),"Not on product detail page!");

    }
    @Test
    @Order(3)
    public void add_product_to_cart(){
        productDetailPage.addtoCar();
        Assertions.assertTrue(homePage.isProductCountUp(),"Product count did not increase!");

    }

    @Test
    @Order(4)
    public void go_to_cart(){
        cartPage = new CartPage(driver);
        homePage.gotoCart();
        Assertions.assertTrue(cartPage.checkIfProductionAdded(),"Product was not added to cart!");

    }
}
