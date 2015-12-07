package snake_client.Snake.LOGIC;

//GUI imports
import org.json.simple.JSONObject;
import snake_client.Snake.GUI.Frame;

//SDK imports
import snake_client.Snake.SDK.ScoresInfo;
import snake_client.Snake.SDK.User;
import snake_client.Snake.SDK.Game;
import snake_client.Snake.SDK.UserInfo;

//SDKCon imports
import snake_client.Snake.SDK.ServerConnection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.google.gson.Gson;
import javax.swing.*;
import org.json.simple.parser.JSONParser;




/**
 * Created by nicolaiostergaard on 13/11/15.
 */

/**
 * This class is basically where everything happens, it is the class that connects the frontend
 * to the backend in other words this class´ job is to handle the exchange of data there is between
 * the data layer and the presentation layer which it does via the Action listeners there is for each
 * panel.
 * This class contains furthermore the function methods and the parser methods for each function
 * which it then sends to the action listeners for adding the eventhandlings.
 * Each action listener for the panels has a private inner class in this class
 */
public class Controller
{

    // Variable name set to sc (ServerConnection) declared with the ServerConnection class.
    private ServerConnection sc;
    //Variable name set to frame declared with the Frame class.
    private Frame frame;
    //Variable name set to go (Game object) declared with the Game class
    private Game go;
    //Creates a new object of ServerConnection
    ServerConnection sco = new ServerConnection();
    //Creates an object of User
    User uo = new User();
    //Creates another object of User
    User uo1 = new User();
    //Creates an object of UserInfo
    UserInfo ui = new UserInfo();


    /**
     * Created the constructor of this class used to create objects of the variables
     * and assign values to them because they are private variables.
     */
    public Controller(){

        //Making a new object of ServerConnection
        sc = new ServerConnection();
        //Making a new object of Frame
        frame = new Frame();
        //Makes the frame visible
        frame.setVisible(true);

        //End of constructor
    }

    // Class used to run in main method
    public void run(){

        /**
         * Adds the action listeners to the different panels
         */
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
        /**
         * Shows the login screen when all the action listeners are added to the different panels
         */
        frame.show(Frame.LOGIN);
        //End of the run method
    }

    /**
     * Declare the private inner event handler class and specifies that the class
     * should implement the action listener interface.
     * This private inner class handles the event from when the user or Admin
     * is on the login screen.
     */
    private class UserLoginActionListener implements ActionListener{

        /**
         * This method is the action listeners interface
         * it invokes when an action occurs because it is called
         * right after the user performs an action
         * @param event
         */
        public void actionPerformed(ActionEvent event){


            /**
             * A simple if statement that states what should be done if
             * the user presses the sign in button
             */
            if (event.getSource() == frame.getUserLogin().getBtnSignIn()){

                /**
                 * Gets the getApi method
                 */
                getApi();

                /**
                 * An if statement that states what should be done
                 * if the user tries to log in (loginReg is a boolean method
                 * that handles the login function later on in this class (outerclass))
                 */
                if (loginReg()) {

                    /**
                     * Takes the user to the usermenu if the if-statement is met.
                     */
                    frame.show(Frame.USERMENU);
                }
                /**
                 * In case the if-statement wasnt met the application should
                 * print out that something went wrong with the log in try.
                 * (JOptionPane is made in the loginReg method to print a similar
                 * statement to the user in the presentation layer).
                 */
                else System.out.println("Wrong, login-failure");
            }
            /**
             * An else if statement that handles what should be done in case
             * the user presses the signup button
             */
            else if (event.getSource() == frame.getUserLogin().getBtnSignUp())
            {
                /**
                 * Shows the signup menu
                 */
                frame.show(Frame.SIGNUP);
            } //End of if-statement
        }//End of actionPerformed
    }//End of UserLogin inner class

    /**
     * Declare the private inner event handler class and specifies that the class
     * should implement the action listener interface.
     * This private inner class handles the event from what should be done when
     * the user or Admin presses something in the main menu
     * The user are here when he is logged correctly in.
     */
    private class UserMenuActionListener implements ActionListener{
        /**
         *Another actionPerformed method
         * @param event
         */
        public void actionPerformed(ActionEvent event){

            /**
             * An if-statement that handles (states) what should be done if the user
             * clicks on the delete game button
             */
            if (event.getSource() == frame.getUserMenu().getBtnDeleteGame())
            {
                /**
                 * Shows the delete game frame
                 */
                frame.show(Frame.DELETEGAME);
            }
            /**
             * An else-if statement that handles what should be done if
             * the user clicks on the Highscore button
             */
            else if (event.getSource() == frame.getUserMenu().getBtnHighscores())
            {
                /**
                 * Shows the contents of the highscore method to the frame.
                 */
                highscore(frame);
                /**
                 * Shows the Highscore frame
                 */
                frame.show(Frame.HIGHSCORE);

            }
            /**
             * An else if statement that handles what should be done if
             * the user clicks on the logout button
             */
            else if (event.getSource() == frame.getUserMenu().getBtnLogout())
            {
                /**
                 * Shows the login screen
                 */
                frame.show(Frame.LOGIN);

            }
            /**
             * An else if statement that handles what should be done if
             * the user clicks on the play button
             */
            else if (event.getSource() == frame.getUserMenu().getBtnPlay())
            {
                /**
                 * Shows the play menu
                 */
                frame.show(Frame.PLAYSNAKE);

            }
            /**
             * An else if statement that handles what should be done if
             * the user clicks on the rate game button
             */
            else if (event.getSource() == frame.getUserMenu().getBtnRateGame())
            {
                /**
                 * Shows the rate game screen
                 */
                frame.show(Frame.RATEGAME);
            }
            /**
             * An else-if statement that handles what should be done if
             * the user clicks on the Instructions button
             */
            else if (event.getSource() == frame.getUserMenu().getBtnInstructions())
            {
                /**
                 * Shows the Instructions screen.
                 */
                frame.show(Frame.INSTRUCTIONS);
            }//End of last else-if statement

        }// End of actionPerformed
    }// end of private Usermenu inner class

    /**
     * * Declare the private inner event handler class and specifies that the class
     * should implement the action listener interface.
     * This private inner class handles the event from what should be done when
     * the user or Admin presses a button in the highscore panel.
     */
    private class HighscoreActionListener implements ActionListener
    {
        /**
         * Another actionPerformed
         * @param event
         */
        public void actionPerformed(ActionEvent event)
        {

            /**
             * An if statement that handles what should be done if
             * the user clicks on the back button
             */
            if (event.getSource() == frame.getHighscore().getBtnBack())
            {
                /**
                 * Takes the user back to the usermenu
                 */
                frame.show(Frame.USERMENU);
            }//End of if statement

        }//end of actionPerformed
    }//End of private Highscore inner class

    /**
     * Declare the private inner event handler class and specifies that the class
     * should implement the action listener interface.
     * This private inner class handles the event from what should be done when
     * the user or Admin presses something in the join game panel
     */
    private class  JoinGameActionListener implements ActionListener
    {
        /**
         * Another actionPerformed method
         * @param event
         */
        public void actionPerformed(ActionEvent event)
        {
            /**
             * An if statement that handles what should be done if
             * the user clicks on the back button
             */
            if(event.getSource() == frame.getJoinGame().getBtnBack())
            {
                /**
                 * Takes the user back to the play menu
                 */
                frame.show(Frame.PLAYSNAKE);
            }
            /**
             * What should be done if the user clicks on the enter game button
             */
            else if(event.getSource() == frame.getJoinGame().getBtnEnterGame()) {
                /**
                 *
                 */
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
            /**
             * 
             */
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

                showExistingGames(frame);
                frame.show(Frame.JOINGAME);
                frame.getJoinGame().setText();
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
                if(deleteGame(frame))
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

            String login_password = frame.getUserLogin().getPassword().getText();
            String login_username = frame.getUserLogin().getUsername().getText();


            if (!login_password.equals("") && !login_username.equals(""))
            {
                User uo = new User();
                uo.setPassword(login_password);
                uo.setUsername(login_username);

                String Json = new Gson().toJson(uo);
                String dispatch = login_parser(sc.post(Json, "login/", frame), uo);

                if (dispatch.equals("Login successful")){
                    uo1 = uo;

                    sc.parser(sco.get("users/" + uo1.getId() + "/"), uo1);

                    //frame.getUserLogin().ClearLogin();

                    return true;
                }
                else if(dispatch.equals("Wrong username or password")){
                    JOptionPane.showMessageDialog(frame, "Something went wrong plz try again",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
                else if (dispatch.equals("Error in JSON")){
                    JOptionPane.showMessageDialog(frame, "Error in JSON",
                            "Error in JSON", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(frame, "Username or password was incorrect try again",
                    "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        return false;


            }

        public String login_parser(String string, User uo)
        {
            JSONParser jpo = new JSONParser();
            String dispatcho = new String();
            int id =0;

            try
            {
                Object dispo = jpo.parse(string);
                JSONObject jsono = (JSONObject) dispo;

                dispatcho = ((String)jsono.get("message"));

                System.out.println(dispatcho);
                uo.setId ((long) jsono.get("userid"));

                return dispatcho;
            }
            catch (Exception event)
            {
                event.printStackTrace();
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

            if (!field_name.equals("") && mapsize!= 0 && !controls.equals("")) {
                Game go = new Game();


                ui.setId(uo.getId());
                ui.setControls(controls);
                go.setName(field_name);
                go.setMapSize(mapsize);
                go.setHost(ui);

                /**
                 * Gson to Json
                 */
                String gtj = new Gson().toJson(go);

                String dispatch = createGame_parser(sc.post(gtj, "games/", frame));


                if (dispatch.equals(go.getName())) {
                    JOptionPane.showMessageDialog(frame, "Game created, time to challenge friends in "
                            + go.getName(), "Game created", JOptionPane.PLAIN_MESSAGE);

                    return true;
                } else if (dispatch.equals("Errors in JSON") || dispatch.equals("Something went wrong")) {
                    JOptionPane.showMessageDialog(frame, "Something went wrong probably a JSON Error",
                            "Error in JSON", JOptionPane.ERROR_MESSAGE);
                } else {
                    System.out.println("Error of other kinds");
                }

            }
        }

        catch(Exception event)
        {
            event.printStackTrace();
        }

        return false;
    }

    //Create game parser
    public String createGame_parser(String s)
    {
        JSONParser jpo = new JSONParser();
        String field_name = new String();

        try
        {
            Object dispo = jpo.parse(s);
            JSONObject jsono = (JSONObject) dispo;

            field_name = ((String) jsono.get("name"));

            Game go = new Game();
            go.setName(field_name);

            return field_name;
        }
        catch (Exception event)
        {
            event.printStackTrace();
        }
        return null;
    }

//_________________________________________________

    //Delete game
    public boolean deleteGame(Frame frame)
    {

        try
        {

            String id = frame.getDeleteGame().getInsertgameid().getText();
            System.out.println(id);


            if(!id.equals(""))
            {
                String dispatch = deleteGame_parser(sc.delete("games/" + id));

                if(dispatch.equals("Game was deleted"))
                {
                    return true;
                }
                else if(dispatch.equals("Failed. Game was not deleted"))
                {
                    JOptionPane.showMessageDialog(frame, "Game id does not exist try another", "Error"
                            , JOptionPane.ERROR_MESSAGE);
                }
                System.out.println(dispatch);
            }
        }
        catch (Exception event)
        {
            event.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    //Delete game parser
    public String deleteGame_parser(String string)
    {
        JSONParser jpo = new JSONParser();
        String dispatch = new String();

        try
        {
            Object disp = jpo.parse(string);
            JSONObject jsono = (JSONObject) disp;

            dispatch = ((String) jsono.get("message"));
        }
        catch (Exception event)
        {
            event.printStackTrace();
        }
        return dispatch;
    }


//__________________________________________


    public boolean joinExistingGame(Frame frame, User uo, UserInfo ui, Game go)
    {
        Gson gson;
        try {

            gson = new Gson();

            String controls = frame.getJoinGame().getControls();


            if(!controls.equals(""))
            {
                System.out.println(go.getGameId());
                ui.setId(uo.getId());
                ui.setControls(controls);
                go.setOpponent(ui);

                String gtj = gson.toJson(go);

                String dispatch = deleteGame_parser(sc.put("games/join", gtj));

                if(dispatch.equals("Game was joined"))
                {
                    Game go1 = getGame(sc.put("games/start", gtj));

                    System.out.println(go1.getWinner());

                    if(go1.getWinner().getWinner())
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
                            "Error in JSON", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        catch (Exception event)
        {
            event.printStackTrace();
        }
        return false;
    }

    //_________________________________________

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


    public void showExistingGames(Frame frame)
    {
        try
        {
            Game[] go = showExistingGames_parser(sc.get("games/open/"));

            for(Game go1 : go)
            {
                frame.getJoinGame().getBox().addItem(go1.getGameId());

                //Try of getting the chosen text in the combobox
                /*go1.setName();

                if(go1.getName().equals())
                {

                }*/

                System.out.println(go1.getGameId() + ":\t" + go1.getName());
            }
        }
        catch (Exception event)
        {
            event.printStackTrace();
        }
    }

    public Game[] showExistingGames_parser(String string)
    {
        try
        {
            Gson gson = new Gson();

            Game[] go = gson.fromJson(string, Game[].class);

            return go;
        }
        catch (Exception event)
        {
            event.printStackTrace();
        }
        return null;
    }

    public Game showExistingGamesInfo(Frame frame) {
        try {
            String dispatch = frame.getJoinGame().getBox().getSelectedItem().toString();

            Game go = getGame(sc.get("game/" + dispatch + "/"));

            frame.getJoinGame().getJlShowGame().setText("Game name: " + go.getName());

            return go;
        } catch (Exception event)
        {
            event.printStackTrace();
        }
        return null;
    }

    public void highscore(Frame frame)
    {
        try
        {
            ScoresInfo sio = highscore_parser(sc.get("scores/"));

            frame.getHighscore().getJlFirstScore().setText(String.valueOf(sio.getSt()));
            frame.getHighscore().getJlSecondScore().setText(String.valueOf(sio.getNd()));
            frame.getHighscore().getJlThirdScore().setText(String.valueOf(sio.getRd()));
            frame.getHighscore().getJlFourthScore().setText(String.valueOf(sio.getTh()));
            frame.getHighscore().getJlFifthScore().setText(String.valueOf(sio.getFifth()));
        }

        catch (Exception event)
        {
            JOptionPane.showMessageDialog(frame, "Connection error", "Connection error", JOptionPane.ERROR_MESSAGE);
            event.printStackTrace();
        }
    }

    public ScoresInfo highscore_parser(String s){

        JSONParser jpo = new JSONParser();

        long st;
        long nd;
        long rd;
        long th;
        long fifth;

        try
        {
            Object dispo = jpo.parse(s);
            JSONObject joo = (JSONObject) dispo;

            st = ((long) joo.get("no1"));
            nd = ((long) joo.get("no2"));
            rd = ((long) joo.get("no3"));
            th = ((long) joo.get("no4"));
            fifth = ((long) joo.get("no5"));

            ScoresInfo sio = new ScoresInfo();

            sio.setSt(st);
            sio.setNd(nd);
            sio.setRd(rd);
            sio.setTh(th);
            sio.setFifth(fifth);

            return sio;
        }
        catch (Exception event)
        {
            event.printStackTrace();
        }
        return null;
    }


}