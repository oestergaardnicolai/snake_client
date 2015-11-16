package snake_client.Snake.GUI;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

/**
 * Created by nicolaiostergaard on 13/11/15.
 */
public class UserMenu extends JPanel
{

    private JLabel jlUserMenu;
    private JButton btnPlay;
    private JButton btnHighscores;
    private JButton btnDeleteGame;
    private JButton btnRateGame;
    private JButton btnInstructions;
    private JButton btnLogout;

    public UserMenu()
    {
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);

        jlUserMenu = new JLabel("USERMENU");
        jlUserMenu.setBounds(405, 152, 72, 33);
        add(jlUserMenu);

        Icon snake = new ImageIcon(getClass().getResource("snake.png"));
        btnPlay = new JButton("Play Snake ->", snake);
        btnPlay.setBackground(Color.GREEN);
        btnPlay.setOpaque(true);
        btnPlay.setBorderPainted(false);
        btnPlay.setBounds(355, 237, 171, 41);
        add(btnPlay);


        Icon highscore = new ImageIcon(getClass().getResource("highscore.png"));
        btnHighscores = new JButton("Highscores ->", highscore);
        btnHighscores.setBounds(355, 346, 171, 41);
        btnHighscores.setBackground(Color.ORANGE);
        btnHighscores.setOpaque(true);
        btnHighscores.setBorderPainted(false);
        add(btnHighscores);

        Icon delete = new ImageIcon(getClass().getResource("delete.png"));
        btnDeleteGame = new JButton("Delete Game ->", delete);
        btnDeleteGame.setBackground(Color.RED);
        btnDeleteGame.setOpaque(true);
        btnDeleteGame.setBorderPainted(false);
        btnDeleteGame.setBounds(355, 452, 171, 41);
        add(btnDeleteGame);

        btnRateGame = new JButton("Rate Game ->");
        btnRateGame.setBounds(355, 550, 171, 41);
        add(btnRateGame);

        btnInstructions = new JButton("Instructions ->");
        btnInstructions.setBounds(355, 600, 171, 41);
        add(btnInstructions);

        btnLogout = new JButton("<- Logout");
        btnLogout.setBounds(89, 649, 171, 41);
        add(btnLogout);

    }

    public JButton getBtnPlay()
    {
        return btnPlay;
    }

    public JButton getBtnHighscores()
    {
        return btnHighscores;
    }

    public JButton getBtnDeleteGame()
    {
        return btnDeleteGame;
    }

    public JButton getBtnLogout()
    {
        return btnLogout;
    }

    public JButton getBtnRateGame()
    {
        return btnRateGame;
    }

    public JButton getBtnInstructions()
    {
        return btnInstructions;
    }

    public void addActionListener(ActionListener al)
    {
        btnPlay.addActionListener(al);
        btnHighscores.addActionListener(al);
        btnDeleteGame.addActionListener(al);
        btnRateGame.addActionListener(al);
        btnInstructions.addActionListener(al);
        btnLogout.addActionListener(al);
    }
}