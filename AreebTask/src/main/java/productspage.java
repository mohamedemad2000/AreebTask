import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productspage {
    private WebDriver driver;
    public productspage(WebDriver driver){
        this.driver=driver;
    }
    By addtocart1=By.id("add-to-cart-sauce-labs-backpack");
    By addtocart2=By.id("add-to-cart-sauce-labs-bike-light");
    By cartbutton=By.className("shopping_cart_link");

    public void ClickOnProducts(){
        driver.findElement(addtocart1).click();
        driver.findElement(addtocart2).click();
        driver.findElement(cartbutton).click();
    }

}
