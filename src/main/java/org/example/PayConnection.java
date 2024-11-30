package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PayConnection extends Website {
    String phoneNumber;
    String amount;
    public By frame = By.xpath("/html/body/div[8]/div/iframe");
    public By headingAmount = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[1]/span[1]");
    public By button = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/button");
    public By headingPhoneNumber = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[2]/span");
    public By labelCardNumber = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[1]/label");
    public By labelValidityPeriod = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[1]/app-input/div/div/div[1]/label");
    public By labelCVC = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[3]/app-input/div/div/div[1]/label");
    public By labelNameHolder = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[3]/app-input/div/div/div[1]/label");
    public By logoVisa = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[1]");
    public By logoMasterCard = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[2]");
    public By logoBelcart = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[3]");
    public By logoMaestro = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/div/img[1]");
    public By logoMir = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/div/img[2]");


    public PayConnection(WebDriver driver, String phoneNumber, String amount) {
        super(driver);
        this.phoneNumber = phoneNumber;
        this.amount = amount;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        OnlineReplenishmentBlock onlineReplenishmentBlock = new OnlineReplenishmentBlock(driver);
        onlineReplenishmentBlock.choosingPaymentOption(onlineReplenishmentBlock.communicationServices);
        onlineReplenishmentBlock.fillingInField(onlineReplenishmentBlock.phoneNumberField,phoneNumber);
        onlineReplenishmentBlock.fillingInField(onlineReplenishmentBlock.amountCommunicationServicesField, amount);
        onlineReplenishmentBlock.click(onlineReplenishmentBlock.buttonPayConnection);
        driver.switchTo().frame(webElement(frame));
        wait.until(ExpectedConditions.visibilityOfElementLocated(headingAmount));
    }
}