package snake_client.Snake.GUI;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;


/**
 * Created by nicolaiostergaard on 13/11/15.
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


    public JoinGame()
    {
        setLayout(null);
        setBackground(Color.GRAY);

        jlJoinGame = new JLabel("JOIN GAME");
        jlJoinGame.setBounds(529, 79, 136, 33);
        add(jlJoinGame);

        jlOnlineGames = new JLabel("Games online at the moment");
        jlOnlineGames.setBounds(499, 252, 196, 33);
        add(jlOnlineGames);

        jlShowGame = new JLabel("Games");
        jlShowGame.setBounds(471, 100, 252, 33);
        add(jlShowGame);

        jlControls = new JLabel("Enter controls here");
        jlControls.setBounds(471, 350, 252, 33);
        add(jlControls);

        controls = new JTextField();
        controls.setBounds(471, 400, 252, 33);
        add(controls);

        box = new JComboBox();
        box.setBounds(471, 313, 252, 39);
        add(box);

        btnEnterGame = new JButton("Enter game ->");
        btnEnterGame.setBounds(511, 479, 171, 41);
        add(btnEnterGame);

        btnBack = new JButton("<- Back to play");
        btnBack.setBounds(26, 649, 171, 41);
        add(btnBack);

        btnCancel = new JButton("Cancel");
        btnCancel.setBounds(511, 550, 171, 41);
        add(btnCancel);
    }

    public JComboBox getBox()
    {
        return box;
    }

    public JButton getBtnEnterGame()
    {
        return btnEnterGame;
    }

    public JButton getBtnBack()
    {
        return btnBack;
    }

    public JButton getBtnCancel()
    {
        return btnCancel;
    }

    public String getControls()
    {
        return controls.getText();
    }

    public JLabel getJlShowGame()
    {
        return jlShowGame;
    }

    public void setText()
    {
        controls.setText("");
    }


    public void addActionListener(ActionListener al)
    {
        btnEnterGame.addActionListener(al);
        btnBack.addActionListener(al);
        btnCancel.addActionListener(al);
        box.addActionListener(al);
    }
}