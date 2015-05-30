package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class RankList {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;
		
		while(T-->0)
		{
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				long n=Long.parseLong(st.nextToken());
				long sum=Long.parseLong(st.nextToken());int ops=0;
				long inisum=(n*(n+1))/2;
				System.out.println(inisum);
				int k=1;
				while(inisum>sum)
				{
					inisum=inisum-k;
					//System.out.println(inisum);
					ops++;
					k++;
				}
				System.out.println(ops);
			}
		}
	}

}
