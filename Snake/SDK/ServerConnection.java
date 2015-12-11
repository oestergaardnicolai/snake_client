package snake_client.Snake.SDK;

import org.json.simple.parser.JSONParser;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import snake_client.Snake.GUI.Frame;

import java.sql.Date;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import javax.swing.*;


/**
 * Created by nicolaiostergaard on 26/11/15.
 */

/**
 * This class establishes the connection to the server
 * it contains the few variables (hostAdress and port number)
 * that gets the connection plus GET, PUT, DELETE and POST
 * request which is the HTTP methods for read, create, update
 * and delete
 * This class is based on the prototype in GitHub
 */

public class ServerConnection {


    public ServerConnection() {
        /**
         * Initialize the variables
         * (These could be in a independent
         * config file, but since there only are
         * two variables it got in the sc class).
         */
        this.hostAddress = "http://localhost";
        this.port = 22381;
    }

    private String hostAddress;
    private int port;

    public String getHostAddress() {
        return hostAddress;
    }

    public int getPort() {
        return port;
    }


    /**
     * This method gets (reads) something from the server.
     * @param path Which message we want from the server
     * @return
     */
    public String get(String path) {

        try {

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
        } catch (Exception event) {
            event.printStackTrace();
            return "";
        }
    }

    /**
     * This method posts (creates) something in the server
     * @param json heterogenious format
     * @param path the path of where the posts should be created
     * @param frame
     * @return
     */
    public String post(String json, String path, Frame frame) {

        try {


            Client client = Client.create();

            WebResource webResource = client.resource(getHostAddress() + ":" + getPort() + "/api/" + path);
            ClientResponse response = webResource.type("application/json").post(ClientResponse.class, json);


            String output = response.getEntity(String.class);
            System.out.println(output);

            if (response != null) {
                return output;
            }
        } catch (Exception event) {
            event.printStackTrace();
            JOptionPane.showMessageDialog(frame, "HTTP failed", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return "";
    }


    /**
     * This method puts (updates) something to the server
     * @param path the way through the server to the location we want it updated
     * @param json Heterogenious format
     * @return
     */
    public String put(String path, String json){
        try {

            Client client = Client.create();

            WebResource webResource = client.resource(getHostAddress() + ":" + getPort() + "/api/" + path);
            ClientResponse clientResponse = webResource.type("application/json").put(ClientResponse.class, json);

            System.out.println("\nOutput from server ....\n");
            String output = clientResponse.getEntity(String.class);
            System.out.println(output);

            return output;

        }
        catch (Exception event){
            event.printStackTrace();
        }
        return null;
    }

    /**
     * This method deletes something
     * @param path the way through the server to the location were we want something deleted
     * @return
     */
    public String delete(String path) {

        try {

            Client client = Client.create();

            WebResource webResource = client.resource(getHostAddress() + ":" + getPort() + "/api/" + path);
            ClientResponse response = webResource.type("application/json").delete(ClientResponse.class);

       /* if (response.getStatus() != 200) {
            throw new RuntimeException("Failed: HTTP error code: "
                    + response.getStatus());
        }*/


            String output = response.getEntity(String.class);
            System.out.println(output);

            return output;
        } catch (Exception event) {
            event.printStackTrace();
            return null;
        }
    }

}

