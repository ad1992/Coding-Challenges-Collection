package Codechef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class OnlineShopping {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter ob=new BufferedWriter(new OutputStreamWriter(System.out));
		ob.flush();
		int T=Integer.parseInt(br.readLine());
		StringTokenizer st;
		String s;
		while(T-->0)
		{
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				int N=Integer.parseInt(st.nextToken());
				int M=Integer.parseInt(st.nextToken());
				long cost[][]=new long[N][M];
				long dis[][]=new long[N][M];
				for(int i=0;i<N;i++)
				{
					
					if((s=br.readLine())!=null)
					{
						String a[]=s.split(" ");
						for(int j=0;j<M;j++)
						{
							cost[i][j]=Long.parseLong(a[j]);
						}
					}
				}
				for(int i=0;i<N;i++)
				{
					
					if((s=br.readLine())!=null)
					{
						String a[]=s.split(" ");
						for(int j=0;j<M;j++)
						{
							dis[i][j]=Long.parseLong(a[j]);
						}
					}
				}
				long min=getMin(cost,dis,N,M);
				ob.write(min+"\n");
			}
			
		}
		ob.close();
	}



	private static long getMin(long[][] cost, long[][] dis, int n, int m) {
		// TODO Auto-generated method stub
		long val[][]=new long[n][m];
		long mini=Long.MAX_VALUE,newmini=Long.MAX_VALUE;	
		for(int i=0;i<m;i++)
		{
			val[0][i]=cost[0][i];
			mini=Math.min(mini,val[0][i]);
		}
			
		for(int i=1;i<n;i++)
		{
			newmini=Long.MAX_VALUE;		
			for(int j=0;j<m;j++)
			{
				val[i][j]=Math.min(mini+cost[i][j],val[i-1][j]+cost[i][j]-dis[i-1][j]);
				newmini=Math.min(newmini, val[i][j]);
			}
			mini=newmini;
		}
		return mini;
		
			
	
	}
}