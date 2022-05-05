package espn.tests;

import espn.pages.followpage;
import framework.Basetest;
import org.testng.annotations.Test;

public class followpagetests extends Basetest {

    @Test
    public void followpagetest(){

        followpage Followpage = new followpage(driver);
        followpage.favouritesport();
        followpage.teamname();
        followpage.follow();

    }


}
