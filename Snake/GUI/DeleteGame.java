package snake_client.Snake.GUI;

import javax.swing.*;
import java.awt.event.*;

/**
 * Created by nicolaiostergaard on 13/11/15.
*/

/**
 * This class contains the Delete Game
 * Extended JPanel which allow us to make windows extends Component, Container and JComponent
 * Used to group other components together.*/

public class DeleteGame extends JPanel
{
    /**
     * Declare object Variables
     */

    //Use of JLabel to put text on the screen in this case "DELETE GAME"
    private JLabel jlDeleteGame;
    //Use of JLabel to put text on the screen in this case "Insert Game ID"
    private JLabel jlInsertGameId;
    //Use of JTextField to create a JTextField to collect data from the user in this case the game id
    private JTextField Insertgameid;
    //Use of JButton to create a button in this case to delete a game
    private JButton btnDelete;
    //Use of JButton to create a button in this case to give the user
    //the opportunity to go back to the main menu.
    private JButton btnBack;

    /**
     * Created the constructor for this class used to create objects of the variables
     * and assign values to them because they are private variables.
     */
    public DeleteGame()
    {
        /**
         * Adds the layout and sets the layout to null so i can set the bounds myself
         */
        setLayout(null);

        /**
         * Take the declared object of jlDeleteGame
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         */
        jlDeleteGame = new JLabel("DELETE GAME");
        jlDeleteGame.setBounds(406, 128, 170, 33);
        add(jlDeleteGame);

        /**
         * Take the declared object of jlInsertGameId
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         */
        jlInsertGameId = new JLabel("Insert Game ID ");
        jlInsertGameId.setBounds(395, 282, 191, 33);
        add(jlInsertGameId);

        /**
         * Take the declared object of InsertGameid
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         */
        Insertgameid = new JTextField();
        Insertgameid.setBounds(377, 367, 236, 39);
        add(Insertgameid);
        Insertgameid.setColumns(10);

        /**
         * Take the declared object of btnDelete
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         */
        btnDelete = new JButton("Delete ->");
        btnDelete.setBounds(405, 517, 171, 41);
        add(btnDelete);

        /**
         * Take the declared object of btnBack
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         * Uses ImageIcon to get the "back.png" picture and assign it to the button
         */
        Icon back = new ImageIcon(getClass().getResource("back.png"));
        btnBack = new JButton("<- Back", back);
        btnBack.setBounds(83, 649, 171, 41);
        add(btnBack);

        //End of constructor
    }

    /**
     * Creates get method for Insertgameid:
     * Defines object to a JTextField and returns something of that object
     * Returns the data to the method caller (in this case the Insertgameid
     * which is the JTextField set on the window for the user to type in the gameid
     * of the game the user wants deleted).
     * @return
     */
    public JTextField getInsertgameid()
    {
        return Insertgameid;
    }

    /**
     * Creates get method for btnDelete:
     * Defines object to a JButton and returns something of that object
     * Returns the data to the method caller (in this case the btnDelete
     * which is the button added to the screen so the user can delete a game).
     * @return
     */
    public JButton getBtnDelete()
    {
        return btnDelete;
    }

    /**
     * Creates get method for btnBack:
     * Defines object to a JButton and returns something of that object
     * Returns the data to the method caller (in this case the btnBack
     * which is the button added to the screen so the user can go back to the main menu).
     * @return
     */
    public JButton getBtnBack()
    {
        return btnBack;
    }

    /**
     * Creates ActionListeners for this panel to handle events
     * in this case it defines what should be done when the user
     * clicks on the button called btnBack or btnDelete.
     * @param al
     */
    public void addActionListener(ActionListener al)
    {

        btnDelete.addActionListener(al);
        btnBack.addActionListener(al);

    }

//End of the class DeleteGame
}
