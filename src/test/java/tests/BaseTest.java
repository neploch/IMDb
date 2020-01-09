package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.HomePage;
import pages.MovieMeter;
import utilities.ExtentListener;


public class BaseTest extends ExtentListener {

    WebDriver driver;

    HomePage homePage;
    MovieMeter movieMeter;

    @BeforeTest(alwaysRun = true)
    public void setup() {
        System.setProperty("webdriver.chrome.driver" , ".\\drivers\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
        movieMeter = new MovieMeter(driver);
    }

    @AfterTest(alwaysRun = true)
    public void close() {
        driver.quit();
    }
}