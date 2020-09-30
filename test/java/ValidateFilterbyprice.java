import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidateFilterbyprice {
    @FindBy(xpath = "//div[@class='inner-nav left-nav']/ul/li[7]/a[text()='Fanhood']")
    WebElement Fanhoodbutton;
    @FindBy(xpath = "//a[text()='Products']")
    WebElement productbutton;
    @FindBy(xpath = "//div[@class='mega-menu ']/div/div/div[3]/ul/li[6]/a[text()='Planner']")
    WebElement Plannerbutton;
    @FindBy(xpath = "//ul[@class='filter-content']//span[text()='₹0 - ₹500']")
    WebElement clickplanner;

    public ValidateFilterbyprice(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }
    public void fanhoodbutton(){
        Fanhoodbutton.click();
    }
    public void Productbutton() {
        productbutton.click();
            }
    public void Clickplanner(){
        productbutton.click();
        Plannerbutton.click();
        clickplanner.click();
    }

}

