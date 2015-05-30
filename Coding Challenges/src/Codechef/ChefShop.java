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
public class ChefShop {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;
		 
		while(T-->0)
		{
			
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				int N=Integer.parseInt(st.nextToken());
				int K=Integer.parseInt(st.nextToken());
				int cost[]=new int[N];
				int weight[]=new int[N];int i=0;
				while(i<N)
				{
					if((s=br.readLine())!=null)
					{
						st=new StringTokenizer(s);
						cost[i]=Integer.parseInt(st.nextToken());
						weight[i]=Integer.parseInt(st.nextToken());
						i++;
						
					}
				}
				int maxweight=Integer.MIN_VALUE;
				int power=(int)Math.pow(2, N);
				for(int i1=0;i1<power;i1++)
				{
					int c=0,w=0;
					for(int j=0;j<N;j++)
					{
						if((i1 & 1<<j)>0)
						{
							if(c+cost[j]>K)
								break;
							c+=cost[j];
							w+=weight[j];
							
						}
					}
					if(w>maxweight)
						maxweight=w;
						
					
				}
				obr.write(maxweight+"\n");
				
				
			}
			
			
		}
		obr.close();
	}

}
