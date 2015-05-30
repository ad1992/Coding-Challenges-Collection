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
public class ChefStones {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		String s;
		StringTokenizer st;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s," ");
				int N=Integer.parseInt(st.nextToken());
				int K=Integer.parseInt(st.nextToken());				
				long time[]=new long[N];
				long prof[]=new long[N];
				if((s=br.readLine())!=null)
				{
					
					st=new StringTokenizer(s," ");
					for(int i=0;i<N;i++)
					{
						
						time[i]=Long.parseLong(st.nextToken());
					}
				}
				if((s=br.readLine())!=null)
				{
					st=new StringTokenizer(s," ");
					for(int i=0;i<N;i++)
					{
						
						prof[i]=Long.parseLong(st.nextToken());
					
					}
				}
				long max=Long.MIN_VALUE;
				for(int i=0;i<N;i++)
				{
				long c=K/time[i];
				long cost=prof[i]*c;
				
					if(cost>max)
						max=cost;
				}
				try {
					obr.write(String.valueOf(max)+"\n");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
			}
		}
		obr.close();
	}

}
