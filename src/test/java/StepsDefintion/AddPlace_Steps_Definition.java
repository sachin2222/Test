package StepsDefintion;


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

public class AddPlace_Steps_Definition {

    public RequestSpecification req_spec;
    public Response response;
    public String response_body;


    @Given("^User have Required Payload$")
    public void user_have_Required_Payload() {

       // RestAssured.baseURI = "https://rahulshettyacademy.com";

        //req_spec = given().relaxedHTTPSValidation().queryParam("key", "qaclick123").body(AddPlace_Payload.getPojo());

    }

    @When("^User calls the AddPlace API and post with HTTP Request\\.$")
    public void user_calls_the_AddPlace_API_and_post_with_HTTP_Request() {

        response = req_spec.when().post("/maps/api/place/add/json");
        response_body = response.asString();
        System.out.println(response_body);

    }

    @Then("^User get Status Code (\\d+)$")
    public void user_get_Status_Code(int arg1) {
        response.then().assertThat().statusCode(arg1);


    }

    @Then("^user get the Required Place_id\\.$")
    public void user_get_the_Required_Place_id() {

        JsonPath js = new JsonPath(response_body);
        String place_id = js.getString("place_id");
        System.out.println(place_id);

    }


    @Then("^user get the Status \"([^\"]*)\"$")
    public void user_get_the_Status(String arg1) {

        JsonPath js = new JsonPath(response_body);
        String status = js.getString("status");
        Assert.assertEquals(status, arg1);


    }


}
