package Tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.TestBase;

public class Test1Pass extends TestBase {



//    @AfterEach
//    public void takescreenshot(){
//        ReusableMethods.takeScreenshot();
//    }



    @Test
    public void pass1() {

        Assert.assertEquals("https://www.dfdsgoogle.com/",Driver.getDriver().getCurrentUrl());
    }


    @Test
    public void pass2() {

        Assert.assertEquals("https://wwfffw.google.com/", Driver.getDriver().getCurrentUrl());
    }


    @Test
    public void pass3() {

        Assert.assertEquals("https://wfffffww.google.com/", Driver.getDriver().getCurrentUrl());
    }


    @Test
    public void pass4() {

        Assert.assertEquals("https://www.googlfffe.com/",Driver.getDriver().getCurrentUrl());
    }


}
