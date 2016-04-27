import java.awt.Color;
import javax.swing.JFrame;

public class bread extends JFrame
{
	public bread(front ob3 )
	{
		setSize(980, 700);
		setBackground(Color.black);
		setLocationRelativeTo(null);
		setResizable(true);
		setVisible(true);
		insertion obb = new insertion(this);
		this.add(obb);	
	}

}
