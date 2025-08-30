package com.nttdata.steps;
import java.util.List;
import com.nttdata.screens.MyDemoAppScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyDemoAppSteps {

    private MyDemoAppScreen screen;

    private AppiumDriver<MobileElement> driver;



    public MyDemoAppSteps() {
    }


    public void setDriver(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        this.screen = new MyDemoAppScreen(driver);
    }


    public void goToApp() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(screen.getLogoInicio()));

        if (!screen.getLogoInicio().isDisplayed()) {
            throw new RuntimeException("No se pudo cargar la pantalla principal de MyDemoApp");
        }

        System.out.println("La aplicación se abrió correctamente");
    }

    public void cargadeProductos() {

    }
}
