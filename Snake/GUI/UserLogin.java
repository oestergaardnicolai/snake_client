package snake_client.Snake.GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

/**
 * Created by nicolaiostergaard on 13/11/15.
 */

/**
 * This class contains the User login
 * Extended JPanel which allow us to make windows extends Component, Container and JComponent
 * Used to group other components together.*/
public class UserLogin extends JPanel
{
    //Use of JLabel to put text on the screen in this case "LOGIN"
    private JLabel jlUserLogin;
    //Use of JLabel to put text on the screen in this case "Username/E-mail"
    private JLabel jlUsername;
    //Use of JTextField to create a JTextField to collect data from the user in this case the username
    private JTextField Username;
    //Use of JLabel to put text on the screen in this case "Password"
    private JLabel jlPassword;
    //Use of JPasswordField to create a JPasswordField to collect data from the user in this case the password
    //in blured form
    private JPasswordField Password;
    //Use of JButton to create a button in this case to sign in
    private JButton btnSignIn;
    //Use of JButton to create a button in this case to sign up
    private JButton btnSignUp;
    //Use of JLabel to put text on the screen in this case "SNAKE"
    private JLabel jlSnake;
    //Use of JLabel to put a picture on the screen in this case "bg.png"
    private JLabel jlBg;

    /**
     * Created the constructor for this class used to create objects of the variables
     * and assign values to them because they are private variables.
     */
    public UserLogin()
    {
        //Condition co = new Condition();

        //Adds the default layout
        setLayout(new FlowLayout());
        //Sets the backgroundcolor to green
        setBackground(Color.GREEN);

        /**
         * Take the declared object of jlUsername
         * and creates a new instance and initializes it in our values
         * Adds the object to the screen
         */
        jlUsername = new JLabel("Username/E-mail");
        add(jlUsername);

        /**
         * Take the declared object of jlUserLogin
         * and creates a new instance and initializes it in our values
         * Adds the object to the screen
         * Sets the length of the JTextField
         */
        Username = new JTextField("Enter username here");
        add(Username);
        Username.setColumns(16);

        /**
         * Take the declared object of jlPassword
         * and creates a new instance and initializes it in our values
         * Adds the object to the screen
         */
        jlPassword = new JLabel("Password");
        add(jlPassword);

        /**
         * Take the declared object of Password
         * and creates a new instance and initializes it in our values
         * Adds the object to the screen
         * Sets the length of the JPasswordField
         */
        Password = new JPasswordField("Enter password here");
        add(Password);
        Password.setColumns(11);

        /**
         * Take the declared object of btnSignIn
         * and creates a new instance and initializes it in our values
         * Adds the object to the screen
         */
        btnSignIn = new JButton("Sign in ->");
        add(btnSignIn);

        /**
         * Take the declared object of btnSignUp
         * and creates a new instance and initializes it in our values
         * Adds the object to the screen
         */
        btnSignUp = new JButton("Sign up ->");
        add(btnSignUp);

        /**
         * Take the declared object of jlBg
         * and creates a new instance and initializes it in our values
         * adds the object to the screen
         */
        Icon bg = new ImageIcon(getClass().getResource("bg.png"));
        jlBg = new JLabel("", bg, JLabel.CENTER);
        //jlBg.setLayout(new FlowLayout(FlowLayout.CENTER));
        add(jlBg);

    }

    /**
     * Creates get method for Username:
     * Defines object to a JTextField and returns something of that object
     * Returns the data to the method caller (in this case the Username
     * which is the JTextField set on the window for the user to type in the username).
     * @return
     */
    public JTextField getUsername()
    {
        return Username;
    }

    /**
     * Creates get method for Password
     * Defines object to a JPasswordField and returns something of that object
     * Returns the data to the method caller (in this case the password
     * which is the JPasswordField set on the window for the user to type in the users password
     * @return
     */
    public JTextField getPassword()
    {
        return Password;
    }

    /**
     * Creates get method for btnSignIn:
     * Defines object to a JButton and returns something of that object
     * Returns the data to the method caller (in this case the btnSingIn
     * which is the button added to the screen so the user can sign in).
     * @return
     */
    public JButton getBtnSignIn()
    {
        return btnSignIn;
    }

    /**
     * Creates get method for btnSignUp
     * Defines object to a JButton and returns something of that object
     * Returns the data to the method caller (in this case the btnSignUp
     * which is the button added to the screen so the user can get to the sign up menu).
     * @return
     */
    public JButton getBtnSignUp()
    {
        return btnSignUp;
    }

    /**
     * Creates ActionListeners for this panel to handle events
     * in this case it defines what should be done when the user
     * clicks on the button called btnSignUp or btnSignIn.
     * @param al
     */
    public void addActionListener(ActionListener al)
    {
        btnSignIn.addActionListener(al);
        btnSignUp.addActionListener(al);
    }

}