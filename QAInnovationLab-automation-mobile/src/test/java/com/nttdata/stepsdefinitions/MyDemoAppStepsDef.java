import com.nttdata.steps.MyDemoAppSteps;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class MyDemoAppStepsDef {
    @Steps
    MyDemoAppSteps myDemo;

    @Managed(driver="appium")
    AppiumDriver<MobileElement> driver;

    @io.cucumber.java.en.Given("^estoy en la aplicación de MyDemoApp$")
    public void estoyEnLaAplicaciónDeMyDemoApp() {
        // Write code here that turns the phrase above into concrete actions
        myDemo.setDriver(driver);
        myDemo.goToApp();
    }

    @io.cucumber.java.en.And("^valido que carguen correctamente los productos en la galeria$")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        // Write code here that turns the phrase above into concrete actions
        myDemo.cargadeProductos();
    }

    @io.cucumber.java.en.When("agrego {int} del siguiente producto {String}")
    public void agregoUNIDADESDelSiguienteProducto(int cantidad, String producto) {
        // Write code here that turns the phrase above into concrete actions
        myDemo.agregarProducto(producto, cantidad);
    }

    @io.cucumber.java.en.Then("^valido el carrito de compra actualice correctamente$")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
        // Write code here that turns the phrase above into concrete actions
        myDemo.validarCarrito();
    }
}
