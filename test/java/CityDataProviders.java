import org.testng.annotations.DataProvider;

public class CityDataProviders {
    @DataProvider(name = "ChooseCity")
    public static Object[][] dataProviderssearch() {
        return new Object[][]{
                {"Goa"}
        };
    }

}
