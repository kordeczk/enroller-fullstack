package com.company.enroller.e2e;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class BasicExample {
//    https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/ui/ExpectedConditions.html

    public static void main(String[] args) throws InterruptedException, IOException {
        String url = "https://ipsych.up.krakow.pl/pracownik/lista-pracownikow/";


        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get(url);
        Thread.sleep(5 * 1000);





    }


}
