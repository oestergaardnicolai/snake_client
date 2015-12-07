package snake_client.Snake.SDK;

/**
 * Created by nicolaiostergaard on 30/11/15.
 */
public class UserInfo extends User {

    private int totalScore;
    private int score;
    private boolean winner;
    private int kills;
    private String controls;

    public UserInfo()
    {}

    public int getTotalScore()
    {
        return totalScore;
    }

    public void setTotalScore(int _totalScore)
    {
        totalScore = _totalScore;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int _score)
    {
        score = _score;
    }

    public boolean getWinner()
    {
        return winner;
    }

    public void setWinner(boolean _winner)
    {
        winner = _winner;
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
