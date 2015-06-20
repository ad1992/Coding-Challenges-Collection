package HackerRank.others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class ACMICPC {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		String s=br.readLine();
		StringTokenizer st=new StringTokenizer(s);
		int N=Integer.parseInt(st.nextToken());
		int T=Integer.parseInt(st.nextToken());
		int topic[]=new int[N+1];
		String arr[]=new String[N];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<N;i++)
		{
			arr[i]=br.readLine();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int or=0;
				for(int k=0;k<T;k++)
				{
					int ch1=arr[i].charAt(k)-48;
					int ch2=arr[j].charAt(k)-48;
					if((ch1|ch2)==1)
					{
						or++;
					}
				}
				if(or>max)
				{
					max=or;
				}
				topic[or]++;
			}
		}
		System.out.println(max);
		System.out.println(topic[max]);
		
	}

}
