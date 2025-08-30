package com.nttdata.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

public class MyDemoAppScreen {
    private AppiumDriver<MobileElement> driver;

    public MyDemoAppScreen(AppiumDriver<MobileElement> driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='App logo and name']")
    private MobileElement logoInicio;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@content-desc='Displays all products of catalog']/android.view.ViewGroup")
    public List<MobileElement> productos;

    // Método para validar que la app cargó
    public boolean validarAppCargada() {
        return logoInicio.isDisplayed();
    }

    // Método para agregar producto dinámicamente
    public void agregarProducto(String producto, int cantidad) {
        String xpath = "//android.widget.ImageView[@content-desc='" + producto + "']";
        MobileElement item = driver.findElementByXPath(xpath);
        item.click();

        driver.navigate().back();
    }


    public boolean validarCarrito() {

        return true;
    }
}
