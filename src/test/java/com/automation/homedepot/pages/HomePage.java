package com.automation.homedepot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickShopHolidayDecorationsLink(int category){
        By shopHolidayDecorationsBy = By.xpath("//div[@data-testid='category " + category + "']");
        WebElement shopHolidayDecorations = driver.findElement(shopHolidayDecorationsBy);

        shopHolidayDecorations.click();
    }






}
