import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Reports  {

    @BeforeSuite
    public void beforeSuite(){
         System.out.println("OpenReports");

    }

    @AfterSuite
    public void aftersuite(){
        System.out.println("ClosedReports");
    }



}
