import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestCase8 extends Reports{
    ExtentReports reports;
    ExtentSparkReporter extentSparkReporter;
    ExtentTest extentTest;
    @Test
    public void CheckOffers () throws InterruptedException, IOException {
        Logutil.info("TestCase8 Started");
        String path=System.getProperty("user.dir");
        reports=new ExtentReports();
        extentSparkReporter=new ExtentSparkReporter(path+"\\report\\008.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest=reports.createTest("CheckOffers");
        WebDriver driver = Driver.openBrowser("ie", "https://in.bookmyshow.com/mumbai");
        Thread.sleep(20000);
        CheckOffers checkOffers=new CheckOffers(driver);
        Logutil.info("TestCase8 loaded");
        checkOffers.OfferButton();
        checkOffers.RewardButton();
        boolean loginFlag = checkOffers.isRewardpointspresent();
        if (loginFlag == true) {
            System.out.println("Rewardpoints Displayed");
        } else if (loginFlag == false) {
            System.out.println("fail");
        }
        boolean loginFlag1 = checkOffers.isPaybackpresent();
        if (loginFlag1 == true) {
            System.out.println("Payback Displayed");
        } else if (loginFlag1 == false) {
            System.out.println("fail");
        }
        boolean loginFlag2 = checkOffers.isSBIpresent();
        if (loginFlag2 == true) {
            System.out.println("SBI Displayed");
        } else if (loginFlag2 == false) {
            System.out.println("fail");
        }
        extentTest.log(Status.PASS,"Check Offers Successful");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Logutil.info("TestCase8 Passed");
        Driver.closeBrowser();
        reports.flush();
       }
}
