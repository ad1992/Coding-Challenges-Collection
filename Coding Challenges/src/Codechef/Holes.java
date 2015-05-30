package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class Holes {

	public Holes() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a[]={1,2,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0};
		int T=Integer.parseInt(br.readLine());
		String s="";int c=0;
		while(T-->0)
		{
			s=br.readLine();
			c=0;
			for(int i=0;i<s.length();i++)
			{
				int index=(int)s.charAt(i)-65;
				c+=a[index];
			}
			System.out.println(c);
		}
		
		
	}

}
