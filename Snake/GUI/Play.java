package snake_client.Snake.GUI;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 * Created by nicolaiostergaard on 13/11/15.
 */

/**
 * This class contains the Play menu
 * Extended JPanel which allow us to make windows extends Component, Container and JComponent
 * Used to group other components together.*/
public class Play extends JPanel
{

    //Use of JLabel to put text on the screen in this case "PLAY GAME"
    private JLabel jlPlayGame;
    //Use of JButton to create a button in this case to give the user
    //the opportunity to go to the create game menu.
    private JButton btnCreateGame;
    //Use of JButton to create a button in this case to give the user
    //the opportunity to go back to the join game menu.
    private JButton btnJoinGame;
    //Use of JButton to create a button in this case to give the user
    //the opportunity to go back to the main menu.
    private JButton btnBack;

    /**
     * Created the constructor of this class used to create objects of the variables
     * and assign values to them because they are private variables.
     */
    public Play()
    {
        /**
         * Adds the layout and sets the layout to null so i can set the bounds myself
         */
        setLayout(null);
        //Sets the backgroundcolor of the panel to green
        setBackground(Color.GREEN);

        /**
         * Take the declared object of jlPlayGame
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         */
        jlPlayGame = new JLabel("PLAY GAME");
        jlPlayGame.setBounds(441, 126, 148, 33);
        add(jlPlayGame);

        /**
         * Take the declared object of btnCreateGame
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         */
        btnCreateGame = new JButton("Create new game ->");
        btnCreateGame.setBounds(422, 289, 187, 41);
        add(btnCreateGame);

        /**
         * Take the declared object of btnJoinGame
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         */
        btnJoinGame = new JButton("Join existing game ->");
        btnJoinGame.setBounds(422, 418, 187, 41);
        add(btnJoinGame);

        /**
         * Take the declared object of btnBack
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         */
        btnBack = new JButton("<- BACK TO MENU");
        btnBack.setBounds(26, 649, 171, 41);
        add(btnBack);
    }

    /**
     * Creates get method for btnCreateGame:
     * Defines object to a JButton and returns something of that object
     * Returns the data to the method caller (in this case the btnCreateGame
     * which is the button added to the screen so the user can enter the create game menu).
     * @return
     */
    public JButton getBtnCreateGame()
    {
        return btnCreateGame;
    }

    /**
     * Creates get method for btnJoinGame:
     * Defines object to a JButton and returns something of that object
     * Returns the data to the method caller (in this case the btnJoinGame
     * which is the button added to the screen so the user can enter the join game menu).
     * @return
     */
    public JButton getBtnJoinGame()
    {
        return btnJoinGame;
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
     * clicks on the button called btnBack, btnCreateGame or btnJoinGame.
     * @param al
     */
    public void addActionListener(ActionListener al)
    {
        btnCreateGame.addActionListener(al);
        btnJoinGame.addActionListener(al);
        btnBack.addActionListener(al);
    }
//End of class
}