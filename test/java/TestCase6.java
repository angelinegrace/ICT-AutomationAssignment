import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestCase6 extends Reports{
    ExtentReports reports;
    ExtentSparkReporter extentSparkReporter;
    ExtentTest extentTest;
    @Test
    public void ListYourShowServices() throws InterruptedException, IOException {
        Logutil.info("TestCase6 Started");
        String path=System.getProperty("user.dir");
        reports=new ExtentReports();
        extentSparkReporter=new ExtentSparkReporter(path+"\\report\\006.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest=reports.createTest("ListYourShowServices");
        WebDriver driver = Driver.openBrowser("ie", "https://in.bookmyshow.com/mumbai");
        Thread.sleep(20000);
        ListYourshowServices listYourshowServices=new ListYourshowServices(driver);
        Logutil.info("TestCase6 Loaded");
        listYourshowServices.Listbutton();
        boolean loginFlag = listYourshowServices.isSalespresent();
        if (loginFlag == true) {
            System.out.println("Online sales and marketing Displayed");
        } else if (loginFlag == false) {
            System.out.println("fail");
        }
        boolean loginFlag1 = listYourshowServices.ispricespresent();
        if (loginFlag1 == true) {
            System.out.println("Pricing Displayed");
        } else if (loginFlag1 == false) {
            System.out.println("fail");
        }
        boolean loginFlag2 = listYourshowServices.isFoodandbeveragespresent();
        if (loginFlag2 == true) {
            System.out.println("Food and beverages Displayed");
        } else if (loginFlag2 == false) {
            System.out.println("fail");
        }
        boolean loginFlag3 = listYourshowServices.isOngroundpresent();
        if (loginFlag3 == true) {
            System.out.println("Onground and gate support management Displayed");
        } else if (loginFlag3 == false) {
            System.out.println("fail");
        }
        boolean loginFlag4 = listYourshowServices.isReportspresent();
        if (loginFlag4 == true) {
            System.out.println("Reports and business details Displayed");
        } else if (loginFlag4 == false) {
            System.out.println("fail");
        }
        boolean loginFlag5 = listYourshowServices.isPospresent();
        if (loginFlag5 == true) {
            System.out.println("Reports and business details Displayed");
        } else if (loginFlag5 == false) {
            System.out.println("fail");
        }
        extentTest.log(Status.PASS,"Searched List your show Services Successful");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Logutil.info("TestCase6 Passed");
        Driver.closeBrowser();
        reports.flush();
    }
}
