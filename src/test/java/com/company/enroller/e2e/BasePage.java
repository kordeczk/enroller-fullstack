package com.company.enroller.e2e;

import com.company.enroller.App;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;
    int timeoutSec = 5;

    public BasePage(WebDriver driver) {
        this.setupWebDriver(driver, this.timeoutSec);
    }

    public BasePage(WebDriver driver, int timeoutSec) {
        this.setupWebDriver(driver, timeoutSec);
    }

    private void setupWebDriver(WebDriver driver, int timeoutSec) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(timeoutSec));
        PageFactory.initElements(this.driver, this);
    }

    public void get(String url) {
        this.driver.get(url);
    }

    public void click(WebElement element) {
        this.wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void quit() {
        if (driver != null) {
            driver.quit();
        }
    }

    public Boolean elementIsPresent(WebElement element) {
        //TODO
        return true;
    }

    public String getElementText(WebElement element) {
        return "";
    }

    public void sleep(Integer seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public WebElement getMeetingByTitle(String meetingName) {
//        TODO
        return null;
    }

    public List<String> getParticipantsListForMeeting(String meetingName) {
        String participantsItemSel = "td li";
        WebElement meeting = this.getMeetingByTitle(meetingName);
        return Optional.ofNullable(meeting)
                .map(m -> m.findElements(By.cssSelector(participantsItemSel))
                        .stream()
                        .map(WebElement::getText)
                        .toList())
                .orElse(List.of());
    }

}
