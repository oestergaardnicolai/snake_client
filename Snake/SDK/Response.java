package snake_client.Snake.SDK;

/**
 * Created by nicolaiostergaard on 30/11/15.
 */
public class Response {

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;
    private int userid;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }



}

