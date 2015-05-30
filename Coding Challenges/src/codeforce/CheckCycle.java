package codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class CheckCycle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		String s=br.readLine();
		StringTokenizer st=new StringTokenizer(s);
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());int c=0;String hash="";String dothash="";
		char arr[][]=new char[m][n];
		boolean flag=false;
		int min=Math.min(n, m);
		l1:
		{
		for(int cycle=2;cycle<=min;cycle++)
		{
			for(int i=0;i<=min-cycle;i++)
			{
				
				for(int j=0;j<=min-cycle;j++)
				{
					char start=arr[j][j];c=0;
					int r=i+cycle;
					int c1=j+cycle;
					for(int k=i;k<i+cycle;k++)
					{
						if(arr[i][k]==start)
							c++;
					}
					for(int k=i+1;k<j+cycle;k++)
					{
						if(arr[k][j+cycle-1]==start)
						c++;
					}
					for(int k=i+cycle-1;k>i;k--)
					{
						if(arr[i+cycle-1][k]==start)
							c++;
					}
					for(int k=j+cycle-1;k>j;k--)
					{
						if(arr[k][j]==start)
							c++;
					}
					if(c==4*(n-1))
					{
						flag=true;
						break l1;
					}
					}
				
						
				}
			}
		
		}
		if(flag)
			System.out.println("yes");
		else
			System.out.println("No");
	}

}
