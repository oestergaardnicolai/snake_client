package snake_client.Snake.GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Created by nicolaiostergaard on 13/11/15.
 */

/**
 * This class contains the create game
 */
/**Extended JPanel which allow us to make windows extends Component, Container and JComponent
    *Used to group other components together.*/
public class CreateGame extends JPanel
{

    /**
     * Declares the variables
     */

    //Use JLabel to put text on the screen in this case "Create Game"
    private JLabel jlCreateGame;

    //Use JLabel to put text on the screen in this case "Set field name"
    private JLabel jlField_name;
    //Use of JTextField to collect data from the user in this case the field name
    private JTextField field_name;
    //Use JLabel to put text on the screen in this case "Set controls:
    private JLabel jlControls;
    //Use of JTextField to collect data from the user in this case the controls:
    private JTextField controls;

    //Use of JLabel to put text on the screen in this case "Set the mapsize of the field"
    private JLabel jlMapsize;
    //Use of JTextField to collect data from the user in this case the mapsize
    private JTextField mapsize;

    //Use of JButton to put a button on the screen in this case to go back to the main menu.
    private JButton btnBack;
    //Use of JButton to put a button on the screen in this case to create the game:
    private JButton btnCreate;

    /**
     * Created the constructor of the class used to create objects og the variables
     * and assign values to them because they are private variables.
     */
    public CreateGame()
    {
        /**
         * Adds the layout and sets the layout to null so i can set the bounds myself
         */
        setLayout(null);
        //Sets the backgroundcolor of the panel
        setBackground(Color.GRAY);

        /**
         * Take the declared object of jlCreateGame
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object
         * Adds the object to the screen
         */
        jlCreateGame = new JLabel("Create Game");
        jlCreateGame.setBounds(449, 57, 161, 33);
        add(jlCreateGame);

        /**
         * Take the declared object of jlField_name
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object (Where it should be on the window)
         * Adds the object to the screen
         */
        jlField_name = new JLabel("Set field name: ");
        jlField_name.setBounds(449, 100, 200, 33);
        add(jlField_name);

        /**
         * Take the declared object of field_name
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object (places the object at a specific place on the window)
         * Adds the object to the screen
         */
        field_name = new JTextField();
        field_name.setBounds(449, 125, 200, 33);
        add(field_name);
        field_name.setColumns(10);

        /**
         * Take the declared object of jlControls
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object (places the object at a specific place on the window)
         * Adds the object to the screen
         */
        jlControls = new JLabel("Set controls");
        jlControls.setBounds(449, 170, 200, 33);
        add(jlControls);

        /**
         * Take the declared object of controls
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object (places the object at a specific place on the window)
         * Adds the object to the screen
         */
        controls = new JTextField();
        controls.setBounds(449, 195, 200, 33);
        add(controls);
        controls.setColumns(10);

        /**
         * Take the declared object of jlMapsize
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object (places the object at a specific place on the window)
         * Adds the object to the screen
         */
        jlMapsize = new JLabel("Set the mapsize of the field");
        jlMapsize.setBounds(449, 240, 200, 33);
        add(jlMapsize);

        /**
         * Take the declared object of mapsize
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object (places the object at a specific place on the window)
         * Adds the object to the screen
         */
        mapsize = new JTextField();
        mapsize.setBounds(449, 265, 200, 33);
        add(mapsize);
        mapsize.setColumns(10);

        /**
         * Take the declared object of btnCreate
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object (places the object at a specific place on the window)
         * Adds the object to the screen
         */
        btnCreate = new JButton("Create");
        btnCreate.setBounds(449, 300, 200, 33);
        add(btnCreate);

        /**
         * Take the declared object of btnBack
         * and creates a new instance and initializes it in our values
         * Sets the bounds of the object (places the object at a specific place on the window)
         * Adds the object to the screen
         */
        btnBack = new JButton("<- Back to Play Game");
        btnBack.setBounds(83, 649, 171, 41);
        add(btnBack);

        //End of constructor
    }

    /**
     * Creates get method for jlCreateGame:
     * Defines object to a JLabel and returns something of that object
     * Returns the data to the method caller (in this case the jlCreateGame
     * which is the text set on the window).
     * @return
     */

    public JLabel getJlCreateGame()
    {
        return jlCreateGame;
    }

    /**
     * Creates get method for jlField_name:
     * Defines object to a JLabel and returns something of that object
     * Returns the data to the method caller (in this case the jlField_name
     * which is the text set on the window).
     * @return
     */
    public JLabel getJlField_name()
    {
        return jlField_name;
    }

    /**
     * Creates get method for field_name:
     * Defines object to a JTextField and returns something of that object
     * Returns the data to the method caller (in this case the field_name
     * which is the textfield for the user to type in the field_name).
     * @return
     */
    public JTextField getField_name()
    {
        return field_name;
    }

    /**
     * Creates get method for jlControls:
     * Defines object to a JLabel and returns something of that object
     * Returns the data to the method caller (in this case the jlControls
     * which is the text set on the window).
     * @return
     */
    public JLabel getJlControls()
    {
        return jlControls;
    }

    /**
     * Creates get method for controls:
     * Defines object to a JTextField and returns something of that object
     * Returns the data to the method caller (in this case the controls
     * which is the textfield for the user to type in the controls).
     * @return
     */
    public JTextField getControls()
    {
        return controls;
    }

    /**
     * Creates get method for jlMapsize:
     * Defines object to a JLabel and returns something of that object
     * Returns the data to the method caller (in this case the jlMapsize
     * which is the text set on the window).
     * @return
     */
    public JLabel getJlMapsize()
    {
        return jlMapsize;
    }

    /**
     * Creates get method for mapsize:
     * Defines data type to an int and returns something of that data type
     * Returns the data to the method caller (in this case the mapsize).
     * the parseInt is used to get the primitive data type of a String
     * (parse a String into an int)
     * @return
     */
    public int getMapsize()
    {
        return Integer.parseInt(mapsize.getText());
    }

    /**
     * Creates get method for btnBack:
     * Defines object to a JButton and returns something of that object
     * Returns the data to the method caller (in this case the btnBack
     * which is the button for the user to press to get back to the main menu).
     * @return
     */
    public JButton getBtnBack()
    {
        return btnBack;
    }

    /**
     * Creates get method for btnCreateGame:
     * Defines object to a JButton and returns something of that object
     * Returns the data to the method caller (in this case the btnCreateGame
     * which is the button for the user to press to create a new game).
     * @return
     */
    public JButton getBtnCreate()
    {
        return btnCreate;
    }

    /**
     * Creates ActionListeners for this panel to handle events
     * in this case it defines what should be done when the user
     * clicks on the button called btnBack or btnCreateGame.
     * @param al
     */
    public void addActionListener(ActionListener al)
    {
        btnBack.addActionListener(al);
        btnCreate.addActionListener(al);
    }
    //End of class CreateGame
}
