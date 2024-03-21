package com.test.Quality_apis;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Quality_FailedReason_api {
	
	@Test(priority=1)
	public void Quality_FailedReasons() {
        Response response1 = RestAssured.get("https://apollo2.humanbrain.in/dashboard/qualityFailedReasons");
        int statusCode1 = response1.getStatusCode();
        
        Assert.assertEquals(statusCode1, 200, "API request to the Quality_FailedResons failed. Status code: " + statusCode1);
        
        System.out.println("API request to the Quality_FailedResons passed. Status code: " + statusCode1);
	}

}
