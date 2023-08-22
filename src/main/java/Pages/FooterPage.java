package Pages;

import Utils.ActionUtils;
import Utils.ElementUtils;
import Utils.JavaExecutorUtils;
import Utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FooterPage {
    private WebDriver driver;
    private ActionUtils actionutils;
    private Actions action;
    private WaitUtils wait;
    private ElementUtils elementutils;
    private JavaExecutorUtils jsexecutor;
    private By home= By.xpath("//a[.=\"Home\"]");
    private  By IatiStandard=By.xpath("//span[@class=\"font-bold text-n-10\"]");
    private By head=By.xpath("//h1[@class=\"text-xl font-bold text-white sm:text-4xl sm:text-heading-2\"]");
    private By about=By.xpath("//a[.=\"About\"]");
    private By heading=By.xpath("//h1[contains(@class,\"text-xl font-bold\")]");
    private By signin=By.xpath("//a[.=\"Sign In\"]");
    private By joinin=By.xpath("//a[.=\"Join Now\"]");
    private By header_form=By.xpath("//h2[@class=\"mb-2 hidden sm:block\"]");

    public FooterPage(WebDriver driver){
        this.driver=driver;
        actionutils=new ActionUtils(driver);
        wait=new WaitUtils(driver);
        elementutils=new ElementUtils(driver);
        jsexecutor=new JavaExecutorUtils(driver);
    }
    public void home(){
        jsexecutor.scrolliatistandard();
        actionutils.movingtoelement(home);
        wait.presenceOfElement(head,500);

    }
    public void About(){
        jsexecutor.scrolliatistandard();
        actionutils.movingtoelement(about);
    }
    public void Signin(){
        jsexecutor.scrolliatistandard();
        actionutils.movingtoelement(signin);
    }
    public void joinin(){
        jsexecutor.scrolliatistandard();
        actionutils.movingtoelement(joinin);
    }

    public String text(){
        wait.presenceOfElement(head,500);
       WebElement ss= driver.findElement(heading);
       String pp=ss.getText();
       System.out.println(pp);
       return pp;
    }
    public String getstatus(){
        return elementutils.gettitle(header_form);
    }


}
