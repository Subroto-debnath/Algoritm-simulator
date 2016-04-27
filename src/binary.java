import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class binary extends  JFrame 
{	
		public binary(front ob2)
		{
			setSize(980,700);
			setVisible(true);
			setLocationRelativeTo(null);
			quick_sort st=new quick_sort(this);
			this.add(st);	
			
		}
}
