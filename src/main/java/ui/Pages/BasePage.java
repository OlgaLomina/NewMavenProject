package ui.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    // fields
    protected String url;
    public WebDriver driver;

    // constructor
    public BasePage(WebDriver driver) {
        PageFactory.initElements(this.driver=driver, this);
    }

    public void open() {
        driver.get(url);
    }
    
    public WebDriverWait getWait() {
        return getWait(10);
    }

    public  WebDriverWait getWait(int timeout) {
        return new WebDriverWait(driver, timeout);
    }

    protected void waitForVisible(WebElement element) {
        getWait().until(ExpectedConditions.visibilityOf(element));
    }

}
