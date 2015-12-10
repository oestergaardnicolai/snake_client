package snake_client.Snake.GUI;

import javax.swing.*;
import java.awt.event.*;

/**
 * Created by nicolaiostergaard on 13/11/15.
*/

/**
 * This class contains the Delete Game
 * Extends JPanel
 */

public class DeleteGame extends JPanel
{
    /**
     * Declare object Variables
     */

    //Declare variables
    private JLabel jlDeleteGame;
    private JLabel jlInsertGameId;
    private JTextField Insertgameid;
    private JButton btnDelete;
    private JButton btnBack;

    /**
     * Constructor used when the object is created to initialize the objects data
     */
    public DeleteGame()
    {
        /**
         * Adds the layout
         */
        setLayout(null);

        /**
         * Creating jlabel, places and adds it to the panel
         */
        jlDeleteGame = new JLabel("DELETE GAME");
        jlDeleteGame.setBounds(275, 20, 170, 33);
        add(jlDeleteGame);

        /**
         * Creating jlabel, places and adds it to the panel
         */
        jlInsertGameId = new JLabel("Insert Game ID ");
        jlInsertGameId.setBounds(225, 80, 191, 33);
        add(jlInsertGameId);

        /**
         * Creating jTextField, places and adds it to the panel
         * and sets the length of the textfield
         */
        Insertgameid = new JTextField();
        Insertgameid.setBounds(225, 130, 236, 39);
        add(Insertgameid);
        Insertgameid.setColumns(10);

        /**
         * Creating JButton, places and adds it to the panel
         */
        btnDelete = new JButton("Delete ->");
        btnDelete.setBounds(225, 180, 171, 33);
        add(btnDelete);

        /**
         * Creating JButton, places and adds it to the panel
         * and gives it a picture called "back"
         */
        Icon back = new ImageIcon(getClass().getResource("back.png"));
        btnBack = new JButton("<- Back", back);
        btnBack.setBounds(10, 325, 171, 33);
        add(btnBack);

        //End of constructor
    }

    /**
     * Creates getter method for Insergameid
     * @return
     */
    public JTextField getInsertgameid()
    {
        return Insertgameid;
    }

    /**
     * Creates getter method for btnDelete
     * @return
     */
    public JButton getBtnDelete()
    {
        return btnDelete;
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

        btnDelete.addActionListener(al);
        btnBack.addActionListener(al);

    }

//End of the class DeleteGame
}
