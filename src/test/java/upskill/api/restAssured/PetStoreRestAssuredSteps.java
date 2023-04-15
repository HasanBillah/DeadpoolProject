package upskill.api.restAssured;

import java.io.File;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class PetStoreRestAssuredSteps {
	
	
	
	@Given("Create pet")
	public void create_pet() {
		
		given().														//Request Payload
			body(new File(System.getProperty("user.dir") 
			+ "/src/test/resource/APIRequestPayloads/CreatePetRequest.json")).
	    when().															//Setting the Header & Request url
			header("Content-Type", "application/json").
			post("https://petstore.swagger.io/v2/pet").
		then().															//Printing Response in console
			log().body().
		and().															//Verify status code
			assertThat().statusCode(200).
		and().															//Verify Response using json schema
			body(matchesJsonSchema(new File(System.getProperty("user.dir") 
					+ "/src/test/resource/APIResponseSchemas/CreatePetResponse.json")));
	    
	}

	@Given("Get pet")
	public void get_pet() {
		
		given().														//Request Payload
		
		when().															//Setting the Header & Request url
			header("Content-Type", "application/json").
			get("https://petstore.swagger.io/v2/pet/1403").
		then().															//Printing Response in console
			log().body().
		and().															//Verify status code
			assertThat().statusCode(200).
		and().															//Verify Response using json schema
			body(matchesJsonSchema(new File(System.getProperty("user.dir") 
					+ "/src/test/resource/APIResponseSchemas/GetPetResponse.json")));
	   
	}

	@When("Update pet")
	public void update_pet() {
		
		given().														//Request Payload
			body(new File(System.getProperty("user.dir") 
					+ "/src/test/resource/APIRequestPayloads/UpdatePetRequest.json")).
		when().															//Setting the Header & Request url
			header("Content-Type", "application/json").
			put("https://petstore.swagger.io/v2/pet").
		then().															//Printing Response in console
			log().body().
		and().															//Verify status code
			assertThat().statusCode(200).
		and().															//Verify Response using json schema
			body(matchesJsonSchema(new File(System.getProperty("user.dir") 
					+ "/src/test/resource/APIResponseSchemas/UpdatePetResponse.json")));
	   
	}

	@Then("Delete pet")
	public void delete_pet() {
		
		given().														//Request Payload
		
		when().															//Setting the Header & Request url
			header("Content-Type", "application/json").
			delete("https://petstore.swagger.io/v2/pet/1403").
		then().															//Printing Response in console
			log().body().
		and().															//Verify status code
			assertThat().statusCode(200).
		and().															//Verify Response using json schema
			body(matchesJsonSchema(new File(System.getProperty("user.dir") 
					+ "/src/test/resource/APIResponseSchemas/DeletePetResponse.json")));
	   
	   
	}

}
