import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.xml.datatype.Duration;
import java.util.concurrent.TimeUnit;

public class logoutpage {
    private WebDriver driver;
    public logoutpage(WebDriver driver){
        this.driver=driver;
    }
    By menu=By.id("react-burger-menu-btn");
    By logout=By.id("logout_sidebar_link");
    public void openmenu(){
        driver.findElement(menu).click();
    }
    public void logoutmenu(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(logout).click();
    }
}
