import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchmovieNegativeScenario {
    @FindBy(xpath="//div[@class='search-section']/input[@id='input-search-box']")
    WebElement clickbutton;
    @FindBy(xpath=" //div[@class='search-container']//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']")
    WebElement Searchmovie;

    public SearchmovieNegativeScenario(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }
    public void searchmovie(String search_movie){
        clickbutton.click();
        Searchmovie.sendKeys(search_movie);


    }
}
