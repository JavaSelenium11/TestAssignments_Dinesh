package testing.GetRequest;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetRequest 
{
	@Test
	public void hitgetrequest()
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/Mumbai?unitGroup=metric&key=38L538Z6NTRL8EME7VFS994CJ&contentType=json");
	    
		System.out.println("The status code is ");
		System.out.println(res.statusCode());
		System.out.println("The response data is ");
		System.out.println(res.asString());	
		
		int actualstatuscode=res.getStatusCode();
		String actualresponse=res.asString();
		Assert.assertEquals(actualstatuscode,200,"Correct status code returned");
		Assert.assertEquals(actualresponse.contains("Mumbai"),true,"Check for presence of Mumbai");
	}		
}
