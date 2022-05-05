package espn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

    String Url = "https://www.espn.com/";

    WebDriver driver;


    @FindBy (xpath = "//@id='global-user-trigger']")
    WebElement lbl_clickicon;

    @FindBy(xpath = "//*[@id=\"global-viewport\"]/div[3]/div/ul[1]/li[7]/a")
    WebElement btn_Log;

    @FindBy(xpath = "//input[@type='email']")
    WebElement tbx_Username;

    @FindBy(xpath="//input[@type='password']")
    WebElement tbx_Password;

    @FindBy(xpath= "//button[@class='btn btn-primary btn-submit ng-isolate-scope']")
    WebElement btn_Login;

    public loginpage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public loginpage clickicon(){
        lbl_clickicon.click();
        return this;

    }

    public loginpage  log(){
        btn_Log.click();
        return this;

    }

    public static loginpage enterUsername(String username){
        tbx_Username.sendKeys(username);
        return this;

    }
    public static loginpage enterPassword(String password){
        tbx_Password.sendKeys(password);
        return this;

    }
    public static loginpage login(){
        btn_Login.click();
        return this;

    }
}
