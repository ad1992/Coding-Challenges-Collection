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
public class ChefField {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		obr.flush();
		String s;StringTokenizer st;
		int prime[]=new int[1000001];	
		for (int i = 2; i <=1000000; ++i) 
     		 prime[i] = i;
		prime[1]=0;
		for(int i=2;i<=1000;i++)
		{
			if(prime[i]==i)
			{
				prime[i]=1;		
				
				for(int j=i*i;j<=1000000;j+=i)
				{
					
					prime[j]=0;
					
				}
			}
		}
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			s=br.readLine();
			st=new StringTokenizer(s);
			int l=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			if(prime[l]==1)
			{
				int i=l;
				while(prime[i]!=0)
				{
					i--;
				}
				l=i;
			}
			if(prime[b]==1)
			{
				int i=b;
				while(prime[i]!=0)
				{
					i--;
				}
				b=i;
			}
			long area=l*b;
			obr.write(area+"\n");
			
		}
		obr.close();
	}

}
