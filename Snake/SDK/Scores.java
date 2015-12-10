package snake_client.Snake.SDK;

/**
 * Created by nicolaiostergaard on 27/11/15.
 */
public class Scores {

    private int id;
    private UserInfo user;
    private Game game;
    private int score;
    private UserInfo opponent;

    public Scores(int _id, UserInfo _user, Game _game, UserInfo _opponent, int _score)
    {
        _id = id;
        _user = user;
        _game = game;
        _opponent = opponent;
        _score = score;

    }

    public int getId()
    {
        return id;
    }

    public void setId(int _id)
    {
        id = _id;
    }

    public UserInfo getUser()
    {
        return user;
    }

    public void setUser(UserInfo _user)
    {
        user = _user;
    }

    public Game getGame()
    {
        return game;
    }

    public void setGame(Game _game)
    {
        game = _game;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int _score)
    {
        score = _score;
    }

    public UserInfo getOpponent()
    {
        return opponent;
    }

    public void setOpponent(UserInfo _opponent)
    {
        opponent = _opponent;
    }
}
