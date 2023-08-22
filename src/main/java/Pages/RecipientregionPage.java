package Pages;

import Utils.DropdownUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecipientregionPage {
    private WebDriver driver;
    private DropdownUtils dropdown;
    private By vocab=By.xpath("//span[@class=\"select2-selection select2-selection--single\"]");
    private By vocab_option=By.xpath("//ul[@class=\"select2-results__options\"]");
    private By code=By.xpath("(//input[\"form__input code border-0\"])[4]");
    private By percentage=By.xpath("(//input[\"form__input code border-0\"])[6]");
    private By narrate=By.xpath("//textarea[@class=\"form__input border-0\"]");
    private By lang=By.xpath("(//input[@class=\"form__input code border-0\"])[1]");
   // private By lang_option=By.xpath("(//ul[@class=\"select2-results__options\"])");
    private By RR= By.xpath("(//div[text()='recipient-region'])[3]");
    public RecipientregionPage(WebDriver driver){
        this.driver=driver;
        dropdown=new DropdownUtils(driver);

    }
     public void vocabulary(){
        dropdown.findropdown(vocab);
        dropdown.selectDropdown(vocab_option);
     }

    public void setcode(String codd){
        driver.findElement(code).sendKeys(codd);
    }
    public void setpercentage(String percent){
        driver.findElement(percentage).sendKeys(percent);
    }
    public void narrative(String text){
        driver.findElement(narrate)
                .sendKeys(text);
    }
   /* public void language(){
        dropdown.findropdown(lang);
        dropdown.selectDropdown(lang_option);
    }

    */

    public String getheading(){
        return driver.findElement(RR).getText();
    }

}

