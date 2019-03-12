package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageIndex {

	WebDriver driver;
    WebDriverWait wait;
    
    public pageIndex(WebDriver driver){
        this.driver = driver;	
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }
    
      
    public void click(WebElement webElement){
    	wait.until(ExpectedConditions.visibilityOf(webElement));
    	webElement.click();
    }
    
    
    //Elementos
    //Header
    
    @FindBy(id = "T:pt_i1")
    public WebElement imgLogo1;
    
    @FindBy(id = "T:pt_gSucursal")
    public WebElement imgLogo2;
    
    
    //Body
    //Ingreso Clientes
    @FindBy(id = "T:oc_9872696877region1:itRut::content")
    public WebElement textRut;

    @FindBy(id = "T:oc_9872696877region1:itDV::content")
    public WebElement textDv;
    
    @FindBy(id = "T:oc_9872696877region1:it2::content")
    public WebElement textPass;
    
    @FindBy(id = "T:oc_9872696877region1:submitLoginiServlet")
    public WebElement btnIngresar;
    
    @FindBy(id = "T:oc_9872696877region1:olvidaste")
    public WebElement linkRecuperarContrasena;


    //Contenido Sitio Web
    
    
    
    //Registrate
    
    
    
    //Footer
    @FindBy(id = "T:oc_9872696877region1:itNavFt3NavLog:0:pt_pgl4NavLog")
    public WebElement linkSucursales;
    
    @FindBy(id = "T:oc_9872696877region1:itNavFt3NavLog:1:pt_pgl4NavLog")
    public WebElement linkContactanos;
    
    
    
}
