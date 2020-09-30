import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOffers {
    @FindBy(xpath = "//div[@class='inner-nav right-nav']//li/a[text()='Offers']")
    WebElement offerbutton;
    @FindBy(xpath = "//li[@data-id='rewards']/span[text()='Rewards']")
    WebElement rewardbutton;
    @FindBy(xpath = "//aside[contains(@id,'REWARDPOINTS')]")
    WebElement rewardpoints;
    @FindBy(xpath = "//aside[contains(@id,'PAYBACK')]")
    WebElement Payback;
    @FindBy(xpath = "//aside[contains(@id,'SBISIMCLIK')]")
    WebElement SBI;
    public CheckOffers(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }
    public void OfferButton(){
        offerbutton.click();
    }
    public void RewardButton(){
        rewardbutton.click();
    }
    public boolean isRewardpointspresent(){
        try{
            return rewardpoints.isDisplayed();
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public boolean isPaybackpresent(){
        try{
            return Payback.isDisplayed();
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public boolean isSBIpresent(){
        try{
            return SBI.isDisplayed();
        }
        catch(Exception e)
        {
            return false;
        }
    }
}
