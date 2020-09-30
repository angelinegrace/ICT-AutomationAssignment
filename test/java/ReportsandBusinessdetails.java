import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportsandBusinessdetails {
    @FindBy(xpath="//div[@class='inner-nav right-nav']//li/a[text()='ListYourShow']")
    WebElement clickbutton;
    @FindBy(xpath="//div[@class='__box __card-color']//div[text()='Reports & business insights']")
    WebElement clickButtonDetails;


    public ReportsandBusinessdetails(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }
    public void Listbutton(){
        clickbutton.click();
    }
    public void ClickButton(){
        clickButtonDetails.click();
    }
}
