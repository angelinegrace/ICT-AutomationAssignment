import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestCase13 extends Reports {
    ExtentReports reports;
    ExtentSparkReporter extentSparkReporter;
    ExtentTest extentTest;
    @Test(dataProvider = "ChooseCity",dataProviderClass = CityDataProviders.class)
    public void ChooseCity(String searchcity) throws InterruptedException, IOException {
        Logutil.info("TestCase13 Started");
        String path=System.getProperty("user.dir");
        reports=new ExtentReports();
        extentSparkReporter=new ExtentSparkReporter(path+"\\report\\013.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest=reports.createTest("ChooseCity");
        WebDriver driver = Driver.openBrowser("ie", "https://in.bookmyshow.com/mumbai");
        Thread.sleep(20000);
        ChooseCity chooseCity=new ChooseCity(driver);
        Logutil.info("TestCase13 Loaded");
        chooseCity.City(searchcity);
        Thread.sleep(6000);
        extentTest.log(Status.PASS,"City Selected Successfully");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Logutil.info("TestCase13 Passed");
        Driver.closeBrowser();
        reports.flush();
    }
}
