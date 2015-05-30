package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Coins {

	public Coins() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;int N,K;
		
		int t=Integer.parseInt(br.readLine());
		while(t>0)
		{
			int arr[]=new int[1001];String line;
			if((line=br.readLine())!=null){
			st=new StringTokenizer(line," ");
			N=Integer.parseInt(st.nextToken());
			K=Integer.parseInt(st.nextToken());
			if((line=br.readLine())!=null)
			st=new StringTokenizer(line," ");
			
			int a[]=new int[N];int e=0;
			for(int i=1;i<=N;i++)
			{
				 e=Integer.parseInt(st.nextToken());
			//a[i-1]=e;
			arr[e]=1;
						
			}
			
			int count=0;int f=0;
			for(int i=e;i>=1;i--)
			{
				
				if(arr[i]==0)
				{
					count+=(f+K-1)/K;
				}
				else
					f++;
				//System.out.println(i+""+f);
				}
			System.out.println(count);
		
		}
		
		
		t--;
	}

}
}