package snake_client.Snake.LOGIC;

//GUI imports
//import com.sun.corba.se.spi.activation.Server;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import snake_client.Snake.GUI.Frame;
import snake_client.Snake.GUI.UserMenu;

//SDK imports
import snake_client.Snake.SDK.User;
import snake_client.Snake.SDK.Game;
import snake_client.Snake.SDK.UserInfo;

//SDKCon imports
import snake_client.Snake.SDKCon.ServerConnection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import com.google.gson.Gson;
import javax.swing.*;
import org.json.simple.parser.JSONParser;

/**
 * Created by nicolaiostergaard on 13/11/15.
 */
public class Controller
{

    private static Socket socket;
    private static PrintWriter printWriter;
    private static Scanner scanner;
    private ServerConnection sc;

    private Frame frame;
    private sdk_controller sdkc;
    ServerConnection sco = new ServerConnection();
    User currentUser = new User();
    User uo = new User();
    UserInfo ui = new UserInfo();
    sdk_controller sdko;
    private Game go;


    public Controller(){

        sc = new ServerConnection();

        frame = new Frame();
        frame.setVisible(true);


    }

    public void run(){

        // socketMethod();

        frame.getUserLogin().addActionListener(new UserLoginActionListener());
        frame.getUserMenu().addActionListener(new UserMenuActionListener());
        frame.getHighscore().addActionListener(new HighscoreActionListener());
        frame.getJoinGame().addActionListener(new JoinGameActionListener());
        frame.getPlay().addActionListener(new PlayActionListener());
        frame.getDeleteGame().addActionListener(new DeleteGameActionListener());
        frame.getRateGame().addActionListener(new RateGameActionListener());
        frame.getInstructions().addActionListener(new InstructionsActionListener());
        frame.getHowToPlay().addActionListener(new HowToPlayActionListener());
        frame.getSignUp().addActionListener(new SignUpActionListener());
        frame.getCreateGame().addActionListener(new CreateGameActionListener());
        frame.show(Frame.LOGIN);
    }


    /*public void socketMethod(){

        try {


            socket = new Socket("localhost", 22381);

            printWriter = new PrintWriter(socket.getOutputStream(),true);
            printWriter.println("Woop WOop");

            scanner = new Scanner(System.in);
            printWriter.println("Input: ");
            String string = sc.next();

            printWriter.println(string + " you have written.");

        } catch(Exception e) {
            System.out.println(e);
        }
    }*/

    private class UserLoginActionListener implements ActionListener{

        public void actionPerformed(ActionEvent event){



            if (event.getSource() == frame.getUserLogin().getBtnSignIn()){


                getApi();

                if (loginReg()) {

                    frame.show(Frame.USERMENU);
                }
                else System.out.println("Wrong, login-failure");
            }
            else if (event.getSource() == frame.getUserLogin().getBtnSignUp())
            {
                frame.show(Frame.SIGNUP);
            }
        }
    }

    private class UserMenuActionListener implements ActionListener{

        public void actionPerformed(ActionEvent event){

            if (event.getSource() == frame.getUserMenu().getBtnDeleteGame())
            {
                frame.show(Frame.DELETEGAME);
            }
            else if (event.getSource() == frame.getUserMenu().getBtnHighscores())
            {
                sdko.highscore(frame);

                frame.show(Frame.HIGHSCORE);

            }
            else if (event.getSource() == frame.getUserMenu().getBtnLogout())
            {

                frame.show(Frame.LOGIN);

            }
            else if (event.getSource() == frame.getUserMenu().getBtnPlay())
            {

                frame.show(Frame.PLAYSNAKE);

            }
            else if (event.getSource() == frame.getUserMenu().getBtnRateGame())
            {
                frame.show(Frame.RATEGAME);
            }
            else if (event.getSource() == frame.getUserMenu().getBtnInstructions())
            {
                frame.show(Frame.INSTRUCTIONS);
            }


        }
    }

    private class HighscoreActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {

            if (event.getSource() == frame.getHighscore().getBtnBack())
            {
                frame.show(Frame.USERMENU);
            }

        }
    }

    private class  JoinGameActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {

            if(event.getSource() == frame.getJoinGame().getBtnBack())
            {
                frame.show(Frame.PLAYSNAKE);
            }
            else if(event.getSource() == frame.getJoinGame().getBtnEnterGame()) {
                if (joinExistingGame(frame, uo, ui, go)) {
                    JOptionPane.showMessageDialog(frame, "Congrats, you won!", "Success!",
                            JOptionPane.PLAIN_MESSAGE);

                    frame.show(Frame.PLAYSNAKE);
                    frame.getJoinGame().setText();
                } else {
                    JOptionPane.showMessageDialog(frame, "You lost!", "Failure",
                            JOptionPane.WARNING_MESSAGE);

                    frame.show(Frame.PLAYSNAKE);
                    frame.getJoinGame().setText();
                }
            }
            else if(event.getSource() == frame.getJoinGame().getBtnCancel())
            {
                frame.show(Frame.PLAYSNAKE);
            }
            else if(event.getSource() == frame.getJoinGame().getBox())
            {
              go = showExistingGamesInfo(frame);
            }
        }
    }

    private class PlayActionListener implements ActionListener{
        public void actionPerformed(ActionEvent event){

            if(event.getSource() == frame.getPlay().getBtnBack()){
                frame.show(Frame.USERMENU);

            }
            else if(event.getSource() == frame.getPlay().getBtnCreateGame())
            {
                frame.show(Frame.CREATEGAME);
            }
            else if (event.getSource() == frame.getPlay().getBtnJoinGame()){
                frame.show(Frame.JOINGAME);
                showExistingGames(frame, go);
            }

        }
    }

    private class DeleteGameActionListener implements ActionListener {
        public void actionPerformed(ActionEvent event){

            if(event.getSource() == frame.getDeleteGame().getBtnBack())
            {
                frame.show(Frame.USERMENU);
            }
            else if(event.getSource() == frame.getDeleteGame().getBtnDelete())
            {
                getApi();
                if(deleteGame(frame, uo))
                {

                    JOptionPane.showMessageDialog(frame, "The game is deleted",
                            "Success", JOptionPane.ERROR_MESSAGE);

                    frame.show(Frame.USERMENU);
                }
                else
                {
                    frame.show(Frame.DELETEGAME);
                }
            }

        }
    }

    private class RateGameActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == frame.getRateGame().getBtnBack())
            {
                frame.show(Frame.USERMENU);
            }

        }
    }

    private class InstructionsActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == frame.getInstructions().getBtnBack())
            {
                frame.show(Frame.USERMENU);
            }
            else if(event.getSource() == frame.getInstructions().getBtnHowToPlay())
            {
                frame.show(Frame.HOWTOPLAY);
            }
        }
    }

    private class HowToPlayActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == frame.getHowToPlay().getBtnBack())
            {
                frame.show(Frame.INSTRUCTIONS);
            }
        }
    }

    private class SignUpActionListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == frame.getSignUp().getBtnBack()) {
                frame.show(Frame.LOGIN);
            }
        }
    }

    private class CreateGameActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {

            if (event.getSource() == frame.getCreateGame().getBtnCreate()) {

                getApi();
                if (createGame(frame, ui, uo))
                {
                    frame.show(Frame.USERMENU);
                }

            }
            else if (event.getSource() == frame.getCreateGame().getBtnBack())
            {
                frame.show(Frame.PLAYSNAKE);
            }
        }
    }

    public void getApi(){

        sc.get("");
    }



    public boolean loginReg() {
        try {
            String username = frame.getUserLogin().getUsername().getText();
            String password = frame.getUserLogin().getPassword().getText();

            if (!username.equals("") && !password.equals(""))
            {
                User uo = new User();
                uo.setUsername(username);
                uo.setPassword(password);

                String Json = new Gson().toJson(uo);
                String dispatch = loginParser(sc.post(Json, "login/", frame), uo);

                if (dispatch.equals("Login successful")){
                    currentUser = uo;

                    sc.parser(sco.get("users/" + currentUser.getId() + "/"), currentUser);

                    //frame.getUserLogin().ClearLogin();

                    return true;
                }
                else if(dispatch.equals("Wrong username or password")){
                    JOptionPane.showMessageDialog(frame, "Wrong username or password",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
                else if (dispatch.equals("Error in JSON")){
                    JOptionPane.showMessageDialog(frame, "Backend issue",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(frame, "Username or password is incorrect try again",
                    "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        return false;


            }

        public String loginParser(String string, User user)
        {
            JSONParser parser = new JSONParser();
            String dispatcho = new String();
            int id =0;

            try
            {
                Object dispo = parser.parse(string);
                JSONObject jsono = (JSONObject) dispo;

                dispatcho = ((String)jsono.get("message"));

                System.out.println(dispatcho);
                user.setId ((long) jsono.get("userid"));

                return dispatcho;
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            return null;
        }



    //______________________________________________________________


    // Create Game
    public boolean createGame(Frame frame, UserInfo ui, User uo)
    {
        try {
            String field_name = frame.getCreateGame().getField_name().getText();
            int mapsize = frame.getCreateGame().getMapsize();
            String controls = frame.getCreateGame().getControls().getText();

            if (!field_name.equals("") && mapsize != 0 && !controls.equals("")) {
                Game go = new Game();

                ui.setId(uo.getId());
                ui.setControls(controls);
                go.setName(field_name);
                go.setMap_size(mapsize);
                go.setHost(ui);

                String Json = new Gson().toJson(go);

                String dispatch = createGameParser(sc.post(Json, "games/", frame));


                if (dispatch.equals(go.getName())) {
                    JOptionPane.showMessageDialog(frame, "Game created, time to challenge friends"
                            + go.getName(), "Game created", JOptionPane.ERROR_MESSAGE);

                    return true;
                } else if (dispatch.equals("Errors in JSON") || dispatch.equals("Something went wrong")) {
                    JOptionPane.showMessageDialog(frame, "Check input",
                            "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    System.out.println("Wrong");
                }

            }
        }

        catch(Exception e)
        {
            e.printStackTrace();
        }

        return false;
    }

    //Create game parser
    public String createGameParser(String string)
    {
        JSONParser jpo = new JSONParser();
        String field_name = new String();

        try
        {
            Object dispo = jpo.parse(string);
            JSONObject jsono = (JSONObject) dispo;

            field_name = ((String) jsono.get("name"));

            Game go = new Game();
            go.setName(field_name);

            return field_name;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }



    //Delete game
    public boolean deleteGame(Frame frame, User uo)
    {
        try
        {


            int id = frame.getDeleteGame().getInsertgameid();

            if(id != 0)
            {
                String disp = deleteGameParser(sc.get("games/" + id));

                if(disp.equals("Game was deleted"))
                {
                    return true;
                }
                else if(disp.equals("Failed. Game was not deleted"))
                {
                    JOptionPane.showMessageDialog(frame, "Game id does not exist try another", "Error"
                            , JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    //Delete game parser
    public String deleteGameParser(String string)
    {
        JSONParser jpo = new JSONParser();
        String disp = new String();

        try
        {
            Object dispo = jpo.parse(string);
            JSONObject jsono = (JSONObject) dispo;

            disp = ((String) jsono.get("message"));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return disp;
    }





    public boolean joinExistingGame(Frame frame, User uo, UserInfo ui, Game go)
    {
        Gson gson;
        try {

            gson = new Gson();

            String controls = frame.getJoinGame().getControls().getText();

            if(!controls.equals(""))
            {
                System.out.println(go.getId());
                ui.setId(uo.getId());
                ui.setControls(controls);
                go.setOpponent(ui);

                String json = gson.toJson(go);

                String dispatch = deleteGameParser(sc.put("games/join/", json));

                if(dispatch.equals("Game was joined"))
                {
                    Game go1 = getGame(sc.put("games/start", json));

                    System.out.println(go1.getWinner());

                    if(go1.getWinner().getWin_lose())
                    {
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }
                else if(dispatch.equals("Game closed"))
                {
                    JOptionPane.showMessageDialog(frame, "Game closed",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
                else if (dispatch.equals("Error in JSON"))
                {
                    JOptionPane.showMessageDialog(frame, "Error in JSON",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    public Game getGame(String string)
    {
        try
        {
            Gson gson = new Gson();

            Game go = gson.fromJson(string, Game.class);

            return go;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }


    public void showExistingGames(Frame frame, Game go)
    {
        try
        {
            Game[] go2 = showExistingGamesParser(sc.get("games/open/"));

            for(Game go1 : go2)
            {
                frame.getJoinGame().getBox().addItem(go1.getId());

                System.out.println(go1.getId() + ":\t" + go1.getName());
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public Game[] showExistingGamesParser(String string)
    {
        try
        {
            Gson gson = new Gson();

            Game[] go = gson.fromJson(string, Game[].class);

            return go;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public Game showExistingGamesInfo(Frame frame) {
        try {
            String dispatch = frame.getJoinGame().getBox().getSelectedItem().toString();

            Game go = getGame(sc.get("game/" + dispatch + "/"));

            frame.getJoinGame().getJlShowGame().setText("Game name: " + go.getName());

            return go;
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

}