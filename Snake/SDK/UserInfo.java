package snake_client.Snake.SDK;

/**
 * Created by nicolaiostergaard on 30/11/15.
 */
public class UserInfo extends User {

    private int highscore;
    private int total_highscore;
    private boolean win_lose;
    private int kills;
    private String controls;

    public UserInfo()
    {}

    public int getHighscore()
    {
        return highscore;
    }

    public void setHighscore(int _highscore)
    {
        highscore = _highscore;
    }

    public int getTotal_highscore()
    {
        return total_highscore;
    }

    public void setTotal_highscore(int _total_highscore)
    {
        total_highscore = _total_highscore;
    }

    public boolean getWin_lose()
    {
        return win_lose;
    }

    public void setWin_lose(boolean _win_lose)
    {
        win_lose = _win_lose;
    }

    public int getKills()
    {
        return kills;
    }

    public void setKills(int _kills)
    {
        kills = _kills;
    }

    public String getControls()
    {
        return controls;
    }

    public void setControls(String _controls)
    {
        controls = _controls;
    }
}
