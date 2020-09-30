import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestCase7 extends Reports {

    ExtentReports reports;
    ExtentSparkReporter extentSparkReporter;
    ExtentTest extentTest;
    @Test
    public void SearchListBusinessandInsights() throws InterruptedException, IOException {
        Logutil.info("TestCase7 Started");
        String path=System.getProperty("user.dir");
        reports=new ExtentReports();
        extentSparkReporter=new ExtentSparkReporter(path+"\\report\\007.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest=reports.createTest("SearchListBusinessandInsights");
        WebDriver driver = Driver.openBrowser("ie", "https://in.bookmyshow.com/mumbai");
        Thread.sleep(20000);
        ReportsandBusinessdetails reportsandBusinessdetails=new ReportsandBusinessdetails(driver);
        Logutil.info("TestCase7 Loaded");
        reportsandBusinessdetails.Listbutton();
        reportsandBusinessdetails.ClickButton();
        extentTest.log(Status.PASS,"Searched List your show Business and Insights Successful");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Logutil.info("TestCase7 Passed");
        Driver.closeBrowser();
        reports.flush();
    }
}
