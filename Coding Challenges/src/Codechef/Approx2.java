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
public class Approx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		StringTokenizer st;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		int T;
		try {
			obr.flush();
			T = Integer.parseInt(br.readLine());
			while(T-->0)
			{
				
				if((s=br.readLine())!=null)
				{	
					st=new StringTokenizer(s);
					int N=Integer.parseInt(st.nextToken());
					int k=Integer.parseInt(st.nextToken());
					int arr[]=new int[N];int i=0;
					if((s=br.readLine())!=null)
					{
						st=new StringTokenizer(s);
						while(i<N)
						{
							arr[i++]=Integer.parseInt(st.nextToken());
							
						}
					}
					long min=Long.MAX_VALUE;long count=0;
					for(i=0;i<N;i++)
					{
						
						for(int j=i+1;j<N;j++)
						{
							long a=Math.abs(arr[i]+arr[j]-k);							
							if(a<min)
							{
								min=a;
								count=0;
							}
							if(a==min)
							{
								count++;
							}
						}
					}
					obr.write(min+" "+count+"\n");
				}
			} 
			obr.close();
		}catch (NumberFormatException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
