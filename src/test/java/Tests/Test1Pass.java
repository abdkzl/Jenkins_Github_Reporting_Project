package Tests;

import junitCalismalari.SmokeRegressionTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import utilities.Driver;

public class Test1Pass extends TestBase {
    @BeforeEach
    public void url(){ Driver.getDriver().get("https://www.google.com/");}



    @SmokeRegressionTest
    public void pass1() {

        Assertions.assertEquals("https://www.google.com/", Driver.getDriver().getCurrentUrl());
    }

    @SmokeRegressionTest
    public void pass2() {

        Assertions.assertEquals("https://www.gooqqgle.com/",Driver.getDriver().getCurrentUrl());
    }

    @SmokeRegressionTest
    public void pass3() {

        Assertions.assertEquals("https://www.google.com/",Driver.getDriver().getCurrentUrl());
    }

    @SmokeRegressionTest
    public void pass4() {

        Assertions.assertEquals("https://www.goodgle.com/",Driver.getDriver().getCurrentUrl());
    }


}
