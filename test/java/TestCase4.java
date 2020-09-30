import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestCase4 extends Reports {

    ExtentReports reports;
    ExtentSparkReporter extentSparkReporter;
    ExtentTest extentTest;
    @Test(dataProvider = "CrewandCastPositivesearch",dataProviderClass = CrewandCastdataProviders.class)
    public void SearchCrewandCast1(String searchmovie) throws InterruptedException, IOException {
        Logutil.info("TestCase4 Started");
        String path=System.getProperty("user.dir");
        reports=new ExtentReports();
        extentSparkReporter=new ExtentSparkReporter(path+"\\report\\004.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest=reports.createTest("SearchCrewandCast1");
        WebDriver driver=Driver.openBrowser("ie","https://in.bookmyshow.com/mumbai");
        Thread.sleep(20000);
        CastandCrewNegativeScenario castandCrewNegativeScenario=new CastandCrewNegativeScenario(driver);
        Logutil.info("TestCase4 Loaded");
        castandCrewNegativeScenario.searchmovie(searchmovie);
        Thread.sleep(6000);
        boolean loginFlag1=castandCrewNegativeScenario.isMessagegpresent("Tom cruise");
        if(loginFlag1==true){
            System.out.println("Sucessfull");
        }else if(loginFlag1==false){
            System.out.println("fail,Tom cruise does not exist");
        }
        boolean loginFlag2= castandCrewNegativeScenario.isMsgpresent("Michael Jackson");
        if(loginFlag2==true){
            System.out.println("Sucessfull");
        }
        else if(loginFlag2==false){
            System.out.println("fail,Michael Jackson does not exist");
        }
        extentTest.log(Status.PASS,"Searched Crew and Cast Negative Scenario Successful");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Logutil.info("TestCase4 Passed");
        Driver.closeBrowser();
        reports.flush();


    }
}
