package snake_client.Snake.GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Created by nicolaiostergaard on 14/11/15.
 */
public class RateGame extends JPanel
{
    private JLabel RateGame;
    private JLabel Information;
    private JRadioButton OneStar;
    private JRadioButton TwoStars;
    private JRadioButton ThreeStars;
    private JRadioButton FourStars;
    private JRadioButton FiveStars;
    private ButtonGroup group;
    private JButton btnBack;

    public RateGame()
    {
        setLayout(new FlowLayout());

//		RateGame = new JLabel("Rate Game");
//		RateGame.setBounds(null);
//		add(RateGame);
//
//		Information = new JLabel("Please rate game from 1 to 5, it will help us improve the game");
//		Information.setBounds(200, 200, 200, 200);
//		add(Information);

        //First parameter is what you want to appear on the button
        //True is check and false is unchecked
        OneStar = new JRadioButton("One star", false);
        TwoStars = new JRadioButton("Two stars", false);
        ThreeStars = new JRadioButton("Three stars", false);
        FourStars = new JRadioButton("Four stars", false);
        FiveStars = new JRadioButton("Five stars", false);
        add(OneStar);
        add(TwoStars);
        add(ThreeStars);
        add(FourStars);
        add(FiveStars);

        //They know when each other is checked
        group = new ButtonGroup();
        group.add(OneStar);
        group.add(TwoStars);
        group.add(ThreeStars);
        group.add(FourStars);
        group.add(FiveStars);

        btnBack = new JButton("<- Back");
        add(btnBack);
    }

    public JRadioButton getOneStar()
    {
        return OneStar;
    }

    public JRadioButton getTwoStars()
    {
        return TwoStars;
    }

    public JRadioButton getThreeStars()
    {
        return ThreeStars;
    }

    public JRadioButton getFourStars()
    {
        return FourStars;
    }

    public JRadioButton getFiveStars()
    {
        return FiveStars;
    }

    public JButton getBtnBack()
    {
        return btnBack;
    }

    public void addActionListener(ActionListener al)
    {
        OneStar.addActionListener(al);
        TwoStars.addActionListener(al);
        ThreeStars.addActionListener(al);
        FourStars.addActionListener(al);
        FiveStars.addActionListener(al);
        btnBack.addActionListener(al);
    }
}