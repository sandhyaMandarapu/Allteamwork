package reusableUtilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
/**
 * @author KT1546
 * @CreatedDate 03-05-2023
 * @param This class contains all the json specific generic methods
 * @outputparam  returns particular datatypes
 */


public class JSONFileUtility {
	/**
	 * extractData_JSON - method to extract JSON data from a file
	 * 
	 * @param file (including path)
	 * @return JSONObject
	 * @throws ParseException 
	 * @throws IOException 
	 * @throws Exception
	 */
	public void fetchJSON() throws IOException, ParseException {

		// To retrive the data present in json file
				JSONParser js = new JSONParser();
				// to pass the path of json file
				FileReader r = new FileReader("ConstantsUtility.JsonFilePath");
				// to read the data
				Object obj = js.parse(r);
	}
	/**
	 * extractData_JSON - method to read multiple data from a file
	 * 
	 * @param file (including path)
	 * @return JSONObject
	 * @throws ParseException 
	 * @throws IOException 
	 * @throws Exception
	 */

	public String[] readJson() throws IOException, ParseException

	{
		// To retrive the data present in json file
		JSONParser js = new JSONParser();
		// to pass the path of json file
		FileReader r = new FileReader("ConstantsUtility.JsonFilePath");
		// to read the data
		Object obj = js.parse(r);

		JSONObject userlogin = (JSONObject) obj;
		// String user =(String)userlogin.get("userlogins");

		JSONArray user = (JSONArray) userlogin.get("userlogins");

		String arr[] = new String[user.size()];

	   	for (int i = 0; i < user.size(); i++) {
			JSONObject users = (JSONObject) user.get(i);
			String u = (String) users.get("username");
			String p = (String) users.get("password");
			arr[i] = u + " ," + p;
		}
		return arr;
	}
}

		
