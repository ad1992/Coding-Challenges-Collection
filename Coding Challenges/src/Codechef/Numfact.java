package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Numfact {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int prime[]=new int[1000001];		
		for (int i = 1; i <= 1000000; ++i) 
      		 prime[i] = i;
  		
		for(int i=2;i<=1000;i++)
		{
			if(prime[i]==i)
			{
				prime[i]=i;				
				for(int j=i*i;j<=1000000;j+=i)
				{
					
					prime[j]=i;
					
				}
			}
		}
		int T=Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;
		
		
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine());long ans=1;
			int count[]=new int[1000001];
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				for(int i=0;i<N;i++)
				{
					int n=Integer.parseInt(st.nextToken());
					while(n!=1)
					{
						int d=prime[n];
						n/=d;
						count[d]+=1;
					}
				}
				for(int i=2;i<count.length;i++)
				{
					if(count[i]!=0){
						ans*=(count[i]+1);
					}
				}
				System.out.println(ans);
			}
		}
	}

}
