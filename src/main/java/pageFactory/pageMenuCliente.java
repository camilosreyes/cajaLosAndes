package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageMenuCliente {
	WebDriver driver;
    WebDriverWait wait;
    
    public pageMenuCliente(WebDriver driver){
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
    public WebElement linkSucursales;
    
    @FindBy(id = "T:pt_gSucursal")
    public WebElement linkCentroAyuda;
    
    @FindBy(id = "T:pt_cl9")
    public WebElement cerrarSesion;
    
    @FindBy(id = "T:pt_gSucursal")
    public WebElement imgLogo1;
    
    @FindBy(id = "T:pt_i1")
    public WebElement imgLogo2;
    
    
    
    //Body
    //Menu Cliente
    
    @FindBy(id = "T:pt_r2:pt_i2")
    public WebElement linkFotoCliente;
    
    @FindBy(xpath = "//*[@id=\"T:pt_r2:gl40\"]/span[1]")
    public WebElement linkNombreCliente;
    
    @FindBy(xpath = "//*[@id=\"T:pt_r2:gl40\"]/span[2]")
    public WebElement linkApellidoCliente;

    @FindBy(id = "T:pt_r2:gl3")
    public WebElement linkCambioClave;
    
    @FindBy(id = "T:pt_r2:gl1")
    public WebElement linkMisDatos;
    
    @FindBy(id = "T:itNav1:2:j_id__ctru82pc6")
    public WebElement linkCotizaCredito;
    
    @FindBy(id = "T:itNav1:3:pt_cl1")
    public WebElement linkMisCreditos;

    @FindBy(id = "T:itNav1:3:itNav2:0:j_id__ctru75pc6")
    public WebElement linkCreditoHipotecario;

    @FindBy(id = "T:itNav1:3:itNav2:1:j_id__ctru75pc6")
    public WebElement linkCreditoEmergencia;
    
    @FindBy(id = "T:itNav1:3:itNav2:2:j_id__ctru74pc6")
    public WebElement linkDetalleCredito;
    
    @FindBy(id = "T:itNav1:4:j_id__ctru86pc6")
    public WebElement linkPagoExceso;

    @FindBy(id = "T:itNav1:5:j_id__ctru86pc6")
    public WebElement linkLicenciasMedicas;

    @FindBy(id = "T:itNav1:6:j_id__ctru82pc6")
    public WebElement linkCertificadosInformes;
    
    @FindBy(id = "T:itNav1:8:j_id__ctru82pc6")
    public WebElement linkTecla;
    
    @FindBy(id = "T:itNav1:9:j_id__ctru82pc6")
    public WebElement linkSeguros;

    @FindBy(id = "T:itNav1:10:j_id__ctru82pc6")
    public WebElement linkProgramaAhorro;

    @FindBy(id = "T:itNav1:11:j_id__ctru82pc6")
    public WebElement linkBienestar;
    
    @FindBy(id = "T:itNav1:12:j_id__ctru82pc6")
    public WebElement linkPrestacionesComplementarias;
    
    @FindBy(id = "T:itNav1:13:j_id__ctru82pc6")
    public WebElement linkFondosConcursables;

    @FindBy(id = "T:itNav1:16:pt_ot100")
    public WebElement linkAporteFamiliarPermanente;

    @FindBy(id = "T:itNav1:17:pt_ot100")
    public WebElement linkCajaEscolar;
    
    @FindBy(id = "T:itNav1:18:pt_ot100")
    public WebElement linkCartolaBeneficios;
    
    @FindBy(id = "T:itNav1:17:j_id__ctru82pc6")
    public WebElement linkDespegar;

    //Contenido Sitio Web
    //Barra Menu
    @FindBy(xpath = "//*[@id=\"T:oc_2139341831region1:pPanelOk\"]/div/div/ul[1]/li[1]/a/img")
    public WebElement btnMisCreditos;
    
    @FindBy(xpath = "//*[@id=\"T:oc_2139341831region1:pPanelOk\"]/div/div/ul[1]/li[2]/a/img")
    public WebElement btnSimulaCredito;
    
    @FindBy(xpath = "//*[@id=\"T:oc_2139341831region1:pPanelOk\"]/div/div/ul[1]/li[3]/a/img")
    public WebElement btnSeguros;
    
    @FindBy(xpath = "//*[@id=\"T:oc_2139341831region1:pPanelOk\"]/div/div/ul[1]/li[4]/a/img")
    public WebElement btnMisCertificados;
    
    @FindBy(xpath = "//*[@id=\"T:oc_2139341831region1:gil1::icon\"]")
    public WebElement btnCartolaBeneficios;
    
    //Información
    @FindBy(xpath = "//*[@id=\"T:oc_8759322755region1:pPanelOk\"]/div[1]/div[1]/div[1]/a/img")
    public WebElement imgCreditoFacil;
    
    @FindBy(xpath = "//*[@id=\"T:oc_8759322755region1:pPanelOk\"]/div[1]/div[1]/div[2]/div[3]/a/span")
    public WebElement btnSolicitaloAqui;
    
    @FindBy(xpath = "//*[@id=\"T:oc_8759322755region1:pPanelOk\"]/div[1]/div[3]/div[1]/a/img")
    public WebElement imgTurismoFacil;
    
    @FindBy(xpath = "//*[@id=\"T:e2565797510::div2\"]/div/div/div[2]/div[2]/a")
    public WebElement btnQuieroIr;
    
    
     
        
    
    //Footer
    //Siguenos
    @FindBy(id = "T:oc_9872696877region1:itNavFt3NavLog:1:pt_pgl4NavLog")
    public WebElement linkFacebook;
    
    @FindBy(id = "T:oc_9872696877region1:itNavFt3NavLog:0:pt_pgl4NavLog")
    public WebElement linkTwitter;
    
    @FindBy(id = "T:oc_9872696877region1:itNavFt3NavLog:1:pt_pgl4NavLog")
    public WebElement linkYouTube;
    
    @FindBy(id = "T:oc_9872696877region1:itNavFt3NavLog:0:pt_pgl4NavLog")
    public WebElement linkLinkedIn;
    
    @FindBy(id = "T:oc_9872696877region1:itNavFt3NavLog:1:pt_pgl4NavLog")
    public WebElement linkInstagram;
    
    //Necesitas Ayuda
    @FindBy(id = "T:oc_9872696877region1:itNavFt3NavLog:0:pt_pgl4NavLog")
    public WebElement linkSucursales2;
    
    @FindBy(id = "T:oc_9872696877region1:itNavFt3NavLog:1:pt_pgl4NavLog")
    public WebElement linkContactanos2;
    
    //Beneficios
    @FindBy(id = "T:oc_9872696877region1:itNavFt3NavLog:0:pt_pgl4NavLog")
    public WebElement linkTurismoRecreacion;
    
    @FindBy(id = "T:oc_9872696877region1:itNavFt3NavLog:1:pt_pgl4NavLog")
    public WebElement linkConvenios;
    
    @FindBy(id = "T:oc_9872696877region1:itNavFt3NavLog:0:pt_pgl4NavLog")
    public WebElement linkSalud;
    
    @FindBy(id = "T:oc_9872696877region1:itNavFt3NavLog:1:pt_pgl4NavLog")
    public WebElement linkEducacionFinanciera;
    
    
    
}

