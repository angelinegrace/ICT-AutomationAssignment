import org.testng.annotations.DataProvider;

public class SearchmovieNegativeDataproviders {
    @DataProvider(name = "SearchmovieNegativeScenario")
     public static Object[][] dataprovidersearch(){
        return new Object[][]{
                {"q"}
        };
    }

}
