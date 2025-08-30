package com.nttdata.screens;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

public class MyDemoAppScreen {


    @AndroidFindBy (xpath = "//android.widget.ImageView[@content-desc=\"App logo and name\"]")
    private WebElement logoInicio;
    @AndroidFindBy (xpath = "//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Displays all products of catalog\"]/android.view.ViewGroup")
   List<WebElement> productos;

    public MyDemoAppScreen(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    public WebElement getLogoInicio() {
        return logoInicio;
    }

    public List<WebElement> getProductos() {
        return productos;
    }
}
