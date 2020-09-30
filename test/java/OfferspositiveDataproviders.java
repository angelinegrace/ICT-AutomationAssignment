import org.testng.annotations.DataProvider;

public class OfferspositiveDataproviders {
    @DataProvider(name = "OffersPositivesearch")
    public static Object[][] dataProviderssearch() {
        return new Object[][]{
                {"ICICI Bank 25%"}
        };
    }



}


