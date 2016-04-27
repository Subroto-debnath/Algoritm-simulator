import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class radiax_front extends JFrame
{
	
	public radiax_front(front ob)
	{
		setSize(980,700);
		setVisible(true);
		setLocationRelativeTo(null);
		radiax rx=new radiax(this);
		this.add(rx);	
		setVisible(true);
		
	}

}
