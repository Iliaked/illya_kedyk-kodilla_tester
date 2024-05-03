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


//nie mogę sprawdzić czy aplikacja działa - allegro wykrywa że to jest bot i mnie blokuje

public class AllegroTestingAppCss {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement inputField = driver.findElement(By.className("string"));
        inputField.sendKeys("Mavic mini");
        inputField = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[1]/div/div/div/form/div[3]/div/select"));
        inputField.sendKeys("Elektronika");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("string")));

        WebElement element = driver.findElement(className("#opbox-listing"));
        List<WebElement> elements = driver.findElements(className("#opbox-listing"));
        elements.get(0).getText();

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
