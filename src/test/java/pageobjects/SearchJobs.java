package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchJobs {
    private WebDriver driver;
    private WebDriverWait wait;

    public SearchJobs(WebDriver browser) {
        this.driver = browser;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    @FindBy(xpath = "//*[@id=\"search_keywords\"]")
    private WebElement Search_keywords;
    @FindBy(xpath = "//*[@id=\"search_location\"]")
    private WebElement Search_location;

    //Actions RegisterAccount
    public void writeKeywords(String term){
        wait.until(ExpectedConditions.elementToBeClickable(Search_keywords)).sendKeys(term);
    }
    public void writeLocation(String term){
        wait.until(ExpectedConditions.elementToBeClickable(Search_location)).sendKeys(term);
    }

}
