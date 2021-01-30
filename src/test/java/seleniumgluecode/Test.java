package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test extends TestBase{

    @Given("^El usuario se encuentra en la pagina de propiedades$")
    public void el_usuario_se_encuentra_en_la_pagina_de_propiedades() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String titulo = "CommScope.com";
        //System.out.println(driver.getTitle());
        //Assert.assertEquals(titulo,driver.getTitle());
        //Assert.assertTrue(homePage.homePageIsDisplayed());
        homePage.banner();


    }

    @When("^Validar que tenga un banner principal$")
    public void validar_que_tenga_un_banner_principal() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePage.banner();
    }

    @When("^validar que tenga la leyenda Detalle de$")
    public void validar_que_tenga_la_leyenda_Detalle_de() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePage.etiquetaIsDisplayed();
    }
    @When("^validar que tenga la leyenda Departamento en Venta$")
    public void validar_que_tenga_la_leyenda_Departamento_en_venta() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePage.ventaIsDisplayed();
    }
    @When("^validar que tenga el botón de precalificate$")
    public void validar_que_tenga_el_boton_precalificate() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePage.botonPrecIsDisplayed();
    }

    @When("^Validar que tenga el icono de recamara$")
    public void validar_que_tenga_el_icono_recamara() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePage.recamaraIsDisplayed();
    }




    /*@When("^click en la imagen del producto y cierre el visor de imágenes$")
    public void click_en_la_imagen_del_producto_y_cierre_el_visor_de_imágenes() throws Throwable {
        // Write code here that turns the phrase above into concrete action
        homePage.scrooll();
        homePage.clickimagen();
        homePage.imagen_click();
        // cerrar el modal de la imagen
        homePage.cerrarModal();

        /*WebElement pageTitle = driver.findElement(By.xpath("(//h3[@class='search-hero-showing-results-text search-query'])"));
        Assert.assertTrue("Showing results for \"ME-7000\"",pageTitle.isDisplayed());
        Assert.assertEquals("Showing results for \"ME-7000\"",pageTitle.getText());*/
    //}*/

}
