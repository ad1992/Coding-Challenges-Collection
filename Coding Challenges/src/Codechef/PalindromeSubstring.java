package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class PalindromeSubstring {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//System.out.println("Enter th string");
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			int n=Integer.parseInt(br.readLine());
			String s=br.readLine();		
			longestPal(s,n);
		
		}
	}
	private static void longestPal(String s,int n) {
		// TODO Auto-generated method stub
		int max=Integer.MIN_VALUE;int start=0;
		boolean table[][]=new boolean[n][n];
		int cuts[]=new int[n];
		cuts[0]=1;
		for(int i=0;i<n;i++)
		{
			table[i][i]=true;
			//System.out.println(s.substring(i,i+1));
			max=1;
		}
		for(int i=0;i<n-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				table[i][i+1]=true;
				//System.out.println(s.substring(i,i+2));
				start=i;
				max=2;
			}
		}
		
		for(int l=2;l<=n;l++)
		{
			for(int i=0;i<n-l+1;i++)
			{
				int j=i+l-1;
				if(table[i+1][j-1]&&(s.charAt(i)==s.charAt(j)))  
				{
					table[i][j]=true;
					if(l>max)
					{
						max=l;
						start=i;							
						//System.out.println(s.substring(start,start+max));
						
					}
				}
				
			
			}
			int j=l-1;
			cuts[j]=Integer.MAX_VALUE;
			if(table[0][j])
				cuts[j]=1;
			else
			{
				for(int j1=j;j1>0;j1--)
				{
					if(table[j1][j])
					cuts[j]=Math.min(cuts[j], cuts[j1-1]+1);
					
				}
			}
		}
		
		System.out.println(cuts[n-1]);
		
}
}