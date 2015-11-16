package snake_client.Snake.GUI;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 * Created by nicolaiostergaard on 13/11/15.
 */
public class Play extends JPanel
{
    //Creates the variables in the play game side of the menu:
    private JLabel jlPlayGame;
    private JButton btnCreateGame;
    private JButton btnJoinGame;
    private JButton btnBack;

    public Play()
    {
        setLayout(null);
        setBackground(Color.GREEN);

        jlPlayGame = new JLabel("PLAY GAME");
        jlPlayGame.setBounds(441, 126, 148, 33);
        add(jlPlayGame);

        btnCreateGame = new JButton("Create new game ->");
        btnCreateGame.setBounds(422, 289, 187, 41);
        add(btnCreateGame);

        btnJoinGame = new JButton("Join existing game ->");
        btnJoinGame.setBounds(422, 418, 187, 41);
        add(btnJoinGame);

        btnBack = new JButton("<- BACK TO MENU");
        btnBack.setBounds(26, 649, 171, 41);
        add(btnBack);
    }

    public JButton getBtnCreateGame()
    {
        return btnCreateGame;
    }

    public JButton getBtnJoinGame()
    {
        return btnJoinGame;
    }

    public JButton getBtnBack()
    {
        return btnBack;
    }

    public void addActionListener(ActionListener al)
    {
        btnCreateGame.addActionListener(al);
        btnJoinGame.addActionListener(al);
        btnBack.addActionListener(al);
    }
}