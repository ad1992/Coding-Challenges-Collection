package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class MinOperations {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		String s;
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine());
			if((s=br.readLine())!=null)
			{
				int arr[]=new int[100001];int max=1;
				StringTokenizer st=new StringTokenizer(s);
				for(int i=0;i<N;i++)
				{
					int num=Integer.parseInt(st.nextToken());
					arr[num]++;
					if(max<arr[num])
						max=arr[num];
							
				}
				System.out.println(N-max);
			}
		}
	}

}
