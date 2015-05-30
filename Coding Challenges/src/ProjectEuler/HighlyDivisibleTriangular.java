package ProjectEuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class HighlyDivisibleTriangular {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		int arr[]=new int[1001];
	//	String s;
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine().trim());
			int count=0;
			int n=0,s=0;
			
			while(count<=N)
			{
				n+=s;
			
				int i=1;
				count=0;
				int sqrt=(int) Math.sqrt(n);
				while(i<=sqrt)
				{
					if(n%i==0)
					{
						count+=2;
					
					}
					i++;
				
				}
			
				if(sqrt*sqrt==n)
					count--;
				if(arr[count]==0)
					arr[count]=n;
			
				s++;
			}
			System.out.println(n);
			
		}
	}

}
