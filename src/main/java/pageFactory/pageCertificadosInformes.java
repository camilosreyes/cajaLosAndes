package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class pageCertificadosInformes {
	
	WebDriver driver;
    WebDriverWait wait;
    
    public pageCertificadosInformes(WebDriver driver){
        this.driver = driver;	
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }
    
      
    public void click(WebElement webElement){
    	wait.until(ExpectedConditions.visibilityOf(webElement));
    	webElement.click();
    }
    
    @FindBy(id = "T:oc_207982895region1:cl1")
    public WebElement linkCertificadoAsignacionFamiliar;
    
    @FindBy(id = "T:oc_207982895region1:cl2")
    public WebElement linkCertificadoAfiliacion;
    
    @FindBy(id = "T:oc_207982895region1:cl3")
    public WebElement linkCertificadoInteresesCreditoHipotecario;
    
    @FindBy(id = "T:oc_207982895region1:cl4")
    public WebElement linkCertificadoLicenciasMedicasPagadas;
    
    @FindBy(id = "T:oc_207982895region1:r3:cl1")
    public WebElement btnDescargar_1;
    
    @FindBy(id = "T:oc_207982895region1:r3:cl2")
    public WebElement btnDescargar_2;
    
    @FindBy(id = "T:oc_207982895region1:r3:cl3")
    public WebElement btnDescargar_3;
    
    @FindBy(id = "T:oc_207982895region1:r2:itCarga:0:cb1")
    public WebElement btnEmitir;
    
    @FindBy(id = "T:oc_207982895region1:r1:it1::content")
    public WebElement textIngresarAno;
    
    @FindBy(id = "T:oc_207982895region1:r1:cb1")
    public WebElement btnDescargar_4;
    
    @FindBy(id = "T:oc_207982895region1:r4:cl1")
    public WebElement btnDescargar_5;
    
    @FindBy(id = "T:oc_207982895region1:r3:diagLinkA::ok")
    public WebElement btnAceptar;
    
    @FindBy(id = "T:j_id__ctru95pc9:0:pt_gl2")
    public WebElement btnVolverHome;
    
    @FindBy(id = "T:oc_207982895region1:r2:i1:0:cb2")
    public WebElement btnEmitirAfiliacion;
    
    @FindBy(id = "T:oc_6422661271region1:cb4")
    public WebElement btnDescargarSalud;
    
    @FindBy(id = "T:oc_207982895region1:r4:pgl3")
    public WebElement btnDescargarLicencias;
    
}
