package IATI.test;

import Base.BaseTest;
import Utils.ConstantUtils;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DescriptionTest  extends BaseTest {
    @Test
    public void descriptiontest() throws InterruptedException {
        loginPage.setUsername("testing");
        loginPage.setPassword("12345678");
        loginPage.clickloginbutton();
        dashboard.addactivity();
        dashboard.setAddmanuallybutton();
       // Thread.sleep(3000);
        activitypage.setNarrative(fakedata.book().title());
        //Thread.sleep(3000);
        activitypage.setActivityidentifier(fakedata.address().buildingNumber());
        activitydetailpage = activitypage.clicksavebutton();
        Thread.sleep(3000);
        descriptionPage=activitypage.clickdescription();
        Thread.sleep(5000);
        descriptionPage.type();
        Thread.sleep(3000);
        descriptionPage.setnarrative(fakedata.chuckNorris().fact());
        Thread.sleep(5000);
        //jsexecutor.scroll(locator);
        descriptionPage.setlanguage();
        descriptionPage.clicksave();


    }
    @Test(priority = 1)
    public void validatedescriptiontitle(){
        descriptionPage.clickdescription();
       assertEquals (descriptionPage.getdescriptiontitle(),ConstantUtils.descriptiontitle);
    }


}
