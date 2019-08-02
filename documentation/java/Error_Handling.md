# Error Handling

This task is to review the Capco REST standards and ensure that the java application implements these [api standards](https://ilabs-capco.atlassian.net/wiki/spaces/BPG/pages/410910768/API+standards). In particular the HTTP status codes.

## Task

Prerequisites:

This requires that the previous [GET/POST data from MongoDB](GET_POST_data_from_MongoDB) task has been completed.

-   Create a new "GET /users/{userId}" endpoint. This will retrieve a single User from the MongoDB based on the ID. 
-   Ensure that the endpoint returns a 404 HTTP status code if an invalid ID is specified (the ID does not exist in the database).
-   Ensure that the existing "POST /users" endpoint returns a HTTP status code of 201 if the user is successfully added to the database.
-   Add integration tests to the java code which test that a 404 and 201 HTTP status code are returned based on the above conditions.

![](attachments/418840659/426409985.png?height=250)

![](attachments/418840659/426213391.png?height=250)



