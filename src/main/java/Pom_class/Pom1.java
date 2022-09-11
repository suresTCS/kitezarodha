package Pom_class;

import java.security.PrivateKey;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
	@FindBy(xpath = "//input[@id='userid']")private WebElement UN;
	@FindBy(xpath = "//input[@id='password']")private WebElement pasw;
	@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement logINBT;
	
	public Pom1(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void enterUN(String username) {
		UN.sendKeys(username);
	}
	public void enterpwd(String password) {
	   pasw.sendKeys(password);	
	}
	public void clicklogINBT() {
		logINBT.click();
	}
	

}
