package Tast;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A {

	public static void main(String[] args) {
	WebDriver driver =WebDriverManager.chromedriver().create();
	driver.get("https://mvnrepository.com/");
	}
}
