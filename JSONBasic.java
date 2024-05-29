import javax.json.JsonReader;
import javax.json.Json;
import javax.json.JsonObject;

class JSONBasic {
	public static void main(String [] args) {
		String json = "{\"1\":{\"user\":\"asas@asas.com\",\"password\":\"hcxzwsvdbfgnhmj\"},\"2\":{\"user\":\"adadad@adad.com\",\"password\":\"mhvtstv4db5fny7\"},\"3\":{\"user\":\"jnjn@khhjc.com\",\"password\":\"ce4vr5bt6ny7m8\"}}";
		
		JSONObject jsonObj = new JSONObject(json);
		//System.out.println(jsonObj.getObject(1));
		
		System.out.println("Hello World!");
	}
}