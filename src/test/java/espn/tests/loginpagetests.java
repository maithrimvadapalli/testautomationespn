package espn.tests;

import espn.pages.loginpage;
import framework.Basetest;
import org.testng.annotations.Test;

public class loginpagetests extends Basetest {


    @Test
    public void testlogin() {
        loginpage Loginpage = new loginpage(driver);
        loginpage.enterUsername("");
        loginpage.enterPassword("");
        loginpage.login();


    }
}
