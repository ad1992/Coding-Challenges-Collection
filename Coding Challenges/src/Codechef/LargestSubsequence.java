package Codechef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * @author Aakansha Doshi
 *
 */
public class LargestSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		String s;
		
		try {
			obr.flush();
			int T=Integer.parseInt(br.readLine());
			
			while(T-->0)
			{
				s=br.readLine();				
				long c=checkUnique(s);						
				obr.write(c+"\n");
				
			}
			obr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private static long checkUnique(String s1) {
		// TODO Auto-generated method stub
		boolean check[]=new boolean[26];long count=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(!check[ch-97])
			{
				count++;
			}
			
				check[ch-97]=true;
				
		}
		return count;
	}

}
