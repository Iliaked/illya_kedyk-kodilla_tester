package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//zmieniłem na Ebay

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.pl/");

        WebElement inputField = driver.findElement(By.xpath("//*[@name='_sacat']"));
        inputField.sendKeys("Wszystko inne");
        inputField = driver.findElement(By.xpath("//input[@class=\"gh-tb ui-autocomplete-input\"]"));
        inputField.sendKeys("Mavic mini");

        WebElement searchField = driver.findElement(By.xpath("//input[@class=\"btn btn-prim gh-spr\"]"));
        searchField.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}