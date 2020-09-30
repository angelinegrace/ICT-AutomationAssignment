import org.testng.annotations.DataProvider;

public class SearchmoviepositiveDataproviders {
  @DataProvider(name = "SearchmoviePositiveScenario")
    public static Object[][] dataProviderssearch() {
      return new Object[][]{
              {"Fantasy Island"}
      };
  }



}
