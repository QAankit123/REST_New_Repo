package Base;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Basic_Auth 
{   
	
	@Test
	public void Basic_Authentication_Test() 
	{
	  var code=RestAssured.given()
	  .auth().preemptive()
	  .basic("ToolsQA", "TestPassword")
	  .when()
	  .get("http://restapi.demoqa.com/authentication/CheckForAuthentication")
	  .getStatusCode();
	  
	  
		System.out.println("The status code is"+"  "+code);
		
		

	}
	
	
	
}
