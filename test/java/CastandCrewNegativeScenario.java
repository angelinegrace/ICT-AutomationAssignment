import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CastandCrewNegativeScenario {
    @FindBy(xpath="//div[@class='search-section']/input[@id='input-search-box']")
    WebElement clickbutton;
    @FindBy(xpath=" //div[@class='search-container']//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']")
    WebElement Searchmovie;
    @FindBy(xpath = "//a/div[text()='Tom cruise']")
    WebElement cast_msg;
    @FindBy(xpath = "//a/div[text()='Michael Jackson']")
    WebElement text_msg;

    public CastandCrewNegativeScenario(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }
    public void searchmovie(String search_movie){
        clickbutton.click();
        Searchmovie.sendKeys(search_movie);
        Searchmovie.sendKeys(Keys.ENTER);
    }
    public boolean isMessagegpresent(String Cast_msg){
        try{
            cast_msg.sendKeys(Cast_msg);
            return cast_msg.isDisplayed();
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public boolean isMsgpresent(String Text_msg){
        try{
            text_msg.sendKeys(Text_msg);
            return text_msg.isDisplayed();
        }
        catch(Exception e)
        {
            return false;
        }
    }

}
