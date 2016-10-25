import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class myJPanel extends JPanel implements ActionListener
{
    mainPanel p1 = new mainPanel();	
    designTeamInfoPanel d1= new designTeamInfoPanel(); 
    instructionsPanel i1= new instructionsPanel(); 
    
    public myJPanel()
	{
		super();
		setBackground(Color.gray);		
		setLayout(new GridLayout(1,3));
		add(p1);
                p1.b1.addActionListener (this);
                p1.b2.addActionListener (this); 
                p1.b3.addActionListener (this); 
                d1.backb2.addActionListener (this);
                i1.backb1.addActionListener(this);
                
                        
	
	}
       public void actionPerformed (ActionEvent event)
        {
            Object obj = event.getSource();
            if (obj==p1.b1)
            {
                remove (p1);
                add (d1);
                validate ();
                repaint ();
            }
            if (obj==p1.b2)
            {
                remove (p1);
                add (i1);
                validate ();
                repaint ();
            }
            if (obj==p1.b3)
            {
//                remove ();
//                add ();
//                validate ();
//                repaint ();
            }
            if (obj==d1.backb2)
            {
                remove (d1);
                add (p1);
                validate ();
                repaint ();
            }
            if (obj==i1.backb1)
            {
                remove (i1);
                add (p1);
                validate ();
                repaint ();
            }
        }
}
