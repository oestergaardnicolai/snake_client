package snake_client.Snake.GUI;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 * Created by nicolaiostergaard on 13/11/15.
 */
public class Highscore extends JPanel
{
    //Creating labels for the highscores:
    private JLabel jlHighscore;
    private JLabel jlFirstPlace;
    private JLabel jlFirstScore;
    private JLabel jlSecondPlace;
    private JLabel jlSecondScore;
    private JLabel jlThirdPlace;
    private JLabel jlThirdScore;
    private JLabel jlFourthPlace;
    private JLabel jlFourthScore;
    private JLabel jlFifthPlace;
    private JLabel jlFifthScore;
    private JButton btnBack;

    //Creates the Panel:
    //Creates the Constructor for the class Highscore
    public Highscore()
    {
        setLayout(null);
        setBackground(Color.YELLOW);

        jlHighscore = new JLabel("Highscore (Top 5)");
        jlHighscore.setBounds(449, 57, 161, 33);
        //adds the JLabel to the screen
        add(jlHighscore);

        jlFirstPlace = new JLabel("1st place #SnakeGeneral");
        jlFirstPlace.setBounds(449, 167, 200, 33);
        add(jlFirstPlace);

        jlFirstScore = new JLabel("");
        jlFirstScore.setBounds(366, 278, 282, 38);
        add(jlFirstScore);

        jlSecondPlace = new JLabel("2nd place #SnakeColonel");
        jlSecondPlace.setBounds(449, 284, 200, 33);
        add(jlSecondPlace);

        jlSecondScore = new JLabel("");
        jlSecondScore.setBounds(366, 405, 282, 38);
        add(jlSecondScore);

        jlThirdPlace = new JLabel("3rd place #SnakeLieutenantColonel");
        jlThirdPlace.setBounds(449, 407, 300, 33);
        add(jlThirdPlace);

        jlThirdScore = new JLabel("");
        jlThirdScore.setBounds(366, 515, 282, 38);
        add(jlThirdScore);

        jlFourthPlace = new JLabel("4th place #SnakeMajor");
        jlFourthPlace.setBounds(449, 521, 200, 33);
        add(jlFourthPlace);

        jlFourthScore = new JLabel("");
        jlFourthScore.setBounds(366, 640, 282, 38);
        add(jlFourthScore);

        jlFifthPlace = new JLabel("5th place #SnakeCaptain");
        jlFifthPlace.setBounds(449, 646, 200, 33);
        add(jlFifthPlace);

        jlFifthScore = new JLabel("");
        jlFifthScore.setBounds(366, 757, 282, 38);
        add(jlFifthScore);

        Icon back = new ImageIcon(getClass().getResource("back.png"));
        btnBack = new JButton(" BACK TO MENU", back);
        btnBack.setBounds(83, 649, 171, 41);
        add(btnBack);
    }

    public JLabel getJlFirstScore()
    {
        return jlFirstScore;
    }

    public JLabel getJlSecondScore()
    {
        return jlSecondScore;
    }

    public JLabel getJlThirdScore()
    {
        return jlThirdScore;
    }

    public JLabel getJlFourthScore()
    {
        return jlFourthScore;
    }

    public JLabel getJlFifthScore()
    {
        return jlFifthScore;
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