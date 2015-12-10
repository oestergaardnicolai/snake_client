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
     * should implement the action listener.
     * This private inner class handles the event from when the user or Admin
     * is on the login screen.
     */
    private class UserLoginActionListener implements ActionListener{

        /**
         * Handles button event for this inner class
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
     * should implement the action listener.
     * This private inner class handles the event from what should be done when
     * the user or Admin presses something in the main menu
     * The user are here when he is logged correctly in.
     */
    private class UserMenuActionListener implements ActionListener{
        /**
         *Another actionPerformed method for button event handling
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
     * should implement the action listener.
     * This private inner class handles the event from what should be done when
     * the user or Admin presses a button in the highscore panel.
     */
    private class HighscoreActionListener implements ActionListener
    {
        /**
         * Another actionPerformed for handling button events
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
     * should implement the action listener.
     * This private inner class handles the event from what should be done when
     * the user or Admin presses something in the join game panel
     */
    private class  JoinGameActionListener implements ActionListener
    {
        /**
         * Another actionPerformed method for handling button events
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
                 * Prints out a winner message if joinexistinggames are met
                 */
                if (joinExistingGame(frame, uo, ui, go)) {
                    JOptionPane.showMessageDialog(frame, "Congrats, you won!", "Success!",
                            JOptionPane.PLAIN_MESSAGE);

                    /**
                     * Takes the user back to play menu after task has
                     * been performed
                     */
                    frame.show(Frame.PLAYSNAKE);
                    frame.getJoinGame().setText();
                    /**
                     * If JoinExistingGames arent met print out a
                     * lost message
                     */
                } else {
                    JOptionPane.showMessageDialog(frame, "You lost!", "Failure",
                            JOptionPane.WARNING_MESSAGE);
                    /**
                     * Takes the user back to the play menu after task
                     * has been performed
                     */
                    frame.show(Frame.PLAYSNAKE);
                    frame.getJoinGame().setText();
                }
            }
            /**
             * An else-if statement that states what should be done if
             * btncancel is pressed
             */
            else if(event.getSource() == frame.getJoinGame().getBtnCancel())
            {
                /**
                 * Takes the user back to the play menu
                 */
                frame.show(Frame.PLAYSNAKE);
            }
            /**
             * An else-if statement that states what should be done
             * if the user clicks on the combobox
             */
            else if(event.getSource() == frame.getJoinGame().getBox())
            {
                /**
                 * object of game seted equal to showExistingGameInfo
                 */
              go = showExistingGamesInfo(frame);
            }//End of if statement
        }//End of action performed
    }//End of inner class

    /**
     * Creates inner class for the play panel
     */
    private class PlayActionListener implements ActionListener{
        /**
         * Another actionPerformed method for handling button events
         * @param event
         */
        public void actionPerformed(ActionEvent event){

            /**
             * What happens if the user clicks on the btnback
             */
            if(event.getSource() == frame.getPlay().getBtnBack()){
                /**
                 * Shows the usermenu
                 */
                frame.show(Frame.USERMENU);

            }
            /**
             * what happens if the user clicks on the create game button
             */
            else if(event.getSource() == frame.getPlay().getBtnCreateGame())
            {
                /**
                 * Shows the create game screen
                 */
                frame.show(Frame.CREATEGAME);
            }
            /**
             * What happens if the user clicks on the join game button
             */
            else if (event.getSource() == frame.getPlay().getBtnJoinGame()){

                /**
                 * Shows the join game screen,
                 * shows the existing games in the combobox
                 */
                showExistingGames(frame);
                frame.show(Frame.JOINGAME);
                frame.getJoinGame().setText();
            } //End of if statement

        } //End of actionPerformed
    }//End of inner class

    /**
     * Creates inner class for the DeleteGame panel
     */
    private class DeleteGameActionListener implements ActionListener {
        /**
         * actionPerofrmed for handling button events
         * @param event
         */
        public void actionPerformed(ActionEvent event){

            /**
             * What happens if the user clicks on the back button
             */
            if(event.getSource() == frame.getDeleteGame().getBtnBack())
            {
                /**
                 * Shows the Usermenu
                 */
                frame.show(Frame.USERMENU);
            }
            /**
             * What hapens if the user clicks on the delete button
             */
            else if(event.getSource() == frame.getDeleteGame().getBtnDelete())
            {
                /**
                 * gets the getApi method
                 */
                getApi();
                /**
                 * If the deleteGame method is met, prints out a message
                 * saying the game is deleted and takes the user back to the
                 * main menu
                 */
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
            }//End of if statement

        }//End of actionPerformed
    }//End of inner class

    /**
     * Creates inner class for the RateGame panel
     */
    private class RateGameActionListener implements ActionListener
    {
        /**
         * actionPerformed method for handling button events
         * @param event
         */
        public void actionPerformed(ActionEvent event)
        {
            /**
             * Takes the user back to the main menu if he presses
             * the back button
             */
            if(event.getSource() == frame.getRateGame().getBtnBack())
            {
                frame.show(Frame.USERMENU);
            } //End of if statement

        }//End of actionPerformed
    }//End of inner class

    /**
     * Creates the inner class for the Instructions panel
     */
    private class InstructionsActionListener implements ActionListener
    {
        /**
         * actionPerformed for handling button events
         * @param event
         */
        public void actionPerformed(ActionEvent event)
        {
            /**
             * takes the user to the main menu if he presses the back button
             */
            if(event.getSource() == frame.getInstructions().getBtnBack())
            {
                frame.show(Frame.USERMENU);
            }
            /**
             * Takes the user to the how to play screen if the presses the how to
             * play button
             */
            else if(event.getSource() == frame.getInstructions().getBtnHowToPlay())
            {
                frame.show(Frame.HOWTOPLAY);
            }//End of if statement
        }//End of actionperformed
    }//end of inner class

    /**
     * Creates inner class for the how to play panel
     */
    private class HowToPlayActionListener implements ActionListener
    {
        /**
         * actionPerformed method for handling button events
         * @param event
         */
        public void actionPerformed(ActionEvent event)
        {
            /**
             * Takes the user to the instructions screen if he
             * presses the back button
             */
            if(event.getSource() == frame.getHowToPlay().getBtnBack())
            {
                frame.show(Frame.INSTRUCTIONS);
            }//End of if statement
        }//End of actionPerformed
    }//End of inner class

    /**
     * Contains only a back button since i didnt got the time
     * for implementing this function
     */
    private class SignUpActionListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == frame.getSignUp().getBtnBack()) {
                frame.show(Frame.LOGIN);
            }
        }
    }

    /**
     * Creates inner class for the createGame panel
     */
    private class CreateGameActionListener implements ActionListener
    {
        /**
         * Handle button events
         * @param event
         */
        public void actionPerformed(ActionEvent event)
        {

            /**
             * What happens if the user clicks on the create button
             */
            if (event.getSource() == frame.getCreateGame().getBtnCreate()) {

                /**
                 * Gets the getApi method
                 */
                getApi();
                /**
                 * if createGame are met, the user has created the
                 * game and gets back to the main menu
                 */
                if (createGame(frame, ui, uo))
                {
                    frame.show(Frame.USERMENU);
                }

            }
            /**
             * Takes the user back to the play menu if he clicks on the
             * back button
             */
            else if (event.getSource() == frame.getCreateGame().getBtnBack())
            {
                frame.show(Frame.PLAYSNAKE);
            }//End of if statement
        }//End of actionPerformed
    }//End of inner class

    /**
     * Gets the get Uniform Interface from the
     * ServerConnection class
     */
    public void getApi(){

        sc.get("");
    }


    /**
     * Creates Login method
     * @return
     */
    public boolean loginReg() {
        //Exception handler
        try {

            /**
             * Gets the username and password from the JTextFields
             */
            String login_password = frame.getUserLogin().getPassword().getText();
            String login_username = frame.getUserLogin().getUsername().getText();


            /**
             * If the password and username matches from the database
             */
            if (!login_password.equals("") && !login_username.equals(""))
            {
                /**
                 * new object of user,
                 */
                User uo = new User();
                /**
                 * Sets password and username in the user
                 * class from what the user types in the JTextFields
                 */
                uo.setPassword(login_password);
                uo.setUsername(login_username);

                /**
                 * Converts java object to json format
                 */
                String jo = new Gson().toJson(uo);
                /**
                 * sets dispatch equal to the loginparser
                 * and uses post from ServerConnection to create
                 * new resources
                 */
                String dispatch = login_parser(sc.post(jo, "login/", frame), uo);

                /**
                 * States what should be done if the dispatch
                 * equals the "Login successful" message from the server
                 */
                if (dispatch.equals("Login successful")){
                    uo1 = uo;

                    /**
                     * Reads the "users/" message from the server
                     * + the user id
                     */
                    sc.parser(sco.get("users/" + uo1.getId() + "/"), uo1);

                    return true;
                }
                /**
                 * If the dispatch = "Wrong username or password" message
                 * then print out an error message to the user
                 */
                else if(dispatch.equals("Wrong username or password")){
                    JOptionPane.showMessageDialog(frame, "Something went wrong plz try again",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
                /**
                 * If the dispatch = Error in JSON message,
                 * print out an error message to the user.
                 */
                else if (dispatch.equals("Error in JSON")){
                    JOptionPane.showMessageDialog(frame, "Error in JSON",
                            "Error in JSON", JOptionPane.ERROR_MESSAGE);
                }
            }//End of if statement
        }//End of try
        /**
         * Exception type that prints an error message to the user.
         */
        catch (Exception exception){
            JOptionPane.showMessageDialog(frame, "Username or password was incorrect try again",
                    "Error", JOptionPane.ERROR_MESSAGE);
            /**
             * Prints the stack trace of the exception to the system
             */
            exception.printStackTrace();
        }// End of catch
        return false;


            }//End of method

    /**
     * Creates the login parser
     * @param string
     * @param uo
     * @return
     */
        public String login_parser(String string, User uo)
        {
            /**
             * Making a json parser object for reading json data
             */
            JSONParser jpo = new JSONParser();
            String dispatcho = new String();
            int id =0;

            try
            {
                /**
                 * Reads the "message" using JSON
                 * and prints it
                 */
                Object dispo = jpo.parse(string);
                JSONObject jsono = (JSONObject) dispo;

                dispatcho = ((String)jsono.get("message"));

                System.out.println(dispatcho);
                /**
                 * Sets id to the userid read from
                 * server via json
                 */
                uo.setId ((long) jsono.get("userid"));

                /**
                 * returns message
                 */
                return dispatcho;
            }
            /**
             * Prints stack trace of the exception to the system
             */
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
            return null;
        } //End of parser



    //______________________________________________________________


    /**
     * Creates the create game method
     * @param frame object of Frame
     * @param ui object of UserInfo
     * @param uo object of User
     * @return
     */
    public boolean createGame(Frame frame, UserInfo ui, User uo)
    {
        try {
            /**
             * Takes the field name, mapsize and controls from what the user
             * types in the JTextFields
             */
            String field_name = frame.getCreateGame().getField_name().getText();
            int mapsize = frame.getCreateGame().getMapsize();
            String controls = frame.getCreateGame().getControls().getText();

            /**
             * stating what happens if mapsize isnt 0 and controls and field name
             * is equal to the input
             */
            if (!field_name.equals("") && mapsize!= 0 && !controls.equals("")) {
                /**
                 * New object of Game class
                 */
                Game go = new Game();

                /**
                 * Sets id, controls,
                 * name of the field,
                 * mapsize and host.
                 */
                ui.setId(uo.getId());
                ui.setControls(controls);
                go.setName(field_name);
                go.setMapSize(mapsize);
                go.setHost(ui);


                /**
                 * Converts java object to Json format
                 * (Gson To Json gtj)
                 */
                String gtj = new Gson().toJson(go);

                /**
                 * sets dispatch = the createGame_parser and
                 * creates gtj object
                 */
                String dispatch = createGame_parser(sc.post(gtj, "games/", frame));


                /**
                 * If the dispatch = the game name, it prints a message
                 * to the user about the creation of the game
                 */
                if (dispatch.equals(go.getName())) {
                    JOptionPane.showMessageDialog(frame, "Game created, time to challenge friends in "
                            + go.getName(), "Game created", JOptionPane.PLAIN_MESSAGE);

                    return true;

                }
                /**
                 * Error message printed to the user
                 */
                else if (dispatch.equals("Errors in JSON") || dispatch.equals("Something went wrong")) {
                    JOptionPane.showMessageDialog(frame, "Something went wrong probably a JSON Error",
                            "Error in JSON", JOptionPane.ERROR_MESSAGE);
                }
                /**
                 * Error message besides JSON error
                 */
                else
                {
                    System.out.println("Error of other kinds");
                }

            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }

        return false;
    }//End of method

    /**
     * Creates the createGame parser works the same way
     * as the earlier parsers.
     * reads name via Json, creates a new object of game
     * and sets the name of the game
     * @param s (string)
     * @return
     */
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
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        return null;
    }// End of parser

//_________________________________________________

    /**
     * DeleteGame method
     * @param frame object of Frame
     * @return
     */
    public boolean deleteGame(Frame frame)
    {

        try
        {

            /**
             * Gets the id from the user
             */
            String id = frame.getDeleteGame().getInsertgameid().getText();
            System.out.println(id);

            /**
             * Soft deletes the game via id and prints a message to
             * the user
             */
            if(!id.equals(""))
            {
                String dispatch = deleteGame_parser(sc.delete("games/" + id));

                if(dispatch.equals("Game was deleted"))
                {
                    return true;
                }
                /**
                 * If the dispatch = the message, print out error message
                 * to the user
                 */
                else if(dispatch.equals("Failed. Game was not deleted"))
                {
                    JOptionPane.showMessageDialog(frame, "Game id does not exist try another", "Error"
                            , JOptionPane.ERROR_MESSAGE);
                }
                System.out.println(dispatch);
            }
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }//End of method

    /**
     * deleteGame parser
     * This parser reads the "message" message from
     * JSON so other methods than just deletegame uses
     * this parser to avoid redundant code
     * @param s (String)
     * @return
     */
    public String deleteGame_parser(String s)
    {
        JSONParser jpo = new JSONParser();
        String dispatch = new String();

        try
        {
            Object disp = jpo.parse(s);
            JSONObject jsono = (JSONObject) disp;

            dispatch = ((String) jsono.get("message"));
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        return dispatch;
    }


//__________________________________________


    /**
     * Creates method for joining an existing game
     * @param frame Object of Frame
     * @param uo Object of User
     * @param ui Object of UserInfo
     * @param go Object of Game
     * @return
     */
    public boolean joinExistingGame(Frame frame, User uo, UserInfo ui, Game go)
    {
        Gson gson;
        try {

            //Sets gson = to Gson
            gson = new Gson();

            //Sets controls to the control JTextField
            String controls = frame.getJoinGame().getControls();


            if(!controls.equals(""))
            {
                System.out.println(go.getGameId());
                ui.setId(uo.getId());
                ui.setControls(controls);
                go.setOpponent(ui);

                //Converts gtj object to json format
                String gtj = gson.toJson(go);

                /**
                 * Updates the message "games/join" from the server
                 */
                String dispatch = deleteGame_parser(sc.put("games/join", gtj));

                /**
                 * Updates the winner
                 */
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
                /**
                 * prints error message because the game is closed
                 * (because it has the status finished).
                 */
                else if(dispatch.equals("Game closed"))
                {
                    JOptionPane.showMessageDialog(frame, "Game closed",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
                /**
                 * Prints error message about json converting problems
                 */
                else if (dispatch.equals("Error in JSON"))
                {
                    JOptionPane.showMessageDialog(frame, "Error in JSON",
                            "Error in JSON", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        return false;
    }

    //_________________________________________

    /**
     * Creates getGame method
     * @param s string
     * @return
     */
    public Game getGame(String s)
    {
        try
        {
            Gson gson = new Gson();

            /**
             * parses the JSON back into a Game
             */
            Game go = gson.fromJson(s, Game.class);

            return go;
        }
        catch (Exception exception)
        {
            /**
             * Show Exception details
             */
            exception.printStackTrace();
        }
        return null;
    }


    /**
     * Creates the showExistingGames method used for showing
     * the games in the combobox
     * @param frame
     */
    public void showExistingGames(Frame frame)
    {
        try
        {
            /**
             * Game object array sets = showExistingGames parser
             * which reads the "games/open" message
             */
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
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    /**
     * Converts json into a game object
     * @param s
     * @return
     */
    public Game[] showExistingGames_parser(String s)
    {
        try
        {
            Gson gson = new Gson();

            Game[] go = gson.fromJson(s, Game[].class);

            return go;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        return null;
    }

    /**
     * Creates showExistingGamesInfo method
     * reads the existing games and sets it so the user
     * can see it
     * @param frame
     * @return
     */
    public Game showExistingGamesInfo(Frame frame) {
        try {
            String dispatch = frame.getJoinGame().getBox().getSelectedItem().toString();

            Game go = getGame(sc.get("game/" + dispatch + "/"));

            frame.getJoinGame().getJlShowGame().setText("Game name: " + go.getName());

            return go;
        } catch (Exception exception)
        {
            exception.printStackTrace();
        }
        return null;
    }

    /**
     * Creates Highscore method which reads the "scores/" from the server
     * and sets it in the gui in the client
     * @param frame
     */
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

        catch (Exception exception)
        {
            JOptionPane.showMessageDialog(frame, "Connection error", "Connection error", JOptionPane.ERROR_MESSAGE);
            exception.printStackTrace();
        }
    }

    /**
     * Highscore parser that reads the highscore sent from the
     * Highscore class in the server.
     * @param s
     * @return
     */
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
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        return null;
    }


} //End of the constructor class.