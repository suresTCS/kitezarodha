package Test;



import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base_class;
import Pom_class.Pom1;
import Pom_class.Pom2;
import Pom_class.Pom3;
import Utility.Utility_class;

public class Kite_Test extends Base_class {
	Pom1 login1;
	Pom2 login2;
	Pom3 login3;

	@BeforeClass
	public void openbw() throws Throwable {
		initilizeBrowser();
		 
		login1=new Pom1(driver);
		login2=new Pom2(driver);
		login3=new Pom3(driver);
	}
    @BeforeMethod
    public void  loginApp() throws Throwable {
    	
    	login1.enterUN((Utility_class.getTD(0, 0)));
    	System.out.println((Utility_class.getTD(0, 0)));
    	
    	login1.enterpwd(Utility_class.getTD(0, 1));
    	
    	login1.clicklogINBT();
    	
    	login2.enterpin(Utility_class.getTD(0, 2));
    	
    	login2.cliBT();
    	
    
    }
    
    @Test
    public void verfuser() throws Throwable {
    	Reporter.log("running verify user id",true);
    	
    	String actID=login3.verfuser();
    	String expID=Utility_class.getTD(0, 0);
    	
    	Assert.assertEquals(actID,expID ,"Bothare different tc is faild");
    	
    }
    @AfterMethod
    public void logoutApp() {
    	Reporter.log("logout the application",true);
    	
    }
    @AfterClass
    public void closeBrowser() {
    	Reporter.log("closs the app",true);
    }
    
	

}
