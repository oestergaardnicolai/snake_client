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



    public ServerConnection() {
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

    private String httpGet(String path) {

        Client client = Client.create();

        WebResource webResource = client.resource(getHostAddress() + ":" + getPort() + "/api/" + path);
        ClientResponse response = webResource.type("application/json").get(ClientResponse.class);

        if (response.getStatus() != 200 && response.getStatus() != 201) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatus());
        }

        return response.getEntity(String.class);


    }


    private String httpPost(String json, String path) {

        Client client = Client.create();

        WebResource webResource = client.resource(getHostAddress() + ":" + getPort() + "/api/" + path);
        ClientResponse response = webResource.type("application/json").post(ClientResponse.class, json);

        if (response.getStatus() != 200 && response.getStatus() != 201) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatus());
        }

        return response.getEntity(String.class);




    }
    private String httpDelete(String path){

        Client client = Client.create();

        WebResource webResource = client.resource(getHostAddress() + ":" + getPort() + "/api/" + path);
        ClientResponse response = webResource.type("application/json").delete(ClientResponse.class);

        if (response.getStatus() != 200 && response.getStatus() != 201) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatus());
        }

        return response.getEntity(String.class);


    }


    public User login(User user) {
        String payload = new Gson().toJson(user, User.class);
        System.out.println("Payload to send: " + payload);
        String response;

        try {
            response = httpPost(payload, "login/");
        }
        catch (Exception ex) {
            return null;
        }


        User usr = new User();
        usr.setUsername(user.getUsername());
        usr.setPassword(user.getPassword());
        usr.setId(new Gson().fromJson(response.toString(), Response.class).getUserid());

        return usr;
    }
    public boolean deleteGame(int gameId){

        String path ="games/"+gameId;
        try {
            httpDelete(path);

        }
        catch (Exception ex) {
            return false;
        }
        return true;


    }
    public Scores[] getScores(){
        String path = "scores/";
        String response;
        try {
            response = httpGet(path);
        }
        catch (Exception ex ) {
            return null;
        }
        System.out.println(response);
        return new Gson().fromJson(response,Scores[].class);


    }
}

