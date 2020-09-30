import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestCase9 extends Reports {
    ExtentReports reports;
    ExtentSparkReporter extentSparkReporter;
    ExtentTest extentTest;
    @Test(dataProvider = "OffersPositivesearch",dataProviderClass = OfferspositiveDataproviders.class)
    public void SearchOfferPositiveScenario(String searchoffer) throws InterruptedException, IOException {
        Logutil.info("TestCase9 Started");
        String path=System.getProperty("user.dir");
        reports=new ExtentReports();
        extentSparkReporter=new ExtentSparkReporter(path+"\\report\\009.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest=reports.createTest("SearchOfferPositiveScenario");
        WebDriver driver = Driver.openBrowser("ie", "https://in.bookmyshow.com/mumbai");
        Thread.sleep(20000);
        OfferPositiveScenario offerPositiveScenario=new OfferPositiveScenario(driver);
        Logutil.info("TestCase9 Loaded");
        offerPositiveScenario.Searchofferbutton(searchoffer);
        Thread.sleep(6000);
        extentTest.log(Status.PASS,"Check Positive Offer Successful");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Logutil.info("TestCase9 Passed");
        Driver.closeBrowser();
        reports.flush();
    }
}
