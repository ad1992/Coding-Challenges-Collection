package Codechef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author Aakansha Doshi
 *
 */
public class SimpleEditor {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter p=new BufferedWriter(new OutputStreamWriter(System.out));
		p.flush();		
		int T=Integer.parseInt(br.readLine());int index;String s[];
		StringBuilder st=new StringBuilder(300001);		
		while(T-->0)
		{
			 s=br.readLine().split(" ");			
			 index=Integer.parseInt(s[1]);
			 
			 if(s[0].charAt(0)=='+')
			 {
				 st.insert(index,s[2]);
			 }
			 else
			 {
				 int start=index-1;
				 int len=Integer.parseInt(s[2]);
				p.write( st.substring(start,start+len)+"\n");
			 }
			
			
			
		}
		p.close();
		
	}

}
