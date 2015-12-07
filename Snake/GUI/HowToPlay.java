package snake_client.Snake.GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Created by nicolaiostergaard on 15/11/15.
 */
public class HowToPlay extends JPanel
{
    /**
     * Use of JLabel to put text on the screen in this case "HOW TO PLAY"
     * private access modifier, visible to the class only
     */
    private JLabel jlHowToPlay;
    /**
     * Use of JTextArea for printing out a lot of text on the screen,
     * private access modifier, makes it visible for only this class
     */
    private JTextArea jtW;
    //Use of JTextArea for printing out a lot of text on the screen
    private JTextArea jtS;
    //Use of JTextArea for printing out a lot of text on the screen
    private JTextArea jtA;
    //Use of JTextArea for printing out a lot of text on the screen
    private JTextArea jtD;
    /**
     * Use of JButton to add a button on the How to play menu (in this case for
     * going back to the instructions menu.
     */
    private JButton btnBack;

    //Constructor of this class
    public HowToPlay()
    {
        //Sets the layout to null
        setLayout(null);

        /**
         * Take the declared object of jlDeleteGame
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         */
        jlHowToPlay = new JLabel("HOW TO PLAY");
        jlHowToPlay.setBounds(449, 200, 171, 33);
        add(jlHowToPlay);

        /**
         * creates a new instance, set bounds for where it should
         * be on the screen, sets the font for the text, sets the
         * linewrap and wrapstyleword to true for the design
         * sets opaque to false so the textareas has the same
         * colors as the background color.
         */
        jtA = new JTextArea("Press 'A' on your"
                + " keyboard to make the"
                + " snake move one step to the left", 6, 20);
        jtA.setBounds(200, 400, 150, 80);
        jtA.setFont(new Font("Serif", Font.PLAIN, 15));
        jtA.setLineWrap(true);
        jtA.setWrapStyleWord(true);
        jtA.setOpaque(false);
        add(jtA);

        /**
         * creates a new instance, set bounds for where it should
         * be on the screen, sets the font for the text, sets the
         * linewrap and wrapstyleword to true for the design
         * sets opaque to false so the textareas has the same
         * colors as the background color.
         */
        jtW = new JTextArea("Press 'W' on your"
                + " keyboard to make the"
                + " snake move one step up", 6, 20);
        jtW.setBounds(200, 200, 150, 65);
        jtW.setFont(new Font("Serif", Font.PLAIN, 15));
        jtW.setLineWrap(true);
        jtW.setWrapStyleWord(true);
        jtW.setOpaque(false);
        add(jtW);

        /**
         * creates a new instance, set bounds for where it should
         * be on the screen, sets the font for the text, sets the
         * linewrap and wrapstyleword to true for the design
         * sets opaque to false so the textareas has the same
         * colors as the background color.
         */
        jtS = new JTextArea("Press 'S' on your"
                + " keyboard to make the"
                + " snake move one step down", 6, 20);
        jtS.setBounds(449, 400, 150, 65);
        jtS.setFont(new Font("Serif", Font.PLAIN, 15));
        jtS.setLineWrap(true);
        jtS.setWrapStyleWord(true);
        jtS.setOpaque(false);
        add(jtS);

        /**
         * creates a new instance, set bounds for where it should
         * be on the screen, sets the font for the text, sets the
         * linewrap and wrapstyleword to true for the design
         * sets opaque to false so the textareas has the same
         * colors as the background color.
         */
        jtD = new JTextArea("Press 'D' on your"
                + " keyboard to make the"
                + " snake move one step to the right", 6, 20);
        jtD.setBounds(449, 200, 150, 80);
        jtD.setFont(new Font("Serif", Font.PLAIN, 15));
        jtD.setLineWrap(true);
        jtD.setWrapStyleWord(true);
        jtD.setOpaque(false);
        add(jtD);


        /**
         * Take the declared object of btnBack
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         */
        btnBack = new JButton("<- Back to Instructions");
        btnBack.setBounds(83, 649, 171, 41);
        add(btnBack);
    }

    /**
     * Creates get method for jlHowToPlay:
     * Defines object to a JLabel and returns something of that object
     * Returns the data to the method caller (in this case the text
     * "HOW TO PLAY"
     * @return
     */
    public JLabel getJlHowToPlay()
    {
        return jlHowToPlay;
    }

    /**
     * Creates get method for jtA:
     * Defines object to a JTextArea and returns something of that object
     * Returns the data to the method caller (in this case a lot of text
     * of how to control the snake).
     * @return
     */
    public JTextArea getJlA()
    {
        return jtA;
    }

    /**
     * Creates get method for jtW:
     * Defines object to a JTextArea and returns something of that object
     * Returns the data to the method caller (in this case a lot of text
     * of how to control the snake).
     * @return
     */
    public JTextArea getJlW()
    {
        return jtW;
    }

    /**
     * Creates get method for jtS:
     * Defines object to a JTextArea and returns something of that object
     * Returns the data to the method caller (in this case a lot of text
     * of how to control the snake).
     * @return
     */
    public JTextArea getJlS()
    {
        return jtS;
    }

    /**
     * Creates get method for jtD:
     * Defines object to a JTextArea and returns something of that object
     * Returns the data to the method caller (in this case a lot of text
     * of how to control the snake).
     * @return
     */
    public JTextArea getJlD()
    {
        return jtD;
    }

    /**
     * Creates get method for btnBack:
     * Defines object to a JButton and returns something of that object
     * Returns the data to the method caller.
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
