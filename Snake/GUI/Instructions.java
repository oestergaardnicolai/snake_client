package snake_client.Snake.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by nicolaiostergaard on 15/11/15.
 */
public class Instructions extends JPanel
{
    private JLabel jlInstructions;
    private JButton btnHowToPlay;
    private JButton btnSettings;
    private JButton btnBack;

    public Instructions()
    {
        setLayout(null);

        jlInstructions = new JLabel("Instructions");
        jlInstructions.setBounds(449, 100, 161, 33);
        add(jlInstructions);

        btnHowToPlay = new JButton("HOW TO PLAY");
        btnHowToPlay.setBounds(449, 250, 161, 33);
        add(btnHowToPlay);

        btnSettings = new JButton("SETTINGS");
        btnSettings.setBounds(449, 300, 161, 33);
        add(btnSettings);

        btnBack = new JButton("<- Back to menu");
        btnBack.setBounds(83, 649, 171, 41);
        add(btnBack);

    }

    public JLabel getJlInstructions()
    {
        return jlInstructions;
    }

    public JButton getBtnHowToPlay()
    {
        return btnHowToPlay;
    }

    public JButton getBtnSettings()
    {
        return btnSettings;
    }

    public JButton getBtnBack()
    {
        return btnBack;
    }

    public void addActionListener(ActionListener al)
    {
        btnHowToPlay.addActionListener(al);
        btnSettings.addActionListener(al);
        btnBack.addActionListener(al);
    }
}