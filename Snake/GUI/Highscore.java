package snake_client.Snake.GUI;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 * Created by nicolaiostergaard on 13/11/15.
 */

/**
 * This class contains the Highscore
 * Extended JPanel which allow us to make windows extends Component, Container and JComponent
 * Used to group other components together.*/
public class Highscore extends JPanel
{
    //Use of JLabel to put text on the screen in this case "Highscore (Top 5)"
    private JLabel jlHighscore;
    //Use of JLabel to put text on the screen in this case "1st place"
    private JLabel jlFirstPlace;
    //Use of JLabel to put text on the screen in this case the highscore value of the 1st place
    private JLabel jlFirstScore;
    //Use of JLabel to put text on the screen in this case "2nd place"
    private JLabel jlSecondPlace;
    //Use of JLabel to put text on the screen in this case the highscore value of the 2nd place
    private JLabel jlSecondScore;
    //Use of JLabel to put text on the screen in this case "3rd place"
    private JLabel jlThirdPlace;
    //Use of JLabel to put text on the screen in this case the highscore value of the 3rd place
    private JLabel jlThirdScore;
    //Use of JLabel to put text on the screen in this case "4th place"
    private JLabel jlFourthPlace;
    //Use of JLabel to put text on the screen in this case the highscore value of the 4th place
    private JLabel jlFourthScore;
    //Use of JLabel to put text on the screen in this case "5th place"
    private JLabel jlFifthPlace;
    //Use of JLabel to put text on the screen in this case the highscore value of the 5th place
    private JLabel jlFifthScore;
    //Use of JButton to add a button to the screen in this case btnBack
    private JButton btnBack;

    /**
     * Created the constructor for this class used to create objects of the variables
     * and assign values to them because they are private variables.
     */
    public Highscore()
    {
        /**
         * Adds the layout and sets the layout to null so i can set the bounds myself
         */
        setLayout(null);
        //Sets the backgroundcolor of the panel to yellow
        setBackground(Color.YELLOW);

        /**
         * Take the declared object of jlHighscore
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         */
        jlHighscore = new JLabel("Highscore (Top 5)");
        jlHighscore.setBounds(275, 20, 161, 33);
        add(jlHighscore);

        /**
         * Take the declared object of jlFirstPlace
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         */
        jlFirstPlace = new JLabel("1st place #SnakeGeneral");
        jlFirstPlace.setBounds(225, 70, 200, 33);
        add(jlFirstPlace);

        /**
         * Take the declared object of jlFirstScore
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         */
        jlFirstScore = new JLabel("");
        jlFirstScore.setBounds(225, 85, 200, 33);
        add(jlFirstScore);

        /**
         * Take the declared object of jlSecondPlace
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         */
        jlSecondPlace = new JLabel("2nd place #SnakeColonel");
        jlSecondPlace.setBounds(225, 130, 200, 33);
        add(jlSecondPlace);

        /**
         * Take the declared object of jlSecondScore
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         */
        jlSecondScore = new JLabel("");
        jlSecondScore.setBounds(225, 145, 200, 33);
        add(jlSecondScore);

        /**
         * Take the declared object of jlThirdPlace
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         */
        jlThirdPlace = new JLabel("3rd place #SnakeLieutenantColonel");
        jlThirdPlace.setBounds(225, 190, 200, 33);
        add(jlThirdPlace);

        /**
         * Take the declared object of jlThirdScore
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         */
        jlThirdScore = new JLabel("");
        jlThirdScore.setBounds(225, 205, 200, 33);
        add(jlThirdScore);

        /**
         * Take the declared object of jlFourthPlace
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         */
        jlFourthPlace = new JLabel("4th place #SnakeMajor");
        jlFourthPlace.setBounds(225, 250, 200, 33);
        add(jlFourthPlace);

        /**
         * Take the declared object of jlFourthScore
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         */
        jlFourthScore = new JLabel("");
        jlFourthScore.setBounds(225, 265, 200, 33);
        add(jlFourthScore);

        /**
         * Take the declared object of jlFifthPlace
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         */
        jlFifthPlace = new JLabel("5th place #SnakeCaptain");
        jlFifthPlace.setBounds(225, 310, 200, 33);
        add(jlFifthPlace);

        /**
         * Take the declared object of jlFifthScore
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         */
        jlFifthScore = new JLabel("");
        jlFifthScore.setBounds(225, 325, 200, 33);
        add(jlFifthScore);

        /**
         * Take the declared object of btnBack
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         * Uses ImageIcon to attach the picture "back.png" to the button
         */
        Icon back = new ImageIcon(getClass().getResource("back.png"));
        btnBack = new JButton(" BACK TO MENU", back);
        btnBack.setBounds(10, 325, 171, 33);
        add(btnBack);
    //End of constructor
    }

    /**
     * Creates get method for jlFirstScore:
     * Defines object to a JLabel and returns something of that object
     * Returns the data to the method caller (in this case the highscore value of the
     * first place
     * @return
     */
    public JLabel getJlFirstScore()
    {
        return jlFirstScore;
    }

    /**
     * Creates get method for jlSecondScore
     * Defines object to a JLabel and returns something of that object
     * Returns the data to the method caller (in this case the highscore value of the
     * second place
     * @return
     */
    public JLabel getJlSecondScore()
    {
        return jlSecondScore;
    }

    /**
     * Creates get method for jlThirdScore
     * Defines object to a JLabel and returns something of that object
     * Returns the data to the method caller (in this case the highscore value of the
     * 3rd place
     * @return
     */
    public JLabel getJlThirdScore()
    {
        return jlThirdScore;
    }

    /**
     * Creates get method for jlFourthScore
     * Defines object to a JLabel and returns something of that object
     * Returns the data to the method caller (in this case the highscore value of the
     * 4th place
     * @return
     */
    public JLabel getJlFourthScore()
    {
        return jlFourthScore;
    }

    /**
     * Creates get method for jlFifthScore
     * Defines object to a JLabel and returns something of that object
     * Returns the data to the method caller (in this case the highscore value of the
     * 5th place
     * @return
     */
    public JLabel getJlFifthScore()
    {
        return jlFifthScore;
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
     * clicks on the button called btnBack.
     * @param al
     */
    public void addActionListener(ActionListener al)
    {
        btnBack.addActionListener(al);
    }

}