package Pom_class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom5 {
     @FindBy(xpath = "//span[text()='DPG458']")private WebElement veriFY;
	
     
     
     public pom5(WebDriver driver) {
    	 PageFactory.initElements(driver, this);
     }
     public String verifyvalue() {
    	 String actID=veriFY.getText();
    	 return actID;
     }
}
