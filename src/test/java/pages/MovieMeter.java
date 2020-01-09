package pages;


import org.openqa.selenium.WebDriver;

public class MovieMeter extends BasePage {
    public MovieMeter (WebDriver driver) {
        super(driver);
    }

    String movieTitleXpath = "(//td[@class='titleColumn'])[%s]/a";

    public String createNthMovieTitleXpath(int x)
    {
        return String.format(movieTitleXpath,x);
    }

    public String getNthMovieTitleName(int x)
    {
        String movieName = getTextFromElement(createNthMovieTitleXpath(x));
        System.out.println(x+"-th most popular movie name is: " + movieName);
        return movieName;
    }
}