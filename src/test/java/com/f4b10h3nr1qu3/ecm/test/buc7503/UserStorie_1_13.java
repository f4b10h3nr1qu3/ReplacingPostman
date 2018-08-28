package com.f4b10h3nr1qu3.ecm.test.buc7503;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import com.f4b10h3nr1qu3.ecm.test.config.ECMTestConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.restassured.http.ContentType;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ECMTestConfiguration.class)
public class UserStorie_1_13 {

	private static final String URL = "/userProfile/v1/userProfile/{idUser}";
	private static final String EMAIL = "email";
	private static final String USER_NAME = "userName";
	private static final String ID_ALEX = "alex";
	private static final String ID_MARIO = "mario";
	private static final String ID_ANNE = "anne";
	private static final String ID_LISA = "lisa";
	public static final String NAME_LISA = "Lisa";
	public static final String NAME_ANNE = "Anne";
	public static final String NAME_MARIO = "Mario";
	public static final String NAME_ALEX = "Alex";
	public static final String MAIL_LISA = "lisa@nowhere.com";
	public static final String MAIL_ANNE = "anne@nowhere.com";
	public static final String MAIL_MARIO = "mario@nowhere.com";
	public static final String MAIL_ALEX = "alex@nowhere.com";

	@Test
	public void testValidateUserProfileLisa() throws Exception {
		given().auth().preemptive().basic(ID_LISA, ID_LISA).contentType(ContentType.JSON).when().pathParam("idUser",

				ID_LISA)
				.get(URL).then().statusCode(200).contentType(ContentType.JSON)
				.body(USER_NAME, equalTo(NAME_LISA), EMAIL, equalTo(MAIL_LISA));
	}

	@Test
	public void testValidateUserProfileAnne() throws Exception {
		given().auth().preemptive().basic(ID_ANNE, ID_ANNE).contentType(ContentType.JSON).when().pathParam("idUser",

				ID_ANNE)
				.get(URL).then().statusCode(200).contentType(ContentType.JSON)
				.body(USER_NAME, equalTo(NAME_ANNE), EMAIL, equalTo(MAIL_ANNE));
	}

	@Test
	public void testValidateUserProfileMario() throws Exception {
		given().auth().preemptive().basic(ID_MARIO, ID_MARIO).contentType(ContentType.JSON).when().pathParam("idUser",

				ID_MARIO)
				.get(URL).then().statusCode(200).contentType(ContentType.JSON)
				.body(USER_NAME, equalTo(NAME_MARIO), EMAIL, equalTo(MAIL_MARIO));
	}

	@Test
	public void testValidateUserProfileAlex() throws Exception {
		given().auth().preemptive().basic(ID_ALEX, ID_ALEX).contentType(ContentType.JSON).when().pathParam("idUser",

				ID_ALEX)
				.get(URL).then().statusCode(200).contentType(ContentType.JSON)
				.body(USER_NAME, equalTo(NAME_ALEX), EMAIL, equalTo(MAIL_ALEX));
	}
}
