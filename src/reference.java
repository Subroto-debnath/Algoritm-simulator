import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class reference extends JFrame
{
	JPanel jp=new JPanel();
	JLabel image = new JLabel();
		public reference(front ob )
		{
			setSize(980, 700);
			setBackground(Color.black);
			setLocationRelativeTo(null);
			setResizable(true);
			setVisible(true);
			add(jp);
			jp.setSize(920,700);
			jp.setBackground(Color.black);
			jp.setLocation(0, 0);
			jp.add(image);
			image.setLocation(0, 0);
			image.setIcon(new ImageIcon(getClass().getResource("images/refa.PNG")));
	
		}
	

}
