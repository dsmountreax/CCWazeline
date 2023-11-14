package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(how= How.CSS, using = "#element-0")
    private WebElement inputUserName;

    @FindBy(how= How.CSS, using = "#element-3")
    private WebElement inputPassword;

    @FindBy(how= How.CSS, using = "button[data-gtm-id]")
    private WebElement loginButton;

    public WebElement getInputUserName() {
        return inputUserName;
    }

    public WebElement getInputPassword() {
        return inputPassword;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }
}
