package snake_client.Snake.SDKCon;

import snake_client.Snake.SDK.User;
import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import snake_client.Snake.SDK.Scores;
import snake_client.Snake.SDK.Response;

/*import org.codehaus.jettison.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
*/

/**
 * Created by nicolaiostergaard on 26/11/15.
 */

public class ServerConnection {




    public ServerConnection(){
        this.hostAddress = "http://localhost";
        this.port = 22381;
    }

    private String hostAddress;
    private int port;

    public void setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getHostAddress() {
        return hostAddress;
    }

    public int getPort() {
        return port;
    }

    public String get( String path){

        Client client = Client.create();

        WebResource webResource = client.resource(getHostAddress() + ":" + getPort() + "/api/" + path);
        ClientResponse response = webResource.type("application/json").get(ClientResponse.class);

       /* if (response.getStatus() != 200) {
            throw new RuntimeException("Failed: HTTP error code: "
                    + response.getStatus());
        }*/


        String output = response.getEntity(String.class);
        System.out.println(output);

        return output;

    }

    public void post(String json, String path){

        Client client = Client.create();

        WebResource webResource = client.resource(getHostAddress() + ":" + getPort() + "/api/" + path);
        ClientResponse response = webResource.type("application/json").post(ClientResponse.class, json);


        if (response.getStatus() != 200 && response.getStatus() != 201){
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatus());
        }

        String output = response.getEntity(String.class);
        System.out.println(output);

    }
}


