package codeforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author Aakansha Doshi
 *
 */
public class Kitayutas {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		obr.flush();
		String s=br.readLine();
		StringBuffer st=new StringBuffer(s);
		StringBuffer st1=new StringBuffer(s);
		int start=0;
		int end=s.length()-1;StringBuffer strev=new StringBuffer();
		boolean flag=false;
		//System.out.println(start+"    "+end);
		while(start<=end)
		{
			char str=s.charAt(start);
			char endr=s.charAt(end);
			//System.out.println(start+"    "+end);
			//System.out.println(str+"    "+endr);
			if(str!=endr)
			{
				st.insert(start,endr );
				strev=new StringBuffer(st);
				st.reverse();
				
				if(!strev.toString().equals(st.toString()))
				{
					st1.insert(end+1, str);
					strev=new StringBuffer(st1);
					st=new StringBuffer(st1);
				}
				
				flag=true;
				break;
				
			}
			start++;
			end--;
		}
		//strev=new StringBuffer(st);
		st.reverse();
		//System.out.println(strev);
		//System.out.println(st);
		if(!flag)
		{
			if((s.length()&1)==0)
			{
				st.insert(s.length()/2, 'a');
			}
			else
			{
				char ch=s.charAt(s.length()/2);
				st.insert(s.length()/2, ch);
						
			}
			System.out.println(st);
		}
		else{	
		if(strev.toString().equals(st.toString()))
		{
			System.out.println(st);
		}
		else{
			
		System.out.println("NA");
		}
		}
	}

}
