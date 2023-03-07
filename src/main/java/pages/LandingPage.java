package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends PageBase{
    public LandingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = "div.text-bold-500.font-large-1.mb-1")
    WebElement welcomeMsg;


    public String getWelcomeMsgTxt() {
        return getText(welcomeMsg);
    }



}
