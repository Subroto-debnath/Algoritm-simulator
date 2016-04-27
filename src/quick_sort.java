import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseMotionListener;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;


public class quick_sort extends JPanel implements ActionListener
{
	JLabel lb=new JLabel("ITEM:");
	JLabel lb2=new JLabel("(Maximum 10)");
	JLabel lb3=new JLabel("Pivot = P");
	JLabel lb4=new JLabel("Start = S");
	
    JTextField txtf = new JTextField();
	
	JButton jb[] = new JButton[1320];
	
	JToggleButton step=new JToggleButton("Next  Step");
	JToggleButton sort = new JToggleButton("Quick  Sort");
	
	JPanel pnl = new JPanel(); 
	JScrollPane pane = new JScrollPane(pnl);
	
	JLabel image = new JLabel();
	JLabel image2 = new JLabel();
	
	String s,pp,ww;
	
	
	int array[]=new int[900];
	int column=120,row=11;
	int n=0,mm=11,hh=11,d=0,z=1;
	int mmm=0,hhh=0,ddd=0,zzz=0,jo=0;
	
	public quick_sort(binary ob4)
	{
		add(lb);
		add(lb2);
		add(lb3);
		add(lb4);
		add(txtf);
		add(step);

		add(sort);
		add(pane);
		add(image);
		add(image2);
		
		pnl.setBackground(Color.cyan);
		pnl.setLayout(new GridLayout(column,row));
		
		step.setBackground(Color.green);
		sort.setBackground(Color.green);
		
		setBackground(Color.cyan);

		Font ff = new Font("Arial", Font.BOLD,24);
		lb.setFont(new Font("Gill sans",Font.ITALIC,20));
		lb2.setFont(new Font("Gill sans",Font.ITALIC,20));
		lb3.setFont(new Font("Gill sans",Font.ITALIC,20));
		lb4.setFont(new Font("Gill sans",Font.ITALIC,20));
		lb2.setForeground(Color.RED);
		lb3.setForeground(Color.black);
		lb4.setForeground(Color.black);
		
		txtf.setFont(ff);
		
		for(int j=0;j<1320;j++)
		{
			jb[j]= new JButton();
			jb[j].setFont(ff);
			
			pnl.add(jb[j]);
		}
		
		pane.setVisible(false);
		image2.setVisible(false);
		step.addActionListener(this);
		sort.addActionListener(this);
		image.setIcon(new ImageIcon(getClass().getResource("images/QUI.PNG")));
		image2.setIcon(new ImageIcon(getClass().getResource("images/Quick sort.PNG")));
		
		
	}
	
	private Container getContentPane() {
		return null;
	}

	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		
		lb.setLocation(20,100);
		lb2.setLocation(100,140);
		lb3.setLocation(170,170);
		lb4.setLocation(300,170);
		
		image.setLocation(120,0);
		image2.setLocation(600,60);
		
		txtf.setLocation(80, 90);
		txtf.setSize(500, 50);
		
		step.setSize(120, 30);
		step.setLocation(420, 170);
		
		sort.setSize(120, 30);
		sort.setLocation(20, 170);
		
		pnl.setSize(800, 500);
		pnl.setLocation(20,220);
		
		
		pane.setSize(800, 450);
		pane.setLocation(20, 220);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==sort)
		{
		    s = txtf.getText();//string neya
		    Scanner scn = new Scanner(s);
		    while(scn.hasNext()){
		    	Global.a[n++] = scn.nextInt();
		    }
			//quick_sort suru
			recursion ob1=new recursion();
			ob1.p=0;
			ob1.r=n-1;
			ob1.n=n;
			ob1.quicksort(0,n-1);
			
		     for(int s=0;s<n;s++)
		     {
		    	 Global.quick[Global.num]=Global.a[s];
		    	//System.out.print(" "+Global.a[s]);
		    	 Global.num++;
		     }
			
			mm=n+mm;
		}
		
		
		
		if(e.getSource()==step)
		{
			if(step.isSelected())
			{
			  pane.setVisible(true);
			 for(;d<Global.num;d++)
			 {
				 if(hh==mm)
				 break;
				 pp= String.valueOf(Global.quick[d]);
				 hh++;
				 jb[hh].setText(pp);
				 

			 }
			 z++;
			 z++;
			 hh=11*z;
			 mm=n+hh;
			}
		else
		{
			if(jo<Global.co)
			{	
				hhh++;
				jb[hhh].setText("S");
				jb[hhh+Global.counti[ddd]].setText("i");
				jb[hhh+Global.countj[ddd]].setText("j");
				jb[hhh+Global.pivot[ddd]].setText("P");
				image2.setVisible(true);
				if(Global.counti[ddd]==0)
					jb[hhh+Global.counti[ddd]].setText("S, i");
				
				else if(Global.countj[ddd]==0)
					jb[hhh+Global.countj[ddd]].setText("S, j");
				else if(Global.countj[ddd]==Global.pivot[ddd])
					jb[hhh+Global.countj[ddd]].setText("P, j");
				else if(Global.counti[ddd]==Global.pivot[ddd])
					jb[hhh+Global.counti[ddd]].setText("P, i");
				

				int i=Global.counti[ddd];
				int j=Global.countj[ddd];
				while(i+1!=j)
				{
					jb[hhh+i+12].setBackground(Color.green);
					i++;
				}
				
				ddd++;
				zzz++;
				zzz++;
				hhh=11*zzz;
				jo++;
			}
			
		}
		
	}
	
	}
}
