package snake_client.Snake.SDK;

/**
 * Created by nicolaiostergaard on 29/11/15.
 */
public class ScoresInfo {

    //Class created for getting the information about the highscore locations

    private int st;
    private int nd;
    private int rd;
    private int th;
    private int fifth;

    public ScoresInfo() {
    }

    public int getSt() {
        return st;
    }

    public void setSt(int _st) {
        st = _st;
    }

    public int getNd()
    {
        return nd;
    }

    public void setNd(int _nd)
    {
        nd = _nd;
    }

    public int getRd()
    {
        return rd;
    }

    public void setRd(int _rd)
    {
        rd = _rd;
    }

    public int getTh()
    {
        return th;
    }

    public void setTh(int _th)
    {
        th = _th;
    }

    public int getFifth()
    {
        return fifth;
    }

    public void setFifth(int _fifth)
    {
        fifth = _fifth;
    }
}
