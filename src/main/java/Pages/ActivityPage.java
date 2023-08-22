package Pages;

import Utils.JavaExecutorUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActivityPage {
    private WebDriver driver;
    private JavaExecutorUtils jsexecutor;
    private By narrative=By.xpath("(//input[@class=\"form__input\"])[1]");
    private By activityidentifier=By.xpath("(//input[@class=\"form__input\"])[2]");
    private By savebutton=By.xpath("//span[text()=\"Save\"]");
    private By title=By.xpath("(//div[.=\"title\"])[2]");
    private By activitystatus=By.xpath("//div[.=\"activity-status\"]");
    private By descriptiontab=By.xpath("//div[.=\"description\"]");
    private By activitydate=By.xpath("//div[.=\"activity-date\"]");
    private By recipeint=By.xpath("//div[.=\"recipient-region\"]");
    private By titleheading=By.xpath("(//div[text()='title'])[3]");

    public ActivityPage(WebDriver driver){

        this.driver=driver;
        jsexecutor=new JavaExecutorUtils(driver);
    }
    public void setNarrative( String narr){

        driver.findElement(narrative).sendKeys(narr);
    }
    public void setActivityidentifier(String number)
    {

        driver.findElement(activityidentifier).sendKeys(number);
    }
    public ActivityDetailPage clicksavebutton(){
        jsexecutor.scrollactivity();
        driver.findElement(savebutton).click();
        return new ActivityDetailPage(driver);

    }
    public DescriptionPage clickdescription(){
        driver.findElement(descriptiontab).click();
        return new DescriptionPage(driver);

    }
    /*
    public ActivityDatePage clickactivitydate(){
        driver.findElement(activitydate).click();
        return new ActivityDatePage(driver);
    }\
    8
     */
    public RecipientregionPage clickrecipeint(){
        driver.findElement(recipeint).click();
        return new RecipientregionPage(driver);
    }
    public String gettitle(){

        return driver.findElement(titleheading).getText();
    }

   public  boolean activityname(){
      return driver.findElement(title).isDisplayed();
    }



}
