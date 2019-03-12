package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class pageAporteFamiliarPermanente {

	WebDriver driver;
    WebDriverWait wait;
    
    public pageAporteFamiliarPermanente(WebDriver driver){
        this.driver = driver;	
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }
    
      
    public void click(WebElement webElement){
    	wait.until(ExpectedConditions.visibilityOf(webElement));
    	webElement.click();
    }
    
    //Consulta Beneficiario
    
	@FindBy(xpath = "//*[@id=\"form01\"]/table/tbody/tr[3]/td/div/div[1]/a")
    public WebElement linkConsultaBeneficiario;
	
	@FindBy(xpath = "//*[@id=\"form01\"]/table/tbody/tr[5]/td/div/dl/dt[1]/a")
    public WebElement linkUno;
	
	@FindBy(xpath = "//*[@id=\"form01\"]/table/tbody/tr[5]/td/div/dl/dt[2]/a")
    public WebElement linkDos;
	
	@FindBy(id = "cmb_listadoPeriodo")
    public WebElement cboxConsultaAno_1;
	
	//Consulta de Reclamos
	@FindBy(xpath = "//*[@id=\"form_detalle\"]/div[2]/div[2]/a")
    public WebElement linkEstadoReclamos;
	
	@FindBy(id = "cmb_listadoPeriodo")
    public WebElement cboxConsultaAno_2;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/a/img")
    public WebElement btnVolver;
	

}
