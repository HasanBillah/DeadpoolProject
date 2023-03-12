package upskill.api.restAssured;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class EmployeeRestAssuredSteps {
	
	@Given("Create new employee record")
	public void create_new_employee_record() {
	    
	}

	@When("Get all employee data")
	public void get_all_employee_data() {
	   Response resp = RestAssured.get("https://dummy.restapiexample.com/api/v1/employees");  //getting api http response using restassured
	   int statusCode = resp.getStatusCode();     //getting status code
	   String responseBody = resp.asString();     //getting response body
	   Assert.assertEquals(200, statusCode);      //validate status code
	   System.out.println("Status Code :::" + statusCode);  //printing status code
	   System.out.println("Response Body :::" + responseBody); //printing response body
	   
	}

	@Then("Get single employee data by id")
	public void get_single_employee_data_by_id() {
		
		
	    
	}

}
