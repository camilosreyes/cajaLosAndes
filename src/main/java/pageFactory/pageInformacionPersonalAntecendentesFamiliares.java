package pageFactory;

import java.util.List;

import javax.swing.plaf.synth.Region;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageInformacionPersonalAntecendentesFamiliares {

	WebDriver driver;
    WebDriverWait wait;
    
    public pageInformacionPersonalAntecendentesFamiliares(WebDriver driver){
        this.driver = driver;	
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }
	
    public void click(WebElement webElement){
    	wait.until(ExpectedConditions.visibilityOf(webElement));
    	webElement.click();
    }
    
    
    @FindBy(id = "T:oc_3825969974region1:cl2")
    public WebElement btnAntecedentesFamiliares;
    
}
