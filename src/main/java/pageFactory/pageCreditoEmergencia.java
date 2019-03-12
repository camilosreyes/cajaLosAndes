package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageCreditoEmergencia {

	WebDriver driver;
    WebDriverWait wait;
    
    public pageCreditoEmergencia(WebDriver driver){
        this.driver = driver;	
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }
    
      
    public void click(WebElement webElement){
    	wait.until(ExpectedConditions.visibilityOf(webElement));
    	webElement.click();
    }
    
    @FindBy(xpath = "//*[@id=\"T:e694354435::content\"]/div[2]/div/a/span")
    public WebElement btnMasInformacion_1;
    
    @FindBy(xpath = "//*[@id=\"T:e5670179521::content\"]/div/div[2]/div/a")
    public WebElement btnMasInformacion_2;
    
    
}
