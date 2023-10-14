import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutinfopage {
   private WebDriver driver;
   public checkoutinfopage(WebDriver driver){
       this.driver=driver;
   }
   By fname=By.id("first-name");
   By lname=By.id("last-name");
   By postalcode=By.id("postal-code");
   By contbutton=By.id("continue");
   public void fillup(){
       driver.findElement(fname).sendKeys("mohamed");
       driver.findElement(lname).sendKeys("emad");
       driver.findElement(postalcode).sendKeys("11865");
       driver.findElement(contbutton).click();
   }
}
