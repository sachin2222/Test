package StepsPlaceAPI;

import POJO.AddPlace_Deserialise;
import POJO.AddPlace_Serialise_Pojo;
import Payload.AddPlace_Payload;
import Utilities.Util;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.io.FileNotFoundException;

import static io.restassured.RestAssured.given;

public class AddPlace {

     RequestSpecification req_spec;
     Response response;
     AddPlace_Deserialise addPlace;
     public String place_id;

    RequestSpecification req_get;
    Response get_response;

    @Given("^User have Required Payload \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void user_have_Required_Payload(String name, String address, String website, int accuracy, double longitude, double latitude, String phone_number, String Language) throws FileNotFoundException {

        // Serialise Pojo Object
        AddPlace_Serialise_Pojo pj = AddPlace_Payload.getPojo(name, address,website, accuracy,longitude,latitude ,phone_number,Language);
        req_spec = given().spec(Util.get_Request_Specifactions_POST()).body(pj);


    }

    @When("^User calls the AddPlace API and post with HTTP Request\\.$")
    public void user_calls_the_AddPlace_API_and_post_with_HTTP_Request() throws Throwable {

        response = req_spec.when().post("/maps/api/place/add/json");

        addPlace = response.as(AddPlace_Deserialise.class);// Deserialise Pojo Object
        place_id=addPlace.getPlace_id();
        System.out.println(place_id);

    }

    @Then("^User get Status Code (\\d+)$")
    public void user_get_Status_Code(int arg1) throws Throwable {

       int statuscode= response.getStatusCode();
       Assert.assertEquals(statuscode,200);

    }

    @Then("^user Should get the Status \"([^\"]*)\"$")
    public void user_Should_get_the_Status(String arg1) throws Throwable {

        String status= addPlace.getStatus();
        Assert.assertEquals(status,"OK");

    }

    @Then("^User Have Required PlaceID to Get Resposne$")
    public void user_Have_Required_PlaceID_to_Get_Resposne() throws Throwable {

        req_get= given().spec(Util.get_Request_Specifactions_GET()).queryParam("place_id",place_id);

    }

    @Then("^User Hit the GetPlaceAPI through GET HTTP Request$")
    public void user_Hit_the_GetPlaceAPI_through_GET_HTTP_Request() throws Throwable {

        get_response=req_get.when().get("maps/api/place/get/json");

    }

    @Then("^User should get the Response Body of Place\\.$")
    public void user_should_get_the_Response_Body_of_Place() throws Throwable {


    }

    @Then("^Status Code Should be  (\\d+)\\.$")
    public void status_Code_Should_be(int arg1) throws Throwable {

        int status_code=get_response.getStatusCode();
        Assert.assertEquals(status_code,200);

    }

}
