package ui.Tests;

import org.testng.annotations.Test;
import ui.Pages.MapsSearchPage;

public class GoogleMapsSearchTest extends BaseTest{

    MapsSearchPage mapsSearchPage;


    @Test
    public void titlePage () {
        mapsSearchPage = new MapsSearchPage(driver);
        mapsSearchPage.navigateTo();
        mapsSearchPage.validateTitle();
    }


}
