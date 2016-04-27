import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.Border;


public class front extends JPanel implements ActionListener
{
	JLabel lb = new JLabel("Algorithm");
	JLabel lb2 = new JLabel("Simulator");
	JLabel lb3 = new JLabel("Searching & Sorting");
	
	JLabel image = new JLabel();
	JLabel image2 = new JLabel();
	JLabel image3 = new JLabel();
	JLabel image4 = new JLabel();
	JLabel image5 = new JLabel();
	JLabel image6 = new JLabel();
	JLabel image7 = new JLabel();
	
	JButton jb1=new JButton("Binary Search");
	JButton jb2=new JButton("Insertion Sort");
	JButton jb3=new JButton("Radix Sort");
	JButton jb4=new JButton("Quick Sort");
	JButton jb5=new JButton("User Manual");
	JButton jb6=new JButton("Reference");
	Graphics gg;
	
	
	public front (MAIN ob)
	{
		setOpaque(false);
		add(lb);
		add(lb2);
		add(lb3);
		add(jb1);
		add(jb2);
		add(jb3);
		add(jb4);
		add(jb5);
		add(jb6);
		add(image);
		jb1.add(image2);
		jb2.add(image3);
		jb3.add(image4);
		jb4.add(image5);
		jb5.add(image6);
		jb6.add(image7);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		jb6.addActionListener(this);
		
		jb1.setFont(new Font("Gill sans",Font.ITALIC,20));
		jb2.setFont(new Font("Gill sans",Font.ITALIC,20));
		jb3.setFont(new Font("Gill sans",Font.ITALIC,20));
		jb4.setFont(new Font("Gill sans",Font.ITALIC,20));
		jb5.setFont(new Font("Gill sans",Font.ITALIC,20));
		jb6.setFont(new Font("Gill sans",Font.ITALIC,10));
		
		lb.setFont(new Font("Harlow solid",Font.ITALIC,60));
		lb2.setFont(new Font("Harlow solid",Font.ITALIC,60));
		lb3.setFont(new Font("Harlow solid",Font.ITALIC,40));
		//lb4.setFont(new Font("Harlow solid",Font.ITALIC,40));
		
		
		jb1.setBackground(Color.WHITE);
		jb2.setBackground(Color.WHITE);
		jb3.setBackground(Color.WHITE);
		jb4.setBackground(Color.WHITE);
		jb5.setBackground(Color.WHITE);
		jb6.setBackground(Color.WHITE);
		
		jb1.setBorderPainted(false);
		jb2.setBorderPainted(false);
		jb3.setBorderPainted(false);
		jb4.setBorderPainted(false);
		jb5.setBorderPainted(false);
		jb6.setBorderPainted(false);
		
		lb.setForeground(Color.GREEN);
		lb2.setForeground(Color.GREEN);
		lb3.setForeground(Color.RED);
		image.setIcon(new ImageIcon(getClass().getResource("images/35.jpg")));
		image2.setIcon(new ImageIcon(getClass().getResource("images/binary.PNG")));
		image3.setIcon(new ImageIcon(getClass().getResource("images/Inserction.PNG")));
		image4.setIcon(new ImageIcon(getClass().getResource("images/Rad.PNG")));
		image5.setIcon(new ImageIcon(getClass().getResource("images/quick.PNG")));
		image6.setIcon(new ImageIcon(getClass().getResource("images/usd.PNG")));
		image7.setIcon(new ImageIcon(getClass().getResource("images/raj.PNG")));
		
		//lb4.setForeground(Color.RED);
	}
	public void paintComponent(Graphics g)
	{
      super.paintComponent(g);
		
		lb.setLocation(170,20);
		lb2.setLocation(320,90);
		lb3.setLocation(350,250);
		
		image.setLocation(0,0);
		image2.setLocation(0,0);
		image3.setLocation(0,0);
		image4.setLocation(0,0);
		image5.setLocation(0,0);
		image6.setLocation(0,0);
		image7.setLocation(0,0);
		
		//lb4.setLocation(520,250);
		jb1.setLocation(370,320 );
		jb1.setSize(300, 53);
		
		jb2.setLocation(370,400 );
		jb2.setSize(330, 49);
		
		jb3.setLocation(370,480);
		jb3.setSize(245, 52);
		
		jb4.setLocation(370,560 );
		jb4.setSize(253, 53);
		
		jb5.setLocation(20,320 );
		jb5.setSize(285,51);
		
		jb6.setLocation(20,400 );
		jb6.setSize(249,52);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand()=="Binary Search")
		{
			quick sr =new quick(this);//call class quick
		}
		if(e.getActionCommand()=="Quick Sort")
		{
			binary br =new binary(this);//call class quick
		}
		if(e.getActionCommand()=="Insertion Sort")
		{
			 bread obs =new  bread(this);//call class bread
		}
		if(e.getActionCommand()=="Radix Sort")
		{
			 radiax_front obs =new  radiax_front(this);//call class raxiax_front
		}
		if(e.getActionCommand()=="User Manual")
		{
			user ob=new user (this);
		}
		if(e.getActionCommand()=="Reference")
		{
			reference ob=new reference (this);
		}
		
	}
}