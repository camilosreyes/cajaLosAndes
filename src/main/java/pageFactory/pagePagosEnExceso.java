package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class pagePagosEnExceso {

	WebDriver driver;
    WebDriverWait wait;
    
    public pagePagosEnExceso(WebDriver driver){
        this.driver = driver;	
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }
    
      
    public void click(WebElement webElement){
    	wait.until(ExpectedConditions.visibilityOf(webElement));
    	webElement.click();
    }
    
    //Devolucion de Excesos
    @FindBy(xpath = "//*[@id=\"licencias-medicas\"]/div[1]/a[1]")
    public WebElement linkDevolucionExcesos;
    
    @FindBy(xpath = "//*[@id=\"licencias-medicas\"]/div[2]/div[2]/dl/dt[1]/a")
    public WebElement linkLink_1;
    
    @FindBy(xpath = "//*[@id=\"licencias-medicas\"]/div[2]/div[2]/dl/dt[2]/a")
    public WebElement linkLink_2;
    
    @FindBy(id = "btn-solicitar-pago")
    public WebElement btnSolicitudPagoTransferencia;
    
    //Solicitud de pago por Transferencia
    @FindBy(xpath = "//*[@id=\"licencias-medicas\"]/div[1]/a[2]/span")
    public WebElement linkSolicitudPagoTransferencia;
        
    @FindBy(id = "c-ctl-banco")
    public WebElement cboxBanco;
    
    @FindBy(id = "c-ctl-tipo-cta")
    public WebElement cboxTipoCuenta;
    
    @FindBy(id = "c-ctl-numcta")
    public WebElement textNumeroCuenta;
    
    @FindBy(id = "btn-confirmar")
    public WebElement btnConfirmar;
    
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
