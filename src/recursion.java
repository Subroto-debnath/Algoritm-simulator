
public class recursion {
	int p,r,n;

	
	public void quicksort(int p,int r)
	{
		if(p<r)
		{
			partition ob1=new partition();
			ob1.p=0;
			ob1.r=n-1;
			ob1.n=n;
			int q=ob1.sorting(p, r);
			quicksort(p,q-1);
			quicksort(q+1,r);
		}
	}
}