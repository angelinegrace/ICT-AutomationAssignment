import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CastandCrewPositiveScenario {
    @FindBy(xpath="//div[@class='search-section']/input[@id='input-search-box']")
    WebElement clickbutton;
    @FindBy(xpath=" //div[@class='search-container']//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']")
    WebElement Searchmovie;
    @FindBy(xpath = "//a/div[@class='__cast-member']")
    WebElement cast_msg;
    @FindBy(xpath = "//div[@id='crew-carousel']//div/span[3]/a/div[@class='__cast-member']")
    WebElement text_msg;

    public CastandCrewPositiveScenario(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }
    public void searchmovie(String search_movie){
        clickbutton.click();
        Searchmovie.sendKeys(search_movie);
        Searchmovie.sendKeys(Keys.ENTER);
    }
    public boolean isMessagegpresent(){
        try{
            return cast_msg.isDisplayed();
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public boolean isMsgpresent(){
        try{
            return text_msg.isDisplayed();
        }
        catch(Exception e)
        {
            return false;
        }
    }

}
