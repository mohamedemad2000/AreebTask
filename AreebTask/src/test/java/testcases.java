import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class testcases {
    WebDriver driver;
    loginpage login;
    productspage products;
    cartpage cart;
    checkoutinfopage checkoutinfo;
    checkoutoverview checkoutoverview;
    logoutpage logout;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }
    @Test(priority = 0)
    public void howtologin()throws InterruptedException{
        login=new loginpage(driver);
        login.sendusername();
        login.sendpass();
        login.contclick2();
    }
    @Test(priority = 1)
    public void addproduct()throws InterruptedException{
        products=new productspage(driver);
        products.ClickOnProducts();
    }
    @Test(priority = 2)
    public void gotocheckout()throws InterruptedException{
        cart=new cartpage(driver);
        cart.pressoncheckout();
    }
    @Test(priority = 3)
    public void fillcheckout()throws InterruptedException{
        checkoutinfo=new checkoutinfopage(driver);
        checkoutinfo.fillup();
    }
    @Test(priority = 4)
    public void finishorder()throws InterruptedException{
        checkoutoverview=new checkoutoverview(driver);
        checkoutoverview.clickfinish();
        checkoutoverview.backtohome();
    }
    @Test(priority = 5)
    public void logoutfromaccount()throws InterruptedException{
        logout=new logoutpage(driver);
        logout.openmenu();
        logout.logoutmenu();
    }
    @AfterClass
    public void exit(){
        driver.quit();
    }
}
