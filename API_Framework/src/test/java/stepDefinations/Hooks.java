package stepDefinations;

import java.io.IOException;

import cucumber.api.java.Before;

public class Hooks {

	@Before("@DeletePlace")
	public void beforeScenario() throws Throwable
	{		//execute this code only when place id is null
		//write a code that will give you place id
		
		PlaceStep m =new PlaceStep();
		if(PlaceStep.place_id==null)
		{
		
		m.add_Place_Payload_with("Shetty", "French", "Asia");
		m.user_calls_with_the_http_request("AddPlaceAPI", "POST");
		m.verify_place_Id_created_maps_to_using("Shetty", "GetPlaceAPI");
		}
		
		

	}
	
}
