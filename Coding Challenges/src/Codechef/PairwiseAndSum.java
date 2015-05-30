package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class PairwiseAndSum {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int N=Integer.parseInt(br.readLine());
		String s=br.readLine();
		StringTokenizer st=new StringTokenizer(s);
		long[] arr=new long[N];
		int i=0;
		while(i<N)
		{
			arr[i++]=Long.parseLong(st.nextToken());
			
		}
		long ans=0;
		for(int i1=0;i1<=29;i1++)
		{
			long c=0;
			for(int j=0;j<N;j++)
			{
				if((arr[j]&1<<i1)!=0)
				{
					c++;
				}
			}
			ans+=c*(c-1)/2*(long)Math.pow(2, i1);
		}
		System.out.println(ans);
	}

}
