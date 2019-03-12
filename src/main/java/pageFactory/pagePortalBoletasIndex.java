package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class pagePortalBoletasIndex {

	WebDriver driver;
    WebDriverWait wait;
    
    public pagePortalBoletasIndex(WebDriver driver){
        this.driver = driver;	
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }
    
      
    public void click(WebElement webElement){
    	wait.until(ExpectedConditions.visibilityOf(webElement));
    	webElement.click();
    }
    
    @FindBy(id = "folio")
    public WebElement textFolio;
    
    @FindBy(id = "rutReceptor")
    public WebElement textRut;
    
    @FindBy(id = "fechaEmision")
    public WebElement textFechaEmision;
    
    @FindBy(xpath = "//*[@id=\"fechaEmision\"]")
    public WebElement textMonto;
    
    @FindBy(id = "tipo")
    public WebElement cboxTipoDocumento;
   
    @FindBy(id = "defaultReal")
    public WebElement textCapchat;
    
    @FindBy(id = "botonCrear")
    public WebElement btnConsultar;
    
}
