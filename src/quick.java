import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class quick  extends  JFrame
{	
	public quick(front ob)
	{
		setSize(980,700);
		setVisible(true);
		setLocationRelativeTo(null);
		sort sr=new sort(this);
		this.add(sr);	
		setVisible(true);
	}
}
