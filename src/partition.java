
public class partition {
	int p,r,n;

	public int sorting(int p,int r)
	{
		 int x=Global.a[r];
		 int i=p-1;
		 int j;
		 for(j=p;j<=r-1;j++)
		 {
	    	 //System.out.println("i= "+i+" j= "+j+" Pivot="+Global.a[r]);
			 Global.counti[Global.co]=i;
			 Global.countj[Global.co]=j;
			 Global.pivot[Global.co]=r;
			 Global.co++;
			 
			 
		     for(int s=0;s<n;s++)
		     {
		    	 Global.quick[Global.num]=Global.a[s];
		    	//System.out.print(" "+Global.a[s]);
		    	
		    	 Global.num++;
		     }
		     //System.out.println("");

		     if(Global.a[j]<=x)
		     {
		            i++;
		            int tem=Global.a[i];
		            Global.a[i]=Global.a[j];
		            Global.a[j]=tem;
		      }
		     
		    
		    }
		 //System.out.println("i= "+i+" j= "+j+" Pivot="+Global.a[r]);
		 Global.counti[Global.co]=i;
		 Global.countj[Global.co]=j;
		 Global.pivot[Global.co]=r;
		 Global.co++;
	     for(int s=0;s<n;s++)
	     {
	    	 Global.quick[Global.num]=Global.a[s];
	    	//System.out.print(" "+Global.a[s]);
	    	 Global.num++;
	     }
		    int tem2=Global.a[i+1];
		    Global.a[i+1]=Global.a[r];
		    Global.a[r]=tem2;

		     //System.out.println(" i+1="+(i+1));

		     return i+1;
		
	}
	

}
