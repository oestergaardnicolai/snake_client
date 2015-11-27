package snake_client.Snake.SDK;

/**
 * Created by nicolaiostergaard on 27/11/15.
 */
public class Scores {

    private int id;
    private int user_id;
    private int game_id;
    private int score;
    private int opponent_id;

    public Scores()
    {}

    public int getId()
    {
        return id;
    }

    public void setId(int _id)
    {
        id = _id;
    }

    public int getUser_id()
    {
        return user_id;
    }

    public void setUser_id(int _user_id)
    {
        user_id = _user_id;
    }

    public int getGame_id()
    {
        return game_id;
    }

    public void setGame_id(int _game_id)
    {
        game_id = _game_id;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int _score)
    {
        score = _score;
    }

    public int getOpponent_id()
    {
        return opponent_id;
    }

    public void setOpponent_id(int _opponent_id)
    {
        opponent_id = _opponent_id;
    }
}
