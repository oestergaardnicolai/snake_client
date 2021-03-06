package snake_client.Snake.GUI;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 * Created by nicolaiostergaard on 19/11/15.
 */

/**
 * This class creates the GUI of the SignUp panel
 * this clas contains only button handle events
 * but handles no data, thought for future development
 */
public class SignUp extends JPanel {



    private JLabel jlFirstName;
    private JTextField firstName;

    private JLabel jlLastName;
    private JTextField lastName;

    private JLabel jlUsername;
    private JTextField username;

    private JLabel jlMail;
    private JTextField mail;

    private JLabel jlPassword;
    private JTextField password;

    private JButton btnSignUp;
    private JButton btnBack;

    public SignUp()
    {

        setLayout(null);
        setBackground(Color.DARK_GRAY);

        jlFirstName = new JLabel("First name");
        jlFirstName.setBounds(449, 100, 200, 33);
        add(jlFirstName);

        firstName = new JTextField();
        firstName.setBounds(449, 125, 200, 33);
        add(firstName);

        jlLastName = new JLabel("Last name");
        jlLastName.setBounds(449, 170, 200, 33);
        add(jlLastName);

        lastName = new JTextField();
        lastName.setBounds(449, 195, 200, 33);
        add(lastName);

        jlUsername = new JLabel("Username");
        jlUsername.setBounds(449, 240, 200, 33);
        add(jlUsername);

        username = new JTextField();
        username.setBounds(449, 265, 200, 33);
        add(username);

        jlMail = new JLabel("E-mail");
        jlMail.setBounds(449, 310, 200, 33);
        add(jlMail);

        mail = new JTextField();
        mail.setBounds(449, 335, 200, 33);
        add(mail);

        jlPassword = new JLabel("Password 6 or more signs");
        jlPassword.setBounds(449, 380, 200, 33);
        add(jlPassword);

        password = new JTextField();
        password.setBounds(449, 405, 200, 33);
        add(password);

        btnSignUp = new JButton("Sign up now ->");
        btnSignUp.setBounds(449, 450, 200, 33);
        add(btnSignUp);

        btnBack = new JButton("<- Back to Userlogin");
        btnBack.setBounds(83, 649, 171, 41);
        add(btnBack);

    }

    public JLabel getJlFirstName()
    {
        return jlFirstName;
    }

    public JTextField getFirstName()
    {
        return firstName;
    }

    public JLabel getJlLastName()
    {
        return jlLastName;
    }

    public JTextField getLastName()
    {
        return lastName;
    }

    public JLabel getJlUsername()
    {
        return jlUsername;
    }

    public JTextField getUsername()
    {
        return username;
    }

    public JLabel getJlMail()
    {
        return jlMail;
    }

    public JTextField getMail()
    {
        return mail;
    }

    public JLabel getJlPassword()
    {
        return jlPassword;
    }

    public JTextField getPassword()
    {
        return password;
    }

    public JButton getBtnSignUp()
    {
        return btnSignUp;
    }

    public JButton getBtnBack()
    {
        return btnBack;
    }

    public void addActionListener(ActionListener al)
    {
        btnSignUp.addActionListener(al);
        btnBack.addActionListener(al);
    }


}

