package Utils;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;

public class ConstantUtils {
    private WebDriver driver;

  private static Faker fakerdata;


    public ConstantUtils(WebDriver driver) {

        this.driver = driver;
        fakerdata=new Faker();
    }
    public static final String username="AIDSPAN";
    public static final String activityname=fakerdata.chuckNorris().fact();
    public static final String activityidentifier= fakerdata.address().buildingNumber();
    public static final  String activitystatusheading="activity-status";
    public static final  String dashboardheading="Your Activities";
    public static final String descriptiontitle="description";
    public static final String publishing ="PUBLISHING CHECKLIST";
    public static final String aboutus="ABOUT";
    public static final String support="SUPPORT";
    public static final String Iatistandard="IATI STANDARD";
    public static final String header_home="IATI PUBLISHER";
    public static final String header_signin="Sign In.";
    public static final String header_joinnow="Join Now.";
    public static final String activitytitle ="title";
  public static final String recipeintregion="recipient-region";


}
