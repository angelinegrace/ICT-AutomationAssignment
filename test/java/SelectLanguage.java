import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectLanguage {
    @FindBy(xpath = "//div/a[@onclick='BMS.Header.switchLangDropDown();']")
    WebElement selectlanguagebutton;
    public SelectLanguage(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }
    public void Selectbutton(){
        selectlanguagebutton.click();
    }
}
