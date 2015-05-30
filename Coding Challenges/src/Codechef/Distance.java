package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class Distance {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long T=Long.parseLong(br.readLine());
		while(T-->0)
		{
			long n=Long.parseLong(br.readLine());
			long steps=0;			
			steps=2*n;
			n=n-1;
			long dist=n*(n+1)/2;
			steps+=dist;			
			System.out.println(steps);
		}
	}

}
