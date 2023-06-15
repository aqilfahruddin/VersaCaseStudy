import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.*;

public class ChallengeBigBang {

public static void main(String[] args) {
		
		String[] Array = new String[100];
		
		for (int i = 0; i < Array.length; i++) {
			Array [i] = Integer.toString(i+1);
			
			if(Integer.parseInt(Array[i]) % 3 == 0) {
				Array[i] = "BIG";
			} else if (Integer.parseInt(Array[i]) % 5 == 0) {
				Array[i] = "BANG";
			}
		}
	
		JSONArray jsonArray = new JSONArray();
        for (String num : Array) {
            jsonArray.add(num);
        }
        
        try (FileWriter file = new FileWriter("output.json")) {
            file.write(jsonArray.toJSONString());
            System.out.println("Output generated and saved to output.json.");
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}


