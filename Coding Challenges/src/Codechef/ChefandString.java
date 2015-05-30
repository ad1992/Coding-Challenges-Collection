package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class ChefandString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringTokenizer st;
    	String s;
    	long ans,third;
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s=br.readLine();
        int c,h,e,f; c=h=e=f=0;
        for(int i=0;i<s.length();i++)
        {
        	if(s.charAt(i)=='C')
        	{
        		c++;
        		System.out.println("got C");
        		
        	}
        	else if(s.charAt(i)=='H')
        	{
        		if(c>0)
        		{
        			h++;
        			c--;
        			System.out.println("got H");
        		}
        	}
        	else if(s.charAt(i)=='E')
        	{
        		if(h>0)
        		{
        			e++;
        			h--;
        			 System.out.println("got E");
        		}
        		
        	}
        	else if(s.charAt(i)=='F')
        	{
        		if(e>0)
        		{
        			e--;
        			f++;
        			 System.out.println("got F");
        		}
        	}
        }
        System.out.println(f);
        
        
	}

}
