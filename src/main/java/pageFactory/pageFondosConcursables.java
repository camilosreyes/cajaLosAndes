package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class pageFondosConcursables {

	WebDriver driver;
    WebDriverWait wait;
    
    public pageFondosConcursables(WebDriver driver){
        this.driver = driver;	
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }
    
      
    public void click(WebElement webElement){
    	wait.until(ExpectedConditions.visibilityOf(webElement));
    	webElement.click();
    }
    
    
    //Postulación
    @FindBy(xpath = "//*[@id=\"fondos-concursables\"]/div[1]/a[1]/span")
    public WebElement linkPostulacion;
    
    
    //Estado Postulación
    @FindBy(xpath = "//*[@id=\"fondos-concursables\"]/div[1]/a[2]/span")
    public WebElement linkEstadoPostulación;
    
    @FindBy(xpath = "//*[@id=\"fondos-concursables\"]/div[2]/p[2]/a")
    public WebElement linkIngresarPostulación;    
    
    
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
