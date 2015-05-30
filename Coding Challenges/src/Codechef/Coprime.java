package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Coprime {

	public Coprime() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int size=1000001;
		int arr[]=new int[size];
		int m[]=new int[size];
		int mob[]=new int[size];
		int max=Integer.MIN_VALUE;
		StringTokenizer st;String s;long res=0;
		if((s=br.readLine())!=null)
		{
			st=new StringTokenizer(s);
			for(int i=0;i<N;i++)
			{
				int n=Integer.parseInt(st.nextToken());
				arr[n]++;
				max=Math.max(max,n );
								
			}
			for(int i=2;i<=max;i++)
			{
				for(int j=i;j<=max;j+=i)
				{
					if(m[j]==0)
					{
						m[j]=i;
					}
				}
			}
			
			for(int i=1;i<=max;i++)
			{
				if(i==1)
					mob[1]=1;
				else{
				int a=i/m[i];
				mob[i]=(m[a]==m[i])?0:-1*mob[a];
				//System.out.println("i="+i +"mob[i]"+mob[i]);
				}
				if(mob[i]==0)
					continue;
				long  count=0;
				int j=i;
				while(j<=max)
				{
					
						count+=arr[j];
					
					j+=i;
				}
				res+=count*(count-1)*(count-2)/6*mob[i];
				//System.out.println("res="+res);
			}
			
			System.out.println(res);
		}
	}

}
