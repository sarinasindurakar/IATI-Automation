package IATI.test;

import Base.BaseTest;
import Utils.ConstantUtils;
import io.netty.util.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FooterTest extends BaseTest {
    @Test
    public void TestFooter() throws InterruptedException {

        footerPage.home();
        Thread.sleep(3000);
    }
    @Test(priority = 1)
    public void validatehome(){
        Assert.assertEquals(headerPage.gettext(), ConstantUtils.header_home);
    }
    @Test(priority=2)
    public void validateabout(){
        footerPage.About();
        Assert.assertEquals(footerPage.text(),ConstantUtils.aboutus);

    }
    @Test(priority=3)
    public void validatesignin(){
        footerPage.Signin();
        Assert.assertEquals(footerPage.getstatus(),ConstantUtils.header_signin);
    }
    @Test(priority = 4)
    public void validatejoinnow() throws InterruptedException {
        footerPage.joinin();
        Thread.sleep(3000);
        Assert.assertEquals(footerPage.getstatus(),ConstantUtils.header_joinnow);
    }

}
