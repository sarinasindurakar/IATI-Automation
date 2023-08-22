package Pages;

import Utils.ElementUtils;
import Utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DashBoardPage {
    private WebDriver driver;
    private WaitUtils wait;
    private Actions actions;
    private ElementUtils elementutils;

    private By profilename=By.xpath("//span[@class=\"outine text-tiny text-n-40\"]");
    private By logoutbutton=By.xpath("//button[@class=\"text-sm\"]");
    private By addactivitybutton=By.xpath("//button[@class=\"button primary-btn relative font-bold\"]");

    private By activities=By.xpath("//h4[@class=\"mr-4 text-3xl font-bold xl:text-heading-4\"]");
    private By addmanuallybutton=By.id("add-activity-manually");
    private By locator=By.xpath("//span[.=\"Add Activity\"]");
    public DashBoardPage(WebDriver driver){
        this.driver=driver;
        wait=new WaitUtils(driver);
        actions = new Actions(driver);
        elementutils=new ElementUtils(driver);

    }
    public String gettext(){
        return elementutils.gettitle(activities);
    }

    public  void clickprofiledropdown(){
        wait.presenceOfElement(locator,90);
        WebElement profiledropdown=driver.findElement(By.xpath("//button[@class=\"button secondary-btn dropdown-btn\"]"));
        actions.moveToElement(profiledropdown).build().perform();

    }


    public String getusername(){
        String text= driver.findElement(profilename).getText();
        text.equalsIgnoreCase(text);
        System.out.println(text);
        return text;
    }


  public void addactivity(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(addactivitybutton).click();
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      //  driver.findElement(addmanuallybutton).click();
    }
    public void setAddmanuallybutton(){
        driver.findElement(addmanuallybutton).click();
    }

    public void logout(){
        driver.findElement(logoutbutton).click();
    }
}
