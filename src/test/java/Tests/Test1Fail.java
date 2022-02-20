package Tests;


import junitCalismalari.SmokeRegressionTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import utilities.Driver;

public class Test1Fail extends TestBase {

    @BeforeEach
    public void url(){ Driver.getDriver().get("https://www.google.com/");}

//    @AfterEach
//    public void takescreenshot(){
//        ReusableMethods.takeScreenshot();
//    }


    @SmokeRegressionTest

    public void pass1() {

        Assertions.assertEquals("https://www.dfdsgoogle.com/",Driver.getDriver().getCurrentUrl());
    }

    @SmokeRegressionTest

    public void pass2() {

        Assertions.assertEquals("https://wwfffw.google.com/", Driver.getDriver().getCurrentUrl());
    }

    @SmokeRegressionTest

    public void pass3() {

        Assertions.assertEquals("https://wfffffww.google.com/", Driver.getDriver().getCurrentUrl());
    }

    @SmokeRegressionTest
    public void pass4() {

        Assertions.assertEquals("https://www.googlfffe.com/",Driver.getDriver().getCurrentUrl());
    }


}
