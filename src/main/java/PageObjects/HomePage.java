package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;
    public HomePage() {
        PageFactory.initElements(driver,this);
        this.driver=driver;

    }
    @FindBy(xpath="")
    private WebElement DashboardText;
}
