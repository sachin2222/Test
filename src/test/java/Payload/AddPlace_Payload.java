package Payload;

import POJO.AddPlace_Serialise_Pojo;
import POJO.Location_NestedClass_AddPlace;

import java.util.ArrayList;
import java.util.List;

public class AddPlace_Payload {

    public static AddPlace_Serialise_Pojo getPojo(String name , String address , String website , int accuracy , double latitude , double  longitude ,String phone_number , String Language ) {
        AddPlace_Serialise_Pojo pj = new AddPlace_Serialise_Pojo();
        pj.setAccuracy(accuracy);
        pj.setAddress(address);
        pj.setLanguage(Language);
        pj.setName(name);
        pj.setPhone_number(phone_number);

        List<String> myList = new ArrayList<String>();
        myList.add("shoes");
        myList.add("Park");

        pj.setTypes(myList);
        Location_NestedClass_AddPlace loc = new Location_NestedClass_AddPlace();
        loc.setLat(latitude);
        loc.setLng(longitude);
        pj.setLocation(loc);

        return pj;
    }
}
