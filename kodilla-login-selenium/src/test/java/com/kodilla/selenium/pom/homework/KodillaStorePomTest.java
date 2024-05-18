package com.kodilla.selenium.pom.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class KodillaStorePomTest {

    KodillaStorePom storePom;
    WebDriver driver;

    @BeforeEach
    public void setup() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");
        storePom = new KodillaStorePom(driver);
    }

    @Test
    public void searchNotebook() {
        String keyword = "notebook";
        storePom.search(keyword);
        List<WebElement> elements = driver.findElements(By.className("element"));
        int expected = 2;
        Assertions.assertEquals(expected, elements.size());
    }

    @Test
    public void searchNotebookInUpperCase() {
        String keyword = "NOTEBOOK";
        storePom.search(keyword);
        List<WebElement> elements = driver.findElements(By.className("element"));
        int expected = 2;
        Assertions.assertEquals(expected, elements.size());
    }

    @Test
    public void searchSchool() {
        String keyword = "school";
        storePom.search(keyword);
        List<WebElement> elements = driver.findElements(By.className("element"));
        int expected = 1;
        Assertions.assertEquals(expected, elements.size());
    }

    @Test
    public void searchBrand() {
        String keyword = "brand";
        storePom.search(keyword);
        List<WebElement> elements = driver.findElements(By.className("element"));
        int expected = 1;
        Assertions.assertEquals(expected, elements.size());
    }

    @Test
    public void searchBusiness() {
        String keyword = "business";
        storePom.search(keyword);
        List<WebElement> elements = driver.findElements(By.className("element"));
        int expected = 0;
        Assertions.assertEquals(expected, elements.size());
    }

    @Test
    public void searchGaming() {
        String keyword = "gaming";
        storePom.search(keyword);
        List<WebElement> elements = driver.findElements(By.className("element"));
        int expected = 1;
        Assertions.assertEquals(expected, elements.size());
    }

    @Test
    public void searchPowerful() {
        String keyword = "powerful";
        storePom.search(keyword);
        List<WebElement> elements = driver.findElements(By.className("element"));
        int expected = 0;
        Assertions.assertEquals(expected, elements.size());
    }


    @AfterEach
    public void testDown() {
        driver.close();
    }
}
