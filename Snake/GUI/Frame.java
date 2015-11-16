package snake_client.Snake.GUI;

import java.awt.*;
import com.apple.eawt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * Created by nicolaiostergaard on 13/11/15.
 */
public class Frame extends JFrame
{

    public static final String DELETEGAME = "name_514131298765432";
    public static final String PLAYSNAKE = "name_998877665544332";
    public static final String JOINGAME = "name_112233445566778";
    public static final String HIGHSCORE = "name_098765432109876";
    public static final String MENU = "name_123456789012344";
    public static final String LOGIN = "name_151515151515151";
    public static final String RATEGAME = "name_12345678912345";
    public static final String INSTRUCTIONS ="name_54321987654321";
    public static final String HOWTOPLAY ="name_01234567891234";
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

    /**
     * Create the frame.
     */
    public Frame() {

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
        contentPane.add(usermenu, MENU);

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

        c = (CardLayout) getContentPane().getLayout();
    }

    public UserLogin getUserLogin() {
        return userlogin;
    }

    public UserMenu getUserMenu() {
        return usermenu;
    }

    public Highscore getHighscore() {
        return highscore;
    }

    public JoinGame getJoinGame() {
        return joinGame;
    }

    public Play getPlay() {
        return play;
    }

    public DeleteGame getDeleteGame() {
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


    public void show(String card){
        c.show(this.getContentPane(), card);
    }

}