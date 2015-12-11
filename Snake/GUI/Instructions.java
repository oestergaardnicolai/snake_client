package snake_client.Snake.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by nicolaiostergaard on 15/11/15.
 */

/**
 * This class contains the GUI of the instructions screen
 */
public class Instructions extends JPanel
{

     //Declare variables
    private JLabel jlInstructions;
    private JButton btnHowToPlay;
    private JButton btnSettings;
    private JButton btnBack;

    //Constructor
    public Instructions()
    {
        //Ads layout
        setLayout(null);

        /**
         * Creating jlabel, places and adds it to the panel
         */
        jlInstructions = new JLabel("Instructions");
        jlInstructions.setBounds(275, 20, 161, 33);
        add(jlInstructions);

        /**
         * Creating JButton, places and adds it to the panel
         */
        btnHowToPlay = new JButton("HOW TO PLAY");
        btnHowToPlay.setBounds(225, 80, 161, 33);
        add(btnHowToPlay);

        /**
         * Creating JButton, places and adds it to the panel
         */
        btnSettings = new JButton("SETTINGS");
        btnSettings.setBounds(225, 130, 161, 33);
        add(btnSettings);

        /**
         * Creating JButton, places and adds it to the panel
         */
        btnBack = new JButton("<- Back to menu");
        btnBack.setBounds(10, 325, 171, 33);
        add(btnBack);

    }

    /**
     * Creates getter method for jlInstructions
     * @return
     */
    public JLabel getJlInstructions()
    {
        return jlInstructions;
    }

    /**
     * Creates getter method for btnHowToPlay
     * @return
     */
    public JButton getBtnHowToPlay()
    {
        return btnHowToPlay;
    }

    /**
     * Creates getter method for btnSettings
     * @return
     */
    public JButton getBtnSettings()
    {
        return btnSettings;
    }

    /**
     * Creates getter method for btnBack
     * @return
     */
    public JButton getBtnBack()
    {
        return btnBack;
    }

    /**
     * Creates ActionListeners for event handling of this panel
     * @param al is an object of ActionListener
     */
    public void addActionListener(ActionListener al)
    {
        btnHowToPlay.addActionListener(al);
        btnSettings.addActionListener(al);
        btnBack.addActionListener(al);
    }
}