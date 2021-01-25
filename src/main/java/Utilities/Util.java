package Utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Util {

    public static RequestSpecification get_Request_Specifactions_POST() throws FileNotFoundException {

        PrintStream log=new PrintStream(new FileOutputStream("LOGGING_FOR_POST.txt"));

        RequestSpecification req = new RequestSpecBuilder()
                .setBaseUri("https://rahulshettyacademy.com")
                .addQueryParam("key", "qaclick123")
                .setContentType(ContentType.JSON).setRelaxedHTTPSValidation()
                .addFilter(RequestLoggingFilter.logRequestTo(log))
                .addFilter(ResponseLoggingFilter.logResponseTo(log))
                .build();

        return req;

    }


    public static RequestSpecification get_Request_Specifactions_GET() throws FileNotFoundException {

        PrintStream log = new PrintStream(new FileOutputStream("LOGGING_FOR_GET.txt"));

        RequestSpecification req = new RequestSpecBuilder()
                .setBaseUri("https://rahulshettyacademy.com")
                .addQueryParam("key", "qaclick123")
                .setContentType(ContentType.JSON).setRelaxedHTTPSValidation()
                .addFilter(RequestLoggingFilter.logRequestTo(log))
                .addFilter(ResponseLoggingFilter.logResponseTo(log))
                .build();

        return req;
    }

        public static RequestSpecification get_Request_Specifactions_Delete() throws FileNotFoundException {

            PrintStream log=new PrintStream(new FileOutputStream("LOGGING_FOR_Delete.txt"));

            RequestSpecification req = new RequestSpecBuilder()
                    .setBaseUri("https://rahulshettyacademy.com")
                    .addQueryParam("key", "qaclick123")
                    .setContentType(ContentType.JSON).setRelaxedHTTPSValidation()
                    .addFilter(RequestLoggingFilter.logRequestTo(log))
                    .addFilter(ResponseLoggingFilter.logResponseTo(log))
                    .build();

            return req;

    }


}
