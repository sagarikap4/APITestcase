package ProjectModule;

import org.testng.annotations.Test;

import baseclassUtility.BaseAPIClass;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import pojoclassutility.ProjectPojo;
/**
 * Create Project
 */
public class AddSingleProjectWithCreated extends BaseAPIClass {

	@Test
	public void createSingleProject()
	{
		int randomnumber = jLib.getRandomNumber();
		String projectname="BonitoHomes"+randomnumber;
		String createdbyuser="Mani"+randomnumber;
		ProjectPojo pp=new ProjectPojo(createdbyuser,"Created",0,projectname);
		Response response = given().spec(specReqObj).body(pp).when().post(endPointUtility.IEndPoint.ADDProj);
		
		response.then().log().all();
		
    
	}

}
