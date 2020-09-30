import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestCase14 extends Reports{
    ExtentReports reports;
    ExtentSparkReporter extentSparkReporter;
    ExtentTest extentTest;
    @Test
    public void ValidateSortedProduct() throws InterruptedException, IOException {
        Logutil.info("TestCase14 Started");
        String path=System.getProperty("user.dir");
        reports=new ExtentReports();
        extentSparkReporter=new ExtentSparkReporter(path+"\\report\\014.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest=reports.createTest("ValidateSortedProduct");
        WebDriver driver = Driver.openBrowser("ie", "https://in.bookmyshow.com/mumbai");
        Thread.sleep(20000);
        ValidateSortedproduct validateSortedproduct = new ValidateSortedproduct(driver);
        Logutil.info("TestCase14 Loaded");
        validateSortedproduct.fanhoodbutton();
        validateSortedproduct.Productbutton();
        Thread.sleep(3000);
        validateSortedproduct.Lunchbags();
        extentTest.log(Status.PASS,"Validate Sorted product Successfully");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Logutil.info("TestCase14 Passed");
        Driver.closeBrowser();
        reports.flush();
    }
}
