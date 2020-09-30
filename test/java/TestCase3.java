import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.InetAddress;

public class TestCase3 extends Reports {

    ExtentReports reports;
    ExtentSparkReporter extentSparkReporter;
    ExtentTest extentTest;
    @Test(dataProvider = "CrewandCastPositivesearch",dataProviderClass = CrewandCastdataProviders.class)
    public void SearchCrewandCast(String searchmovie) throws InterruptedException, IOException {
        Logutil.info("TestCase3 Started");
        String path=System.getProperty("user.dir");
        reports=new ExtentReports();
        extentSparkReporter=new ExtentSparkReporter(path+"\\report\\003.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest=reports.createTest("SearchCrewandCast");
        WebDriver driver=Driver.openBrowser("ie","https://in.bookmyshow.com/mumbai");
        Thread.sleep(20000);
        CastandCrewPositiveScenario castandCrewPositiveScenario=new CastandCrewPositiveScenario(driver);
        Logutil.info("TestCase3 Loaded");
        castandCrewPositiveScenario.searchmovie(searchmovie);
        Thread.sleep(6000);
        extentTest.log(Status.PASS,"Searched Crew and Cast Positive Scenario Successful");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        boolean loginFlag1=castandCrewPositiveScenario.isMessagegpresent();
        if(loginFlag1==true){
            System.out.println("Sucessfull");
        }else if(loginFlag1==false){
            System.out.println("fail");
        }
        boolean loginFlag= castandCrewPositiveScenario.isMsgpresent();
        if(loginFlag==true){
            System.out.println("Sucessfull");
        }
        else if(loginFlag==false){
            System.out.println("fail");
        }
        Logutil.info("TestCase3 Passed");
        Driver.closeBrowser();
        reports.flush();

    }
}
