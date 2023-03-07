package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "Username")
    WebElement userNameTxtBox;

    @FindBy (id = "Password")
    WebElement passwordTxtBox;

    @FindBy (className = "signinformsubmit")
    WebElement signInBtn;

    public void userLogin(String userName, String passWord) throws InterruptedException {
        setValueToTxtField(userNameTxtBox, userName);
        setValueToTxtField(passwordTxtBox, passWord);
        clickOnButton(signInBtn);
        Thread.sleep(5000);
    }
}
