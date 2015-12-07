package snake_client.Snake.SDK;

import java.sql.Date;

/**
 * Created by nicolaiostergaard on 26/11/15.
 */
public class User {

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private Date created;
    private String status;
    private int type;

    public User()
    {}
        public long getId()
        {
            return id;
        }

        public void setId(long _id)
    {
        id = _id;
    }

    public String getFirst_name()
    {
        return firstName;
    }

    public void setFirst_name(String _first_name)
    {
        firstName = _first_name;
    }

    public String getLast_name()
    {
        return lastName;
    }

    public void setLast_name(String _last_name)
    {
        lastName = _last_name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String _email)
    {
        email = _email;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String _username)
    {
        username = _username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String _password)
    {
        password = _password;
    }

    public Date getCreated()
    {
        return created;
    }

    public void setCreated(Date _created)
    {
        created = _created;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String _status)
    {
        status = _status;
    }

    public int getType()
    {
        return type;
    }

    public void setType(int _type)
    {
        type = _type;
    }


    }


