package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    //@FindBy(id = "desktop-search-bar")
    @FindBy(xpath = "(//h2[@class='title-preview'])")
    private WebElement etiquetah1;
    @FindBy(xpath = "(//div[@class='cover-gallery open-gallery-tracking'])")
    private WebElement banner_principal;
    @FindBy(xpath = "(//p[@class='label-type-property'])")
    private WebElement depa_venta;
    @FindBy(id = "buttonPrecalificate")
    private WebElement botonPrec;
    @FindBy(xpath = "(//p[@class='label-type-property'])")
    private WebElement iconoRecama;







    private String titleHomePage = "propiedades.com";
    private String txtresultHomePage = "Showing results for \"ME-7000\"";

    public HomePage(WebDriver driver){

        super(driver);
    }

    public void banner() throws  Exception{
        this.isDisplayed(banner_principal);
    }
    public boolean homePageIsDisplayed() throws Exception {
        return this.getTitle().equals(titleHomePage);
    }
    public void etiquetaIsDisplayed() throws Exception {
        this.isDisplayed(etiquetah1);
    }
    public void ventaIsDisplayed() throws Exception {
        this.isDisplayed(depa_venta);
    }
    public void botonPrecIsDisplayed() throws Exception {
        this.isDisplayed(depa_venta);
    }
    public void recamaraIsDisplayed() throws Exception {
        this.isDisplayed(iconoRecama);
    }
    /*public void clickOnTitleComics() throws Exception {
        this.click(txt_buscar);

   }
    public void setText(String args) throws Exception {
        this.setText(txt_buscar,args);
    }

    //public void clickbtnBuscar() throws Exception {
     //   this.click(btn_buscar);
    //}
*/

    /*public boolean resultadoshomePageIsDisplayed() throws Exception {

        return this.getText(txt_resultado).equals(txtresultHomePage);
    }
    /*public String imprimirresultados() throws Exception {

        return this.getText(txt_resultado);
    }
    public void clickimagen() throws Exception {
        this.click(imgresult);
    }
    public void imagen_click() throws Exception {
        this.click(imagen);
    }

    public void cerrarModal() throws Exception{
        this.click(modal);
    }

    public void scrooll() throws Exception{
        this.scroll();
    }*/
}
