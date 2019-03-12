package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class pageCartolaBeneficios {

	WebDriver driver;
    WebDriverWait wait;
    
    public pageCartolaBeneficios(WebDriver driver){
        this.driver = driver;	
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }
    
      
    public void click(WebElement webElement){
    	wait.until(ExpectedConditions.visibilityOf(webElement));
    	webElement.click();
    }
    
    
	@FindBy(xpath = "//*[@id=\"cartolaresumen\"]/div[2]/dl/dt[1]/a")
    public WebElement linkUno;
	
	@FindBy(xpath = "//*[@id=\"cartolaresumen\"]/div[2]/dl/dt[2]/a")
    public WebElement linkDetalleCartola;
	
	@FindBy(id = "nperiodo")
    public WebElement cboxPeriodo;
	
	@FindBy(id = "btnAutorizar")
    public WebElement btnGenerarCartola;
	
	@FindBy(xpath = "//*[@id=\"divLinks\"]/ul/li[1]/a")
    public WebElement linkSucursales;
	
	@FindBy(xpath = "//*[@id=\"divLinks\"]/ul/li[3]/a")
    public WebElement linkCentroAyuda;
	
	@FindBy(id = "//*[@id=\"divClose\"]/a")
    public WebElement btnCerrarSesion;
    
	@FindBy(xpath = "/html/body/table/tbody/tr/td/a/img")
	public WebElement btnVolver;
	
	@FindBy(xpath = "//*[@id=\"pagos\"]/ul/li/a/strong")
	public WebElement linkDescargarCartola;
	
	@FindBy(xpath = "//*[@id=\"cartolaresumen\"]/div[3]/table/tbody/tr[1]/td")
	public WebElement lblSeleccionarPeriodo;
	
	@FindBy(xpath = "//*[@id='icon']")
	public WebElement btnDescargarPdf;
}
