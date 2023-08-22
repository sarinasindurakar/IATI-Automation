package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaExecutorUtils {
    private WebDriver driver;
    private By register=By.xpath("(//label[@class=\"label\"])[1]");

    private By scrollelement=By.xpath("(//input[@class=\"form__input\"])[4]");
    private By signupscroll=By.xpath("//span[@class=\"text-sm font-bold text-bluecoral\"]");
    private By pubscroll=By.xpath("//span[@class=\"text-xl font-bold text-n-50 sm:text-2xl\"]");
    private By activity=By.xpath("(//p[@class=\"form-group-title\"])[2]");
    private  By IatiStandard=By.xpath("//span[@class=\"font-bold text-n-10\"]");
    private By desc_lang=By.xpath("(//div[@class=\"form-field-label items-center\"])[3]");
    public JavaExecutorUtils(WebDriver driver){
        this.driver=driver;

    }

    public  void scroll(By locator){
       // WebElement tableElement= driver.findElement(scrollelement);
        //using visibility of element in webpage
        String Script="arguments[0].scrollIntoView()";
        ((JavascriptExecutor)driver).executeScript(Script,locator);

    }

    public void scrollSignup(){
        WebElement sign=driver.findElement(signupscroll);
        String Script="arguments[0].scrollIntoView()";
        ((JavascriptExecutor)driver).executeScript(Script,sign);

    }
    public void scrollsign(){
        WebElement registers=driver.findElement(register);
        String Script="arguments[0].scrollIntoView()";
        ((JavascriptExecutor)driver).executeScript(Script,registers);

    }
    public void scrolladmin(){
        WebElement pub=driver.findElement(pubscroll);
        String Script="arguments[0].scrollIntoView()";
        ((JavascriptExecutor)driver).executeScript(Script,pub);
    }
    public void scrollactivity(){
        WebElement ac=driver.findElement(activity);
        String Script="arguments[0].scrollIntoView()";
        ((JavascriptExecutor)driver).executeScript(Script,ac);

    }
    public void scrolliatistandard(){
        WebElement IS=driver.findElement(IatiStandard);
        String Script="arguments[0].scrollIntoView()";
        ((JavascriptExecutor)driver).executeScript(Script,IS);
    }
    public void scrolldescription(){
        WebElement dd=driver.findElement(desc_lang);
        String Script="arguments[0].scrollIntoView()";
        ((JavascriptExecutor)driver).executeScript(Script,dd);
    }
}
