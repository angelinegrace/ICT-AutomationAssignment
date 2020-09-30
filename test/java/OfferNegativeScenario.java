import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OfferNegativeScenario {
    @FindBy(xpath = "//div[@class='inner-nav right-nav']//li/a[text()='Offers']")
    WebElement offerbutton;
    @FindBy(xpath = "//div[@class='__search']//input[@placeholder='Search for Offers by Name or Bank']")
    WebElement searchoffer;


    public OfferNegativeScenario(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }

    public void Searchofferbutton(String search_offer){
        offerbutton.click();
        searchoffer.sendKeys(search_offer);
        searchoffer.sendKeys(Keys.ENTER);

    }
}
