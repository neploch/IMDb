package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage (WebDriver driver) {
        super(driver);
    }

    By mainMenuButton = By.xpath("//label[contains(@class,'ipc-button') and @aria-label='Open Navigation Drawer']");
    By mostPopularMovieLabel = By.xpath("//a[contains(@href,'mpm')]");
    By imdbProButton = By.xpath("//div[contains(@class,'imdb-header__watchlist')]");

    public void getWebSiteAndValidate(String siteURL) {
        driver.get(siteURL);
        waitForElementToBeVisible(imdbProButton);
    }

    public void openMainMenu()
    {
        clickOnElement(mainMenuButton);
    }

    public void openMostPopularMoviesChart()
    {
        waitForElementToBeClickable(mostPopularMovieLabel);
        clickOnElement(mostPopularMovieLabel);
    }
}