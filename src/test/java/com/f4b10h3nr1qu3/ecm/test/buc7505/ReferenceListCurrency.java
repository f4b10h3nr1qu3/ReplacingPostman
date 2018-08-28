package com.f4b10h3nr1qu3.ecm.test.buc7505;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.f4b10h3nr1qu3.ecm.test.config.ECMTestConfiguration;

import io.restassured.http.ContentType;

/**
 * Integration Test for Reference List Rest Services
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ECMTestConfiguration.class)
public class ReferenceListCurrency {

	private static final String ISO4217 = "iso4217";
	public static final String ID = "id";

	@Test
	public void testGetSuccess() throws Exception {
		given().contentType(ContentType.JSON).when().pathParam(ID, ISO4217)
				.get("ecm/CatalogManagement/v2/referenceList/{id}").then().statusCode(200).contentType(ContentType.JSON)
				.body("id", equalTo(ISO4217));
	}

}
