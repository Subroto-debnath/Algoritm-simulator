import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class sort extends JPanel implements ActionListener{
	int arr[] = new int[20];
	int binary[]=new int[80];
	int pr[]=new int [20];
	int green[]=new int[30];
	int red[]=new int[30];
	
	JLabel lb=new JLabel("ITEM:");
	JLabel lb1=new JLabel("Search Item:");
	JLabel lb4=new JLabel("(Maximum 15)");
	JLabel lb2=new JLabel("Result:");
	JLabel lb3=new JLabel();
	JLabel lb5=new JLabel("Use Sorted Data");
	
	JLabel image = new JLabel();
	
	String s,p,ll,pp;
	int mm=0,h=0,aa=0,r=0,i,po=0,tom=0,jerry=0,non=0,c=0;
	int count=0,x=0,y=0;
	
	JButton larr[] = new JButton[60];
	
	JTextField txtf = new JTextField();
	JTextField txtf2 = new JTextField();
	
	JToggleButton okay = new JToggleButton("Binary Search");
	JToggleButton step=new JToggleButton("Next  Step");
	JToggleButton defo =new JToggleButton("Default Value");
	
	JPanel pnl = new JPanel();
	
	public sort(quick ob)
	{
		setBackground(Color.cyan);
		Font ff = new Font("Arial", Font.BOLD,24);
		txtf.setFont(ff);
		txtf2.setFont(ff);
		txtf.setBackground(Color.WHITE);
		txtf2.setBackground(Color.WHITE);
     	add(lb);
		add(lb1);
		add(lb2);
		add(lb3);
		add(lb4);
		add(lb5);
		add(pnl);
		lb.setFont(new Font("Gill sans",Font.ITALIC,20));
		lb1.setFont(new Font("Gill sans",Font.ITALIC,20));
		lb2.setFont(new Font("Gill sans",Font.ITALIC,20));
		lb3.setFont(new Font("Gill sans",Font.ITALIC,20));
		lb5.setFont(new Font("Gill sans",Font.ITALIC,20));
		lb4.setFont(new Font("Gill sans",Font.ITALIC,20));
		lb4.setForeground(Color.red);
		
		lb2.setVisible(false);
		lb3.setVisible(false);
		
	    //pnl.setVisible(false);
		
		pnl.setBackground(Color.cyan);
		okay.setBackground(Color.green);
		step.setBackground(Color.green);
		defo.setBackground(Color.green);
		pnl.setLayout(new GridLayout(4,15));
	    
		add(txtf);
		add(txtf2);
		
		add(step);
		add(okay);
		add(defo);
		add(image);
		for(int j=0;j<60;j++)
		{
			larr[j]= new JButton();
			larr[j].setFont(ff);
			larr[j].setVisible(false);
			pnl.add(larr[j]);
		}
		
		okay.addActionListener(this);
		step.addActionListener(this);
		defo.addActionListener(this);
		image.setIcon(new ImageIcon(getClass().getResource("images/BINA.PNG")));
	}
protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		lb.setLocation(20,100);
		lb1.setLocation(20,155);
		lb2.setLocation(20,470);
		lb5.setLocation(600,130);
		lb4.setLocation(600,95);
		lb3.setLocation(95,470);
		
		image.setLocation(120,0);
		
		txtf.setLocation(80, 90);
		txtf.setSize(500, 50);
		
		txtf2.setLocation(140, 150);
		txtf2.setSize(100, 40);
		
		okay.setLocation(30, 210);
		
		step.setSize(120, 30);
		step.setLocation(340, 210);	
		defo.setLocation(500, 210);	
		
		pnl.setSize(1200, 800);
		pnl.setLocation(0,270);
		
	}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==okay)
	{
	    s = txtf.getText();//string neya
	    p=txtf2.getText();
	    int item=Integer.parseInt(p);//string to integer
	    Scanner scn = new Scanner(s);
	    while(scn.hasNext()){
	    	arr[count++] = scn.nextInt();
	    }
	    
		int beg,end,mid;//binary search shuru
		beg=0;
		end=count-1;
		mid=(beg+end)/2;
		int aaa=0,ggg=0;
		while(beg<=end)
		{
			x++;
			//System.out.println(x);
				for(int i=beg;i<=end;i++)
				{
				   binary[ggg]=arr[i];
				   ggg++;				   
				}	
			pr[aaa]=end-beg+1;
			aaa++;	
			if(item==arr[mid])
			{
				break;
			}
			if(item<arr[mid])
			{
				end=mid-1;
				green[po]=beg;
				red[po]=end+1;
			}
			
			else
			{
				beg=mid+1;
				green[po]=beg;
				red[po]=end+1;
			}
			po++;
			mid=(beg+end)/2;
			
		}
		if(arr[mid]==item)
		{
			ll= String.valueOf(arr[mid]);
			lb3.setText(ll);
		}
			
	}//binary search shesh
	
	if(e.getSource()==step)
	{
		pnl.setVisible(true);
		if(step.isSelected())
		{
			y++;
			//System.out.println("y="+y);
			//lb2.setVisible(true);
			//lb3.setVisible(true);
		
		if(x==y)
		{
			lb2.setVisible(true);
			lb3.setVisible(true);
		
		}
		h=15*aa;
		mm=pr[aa]+mm;
		
		for(;r<mm;r++)
		{
			pp= String.valueOf(binary[r]);
			larr[h+c].setText(pp);
			larr[h+c].setVisible(true);
			c++;
		}
		aa++;
		c=green[jerry];
		jerry++;
	}
	
		else
		{
			int a=green[tom];
			int b=red[tom];
			while(a!=b)
			{
				larr[non+a].setBackground(Color.green);
				a++;
			}
			
			tom++;
			non=tom*15;
		}	
}
}
}