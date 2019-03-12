package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pagePlanificaVisita {

	WebDriver driver;
    WebDriverWait wait;
    
    public pagePlanificaVisita(WebDriver driver){
        this.driver = driver;	
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }
    
      
    public void click(WebElement webElement){
    	wait.until(ExpectedConditions.visibilityOf(webElement));
    	webElement.click();
    }
    
    
    @FindBy(xpath = "//*[@id=\"1551122425095\"]")
    public WebElement btnZonaNorte;
    
    @FindBy(xpath = "//*[@id=\"headingTwo\"]/h4/a")
    public WebElement btnZonaCentro;
    
    @FindBy(xpath = "//*[@id=\"headingThree\"]/h4/a")
    public WebElement btnZonaSur;
    
    @FindBy(xpath = "//*[@id=\"collapseTwo\"]/div/div[1]/div[14]/a/div")
    public WebElement btnSanPablo;
    
    @FindBy(xpath = "//*[@id=\"T:e3874450629::content\"]/span[3]")
    public WebElement lblSeleccionarSucursal;
}
