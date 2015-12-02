package snake_client.Snake.SDK;

import java.util.Date;

/**
 * Created by nicolaiostergaard on 27/11/15.
 */
public class Game {

    private long id;
    private UserInfo host;
    private UserInfo opponent;
    private String name;
    private String status;
    private Date created;
    private UserInfo winner;
    private String host_controls;
    private String opponent_controls;
    private int map_size;

    public Game()
    {}

    public long getId()
    {
        return id;
    }

    public void setId(long _id)
    {
        id = _id;
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

    public Date getCreated()
    {
        return created;
    }

    public void setCreated(Date _created)
    {
        created = _created;
    }

    public UserInfo getWinner()
    {
        return winner;
    }

    public void setWinner(UserInfo _winner)
    {
        winner = _winner;
    }

    public String getHost_controls()
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

    public int getMap_size()
    {
        return map_size;
    }

    public void setMap_size(int _map_size)
    {
        map_size = _map_size;
    }





}
