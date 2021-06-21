package ui.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MapsSearchPage extends BasePage {
    public MapsSearchPage(WebDriver driver) {
        super(driver);
        url = "https://www.google.com/maps/";
    }

    private String endRoute = "Redmond WA";

    @FindBy(xpath = "//*[@id='searchboxinput']")
    private WebElement searchInputLocatorTo;

    @FindBy(xpath = "//*[@id='searchbox-directions']")
    private WebElement searchboxDirections;

    public void navigateTo(){
        driver.get(url);
        waitForVisible(searchInputLocatorTo);
    }

    public String nameTitle(){
        String aa = driver.getTitle();
        return driver.getTitle();
    }

    public void validateTitle(){

        String actualTitle = nameTitle();
        String expectedTitle = "Google Maps";
        Assert.assertEquals(expectedTitle,actualTitle);
        System.out.println("Maps is opened : " + nameTitle());
    }

}
