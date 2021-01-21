package StepsDef_Paramertized;

import POJO.AddPlace_Serialise_Pojo;
import Payload.AddPlace_Payload;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class Parameterized_Test {


    public RequestSpecification req_spec;
    public Response response;
    public String response_body;
    public String place_id;
    public RequestSpecification req_get;
    public   Response get_response;

    @Given("^User have Required Payload \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void user_have_Required_Payload(String arg1, String arg2, String arg3, int arg4, double arg5, double arg6, String arg7, String arg8) {

        RestAssured.baseURI = "https://rahulshettyacademy.com";

        AddPlace_Serialise_Pojo pj = AddPlace_Payload.getPojo(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);

        req_spec = given().relaxedHTTPSValidation().queryParam("key", "qaclick123").body(pj);


    }

    @When("^User calls the AddPlace API and post with HTTP Request\\.$")
    public void user_calls_the_AddPlace_API_and_post_with_HTTP_Request() throws Throwable {

        response = req_spec.when().post("/maps/api/place/add/json");
        response_body = response.asString();
        System.out.println(response_body);

    }

    @Then("^User get Status Code (\\d+)$")
    public void user_get_Status_Code(int arg1) throws Throwable {
        response.then().assertThat().statusCode(arg1);


    }

    @Then("^user get the Status \"([^\"]*)\"$")
    public void user_get_the_Status(String arg1) throws Throwable {

        JsonPath js = new JsonPath(response_body);
        String status = js.getString("status");
        Assert.assertEquals(status, arg1);


    }

    @Then("^User have the Required Place_id$")
    public void user_have_the_Required_Place_id() throws Throwable {

        JsonPath js=new JsonPath(response_body);
         place_id=js.getString("place_id");
         System.out.println(place_id);

        RestAssured.baseURI="https://rahulshettyacademy.com";

        req_get= given().queryParam("key","qaclick123").queryParam("place_id",place_id)
                .relaxedHTTPSValidation();

    }

    @When("^User request the GetPlace API by GET HTTP Request\\.$")
    public void user_request_the_GetPlace_API_by_GET_HTTP_Request() throws Throwable {
         get_response=req_get.when().get("maps/api/place/get/json");

    }

    @Then("^User should get Status Code (\\d+)\\.$")
    public void user_should_get_Status_Code(int arg1) throws Throwable {
        get_response.then().assertThat().statusCode(arg1);

    }

    @Then("^User Should get Response Body of the Required Place\\.$")
    public void user_Should_get_Response_Body_of_the_Required_Place() throws Throwable {
      String responseBody=  get_response.then().extract().response().asString();
      System.out.println(responseBody);


    }



}
