import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestCase15 extends Reports {
    ExtentReports reports;
    ExtentSparkReporter extentSparkReporter;
    ExtentTest extentTest;
    @Test
    public void ValidateFilterByPrice() throws InterruptedException, IOException {
        Logutil.info("TestCase15 Started");
        String path=System.getProperty("user.dir");
        reports=new ExtentReports();
        extentSparkReporter=new ExtentSparkReporter(path+"\\report\\015.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest=reports.createTest("ValidateFilterByPrice");
        WebDriver driver = Driver.openBrowser("ie", "https://in.bookmyshow.com/mumbai");
        Thread.sleep(20000);
        ValidateFilterbyprice validateFilterbyprice = new ValidateFilterbyprice(driver);
        Logutil.info("TestCase15 Loaded");
        validateFilterbyprice.fanhoodbutton();
        validateFilterbyprice.Productbutton();
        Thread.sleep(6000);
        validateFilterbyprice.Clickplanner();
        extentTest.log(Status.PASS,"Validate Filter By price Successfully");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Logutil.info("TestCase15 Passed");
        Driver.closeBrowser();
        reports.flush();
    }
}
