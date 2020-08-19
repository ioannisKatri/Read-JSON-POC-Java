import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class JsonTest {
    public static void main(String[] args) throws IOException {

        JSONObject json = new JSONObject(IOUtils.toString(new URL("https://challenges.hackajob.co/swapi/api/people/?search=Luke%20Skywalker&format=json"), StandardCharsets.UTF_8));
        String films = json.getJSONArray("results").get(0).toString();

        JSONObject json1 = new JSONObject(films);
        System.out.println((long) json1.getJSONArray("films").toList().size());
    }
}
