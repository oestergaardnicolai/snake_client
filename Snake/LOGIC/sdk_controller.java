
package snake_client.Snake.LOGIC;
//Imports from GUI
import snake_client.Snake.GUI.Frame;

//Imports from SDK
import snake_client.Snake.SDK.User;

import javax.swing.*;
import com.google.gson.Gson;
import snake_client.Snake.SDKCon.ServerConnection;

/**
 * Created by nicolaiostergaard on 27/11/15.
*/

public class sdk_controller {

    private Frame frame;

    private ServerConnection sco;

    public sdk_controller() {
        sco = new ServerConnection();
    }

    public boolean loginReg() {
        try {
            String username = frame.getUserLogin().getUsername().getText();
            String password = frame.getUserLogin().getPassword().getText();

            if (!username.equals("") && !password.equals(""))
            {

            }



            else if(msg.equals("Wrong username or password")){
                JOptionPane.showMessageDialog(frame, "Wrong username or password",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if (msg.equals("Error in JSON")){
                JOptionPane.showMessageDialog(frame, "Backend issue",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    catch (Exception e){
        JOptionPane.showMessageDialog(frame, "Recheck spelling",
                "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    return false;

}
}
        }
        }





