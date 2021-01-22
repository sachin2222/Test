package StepsDef_Paramertized;

import POJO.AddPlace_Serialise_Pojo;
import Payload.AddPlace_Payload;
import Utilities.Request_Specifation;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.io.FileNotFoundException;

import static io.restassured.RestAssured.given;

public class Parameterized_Test {


    public RequestSpecification req_spec;
    public Response response;
    public String response_body;
    public String place_id;
    public RequestSpecification req_get;
    public   Response get_response;

    @Given("^User have Required Payload \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void user_have_Required_Payload(String name, String address, String website, int accuracy, double longitude, double latitude, String phone_number, String Language) throws FileNotFoundException {

        AddPlace_Serialise_Pojo pj = AddPlace_Payload.getPojo(name, address,website, accuracy,longitude,latitude ,phone_number,Language);
        req_spec = given().spec(Request_Specifation.get_Request_Specifactions_POST()).body(pj);

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
        Assert.assertEquals(status,"OK");


    }

    @Then("^User have the Required Place_id$")
    public void user_have_the_Required_Place_id() throws FileNotFoundException {

        JsonPath js=new JsonPath(response_body);
         place_id=js.getString("place_id");
        req_get= given().spec(Request_Specifation.get_Request_Specifactions_GET()).queryParam("place_id",place_id);

    }

    @When("^User request the GetPlace API by GET HTTP Request\\.$")
    public void user_request_the_GetPlace_API_by_GET_HTTP_Request() throws Throwable {
         get_response=req_get.when().get("maps/api/place/get/json");

    }

    @Then("^User should get Status Code (\\d+)\\.$")
    public void user_should_get_Status_Code(int arg1) throws Throwable {
        int status_code=get_response.getStatusCode();
        Assert.assertEquals(status_code,200);

    }

    @Then("^User Should get Response Body of the Required Place\\.$")
    public void user_Should_get_Response_Body_of_the_Required_Place() throws Throwable {
      String responseBody=  get_response.then().extract().response().asString();
      System.out.println(responseBody);


    }



}
