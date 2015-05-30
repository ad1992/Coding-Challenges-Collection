package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Chain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		String s;
		while(T-->0)
		{
			if((s=br.readLine())!=null)
			{
				char ch=s.charAt(0);int c;int replace1=0,replace2=0;
				c=0;		
				int c1=0;
				for(int i=0;i<s.length();i++)
				{
					 ch=s.charAt(i);
					 if(c==0&&ch=='+')
					 {
						 replace1++;
						 
					 }
					 else if(c==1&&ch=='-')
					 {
						 replace1++;
						 
					 }
					 if(c1==1&&ch=='+')
					 {
						 replace2++;
					 }
					 else if(c1==0&&ch=='-')
					 {
						 replace2++;
					 }
					 c=c^1;
					 c1=c1^1;
					
				}
				System.out.println(Math.min(replace1,replace2));
			}
		}
				
	}

}
