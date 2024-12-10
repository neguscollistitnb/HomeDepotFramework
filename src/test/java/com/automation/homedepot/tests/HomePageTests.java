package com.automation.homedepot.tests;

import com.automation.homedepot.pages.CategoryPage;
import com.automation.homedepot.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Locale;

public class HomePageTests extends BaseTest{

    HomePage homePage;
    CategoryPage categoryPage;

    @Test
    public void categoryLinkTest() throws InterruptedException {
        homePage = new HomePage(driver);
        categoryPage = new CategoryPage(driver);

        String[] exceptedTitles = {"HOLIDAY DECORATIONS", "SAVINGS CENTER", "Appliances"};

        for(int i = 0; i <= 2; i++){
            homePage.clickShopHolidayDecorationsLink(i);

            Assert.assertTrue(categoryPage.isTitleDisplayed(), "No title found");
            Assert.assertEquals(categoryPage.getTitle().toUpperCase(Locale.ROOT), exceptedTitles[i].toUpperCase(Locale.ROOT),
                    "Title does not say Holiday Decorations");

            driver.navigate().back();
            Thread.sleep(5000);
        }


    }



}
