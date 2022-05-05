package espn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchpage {


      WebDriver driver;


       @FindBy (xpath = "//a[@class='icon-font-after icon-search-solid-after']")
       WebElement txt_searchtext;



    public searchpage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);


        public void search(){
        }

        public void searchtext(String searchtext){
            txt_searchtext.sendKeys();

        }
}
