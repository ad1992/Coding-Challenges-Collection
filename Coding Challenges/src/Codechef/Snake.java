package Codechef;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author Aakansha Doshi
 *
 */
public class Snake {	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String  s;int tc[][], dx=0,dy=0,cur,steps,n,m,x,y;
		 int t= Integer.parseInt(br.readLine());
		StringTokenizer  st;
		while(t>0)
			{	t--;		
			 st = new StringTokenizer(br.readLine()," ");
			 n=Integer.parseInt(st.nextToken());
			 m=Integer.parseInt(st.nextToken());
			 x=Integer.parseInt(st.nextToken());
			 y=Integer.parseInt(st.nextToken());
			
			 s= br.readLine();
		     tc=new int[n][m];
			tc[x-1][y-1]=1;
				
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				
				if(ch=='U')
				{
					y++;
					dx=0;
					dy=1;
				}
				else if(ch=='D')
				{
					y--;
					dy=-1;
					dx=0;
				}
				else if(ch=='R')
				{
					x++;
					dx=1;
					dy=0;
					
				}
				else if(ch=='L')
				{
					x--;
					dx=-1;
					dy=0;
				}
				tc[x-1][y-1]=i+2;					
				
			}
			cur=1; steps=0;
			try{
			while(true)
			{				
				x=x+dx;
				y=y+dy;			
				steps++;			
				if(tc[x-1][y-1]>cur)
				{
					System.out.println("BODY "+(steps-1));		
					break;					
				}		
				cur++;
				}
			
			}	
			catch(Exception e)
			{
			System.out.println("WALL "+(steps-1));
			}
		}
		
	}	
}
		
		
	
		
