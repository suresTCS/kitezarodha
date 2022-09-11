package Test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base1_class;
import Pom_class1.Pom4;
import Pom_class1.pom6;
import Utility.Utility_class1;
import Pom_class1.pom5;

public class Kite_Test1 extends Base1_class {
	 Pom4 tc1;
	 pom6 tc2;
	 pom5 tc3;
	 
	 @BeforeClass
	 public void openbrowser () throws Throwable {
		 initilizeBrowser();
		 Utility_class1.captureScreenshot(driver, "suresh");
		 
		 tc1=new Pom4(driver);
		 tc2=new pom6(driver);
		 tc3=new pom5(driver);
		 
	 }
	 
	 @BeforeMethod
	 public void Login() throws Throwable {
		  
		 tc1.enterUN(Utility_class1.getTD(0, 0));
		 System.out.println((Utility_class1.getTD(0, 0)));
		 
		 tc1.enterpwd(Utility_class1.getTD(0, 1));
		 
		 tc1.logbutt();
		 
		 
		 tc2.enterPIN(Utility_class1.getTD(0, 2));
		 
		 tc2.cuntiBT();
		 
	 }
	
	 @Test
	 public void verifyuserID() throws Throwable {
		 Utility_class1.captureScreenshot(driver, "suresh");
		 Reporter.log("running verify userid",true);
		 String actID=tc3.verifyvalue();
		 String expID=Utility_class1.getTD(0, 0);
		 
		 Assert.assertEquals(expID, actID,"both are diffrent tc is failed");
	 }
	 @AfterMethod
	 public void logOUT() {
		 Utility_class1.captureScreenshot(driver, "suresh");
		 Reporter.log("logout the application",true);
	 }
	 
	 	@AfterClass
	 	public void closebrowser() {
	 		Reporter.log("close the app",true);
	 		 Utility_class1.captureScreenshot(driver, "suresh");
	 	} 
}
