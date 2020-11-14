package Utility;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class JSONReader {
	JSONParser parser = new JSONParser();
	public String readJSON(String file, String tagName) throws FileNotFoundException, IOException, ParseException
	{
		 Object obj = parser.parse(new FileReader(file));
	      JSONObject jsonObject = (JSONObject) obj;
	      return (String) jsonObject.get(tagName);
		
	}

}
