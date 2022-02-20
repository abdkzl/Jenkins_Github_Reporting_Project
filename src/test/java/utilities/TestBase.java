package utilities;
//iskender Remote branch inde  ilk  degisiklik local iskender branch i icin 

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {



    protected Actions actions;
    protected WebDriverWait wait;

    @BeforeMethod
    public void setup() {
         Driver.getDriver().get("https://www.google.com/");
        Driver.getDriver().manage().window().maximize();
        //Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


//    @BeforeTestExecution
//    public void setUpTest(){
//        extentReports = new ExtentReports();// ExtentReports objesi üretelim
//        String filePath = System.getProperty("user.dir") + "/reports/myprojectreport.html";// rapor için adresi belirleyelim.
//        extentHtmlReporter = new ExtentHtmlReporter(filePath);//extenthtmlreporter objesi üretelim
//        extentReports.attachReporter(extentHtmlReporter);//extentHtmlReporter objesini extentReports objesinin içine ekleyelim
//        //Rapor ile ilgili bilgileri artık buraya ekleyebiliriz
//        extentReports.setSystemInfo("Environment", "Environment İsim");
//        extentReports.setSystemInfo("Browser", ConfigReader.getProperty("browser"));
//        extentReports.setSystemInfo("Automation Engineer", "Kemal Ozden");
//        extentHtmlReporter.config().setDocumentTitle("FHC Trip Reports");
//        extentHtmlReporter.config().setReportName("FHC Trip Automation Reports");
//    }
//    @AfterTest
//    public void tearDownTest(){
//        extentReports.flush();
//    }
//    @AfterMethod
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

    @AfterMethod
    public void tearDownMethod2() throws IOException {
        ReusableMethods.getScreenshot("JENKINS DENEME");
    }
}
//Deneme
//deneme_local'den reset'ten sonra
