package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class pageCaracteristicasCredito {

	WebDriver driver;
    WebDriverWait wait;
    
    public pageCaracteristicasCredito(WebDriver driver){
        this.driver = driver;	
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }
    
      
    public void click(WebElement webElement){
    	wait.until(ExpectedConditions.visibilityOf(webElement));
    	webElement.click();
    }
    
    @FindBy( xpath = "//*[@id=\"T:oc_361127513region1:r1:r4:i3:0:i5:0:pgl7\"]")
    public WebElement primeraAlternativa12;
    
    @FindBy( xpath = "//*[@id=\"T:oc_361127513region1:r1:r4:panelBody\"]/span[2]")
    public WebElement lblSeleccionarCoutas;
}
