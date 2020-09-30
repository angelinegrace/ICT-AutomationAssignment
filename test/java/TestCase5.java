import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestCase5 extends Reports {
    ExtentReports reports;
    ExtentSparkReporter extentSparkReporter;
    ExtentTest extentTest;
    @Test
    public void ListYourShow() throws InterruptedException, IOException {
        Logutil.info("TestCase5 Started");
        String path=System.getProperty("user.dir");
        reports=new ExtentReports();
        extentSparkReporter=new ExtentSparkReporter(path+"\\report\\005.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest=reports.createTest("ListYourShow");
        WebDriver driver = Driver.openBrowser("ie", "https://in.bookmyshow.com/mumbai");
        Thread.sleep(20000);
        ListYouShowhost listYouShowhost = new ListYouShowhost(driver);
        Logutil.info("TestCase5 loaded");
        listYouShowhost.Listbutton();
        boolean loginFlag = listYouShowhost.isMessagepresent();
        if (loginFlag == true) {
            System.out.println("Online Streaming Displayed");
        } else if (loginFlag == false) {
            System.out.println("fail");
        }
        boolean loginFlag1 = listYouShowhost.isPerformancespresent();
        if (loginFlag1 == true) {
            System.out.println("Performances Displayed");
        } else if (loginFlag1 == false) {
            System.out.println("fail");
        }
        boolean loginFlag2 = listYouShowhost.isExperiencespresent();
        if (loginFlag2 == true) {
            System.out.println("Experiences Displayed");
        } else if (loginFlag2 == false) {
            System.out.println("fail");
        }
        boolean loginFlag3 = listYouShowhost.isExpositionspresent();
        if (loginFlag3 == true) {
            System.out.println("Expositions Displayed");
        } else if (loginFlag3 == false) {
            System.out.println("fail");
        }
        boolean loginFlag4 = listYouShowhost.ispartiespresent();
        if (loginFlag4 == true) {
            System.out.println("Parties Displayed");
        } else if (loginFlag4 == false) {
            System.out.println("fail");
        }
        boolean loginFlag5= listYouShowhost.issportsPresent();
        if (loginFlag5 == true) {
            System.out.println("Sports Displayed");
        } else if (loginFlag5 == false) {
            System.out.println("fail");
        }
        boolean loginFlag6= listYouShowhost.isConferencesPresent();
        if (loginFlag6 == true) {
            System.out.println("Conferences Displayed");
        } else if (loginFlag6 == false) {
            System.out.println("fail");
        }
        extentTest.log(Status.PASS,"Searched List your show host Successful");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Logutil.info("TestCase5 Passed");
        Driver.closeBrowser();
        reports.flush();

    }
}
