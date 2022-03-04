import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URL;

public class GetCall {

	
	public static void main(String[] args) throws IOException {
		

		JsonParser parser = new JsonParser();
	   JsonArray array = parser.parse(MyGETRequest()).getAsJsonArray();
	   


	   for (int i = 0; i < array.size(); i++) {
		   JsonObject jsonObject1 = (JsonObject) array.get(i);
	         JsonElement value1 = jsonObject1.get("address");
        System.out.println(value1.getAsString());
       }



	}
	
	public static String MyGETRequest() throws IOException {
	    URL urlForGetRequest = new URL("https://raw.githubusercontent.com/arcjsonapi/ApiSampleData/master/api/users");
	    String readLine = null;
	    HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
	    conection.setRequestMethod("GET");
	    conection.setRequestProperty("Accept", "application/json"); 
	    int responseCode = conection.getResponseCode();
	    StringBuffer response = new StringBuffer();

	    if (responseCode == HttpURLConnection.HTTP_OK) {
	        BufferedReader in = new BufferedReader(
	            new InputStreamReader(conection.getInputStream()));
	        
	        while ((readLine = in .readLine()) != null) {
	            response.append(readLine);
	        } in .close();
	        // print result
	        //GetAndPost.POSTRequest(response.toString());
	    } else {
	        System.out.println("GET NOT WORKED");
	    }
		return response.toString();

	}
}
