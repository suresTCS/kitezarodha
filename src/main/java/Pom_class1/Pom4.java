package Pom_class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom4 {
	@FindBy(xpath = "//input[@id='userid']")private WebElement un;
	@FindBy(xpath = "//input[@id='password']")private WebElement paw;
	@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement logBT;
	
	
	public Pom4(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void  enterUN(String username) {
		un.sendKeys(username);
	}
	public void enterpwd(String passwerd) {
		paw.sendKeys(passwerd);
	}
	public void logbutt() {
		logBT.click();
	}

}
