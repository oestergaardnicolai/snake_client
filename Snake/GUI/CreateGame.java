package snake_client.Snake.GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Created by nicolaiostergaard on 13/11/15.
 */
public class CreateGame extends JPanel 
{


    private JLabel jlCreateGame;

    private JLabel jlField_name;
    private JTextField field_name;

    private JLabel jlControls;
    private JTextField controls;

    private JLabel jlMapsize;
    private JTextField mapsize;

    private JButton btnBack;

    public CreateGame()
    {
        setLayout(null);
        setBackground(Color.GRAY);

        jlCreateGame = new JLabel("Create Game");
        jlCreateGame.setBounds(449, 57, 161, 33);
        add(jlCreateGame);

        jlField_name = new JLabel("Set field name: ");
        jlField_name.setBounds(449, 100, 200, 33);
        add(jlField_name);

        field_name = new JTextField();
        field_name.setBounds(449, 125, 200, 33);
        add(field_name);
        field_name.setColumns(10);

        jlControls = new JLabel("Set controls");
        jlControls.setBounds(449, 170, 200, 33);
        add(jlControls);

        controls = new JTextField();
        controls.setBounds(449, 195, 200, 33);
        add(controls);
        controls.setColumns(10);

        jlMapsize = new JLabel("Set the mapsize of the field");
        jlMapsize.setBounds(449, 240, 200, 33);
        add(jlMapsize);

        mapsize = new JTextField();
        mapsize.setBounds(449, 265, 200, 33);
        add(mapsize);
        mapsize.setColumns(10);

        btnBack = new JButton("<- Back to Play Game");
        btnBack.setBounds(83, 649, 171, 41);
        add(btnBack);


    }

    public JLabel getJlCreateGame()
    {
        return jlCreateGame;
    }

    public JLabel getJlField_name()
    {
        return jlField_name;
    }

    public JTextField getField_name()
    {
        return field_name;
    }

    public JLabel getJlControls()
    {
        return jlControls;
    }

    public JTextField getControls()
    {
        return controls;
    }

    public JLabel getJlMapsize()
    {
        return jlMapsize;
    }

    public JTextField getMapsize()
    {
        return mapsize;
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
