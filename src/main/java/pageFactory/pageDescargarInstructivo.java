package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageDescargarInstructivo {

	WebDriver driver;
    WebDriverWait wait;
    
    public pageDescargarInstructivo(WebDriver driver){
        this.driver = driver;	
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }
    
      
    public void click(WebElement webElement){
    	wait.until(ExpectedConditions.visibilityOf(webElement));
    	webElement.click();
    }
    
    @FindBy(xpath = "//*[@id=\"icon\"]")
	public WebElement btnDescargarPdf;
    
  //*[@id="icon"]
}
