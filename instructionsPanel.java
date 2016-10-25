import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class instructionsPanel extends JPanel implements ActionListener 
{
    JButton backb1;
    public instructionsPanel()
	{
            backb1 = new JButton ("Back");
            backb1.addActionListener (this);
            add (backb1);
        }
    public void actionPerformed (ActionEvent event)
        {
            Object obj = event.getSource();
            
        }
}
