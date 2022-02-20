package Tests;
//iskender Remote branch inde  ilk  degisiklik local iskender branch i icin 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.test.context.event.annotation.AfterTestExecution;
import org.springframework.test.context.event.annotation.BeforeTestExecution;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public ExtentReports extentReports;
    public ExtentTest extentTest;
    public ExtentHtmlReporter extentHtmlReporter;

    //protected US_01_Page us01Page;
    protected Actions actions;
    protected WebDriverWait wait;

    @BeforeEach
    public void setup() {
//        Driver.getDriver().get(ConfigReader.getProperty("demoqa_url"));
//        us01Page = new US_01_Page();
//        actions = new Actions(Driver.getDriver());
//        wait = new WebDriverWait(Driver.getDriver(),20);
//        Driver.getDriver().manage().window().maximize();
//        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @BeforeTestExecution
    public void setUpTest(){
        extentReports = new ExtentReports();// ExtentReports objesi üretelim
        String filePath = System.getProperty("user.dir") + "/reports/myprojectreport.html";// rapor için adresi belirleyelim.
        extentHtmlReporter = new ExtentHtmlReporter(filePath);//extenthtmlreporter objesi üretelim
        extentReports.attachReporter(extentHtmlReporter);//extentHtmlReporter objesini extentReports objesinin içine ekleyelim
        //Rapor ile ilgili bilgileri artık buraya ekleyebiliriz
        extentReports.setSystemInfo("Environment", "Environment İsim");
        extentReports.setSystemInfo("Browser", ConfigReader.getProperty("browser"));
        extentReports.setSystemInfo("Automation Engineer", "Kemal Ozden");
        extentHtmlReporter.config().setDocumentTitle("FHC Trip Reports");
        extentHtmlReporter.config().setReportName("FHC Trip Automation Reports");
    }
//    @AfterTestExecution
//    public void tearDownTest(){
//        extentReports.flush();
//    }
//    @AfterEach
//    public void tearDownMethod(ITestResult result) throws IOException {
//        if (result.getStatus() == ITestResult.FAILURE) {//When test case fails, then take the screenshot and attached the report
//            String screenshotLocation = ReusableMethods.getScreenshot(result.getName());//getScreenshot is coming from ReusableMethods
//            extentTest.fail(result.getName());
//            extentTest.addScreenCaptureFromPath(screenshotLocation);//adding the screenshot to the report
//            extentTest.fail(result.getThrowable());
//        } else if (result.getStatus() == ITestResult.SKIP) {
//            extentTest.skip("Test Case is skipped: " + result.getName());
//        }
//    }

    @AfterEach
    public void tearDownMethod2() throws IOException {
        ReusableMethods.getScreenshot("jenkins deneme");
    }
}
//Deneme
//deneme_local'den reset'ten sonra
