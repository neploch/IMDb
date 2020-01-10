package tests;

import org.testng.annotations.Test;

public class MainRunner extends BaseTest {

    String siteURL = "https://www.imdb.com/";
    int position = 6;
    @Test(priority = 1 ,groups= "OpenWebSite", description= "Open the web site")
    public void openWebSite() {
        homePage.getWebSiteAndValidate(siteURL);
    }

    @Test (priority = 2 ,groups= "FindNthPopularMovieName" , description= "Get n-th most popular movie name")
    public void nthPopularMovieName() {
        homePage.openMainMenu();
        homePage.openMostPopularMoviesChart();
        movieMeter.getNthMovieTitleName(position);
    }
}