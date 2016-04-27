import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;


public class insertion  extends JPanel implements ActionListener 
{
	JLabel lb=new JLabel("ITEM:");
	JLabel lb2=new JLabel("(Maximum 15)");
	//JLabel lb3=new JLabel("Pivot = P");
	//JLabel lb4=new JLabel("Start = S");
	
    JTextField txtf = new JTextField();
	
	JButton jb[] = new JButton[240];
	
	JToggleButton step=new JToggleButton("Next  Step");
	JToggleButton sort = new JToggleButton("Insertion  Sort");
	
	JPanel pnl = new JPanel(); 
	JScrollPane pane = new JScrollPane(pnl);
	
	JLabel image = new JLabel();
	JLabel image2 = new JLabel();
	
	String s,pp,ww;
	
	
	int array[]=new int[900];
	int a[]=new int [20];
	int tom[]=new int[20];
	int jerry[]=new int[20];
	int column=16,row=15;
	int n=1,mm=15,hh=15,h=0,d=1,z=1,num=0;
	int jo=0,count=1;
	
	public insertion(bread obb)
	{
		pnl.setBackground(Color.cyan);
		pnl.setLayout(new GridLayout(column,row));
		add(pane);
		
		add(lb);
		add(lb2);
		add(txtf);
		add(step);

		add(sort);
		//add(pane);
		add(image);
		add(image2);
		image2.setVisible(false);
		
		step.setBackground(Color.green);
		sort.setBackground(Color.green);
		
		setBackground(Color.cyan);

		Font ff = new Font("Arial", Font.BOLD,24);
		lb.setFont(new Font("Gill sans",Font.ITALIC,20));
		lb2.setFont(new Font("Gill sans",Font.ITALIC,20));
		lb2.setForeground(Color.RED);
		lb.setForeground(Color.black);
		
		txtf.setFont(ff);
		
		for(int j=0;j<240;j++)
		{
			jb[j]= new JButton();
			jb[j].setFont(ff);
			jb[j].setVisible(false);
			pnl.add(jb[j]);
		}
		
		pane.setVisible(false);
		
		step.addActionListener(this);
		sort.addActionListener(this);
		image.setIcon(new ImageIcon(getClass().getResource("images/INSWE.PNG")));
		image2.setIcon(new ImageIcon(getClass().getResource("images/insertion sort.PNG")));
	}

	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		
		lb.setLocation(20,100);
		lb2.setLocation(600,95);
		
		txtf.setLocation(80, 90);
		txtf.setSize(500, 50);
		
		image.setLocation(110,0);
		
		image2.setLocation(850,250);
		
		step.setSize(120, 30);
		step.setLocation(340, 170);
		
		sort.setSize(120, 30);
		sort.setLocation(20, 170);
			
		pane.setSize(800, 400);
		pane.setLocation(20, 220);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sort)
		{
		    s = txtf.getText();//string neya
		    Scanner scn = new Scanner(s);
		    while(scn.hasNext())
		    a[n++] = scn.nextInt();
		    n--;
		    row=n;
		    //insertion sort suru
		    int j,key,i;
	        for(int x=1;x<=n;x++)		        	
	        array[count++]=a[x];
		    for(j=2;j<=n;j++)
		    {
		        key=a[j];
		        i=j-1;
		        while((i>0)&&(a[i]>key))
		        {
		            a[i+1]=a[i];
		            i--;
		        }
		        a[i+1]=key;
		        tom[num]=i;
		        jerry[num]=j-1;
		        num++;
		        for(int x=1;x<=n;x++)		        	
		        array[count++]=a[x];
		        
		    }
		    pane.setVisible(true);
		    for(int x=1;x<=n;x++)
		    {
			 pp= String.valueOf(array[x]);
			 jb[h].setVisible(true);
			 jb[h++].setText(pp);
			 
		    }
		    mm=n+hh;
			
		}
		
		if(e.getSource()==step)
		{
			if(step.isSelected())
			{
				if(jo<num)
				{
				   jb[tom[jo]+hh-15].setBackground(Color.orange);
				   jb[jerry[jo]+hh-15].setBackground(Color.green);
				   jo++;
				   image2.setVisible(true);
				}
			}
			else
			{
				for(;d<count-n;d++)
				{
					if(hh==mm)
					break;
					pp= String.valueOf(array[d+n]);	
					jb[hh].setVisible(true);
					jb[hh++].setText(pp);
				}
				z++;
				hh=15*z;
				mm=n+hh;
			}
			
		}
		
	}

}
