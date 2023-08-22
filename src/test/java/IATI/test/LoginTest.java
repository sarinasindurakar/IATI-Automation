package IATI.test;

import Base.BaseTest;
import Pages.DashBoardPage;
import Pages.LoginPage;
import Utils.ConstantUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.apache.commons.lang3.StringUtils.equalsIgnoreCase;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {


/*
 @Test
    public void testSucessfulLogin() throws InterruptedException {
    //objects and methods
    loginPage.navigatetologinpage();
       loginPage.setUsername("testing");
        loginPage.setPassword("12345678");
        loginPage.clickloginbutton();
        Thread.sleep(3000);
        softAssert.assertEquals(dashboard.gettext(),"Your Activities");
    }

 */

    @Test
    public void invalidpassword() throws InterruptedException {
        loginPage.navigatetologinpage();
        Thread.sleep(3000) ;
        loginPage.setUsername("testing");
        loginPage.setPassword("1234567");
        loginPage.clickloginbutton();
        Thread.sleep(3000);
        softAssert.assertEquals(loginPage.getErrorMessage(),"These credentials do not match our records.");

    }
    @Test
    public void invalidemail() throws InterruptedException {
        loginPage.navigatetologinpage();
        Thread.sleep(3000) ;
        loginPage.setUsername("asasasas");
        loginPage.setPassword("12345678");
        loginPage.clickloginbutton();
        Thread.sleep(3000);
        softAssert.assertEquals(loginPage.getErrorMessage(),"These credentials do not match our records.");

    }
@Test
    public void empty() throws InterruptedException {
        loginPage.navigatetologinpage();
        Thread.sleep(3000) ;
        //loginPage.setUsername("test");
        //loginPage.setPassword("12345678");
        loginPage.clickloginbutton();
    Thread.sleep(3000);
        softAssert.assertEquals(loginPage.getErrorMessage(),"The username field is required");

    }

    @Test
    public void testSucessfulLogin() throws InterruptedException {
        //objects and methods
        loginPage.navigatetologinpage();
        loginPage.setUsername("testing");
        loginPage.setPassword("12345678");
        loginPage.clickloginbutton();
        Thread.sleep(3000);
        softAssert.assertEquals(dashboard.gettext(),"Your Activities");
    }




}
