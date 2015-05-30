package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Army {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;String s="";int m,n;
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			 if((s=br.readLine())!=null)
			 {
				 st=new StringTokenizer(s," ");
				 n=Integer.parseInt(st.nextToken());
				 m=Integer.parseInt(st.nextToken());
				 s=br.readLine();
				 st=new StringTokenizer(s," ");
				 int left=0;
				 int right=n-1;
				 for(int i=0;i<m;i++)
				 {
					int c=Integer.parseInt(st.nextToken());
					left=Math.max(left,c) ;
					right=Math.min(right,c);
				 }			 
				 for(int i=0;i<n;i++)
				 {
					 System.out.print(Math.max(Math.abs(left-i),Math.abs(right-i))+" ");
				 }
			 }
			
		}

	}

	

}
