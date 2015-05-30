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
public class ChefAndChuru {	
		public static void main(String[] args) throws NumberFormatException, IOException {
		String s;StringTokenizer st;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		int N=Integer.parseInt(br.readLine());
		long arr[]=new long[N+1];
		int l[]=new int[N+1];	
		int r[]=new int[N+1];
		s=br.readLine();			
		st=new StringTokenizer(s," ");	
		for(int i=1;i<=N;i++)
		{
			arr[i]=Long.parseLong(st.nextToken());
		}
		for(int i=1;i<=N;i++)
		{
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s," ");
				l[i]=Integer.parseInt(st.nextToken());
				r[i]=Integer.parseInt(st.nextToken());
				
			}	
		}		
			int Q=Integer.parseInt(br.readLine());			
			while(Q-->0)
			{
				
				if((s=br.readLine())!=null)
				{
					st=new StringTokenizer(s);
					int type=Integer.parseInt(st.nextToken());
					int x=Integer.parseInt(st.nextToken());
					int y=Integer.parseInt(st.nextToken());
					switch(type)
					{
					case 1:						
						arr[x]=y;
					break;
					case 2:
						long sum=0;
						for(int i=x;i<=y;i++)
						{
							for(int j=l[i];j<=r[i];j++)
							{
								sum+=arr[j];
							}
						}
						obr.write(String.valueOf(sum));
						obr.newLine();
					}
					
				
				}
		
			}
		obr.close();
		}	
}	
 