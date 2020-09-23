Feature: Validating Place API's

@AddPlace @Regression
Scenario Outline: Verify if Place is being Successfully added using AddPlaceAPI
Given Add Place Payload with "<name>" "<language>" "<address>"
When user calls "AddPlaceAPI" with the "POST" http request
Then the API call got success with status code 200
And "status" in response body is "OK"
And "scope" in response body is "APP"
And verify place_Id created maps to "<name>" using "GetPlaceAPI"

Examples:
|name	   |language |address	|
|tester	   |Hindi    |wakad     |
#|developer |English  |chinchwad  |

@DeletePlace @Regression
Scenario: Verify if Delete Place functionality is working
Given DeletePlace Payload
When user calls "DeletePlaceAPI" with the "POST" http request
Then the API call got success with status code 200
And "status" in response body is "OK"