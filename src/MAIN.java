import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class MAIN  extends JFrame
{
	
	MAIN()
	{
		//setOpaque(false);
		setSize(980,700);
		
		setTitle("Algorithm Simulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		front fr =new front(this);
		this.add(fr); 
		setResizable(true);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new MAIN();
	}
}
