package pac1;

import org.testng.annotations.Test;

public class ContacTest {


@Test
public void createcontacttest()
{
	String URL=System.getProperty("url");
	String BROWSER=System.getProperty("Browser");
	String USERNAME=System.getProperty("username");
	String PASSWORD=System.getProperty("password");
	
	System.out.println(URL);
	System.out.println(BROWSER);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
	
	System.out.println("execute createcontacttest");
}
  @Test
   public void modifycontactTest()
   {
	  System.out.println("execute modifycontactTest");
   }
	

}


