package codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class SnakePattern {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		String s=br.readLine();
		StringTokenizer st=new StringTokenizer(s);
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());int c=0;String hash="";String dothash="";
		String hashdot="";
		for(int i=0;i<m;i++)
		{
			hash+="#";
			if(i<m-1){
				dothash+=".";
				hashdot+=".";
			}
				
		}
		dothash+="#";
		hashdot="#"+hashdot;
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
					System.out.print(hash);
			}
			else if(c==0)
				{
					System.out.print(dothash);
					c=c^1;
				}
			else 
				{
				System.out.print(hashdot);
				c=c^1;
				}
			System.out.println();
			}
		}
	}


