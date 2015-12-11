package snake_client.Snake.SDK;

/**
 * Created by nicolaiostergaard on 29/11/15.
 */
public class ScoresInfo {

    //Class created for getting the information about the highscore locations

    //Declaring variables
    private long st;
    private long nd;
    private long rd;
    private long th;
    private long fifth;

    public ScoresInfo() {
    }

    //Creates getters and setters
    public long getSt() {
        return st;
    }

    public void setSt(long _st) {
        st = _st;
    }

    public long getNd()
    {
        return nd;
    }

    public void setNd(long _nd)
    {
        nd = _nd;
    }

    public long getRd()
    {
        return rd;
    }

    public void setRd(long _rd)
    {
        rd = _rd;
    }

    public long getTh()
    {
        return th;
    }

    public void setTh(long _th)
    {
        th = _th;
    }

    public long getFifth()
    {
        return fifth;
    }

    public void setFifth(long _fifth)
    {
        fifth = _fifth;
    }
}
