package espn.tests;

import espn.pages.searchpage;
import framework.Basetest;
import org.testng.annotations.Test;

public class searchpagetests extends Basetest {

    @Test
    public void searchtests()
        searchpage Searchpage = new searchpage(driver);
         searchpage.searchtext();


}
