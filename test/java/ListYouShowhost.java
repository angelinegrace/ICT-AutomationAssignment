import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListYouShowhost {
    @FindBy(xpath="//div[@class='inner-nav right-nav']//li/a[text()='ListYourShow']")
    WebElement clickbutton;
    @FindBy(xpath="//div[contains(@open-modal,'Streaming')]")
    WebElement onlinestreaming;
    @FindBy(xpath="//div[contains(@open-modal,'Performances')]")
    WebElement performances;
    @FindBy(xpath="//div[contains(@open-modal,'Experiences')]")
    WebElement experiences;
    @FindBy(xpath = "//div[contains(@open-modal,'Expositions')]")
    WebElement expositions;
    @FindBy(xpath = "//div[contains(@open-modal,'Parties')]")
    WebElement parties;
    @FindBy(xpath = "//div[contains(@open-modal,'Sports')]")
    WebElement sports;
    @FindBy(xpath = "//div[contains(@open-modal,'Conferences')]")
    WebElement conferences;

    public ListYouShowhost(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }
    public void Listbutton(){
        clickbutton.click();
    }
    public boolean isMessagepresent(){
        try{
           return onlinestreaming.isDisplayed();
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public boolean isPerformancespresent(){
        try{
            return performances.isDisplayed();
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public boolean isExperiencespresent(){
        try{
            return experiences.isDisplayed();
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public boolean isExpositionspresent(){
        try{
            return expositions.isDisplayed();
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public boolean ispartiespresent(){
        try{
            return parties.isDisplayed();
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public boolean issportsPresent(){
        try{
            return sports.isDisplayed();
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public boolean isConferencesPresent(){
        try{
            return conferences.isDisplayed();
        }
        catch(Exception e)
        {
            return false;
        }
    }
}
