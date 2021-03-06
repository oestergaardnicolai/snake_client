package snake_client.Snake.GUI;

import java.awt.*;
import javax.swing.*;

/**
 * Created by nicolaiostergaard on 13/11/15.
 */
public class Condition extends JPanel
{

    /**
     * Gets the screensize of the computer
    */
    /**
     * Toolkit method gets the screensize
     */
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    //Gets screenwidth
    private int screenWidth = (int) screenSize.getWidth();
    //Gets screenHeight
    private int screenHeight = (int) screenSize.getHeight();

    //sets Screenwidth and screenHeight
    private int frameWidth = screenWidth/2;
    private int frameHeight = screenHeight/2;

    //Getter methods
    public int getScreenHeight()
    {
        return screenHeight;
    }

    public int getScreenWidth()
    {
        return screenWidth;
    }

    public int getFrameHeight()
    {
        return frameHeight;
    }

    public int getFrameWidth()
    {
        return frameWidth;
    }

}