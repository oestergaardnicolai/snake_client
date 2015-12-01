/*
package snake_client.Snake.LOGIC;
//Imports from GUI
import snake_client.Snake.GUI.Frame;

//Imports from SDK
import snake_client.Snake.SDK.User;

import javax.swing.*;
import com.google.gson.Gson;
import snake_client.Snake.SDK.UserInfo;
import snake_client.Snake.SDKCon.ServerConnection;

/**
 * Created by nicolaiostergaard on 27/11/15.


public class sdk_controller {

    private ServerConnection sco;


    public sdk_controller()
    {
        sco = new ServerConnection();
    }

    /*
    public boolean createUser(Frame frame, User user)
    {
        try
        {
            String firstname = frame.getSignUp().getFirstName().getText();
            String lastname = frame.getSignUp().getLastName().getText();
            String username = frame.getSignUp().getUsername().getText();
            String mail = frame.getSignUp().getMail().getText();
            String password = frame.getSignUp().getPassword().getText();
            int type = 1;

            if(!firstname.equals("") && !lastname.equals("") && !username.equals("")
                    && !mail.equals("") && !password.equals(""))
            {
                User uo = new User();
                uo.setFirst_name(firstname);
                uo.setLast_name(lastname);
                uo.setEmail(mail);
                uo.setUsername(username);
                uo.setPassword(password);
                uo.setStatus("active");
                uo.setType(2);

                String json = new Gson().toJson(uo);

                String msgpo = messageParser(sco.send(json, "users/", frame));

                if(msgpo.equals("User created succesfully"));
                {
                    currentUser = user;
                    frame.getSignUp().clearText();
                    return true;
                }
                    else if (msgpo.equals("Username or Email does allready exists"))
                        {
                            JOptionPane.showMessageDialog(frame, "Username or Email does allready exists", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                else if (msgpo.equals("Error in JSON"))
            {
                JOptionPane.showMessageDialog(frame, "Backend issue", "Error", JOptionPane.ERROR_MESSAGE);
            }

            }
        }

        catch (Exception e)
        {
            JOptionPane.showMessageDialog(frame, "Reheck spelling", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }


        public boolean createGame(UserInfo userInfo, User uo, Frame frame)
        {
            try
            {
                String field_name = frame.getCreateGame().getField_name().getText();
                int mapsize = frame.getCreateGame().getMapsize().getText();
                String controls = frame.getCreateGame().getControls().getText();

                if(!field_name.equals("") && !mapsize.equals("") && !controls.equals(""))
                {

                }
            }
        }



        }
*/




