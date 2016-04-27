import java.awt.Color;
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


public class radiax extends JPanel implements ActionListener
{
	JLabel lb=new JLabel("ITEM:");
	JLabel lb2=new JLabel("(Maximum 10 Numbers of 3 Digits)");
	
    JTextField txtf = new JTextField();
	
	JButton jb[] = new JButton[120];
	
	JToggleButton step=new JToggleButton("Next  Step");
	JToggleButton sort = new JToggleButton("Radiax  Sort");
	
	JPanel pnl = new JPanel();
	JPanel pnl2 = new JPanel();
	JPanel pnl3 = new JPanel();
	JPanel pnl4 = new JPanel();
	
	JLabel image = new JLabel();
	
	String s,ss,pp;
	
	int radiax[]=new int[100];
	int A[]=new int[11];
	int B[]=new int[11];
	int C[]=new int[11];
	int tem[]=new int[11];
	int rong[]=new int[100];
	
	
	int n=1,count=0,jj=0,z=1,r=0,rr=0,k=30,number=1,po=0,ko=0,m=60,mm=90;
	int y=2,b=30,c=1,d=0;
	radiax(radiax_front oh)
	{
		add(lb);
		add(lb2);
		add(step);
		add(sort);
		add(pnl);
		add(pnl2);
		add(pnl3);
		add(pnl4);
		add(image);

		add(txtf);
		
		
		pnl.setBackground(Color.cyan);
		pnl.setLayout(new GridLayout(10,3));
		
		pnl2.setBackground(Color.cyan);
		pnl2.setLayout(new GridLayout(10,3));
		
		pnl3.setBackground(Color.cyan);
		pnl3.setLayout(new GridLayout(10,3));
		
		pnl4.setBackground(Color.cyan);
		pnl4.setLayout(new GridLayout(10,3));
		
		
		step.setBackground(Color.green);
		sort.setBackground(Color.green);
	
		setBackground(Color.cyan);

		Font ff = new Font("Arial", Font.BOLD,24);
		lb.setFont(new Font("Gill sans",Font.ITALIC,20));
		lb2.setFont(new Font("Gill sans",Font.ITALIC,20));
		lb2.setForeground(Color.RED);
		
		txtf.setFont(ff);
		
		
		for(int j=0;j<30;j++)
		{
			jb[j]= new JButton();
			jb[j].setFont(ff);
			jb[j].setVisible(false);
			//jb[j].setBorderPainted(false);
			jb[j].setBackground(Color.cyan);
			pnl.add(jb[j]);
		}
		for(int j=30;j<60;j++)
		{
			jb[j]= new JButton();
			jb[j].setFont(ff);	
			jb[j].setVisible(false);
			//jb[j].setBorderPainted(false);
			jb[j].setBackground(Color.cyan);
			pnl2.add(jb[j]);
		}
		for(int j=60;j<90;j++)
		{
			jb[j]= new JButton();
			jb[j].setFont(ff);	
			jb[j].setVisible(false);
			//jb[j].setBorderPainted(false);
			jb[j].setBackground(Color.cyan);
			pnl3.add(jb[j]);
		}
		
		for(int j=90;j<120;j++)
		{
			jb[j]= new JButton();
			jb[j].setFont(ff);	
			jb[j].setVisible(false);
			//jb[j].setBorderPainted(false);
			jb[j].setBackground(Color.cyan);
			pnl4.add(jb[j]);
		}
		
		step.addActionListener(this);
		sort.addActionListener(this);
		
		image.setIcon(new ImageIcon(getClass().getResource("images/radix.PNG")));
	}
	
	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		
		lb.setLocation(20,100);
		lb2.setLocation(590,95);
		
		txtf.setLocation(80, 90);
		txtf.setSize(500, 50);
		
		step.setSize(120, 30);
		step.setLocation(340, 170);
		
		image.setLocation(180,0);
		
		sort.setSize(120, 30);
		sort.setLocation(30, 170);
		
		pnl.setSize(150, 500);
		pnl.setLocation(20,240);
		
		pnl2.setSize(150, 500);
		pnl2.setLocation(250,240);
		
		pnl3.setSize(150, 500);
		pnl3.setLocation(480,240);
		
		pnl4.setSize(150, 500);
		pnl4.setLocation(710,240);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==sort)
		{
		    s = txtf.getText();//string neya
		    Scanner scn = new Scanner(s);
		    while(scn.hasNext())
		    radiax[number++] = scn.nextInt();
		    number--;
		    n=number;
		   // System.out.println(n);
		    
		    int num,key1,key2,key3,j,i;
		    for(i=1;i<=n;i++)
		    {
		        num=radiax[i];
		        C[i]=num%10;
		        num=num/10;

		        B[i]=num%10;
		        num=num/10;

		        A[i]=num%10;

		        //cout<<A[i]<<B[i]<<C[i]<<endl;;
		    }
		    
            for(int x=1;x<=n;x++)
            {
            	pp= String.valueOf(A[x]);			 
				jb[jj++].setText(pp);
				pp= String.valueOf(B[x]);			 
				jb[jj++].setText(pp);
				pp= String.valueOf(C[x]);			 
				jb[jj++].setText(pp);
            }
            jj=30;
		    
		    //cout<<"for C:\n";
            for( i=1;i<=n;i++)
                tem[i]=C[i];

		    for(j=2;j<=n;j++)
		    {
		        key1=C[j];
		        key2=B[j];
		        key3=A[j];
		        i=j-1;
		        while((i>0)&&(C[i]>key1))
		        {
		            C[i+1]=C[i];
		            B[i+1]=B[i];
		            A[i+1]=A[i];
		            i--;
		        }
		        C[i+1]=key1;
		        B[i+1]=key2;
		        A[i+1]=key3;
		    }
		    
		            for(int x=1;x<=n;x++)
		            {
		            	pp= String.valueOf(A[x]);			 
						jb[jj++].setText(pp);
						pp= String.valueOf(B[x]);			 
						jb[jj++].setText(pp);
						pp= String.valueOf(C[x]);			 
						jb[jj++].setText(pp);
		            }
		            jj=60;
		       // printf("\n%d  %d  %d \n",A[x],B[x],C[x]);
		            
		            for( i=1;i<=n;i++)
		            {
		                for(int aa=1;aa<=n;aa++)
		                {
		                    if(C[i]==tem[aa])
		                    {
		                    	rong[r++]=aa;
		                    	//System.out.println("j="+aa);		           
		                    	tem[aa]=1234;
		                        break;
		                    }
		                }

		            }

		  // cout<<"for B:\n";
		            
		     for(i=1;i<=n;i++)
		      tem[i]=B[i];       

		        for(j=2;j<=n;j++)
		    {
		        key1=C[j];
		        key2=B[j];
		        key3=A[j];
		        i=j-1;
		        while((i>0)&&(B[i]>key2))
		        {
		            C[i+1]=C[i];
		            B[i+1]=B[i];
		            A[i+1]=A[i];

		            i--;
		        }
		        C[i+1]=key1;
		        B[i+1]=key2;
		        A[i+1]=key3;
		    }
		            for(int x=1;x<=n;x++)
		            {
		            	pp= String.valueOf(A[x]);			 
						jb[jj++].setText(pp);
						pp= String.valueOf(B[x]);			 
						jb[jj++].setText(pp);
						pp= String.valueOf(C[x]);			 
						jb[jj++].setText(pp);
		            }
		            jj=90;
		       // printf("\n%d  %d  %d \n",A[x],B[x],C[x]);
		            for( i=1;i<=n;i++)
		            {
		                for(int aaa=1;aaa<=n;aaa++)
		                {
		                    if(B[i]==tem[aaa])
		                    {
		                    	rong[r++]=aaa;
		                    	//System.out.println("j="+aaa);
		                    	tem[aaa]=1234;
		                        break;
		                    }
		                }

		            }   
		            

		    //cout<<"for A:\n";
		           
		    for(i=1;i<=n;i++)
		    	tem[i]=A[i];
		    for(j=2;j<=n;j++)
		    {
		        key1=C[j];
		        key2=B[j];
		        key3=A[j];
		        i=j-1;
		        while((i>0)&&(A[i]>key3))
		        {
		            C[i+1]=C[i];
		            B[i+1]=B[i];
		            A[i+1]=A[i];

		            i--;
		        }
		        C[i+1]=key1;
		        B[i+1]=key2;
		        A[i+1]=key3;
		    }
		            for(int x=1;x<=n;x++)
		            {
		            	pp= String.valueOf(A[x]);			 
						jb[jj++].setText(pp);
						pp= String.valueOf(B[x]);			 
						jb[jj++].setText(pp);
						pp= String.valueOf(C[x]);			 
						jb[jj++].setText(pp);
		            }
		       // printf("\n%d  %d  %d \n",A[x],B[x],C[x]);
		            for( i=1;i<=n;i++)
		            {
		                for( int aaaa=1;aaaa<=n;aaaa++)
		                {
		                    if(A[i]==tem[aaaa])
		                    {
		                    	rong[r++]=aaaa;
		                    	//System.out.println("j="+aaaa);
		                    	tem[aaaa]=1234;
		                        break;		                 
		                    }
		                }
		            }
		            
		            
		            
		            for(int kk=0;kk<3*n;kk++)
		            {
		            	jb[kk].setVisible(true);
		            }

		    
		}
		if(e.getSource()==step)
		{
			if(count==((number*2)+1)||count==0||count==((number*4)+3))
			{
				for(;y<(n*3+d);)
				{
					jb[y].setBackground(Color.orange);
					y=y+3;
				}
				d=b*c;
				y=d+z;
				c++;
				z--;
				if(count==((number*2)+1))
					count++;
				if(count==((number*4)+3))
					count++;
			}
			else
			{	
			if(count%2==0)
			{
				if(ko<number)
				{
					jb[k++].setVisible(true);
					jb[k++].setVisible(true);
					jb[k++].setVisible(true);
				}
				else if(ko>=number&&ko<(number*2))
				{
					jb[m++].setVisible(true);
					jb[m++].setVisible(true);
					jb[m++].setVisible(true);
				}
				else if(ko>=(number*2)&&ko<(number*3))
				{
					jb[mm++].setVisible(true);
					jb[mm++].setVisible(true);
					jb[mm++].setVisible(true);
				}					
				ko++;
			}
			if(count%2==1)
			{			
				if(po<number)
				{
					jb[rong[rr++]*3-1].setBackground(Color.green);
				}
				if(po>=number&&po<(number*2))
				{
					jb[rong[rr++]*3+28].setBackground(Color.green);
				}
				if(po>=(number*2)&&po<(number*3))
				{
					jb[rong[rr++]*3+57].setBackground(Color.green);
				}
					
				po++;
			}
			
			}
				count++;
			}
			
		
	}
}

