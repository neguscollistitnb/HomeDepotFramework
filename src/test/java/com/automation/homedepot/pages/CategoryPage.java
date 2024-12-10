package com.automation.homedepot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoryPage {
    WebDriver driver;

    public CategoryPage(WebDriver driver){
        this.driver = driver;
    }


    public boolean isTitleDisplayed(){
        By titleby = By.xpath("//h1[@data-contentful-field-id='title']");
        WebElement title = driver.findElement(titleby);

        return title.isDisplayed();
    }

    public String getTitle(){
        By titleby = By.xpath("//h1[@data-contentful-field-id='title']");
        WebElement title = driver.findElement(titleby);

        return title.getText();
    }
}
