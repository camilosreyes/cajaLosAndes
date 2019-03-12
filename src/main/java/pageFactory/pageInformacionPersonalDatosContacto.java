package pageFactory;

import java.util.List;

import javax.swing.plaf.synth.Region;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageInformacionPersonalDatosContacto {

	WebDriver driver;
    WebDriverWait wait;
    
    public pageInformacionPersonalDatosContacto(WebDriver driver){
        this.driver = driver;	
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }
    
    public void click(WebElement webElement){
    	wait.until(ExpectedConditions.visibilityOf(webElement));
    	webElement.click();
    }
    
    @FindBy(id = "T:oc_3825969974region1:cl1")
    public WebElement btnDatosContacto;
    
    @FindBy(id = "T:oc_3825969974region1:r1:cb1")
    public WebElement btnActualizarDatos;
    
    @FindBy(id = "T:oc_3825969974region1:r1:ot10::content")
    public WebElement textDireccion;
    
    @FindBy(id = "T:oc_3825969974region1:r1:regionPersona::content")
    public WebElement cboxRegion;
    
    @FindBy(id = "T:oc_3825969974region1:r1:ciudadPersona::content")
    public WebElement cboxCiudad;
    
    @FindBy(id = "T:oc_3825969974region1:r1:comunaPersona::content")
    public WebElement cboxComuna;
    
    @FindBy(id = "T:oc_3825969974region1:r1:codTelefono::content")
    public WebElement cboxCodigoTelefono;
    
    @FindBy(id = "T:oc_3825969974region1:r1:ot14::content")
    public WebElement textTelefonoFijo;
    
    @FindBy(id = "T:oc_3825969974region1:r1:ot15::content")
    public WebElement textTelefonoMovil;
    
    @FindBy(id = "T:oc_3825969974region1:r1:email::content")
    public WebElement textEmail;
    
    @FindBy(id = "T:oc_3825969974region1:r1:it3::content")
    public WebElement textConfirmarEmail;
    
    @FindBy(id = "T:oc_3825969974region1:r1:cb2")
    public WebElement btnGuardarCambios;
    
    @FindBy(id = "T:oc_3825969974region1:r1:it1::content")
    public WebElement textTelefonoEmpresa;
    
    @FindBy(id = "T:oc_3825969974region1:r1:soc6::content")
    public WebElement cboxCodigoTelefonoEmpresa;
    
    @FindBy(id = "T:oc_3825969974region1:r1:cb4")
    public WebElement btnConfirmarCambios;
    
    @FindBy(id = "T:oc_3825969974region1:r1:cb5")
    public WebElement btnAceptarCambios;
    
    @FindBy(xpath = "//*[@id=\"T:oc_3825969974region1:r1:pgl4\"]/span[1]")
    public WebElement labelInformacionComercial;
    
    
}
