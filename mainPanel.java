import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class mainPanel extends JPanel
{
    JButton b1, b2, b3;
    
    public mainPanel()
	{
		super();
                setLayout(null);
		setBackground(Color.black);               
                b1 = new JButton ("Design Team Info!");
                b1.setBounds(new Rectangle (50, 50, 200, 50));                             
                add (b1);
                
                
                b2 = new JButton ("Instructions!");
                b2.setBounds(new Rectangle (50, 120, 200, 50));                             
                add (b2);
                 
                
                b3 = new JButton ("Start!");
                b3.setBounds(new Rectangle (420, 300, 100, 50));                             
                add (b3);
                 
	}
 
}