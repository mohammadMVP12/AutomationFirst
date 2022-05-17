package ProTrainingTech.AutomationTrainingProgram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test//5
  public void f() {
	  System.out.println("this is test");
  }
  @Test//5
  public void test2() {
	  System.out.println("this is test2");
  }
  @BeforeMethod//4
  public void beforeMethod() {
	 System.out.println("this is before method");
  }

  @AfterMethod//6
  public void afterMethod() {
	  System.out.println("this is after method");
  }

  @BeforeClass//3
  public void beforeClass() {
	  System.out.println("this is before class");
  }

  @AfterClass//7
  public void afterClass() {
	  System.out.println("this ois after class");
  }

  @BeforeTest//2
  public void beforeTest() {
	  System.out.println("this is before test");
  }

  @AfterTest//8
  public void afterTest() {
	  System.out.println("this is after class");
  }

  @BeforeSuite//1
  public void beforeSuite() {
	  System.out.println("this is before suite");
  }

  @AfterSuite//9
  public void afterSuite() {
	  System.out.println("this is after suite");
  }

}
