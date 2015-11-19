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
    private JButton btnSignUp;
    private JLabel jlSnake;
    private JLabel jlBg;

    public UserLogin()
    {
        Condition co = new Condition();

        setLayout(new FlowLayout());
        setBackground(Color.GREEN);

        jlUserLogin = new JLabel("LOGIN");
        add(jlUserLogin);

        jlUsername = new JLabel("Username/E-mail");
        add(jlUserLogin);

        Username = new JTextField("Enter username here");
        Username.setFont(new Font("Italic", Font.ITALIC, 15));
        add(Username);
        Username.setColumns(25);

        jlPassword = new JLabel("Password");
        add(jlPassword);

        Password = new JTextField("Enter password here");
        Password.setFont(new Font("Bold", Font.BOLD, 15));
        add(Password);
        Password.setColumns(11);

        btnSignIn = new JButton("Sign in ->");
        add(btnSignIn);

        btnSignUp = new JButton("Sign up ->");
        add(btnSignUp);

        jlSnake = new JLabel("SNAKE");
        add(jlSnake);

        Icon bg = new ImageIcon(getClass().getResource("bg.png"));
        jlBg = new JLabel("", bg, JLabel.CENTER);
        add(jlBg);


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

    public JButton getBtnSignUp()
    {
        return btnSignUp;
    }

    public void addActionListener(ActionListener al)
    {
        btnSignIn.addActionListener(al);
        btnSignUp.addActionListener(al);
    }
}