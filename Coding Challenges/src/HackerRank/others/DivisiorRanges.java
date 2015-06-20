package HackerRank.others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class DivisiorRanges {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int N=Integer.parseInt(br.readLine().trim());
		String s;
		StringTokenizer st; 
		s=br.readLine();
		int pos[]=new int [N+1];
		st=new StringTokenizer(s);
		for(int i=0;i<N;i++)
		{
			int n=Integer.parseInt(st.nextToken());
			pos[n]=i;
		}
		long count[]=new long[N+1];
		count[1]=((N*(N+1)/2));
		for(int i=2;i<=N;i++)
		{
			long c=0,k1=1;int prevj=i;boolean flag=false;
			for(int j=2*i;j<=N;j+=i)
			{
				//System.out.println(pos[j]+"  "+pos[prevj]);
				flag=true;
				if(Math.abs(pos[j]-pos[prevj])==1)
				{
					
					k1++;
					
					
				}
				else
				{
					if(k1>1)
						c+=((k1*(k1+1)/2));
					else
						c=c+1;
					k1=1;
					//System.out.println(prevj+" " +c);
				}
				if(j+i<=N){
				int a=Math.abs(pos[j+i]-pos[prevj]);
				int b=Math.abs(pos[j+i]-pos[j]);
				if(b<a)
					prevj=j;
				
				}
				//System.out.println(prevj);
			}
			if(k1>1){
				c+=((k1*(k1+1)/2));
				//System.out.println(prevj+" " +c);
			}
			if(!flag)
				c=1;
			//System.out.println(i+" " +c);
			count[i]=c;
		}
		int Q=Integer.parseInt(br.readLine());
		while(Q-->0)
		{
			int K=Integer.parseInt(br.readLine());
			
			/*for(int i=K;i<N;i+=K)
			{
				c++;
			}*/
			
			System.out.print(count[K]+"\n");
			
		}
	}

}
