import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseCity {
    @FindBy(xpath = "//li[@class='secondary-menu location-container']//span[@id='spnSelectedRegion']")
    WebElement choosecity;
    @FindBy(xpath = "//div[@class='__dd-sec-top struktur']/span[2]/input[@placeholder='Search for your city']")
    WebElement searchcity;

    public ChooseCity(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }
    public void City(String search_city){
        choosecity.click();
        searchcity.sendKeys(search_city);
        searchcity.sendKeys(Keys.ENTER);
    }
}
