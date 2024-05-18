package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KodillaStorePomApplication {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/illya/code/kodilla-course/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");
        KodillaStorePom storePom = new KodillaStorePom(driver);
        storePom.search("Notebook");
        driver.close();
    }
}
