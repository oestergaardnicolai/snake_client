package snake_client.Snake.GUI;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * Created by nicolaiostergaard on 13/11/15.
 */

/**
 * This class contains the Frame (The window)
 * Extended JFrame which allow us to make windows and gives us the
 * basic windows features, the x, minimize, maximize
 .*/
public class Frame extends JFrame
{


    /**
     * Sets id to the different panels
     * Sets them to final to ensure that the variables value cant
     * be modified after they have been declared
     * Sets them static so they dont need a instance.
     */
    public static final String DELETEGAME = "Delete_Game";
    public static final String PLAYSNAKE = "Play_Snake";
    public static final String JOINGAME = "Join_Game";
    public static final String HIGHSCORE = "Highscore";
    public static final String USERMENU = "User_Menu";
    public static final String LOGIN = "Login";
    public static final String RATEGAME = "Rate_Game";
    public static final String INSTRUCTIONS ="Instructions";
    public static final String HOWTOPLAY ="How_To_Play";
    public static final String SIGNUP ="Sign_Up";
    public static final String CREATEGAME = "Create_Game";

    /*
        declare variables
     */
    private JPanel contentPane;
    private UserLogin userlogin;
    private CardLayout c;
    private UserMenu usermenu;
    private Highscore highscore;
    private ImageIcon imageIcon;
    private JoinGame joinGame;
    private Play play;
    private DeleteGame deleteGame;
    private RateGame rateGame;
    private Instructions instructions;
    private HowToPlay howtoplay;
    private SignUp signup;
    private CreateGame creategame;

    /**
     * Creates constructor of the class Frame to construct our objects
     */
    public Frame()
    {
        /**
         * Creating JPanel
         */
        contentPane = new JPanel();

        //Creating object of the condition class
        Condition co = new Condition();

        /**
         * adds the exit function.
         */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /**
         * Sets the size, and used with setLocationRelativeTo(null)
         */
        setSize(co.getFrameWidth(), co.getFrameHeight());
        /**
         * Replaces the contentPane
         */
        setContentPane(contentPane);
        /**
         * Sets the title of the application
         */
        setTitle("Snake");
        /**
         * Sets the application in the middle of the screen
         */
        setLocationRelativeTo(null);


        //Builds path to snake.png in GUI package
        imageIcon = new ImageIcon(this.getClass().getResource("snake.png"));

        //Uses setIconImage method to set the icon image to snake.png
        setIconImage(imageIcon.getImage());

        /**
         * Sets the border and layout of the panel
         */
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new CardLayout(0, 0));


        /**
         * Creating panels and adds them to
         * the contentPane panel
         */
        userlogin = new UserLogin();
        contentPane.add(userlogin, LOGIN);

        usermenu = new UserMenu();
        contentPane.add(usermenu, USERMENU);

        highscore = new Highscore();
        contentPane.add(highscore, HIGHSCORE);

        joinGame = new JoinGame();
        contentPane.add(joinGame, JOINGAME);

        play = new Play();
        contentPane.add(play, PLAYSNAKE);

        deleteGame = new DeleteGame();
        contentPane.add(deleteGame, DELETEGAME);

        rateGame = new RateGame();
        contentPane.add(rateGame, RATEGAME);

        instructions = new Instructions();
        contentPane.add(instructions, INSTRUCTIONS);

        howtoplay = new HowToPlay();
        contentPane.add(howtoplay, HOWTOPLAY);

        signup = new SignUp();
        contentPane.add(signup, SIGNUP);

        creategame = new CreateGame();
        contentPane.add(creategame, CREATEGAME);

        c = (CardLayout) getContentPane().getLayout();
    }

    /**
     * Creates getter method for UserLogin
     * @return
     */
    public UserLogin getUserLogin()
    {
        return userlogin;
    }

    /**
     * Creates getter method for usermenu
     * @return
     */
    public UserMenu getUserMenu()
    {
        return usermenu;
    }

    /**
     * Creates getter method for highscore
     * @return
     */
    public Highscore getHighscore()
    {
        return highscore;
    }

    /**
     * Creates getter method for joinGame
     * @return
     */
    public JoinGame getJoinGame()
    {
        return joinGame;
    }

    /**
     * Creates getter method for play
     * @return
     */
    public Play getPlay()
    {
        return play;
    }

    /**
     * Creates getter method for deleteGame
     * @return
     */
    public DeleteGame getDeleteGame()
    {
        return deleteGame;
    }

    /**
     * Creates getter method for rateGame
     * @return
     */
    public RateGame getRateGame()
    {
        return rateGame;
    }

    /**
     * Creates getter method for instructions
     * @return
     */
    public Instructions getInstructions()
    {
        return instructions;
    }

    /**
     * Creates getter method for howtoplay
     * @return
     */
    public HowToPlay getHowToPlay()
    {
        return howtoplay;
    }

    /**
     * Creates getter method for signup
     * @return
     */
    public SignUp getSignUp()
    {
        return signup;
    }

    /**
     * Creates getter method for creategame
     * @return
     */
    public CreateGame getCreateGame()
    {
        return creategame;
    }


    /**
     * Sends card to the frame
     * @param card
     */
    public void show(String card)
    {
        c.show(this.getContentPane(), card);
    }


}