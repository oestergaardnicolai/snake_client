package snake_client.Snake.GUI;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 * Created by nicolaiostergaard on 13/11/15.
 */

/**
 * This class contains the GUI part of the Highscore.
 * frame, all the event handling happens in the controller.
 * Extends JPanel
 * .*/
public class Highscore extends JPanel
{
    //Use of JLabel to put text on the screen in this case "Highscore (Top 5)"
    private JLabel jlHighscore;
    //Use of JLabel to put text on the screen in this case "1st place"
    private JLabel jlFirstPlace;
    /**
     * Declare rest of the variables for same
     * purpose
     */
    private JLabel jlFirstScore;
    private JLabel jlSecondPlace;
    private JLabel jlSecondScore;
    private JLabel jlThirdPlace;
    private JLabel jlThirdScore;
    private JLabel jlFourthPlace;
    private JLabel jlFourthScore;
    private JLabel jlFifthPlace;
    private JLabel jlFifthScore;
    private JButton btnBack;

    /**
     * Constructor used when the object is created to initialize the objects data
     */
    public Highscore()
    {
        /**
         * Adds the layout
         */
        setLayout(null);
        //Sets the backgroundcolor of the panel to yellow
        setBackground(Color.YELLOW);

        /**
         * Creating jlabel, places and adds it to the panel
         */
        jlHighscore = new JLabel("Highscore (Top 5)");
        jlHighscore.setBounds(275, 20, 161, 33);
        add(jlHighscore);

        /**
         * Creating jlabel, places and adds it to the panel
         */
        jlFirstPlace = new JLabel("1st place #SnakeGeneral");
        jlFirstPlace.setBounds(225, 70, 200, 33);
        add(jlFirstPlace);

        /**
         * Creating jlabel, places and adds it to the panel
         */
        jlFirstScore = new JLabel("");
        jlFirstScore.setBounds(225, 85, 200, 33);
        add(jlFirstScore);

        /**
         * Creating jlabel, places and adds it to the panel
         */
        jlSecondPlace = new JLabel("2nd place #SnakeColonel");
        jlSecondPlace.setBounds(225, 130, 200, 33);
        add(jlSecondPlace);

        /**
         * Creating jlabel, places and adds it to the panel
         */
        jlSecondScore = new JLabel("");
        jlSecondScore.setBounds(225, 145, 200, 33);
        add(jlSecondScore);

        /**
         * Creating jlabel, places and adds it to the panel
         */
        jlThirdPlace = new JLabel("3rd place #SnakeLieutenantColonel");
        jlThirdPlace.setBounds(225, 190, 200, 33);
        add(jlThirdPlace);

        /**
         * Creating jlabel, places and adds it to the panel
         */
        jlThirdScore = new JLabel("");
        jlThirdScore.setBounds(225, 205, 200, 33);
        add(jlThirdScore);

        /**
         * Creating jlabel, places and adds it to the panel
         */
        jlFourthPlace = new JLabel("4th place #SnakeMajor");
        jlFourthPlace.setBounds(225, 250, 200, 33);
        add(jlFourthPlace);

        /**
         * Creating jlabel, places and adds it to the panel
         */
        jlFourthScore = new JLabel("");
        jlFourthScore.setBounds(225, 265, 200, 33);
        add(jlFourthScore);

        /**
         * Creating jlabel, places and adds it to the panel
         */
        jlFifthPlace = new JLabel("5th place #SnakeCaptain");
        jlFifthPlace.setBounds(225, 310, 200, 33);
        add(jlFifthPlace);

        /**
         * Creating jlabel, places and adds it to the panel
         */
        jlFifthScore = new JLabel("");
        jlFifthScore.setBounds(225, 325, 200, 33);
        add(jlFifthScore);

        /**
         * Creating JButton, places and adds it to the panel
         * and gives it a picture called "back"
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