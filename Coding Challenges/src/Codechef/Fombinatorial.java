package Codechef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Fombinatorial {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;
		obr.flush();
		int prime[]=new int[100001];	
		for (int i = 1; i <=100000; ++i) 
     		 prime[i] = i;
		for(int i=2;i<=1000;i++)
		{
			if(prime[i]==i)
			{
				prime[i]=i;		
				
				for(int j=i*i;j<=100000;j+=i)
				{
					
					prime[j]=i;
					
				}
			}
		}
		for(int i=1;i<prime.length;i++)
		{
			if(prime[i]==i)
			System.out.println(prime[i]);
			
		}
		/*while(T-->0)
		{
			
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				int N=Integer.parseInt(st.nextToken());
				long arr[]=new long[N+1];				
				Arrays.fill(arr,0);				
				long M=Long.parseLong(st.nextToken());
				int Q=Integer.parseInt(st.nextToken());
				while(Q-->0)
				{
				Arrays.fill(arr,0);	
				int r=Integer.parseInt(br.readLine());
				int l=N-r;
				int i=1;
				int max,min;
				if(l>r)
				{
					max=l;
					min=r;
				}
				else
				{
					max=r;
					min=l;
				}
				i=max+1;				
				for(int k=i,k1=2;k<=N;k++,k1++)
				{
						int num=k;
						while(num>1)
						{
							int a=prime[num];
							//System.out.println(a);
							arr[a]+=k;
							num=num/a;						
							
						}
						int num1=k1;
						if(k1<=min){
						while(num1>1)
						{
							int a=prime[num1];
							arr[a]-=k1;
							num1=num1/a;
						}
						}
					
				}
				
				
				 i=2;long cal=1;
				while(i<=N)
				{
					long num=i%M;
					long pow=arr[i];long p=1;
					if(pow==0)
					{
						i++;
						continue;
					}
					while(pow>0)
					{
						if(pow%2!=0)
						{
							p=(p*num)%M;
						}
						pow/=2;
						num=(num*num)%M;
					}
					cal=(cal*p)%M;
					i++;
					
				}
					
					obr.write(cal+"\n");	
			
				}
			}
		}*/
		obr.close();
	}

}
