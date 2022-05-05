package espn.tests;

import espn.pages.account_creationpage;
import framework.Basetest;
import org.testng.annotations.Test;

public class account_creationtests  extends Basetest {


    @Test
    public void newaccount(){

        account_creationpage Account_creationpage = new account_creationpage(driver);
        Account_creationpage.signingup();
        Account_creationpage.enterFirstname();
        Account_creationpage.enterLastname();
        Account_creationpage.enteremailaddress();
        Account_creationpage.enterpassword();
        Account_creationpage.hitshowpassword();
        Account_creationpage.hitespn();


    }
}
