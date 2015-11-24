package snake_client.Snake.GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

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

        //Test of password
        JFrame f = new JFrame("Login Required");
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        f.setSize(500, 400);
        f.setResizable(false);
        f.setLocationByPlatform(true);
        f.setVisible(true);

        showLogin(f);


    }


    //Test of password
    private void showLogin(JFrame frame) {
        JPanel p = new JPanel(new BorderLayout(5,5));

        JPanel labels = new JPanel(new GridLayout(0,1,2,2));
        labels.add(new JLabel("User Name", SwingConstants.RIGHT));
        labels.add(new JLabel("Password", SwingConstants.RIGHT));
        p.add(labels, BorderLayout.WEST);

        JPanel controls = new JPanel(new GridLayout(0,1,2,2));
        JTextField username = new JTextField("Nicolai login");
        controls.add(username);
        JPasswordField password = new JPasswordField();
        password.addAncestorListener(new RequestFocusListener(false));
        controls.add(password);
        p.add(controls, BorderLayout.CENTER);

        //Prints message to the dialog box
        JOptionPane.showMessageDialog(
                frame, p, "Log In", JOptionPane.QUESTION_MESSAGE);
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

    //Class and inner Constructor to test of password
    class RequestFocusListener implements AncestorListener
    {
        private boolean removeListener;


        public RequestFocusListener()
        {
            this(true);
        }


        public RequestFocusListener(boolean removeListener)
        {
            this.removeListener = removeListener;
        }

        @Override
        public void ancestorAdded(AncestorEvent e)
        {
            JComponent component = e.getComponent();
            component.requestFocusInWindow();

            if (removeListener)
                component.removeAncestorListener( this );
        }

        @Override
        public void ancestorMoved(AncestorEvent e) {}

        @Override
        public void ancestorRemoved(AncestorEvent e) {}
    }
}