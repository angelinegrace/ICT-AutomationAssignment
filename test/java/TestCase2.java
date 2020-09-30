import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.InetAddress;

public class TestCase2  {

    ExtentReports reports;
    ExtentSparkReporter extentSparkReporter;
    ExtentTest extentTest;
    @Test(dataProvider = "SearchmovieNegativeScenario",dataProviderClass = SearchmovieNegativeDataproviders.class)
    public void SearchNegativeMovie(String searchnegativemovie) throws InterruptedException, IOException {
        Logutil.info("TestCase2 Started");
        String path=System.getProperty("user.dir");
        reports=new ExtentReports();
        extentSparkReporter=new ExtentSparkReporter(path+"\\report\\002.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest=reports.createTest("SearchNegativeMovie");
        WebDriver driver = Driver.openBrowser("ie", "https://in.bookmyshow.com/mumbai");
        Thread.sleep(20000);
        SearchmovieNegativeScenario searchmovieNegativeScenario = new SearchmovieNegativeScenario(driver);
        Logutil.info("TestCase2 Loaded");
        searchmovieNegativeScenario.searchmovie(searchnegativemovie);
        Thread.sleep(6000);
        extentTest.log(Status.PASS,"Searched Negative Scenario Successful");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Logutil.info("TestCase2 Passed");
        Driver.closeBrowser();
        reports.flush();


    }
}
