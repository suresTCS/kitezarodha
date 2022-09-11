package Pom_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 {
@FindBy(xpath = "//input[@id='pin']")private WebElement pin;
@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement contBT;

public Pom2(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void enterpin(String interpin) {
	pin.sendKeys(interpin);
}
public void cliBT() {
	contBT.click();
}
}
