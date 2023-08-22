
package Base;

import DriverFactory.DriverFactory;
import Pages.*;
import Utils.JavaExecutorUtils;
import Utils.WaitUtils;
import com.github.javafaker.Faker;
import jdk.jfr.Description;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    private WebDriver driver;
    public LoginPage loginPage;

    public DashBoardPage dashboard;
    public ActivityDetailPage activitydetailpage;
    public DescriptionPage descriptionPage;
    public WaitUtils waitUtils;
    public HeaderPage headerPage;
    public FooterPage footerPage;

    public Faker fakedata;
    public DriverFactory driverFactory;
    public Properties properties;

    public JavaExecutorUtils jsexecutor;
    public RecipientregionPage recipientregionPage;
   public ActivityPage activitypage;


   public SoftAssert softAssert;
    @BeforeTest
    public void setUp(){

        driverFactory = new DriverFactory();

        properties=driverFactory.initProperties();
       // System.out.println(properties);
       //String bb= properties.getProperty("browser");
       // System.out.println(bb);
        driver = driverFactory.initDriver(properties);
/*
       System.setProperty("webdriver.chrome.driver", "F:\\Internship-2022\\Automation\\chromedriver.exe");
       driver = new ChromeDriver();
       driver.get("https://iatipublisher-dev.yipl.com.np/");
*/
        driver.manage().window().maximize();

       loginPage = new LoginPage(driver);

        softAssert = new SoftAssert();
       dashboard=new DashBoardPage(driver);
       activitypage=new ActivityPage(driver);
        activitydetailpage=new ActivityDetailPage(driver);
        descriptionPage=new DescriptionPage(driver);
        jsexecutor=new JavaExecutorUtils(driver);
        headerPage=new HeaderPage(driver);
        footerPage=new FooterPage(driver);
        recipientregionPage=new RecipientregionPage(driver);

       waitUtils=new WaitUtils(driver);
        fakedata=new Faker();

    }
    @BeforeMethod
    public void record() throws IOException {
        TakesScreenshot ts=(TakesScreenshot)driver;
        File src=ts.getScreenshotAs(OutputType.FILE);
        File target=new File("src/screenshots/test2.png");
        FileUtils.copyFile(src,target);

    }

    @AfterClass
    public void tearDown(){

        driver.quit();
    }


}

