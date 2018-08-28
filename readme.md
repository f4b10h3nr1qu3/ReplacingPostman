Testing and validation of REST services in Java. This project brings the simplicity of using these languages into the Java domain.

Backlog:

11-27-2017 - Start of Project

12-01-2017 - First Demo


Examples:

Here's an example of how to make a GET request and validate the JSON or XML response:

	given().contentType("application/json").when().get("/CatalogManagement/v2/referenceList/iso4217").then()
				.statusCode(200).body("id", equalTo("iso4217"))
				.body("listElements.collect { it.length() }.sum()", greaterThan(50));
				

Links:
Rest Assured Documentation
https://github.com/rest-assured/rest-assured/blob/master/README.md				
