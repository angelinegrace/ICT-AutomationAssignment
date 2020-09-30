import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterTextValidation {
    @FindBy(xpath = "//div[@class='footers-links']//div[contains(@class,'col app')]")
    WebElement verifybookapp;
    @FindBy(xpath ="//div[@class='footers-links']//div[contains(@class,'col news')]")
    WebElement verifynews;
    @FindBy(xpath = "//div[@class='footers-links']//div[contains(@class,'col help')]")
    WebElement help;
    @FindBy(xpath = "//div[@class='footers-links']//div[contains(@class,'col exclusives')]")
    WebElement exclusives;


    public FooterTextValidation(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    public boolean isApppresent(){
        try{
            return verifybookapp.isDisplayed();
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public boolean isNewsPresent(){
        try{
            return verifynews.isDisplayed();
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public boolean isHelpPresent(){
        try{
            return help.isDisplayed();
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public boolean isExclusivesPresent(){
        try{
            return exclusives.isDisplayed();
        }
        catch(Exception e)
        {
            return false;
        }
    }


}
