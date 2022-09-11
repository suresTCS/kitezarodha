package Pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom3 {
	@FindBy(xpath = "//span[text()='DPG458']")private WebElement userID;
	
	
	public Pom3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String verfuser() {
		String actID=userID.getText();
		return actID;
	}

}
