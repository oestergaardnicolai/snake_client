package snake_client.Snake.LOGIC;

//GUI imports
import snake_client.Snake.GUI.Frame;

//SDK imports
import snake_client.Snake.SDK.User;
import snake_client.Snake.SDK.Game;
import snake_client.Snake.SDK.UserInfo;

//SDKCon imports
import snake_client.Snake.SDKCon.ServerConnection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import com.google.gson.Gson;
import java.net.UnknownHostException;
import java.io.IOException;
import javax.swing.*;

/**
 * Created by nicolaiostergaard on 13/11/15.
 */
public class Controller
{

    private static Socket socket;
    private static PrintWriter printWriter;
    private static Scanner sc;

    private Frame frame;
    //ServerConnection sco = new ServerConnection();

    User uo = new User();
    UserInfo uio = new UserInfo();


    public Controller(){

        frame = new Frame();
        frame.setVisible(true);


    }

    public void run(){

        // socketMethod();

        frame.getUserLogin().addActionListener(new UserLoginActionListener());
        frame.getUserMenu().addActionListener(new UserMenuActionListener());
        frame.getHighscore().addActionListener(new HighscoreActionListener());
        frame.getJoinGame().addActionListener(new JoinGameActionListener());
        frame.getPlay().addActionListener(new PlayActionListener());
        frame.getDeleteGame().addActionListener(new DeleteGameActionListener());
        frame.getRateGame().addActionListener(new RateGameActionListener());
        frame.getInstructions().addActionListener(new InstructionsActionListener());
        frame.getHowToPlay().addActionListener(new HowToPlayActionListener());
        frame.getSignUp().addActionListener(new SignUpActionListener());
        frame.show(Frame.LOGIN);
    }


    public void socketMethod(){

        try {


            socket = new Socket("localhost", 22381);

            printWriter = new PrintWriter(socket.getOutputStream(),true);
            printWriter.println("Woop WOop");

            sc = new Scanner(System.in);
            printWriter.println("Input: ");
            String string = sc.next();

            printWriter.println(string + " you have written.");

        } catch(Exception e) {
            System.out.println(e);
        }
    }

    private class UserLoginActionListener implements ActionListener{

        public void actionPerformed(ActionEvent event){



            if (event.getSource() == frame.getUserLogin().getBtnSignIn()){

                frame.show(Frame.MENU);
            }
            else if (event.getSource() == frame.getUserLogin().getBtnSignUp())
            {
                frame.show(Frame.SIGNUP);
            }
        }
    }

    private class UserMenuActionListener implements ActionListener{

        public void actionPerformed(ActionEvent event){

            if (event.getSource() == frame.getUserMenu().getBtnDeleteGame())
            {

            }
            else if (event.getSource() == frame.getUserMenu().getBtnHighscores())
            {

                frame.show(Frame.HIGHSCORE);

            }
            else if (event.getSource() == frame.getUserMenu().getBtnLogout())
            {

                frame.show(Frame.LOGIN);

            }
            else if (event.getSource() == frame.getUserMenu().getBtnPlay())
            {

                frame.show(Frame.PLAYSNAKE);

            }
            else if (event.getSource() == frame.getUserMenu().getBtnRateGame())
            {
                frame.show(Frame.RATEGAME);
            }
            else if (event.getSource() == frame.getUserMenu().getBtnInstructions())
            {
                frame.show(Frame.INSTRUCTIONS);
            }


        }
    }

    private class HighscoreActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {

            if (event.getSource() == frame.getHighscore().getBtnBack())
            {
                frame.show(Frame.MENU);
            }

        }
    }

    private class  JoinGameActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {

            if(event.getSource() == frame.getJoinGame().getBtnBack())
            {
                frame.show(Frame.PLAYSNAKE);
            }
            else if(event.getSource() == frame.getJoinGame())
            {

            }
            else if(event.getSource() == frame.getJoinGame().getBtnCancel())
            {
                frame.show(Frame.PLAYSNAKE);
            }
        }
    }

    private class PlayActionListener implements ActionListener{
        public void actionPerformed(ActionEvent event){

            if(event.getSource() == frame.getPlay().getBtnBack()){
                frame.show(Frame.MENU);

            }
            else if(event.getSource() == frame.getPlay().getBtnCreateGame())
            {

            }
            else if (event.getSource() == frame.getPlay().getBtnJoinGame()){
                frame.show(Frame.JOINGAME);
            }

        }
    }

    private class DeleteGameActionListener implements ActionListener {
        public void actionPerformed(ActionEvent event){

            if(event.getSource() == frame.getDeleteGame().getBtnBack())
            {

            }
            else if(event.getSource() == frame.getDeleteGame().getBtnDelete())
            {

            }

        }
    }

    private class RateGameActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == frame.getRateGame().getBtnBack())
            {
                frame.show(Frame.MENU);
            }

        }
    }

    private class InstructionsActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == frame.getInstructions().getBtnBack())
            {
                frame.show(Frame.MENU);
            }
            else if(event.getSource() == frame.getInstructions().getBtnHowToPlay())
            {
                frame.show(Frame.HOWTOPLAY);
            }
        }
    }

    private class HowToPlayActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == frame.getHowToPlay().getBtnBack())
            {
                frame.show(Frame.INSTRUCTIONS);
            }
        }
    }

    private class SignUpActionListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == frame.getSignUp().getBtnBack()) {
                frame.show(Frame.LOGIN);
            }
        }
    }


}