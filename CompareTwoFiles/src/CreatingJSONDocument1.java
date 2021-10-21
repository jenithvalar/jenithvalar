import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;



public class CreatingJSONDocument1 {
     void Document1() {
         {
            //Creating a JSONObject object
            JSONObject jsonObject1 = new JSONObject();
            //Inserting key-value pairs into the json object
            jsonObject1.put("ID", "1896");
            jsonObject1.put("First_Name", "Jenith");
            jsonObject1.put("Last_Name", "xbfb");
            jsonObject1.put("Date_Of_Birth", "1999-12-24");
            jsonObject1.put("Place_Of_Birth", "THENI");
            jsonObject1.put("Country", "India");
            try {
                FileWriter file = new FileWriter("jenith1.json");
                file.write(jsonObject1.toJSONString());
                file.close();
            } catch (IOException e) {

                e.printStackTrace();
            }
            System.out.println("JSON file created: " + jsonObject1);
        }
    }
}


