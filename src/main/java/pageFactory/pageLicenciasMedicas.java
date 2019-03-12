package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class pageLicenciasMedicas {

	WebDriver driver;
    WebDriverWait wait;
    
    public pageLicenciasMedicas(WebDriver driver){
        this.driver = driver;	
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }
    
      
    public void click(WebElement webElement){
    	wait.until(ExpectedConditions.visibilityOf(webElement));
    	webElement.click();
    }
    
    //Licencias Medicas
    //Estado de Licencias Medicas
    @FindBy(xpath = "//*[@id=\"licencias-medicas\"]/div[1]/a[1]/span")
    public WebElement linkEstadoLicenciasMedicas;
	
	@FindBy(xpath = "//*[@id=\"licencias-medicas\"]/div[2]/div[2]/dl/dt[1]/a")
    public WebElement linkPlazos;
	
	@FindBy(xpath = "//*[@id=\"licencias-medicas\"]/div[2]/div[2]/dl/dt[2]/a")
    public WebElement linkPagos;
	
	@FindBy(xpath = "//*[@id=\"licencias-medicas\"]/div[2]/div[2]/dl/dt[3]/a")
    public WebElement linkApelacion;
	
    
    //Certificado de Licencias Pagadas
	@FindBy(xpath = "//*[@id=\"licencias-medicas\"]/div[1]/a[2]/span")
    public WebElement linkCertificadoLicenciasPagadas;	
	
    
    //Pago por Transferencia
	@FindBy(xpath = "//*[@id=\"licencias-medicas\"]/div[1]/a[3]/span")
    public WebElement linkPagoPorTransferencia;
    
	@FindBy(id = "email")
    public WebElement textMail;
    
	@FindBy(id = "codigoarea")
    public WebElement textCodigoTelefono;
    
	@FindBy(id = "telefono")
    public WebElement textTelefonoParticular;
    
	@FindBy(id = "celuint")
    public WebElement textCelular;
    
	@FindBy(id = "modificar")
    public WebElement linkModificar;
    
	@FindBy(id = "nlicencia")
    public WebElement cboxNumeroLicencia;
    
	@FindBy(id = "finicioident")
    public WebElement textFechaInicio;
    
	@FindBy(id = "fterminoident")
    public WebElement textFechaTermino;
    
	@FindBy(id = "nbancoint")
    public WebElement cboxBanco;
    
	@FindBy(id = "ntipocuentaint")
    public WebElement cboxTipoCuenta;
    
	@FindBy(id = "ncuentaident")
    public WebElement textNumeroCuenta;
    
	@FindBy(id = "condicioneschek")
    public WebElement checkAutorizar;
	
	@FindBy(id = "btnAutorizar")
	public WebElement btnAutorizar;
    	
        
	//Varios
	@FindBy(xpath = "//*[@id=\"divLinks\"]/ul/li[1]/a")
    public WebElement linkSucursales;
	
	@FindBy(xpath = "//*[@id=\"divLinks\"]/ul/li[3]/a")
    public WebElement linkCentroAyuda;
	
	@FindBy(xpath = "//*[@id=\"divClose\"]/a")
    public WebElement btnCerrarSesion;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/a/img")
	public WebElement btnVolver;
	
	
}
