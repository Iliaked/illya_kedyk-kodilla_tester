package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.By.className;


public class AllegroTestingAppCss {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.pl/");

        WebElement inputField = driver.findElement(By.id("gh-cat"));
        inputField.sendKeys("Wszystko inne");
        inputField = driver.findElement(By.id("gh-ac"));
        inputField.sendKeys("Mavic mini");

        WebElement searchField = driver.findElement(By.xpath("//input[@class=\"btn btn-prim gh-spr\"]"));
        searchField.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("srp-river-results")));

        List<WebElement> elements = driver.findElements(By.className("s-item__title"));
        System.out.println("Number of elements found: " + elements.size());

        if (elements.size() > 0) {
            String text = elements.get(1).getText(); //element 0 jest pusty, dlatego zaczynam od 1
            System.out.println("First element text: " + text);
        } else {
            System.out.println("No elements found with class 's-item__title'");
        }
    }
}
