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
public class SmallestPair {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		obr.flush();
		String s;
		StringTokenizer st;
		int T=Integer.parseInt(br.readLine());
		
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine());
			//int arr[]=new int[N];
			if((s=br.readLine())!=null)
			{
				
				st=new StringTokenizer(s);
				int min,secmin;
				min=secmin=Integer.MAX_VALUE;
				for(int i=0;i<N;i++)
				{
					int n=Integer.parseInt(st.nextToken());
					if(n<min)
					{
						secmin=min;
						min=n;
					}
					else if(n<secmin && n!=min)
					{
						secmin=n;
					}
				}
				obr.write(min+secmin+"\n");
					}
			
				}
		obr.close();
		}
	}


