package IATI.test;

import Base.BaseTest;
import Utils.ConstantUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RecipientTest extends BaseTest {
    @Test
    public void testRecipientRegion() throws InterruptedException {
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
        recipientregionPage=activitypage.clickrecipeint();
        Thread.sleep(3000);
        recipientregionPage.vocabulary();
        recipientregionPage.setcode("abjsd");
        recipientregionPage.setpercentage("10");
        recipientregionPage.narrative(fakedata.chuckNorris().fact());
       // recipientregionPage.language();
        descriptionPage.clicksave();

    }
    @Test(priority = 1)
    public void validateRecipienttitle(){

        assertEquals (recipientregionPage.getheading(),ConstantUtils.recipeintregion);
    }

}
