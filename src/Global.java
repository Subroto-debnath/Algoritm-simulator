import java.util.Vector;


public class Global {
	public static int a[] = new int[20];
	public static int quick[] = new int[2000];
	public static int counti[] = new int[200];
	public static int countj[] = new int[200];
	public static int pivot[] = new int[200];
	public static int num=0,co=0 ;
//	public static void main(String args[]){
//		
//	}
	public Global() {
        Vector v = new Vector();
        for (int i = 0; i < 100; i++) {
            v.add(new Vector());
        }
         ((Vector) v.get(50)).add("Hello, world!");

        //get it again
        String str = (String) ((Vector) v.get(50)).get(0);
	}

}

