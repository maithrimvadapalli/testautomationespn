import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class espnpagefactory {

    static WebDriver driver;
    static String URL;


    @BeforeMethod
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Binaries\\chromedriver.exe");
        driver  = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(  2000);

    }

    @Test
    public void testsomething() throws Exception {

        URL = "https://www.espn.com/";
        driver.get(URL);
        Thread.sleep(2000);

        WebElement clickicon = driver.findElement(By.xpath("//@id='global-user-trigger']"));
        clickicon.click();

        WebElement name = driver.findElement(By.xpath("//input[@type='email']"));
        name.click();
        name.sendKeys( "maithrimvadapalli@gmail.com");
        Thread.sleep(2000);

        WebElement code = driver.findElement(By.xpath("//input[@type='password']"));
        code.click();
        code.sendKeys("snuffy123");


        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-submit ng-isolate-scope']")).click();
        Thread.sleep(2000);
    }



    @AfterMethod
    public void tearDown(){
        driver.close();


    }










}

}
