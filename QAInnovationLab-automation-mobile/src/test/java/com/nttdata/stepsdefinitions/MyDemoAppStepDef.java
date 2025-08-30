package com.nttdata.stepsdefinitions;

import com.nttdata.steps.MyDemoAppSteps;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class MyDemoAppStepDef {

    @Steps
    MyDemoAppSteps myDemo;


    @Given("estoy en la aplicación de MyDemoApp")
    public void estoyEnLaAplicaciónDeMyDemoApp() {
        // Write code here that turns the phrase above into concrete actions
       myDemo.goToApp();
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        // Write code here that turns the phrase above into concrete actions
        myDemo.cargadeProductos();
    }

    @When("agrego {int} del siguiente producto {string}")
    public void agregoUNIDADESDelSiguienteProducto(int cantidad, String producto) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
