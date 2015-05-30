package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class YesNo {

	public YesNo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			int ob=Integer.parseInt(br.readLine());
			String s=br.readLine();
			if(s.indexOf('I')!=-1)
			{
				System.out.println("INDIAN");
				
			}
			else if(s.indexOf('Y')!=-1)
			{
				System.out.println("NOT INDIAN");
				
			}
			else
			{
				System.out.println("NOT SURE");
			}
		}
		
	}

}
