package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class MultipleKnapsack {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;
		while(T-->0)
		{
			
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				int n=Integer.parseInt(st.nextToken());;
				int m=Integer.parseInt(st.nextToken());
				if((s=br.readLine())!=null)
				{
					st=new StringTokenizer(s);
					int  length[]=new int[n];			
					for(int i=0;i<n;i++)
					{
						length[i]=Integer.parseInt(st.nextToken());					
					}
					int[] knapsack=new int[m+1];
					for(int i=1;i<=m;i++)
					{
						knapsack[i]=1000000;
					}
					for(int i=0;i<n;i++)
					{
						if(length[i]<=m)
						{
							knapsack[length[i]]=1;
						}
					}
					for(int i=1;i<=m;i++)
					{
						for(int j=0;j<n;j++)
						{
							if(length[j]<=i&&knapsack[i]>knapsack[i-length[j]]+1)
							{
								knapsack[i]=knapsack[i-length[j]]+1;
							}
						}
					}
					for(int i=1;i<=m;i++)
					{
					System.out.println(i+" "+knapsack[i]);
					}
				}
			}
		}
	}

}
