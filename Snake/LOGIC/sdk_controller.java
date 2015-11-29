package snake_client.Snake.LOGIC;

import snake_client.Snake.SDK.User;

import com.google.gson.Gson;
import snake_client.Snake.SDK.ServerConnection;

/**
 * Created by nicolaiostergaard on 27/11/15.
 */

public class sdk_controller {

    public static void login(String username, String password)
    {
        ServerConnection sc = new ServerConnection();

        User user1 = new User();
        user1.setPassword(password);
        user1.setUsername(username);

        String json = new Gson().toJson(user1);

        sc.post()
    }
}
