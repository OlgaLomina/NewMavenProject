package ui.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static utils.DriverInitializer.setBrowser;

public class BaseTest {
    public WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = setBrowser("chrome");
        if (driver != null) {
            driver.manage().window().maximize();
        }
    }

    @Test
    public void testSample() {
        driver.get("https://www.google.com/");
    }

    @AfterTest
    public void closeDriver(){
        driver.quit();
    }
}
