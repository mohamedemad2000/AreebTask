import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
    private WebDriver driver;
    public loginpage(WebDriver driver){
        this.driver=driver;
    }
    By username = By.xpath("//input[@id='user-name']");
    By password = By.xpath("//input[@name='password']");
    By submitbutton=By.id("login-button");

    public void sendusername(){
        driver.findElement(username).sendKeys("standard_user");
    }
    public void sendpass(){
        driver.findElement(password).sendKeys("secret_sauce");
    }
    public void contclick2(){
        driver.findElement(submitbutton).click();
    }
}
