package snake_client.Snake.GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Created by nicolaiostergaard on 13/11/15.
 */
public class UserLogin extends JPanel
{
    private JLabel jlUserLogin;
    private JLabel jlUsername;
    private JTextField Username;
    private JLabel jlPassword;
    private JTextField Password;
    private JButton btnSignIn;

    public UserLogin()
    {
        Condition co = new Condition();

        int screenWidth = co.getScreenWidth();
        int screenHeight = co.getScreenHeight();

        double width = 0.109375*screenWidth;
        double height = 0.033333*screenHeight;

        int txt_width = (int) width;
        int txt_height = (int) height;

        System.out.println(txt_width);
        System.out.println(txt_height);
        setLayout(new FlowLayout());
        setBackground(Color.CYAN);

        jlUserLogin = new JLabel("LOGIN");
        jlUserLogin.setBounds(419, 155, 78, 33);
        add(jlUserLogin);

        jlUsername = new JLabel("Username/E-mail");
        jlUserLogin.setBounds(398, 290, 120, 33);
        add(jlUserLogin);

        Username = new JTextField("Enter username here");
        Username.setBounds(340, 333, txt_width, txt_height);
        Username.setFont(new Font("Italic", Font.ITALIC, 33));
        add(Username);
        Username.setColumns(25);

        jlPassword = new JLabel("Password");
        jlPassword.setBounds(398, 453, 115, 33);
        add(jlPassword);

        Password = new JTextField("Enter password here");
        Password.setBounds(340, 496, txt_width, txt_height);
        Password.setFont(new Font("Bold", Font.BOLD, 33));
        add(Password);
        Password.setColumns(10);

        btnSignIn = new JButton("Sign in ->");
        btnSignIn.setBounds(372, 621, 171, 41);
        add(btnSignIn);


    }

    public JTextField getUsername()
    {
        return Username;
    }

    public JTextField getPassword()
    {
        return Password;
    }

    public JButton getBtnSignIn()
    {
        return btnSignIn;
    }

    public void addActionListener(ActionListener al)
    {
        btnSignIn.addActionListener(al);
    }
}