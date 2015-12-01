package snake_client.Snake.SDKCon;

import org.json.simple.parser.JSONParser;
import snake_client.Snake.SDK.User;
import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import snake_client.Snake.SDK.Scores;
import snake_client.Snake.GUI.Frame;

import java.sql.Date;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import javax.swing.*;


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

/*    public void setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
    }

    public void setPort(int port) {
        this.port = port;
    }*/

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

    public String post(String json, String path, Frame frame){

        try {


            Client client = Client.create();

            WebResource webResource = client.resource(getHostAddress() + ":" + getPort() + "/api/" + path);
            ClientResponse response = webResource.type("application/json").post(ClientResponse.class, json);


            String output = response.getEntity(String.class);
            System.out.println(output);
            return output;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "HTTP failed", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return "";
    }


    public void parser(String Json, User user)
    {
        JSONParser jpo = new JSONParser();

        try
        {
            Object o = jpo.parse(Json);
            JSONObject jsonObject = (JSONObject) o;

            user.setEmail((String) jsonObject.get("Email"));
            user.setFirst_name((String) jsonObject.get("FirstName"));
            user.setLast_name((String) jsonObject.get("LastName"));
            user.setStatus((String) jsonObject.get("Active"));
            //user.setCreated((Date) jsonObject.get("Created"));
        }
        catch(ParseException e)
        {
            e.printStackTrace();
        }
    }
}


