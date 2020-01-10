package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void clickOnElement(By element) {
        driver.findElement(element).click();
    }

    public void waitForElementToBeVisible(By element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public String getTextFromElement(String xPath) {
        return driver.findElement(By.xpath(xPath)).getText();
    }
}