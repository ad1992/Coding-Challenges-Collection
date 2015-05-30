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
public class ChefEasySum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		String s;
		StringTokenizer st;
		int T=Integer.parseInt(br.readLine());
		
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
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine());int sum=0;			
			int count[]=new int[1000001];			
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s," ");				
				for(int i=0;i<N;i++)
				{
					int n=Integer.parseInt(st.nextToken());
					int j=2,c=0;			
					while(n!=1)
					{
						int d=prime[n];
						
							c=0;
							while(n%d==0)
							{
								c++;
								n/=d;
							}
							if(c>count[d])
							{
								sum+=c-count[d];
								count[d]=c;
							}
							
						
						
					}
					
				}
				
				obr.write(sum+"\n");	
		}
		
	}
		obr.close();
	}
}
