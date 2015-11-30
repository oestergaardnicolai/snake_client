package snake_client.Snake.GUI;

import javax.swing.*;
import java.awt.event.*;

/**
 * Created by nicolaiostergaard on 13/11/15.
*/

public class DeleteGame extends JPanel
{

    private JLabel jlDeleteGame;
    private JLabel jlInsertGameId;
    private JTextField Insertgameid;
    private JButton btnDelete;
    private JButton btnBack;

    public DeleteGame()
    {

        setLayout(null);

        jlDeleteGame = new JLabel("DELETE GAME");
        jlDeleteGame.setBounds(406, 128, 170, 33);
        add(jlDeleteGame);

        jlInsertGameId = new JLabel("Insert Game ID ");
        jlInsertGameId.setBounds(395, 282, 191, 33);
        add(jlInsertGameId);

        Insertgameid = new JTextField();
        Insertgameid.setBounds(377, 367, 236, 39);
        add(Insertgameid);
        Insertgameid.setColumns(10);

        btnDelete = new JButton("Delete ->");
        btnDelete.setBounds(405, 517, 171, 41);
        add(btnDelete);

        Icon back = new ImageIcon(getClass().getResource("back.png"));
        btnBack = new JButton("<- Back", back);
        btnBack.setBounds(26, 774, 171, 41);
        add(btnBack);

    }

    public JTextField getInsertgameid()
    {
        return Insertgameid;
    }

    public JButton getBtnDelete()
    {
        return btnDelete;
    }

    public JButton getBtnBack()
    {
        return btnBack;
    }

    public void addActionListener(ActionListener al)
    {

        btnDelete.addActionListener(al);
        btnBack.addActionListener(al);

    }


}
