package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class pageCajaEscolar {

	WebDriver driver;
    WebDriverWait wait;
    
    public pageCajaEscolar(WebDriver driver){
        this.driver = driver;	
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }
    
      
    public void click(WebElement webElement){
    	wait.until(ExpectedConditions.visibilityOf(webElement));
    	webElement.click();
    }
    
	@FindBy(xpath = "//*[@id=\"divContent\"]/table/tbody/tr[3]/td/div/div/a")
    public WebElement linkCajaEscolar;
	
	
	//Varios
	@FindBy(xpath = "//*[@id=\"divLinks\"]/ul/li[1]/a")
    public WebElement linkSucursales;
	
	@FindBy(xpath = "//*[@id=\"divLinks\"]/ul/li[3]/a")
    public WebElement linkCentroAyuda;
	
	@FindBy(xpath = "//*[@id=\"divClose\"]/a")
    public WebElement btnCerrarSesion;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/a/img")
	public WebElement btnVolver;
	
	@FindBy(xpath = "//*[@id=\"divLbCen_SinCajaEscolar\"]/div[2]/div/div[1]/div[2]")
	public WebElement btnCerrarMensaje;
	
	
}
