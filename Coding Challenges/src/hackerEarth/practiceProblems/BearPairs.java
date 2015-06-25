package hackerEarth.practiceProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class BearPairs {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 int n=Integer.parseInt(br.readLine());
		int t=BearsFertility(n);
		System.out.println(t);
	}

		
		    public static int BearsFertility (int n)
		    {
		      int newborn=1,current=1,prev=1;
		       for(int i=2;i<=n;i++)
		       {
		    	
		    	   System.out.println("month="+i);
			    	System.out.println("newborn"+newborn);
			    	System.out.println("prev"+prev);
			    	System.out.println("cur"+current);
			    	newborn=prev;
			    	prev=current;
			    	current=newborn+prev;
		    	   	    	
		    	
		       }
				return current;
			}
		    
		

}
