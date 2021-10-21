import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class CreatingJSONDocument2 {
    void Document2() {
        {
            //Creating a JSONObject object
            JSONObject jsonObject2 = new JSONObject();
            //Inserting key-value pairs into the json object
            jsonObject2.put("ID", "1896");
            jsonObject2.put("First_Name", "Jenith");
            jsonObject2.put("Last_Name", "varma");
            jsonObject2.put("Date_Of_Birth", "1999-12-24");
            jsonObject2.put("Place_Of_Birth", "THENI");
            jsonObject2.put("Country", "India");
            try {
                FileWriter file = new FileWriter("jenith2.json");
                file.write(jsonObject2.toJSONString());
                file.close();
            } catch (IOException e) {

                e.printStackTrace();
            }
            System.out.println("JSON file created: " + jsonObject2);
        }
    }
}


