package snake_client.Snake.SDK;

import java.util.Date;

/**
 * Created by nicolaiostergaard on 27/11/15.
 */


public class Game {

    /**
     * Declaring variables to the right data types that fits the variables
     * in some cases to other classes
     */

    //Sets the GameID as a long since it is a whole number with a lot of bits.
    private int gameId;
    //Sets the host equal to the class UserInfo
    private UserInfo host;
    //Sets the opponent equal to the class UserInfo
    private UserInfo opponent;
    //Sets the name as a String
    private String name;
    //Sets the status as a String
    private String status;
    //Outcommented since it couldnt respond with the controller, but it sets the Date to created (timestamp)
    //private Date created;
    //Sets the winner equal to the class UserInfo
    private UserInfo winner;
    //Sets the host_controls to a String
    /*private String host_controls;
    //Sets the opponent_controls to a String
    private String opponent_controls;*/
    //sets the mapsize to an int.
    private int mapSize;

    //Constructor of this class (not used)
    public Game()
    {}


    /**
     * Creates get method for GameID:
     * Defines object to a JButton and returns something of that object
     * Returns the data to the method caller (in this case the btnBack
     * which is the button added to the screen so the user can go back to the main menu).
     * @return
     */
    public int getGameId()
    {
        return gameId;
    }

    public void setGameId(int _gameId)
    {
        gameId = _gameId;
    }

    public UserInfo getHost()
    {
        return host;
    }

    public void setHost(UserInfo _host)
    {
        host = _host;
    }

    public UserInfo getOpponent()
    {
        return opponent;
    }

    public void setOpponent(UserInfo _opponent)
    {
        opponent = _opponent;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String _name)
    {
        name = _name;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String _status)
    {
        status = _status;
    }

    /*public Date getCreated()
    {
        return created;
    }

    public void setCreated(Date _created)
    {
        created = _created;
    }
*/
    public UserInfo getWinner()
    {
        return winner;
    }

    public void setWinner(UserInfo _winner)
    {
        winner = _winner;
    }

    /*public String getHost_controls()
    {
        return host_controls;
    }

    public void setHost_controls(String _host_controls)
    {
        host_controls = _host_controls;
    }

    public String getOpponent_controls()
    {
        return opponent_controls;
    }

    public void setOpponent_controls(String _opponent_controls)
    {
        opponent_controls = _opponent_controls;
    }
*/
    public int getMapSize()
    {
        return mapSize;
    }

    public void setMapSize(int _mapSize)
    {
        mapSize = _mapSize;
    }





}
