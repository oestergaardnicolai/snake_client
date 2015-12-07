package snake_client.Snake.GUI;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

/**
 * Created by nicolaiostergaard on 13/11/15.
 */

/**
 * This class contains the Delete Game
 * Extended JPanel which allow us to make windows extends Component, Container and JComponent
 * Used to group other components together.*/
public class UserMenu extends JPanel
{

    //Use of JLabel to put text on the screen in this case "USERMENU"
    private JLabel jlUserMenu;
    //Use of JButton to create a button in this case to give the user
    //the opportunity to go to the play menu.
    private JButton btnPlay;
    //Use of JButton to create a button in this case to give the user
    //the opportunity to go to the highscore menu.
    private JButton btnHighscores;
    //Use of JButton to create a button in this case to give the user
    //the opportunity to go to the delete game menu.
    private JButton btnDeleteGame;
    //Use of JButton to create a button in this case to give the user
    //the opportunity to go to the rate game menu.
    private JButton btnRateGame;
    //Use of JButton to create a button in this case to give the user
    //the opportunity to go to the instructionsmenu.
    private JButton btnInstructions;
    //Use of JButton to create a button in this case to give the user
    //the opportunity to logout to the userlogin.
    private JButton btnLogout;

    /**
     * Created the constructor for this class used to create objects of the variables
     * and assign values to them because they are private variables.
     */
    public UserMenu()
    {
        /**
         * Adds the layout and sets the layout to null so i can set the bounds myself
         */
        setLayout(null);
        //Sets the background color to gray
        setBackground(Color.LIGHT_GRAY);

        /**
         * Take the declared object of jlUserMenu
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         */
        jlUserMenu = new JLabel("USERMENU");
        jlUserMenu.setBounds(405, 152, 72, 33);
        add(jlUserMenu);

        /**
         * Take the declared object of btnPlay
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         * Sets the background color of the button
         * Uses ImageIcon to attach a picture to the button
         * Uses setOpaque(true) to paint the entire button
         */
        Icon snake = new ImageIcon(getClass().getResource("snake.png"));
        btnPlay = new JButton("Play Snake ->", snake);
        btnPlay.setBackground(Color.GREEN);
        btnPlay.setOpaque(true);
        btnPlay.setBorderPainted(false);
        btnPlay.setBounds(355, 237, 171, 41);
        add(btnPlay);

        /**
         * Take the declared object of btnHighscore
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         * Sets the background color of the button
         * Uses ImageIcon to attach a picture to the button
         * Uses setOpaque(true) to paint the entire button
         */
        Icon highscore = new ImageIcon(getClass().getResource("highscore.png"));
        btnHighscores = new JButton("Highscores ->", highscore);
        btnHighscores.setBounds(355, 346, 171, 41);
        btnHighscores.setBackground(Color.ORANGE);
        btnHighscores.setOpaque(true);
        btnHighscores.setBorderPainted(false);
        add(btnHighscores);

        /**
         * Take the declared object of btnDeleteGame
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         * Sets the background color of the button
         * Uses ImageIcon to attach a picture to the button
         * Uses setOpaque(true) to paint the entire button
         */
        Icon delete = new ImageIcon(getClass().getResource("delete.png"));
        btnDeleteGame = new JButton("Delete Game ->", delete);
        btnDeleteGame.setBackground(Color.RED);
        btnDeleteGame.setOpaque(true);
        btnDeleteGame.setBorderPainted(false);
        btnDeleteGame.setBounds(355, 452, 171, 41);
        add(btnDeleteGame);

        /**
         * Take the declared object of btnRateGame
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         */
        btnRateGame = new JButton("Rate Game ->");
        btnRateGame.setBounds(355, 550, 171, 41);
        add(btnRateGame);

        /**
         * Take the declared object of btnInstructions
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         */
        btnInstructions = new JButton("Instructions ->");
        btnInstructions.setBounds(355, 600, 171, 41);
        add(btnInstructions);

        /**
         * Take the declared object of btnLogout
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         */
        btnLogout = new JButton("<- Logout");
        btnLogout.setBounds(89, 649, 171, 41);
        add(btnLogout);
//End of constructor
    }

    /**
     * Creates get method for btnPlay
     * Defines object to a JButton and returns something of that object
     * Returns the data to the method caller (in this case the btnPlay
     * which is the button added to the screen so the user can go to the play menu).
     * @return
     */
    public JButton getBtnPlay()
    {
        return btnPlay;
    }

    /**
     * Creates get method for btnHighscore
     * Defines object to a JButton and returns something of that object
     * Returns the data to the method caller (in this case the btnHighscore
     * which is the button added to the screen so the user can go to the highscore menu).
     * @return
     */
    public JButton getBtnHighscores()
    {
        return btnHighscores;
    }

    /**
     * Creates get method for btnDeleteGame:
     * Defines object to a JButton and returns something of that object
     * Returns the data to the method caller (in this case the btnDeleteGame
     * which is the button added to the screen so the user can go to the delete game menu).
     * @return
     */
    public JButton getBtnDeleteGame()
    {
        return btnDeleteGame;
    }

    /**
     * Creates get method for btnLogout:
     * Defines object to a JButton and returns something of that object
     * Returns the data to the method caller (in this case the btnLogout
     * which is the button added to the screen so the user can go back to the userlogin).
     * @return
     */
    public JButton getBtnLogout()
    {
        return btnLogout;
    }

    /**
     * Creates get method for btnRateGame
     * Defines object to a JButton and returns something of that object
     * Returns the data to the method caller (in this case the btnRateGame
     * which is the button added to the screen so the user can go to the Rate game menu).
     * @return
     */
    public JButton getBtnRateGame()
    {
        return btnRateGame;
    }

    /**
     * Creates get method for btnInstructions
     * Defines object to a JButton and returns something of that object
     * Returns the data to the method caller (in this case the btnInstructions
     * which is the button added to the screen so the user can go to the Instructions menu).
     * @return
     */
    public JButton getBtnInstructions()
    {
        return btnInstructions;
    }

    /**
     * Creates ActionListeners for this panel to handle events
     * in this case it defines what should be done when the user
     * clicks on the button called btnPlay, btnHighscore,
     * btnDeleteGame, btnRateGame, btnInstructions, btnLogout.
     * @param al
     */
    public void addActionListener(ActionListener al)
    {
        btnPlay.addActionListener(al);
        btnHighscores.addActionListener(al);
        btnDeleteGame.addActionListener(al);
        btnRateGame.addActionListener(al);
        btnInstructions.addActionListener(al);
        btnLogout.addActionListener(al);
    }
}