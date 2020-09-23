package resources;

import java.util.ArrayList;
import java.util.List;

import Pojo.AddPlace;
import Pojo.Location;

public class TestDataBuild {
	
	public AddPlace addPlacePayload(String name, String language, String address)
	{
		AddPlace ap = new AddPlace();
		ap.setAccuracy(50);
		ap.setAddress(address);
		ap.setLanguage(language);
		ap.setPhone_number("1326547890");
		ap.setWebsite("rahulshettyacademy.com");
		ap.setName(name);
		
		List<String> myList = new ArrayList<String>();
		myList.add("Park");
		myList.add("Garden");
		
		ap.setTypes(myList);
		
		Location loc = new Location();
		loc.setLat(55.1235);
		loc.setLng(77.78965);
		
		ap.setLocation(loc);
		
		return ap;
	}

	public String deletePlacePayload(String place_id)
	{
		return "{\r\n    \"place_id\":\""+place_id+"\"\r\n}";
	}
}
