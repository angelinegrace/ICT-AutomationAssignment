import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestCase11 extends Reports {
    ExtentReports reports;
    ExtentSparkReporter extentSparkReporter;
    ExtentTest extentTest;
    @Test
    public void FooterTextValidation() throws InterruptedException, IOException {
        Logutil.info("TestCase11 Started");
        String path=System.getProperty("user.dir");
        reports=new ExtentReports();
        extentSparkReporter=new ExtentSparkReporter(path+"\\report\\011.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest=reports.createTest("FooterTextValidation");
        WebDriver driver = Driver.openBrowser("ie", "https://in.bookmyshow.com/mumbai");
        Thread.sleep(20000);
        FooterTextValidation footerTextValidation=new FooterTextValidation(driver);
        Logutil.info("TestCase11 Loaded");
        boolean loginFlag = footerTextValidation.isApppresent();
        if (loginFlag == true) {
            System.out.println("BookApp is Displayed");
        } else if (loginFlag == false) {
            System.out.println("fail");
        }
        boolean loginFlag1 = footerTextValidation.isNewsPresent();
        if (loginFlag1 == true) {
            System.out.println("Bookmyshow news is Displayed");
        } else if (loginFlag1 == false) {
            System.out.println("fail");
        }
        boolean loginFlag2 = footerTextValidation.isHelpPresent();
        if (loginFlag2 == true) {
            System.out.println("help is Displayed");
        } else if (loginFlag2 == false) {
            System.out.println("fail");
        }
        boolean loginFlag3 = footerTextValidation.isExclusivesPresent();
        if (loginFlag3 == true) {
            System.out.println("Exclusives is Displayed");
        } else if (loginFlag3 == false) {
            System.out.println("fail");
        }
        extentTest.log(Status.PASS,"Footer Text Validation is Successful");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Logutil.info("TestCase11 Passed");
        Driver.closeBrowser();
        reports.flush();

    }
}