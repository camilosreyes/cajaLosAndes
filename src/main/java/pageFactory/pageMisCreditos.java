package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class pageMisCreditos {

	WebDriver driver;
    WebDriverWait wait;
    
    public pageMisCreditos(WebDriver driver){
        this.driver = driver;	
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }
    
      
    public void click(WebElement webElement){
    	wait.until(ExpectedConditions.visibilityOf(webElement));
    	webElement.click();
    }
    
    @FindBy(xpath = "//*[@id=\"T:oc_3197488630region1:r1:e237998740::content\"]/div[2]/ul/li[2]/a")
    public WebElement linkAqui;
    
    
}
