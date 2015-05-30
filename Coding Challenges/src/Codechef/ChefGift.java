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
public class ChefGift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		StringTokenizer st;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			obr.flush();
			int T=Integer.parseInt(br.readLine());
			while(T-->0)
			{
				int N=Integer.parseInt(br.readLine());
				if((s=br.readLine())!=null)
				{
					st=new StringTokenizer(s);
					int n=Integer.parseInt(st.nextToken());
					long max=n;
					long min=n;
					for(int i=2;i<=N;i++)
					{
						n=Integer.parseInt(st.nextToken());
						if(n>=0)
						{
							max=Math.max(Math.max(max+n,max-n),max*n);
							min=Math.min(Math.min(min+n, min-n),min*n);
						}
						else
						{
							long m=max;
							max=Math.max(Math.max(max+n,max-n),min*n);
							min=Math.min(Math.min(min+n,min-n), m*n);
						}
						
						obr.write(max+"\n");	
						obr.write(min+"\n");
					}
					obr.write(min+"\n");
					
				}
				
				
				
			}
			obr.close();
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
