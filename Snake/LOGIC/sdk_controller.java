
package snake_client.Snake.LOGIC;
//Imports from GUI
import com.google.gson.Gson;
import snake_client.Snake.GUI.Frame;
//Imports from SDK
import snake_client.Snake.SDK.ScoresInfo;
import snake_client.Snake.SDK.User;
import snake_client.Snake.SDK.UserInfo;
import snake_client.Snake.SDK.Game;


import javax.swing.*;
import snake_client.Snake.SDKCon.ServerConnection;
import org.codehaus.jettison.json.JSONObject;
import org.json.simple.parser.JSONParser;



/**
 * Created by nicolaiostergaard on 27/11/15.
*/

public class sdk_controller {

    private static ServerConnection sco;

    private User uo = new User();
    private UserInfo ui = new UserInfo();

    public sdk_controller()
    {
        sco = new ServerConnection();
    }









    //Return ServerConnection object
            public ServerConnection getSco()
            {
                return sco;
            }
    }





