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
public class Count {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		obr.flush();
		int T=Integer.parseInt(br.readLine());char ch1=' ';
		while(T-->0)
		{
			String s=br.readLine();
			StringBuffer s1=new StringBuffer(s);
			
			char str[]=s.toCharArray();
			Arrays.sort(str);
			int i=0;int max=Integer.MIN_VALUE;
			while(i<str.length)
			{
				char ch=str[i];
				i++;int count=0;
				while(i<str.length&&str[i]==ch)
				{
					count++;i++;
					
				}
				if(max<count){
					max=count;
					ch1=ch;
				}
			}
			s=s.replace(ch1, '?');
			obr.write(s+"\n");
			}
		obr.close();

	}

}
