package espn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class followpage {

   WebDriver driver;

   @FindBy (xpath = "//*[@id=\"global-nav\"]/ul/li[2]/a/span/span[1]")
   WebElement btn_favouritesport;

   @FindBy (xpath = "//*[@id=\"global-nav\"]/ul/li[2]/div/ul[2]/li/div/ul[1]/li[6]/a/span/span[1]")
   WebElement btn_teamname;

   @FindBy (xpath = "//button[@class= 'Button Button--sm Button--alt ClubhouseHeader__Follow']")
   WebElement btn_follow;

    public followpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public void favouritesport;(){
        btn_favouritesport.click();

    }
    public void teamname(){
        btn_teamname.click();

    }
    public void follow(){
        btn_follow.click();

    }
}
