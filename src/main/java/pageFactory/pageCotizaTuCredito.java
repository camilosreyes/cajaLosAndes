package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageCotizaTuCredito {

	WebDriver driver;
    WebDriverWait wait;
    
    public pageCotizaTuCredito(WebDriver driver){
        this.driver = driver;	
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }
    
      
    public void click(WebElement webElement){
    	wait.until(ExpectedConditions.visibilityOf(webElement));
    	webElement.click();
    }
    
    
    //Elementos
    
    @FindBy(id = "T:j_id__ctru95pc11:0:pt_gl2")
    public WebElement linkHome;
    
    @FindBy(id = "T:__oc_p_1281898026::disAcr")
    public WebElement linkSimulaCotiza;
    
    @FindBy(id = "T:__oc_p_2727652277::disAcr")
    public WebElement linkCaracteristicasRequisitos;
    
    @FindBy(id = "T:__oc_p_2290182787::disAcr")
    public WebElement linkDocumentos;
    
    
    
    //Menu Simula y Cotiza
    
    //Afiliado    
    @FindBy(id = "T:oc_361127513region1:r1:r4:id1::content")
    public WebElement FechaIngresoEmpresa;
    
    @FindBy(id = "T:oc_361127513region1:r1:r4:imgInfo2")
    public WebElement btnAyudaFechaIngreso;

    @FindBy(id = "T:oc_361127513region1:r1:r4:sor1:_0")
    public WebElement rBtnIndefinido;

    @FindBy(id = "T:oc_361127513region1:r1:r4:sor1:_1")
    public WebElement rBtnPlazoFijo;

    @FindBy(id = "T:oc_361127513region1:r1:r4:id2::content")
    public WebElement textTerminoContrato;
    
    @FindBy(id = "T:oc_361127513region1:r1:r4:it3::content")
    public WebElement textTelefonoContacto;

    @FindBy(id = "T:oc_361127513region1:r1:r4:it1::content")
    public WebElement textMailContacto;

    
    //Ingreso Renta
    @FindBy(id = "T:oc_361127513region1:r1:r4:rentUltimo::content")
    public WebElement textUltimaRenta;

    @FindBy(id = "T:oc_361127513region1:r1:r4:rentPen::content")
    public WebElement textPenultimaRenta;

    @FindBy(id = "T:oc_361127513region1:r1:r4:rentAnteP::content")
    public WebElement textAntePenultimaRenta;

    
    //Condiciones del Crédito
    @FindBy(id = "T:oc_361127513region1:r1:r4:it2::content")
    public WebElement textMontoSolicitar;

    @FindBy(id = "T:oc_361127513region1:r1:r4:soc5::content")
    public WebElement comboCuotas;

    @FindBy(id = "T:oc_361127513region1:r1:r4:soc6::content")
    public WebElement comboMesesGracia;
    
    @FindBy(id = "T:oc_361127513region1:r1:r4:imgInfo4")
    public WebElement btnAyudaMesesGracia;

    @FindBy(id = "T:oc_361127513region1:r1:r4:sbc1::content")
    public WebElement cboxSeguroCensatia;
    
    @FindBy(id = "T:oc_361127513region1:r1:r4:imgInfo5")
    public WebElement btnAyudaSeguroCesantia;

    @FindBy(id = "T:oc_361127513region1:r1:r4:cleanSoc")
    public WebElement linkLimpiar;
    
    @FindBy(id = "T:oc_361127513region1:r1:r4:cb1")
    public WebElement btnEvaluar;
    
    
    //Caracteristicas y Requisitos
    @FindBy(xpath = "//*[@id=\"T:e6008300702::content\"]/div[3]/div/a")
    public WebElement btnSolicitaCredito;
    
    @FindBy(xpath = "//*[@id=\"T:e6008300702::content\"]/div[4]/ul/li[3]/a")
    public WebElement linkSeguroDegravamen;
    
    @FindBy(xpath = "//*[@id=\"T:e6008300702::content\"]/div[4]/ul/li[4]/a")
    public WebElement linkSeguroCesantiaVoluntario;

    
    //Documentos
    @FindBy(id = "T:oc_8731256808region1:cl5")
    public WebElement btnTasaInteres;
    
    @FindBy(id = "T:oc_8731256808region1:cl3")
    public WebElement btnIncorporacionSeguroCesantia;
   
    @FindBy(id = "T:oc_8731256808region1:cl4")
    public WebElement btnRenunciaDenunciaSeguroCensantia;
    
    @FindBy(id = "T:oc_8731256808region1:cl2")
    public WebElement btnSolicitudDepositoCuentaBancaria;
    
    @FindBy(id = "T:oc_361127513region1:r1:r4:sbc1::content")
    public WebElement checkSeguroCesantia;
}
