package Pom_class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom6 {
	@FindBy(xpath = "//input[@id='pin']")private WebElement pin;
	@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement cuntBT;
	
	
	public pom6(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterPIN(String INTPIN) {
		pin.sendKeys(INTPIN);
		
	}
	public void cuntiBT() {
		cuntBT.click();
	}

}
