import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListYourshowServices {
    @FindBy(xpath="//div[@class='inner-nav right-nav']//li/a[text()='ListYourShow']")
    WebElement clickbutton;
    @FindBy(xpath = "//div[contains(@open-modal,'Sales')]")
    WebElement Sales;
    @FindBy(xpath="//div[contains(@open-modal,'Pricing')]")
    WebElement Pricing;
    @FindBy(xpath = "//div[contains(@open-modal,'Food')]")
    WebElement food;
    @FindBy(xpath = "//div[contains(@open-modal,'Onground')]")
    WebElement Onground;
    @FindBy(xpath = "//div[contains(@open-modal,'Reports')]")
    WebElement reports;
    @FindBy(xpath = "//div[contains(@open-modal,'Pos')]")
    WebElement pos;
    public ListYourshowServices(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }
    public void Listbutton(){
        clickbutton.click();
    }
    public boolean isSalespresent(){
        try{
            return Sales.isDisplayed();
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public boolean ispricespresent(){
        try{
            return Pricing.isDisplayed();
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public boolean isFoodandbeveragespresent(){
        try{
            return food.isDisplayed();
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public boolean isOngroundpresent(){
        try{
            return Onground.isDisplayed();
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public boolean isReportspresent(){
        try{
            return reports.isDisplayed();
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public boolean isPospresent(){
        try{
            return pos.isDisplayed();
        }
        catch(Exception e)
        {
            return false;
        }
    }

}
