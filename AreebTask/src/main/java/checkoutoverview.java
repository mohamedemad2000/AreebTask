import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutoverview {
    private WebDriver driver;
    public checkoutoverview(WebDriver driver){
        this.driver=driver;
    }
    By finish=By.id("finish");
    By backhome=By.id("back-to-products");
    public void clickfinish(){
        driver.findElement(finish).click();
    }
    public void backtohome(){
        driver.findElement(backhome).click();
    }
}
