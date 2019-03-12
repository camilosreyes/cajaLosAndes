package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class pageDespegar {
	
	WebDriver driver;
    WebDriverWait wait;
    
    public pageDespegar(WebDriver driver){
        this.driver = driver;	
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }
    
      
    public void click(WebElement webElement){
    	wait.until(ExpectedConditions.visibilityOf(webElement));
    	webElement.click();
    }

	
	@FindBy(xpath = "//*[@id=\"T:e2753117939::content\"]/div[2]/div[1]")
    public WebElement btnVuelo;
	
	@FindBy(xpath = "//*[@id=\"T:e2753117939::content\"]/div[2]/div[2]")
    public WebElement btnHoteles;
	
	@FindBy(xpath = "//*[@id=\"T:e2753117939::content\"]/div[2]/div[3]")
    public WebElement btnPaquetes;
	
	@FindBy(xpath = "//*[@id=\"T:e2753117939::content\"]/div[2]/div[4]")
    public WebElement btnActividades;
	
	@FindBy(xpath = "//*[@id=\"T:e2753117939::content\"]/div[2]/div[5]")
    public WebElement btnDisney;
	
	@FindBy(xpath = "//*[@id=\"T:e2753117939::content\"]/div[2]/div[6]")
    public WebElement btnRentCar;
	
	@FindBy(id = "T:oc_1931863878region1:cbredirect")
    public WebElement btnIngresarDespegar;
	
	
}
