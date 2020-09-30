import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.InetAddress;


public class TestCase1  {
    ExtentReports reports;
    ExtentSparkReporter extentSparkReporter;
    ExtentTest extentTest;
    @Test(dataProvider = "SearchmoviePositiveScenario",dataProviderClass = SearchmoviepositiveDataproviders.class)
    public void Searchpositivemovie(String searchmovie) throws InterruptedException, IOException {
        Logutil.info("TestCase1 Started");
        String path=System.getProperty("user.dir");
        reports=new ExtentReports();
        extentSparkReporter=new ExtentSparkReporter(path+"\\report\\001.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest=reports.createTest("Searchpositivemovie");
        WebDriver driver=Driver.openBrowser("ie","https://in.bookmyshow.com/mumbai");
        Thread.sleep(20000);
        SearchmoviePositiveScenario searchmoviePositivescenario=new SearchmoviePositiveScenario(driver);
        Logutil.info("TestCase1 Loaded");
        searchmoviePositivescenario.searchmovie(searchmovie);
        Thread.sleep(6000);
        extentTest.log(Status.PASS,"Searched Positive Scenario Successful");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Logutil.info("Testcase1 Passed");
        Driver.closeBrowser();
        reports.flush();


    }
}
