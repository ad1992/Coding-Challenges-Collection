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
public class ChefSegment {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;		
		while(T-->0)
		{
			obr.flush();
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				int N=Integer.parseInt(st.nextToken());
				long k=Long.parseLong(st.nextToken());			
				long task=1;
				double m=N/2;				
				while((task<<1)<=k)
				{						
					task<<=1;
					m/=2;		
					
				}
				long lefttask=k-task;				
				double ans=((lefttask*2)+1)*m;				
				obr.write(String.valueOf(ans)+"\n");
			}
			
		}
		obr.close();

	}

}
