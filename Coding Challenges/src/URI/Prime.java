package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class Prime {
	//static int prime[]=new int[100001];
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
			
		
		while(T-->0)
		{
			int num=Integer.parseInt(br.readLine());			
				if(checkprime(num))	
					System.out.println("Prime");
				else
					System.out.println("Not Prime");
		
		}
		
	}
	
	static boolean  checkprime(int num)
	{
		if(num==2)
		return true;
		if(num%2==0)
			return false;
		 if(num==Integer.MAX_VALUE)
			 return true;
		 for(int i=3;i<=(int)Math.ceil(Math.sqrt(num));i+=1)
		 {
			 if(num%i==0)
				 return false;
		 }
		 return true;
		
	}
	
	
}

	


