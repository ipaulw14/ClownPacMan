import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class designTeamInfoPanel extends JPanel implements ActionListener 
{
    JButton backb2;
    
    public designTeamInfoPanel()
	{
            backb2 = new JButton ("Back");
            backb2.addActionListener (this);
            add (backb2);
        }
    public void actionPerformed (ActionEvent event)
        {
            Object obj = event.getSource();
            
        }
        }

