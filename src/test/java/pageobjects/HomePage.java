package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver browser) {
        this.driver = browser;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    //locatros
    @FindBy(xpath = "//a[contains(text(),'Empleos')]")
    private WebElement btnEmpleo;

    //Actions RegisterAccount
    public void clicSearch()
    {
        wait.until(ExpectedConditions.elementToBeClickable(btnEmpleo)).click();
    }




}
