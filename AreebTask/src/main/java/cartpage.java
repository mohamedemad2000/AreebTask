import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cartpage {
    private WebDriver driver;
    public cartpage(WebDriver driver){
        this.driver=driver;
    }
    By checkout=By.id("checkout");
    public void pressoncheckout(){
        driver.findElement(checkout).click();
    }
}
