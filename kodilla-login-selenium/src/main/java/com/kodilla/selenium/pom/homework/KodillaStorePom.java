package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KodillaStorePom {
    @FindBy(css = "input[type='text']")
    WebElement searchField;

    WebDriver driver;

    public KodillaStorePom(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void search (String keyword) {
        searchField.sendKeys(keyword);
    }
}
