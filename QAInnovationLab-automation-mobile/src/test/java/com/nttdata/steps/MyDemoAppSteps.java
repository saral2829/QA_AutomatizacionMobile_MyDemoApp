package com.nttdata.steps;

import com.nttdata.screens.MyDemoAppScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MyDemoAppSteps {
    private MyDemoAppScreen screen;

    public void setDriver(AppiumDriver<MobileElement> driver){
        this.screen = new MyDemoAppScreen(driver);
    }


    public void goToApp() {
        if(!screen.validarAppCargada()){
            throw new RuntimeException("La app no cargó correctamente");
        }
    }


    public void cargadeProductos() {
        // Solo valida que la lista de productos esté visible
        if(screen.productos.isEmpty()){
            throw new RuntimeException("No se cargaron productos");
        }
    }


    public void agregarProducto(String producto, int cantidad){
        screen.agregarProducto(producto, cantidad);
    }


    public void validarCarrito(){
        if(!screen.validarCarrito()){
            throw new RuntimeException("El carrito no se actualizó correctamente");
        }
    }
}
