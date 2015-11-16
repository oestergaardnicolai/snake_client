package snake_client.Snake.GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Created by nicolaiostergaard on 15/11/15.
 */
public class HowToPlay extends JPanel
{
    private JLabel jlHowToPlay;
    private JButton btnBack;

    public HowToPlay()
    {
        setLayout(null);

        jlHowToPlay = new JLabel("HOW TO PLAY");
        jlHowToPlay.setBounds(449, 200, 171, 33);
        add(jlHowToPlay);

        btnBack = new JButton("<- Back to Instructions");
        btnBack.setBounds(83, 649, 171, 41);
        add(btnBack);
    }

    public JLabel getJlHowToPlay()
    {
        return jlHowToPlay;
    }

    public JButton getBtnBack()
    {
        return btnBack;
    }

    public void addActionListener(ActionListener al)
    {
        btnBack.addActionListener(al);
    }
}
