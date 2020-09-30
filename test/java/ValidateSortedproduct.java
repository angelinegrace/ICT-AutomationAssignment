import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ValidateSortedproduct {
    @FindBy(xpath = "//div[@class='inner-nav left-nav']/ul/li[7]/a[text()='Fanhood']")
    WebElement Fanhoodbutton;
    @FindBy(xpath = "//a[text()='Products']")
    WebElement productbutton;
    @FindBy(xpath = "//div[@data-type='menu']/div/div/div[8]/ul/li[2]/a[text()='Lunch Bags']")
    WebElement lunchbags;
    @FindBy(xpath = "//select[@id='ajaxSort']/option[text()='Alphabetically: Z-A']")
    WebElement Sortedorder;


    public ValidateSortedproduct(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }
    public void fanhoodbutton(){
        Fanhoodbutton.click();
    }
    public void Productbutton() {
        productbutton.click();
            }
     public void Lunchbags(){
        productbutton.click();
        lunchbags.click();
        Sortedorder.click();
     }
}
