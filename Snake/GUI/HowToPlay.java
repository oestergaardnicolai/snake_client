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
    private JTextArea jlW;
    private JTextArea jlS;
    private JTextArea jlA;
    private JTextArea jlD;
    private JButton btnBack;

    public HowToPlay()
    {
        setLayout(null);

        jlHowToPlay = new JLabel("HOW TO PLAY");
        jlHowToPlay.setBounds(449, 200, 171, 33);
        add(jlHowToPlay);

        jlA = new JTextArea("Press 'A' on your"
                + " keyboard to make the"
                + " snake move one step to the left", 6, 20);
        jlA.setBounds(200, 400, 150, 80);
        jlA.setFont(new Font("Serif", Font.PLAIN, 15));
        jlA.setLineWrap(true);
        jlA.setWrapStyleWord(true);
        jlA.setOpaque(false);
        add(jlA);

        jlW = new JTextArea("Press 'W' on your"
                + " keyboard to make the"
                + " snake move one step up", 6, 20);
        jlW.setBounds(200, 200, 150, 65);
        jlW.setFont(new Font("Serif", Font.PLAIN, 15));
        jlW.setLineWrap(true);
        jlW.setWrapStyleWord(true);
        jlW.setOpaque(false);
        add(jlW);

        jlS = new JTextArea("Press 'S' on your"
                + " keyboard to make the"
                + " snake move one step down", 6, 20);
        jlS.setBounds(449, 400, 150, 65);
        jlS.setFont(new Font("Serif", Font.PLAIN, 15));
        jlS.setLineWrap(true);
        jlS.setWrapStyleWord(true);
        jlS.setOpaque(false);
        add(jlS);

        jlD = new JTextArea("Press 'D' on your"
                + " keyboard to make the"
                + " snake move one step to the right", 6, 20);
        jlD.setBounds(449, 200, 150, 80);
        jlD.setFont(new Font("Serif", Font.PLAIN, 15));
        jlD.setLineWrap(true);
        jlD.setWrapStyleWord(true);
        jlD.setOpaque(false);
        add(jlD);



        btnBack = new JButton("<- Back to Instructions");
        btnBack.setBounds(83, 649, 171, 41);
        add(btnBack);
    }

    public JLabel getJlHowToPlay()
    {
        return jlHowToPlay;
    }

    public JTextArea getJlA()
    {
        return jlA;
    }

    public JTextArea getJlW()
    {
        return jlW;
    }

    public JTextArea getJlS()
    {
        return jlS;
    }

    public JTextArea getJlD()
    {
        return jlD;
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
