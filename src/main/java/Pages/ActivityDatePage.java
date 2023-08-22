package Pages;

import Utils.DropdownUtils;
import Utils.JavaExecutorUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActivityDatePage {
    private WebDriver driver;
    String months="January 2023";
    private DropdownUtils dropdown;
    private By type=By.xpath("//input[@class=\"select2-search__field\"]");
    private By type_option=By.id("select2-activity_date0type-results");
    private By date=By.id("activity_date[0][date]");
    public ActivityDatePage(WebDriver driver){
        this.driver=driver;
        dropdown=new DropdownUtils(driver);
    }
    public void type(){
        dropdown.findropdown(type);

        dropdown.selectDropdown(type_option);
    }
    public void date(){
        driver.findElement(date).click();
        while(true) {

            String month = driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[8]/div[1]/table/thead/tr[1]/th[2]")).getText();
            System.out.println(month);
            if (month.equals(months)) {
                break;
            }
            else {
                driver.findElement(By.xpath("//i[@class=\"icon mdi mdi-long-arrow-right\"]")).click();
            }
        }
        driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[8]/div[1]/table/tbody/tr/td[contains(text(),\"16\")]")).click();

        //String month=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[8]/div[1]/table/thead/tr[1]/th[2]")).getText();
    }



}



