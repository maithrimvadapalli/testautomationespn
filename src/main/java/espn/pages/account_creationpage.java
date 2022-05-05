package espn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class account_creationpage {

    String Url = "https://www.espn.com/";

    WebDriver driver;

    @FindBy(xpath ="//a[@class='btn btn-secondary ng-isolate-scope']")
    WebElement btn_signingup;

    @FindBy(xpath= " //input[@name='firstName']")
    WebElement tbx_firstname;

    @FindBy (xpath= "//input[@name='lastName']")
    WebElement tbx_lastname;

    @FindBy (xpath = "//input[@name='email']")
    WebElement tbx_emailaddress;

    @FindBy (xpath = "//input[@name='newPassword']")
    WebElement tbx_password;

    @FindBy (xpath = "//span[@did-translate='update.header.SHOW_PASSWORD']")
    WebElement chkbox_Showpassword;

    @FindBy (xpath = "//*[@id=\"did-ui-view\"]/div/section/section/form/div/div[2]/label")
    WebElement chkbox_espn;

    @FindBy (xpath = "//button[@type='submit']")
    WebElement btn_signup;

    public account_creationpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Signingup(){
        btn_signingup.click();

    }

     public void enterFirstname(String firstname){
        tbx_firstname.sendKeys(firstname);

    }
    public void enterLastname(String lastname){
        tbx_lastname.sendKeys(lastname);

    }
    public void Emailaddress(String emailaddress){
        tbx_emailaddress.sendKeys(emailaddress);

    }
    public void Password(String password){
        tbx_password.sendKeys();

    }
    public void Showpassword(){

    }

    public void espn(){

    }
    public void signup(){
        btn_signup.click();

    }
}
