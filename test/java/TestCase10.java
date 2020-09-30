import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestCase10 extends Reports {
    ExtentReports reports;
    ExtentSparkReporter extentSparkReporter;
    ExtentTest extentTest;
    @Test(dataProvider = "OffersNegativesearch",dataProviderClass = OffernegativeDataProviders.class)
    public void SearchofferNegativeScenario(String searchoffer) throws InterruptedException, IOException {
        Logutil.info("TesTCase10 Started");
        String path=System.getProperty("user.dir");
        reports=new ExtentReports();
        extentSparkReporter=new ExtentSparkReporter(path+"\\report\\010.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest=reports.createTest("SearchofferNegativeScenario");
        WebDriver driver = Driver.openBrowser("ie", "https://in.bookmyshow.com/mumbai");
        Thread.sleep(20000);
        OfferNegativeScenario offerNegativeScenario=new OfferNegativeScenario(driver);
        Logutil.info("TesTCase10 Loaded");
        offerNegativeScenario.Searchofferbutton(searchoffer);
        Thread.sleep(6000);
        extentTest.log(Status.PASS,"Check Negative Offer Successful");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Logutil.info("TesTCase10 Passed");
        Driver.closeBrowser();
        reports.flush();
    }
}
