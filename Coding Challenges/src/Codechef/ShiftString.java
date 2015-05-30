package Codechef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class ShiftString {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter obr=new BufferedWriter(new OutputStreamWriter(System.out));
		String s;	
		obr.flush();	
		int N=Integer.parseInt(br.readLine());
		s=br.readLine();
		char s1[]=s.toCharArray();
		s=br.readLine();
		s=s+s;
		char s2[]=s.toCharArray();
		int table[]=new int[N];
		table[0]=-1;
		int j=0,count=-1;
		for(int i=1;i<N;i++)
		{
			if(s1[i]==s1[j])
			{
				count++;
				table[i]=count;
				j++;
			}
			else if(count>0)
			{
				table[i]=count+1;
				count=0;				
			}
			else
			{
				table[i]=0;
				count=-1;
				j=0;
			}
		}
		
		int starts1=0;int prefix=0,max=0,shift=0,min=0;
		int starts2=0;
		while(starts1+starts2<2*N)
		{
			//obr.write(s1[starts1]+"\n");
			if(s1[starts1]==s2[starts2+starts1])
			{
				//obr.write(s1[starts1]+"\n");
				prefix++;
				starts1++;
				
				if(starts1==N)
				{
					if(max<prefix)
					{
						max=prefix;
						min=shift;
					}
					break;
					
				}
				
			}
			else
			{
				if(starts1!=0)
				{
					starts2=starts2+starts1-table[starts1];
					starts1=table[starts1];
					
					
				}
				else
				{
					starts2++;
					starts1=0;
				}
				if(max<prefix)
				{
					max=prefix;
					min=shift;
				}
				prefix=starts1;
				shift=starts2;
				
			}
			
		}
		obr.write(min+"\n");
		obr.close();
		
	}
}
