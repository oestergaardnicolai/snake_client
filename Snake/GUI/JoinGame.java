package snake_client.Snake.GUI;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;


/**
 * Created by nicolaiostergaard on 13/11/15.
 */

/**
 * This class contains the JoinGame panel
 */

public class JoinGame extends JPanel
{
    private JLabel jlJoinGame;
    private JLabel jlOnlineGames;
    private JLabel jlControls;
    private JLabel jlShowGame;
    private JComboBox box;
    private JButton btnEnterGame;
    private JButton btnCancel;
    private JButton btnBack;
    private JTextField controls;


    //Constructor
    public JoinGame()
    {
        //Adds layout and sets backgroundcolor of this panel to gray
        setLayout(null);
        setBackground(Color.GRAY);

        /**
         * Creating jlabel, places and adds it to the panel
         */
        jlJoinGame = new JLabel("JOIN GAME");
        jlJoinGame.setBounds(275, 20, 136, 33);
        add(jlJoinGame);

        /**
         * Creating jlabel, places and adds it to the panel
         */
        jlOnlineGames = new JLabel("Games online at the moment");
        jlOnlineGames.setBounds(225, 80, 196, 33);
        add(jlOnlineGames);

        /**
         * Creating jlabel, places and adds it to the panel
         */
        jlShowGame = new JLabel("Games");
        jlShowGame.setBounds(225, 130, 252, 33);
        add(jlShowGame);

        /**
         * Creating jlabel, places and adds it to the panel
         */
        jlControls = new JLabel("Enter controls here");
        jlControls.setBounds(225, 180, 252, 33);
        add(jlControls);

        /**
         * Creating jTextField, places and adds it to the panel
         */
        controls = new JTextField();
        controls.setBounds(225, 230, 252, 33);
        add(controls);

        /**
         * Creating JComboBox, places and adds it to the panel
         */
        box = new JComboBox();
        box.setBounds(225, 280, 252, 39);
        add(box);

        /**
         * Creating JButton, places and adds it to the panel
         */
        btnEnterGame = new JButton("Enter game ->");
        btnEnterGame.setBounds(225, 320, 171, 41);
        add(btnEnterGame);

        /**
         * Creating JButton, places and adds it to the panel
         */
        btnBack = new JButton("<- Back to play");
        btnBack.setBounds(10, 325, 171, 33);
        add(btnBack);

        /**
         * Creating JButton, places and adds it to the panel
         */
        btnCancel = new JButton("Cancel");
        btnCancel.setBounds(511, 550, 171, 41);
        add(btnCancel);
    }

    /**
     * Creates getter method for box
     * @return
     */
    public JComboBox getBox()
    {
        return box;
    }

    /**
     * Creates getter method for btnEnterGame
     * @return
     */
    public JButton getBtnEnterGame()
    {
        return btnEnterGame;
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
     * Creates getter method for btnCancel
     * @return
     */
    public JButton getBtnCancel()
    {
        return btnCancel;
    }

    /**
     * Creates getter method for controls
     * @return
     */
    public String getControls()
    {
        return controls.getText();
    }

    /**
     * Creates getter method for jlShowGame
     * @return
     */
    public JLabel getJlShowGame()
    {
        return jlShowGame;
    }

    /**
     * Creates setter method for controls
     * @return
     */
    public void setText()
    {
        controls.setText("");
    }


    /**
     * Creates ActionListeners for event handling of this panel
     * @param al is an object of ActionListener
     */
    public void addActionListener(ActionListener al)
    {
        btnEnterGame.addActionListener(al);
        btnBack.addActionListener(al);
        btnCancel.addActionListener(al);
        box.addActionListener(al);
    }
}