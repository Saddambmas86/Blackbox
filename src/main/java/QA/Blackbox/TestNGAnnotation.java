package QA.Blackbox;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {
	 @Test
	    public void testCase() {
	    }
	 
	    @BeforeSuite
	    public void beforeSuite() {
	        System.out.println("Before Suite method");
	    }
	 
	    @AfterSuite
	    public void afterSuite() {
	        System.out.println("After Suite method");
	    }
	 
	    @BeforeTest
	    public void beforeTest() {
	        System.out.println("Before Test method");
	    }
	     
	    @AfterTest
	    public void afterTest() {
	        System.out.println("After Test method");
	    }
	    
//	    @Before
//	    public void before() {
//	        System.out.println("Before method");
//	    }
//
//	    @After
//	    public void after() {
//	        System.out.println("After method");
//	    }
	     
	    @BeforeClass
	    public void beforeClass() {
	        System.out.println("Before Class method");
	    }
	 
	    @AfterClass
	    public void afterClass() {
	        System.out.println("After Class method");
	    }
	 
	    @BeforeMethod
	    public void beforeMethod() {
	        System.out.println("Before Method");
	    }
	 
	    @AfterMethod
	    public void afterMethod() {
	        System.out.println("After Method");
	    }
}
