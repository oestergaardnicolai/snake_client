package snake_client.Snake.GUI;

import java.awt.*;
import com.apple.eawt.*;
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
     * Sets them static since so they dont need a instance.
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

        //c = new CardLayout();


        contentPane = new JPanel();
        Condition co = new Condition();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(co.getFrameWidth(), co.getFrameHeight());
        setContentPane(contentPane);
        setTitle("Snake");
        setLocationRelativeTo(null);

        //Builds path to snake.png in GUI package
        imageIcon = new ImageIcon(this.getClass().getResource("snake.png"));

        //Uses setIconImage method to set the icon image to snake.png
        setIconImage(imageIcon.getImage());

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new CardLayout(0, 0));

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

    public UserLogin getUserLogin()
    {
        return userlogin;
    }

    public UserMenu getUserMenu()
    {
        return usermenu;
    }

    public Highscore getHighscore()
    {
        return highscore;
    }

    public JoinGame getJoinGame()
    {
        return joinGame;
    }

    public Play getPlay()
    {
        return play;
    }

    public DeleteGame getDeleteGame()
    {
        return deleteGame;
    }

    public RateGame getRateGame()
    {
        return rateGame;
    }

    public Instructions getInstructions()
    {
        return instructions;
    }

    public HowToPlay getHowToPlay()
    {
        return howtoplay;
    }

    public SignUp getSignUp()
    {
        return signup;
    }

    public CreateGame getCreateGame()
    {
        return creategame;
    }


    public void show(String card)
    {
        c.show(this.getContentPane(), card);
    }


}